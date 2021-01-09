package jp.abyss.sysparticle.api.particle;

import jp.abyss.sysparticle.api.RelativeLocation;
import jp.abyss.sysparticle.api.particle.model.ParticleModel;
import jp.abyss.sysparticle.api.particle.model.PointParticleModel;
import org.bukkit.Location;
import org.bukkit.Particle;

public interface ParticleManager {

    PointParticleModel createParticleModel(ParticleModel particleModel,Particle particle);

    void spawnParticleModel(PointParticleModel pointParticleModel, Location location);

    PointParticle createPointParticle(Particle particle, RelativeLocation relativeLocation);

    void spawnPointParticle(PointParticle pointParticle,Location location);
}
