package jp.abyss.sysparticle.particle.model;

import jp.abyss.sysparticle.api.SysParticleAPI;
import jp.abyss.sysparticle.api.particle.PointParticle;
import jp.abyss.sysparticle.api.particle.model.CircleParticle;

import static java.lang.Math.PI;

public class SimpleCircleParticle extends SimplePointParticleModel implements CircleParticle {

    private double interval = PI/6;
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
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void expectPointParticle() {
        super.pointParticleList.clear();
        //0 -> 11の時 2π / π/6 = 12
        for(int count = 0;count < 2*PI/interval;count++) {
            PointParticle pointParticle = SysParticleAPI.createPointParticle(this.particle);


        }
    }
}
