package com.kwai.feature.platform.misc.priavykit.PrivacyKitInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kwai.framework.initmodule.AzerothInitModule;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import com.kwai.sdk.switchconfig.a;
import java.lang.StringBuilder;
import wk7.f;
import tk7.j;
import java.lang.Boolean;
import wk7.e;
import com.kwai.feature.platform.misc.priavykit.b;
import com.kwai.middleware.azeroth.Azeroth2;
import brd.t;
import t45.d;
import brd.z;
import tk7.i;
import erd.g;
import crd.b;
import tk7.e;
import tk7.h;
import qe6.b;
import ekd.p0;
import com.kwai.feature.platform.misc.priavykit.c;
import io7.a;
import com.yxcorp.utility.c;
import com.kwai.feature.platform.misc.priavykit.d;
import vk7.h0;
import com.kwai.feature.platform.misc.priavykit.e;
import r06.d;
import r06.e;
import com.yxcorp.utility.SystemUtil;
import java.lang.reflect.Method;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import ekd.e0;
import android.content.Context;
import skd.a;
import skd.a$a;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class PrivacyKitInitModule extends a	// class@000afc
{
    public static final int q;

    public void PrivacyKitInitModule(){
       super();
    }
    public int f0(){
       return 21;
    }
    public List g(){
       ArrayList obj = PatchProxy.apply(null, this, PrivacyKitInitModule.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(AzerothInitModule.class);
       obj.add(SwitchConfigInitModule.class);
       return obj;
    }
    public final void l0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PrivacyKitInitModule.class, "5")) {
          return;
       }
       boolean b = a.t().d("isInterceptReadClipboardBackground", false);
       f.a("PrivacyKitInitModule", "updateClipboardSwitchConfig value = "+b);
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), objArray, oj, "7")) {
          f.a("PrivacyManager", "setInterceptReadClipboardBackground value = "+b);
          e.f("isInterceptReadClipboardBackground", b);
       }
       return;
    }
    public void n(){
       int i;
       boolean b;
       String str;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PrivacyKitInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, PrivacyKitInitModule.class, "2")) {
          b a = b.a;
          j oj = j.class;
          if (!PatchProxy.applyVoidOneRefs(a, objArray, oj, "6") && !j.e) {
             j.e = true;
             j.d.c = a;
             Azeroth2 b1 = Azeroth2.B;
             str = "frigate";
             j.g().r(b1.o(str));
             if (!PatchProxy.applyVoid(objArray, objArray, oj, "9")) {
                b1.x().observeOn(d.c).subscribe(i.b);
             }
             if (!PatchProxy.applyVoid(objArray, objArray, oj, "12")) {
                b1.y(str).observeOn(e.a).subscribe(h.b);
             }
             f.a("PrivacyManager", "init finished");
          }
          j.q(b.a());
          i = 0;
          if (!PatchProxy.applyVoid(objArray, this, PrivacyKitInitModule.class, "4")) {
             b = a.t().d("LocationConnectionInfoCacheSwitch", i);
             f.a("PrivacyKitInitModule", "LOCATION_CONNECTION_INFO_CACHE_SWITCH value = "+b);
             p0.I(b);
             a.t().p("LocationConnectionInfoCacheSwitch", c.b);
             b = a.t().d("LocationCellLocationCacheSwitch", i);
             f.a("PrivacyKitInitModule", "LOCATION_CELL_LOCATION_CACHE_SWITCH value = "+b);
             c.d(b);
             a.t().p("LocationCellLocationCacheSwitch", d.b);
             str = "CheckPermissionCacheSwitch";
             b = a.t().d(str, i);
             f.a("PrivacyKitInitModule", "CHECK_PERMISSION_CACHE_SWITCH value = "+b);
             h0.a(b);
             a.t().p(str, e.b);
          }
          this.l0();
          this.n0();
          a.t().p("isInterceptReadClipboardBackground", new d(this));
          a.t().p("isOpenPhoneStateCache", new e(this));
          f.a("PrivacyKitInitModule", "init finish");
          if (!PatchProxy.applyVoid(objArray, this, PrivacyKitInitModule.class, "3") && SystemUtil.I()) {
             try{
                Class[] uClassArray = new Class[i];
                Class.forName("com.kwai.feature.platform.privacykit_test.PrivacyKitAntiDeterioration").getMethod("initBinderHook", uClassArray).invoke(objArray, objArray);
             }catch(java.lang.Exception e0){
                f.c("PrivacyKitInitModule", "initBinderHook failed", e0);
             }
          }
       }
    }
    public final void n0(){
       if (PatchProxy.applyVoid(null, this, PrivacyKitInitModule.class, "6")) {
          return;
       }
       boolean b = a.t().d("isOpenPhoneStateCache", true);
       f.a("PrivacyKitInitModule", "updatePhoneStateSwitchConfig value = "+b);
       p0.b = b;
       Log.b("UtilityBaseNetworkUtils", "setOpenNetworkTypeCache: "+p0.b);
       a$a uoa = a.b(e0.b, "OpenNetworkTypeCache").a();
       uoa.putBoolean("OpenNetworkTypeCache", b);
       g.a(uoa);
       return;
    }
}
