package bk0.m;
import bk0.d;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lj0.c;
import zj0.v;
import ik0.m;
import com.kuaishou.krn.page.KrnReactContainerView;
import kotlin.jvm.internal.a;
import sj0.b;
import com.kuaishou.krn.instance.KrnReactInstanceState;
import java.lang.Enum;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import ck0.c;
import lk0.e;
import java.lang.Number;
import java.lang.Integer;
import android.os.SystemClock;
import java.lang.Long;
import com.kuaishou.krn.model.LaunchModel;
import android.os.Bundle;
import bk0.j;
import nsd.u;
import com.kuaishou.krn.library.KdsPluginLibraryType;
import com.kuaishou.krn.model.PluginTrackInfo;

public final class m extends d	// class@0003ac
{
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;

    public void m(){
       super();
       this.e = true;
       this.f = true;
    }
    public static void K(m p0,Throwable p1,boolean p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = null;
       }
       if (p3 & 0x02) {
          p2 = false;
       }
       p0.I(p1, p2);
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       this.L();
       return;
    }
    public final boolean G(){
       c uoc1;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, m.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       c uoc = this.D();
       if (uoc != null) {
          objArray = uoc.l();
       }
       if (objArray instanceof KrnReactContainerView) {
          uoc1 = this.D();
          a.m(uoc1);
          if (uoc1.i().j().compareTo(KrnReactInstanceState.READY) <= 0) {
          label_003b :
             b = true;
          }
       }else {
          uoc1 = this.D();
          if (uoc1 != null && uoc1.e == 1) {
             uoc1 = this.D();
             if (uoc1 != null && uoc1.f == null) {
                goto label_003b ;
             }
          }
       }
       return b;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, m.class, "5")) {
          return;
       }
       boolean b = this.G();
       if (b) {
          this.I(null, b);
       }
       return;
    }
    public final void I(Throwable p0,boolean p1){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, m.class, "7")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       this.c = true;
       c uoc = this.D();
       if (uoc != null) {
          uoc.f = true;
       }
       c uoc1 = this.D();
       Object[] objArray = null;
       String str = (p0 == null)? objArray: e.b(p0);
       uoc = new c(uoc1, str);
       c uoc2 = this.D();
       int i = 0;
       int b = (uoc2 != null)? uoc2.B(): false;
       uoc.f(b);
       uoc2 = this.D();
       if (uoc2 != null) {
          Object obj = PatchProxy.apply(objArray, uoc2, c.class, "20");
          if (obj != PatchProxyResult.class) {
             b = obj.intValue();
          }else {
             uoc2 = uoc2.n;
             if (uoc2 != null) {
                b g = uoc2.g;
             }
          }
          i = b;
       }
       if (!PatchProxy.isSupport(KrnLogCommonParams.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uoc, KrnLogCommonParams.class, "2")) {
          uoc.mEngineUseCount = Integer.valueOf(i);
       }
       if (p1) {
          uoc.duration = Long.valueOf((SystemClock.elapsedRealtime() - this.d));
          uoc.e(2);
       }
       uoc.d(this.e);
       uoc.c(this.f);
       uoc2 = this.D();
       if (!PatchProxy.applyVoidOneRefs(uoc2, uoc, KrnLogCommonParams.class, "11")) {
          if (uoc2 != null) {
             LaunchModel launchModel = uoc2.m();
             if (launchModel != null) {
                objArray = launchModel.g();
             }
          }
          if (objArray != null) {
             str = "containerSource";
             if (objArray.containsKey(str) == true) {
                uoc.mContainerSource = objArray.getString(str, "");
             }
          }
       }
    label_00cc :
       if (!PatchProxy.applyVoidOneRefs(uoc, this, m.class, "8")) {
          this.L();
          j.b.b("krn_page_load_result", uoc);
       }
       return;
    }
    public final void L(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "9")) {
          return;
       }
       c uoc = this.D();
       if (uoc != null && uoc.e == null) {
          uoc = this.D();
          if (uoc != null) {
             uoc.e = true;
          }
          j b = j.b;
          String str = "10";
          KrnLogCommonParams krnLogCommon = PatchProxy.apply(objArray, this, om, str);
          if (krnLogCommon != PatchProxyResult.class) {
          }else {
             krnLogCommon = new KrnLogCommonParams(this.D(), objArray, 2, objArray);
             c uoc1 = this.D();
             if (uoc1 != null) {
                uoc1 = uoc1.p;
                if (uoc1 != null) {
                label_0045 :
                   int i = uoc1.ordinal();
                   if (!PatchProxy.isSupport(KrnLogCommonParams.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), krnLogCommon, KrnLogCommonParams.class, str)) {
                      krnLogCommon.mV8PluginType = Integer.valueOf(i);
                   }
                   krnLogCommon.d(this.e);
                   krnLogCommon.c(this.f);
                }
             }
             KdsPluginLibraryType dEFAULT = KdsPluginLibraryType.DEFAULT;
             goto label_0045 ;
          }
          b.b("krn_page_load_start", krnLogCommon);
       }
       return;
    }
    public void d(long p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, om, "3")) {
          return;
       }
       m.K(this, null, false, 3, null);
       return;
    }
    public void e(long p0,Throwable p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, om, "4")) {
          return;
       }
       a.p(p1, "throwable");
       m.K(this, p1, false, 2, null);
       return;
    }
    public void y(LaunchModel p0,long p1,long p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, m.class, "1")) {
          return;
       }
       a.p(p0, "launchModel");
       this.d = p2;
       this.e = p0.j().h();
       this.f = p0.j().g();
       this.c = false;
       return;
    }
}
