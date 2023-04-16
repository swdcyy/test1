package com.yxcorp.gifshow.performance.monitor.boost.RenderThrBoostInitModule$Fails;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import o56.a;
import android.os.Build$VERSION;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RenderThrBoostInitModule$Fails	// class@000e62
{
    public String manu;
    public String message;
    public int sdkInt;

    public void RenderThrBoostInitModule$Fails(){
       super(null, null, 0, 7, null);
    }
    public void RenderThrBoostInitModule$Fails(String p0,String p1,int p2){
       a.p(p0, "message");
       a.p(p1, "manu");
       super();
       this.message = p0;
       this.manu = p1;
       this.sdkInt = p2;
    }
    public void RenderThrBoostInitModule$Fails(String p0,String p1,int p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = "RenderBoostFai";
       }
       if (p3 & 0x02) {
          p1 = a.j;
          a.o(p1, "AppEnv.MANUFACTURER");
       }
       if (p3 & 0x04) {
          p2 = Build$VERSION.SDK_INT;
       }
       super(p0, p1, p2);
       return;
    }
    public static RenderThrBoostInitModule$Fails copy$default(RenderThrBoostInitModule$Fails p0,String p1,String p2,int p3,int p4,Object p5){
       RenderThrBoostInitModule$Fails message;
       RenderThrBoostInitModule$Fails manu;
       RenderThrBoostInitModule$Fails sdkInt;
       if (p4 & 0x01) {
          message = p0.message;
       }
       if (p4 & 0x02) {
          manu = p0.manu;
       }
       if (p4 & 0x04) {
          sdkInt = p0.sdkInt;
       }
       return p0.copy(message, manu, sdkInt);
    }
    public final String component1(){
       return this.message;
    }
    public final String component2(){
       return this.manu;
    }
    public final int component3(){
       return this.sdkInt;
    }
    public final RenderThrBoostInitModule$Fails copy(String p0,String p1,int p2){
       if (PatchProxy.isSupport(RenderThrBoostInitModule$Fails.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, RenderThrBoostInitModule$Fails.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "message");
       a.p(p1, "manu");
       return new RenderThrBoostInitModule$Fails(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RenderThrBoostInitModule$Fails.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RenderThrBoostInitModule$Fails && (a.g(this.message, p0.message) && (a.g(this.manu, p0.manu) && this.sdkInt == p0.sdkInt)))) {
          return true;
       }
       return false;
    }
    public final String getManu(){
       return this.manu;
    }
    public final String getMessage(){
       return this.message;
    }
    public final int getSdkInt(){
       return this.sdkInt;
    }
    public int hashCode(){
       RenderThrBoostInitModule$Fails obj = PatchProxy.apply(null, this, RenderThrBoostInitModule$Fails.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.message;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RenderThrBoostInitModule$Fails tmanu = this.manu;
       if (tmanu != null) {
          i = tmanu.hashCode();
       }
       return (((i1 + i) * 31) + this.sdkInt);
    }
    public final void setManu(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderThrBoostInitModule$Fails.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.manu = p0;
       return;
    }
    public final void setMessage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderThrBoostInitModule$Fails.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.message = p0;
       return;
    }
    public final void setSdkInt(int p0){
       this.sdkInt = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RenderThrBoostInitModule$Fails.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Fails\(message="+this.message+", manu="+this.manu+", sdkInt="+this.sdkInt+"\)";
    }
}
