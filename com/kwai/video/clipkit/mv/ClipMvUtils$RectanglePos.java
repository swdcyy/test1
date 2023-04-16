package com.kwai.video.clipkit.mv.ClipMvUtils$RectanglePos;
import java.lang.Object;

public final class ClipMvUtils$RectanglePos	// class@001aa7
{
    public double positionX;
    public double positionY;
    public double relativeH;
    public double relativeW;

    public void ClipMvUtils$RectanglePos(){
       super();
    }
    public double getBottomPos(){
       return (this.positionY + (this.relativeH / 2.00f));
    }
    public double getLeftPos(){
       return (this.positionX - (this.relativeW / 2.00f));
    }
    public double getPositionX(){
       return this.positionX;
    }
    public double getPositionY(){
       return this.positionY;
    }
    public double getRelativeH(){
       return this.relativeH;
    }
    public double getRelativeW(){
       return this.relativeW;
    }
    public double getRightPos(){
       return (this.positionX + (this.relativeW / 2.00f));
    }
    public double getTopPos(){
       return (this.positionY - (this.relativeH / 2.00f));
    }
}
