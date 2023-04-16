package com.yxcorp.gifshow.camera.record.wide.b;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper$DisableCause;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;

public class b	// class@000faa
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public void b(){
       super();
       this.a = false;
       this.b = false;
       this.c = false;
       this.d = false;
       this.e = false;
    }
    public boolean a(){
       boolean b = (this.c == null && (this.b == null && (this.d == null && this.e == null)))? true: false;
       return b;
    }
    public boolean b(){
       return this.a;
    }
    public boolean c(boolean p0,UltraWideAndSuperStabilityStateHelper$DisableCause p1){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("UltraWideState", "set disable cause "+p1+" to "+p0, objArray);
       b = this.a();
       if (p1 == UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_MAGIC) {
          this.b = p0;
       }else if(p1 == UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_FRONT_CAMERA){
          this.c = p0;
       }else if(p1 == UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_STABILITY){
          this.d = p0;
       }else if(p1 == UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_LOWLIGHTBOOST){
          this.e = p0;
       }
       if (p0) {
          this.a = i;
       }
       if (b != this.a()) {
          i = true;
       }
       return i;
    }
    public boolean d(boolean p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uob = this.a;
       if (this.a()) {
          this.a = p0;
       }
       b ta = this.a;
       b = false;
       if (ta != null) {
          this.c = b;
          this.d = b;
          this.b = b;
          this.e = b;
       }
       if (uob != ta) {
          b = true;
       }
       return b;
    }
}
