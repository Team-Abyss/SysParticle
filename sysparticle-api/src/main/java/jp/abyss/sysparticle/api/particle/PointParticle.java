package jp.abyss.sysparticle.api.particle;

import jp.abyss.sysparticle.api.RelativeLocation;
import org.bukkit.Particle;

public interface PointParticle {

    RelativeLocation getRelativeLocation();

    Particle getParticle();

    void setParticle(Particle particle);

}
