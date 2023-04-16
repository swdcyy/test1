package com.kuaishou.krn.delegate.k;
import com.kuaishou.krn.delegate.KrnDelegate;
import ik0.m;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.model.LoadingStateTrack;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.krn.delegate.c;
import java.util.Map;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import jk0.b;
import jk0.c;
import android.view.ViewParent;
import android.widget.FrameLayout;
import ukd.a;
import java.lang.Exception;
import crd.b;
import android.os.Bundle;
import com.kuaishou.krn.delegate.BundleLoadMode;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import mj0.b;
import java.lang.Boolean;
import com.kuaishou.krn.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import android.widget.Toast;
import android.net.Uri;
import java.lang.StringBuilder;
import ek0.d;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kuaishou.krn.KrnInternalManager;
import brd.a0;
import brd.f0;
import com.kuaishou.krn.delegate.d;
import nj0.t;
import com.kuaishou.krn.delegate.f;
import erd.g;
import com.facebook.base.tracing.TracingManager;
import sj0.b;
import lj0.c;
import com.kuaishou.krn.instance.KrnReactInstanceState;
import fk0.a;
import bk0.k;
import java.lang.System;
import java.lang.Long;
import com.kuaishou.krn.log.model.KrnPageFunnelLoadTime;
import com.kwai.kxb.BundleSource;
import com.kuaishou.krn.model.BundleType;
import nj0.v;
import nj0.d;
import android.os.SystemClock;
import hg.a;
import fk0.b;
import lk0.d;
import com.kuaishou.krn.exception.KrnException;
import com.kuaishou.krn.exception.KrnExceptionType;
import java.lang.Enum;
import java.lang.Throwable;
import com.kuaishou.krn.experiment.ExpConfigKt;
import kj0.f;
import kj0.d;
import hj0.c;
import com.kuaishou.krn.instance.JsFramework;
import gu6.b;
import kotlin.jvm.internal.a;
import iu6.a;
import tu6.d;
import ev6.a;
import com.kwai.kxb.LoadType;
import com.kuaishou.krn.delegate.k$a;
import java.util.List;
import java.util.ArrayList;
import ju6.c;
import nj0.w;
import bk0.c;
import java.lang.Integer;
import com.kwai.kxb.update.model.DownloadPriority;
import xu6.j;
import nj0.h;
import com.kuaishou.krn.bundle.preload.f;
import erd.o;
import com.kuaishou.krn.delegate.e;
import nj0.i;
import nj0.e;
import zj0.x;
import zj0.u;
import com.kuaishou.krn.load.JsRuntimeState;
import com.kuaishou.krn.load.a;
import nj0.l;
import nj0.k;
import nj0.r;
import brd.e0;
import erd.c;
import nj0.q;
import com.kuaishou.krn.delegate.h;
import java.lang.Runnable;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.kuaishou.krn.delegate.i;
import nj0.s;
import nj0.n;
import java.lang.Number;
import android.os.Debug$MemoryInfo;
import com.kuaishou.krn.event.a;
import com.kuaishou.krn.event.KrnLifeCycleEvent;
import com.kuaishou.krn.event.KrnLifeCycleEvent$EventType;
import oj0.b;

public class k extends KrnDelegate	// class@000866
{
    public b s;
    public static final int t;

