package jp.abyss.sysparticle.particle.model;

import jp.abyss.sysparticle.api.RelativeLocation;
import jp.abyss.sysparticle.api.SysParticleAPI;
import jp.abyss.sysparticle.api.particle.PointParticle;
import org.bukkit.util.Vector;

import static java.lang.Math.PI;

public class CircleParticleImpl extends PointParticleModelImpl implements jp.abyss.sysparticle.api.particle.model.CircleParticle {

    private double interval = PI / 6;
    private double radius = 1;

    @Override
    public double getInterval() {
        return this.interval;
    }

    @Override
    public void setInterval(double interval) {
        this.interval = interval;
    }

    @Override
    public double getRadius() {
        return this.radius;
    }

    @Override
    public jp.abyss.sysparticle.api.particle.model.CircleParticle setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    @Override
    public void expectPointParticle() {
        super.pointParticleList.clear();

        for (int count = 0; count < 2 * PI / interval; count++) {
            RelativeLocation point = new RelativeLocation();
            double theta = count * interval;

            Vector vector = new Vector(radius, 0, 0);
            vector.rotateAroundZ(theta);
            vector.rotateAroundX(roll).rotateAroundY(pitch).rotateAroundZ(yaw);

            point.addVector(vector);

            PointParticle pointParticle = SysParticleAPI.createPointParticle(this.particle, point);

            pointParticleList.add(pointParticle);
        }
    }

    @Override
    public CircleParticleImpl clone() {
        CircleParticleImpl clone = (CircleParticleImpl) super.clone();
        clone.setRadius(this.radius).setInterval(this.interval);
        return clone;
    }
}
