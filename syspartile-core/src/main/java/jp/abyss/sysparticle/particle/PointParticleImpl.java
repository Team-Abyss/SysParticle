package jp.abyss.sysparticle.particle;

import jp.abyss.sysparticle.api.RelativeLocation;
import jp.abyss.sysparticle.api.particle.PointParticle;
import org.bukkit.Particle;

public class PointParticleImpl implements PointParticle {
    private final RelativeLocation relativeLocation;
    private Particle particle;

    public PointParticleImpl(Particle particle, RelativeLocation relativeLocation) {
        this.particle = particle;
        this.relativeLocation = relativeLocation;
    }

    @Override
    public RelativeLocation getRelativeLocation() {
        return relativeLocation.clone();
    }

    @Override
    public Particle getParticle() {
        return this.particle;
    }

    @Override
    public void setParticle(Particle particle) {
        this.particle = particle;
    }
}
