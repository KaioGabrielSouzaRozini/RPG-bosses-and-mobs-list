package RPG_bosses_and_mobs.repo;

import RPG_bosses_and_mobs.model.Mob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobRepo extends JpaRepository<Mob, Long> {
}
