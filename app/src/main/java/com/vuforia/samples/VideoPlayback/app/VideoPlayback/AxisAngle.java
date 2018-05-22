package com.vuforia.samples.VideoPlayback.app.VideoPlayback;

public class AxisAngle {
    double angle;
    double x;
    double y;
    double z;

    public AxisAngle(double angle,double x,double y,double z){
        this.angle=angle;
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
}
