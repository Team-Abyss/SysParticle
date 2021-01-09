package jp.abyss.sysparticle.api.particle.model;

import jp.abyss.sysparticle.api.particle.IntervalHolder;

public interface CircleParticle extends IntervalHolder, PointParticleModel {

    double getRadius();

    void setRadius(double radius);

}
