package jp.abyss.sysparticle.particle;

import jp.abyss.sysparticle.api.RelativeLocation;
import jp.abyss.sysparticle.api.particle.ParticleManager;
import jp.abyss.sysparticle.api.particle.PointParticle;
import jp.abyss.sysparticle.api.particle.model.HierarchicalModel;
import jp.abyss.sysparticle.api.particle.model.ParticleModel;
import jp.abyss.sysparticle.api.particle.model.PointParticleModel;
import org.bukkit.Location;
import org.bukkit.Particle;

public class SimpleParticleManager implements ParticleManager {

    @Override
    public PointParticleModel createParticleModel(ParticleModel particleModel, Particle particle) {
        //TODO model
        return null;
    }

    @Override
    public void spawnParticleModel(PointParticleModel pointParticleModel, Location origin) {
        if (pointParticleModel instanceof HierarchicalModel) {
            HierarchicalModel hierarchicalModel = (HierarchicalModel) pointParticleModel;
            hierarchicalModel.getChildren().forEach(model -> spawnParticleModel(model, origin));
        }
        pointParticleModel.getPointParticles().forEach(pointParticle -> {
            Location absoluteCenterLocation = pointParticleModel.getRelativeCenterLocation().getAbsoluteLocation(origin);
            spawnPointParticle(pointParticle, absoluteCenterLocation);
        });
    }

    @Override
    public PointParticle createPointParticle(Particle particle, RelativeLocation relativeLocation) {
        return new PointParticleImpl(particle, relativeLocation);
    }

    @Override
    public void spawnPointParticle(PointParticle pointParticle, Location origin) {
        Particle particle = pointParticle.getParticle();
        Location spawnLocation = pointParticle.getRelativeLocation().getAbsoluteLocation(origin);
        origin.getWorld().spawnParticle(particle, spawnLocation, 0, 0, 0, 0);
    }
}
