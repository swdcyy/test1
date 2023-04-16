package com.kwai.video.waynelive.mediaplayer.LiveExtSurfaceCropParams;
import java.lang.Object;
import com.kwai.video.player.IKwaiMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveExtSurfaceCropParams	// class@000e05
{
    public float mBottom;
    public int mHeight;
    public boolean mIsPercent;
    public float mLeft;
    public float mRight;
    public float mTop;
    public int mWidth;
    public int mX;
    public int mY;

    public void LiveExtSurfaceCropParams(){
       super();
    }
    public void applyTo(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveExtSurfaceCropParams.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (this.isPercent()) {
          p0.setExtSurfaceCrop(this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
       }else {
          p0.setExtSurfaceCrop(this.getX(), this.getY(), this.getWidth(), this.getHeight());
       }
       return;
    }
    public float getBottom(){
       return this.mBottom;
    }
    public int getHeight(){
       return this.mHeight;
    }
    public float getLeft(){
       return this.mLeft;
    }
    public float getRight(){
       return this.mRight;
    }
    public float getTop(){
       return this.mTop;
    }
    public int getWidth(){
       return this.mWidth;
    }
    public int getX(){
       return this.mX;
    }
    public int getY(){
       return this.mY;
    }
    public final boolean isPercent(){
       return this.mIsPercent;
    }
    public void setBottom(float p0){
       this.mBottom = p0;
    }
    public void setHeight(int p0){
       this.mHeight = p0;
    }
    public void setIsPercent(boolean p0){
       this.mIsPercent = p0;
    }
    public void setLeft(float p0){
       this.mLeft = p0;
    }
    public void setRight(float p0){
       this.mRight = p0;
    }
    public void setTop(float p0){
       this.mTop = p0;
    }
    public void setWidth(int p0){
       this.mWidth = p0;
    }
    public void setX(int p0){
       this.mX = p0;
    }
    public void setY(int p0){
       this.mY = p0;
    }
}
