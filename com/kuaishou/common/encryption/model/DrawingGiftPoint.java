package com.kuaishou.common.encryption.model.DrawingGiftPoint;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Boolean;

public class DrawingGiftPoint implements Serializable	// class@0016bc
{
    public int bottom;
    public int giftId;
    public Boolean handUp;
    public int left;
    public int right;
    public int top;

    public void DrawingGiftPoint(){
       super();
    }
    public void DrawingGiftPoint(int p0,int p1,int p2,int p3,int p4,Boolean p5){
       super();
       this.giftId = p0;
       this.left = p1;
       this.top = p2;
       this.right = p3;
       this.bottom = p4;
       this.handUp = p5;
    }
    public int getBottom(){
       return this.bottom;
    }
    public int getGiftId(){
       return this.giftId;
    }
    public Boolean getHandUp(){
       return this.handUp;
    }
    public int getLeft(){
       return this.left;
    }
    public int getRight(){
       return this.right;
    }
    public int getTop(){
       return this.top;
    }
    public void setBottom(int p0){
       this.bottom = p0;
    }
    public void setGiftId(int p0){
       this.giftId = p0;
    }
    public void setHandUp(Boolean p0){
       this.handUp = p0;
    }
    public void setLeft(int p0){
       this.left = p0;
    }
    public void setRight(int p0){
       this.right = p0;
    }
    public void setTop(int p0){
       this.top = p0;
    }
}
