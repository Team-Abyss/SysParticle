package jp.abyss.sysparticle.api.particle.model;

import java.util.List;

public interface HierarchicalModel extends PointParticleModel {

    List<PointParticleModel> getChildren();

}
