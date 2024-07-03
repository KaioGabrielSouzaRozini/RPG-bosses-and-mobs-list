package RPG_bosses_and_mobs.service;

import RPG_bosses_and_mobs.model.Mob;
import RPG_bosses_and_mobs.repo.MobRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class MobService {
    private final MobRepo mobRepo;

    @Autowired
    public MobService(MobRepo mobRepo) {
        this.mobRepo = mobRepo;
    }

    public List<Mob> findAllMobs(){
        return mobRepo.findAll();
    }

    public Mob addMob(Mob mob){
        mob.setMobCode(UUID.randomUUID().toString());
        return mobRepo.save(mob);
    }

    public Mob updateMob(Mob mob){
        return mobRepo.save(mob);
    }

    public void deleteMob(Long id){
        mobRepo.deleteById(id);
    }
}
