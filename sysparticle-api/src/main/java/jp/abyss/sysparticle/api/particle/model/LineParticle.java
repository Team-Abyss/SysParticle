package jp.abyss.sysparticle.api.particle.model;

import jp.abyss.sysparticle.api.RelativeLocation;
import jp.abyss.sysparticle.api.particle.IntervalHolder;

public interface LineParticle extends IntervalHolder, PointParticleModel {

    RelativeLocation getFrom();

    LineParticle setFrom(RelativeLocation location);

    RelativeLocation getTo();

    LineParticle setTo(RelativeLocation location);


}
