package jp.abyss.sysparticle.particle;

import jp.abyss.sysparticle.api.particle.ParticleManager;
import jp.abyss.sysparticle.api.particle.PointParticle;
import jp.abyss.sysparticle.api.particle.model.ParticleModel;
import jp.abyss.sysparticle.api.particle.model.PointParticleModel;
import org.bukkit.Location;
import org.bukkit.Particle;

public class SimpleParticleManager implements ParticleManager {

    @Override
    public PointParticleModel createParticleModel(ParticleModel particleModel, Particle particle) {

        return null;
    }

    @Override
    public void spawnParticleModel(PointParticleModel pointParticleModel, Location location) {

    }

    @Override
    public PointParticle createPointParticle(Particle particle) {
        return null;
    }

    @Override
    public void spawnPointParticle(PointParticle pointParticle, Location location) {

    }
}
