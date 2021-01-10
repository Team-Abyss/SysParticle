package jp.abyss.sysparticle.particle.model;

import jp.abyss.sysparticle.api.RelativeLocation;
import jp.abyss.sysparticle.api.particle.PointParticle;
import jp.abyss.sysparticle.api.particle.model.PointParticleModel;
import org.bukkit.Particle;

import java.util.ArrayList;
import java.util.List;

public abstract class PointParticleModelImpl implements PointParticleModel {
    protected List<PointParticle> pointParticleList = new ArrayList<>();
    protected Particle particle;
    protected RelativeLocation relativeCenterLocation;
    protected double roll = Math.PI / 2;
    protected double pitch = 0;
    protected double yaw = 0;

    @Override
    public List<PointParticle> getPointParticles() {
        expectPointParticle();
        return new ArrayList<>(pointParticleList);
    }

    @Override
    public double getRoll() {
        return this.roll;
    }

    @Override
    public jp.abyss.sysparticle.api.particle.model.PointParticleModel setRoll(double roll) {
        this.roll = roll;
        return this;
    }

    @Override
    public double getPitch() {
        return this.pitch;
    }

    @Override
    public jp.abyss.sysparticle.api.particle.model.PointParticleModel setPitch(double pitch) {
        this.pitch = pitch;
        return this;
    }

    @Override
    public double getYaw() {
        return this.yaw;
    }

    @Override
    public jp.abyss.sysparticle.api.particle.model.PointParticleModel setYaw(double yaw) {
        this.yaw = yaw;
        return this;
    }

    @Override
    public RelativeLocation getRelativeCenterLocation() {
        return this.relativeCenterLocation;
    }

    @Override
    public void setRelativeCenterLocation(RelativeLocation relativeLocation) {
        this.relativeCenterLocation = relativeLocation;
    }

    public abstract void expectPointParticle();

    @Override
    public PointParticleModelImpl clone() {
        try {
            PointParticleModelImpl clone = ((PointParticleModelImpl) super.clone());
            clone.setRoll(this.roll).setPitch(this.pitch).setYaw(this.yaw);
            clone.setRelativeCenterLocation(this.relativeCenterLocation);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new Error(e);
        }
    }


}
