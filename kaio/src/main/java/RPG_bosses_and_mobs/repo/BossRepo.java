package RPG_bosses_and_mobs.repo;

import RPG_bosses_and_mobs.model.Boss;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BossRepo extends JpaRepository<Boss, Long> {
}
