package com.kwai.component.photo.detail.slide.negative.operation.SpeedItemModel;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SpeedItemModel implements Serializable	// class@000a7c
{
    public final String displayName;
    public boolean selected;
    public final float speed;
    public final String speedId;

    public void SpeedItemModel(String p0,float p1,String p2,boolean p3){
       a.p(p0, "displayName");
       a.p(p2, "speedId");
       super();
       this.displayName = p0;
       this.speed = p1;
       this.speedId = p2;
       this.selected = p3;
    }
    public static SpeedItemModel copy$default(SpeedItemModel p0,String p1,float p2,String p3,boolean p4,int p5,Object p6){
       SpeedItemModel displayName;
       SpeedItemModel speed;
       SpeedItemModel speedId;
       SpeedItemModel selected;
       if (p5 & 0x01) {
          displayName = p0.displayName;
       }
       if (p5 & 0x02) {
          speed = p0.speed;
       }
       if (p5 & 0x04) {
          speedId = p0.speedId;
       }
       if (p5 & 0x08) {
          selected = p0.selected;
       }
       return p0.copy(displayName, speed, speedId, selected);
    }
    public final String component1(){
       return this.displayName;
    }
    public final float component2(){
       return this.speed;
    }
    public final String component3(){
       return this.speedId;
    }
    public final boolean component4$detail_slide_release(){
       return this.selected;
    }
    public final SpeedItemModel copy(String p0,float p1,String p2,boolean p3){
       if (PatchProxy.isSupport(SpeedItemModel.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), p2, Boolean.valueOf(p3), this, SpeedItemModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "displayName");
       a.p(p2, "speedId");
       return new SpeedItemModel(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SpeedItemModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SpeedItemModel && (a.g(this.displayName, p0.displayName) && (!Float.compare(this.speed, p0.speed) && (a.g(this.speedId, p0.speedId) && this.selected == p0.selected))))) {
          return true;
       }
       return false;
    }
    public final String getDisplayName(){
       return this.displayName;
    }
    public final boolean getSelected$detail_slide_release(){
       return this.selected;
    }
    public final float getSpeed(){
       return this.speed;
    }
    public final String getSpeedId(){
       return this.speedId;
    }
    public int hashCode(){
       SpeedItemModel obj = PatchProxy.apply(null, this, SpeedItemModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.displayName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + Float.floatToIntBits(this.speed)) * 31;
       SpeedItemModel tspeedId = this.speedId;
       if (tspeedId != null) {
          i = tspeedId.hashCode();
       }
       i1 = (i1 + i) * 31;
       SpeedItemModel tselected = this.selected;
       if (tselected != null) {
          tselected = 1;
       }
       return (i1 + tselected);
    }
    public final void setSelected$detail_slide_release(boolean p0){
       this.selected = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SpeedItemModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SpeedItemModel\(displayName="+this.displayName+", speed="+this.speed+", speedId="+this.speedId+", selected="+this.selected+"\)";
    }
}
