package RPG_bosses_and_mobs.controller;

import RPG_bosses_and_mobs.model.Boss;
import RPG_bosses_and_mobs.service.BossService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boss")
public class BossController {
    private final BossService bossService;

    public BossController(BossService bossService) {
        this.bossService = bossService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Boss>> getAllBoss(){
        List<Boss> bossList = bossService.findAllBoss();
        return new ResponseEntity<>(bossList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Boss> addBoss(@RequestBody Boss boss){
        Boss newBoss = bossService.addBoss(boss);
        return new ResponseEntity<>(newBoss, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Boss> updateBoss(@RequestBody Boss boss){
        Boss updateBoss = bossService.updateBoss(boss);
        return new ResponseEntity<>(updateBoss, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBoss(@PathVariable Long id){
        bossService.deleteBoss(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
