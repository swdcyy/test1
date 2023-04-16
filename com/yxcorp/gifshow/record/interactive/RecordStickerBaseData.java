package com.yxcorp.gifshow.record.interactive.RecordStickerBaseData;
import java.io.Serializable;
import nsd.u;
import java.lang.Object;

public class RecordStickerBaseData implements Serializable	// class@00178e
{
    public float centerX;
    public float centerY;
    public float scale;

    public void RecordStickerBaseData(){
       super(0, 0, 0, 7, null);
    }
    public void RecordStickerBaseData(float p0,float p1,float p2){
       super();
       this.centerX = p0;
       this.centerY = p1;
       this.scale = p2;
    }
    public void RecordStickerBaseData(float p0,float p1,float p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0x3f000000;
       }
       if (p3 & 0x02) {
          p1 = 0x3f000000;
       }
       if (p3 & 0x04) {
          p2 = 0x3f800000;
       }
       super(p0, p1, p2);
       return;
    }
    public final float getCenterX(){
       return this.centerX;
    }
    public final float getCenterY(){
       return this.centerY;
    }
    public final float getScale(){
       return this.scale;
    }
    public final void setCenterX(float p0){
       this.centerX = p0;
    }
    public final void setCenterY(float p0){
       this.centerY = p0;
    }
    public final void setScale(float p0){
       this.scale = p0;
    }
}
