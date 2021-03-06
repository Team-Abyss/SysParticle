package jp.abyss.sysparticle.api.particle.model;

import jp.abyss.sysparticle.api.particle.IntervalHolder;

public interface CircleParticle extends IntervalHolder, PointParticleModel {

    double getRadius();

    CircleParticle setRadius(double radius);

}
