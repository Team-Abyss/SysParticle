package jp.abyss.sysparticle.api.particle.model;

import jp.abyss.sysparticle.api.particle.PointParticle;
import jp.abyss.sysparticle.api.particle.RelativeCenterLocationHolder;

import java.util.List;

public interface PointParticleModel extends RelativeCenterLocationHolder, Cloneable {

    List<PointParticle> getPointParticles();

    double getRoll();

    PointParticleModel setRoll(double roll);

    double getPitch();

    PointParticleModel setPitch(double pitch);

    double getYaw();

    PointParticleModel setYaw(double yaw);

}