    public void k(m p0,LaunchModel p1,LoadingStateTrack p2,long p3,long p4){
       super(p0, p1, p2, p3, p4);
    }
    public Object h(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KrnDelegate obj = PatchProxy.applyOneRefs(p0, this, k.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.m;
       if (obj == null) {
          p0 = null;
       }else {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "3");
          p0 = (obj1 != patchProxyRe)? obj1: obj.b.get(p0);
       }
       return p0;
    }
    public void n(){
       k ts;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "8")) {
          return;
       }
       KrnReactRootView krnReactRoot = this.g();
       if (PatchProxy.applyVoidOneRefs(krnReactRoot, this, ok, "26") || (c.a().A() && krnReactRoot != null)) {
          try{
             Object[] objArray1 = new Object[]{krnReactRoot.getParent(),this.e};
             a.b("com.kwai.kds.watermark.KrnDebugInfoHandler", "onDestroy", objArray1);
          }catch(java.lang.Exception e2){
             e2.printStackTrace();
          }
       }
    }
    public void w(BundleLoadMode p0){
       boolean b;
       boolean b1;
       a0 uoa0;
       String str2;
       String str6;
       a0 uoa01;
       a0 obj3;
       int b5;
       BundleLoadMode uBundleLoadM;
       String str7;
       LoadType loadType;
       LoadType rEMOTE_FIRST;
       BundleLoadMode this;
       boolean b7;
       KrnReactInstanceState krnReactInst;
       b uob = this;
       String obj = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj, uob, k.class, str)) {
          return;
       }
       KrnDelegate d = uob.d;
       h obj1 = PatchProxy.applyOneRefs(d, null, b.class, str);
       b = false;
       int i = 1;
       if (obj1 != PatchProxyResult.class) {
          b1 = obj1.booleanValue();
       }else if(c.b().j()){
          Bundle uBundle = d.g();
          str2 = "";
          if (TextUtils.equals(str, uBundle.getString("debugMode", str2))) {
             if (!c.a().b()) {
                Toast.makeText(c.b().d(), "命中开发者模式，请打开【RN开发者模式】开关，并重启APP", i).show();
                b1 = true;
             }else {
                str = uBundle.getString("debugServer", str2);
                if (!TextUtils.isEmpty(str)) {
                   str = Uri.parse(str).getAuthority();
                   d.e("解析的debugServer地址为: "+str);
                   if (!TextUtils.isEmpty(str)) {
                      g.a(PreferenceManager.getDefaultSharedPreferences(c.b().d()).edit().putString("debug_http_host", str));
                   }
                }
                c.a().j0(d.b());
             }
          }
       }
       b1 = false;
       if (b1) {
          d.e("bundle加载流程已被拦截掉，请review代码逻辑！");
          return;
       }else {
          String str1 = uob.d.a();
          if (KrnInternalManager.c(str1, uob.d.g())) {
             d.e("enter develop mode");
             if (!PatchProxy.applyVoid(null, uob, k.class, "6")) {
                uoa0 = a0.B(Boolean.TRUE);
                d uod = PatchProxy.apply(null, uob, k.class, "18");
                if (uod != PatchProxyResult.class) {
                }else {
                   uod = new d(uob);
                }
                uob.s = uoa0.g(uod).R(new t(uob), f.b);
             }
             return;
          }else {
             TracingManager.e("KrnFragmentDelegate startLoadBundle");
             a obj2 = PatchProxy.apply(null, uob, k.class, "3");
             if (obj2 != PatchProxyResult.class) {
                b1 = obj2.booleanValue();
             }else {
                krnReactInst = uob.e.i().j();
                str = (krnReactInst != KrnReactInstanceState.READY && (krnReactInst == KrnReactInstanceState.BUSINESS_LOADING || krnReactInst == KrnReactInstanceState.DIRTY))? 1: null;
             }
             boolean b2 = b1;
             obj2 = PatchProxy.apply(null, uob, k.class, "4");
             if (obj2 != PatchProxyResult.class) {
                b1 = obj2.booleanValue();
             }else {
                krnReactInst = uob.e.i().j();
                KrnDelegate krnDelegate = (krnReactInst == KrnReactInstanceState.BUSINESS_LOADING || krnReactInst == KrnReactInstanceState.DIRTY)? 1: null;
             }
             boolean b3 = b1;
             str2 = uob.d.b();
             String str3 = str2;
             String str4 = str2;
             boolean b4 = b3;
             String str5 = str1;
             uoa0 = PatchProxy.applyThreeRefs(str1, str3, p0, this, k.class, "2");
             str1 = "10";
             if (uoa0 != PatchProxyResult.class) {
             label_0189 :
                str6 = str1;
             }else {
                obj2 = uob.e.i().a();
                d = uob.e;
                Objects.requireNonNull(d);
                if (!PatchProxy.applyVoid(null, d, c.class, "22")) {
                   c j = d.j;
                   if (j != null && !PatchProxy.applyVoid(null, j, k.class, "7")) {
                      j.c.setBundleInfoLoadStartTime(Long.valueOf(System.currentTimeMillis()));
                   }
                }
                if (obj2 != null) {
                   d = uob.e;
                   if (obj2.f == BundleSource.PRESET) {
                      b = 1;
                   }
                   BundleType iNTERNAL = (b)? BundleType.INTERNAL: BundleType.DOWNLOADED;
                   d.C(iNTERNAL);
                   uoa0 = a0.B(obj2).r(new v(uob)).p(new d(uob));
                   goto label_0189 ;
                }else {
                   str6 = str1;
                   uoa0 = PatchProxy.applyThreeRefs(str5, str4, p0, this, k.class, "9");
                   if (uoa0 != PatchProxyResult.class) {
                   }else {
                      LoadingStateTrack loadingState1 = uob.e.o();
                      Objects.requireNonNull(loadingState1);
                      if (!PatchProxy.applyVoid(null, loadingState1, LoadingStateTrack.class, "9")) {
                         loadingState1 = loadingState1.k;
                         Objects.requireNonNull(loadingState1);
                         if (!PatchProxy.applyVoid(null, loadingState1, KrnBundleLoadInfo.class, "28")) {
                            loadingState1.j = SystemClock.elapsedRealtime();
                            loadingState1.k = System.currentTimeMillis();
                            if (loadingState1.c != null) {
                               a.b(0, "asset_init", a.e(), 6);
                            }
                         }
                      }
                      if (c.a().l()) {
                         uob.j = d.a(uob.d, null);
                         uoa0 = a0.s(new KrnException(KrnExceptionType.LOAD_BUNDLE_ERROR.name()+", mock bundle load fail !!!"));
                      }else {
                         str = 2;
                         str3 = "11";
                         if (obj != null) {
                            uBundleLoadM = obj;
                         }else {
                            this = BundleLoadMode.LOCAL_FIRST;
                            if (uob.m.b() != this) {
                               uBundleLoadM = uob.m.b();
                            }else {
                               uBundleLoadM = PatchProxy.apply(null, uob, k.class, str3);
                               if (uBundleLoadM != PatchProxyResult.class) {
                               }else {
                                  b obj6 = PatchProxy.apply(null, null, ExpConfigKt.class, "50");
                                  if (obj6 != PatchProxyResult.class) {
                                     b7 = obj6.booleanValue();
                                  }else {
                                     d uod1 = KrnInternalManager.c.a().c();
                                     b7 = (uod1 != null)? uod1.getBoolean("krn_config_cache_enabled", b): false;
                                  }
                                  if (b7) {
                                     obj6 = c.a.a(uob.d.d());
                                     str7 = uob.d.a();
                                     if (obj6.i(str7)) {
                                        a obj7 = PatchProxy.applyOneRefs(str7, obj6, b.class, "31");
                                        if (obj7 != PatchProxyResult.class) {
                                           b = obj7.booleanValue();
                                        }else {
                                           a.p(str7, "bundleId");
                                           obj7 = obj6.h(str7);
                                           obj = "bundle ";
                                           if (obj7 == null) {
                                              b.n(obj6, obj+str7+" can not be found in local cache, app is not changed", null, str, null);
                                           }else {
                                              long l = obj7.c().f();
                                              if (!l - null) {
                                                 b.n(obj6, obj+str7+" do not have installAppVersion, app is changed", null, str, null);
                                              }else if(!l - a.c.a()){
                                                 b.n(obj6, obj+str7+" installAppVersion is equal to app version, app is not changed", null, str, null);
                                              }
                                              b = true;
                                           }
                                        }
                                        if (b) {
                                           d.e(str7+" has newer bundle on network, and app version is changed, use remote first");
                                           uBundleLoadM = BundleLoadMode.REMOTE_FIRST;
                                        }
                                     }
                                  }
                                  uBundleLoadM = this;
                               }
                            }
                         }
                         if (uob.e.y()) {
                            LoadingStateTrack loadingState2 = uob.e.o();
                            str7 = uBundleLoadM.name();
                            Objects.requireNonNull(loadingState2);
                            if (!PatchProxy.applyVoidOneRefs(str7, loadingState2, LoadingStateTrack.class, str3)) {
                               loadingState2.k.n = str7;
                            }
                         }
                         Integer obj4 = PatchProxy.applyOneRefs(uBundleLoadM, uob, k.class, str6);
                         if (obj4 != PatchProxyResult.class) {
                            loadType = obj4;
                         }else {
                            b5 = k$a.a[uBundleLoadM.ordinal()];
                            if (b5 != 1) {
                               rEMOTE_FIRST = (b5 != str)? LoadType.REMOTE_FIRST: LoadType.LOCAL_FIRST;
                            }else {
                               rEMOTE_FIRST = LoadType.LOCAL_ONLY;
                            }
                            loadType = rEMOTE_FIRST;
                         }
                         str3 = str4;
                         ArrayList uArrayList = PatchProxy.applyOneRefs(str3, uob, k.class, "12");
                         if (uArrayList != PatchProxyResult.class) {
                         }else {
                            uArrayList = new ArrayList();
                            w ow = PatchProxy.applyOneRefs(str3, uob, k.class, "13");
                            if (ow != PatchProxyResult.class) {
                            }else {
                               ow = new w(uob, str3);
                            }
                            uArrayList.add(ow);
                         }
                         Object obj5 = uArrayList;
                         c uoc = new c(uob.e);
                         b uob2 = c.a.a(uob.d.d());
                         obj4 = PatchProxy.apply(null, uob, KrnDelegate.class, "40");
                         if (obj4 != PatchProxyResult.class) {
                         }else {
                            obj4 = Integer.valueOf(uob.d.i());
                         }
                         uoa0 = uob2.j(str5, obj4.intValue(), DownloadPriority.High, loadType, obj5, uoc).r(new h(uob)).C(f.b).g(new e(uob)).r(new i(uob)).p(new e(uob));
                      }
                   }
                }
             }
             if (PatchProxy.isSupport(k.class)) {
                uoa01 = PatchProxy.applyTwoRefs(Boolean.valueOf(b2), Boolean.TRUE, uob, k.class, "16");
                if (uoa01 != PatchProxyResult.class) {
                label_04bd :
                   uoa0 = a0.g0(uoa0, uoa01, new r(uob));
                   q oq = new q(uob);
                   if (PatchProxy.isSupport(k.class)) {
                      obj1 = PatchProxy.applyTwoRefs(Boolean.valueOf(b4), oq, uob, k.class, "17");
                      if (obj1 != PatchProxyResult.class) {
                      label_04e7 :
                         uoa0 = uoa0.g(obj1).G(a.c());
                         i oi = PatchProxy.apply(null, uob, k.class, "19");
                         if (oi != PatchProxyResult.class) {
                         }else if(PatchProxy.applyVoid(null, uob, KrnDelegate.class, "15")){
                            d = uob.d;
                            Objects.requireNonNull(d);
                            obj3 = PatchProxy.apply(null, d, LaunchModel.class, str6);
                            if (obj3 != PatchProxyResult.class) {
                               b5 = obj3.booleanValue();
                            }else {
                               boolean b6 = true;
                               b5 = d.o("enableLoading", b6) ^ b6;
                            }
                            if (!b5) {
                               uob.b.fc();
                            }
                         }
                         oi = i.b;
                         uob.s = uoa0.g(oi).R(new s(uob), new n(uob, str5));
                         return;
                      }
                   }
                   obj1 = new h(uob, b4, oq);
                   goto label_04e7 ;
                }
             }
             LoadingStateTrack loadingState = uob.e.o();
             Objects.requireNonNull(loadingState);
             if (!PatchProxy.applyVoid(null, loadingState, LoadingStateTrack.class, "26")) {
                loadingState = loadingState.k;
                Objects.requireNonNull(loadingState);
                if (!PatchProxy.applyVoid(null, loadingState, KrnBundleLoadInfo.class, "44")) {
                   loadingState.C = SystemClock.elapsedRealtime();
                   loadingState.D = System.currentTimeMillis();
                }
             }
             uob.e.k().i();
             d.e("[perfOpt]setPrepareJSRuntimeStart: ");
             b uob1 = uob.e.i();
             obj3 = (b2)? a0.B(JsRuntimeState.STARTED): a.d(uob1);
             uoa01 = obj3.r(new l(uob, uob1, true)).p(new k(uob, uob1));
             goto label_04bd ;
          }
       }
    }
    public final void y(){
       a uoa;
       KrnDelegate td;
       KrnBundleLoadInfo krnBundleLoa;
       Object obj;
       long l;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "20")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "22")) {
          try{
             this.b.Lc();
             KrnReactRootView krnReactRoot = this.g();
             if (krnReactRoot != null) {
                int i = 0;
                krnReactRoot.setVisibility(i);
                String str = "addKrnWaterMark";
                if (!PatchProxy.applyVoidOneRefs(krnReactRoot, this, ok, "25") && c.a().A()) {
                   try{
                      Object[] objArray1 = new Object[]{krnReactRoot.getParent(),this.e};
                      a.b("com.kwai.kds.watermark.KrnDebugInfoHandler", str, objArray1);
                   }catch(java.lang.Exception e5){
                      d.c(str, e5);
                   }
                }
             }
          }catch(java.lang.Exception e0){
             d.c("addMemoryProfileButton", e0);
          }
       }
    }
}
