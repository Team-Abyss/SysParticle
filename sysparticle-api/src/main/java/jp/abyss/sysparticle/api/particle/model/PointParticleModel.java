package jp.abyss.sysparticle.api.particle.model;

import jp.abyss.sysparticle.api.particle.PointParticle;

import java.util.List;

public interface PointParticleModel {

    List<PointParticle> getPointParticles();

    double getRoll();

    void setRoll(double roll);

    double getPitch();

    void setPitch(double pitch);

    double getYaw();

    void setYaw(double yaw);



}
