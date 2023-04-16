package com.kuaishou.live.core.show.multiline.LiveMultiLineCellLayoutDescription;
import java.io.Serializable;
import com.kuaishou.live.core.show.multiline.LiveMultiLineCellLayoutDescription$a;
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

public final class LiveMultiLineCellLayoutDescription implements Serializable	// class@000d24
{
    public float ratioEndX;
    public final float ratioEndY;
    public final float ratioStartX;
    public final float ratioStartY;
    public static final LiveMultiLineCellLayoutDescription$a Companion;
    public static final long serialVersionUID;

    static {
       LiveMultiLineCellLayoutDescription.Companion = new LiveMultiLineCellLayoutDescription$a(null);
    }
    public void LiveMultiLineCellLayoutDescription(float p0,float p1,float p2,float p3){
       super();
       this.ratioStartX = p0;
       this.ratioEndX = p1;
       this.ratioStartY = p2;
       this.ratioEndY = p3;
    }
    public static LiveMultiLineCellLayoutDescription copy$default(LiveMultiLineCellLayoutDescription p0,float p1,float p2,float p3,float p4,int p5,Object p6){
       LiveMultiLineCellLayoutDescription ratioStartX;
       LiveMultiLineCellLayoutDescription ratioEndX;
       LiveMultiLineCellLayoutDescription ratioStartY;
       LiveMultiLineCellLayoutDescription ratioEndY;
       if (p5 & 0x01) {
          ratioStartX = p0.ratioStartX;
       }
       if (p5 & 0x02) {
          ratioEndX = p0.ratioEndX;
       }
       if (p5 & 0x04) {
          ratioStartY = p0.ratioStartY;
       }
       if (p5 & 0x08) {
          ratioEndY = p0.ratioEndY;
       }
       return p0.copy(ratioStartX, ratioEndX, ratioStartY, ratioEndY);
    }
    public final float component1(){
       return this.ratioStartX;
    }
    public final float component2(){
       return this.ratioEndX;
    }
    public final float component3(){
       return this.ratioStartY;
    }
    public final float component4(){
       return this.ratioEndY;
    }
    public final LiveMultiLineCellLayoutDescription copy(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(LiveMultiLineCellLayoutDescription.class)) {
          Object obj = PatchProxy.applyFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, LiveMultiLineCellLayoutDescription.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LiveMultiLineCellLayoutDescription(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiLineCellLayoutDescription.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveMultiLineCellLayoutDescription && (!Float.compare(this.ratioStartX, p0.ratioStartX) && (!Float.compare(this.ratioEndX, p0.ratioEndX) && (!Float.compare(this.ratioStartY, p0.ratioStartY) && !Float.compare(this.ratioEndY, p0.ratioEndY)))))) {
          return true;
       }
       return false;
    }
    public final float getRatioEndX(){
       return this.ratioEndX;
    }
    public final float getRatioEndY(){
       return this.ratioEndY;
    }
    public final float getRatioStartX(){
       return this.ratioStartX;
    }
    public final float getRatioStartY(){
       return this.ratioStartY;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLineCellLayoutDescription.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((((Float.floatToIntBits(this.ratioStartX) * 31) + Float.floatToIntBits(this.ratioEndX)) * 31) + Float.floatToIntBits(this.ratioStartY)) * 31) + Float.floatToIntBits(this.ratioEndY));
    }
    public final void setRatioEndX(float p0){
       this.ratioEndX = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLineCellLayoutDescription.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "startX:"+this.ratioStartX+", endX: "+this.ratioEndX+" , startY: "+this.ratioStartY+", endY:"+this.ratioEndY;
    }
}
