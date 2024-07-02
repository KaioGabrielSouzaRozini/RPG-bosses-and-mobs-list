package RPG_bosses_and_mobs.service;

import RPG_bosses_and_mobs.model.Boss;
import RPG_bosses_and_mobs.repo.BossRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class BossService {
    private final BossRepo bossRepo;

    @Autowired
    public BossService(BossRepo bossRepo){
        this.bossRepo = bossRepo;
    }

    public List<Boss> findAllBoss(){
        return bossRepo.findAll();
    }

    public Boss addBoss(Boss boss){
        boss.setBossCode(UUID.randomUUID().toString());
        return bossRepo.save(boss);
    }

    public Boss updateBoss(Boss boss){
        return bossRepo.save(boss);
    }

    public void deleteBoss(Long id){
        bossRepo.deleteById(id);
    }
}
