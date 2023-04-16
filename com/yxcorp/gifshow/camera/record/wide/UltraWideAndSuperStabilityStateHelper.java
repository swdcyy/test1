package com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper;
import com.yxcorp.gifshow.media.model.CameraConfig;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.wide.b;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.media.model.CameraUnitConfig;
import j8c.a;
import w46.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper$a;
import java.lang.Enum;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper$DisableCause;

public class UltraWideAndSuperStabilityStateHelper	// class@000fa7
{
    public final boolean a;
    public final boolean b;
    public final CameraUnitConfig c;
    public b d;
    public StabilityType e;

    public void UltraWideAndSuperStabilityStateHelper(boolean p0,boolean p1,CameraConfig p2){
       super();
       this.d = new b();
       this.e = StabilityType.TYPE_DEFAULT;
       this.a = p0;
       this.b = p1;
       if (p1) {
          StabilityType.DISABLED.reset();
       }
       CameraConfig uCameraConfi = PatchProxy.applyOneRefs(p2, this, UltraWideAndSuperStabilityStateHelper.class, "6");
       if (uCameraConfi != PatchProxyResult.class) {
       }else {
          uCameraConfi = p2.mCameraUnitConfig;
          if (uCameraConfi == null) {
             Object[] objArray = new Object[0];
             a.D().t("WideAndStability", "Should never reach here", objArray);
             uCameraConfi = new CameraUnitConfig();
          }
       }
       this.c = uCameraConfi;
       return;
    }
    public boolean a(){
       return this.c.mAllowEisWhenEffectOn;
    }
    public final void b(boolean p0){
       UltraWideAndSuperStabilityStateHelper ultraWideAnd = UltraWideAndSuperStabilityStateHelper.class;
       if (PatchProxy.isSupport(ultraWideAnd) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ultraWideAnd, "2")) {
          return;
       }
       if (this.a == null && this.b != null) {
          if (!PatchProxy.applyVoid(null, this, ultraWideAnd, "28")) {
             int i = UltraWideAndSuperStabilityStateHelper$a.a[this.e.ordinal()];
             if (i != 3) {
                if (i == 4 && !this.c()) {
                   this.e = StabilityType.OFF;
                }
             }else if(!this.d()){
                this.e = StabilityType.SUPER_PRO;
             }
          }
          return;
       }else {
          int i1 = 0;
          Object[] objArray = new Object[i1];
          a.D().w("WideAndStability", "auto change state "+this.g()+"\("+this.e()+"\), "+this.e, objArray);
          boolean b = true;
          if (!this.e() && (this.e == StabilityType.OFF && !this.d())) {
             this.e = StabilityType.DISABLED;
          }else if(this.f() && this.e == StabilityType.SUPER){
             if (!this.c()) {
                this.d.c(b, UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_STABILITY);
             label_0146 :
                this.j(i1, UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_WIDE);
                this.n(b, UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_STABILITY);
                return;
             }else if(!this.d()){
                this.e = StabilityType.SUPER_PRO;
                this.d.d(b);
             }
          }else if(this.g() && this.e == StabilityType.SUPER){
             this.e = StabilityType.SUPER_PRO;
          }else if(!this.e() && this.e == StabilityType.SUPER_PRO){
             if (p0) {
                if (this.d()) {
                   this.e = StabilityType.SUPER;
                }else {
                   this.e = StabilityType.DISABLED;
                }
             }else {
                this.e = StabilityType.OFF;
             }
          }else if(this.f() && this.e == StabilityType.SUPER_PRO){
             if (p0) {
                this.e = (this.d())? StabilityType.SUPER: StabilityType.OFF;
             }else {
                this.d.d(b);
             }
          }else if(this.g() && this.e == StabilityType.OFF){
             if (p0) {
                this.d.d(i1);
             }else if(!this.c()){
                this.e = StabilityType.DISABLED;
             }
          }
          b = false;
          goto label_0146 ;
          b = false;
          i1 = true;
          goto label_0146 ;
       }
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, UltraWideAndSuperStabilityStateHelper.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return StabilityType.SUPER_PRO.isValidWithConfig(this.c);
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, UltraWideAndSuperStabilityStateHelper.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return StabilityType.SUPER.isValidWithConfig(this.c);
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, UltraWideAndSuperStabilityStateHelper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d.a();
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, UltraWideAndSuperStabilityStateHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d.a() && !this.d.b())? true: false;
       return b;
    }
    public final boolean g(){
       Object obj = PatchProxy.apply(null, this, UltraWideAndSuperStabilityStateHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d.b();
    }
    public final boolean h(){
       Object obj = PatchProxy.apply(null, this, UltraWideAndSuperStabilityStateHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.g() && this.e == StabilityType.SUPER_PRO)? true: false;
       return b;
    }
    public boolean i(boolean p0){
       UltraWideAndSuperStabilityStateHelper ultraWideAnd = UltraWideAndSuperStabilityStateHelper.class;
       if (PatchProxy.isSupport(ultraWideAnd)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ultraWideAnd, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.k(p0, UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_FRONT_CAMERA, true);
    }
    public final boolean j(boolean p0,UltraWideAndSuperStabilityStateHelper$DisableCause p1){
       UltraWideAndSuperStabilityStateHelper ultraWideAnd = UltraWideAndSuperStabilityStateHelper.class;
       if (PatchProxy.isSupport(ultraWideAnd)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, ultraWideAnd, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.k(p0, p1, true);
    }
    public final boolean k(boolean p0,UltraWideAndSuperStabilityStateHelper$DisableCause p1,boolean p2){
       UltraWideAndSuperStabilityStateHelper obj;
       if (PatchProxy.isSupport(UltraWideAndSuperStabilityStateHelper.class)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, Boolean.valueOf(p2), this, UltraWideAndSuperStabilityStateHelper.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.e;
       boolean b = this.h();
       StabilityType dISABLED = StabilityType.DISABLED;
       if (this.e == dISABLED || p0) {
          if (p1 == UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_MAGIC) {
             dISABLED.setDisableByMagic(p0);
          }else if(p1 == UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_FRONT_CAMERA){
             dISABLED.setDisableByFrontCamera(p0);
          }else if(p1 == UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_WIDE){
             dISABLED.setDisableByWide(p0);
          }else if(p1 == UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_BODY){
             dISABLED.setDisableByBody(p0);
          }else if(p1 == UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_BEAUTY){
             dISABLED.setDisableByBeauty(p0);
          }else if(p1 == UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_MAKEUP){
             dISABLED.setDisableByMakeup(p0);
          }else if(p1 == UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_LOWLIGHTBOOST){
             dISABLED.setDisableByLowlightBoost(p0);
          }
       }
       if (this.e == dISABLED) {
          if (dISABLED.getDisableReason() == null) {
             this.e = StabilityType.TYPE_DEFAULT;
          }
       }else if(p0){
          this.e = dISABLED;
       }
       if (obj != this.e && p2) {
          this.b(b);
       }
       p0 = (obj != this.e)? true: false;
       return p0;
    }
    public boolean l(boolean p0){
       UltraWideAndSuperStabilityStateHelper ultraWideAnd = UltraWideAndSuperStabilityStateHelper.class;
       if (PatchProxy.isSupport(ultraWideAnd)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ultraWideAnd, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.m(p0, true);
    }
    public boolean m(boolean p0,boolean p1){
       UltraWideAndSuperStabilityStateHelper ultraWideAnd = UltraWideAndSuperStabilityStateHelper.class;
       if (PatchProxy.isSupport(ultraWideAnd)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ultraWideAnd, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.o(p0, UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_FRONT_CAMERA, p1);
    }
    public final boolean n(boolean p0,UltraWideAndSuperStabilityStateHelper$DisableCause p1){
       UltraWideAndSuperStabilityStateHelper ultraWideAnd = UltraWideAndSuperStabilityStateHelper.class;
       if (PatchProxy.isSupport(ultraWideAnd)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, ultraWideAnd, "24");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.o(p0, p1, true);
    }
    public final boolean o(boolean p0,UltraWideAndSuperStabilityStateHelper$DisableCause p1,boolean p2){
       if (PatchProxy.isSupport(UltraWideAndSuperStabilityStateHelper.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, Boolean.valueOf(p2), this, UltraWideAndSuperStabilityStateHelper.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = this.h();
       p0 = this.d.c(p0, p1);
       if (p0 && (this.b != null && p2)) {
          this.b(b);
       }
    label_003a :
       return p0;
    }
    public boolean p(boolean p0){
       UltraWideAndSuperStabilityStateHelper ultraWideAnd = UltraWideAndSuperStabilityStateHelper.class;
       if (PatchProxy.isSupport(ultraWideAnd)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ultraWideAnd, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("WideAndStability", "set wide state "+this.g()+"\("+this.e()+"\),  -> "+p0, objArray);
       boolean b = this.h();
       p0 = this.d.d(p0);
       if (p0 && this.b != null) {
          this.b(b);
       }
       return p0;
    }
}
