package RPG_bosses_and_mobs.controller;

import RPG_bosses_and_mobs.model.Boss;
import RPG_bosses_and_mobs.model.Mob;
import RPG_bosses_and_mobs.service.BossService;
import RPG_bosses_and_mobs.service.MobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mob")
public class MobController {
    private final MobService mobService;

    @Autowired
    public MobController(MobService mobService) {
        this.mobService = mobService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Mob>> getAllMobs(){
        List<Mob> mobList = mobService.findAllMobs();
        return new ResponseEntity<>(mobList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Mob> addMob(@RequestBody Mob mob){
        Mob newMob = mobService.addMob(mob);
        return new ResponseEntity<>(newMob, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Mob> updateMob(@RequestBody Mob mob){
        Mob updateMob = mobService.updateMob(mob);
        return new ResponseEntity<>(updateMob, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMob(@PathVariable Long id){
        mobService.deleteMob(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
