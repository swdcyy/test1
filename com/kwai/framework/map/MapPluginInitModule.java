package com.kwai.framework.map.MapPluginInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kwai.framework.init.CoreInitModule;
import o96.u;
import com.kwai.framework.location.locationupload.h;
import java.util.Objects;
import crd.b;
import s96.a;
import java.lang.Boolean;
import lnc.i3;
import k2b.u1;
import com.kwai.framework.location.locationupload.k;
import p96.a;
import q87.c;
import r96.x;
import e66.f;
import r96.y;
import com.kwai.framework.location.locationupload.LocationUploadConfig;
import com.kwai.framework.location.locationupload.l;
import com.kwai.framework.location.CurrentLocationCityManager;
import com.kwai.framework.map.MapPluginInitModule$a;
import hyb.c;
import qe6.b;
import com.kwai.framework.exceptionhandler.constant.CrashProtectorConstants$CrashType;
import p66.a;
import com.kwai.framework.map.c;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import yz6.u;
import sid.u;
import ca6.a;
import com.yxcorp.plugin.tencent.map.MapLocationManager;

public class MapPluginInitModule extends a	// class@001681
{
    public static boolean q;

    public void MapPluginInitModule(){
       super();
    }
    public static void l0(){
       if (PatchProxy.applyVoid(null, null, MapPluginInitModule.class, "3")) {
          return;
       }
       b.a(0xd91a93c).n0();
       return;
    }
    public int f0(){
       return 5;
    }
    public List g(){
       ArrayList obj = PatchProxy.apply(null, this, MapPluginInitModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(CoreInitModule.class);
       return obj;
    }
    public void h0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MapPluginInitModule.class, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, u.class, "42")) {
          h oh = h.b();
          Objects.requireNonNull(oh);
          h oh1 = h.class;
          if (!PatchProxy.applyVoid(objArray, oh, oh1, "3")) {
             int i = 0;
             if (!PatchProxy.applyVoid(objArray, oh, oh1, "5")) {
                oh1 = oh.d;
                if (oh1 != null && !oh1.isDisposed()) {
                   oh.d.dispose();
                   if (oh.e()) {
                      boolean b = true;
                      if (oh.c != b) {
                         b = false;
                      }
                      String str = oh.d();
                      a uoa = a.class;
                      if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), str, objArray, uoa, "10")) {
                         i3 oi3 = i3.f();
                         oi3.a("isFirstTimer", Boolean.valueOf(b));
                         oi3.d("configTag", str);
                         str = oi3.e();
                         u1.R("location_upload_timer_cancel", str, 15);
                      }
                   }
                }
             }
             oh = oh.g;
             Objects.requireNonNull(oh);
             if (!PatchProxy.applyVoid(objArray, oh, k.class, "8") && (oh.h != null && !oh.h.isDisposed())) {
                oh.h.dispose();
                Object[] objArray1 = new Object[i];
                a.C().w(k.n, "requestQueryInfo timer canceled", objArray1);
             }
          }
       }
    label_00b5 :
       return;
    }
    public void i0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MapPluginInitModule.class, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, u.class, "41")) {
          h oh = h.b();
          Objects.requireNonNull(oh);
          h oh1 = h.class;
          if (!PatchProxy.applyVoid(objArray, oh, oh1, "2")) {
             if (!PatchProxy.applyVoid(objArray, oh, oh1, "4")) {
                if (!y.a(x.a(), f.a()) && !PatchProxy.applyVoid(objArray, oh, oh1, "16")) {
                   f.b(false);
                   oh.e = 0;
                }
                oh.c = 0;
                oh.f();
             }
             oh.h.a(oh.a, false);
             oh = oh.g;
             Objects.requireNonNull(oh);
             if (!PatchProxy.applyVoid(objArray, oh, k.class, "7")) {
                if (oh.j != null) {
                   oh.j = false;
                   oh.b(1);
                }else {
                   oh.b(2);
                }
             }
          }
          CurrentLocationCityManager.getInstance().onForeground();
       }
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, MapPluginInitModule.class, "2")) {
          return;
       }
       this.n0();
       return;
    }
    public synchronized final void n0(){
       if (PatchProxy.applyVoid(null, this, MapPluginInitModule.class, "4")) {
          return;
       }
       if (MapPluginInitModule.q) {
          return;
       }
       boolean b = true;
       MapPluginInitModule.q = b;
       c.b = new MapPluginInitModule$a(this);
       if (b.a() && !a.a(CrashProtectorConstants$CrashType.TENCENT_MAP)) {
          c.c(c.b);
       }
       if (a.a(CrashProtectorConstants$CrashType.BAIDU_MAP)) {
          u.b = b;
          return;
       }else {
          a uoa = PatchProxy.apply(null, null, MapPluginInitModule.class, "1");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = new a();
          }
          if (!PatchProxy.applyVoidOneRefs(uoa, null, u.class, "4")) {
             MapLocationManager.getInstance().setLocationEventCallback(uoa);
          }
          return;
       }
    }
}
