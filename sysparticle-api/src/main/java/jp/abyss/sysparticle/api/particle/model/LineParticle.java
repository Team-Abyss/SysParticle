package jp.abyss.sysparticle.api.particle.model;

import jp.abyss.sysparticle.api.particle.IntervalHolder;
import jp.abyss.sysparticle.api.RelativeLocation;

public interface LineParticle extends IntervalHolder, PointParticleModel {

    RelativeLocation getFrom();

    void setFrom(RelativeLocation location);

    RelativeLocation getTo();

    void setTo(RelativeLocation location);

}
