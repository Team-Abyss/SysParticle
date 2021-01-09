package jp.abyss.sysparticle.particle.model;

import jp.abyss.sysparticle.api.particle.PointParticle;
import jp.abyss.sysparticle.api.particle.model.PointParticleModel;
import org.bukkit.Particle;

import java.util.ArrayList;
import java.util.List;


public abstract class SimplePointParticleModel implements PointParticleModel {
    protected List<PointParticle> pointParticleList = new ArrayList<>();
    protected Particle particle;
    protected double roll = 0;
    protected double pitch = 0;
    protected double yaw = 0;

    @Override
    public List<PointParticle> getPointParticles() {
        return new ArrayList<>(pointParticleList);
    }

    @Override
    public double getRoll() {
        return this.roll;
    }

    @Override
    public void setRoll(double roll) {
        this.roll = roll;
    }

    @Override
    public double getPitch() {
        return this.pitch;
    }

    @Override
    public void setPitch(double pitch) {
        this.pitch = pitch;
    }

    @Override
    public double getYaw() {
        return this.yaw;
    }

    @Override
    public void setYaw(double yaw) {
        this.yaw = yaw;
    }

    public abstract void expectPointParticle();
}
