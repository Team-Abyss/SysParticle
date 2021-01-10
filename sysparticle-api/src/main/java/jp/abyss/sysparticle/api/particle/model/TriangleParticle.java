package jp.abyss.sysparticle.api.particle.model;

import jp.abyss.sysparticle.api.particle.IntervalHolder;

public interface TriangleParticle extends HierarchicalModel, IntervalHolder {

    double getRadius();

    TriangleParticle setRadius(double radius);

}
