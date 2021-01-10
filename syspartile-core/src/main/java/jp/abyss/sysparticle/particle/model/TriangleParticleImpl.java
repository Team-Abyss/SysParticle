package jp.abyss.sysparticle.particle.model;

import jp.abyss.sysparticle.api.RelativeLocation;
import jp.abyss.sysparticle.api.SysParticleAPI;
import jp.abyss.sysparticle.api.particle.model.LineParticle;
import jp.abyss.sysparticle.api.particle.model.ParticleModel;
import org.bukkit.util.Vector;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class TriangleParticleImpl extends HierarchicalModelImpl implements jp.abyss.sysparticle.api.particle.model.TriangleParticle {

    private double radius = 1;
    private double interval = sqrt(3);

    @Override
    public void expectPointParticle() {
        pointParticleList.clear();
        double theta = 2 * PI / 3;
        for (int count = 0; count < 3; count++) {
            LineParticle lineParticle = (LineParticle) SysParticleAPI.createParticleModel(ParticleModel.Line, this.particle);

            lineParticle.setInterval(this.interval);
            lineParticle.setRelativeCenterLocation(this.relativeCenterLocation);
            lineParticle.setRoll(this.roll).setPitch(this.pitch).setYaw(this.yaw);

            Vector fromVector = new Vector(this.radius, 0, 0).rotateAroundZ(theta * count);
            Vector toVector = fromVector.clone().rotateAroundZ(theta);

            lineParticle.setFrom(new RelativeLocation().addVector(fromVector));
            lineParticle.setTo(new RelativeLocation().addVector(toVector));

            addChildren(lineParticle);
        }
    }


    @Override
    public double getRadius() {
        return this.radius;
    }

    @Override
    public TriangleParticleImpl setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    @Override
    public double getInterval() {
        return this.interval;
    }

    @Override
    public void setInterval(double interval) {
        this.interval = interval;
    }

    @Override
    public TriangleParticleImpl clone() {
        TriangleParticleImpl clone = (TriangleParticleImpl) super.clone();
        clone.setRadius(this.radius).setInterval(this.interval);
        return clone;
    }
}
