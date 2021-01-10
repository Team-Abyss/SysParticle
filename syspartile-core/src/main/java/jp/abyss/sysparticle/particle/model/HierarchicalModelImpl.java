package jp.abyss.sysparticle.particle.model;

import jp.abyss.sysparticle.api.particle.model.PointParticleModel;

import java.util.ArrayList;
import java.util.List;

public abstract class HierarchicalModelImpl extends PointParticleModelImpl implements jp.abyss.sysparticle.api.particle.model.HierarchicalModel {

    protected final List<PointParticleModel> children = new ArrayList<>();

    @Override
    public List<PointParticleModel> getChildren() {
        List<PointParticleModel> copy = new ArrayList<>();
        children.forEach(pointParticleModel -> copy.add(((PointParticleModelImpl) pointParticleModel).clone()));
        return copy;
    }

    public void addChildren(PointParticleModel children) {
        this.children.add(children);
    }

    public void removeChildren(PointParticleModel children) {
        this.children.remove(children);
    }

    public abstract void expectPointParticle();

    public HierarchicalModelImpl clone() {
        HierarchicalModelImpl clone = (HierarchicalModelImpl) super.clone();
        this.children.forEach(pointParticleModel -> {
            clone.addChildren(((PointParticleModelImpl) pointParticleModel).clone());
        });
        return clone;
    }

}
