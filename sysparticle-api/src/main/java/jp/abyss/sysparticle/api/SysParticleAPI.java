package jp.abyss.sysparticle.api;

import jp.abyss.sysparticle.api.particle.ParticleManager;
import jp.abyss.sysparticle.api.particle.PointParticle;
import jp.abyss.sysparticle.api.particle.model.ParticleModel;
import jp.abyss.sysparticle.api.particle.model.PointParticleModel;
import org.bukkit.Location;
import org.bukkit.Particle;

public class SysParticleAPI {

    private static ParticleManager particleManager;

    private SysParticleAPI() {
    }

    public static void setParticleManager(ParticleManager particleManager) {
        if (hasParticleManager()) {
            throw new UnsupportedOperationException("Cannot redefine singleton Manager");
        }
        SysParticleAPI.particleManager = particleManager;

    }

    public static boolean hasParticleManager() {
        return SysParticleAPI.particleManager != null;
    }

    public static PointParticleModel createParticleModel(ParticleModel particleModel, Particle particle) {
        return particleManager.createParticleModel(particleModel, particle);
    }

    public static void spawnParticleModel(PointParticleModel pointParticleModel, Location location) {
        particleManager.spawnParticleModel(pointParticleModel, location);
    }

    public static PointParticle createPointParticle(Particle particle, RelativeLocation relativeLocation) {
        return particleManager.createPointParticle(particle, relativeLocation);
    }

    public static void spawnPointParticle(PointParticle pointParticle, Location location) {
        particleManager.spawnPointParticle(pointParticle, location);
    }
}
