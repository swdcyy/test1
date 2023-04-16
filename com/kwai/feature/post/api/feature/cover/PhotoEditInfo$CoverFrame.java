package com.kwai.feature.post.api.feature.cover.PhotoEditInfo$CoverFrame;
import java.io.Serializable;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PhotoEditInfo$CoverFrame implements Serializable	// class@001391
{
    public float height;
    public float width;
    public float x;
    public float y;

    public void PhotoEditInfo$CoverFrame(){
       super(0, 0, 0, 0, 15, null);
    }
    public void PhotoEditInfo$CoverFrame(float p0,float p1,float p2,float p3){
       super();
       this.x = p0;
       this.y = p1;
       this.width = p2;
       this.height = p3;
    }
    public void PhotoEditInfo$CoverFrame(float p0,float p1,float p2,float p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = 0;
       }
       if (p4 & 0x02) {
          p1 = 0;
       }
       if (p4 & 0x04) {
          p2 = 0;
       }
       if (p4 & 0x08) {
          p3 = 0;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static PhotoEditInfo$CoverFrame copy$default(PhotoEditInfo$CoverFrame p0,float p1,float p2,float p3,float p4,int p5,Object p6){
       PhotoEditInfo$CoverFrame x;
       PhotoEditInfo$CoverFrame y;
       PhotoEditInfo$CoverFrame width;
       PhotoEditInfo$CoverFrame height;
       if (p5 & 0x01) {
          x = p0.x;
       }
       if (p5 & 0x02) {
          y = p0.y;
       }
       if (p5 & 0x04) {
          width = p0.width;
       }
       if (p5 & 0x08) {
          height = p0.height;
       }
       return p0.copy(x, y, width, height);
    }
    public final float component1(){
       return this.x;
    }
    public final float component2(){
       return this.y;
    }
    public final float component3(){
       return this.width;
    }
    public final float component4(){
       return this.height;
    }
    public final PhotoEditInfo$CoverFrame copy(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(PhotoEditInfo$CoverFrame.class)) {
          Object obj = PatchProxy.applyFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, PhotoEditInfo$CoverFrame.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PhotoEditInfo$CoverFrame(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoEditInfo$CoverFrame.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PhotoEditInfo$CoverFrame && (!Float.compare(this.x, p0.x) && (!Float.compare(this.y, p0.y) && (!Float.compare(this.width, p0.width) && !Float.compare(this.height, p0.height)))))) {
          return true;
       }
       return false;
    }
    public final float getHeight(){
       return this.height;
    }
    public final float getWidth(){
       return this.width;
    }
    public final float getX(){
       return this.x;
    }
    public final float getY(){
       return this.y;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, PhotoEditInfo$CoverFrame.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((((Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y)) * 31) + Float.floatToIntBits(this.width)) * 31) + Float.floatToIntBits(this.height));
    }
    public final void setHeight(float p0){
       this.height = p0;
    }
    public final void setWidth(float p0){
       this.width = p0;
    }
    public final void setX(float p0){
       this.x = p0;
    }
    public final void setY(float p0){
       this.y = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PhotoEditInfo$CoverFrame.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CoverFrame\(x="+this.x+", y="+this.y+", width="+this.width+", height="+this.height+"\)";
    }
}
