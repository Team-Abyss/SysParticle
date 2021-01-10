package jp.abyss.sysparticle.particle.model;

import jp.abyss.sysparticle.api.RelativeLocation;
import jp.abyss.sysparticle.api.SysParticleAPI;
import jp.abyss.sysparticle.api.particle.PointParticle;
import org.bukkit.util.Vector;

public class LineParticleImpl extends PointParticleModelImpl implements jp.abyss.sysparticle.api.particle.model.LineParticle {

    private double interval;
    private RelativeLocation from;
    private RelativeLocation to;

    @Override
    public double getInterval() {
        return this.interval;
    }

    @Override
    public void setInterval(double interval) {
        this.interval = interval;
    }

    @Override
    public RelativeLocation getFrom() {
        return this.from;
    }

    @Override
    public jp.abyss.sysparticle.api.particle.model.LineParticle setFrom(RelativeLocation location) {
        this.from = location;
        return this;
    }

    @Override
    public RelativeLocation getTo() {
        return this.to;
    }

    @Override
    public jp.abyss.sysparticle.api.particle.model.LineParticle setTo(RelativeLocation location) {
        this.to = location;
        return this;
    }

    @Override
    public void expectPointParticle() {
        pointParticleList.clear();
        Vector goal = new Vector(to.getX() - from.getX(), to.getY() - from.getY(), to.getZ() - from.getZ());

        for (int count = 0; count <= goal.length() / interval; count++) {
            Vector normalize = goal.clone().normalize();
            normalize.multiply(count * interval);
            RelativeLocation relativeLocation = new RelativeLocation();
            normalize.rotateAroundX(roll).rotateAroundY(pitch).rotateAroundZ(yaw);
            relativeLocation.addVector(normalize);
            PointParticle pointParticle = SysParticleAPI.createPointParticle(this.particle, relativeLocation);

            pointParticleList.add(pointParticle);
        }
    }

    @Override
    public LineParticleImpl clone() {
        LineParticleImpl clone = (LineParticleImpl) super.clone();
        clone.setFrom(this.from.clone()).setTo(this.to.clone());
        clone.setInterval(this.interval);
        return clone;
    }
}
