package jp.abyss.sysparticle.api;

import org.bukkit.Location;
import org.bukkit.util.Vector;

import java.util.Objects;

public class RelativeLocation implements Cloneable {

    private double x;
    private double y;
    private double z;

    public RelativeLocation() {
        x = y = z = 0;
    }

    public RelativeLocation(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public RelativeLocation setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public RelativeLocation setY(double y) {
        this.y = y;
        return this;
    }

    public double getZ() {
        return z;
    }

    public RelativeLocation setZ(double z) {
        this.z = z;
        return this;
    }

    public Location getAbsoluteLocation(Location origin) {
        return origin.add(x, y, z);
    }

    public RelativeLocation addVector(Vector vector) {
        setX(x + vector.getX());
        setY(y + vector.getY());
        setZ(z + vector.getZ());
        return this;
    }

    public RelativeLocation addRelativeLocation(RelativeLocation relativeLocation) {
        setX(x + relativeLocation.getX());
        setX(y + relativeLocation.getY());
        setZ(z + relativeLocation.getZ());
        return this;
    }

    public RelativeLocation clone() {
        try {
            return ((RelativeLocation) super.clone()).setX(this.x).setY(this.y).setZ(this.z);
        } catch (CloneNotSupportedException e) {
            throw new Error(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelativeLocation that = (RelativeLocation) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0 && Double.compare(that.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
