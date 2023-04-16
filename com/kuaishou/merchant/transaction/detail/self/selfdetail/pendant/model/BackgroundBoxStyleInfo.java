package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.BackgroundBoxStyleInfo;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.BackgroundBoxStyleInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class BackgroundBoxStyleInfo implements Serializable	// class@000744
{
    public String mBgColor;
    public String mBorderColor;
    public float mBorderSize;
    public float mRadiusSize;
    public static final BackgroundBoxStyleInfo$a Companion;
    public static final long serialVersionUID;

    static {
       BackgroundBoxStyleInfo.Companion = new BackgroundBoxStyleInfo$a(null);
    }
    public void BackgroundBoxStyleInfo(){
       super(null, null, 0, 0, 15, null);
    }
    public void BackgroundBoxStyleInfo(String p0,String p1,float p2,float p3){
       super();
       this.mBgColor = p0;
       this.mBorderColor = p1;
       this.mBorderSize = p2;
       this.mRadiusSize = p3;
    }
    public void BackgroundBoxStyleInfo(String p0,String p1,float p2,float p3,int p4,u p5){
       String str = "";
       if (p4 & 0x01) {
          p0 = str;
       }
       if (p4 & 0x02) {
          p1 = str;
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
    public static BackgroundBoxStyleInfo copy$default(BackgroundBoxStyleInfo p0,String p1,String p2,float p3,float p4,int p5,Object p6){
       BackgroundBoxStyleInfo mBgColor;
       BackgroundBoxStyleInfo mBorderColor;
       BackgroundBoxStyleInfo mBorderSize;
       BackgroundBoxStyleInfo mRadiusSize;
       if (p5 & 0x01) {
          mBgColor = p0.mBgColor;
       }
       if (p5 & 0x02) {
          mBorderColor = p0.mBorderColor;
       }
       if (p5 & 0x04) {
          mBorderSize = p0.mBorderSize;
       }
       if (p5 & 0x08) {
          mRadiusSize = p0.mRadiusSize;
       }
       return p0.copy(mBgColor, mBorderColor, mBorderSize, mRadiusSize);
    }
    public final String component1(){
       return this.mBgColor;
    }
    public final String component2(){
       return this.mBorderColor;
    }
    public final float component3(){
       return this.mBorderSize;
    }
    public final float component4(){
       return this.mRadiusSize;
    }
    public final BackgroundBoxStyleInfo copy(String p0,String p1,float p2,float p3){
       if (PatchProxy.isSupport(BackgroundBoxStyleInfo.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, BackgroundBoxStyleInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new BackgroundBoxStyleInfo(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BackgroundBoxStyleInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof BackgroundBoxStyleInfo && (a.g(this.mBgColor, p0.mBgColor) && (a.g(this.mBorderColor, p0.mBorderColor) && (!Float.compare(this.mBorderSize, p0.mBorderSize) && !Float.compare(this.mRadiusSize, p0.mRadiusSize)))))) {
          return true;
       }
       return false;
    }
    public final String getMBgColor(){
       return this.mBgColor;
    }
    public final String getMBorderColor(){
       return this.mBorderColor;
    }
    public final float getMBorderSize(){
       return this.mBorderSize;
    }
    public final float getMRadiusSize(){
       return this.mRadiusSize;
    }
    public int hashCode(){
       BackgroundBoxStyleInfo obj = PatchProxy.apply(null, this, BackgroundBoxStyleInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mBgColor;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       BackgroundBoxStyleInfo tmBorderColo = this.mBorderColor;
       if (tmBorderColo != null) {
          i = tmBorderColo.hashCode();
       }
       return (((((i1 + i) * 31) + Float.floatToIntBits(this.mBorderSize)) * 31) + Float.floatToIntBits(this.mRadiusSize));
    }
    public final void setMBgColor(String p0){
       this.mBgColor = p0;
    }
    public final void setMBorderColor(String p0){
       this.mBorderColor = p0;
    }
    public final void setMBorderSize(float p0){
       this.mBorderSize = p0;
    }
    public final void setMRadiusSize(float p0){
       this.mRadiusSize = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BackgroundBoxStyleInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BackgroundBoxStyleInfo\(mBgColor="+this.mBgColor+", mBorderColor="+this.mBorderColor+", mBorderSize="+this.mBorderSize+", mRadiusSize="+this.mRadiusSize+"\)";
    }
}
