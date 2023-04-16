package com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils$1;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import brd.t;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils$a;
import erd.g;
import crd.b;
import eda.n;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils$b;
import android.content.SharedPreferences;
import oe6.n;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils$c;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.corona.startup.model.CoronaBarrageSetting;
import java.lang.reflect.Type;
import ni5.d;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;
import java.util.Objects;
import qrd.p;
import ni5.a;
import km8.b;
import mm5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Throwable;
import com.kwai.corona.startup.model.DanmakuForceSwitch;
import android.content.SharedPreferences$Editor;
import oe6.g;
import im5.f;
import im5.f$a;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import lm5.d;
import java.lang.Integer;
import wkd.b;
import om5.a;
import io.reactivex.internal.functions.Functions;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils$d;

public final class DanmakuSwitchUtils	// class@000e91
{
    public static final SharedPreferences a;
    public static boolean b;
    public static Boolean c;
    public static String d;
    public static String e;
    public static boolean f;
    public static final b g;
    public static final DanmakuSwitchUtils h;

    static {
       DanmakuSwitchUtils.h = new DanmakuSwitchUtils();
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       f.g(l.class, mAIN).subscribe(DanmakuSwitchUtils$a.b);
       f.g(n.class, mAIN).subscribe(DanmakuSwitchUtils$b.b);
       SharedPreferences sharedPrefer = n.b();
       a.o(sharedPrefer, "PreferenceUtil.getPreferences\(\)");
       DanmakuSwitchUtils.a = sharedPrefer;
       DanmakuSwitchUtils.b = sharedPrefer.getBoolean("Danmaku_EVER_DANMAKU_ON", false);
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       DanmakuSwitchUtils.e = mE.getId();
       DanmakuSwitchUtils.g = t.timer(8000, TimeUnit.MILLISECONDS, d.c).subscribe(DanmakuSwitchUtils$c.b);
    }
    public void DanmakuSwitchUtils(){
       super();
    }
    public static void i(DanmakuSwitchUtils p0,boolean p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       p0.h(p1, p2);
       return;
    }
    public final void a(boolean p0){
       DanmakuSwitchUtils uDanmakuSwit = DanmakuSwitchUtils.class;
       if (PatchProxy.isSupport(uDanmakuSwit) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDanmakuSwit, "6")) {
          return;
       }
       if (this.f() == p0) {
          return;
       }
       DanmakuSwitchUtils.i(this, p0, false, 2, null);
       return;
    }
    public final boolean b(int p0){
       boolean b = false;
       if (!p0 || (p0 != 1 && p0 == 2)) {
          b = true;
       }
       return b;
    }
    public final boolean c(){
       CoronaBarrageSetting mDanmakuSwit;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CoronaBarrageSetting obj = PatchProxy.apply(objArray, this, DanmakuSwitchUtils.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       DanmakuSwitchUtils.d = DanmakuSwitchUtils.e;
       int i = 0;
       int intx = DanmakuSwitchUtils.a.getInt("Danmaku_SWITCH"+DanmakuSwitchUtils.d, i);
       if (intx != 1) {
          if (intx != 2) {
             obj = d.a(CoronaBarrageSetting.class);
             if (obj != null) {
                DanmakuExperimentUtils u = DanmakuExperimentUtils.U;
                Objects.requireNonNull(u);
                Boolean uBoolean = PatchProxy.apply(objArray, u, DanmakuExperimentUtils.class, "42");
                if (uBoolean == patchProxyRe) {
                   uBoolean = DanmakuExperimentUtils.N.getValue();
                }
                if (uBoolean.booleanValue()) {
                   mDanmakuSwit = obj.mDanmakuSwitch;
                   if (mDanmakuSwit == null) {
                      mDanmakuSwit = Boolean.valueOf(DanmakuSwitchUtils.h.b(obj.mEnableDanmakuSwitch));
                   }
                }else {
                   mDanmakuSwit = Boolean.valueOf(DanmakuSwitchUtils.h.b(obj.mEnableDanmakuSwitch));
                }
                if (mDanmakuSwit != null) {
                label_0081 :
                   a.o(mDanmakuSwit, "LandPlayerStartupPrefere\x20\x02     }\n        } ?: false\x00");
                   i = mDanmakuSwit.booleanValue();
                }
             }
             mDanmakuSwit = Boolean.FALSE;
             goto label_0081 ;
          }
       }else {
          i = true;
       }
       return i;
    }
    public final boolean d(){
       DanmakuForceSwitch forceSwitch;
       Object obj = this;
       DanmakuSwitchUtils uDanmakuSwit = DanmakuSwitchUtils.class;
       Object[] objArray = null;
       String obj1 = PatchProxy.apply(objArray, obj, uDanmakuSwit, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       if (!PatchProxy.applyVoid(objArray, obj, uDanmakuSwit, "12") && !DanmakuSwitchUtils.f) {
          boolean b = true;
          DanmakuSwitchUtils.f = b;
          obj1 = "USED_DANMAKU_FORCE_SWITCH_VERSION"+DanmakuSwitchUtils.e;
          SharedPreferences a = DanmakuSwitchUtils.a;
          int i = 0;
          int intx = a.getInt(obj1, i);
          SharedPreferences a1 = a.a;
          String str = "user";
          int intx1 = a1.getInt(b.d(str)+"danmakuForceSwitchVersion", i);
          a a2 = a.a;
          a.i(a2, "DanmakuSwitchUtils", "version:"+intx1+", usedVersion:"+intx, null, null, "checkForceSwitch", null, 44, null);
          if (intx1 > intx) {
             DanmakuForceSwitch uDanmakuForc = DanmakuForceSwitch.class;
             String str1 = a1.getString(b.d(str)+"danmakuForceSwitch", "null");
             if (str1 != null && str1 != "") {
                objArray = b.a(str1, uDanmakuForc);
             }
             a.i(a2, "DanmakuSwitchUtils", "forceSwitch:"+objArray, null, null, "checkForceSwitch", null, 44, null);
             if (objArray != null) {
                forceSwitch = objArray.forceSwitch;
                if (forceSwitch == b || forceSwitch == 2) {
                   forceSwitch = 1;
                label_00e8 :
                   if (forceSwitch) {
                      g.a(a.edit().putInt(obj1, intx1));
                      if (objArray != null && objArray.forceSwitch == 2) {
                         i = 1;
                      }
                      boolean b1 = this.e();
                      a.i(a2, "DanmakuSwitchUtils", "clientSwitch:"+b1, null, null, "checkForceSwitch", null, 44, null);
                      if (b1 != i) {
                         obj.l(i, 4, b);
                      }
                   }
                }
             }
             forceSwitch = 0;
             goto label_00e8 ;
          }
       }
    label_012a :
       return this.e();
    }
    public final boolean e(){
       boolean b;
       Object[] objArray = null;
       Boolean obj = PatchProxy.apply(objArray, this, DanmakuSwitchUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = DanmakuSwitchUtils.c;
       if (obj != null) {
          obj.booleanValue();
          if (a.g(DanmakuSwitchUtils.d, DanmakuSwitchUtils.e) ^ 0x01) {
             DanmakuSwitchUtils.c = objArray;
          }
       }
       obj = DanmakuSwitchUtils.c;
       if (obj != null) {
          b = obj.booleanValue();
       }else {
          b = this.c();
          DanmakuSwitchUtils.c = Boolean.valueOf(b);
       }
       return b;
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, DanmakuSwitchUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d() && f.a.d())? true: false;
       return b;
    }
    public final boolean g(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DanmakuSwitchUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (DanmakuSwitchUtil.b(p0) && this.d())? true: false;
       return b;
    }
    public final void h(boolean p0,boolean p1){
       DanmakuSwitchUtils uDanmakuSwit = DanmakuSwitchUtils.class;
       if (PatchProxy.isSupport(uDanmakuSwit) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uDanmakuSwit, "8")) {
          return;
       }
       this.l(p0, 1, p1);
       RxBus.f.b(new d(p0, p1));
       return;
    }
    public final void j(QPhoto p0,boolean p1){
       DanmakuSwitchUtils uDanmakuSwit = DanmakuSwitchUtils.class;
       if (PatchProxy.isSupport(uDanmakuSwit) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uDanmakuSwit, "7")) {
          return;
       }
       if (!DanmakuSwitchUtil.b(p0)) {
          return;
       }
       DanmakuSwitchUtils.i(this, p1, false, 2, null);
       return;
    }
    public final void k(boolean p0,int p1){
       DanmakuSwitchUtils uDanmakuSwit = DanmakuSwitchUtils.class;
       if (PatchProxy.isSupport(uDanmakuSwit) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uDanmakuSwit, "11")) {
          return;
       }
       a a = a.a;
       a.i(a, "DanmakuSwitchUtils", "enter. isOpen: "+p0+", source: "+p1, null, null, "syncSwitch", null, 44, null);
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (!mE.isLogined()) {
          return;
       }
       if (p1 == 1 || (p0 && !DanmakuSwitchUtils.b)) {
          SharedPreferences a1 = DanmakuSwitchUtils.a;
          String str = "Danmaku_EVER_DANMAKU_ON";
          if (!a1.getBoolean(str, false)) {
             DanmakuSwitchUtils.b = true;
             g.a(a1.edit().putBoolean(str, 1));
          }
       }
       a.i(a, "DanmakuSwitchUtils", "request \'photo/danmaku/updateSwitch\'", null, null, "syncSwitch", null, 44, null);
       b.a(0x6f9dbf5b).a(1, p0, p1).subscribe(Functions.d(), DanmakuSwitchUtils$d.b);
       return;
    }
    public final void l(boolean p0,int p1,boolean p2){
       if (PatchProxy.isSupport(DanmakuSwitchUtils.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, DanmakuSwitchUtils.class, "10")) {
          return;
       }
       DanmakuSwitchUtils.c = Boolean.valueOf(p0);
       DanmakuSwitchUtils.d = DanmakuSwitchUtils.e;
       if (p2) {
          DanmakuSwitchUtils.g.dispose();
          SharedPreferences$Editor uEditor = DanmakuSwitchUtils.a.edit();
          String str = "Danmaku_SWITCH"+DanmakuSwitchUtils.d;
          int i = (p0)? 1: 2;
          g.a(uEditor.putInt(str, i));
          this.k(p0, p1);
       }
       return;
    }
}
