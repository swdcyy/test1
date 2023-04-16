package com.davemorrissey.labs.subscaleview.ImageViewState;
import java.io.Serializable;
import android.graphics.PointF;
import java.lang.Object;

public class ImageViewState implements Serializable	// class@000fa9
{
    public float centerX;
    public float centerY;
    public int orientation;
    public float scale;

    public void ImageViewState(float p0,PointF p1,int p2){
       super();
       this.scale = p0;
       this.centerX = p1.x;
       this.centerY = p1.y;
       this.orientation = p2;
    }
    public PointF getCenter(){
       return new PointF(this.centerX, this.centerY);
    }
    public int getOrientation(){
       return this.orientation;
    }
    public float getScale(){
       return this.scale;
    }
}
