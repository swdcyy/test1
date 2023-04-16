package com.kuaishou.commercial.k;
import nl9.p;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import qrd.l1;
import java.lang.String;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Class;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import f3b.u;
import p49.c;
import p49.f;
import p49.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import cw.l;
import p49.a;
import java.lang.Throwable;
import yx.j0;
import com.kwai.framework.init.a;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.photoad.download.PhotoAdAPKDownloadManagerInitModule;
import nq8.a;
import com.kuaishou.commercial.d;
import java.util.Objects;
import sq8.g;
import com.tachikoma.template.manage.template.TemplateException;
import nq8.c;
import pq8.f;
import pq8.d;
import android.content.Context;
import oq8.j;
import oq8.h$a;
import android.app.Application;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import o35.b;
import ay.a;
import ay.c;
import com.yxcorp.utility.SystemUtil;
import java.lang.Boolean;
import android.os.HandlerThread;
import o35.a;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.adclient.kscommerciallogger.LogCache;
import com.kwai.adclient.kscommerciallogger.LogCache$a;
import java.lang.Enum;
import com.kwai.adclient.kscommerciallogger.LogCache$SubType;
import com.kwai.adclient.kscommerciallogger.RTLogCache;
import com.kwai.adclient.kscommerciallogger.RTLogCache$a;
import p35.b;
import com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager;
import com.kuaishou.commercial.k$a;
import wkd.b;
import rw.a;
import rw.d;
import nq8.c$b;
import x49.m;
import x49.r;
import com.kuaishou.commercial.f;
import x49.t;
import o56.a;
import com.kuaishou.commercial.e;
import o56.c;
import pq8.a$a;
import oq8.g;
import oq8.l;
import oq8.k;
import nq8.c$a;
import sq8.b;
import sq8.f;
import pq8.p;
import pq8.k;
import pq8.a;
import com.kuaishou.commercial.h;
import java.lang.Runnable;
import ekd.k1;
import qe6.b;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;
import oe6.b;
import nw.d;
import nw.b;
import ekd.s1;
import lnc.g;
import android.content.IntentFilter;
import com.yxcorp.gifshow.ad.detail.AppInstalledReceiver;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import kp.b;
import com.kuaishou.commercial.i;
import msd.l;

public class k implements p	// class@0014f0
{
    public d b;

    public void k(){
       super();
    }
    public static l1 n(BaseFeed p0){
       if (p0.get("AD") != null) {
          return null;
       }
       CommonMeta uCommonMeta = p0.a(CommonMeta.class);
       if (uCommonMeta != null) {
          uCommonMeta = uCommonMeta.mFeedLogCtx;
          if (uCommonMeta != null) {
             StidContainerProto$StidContainer stidContaine = u.c(uCommonMeta.stidContainer);
             f uof = e.a(c.o);
             if (stidContaine != null && (!TextUtils.isEmpty(stidContaine.stAdId) && uof.c())) {
                String[] stringArray = (stidContaine.stAdId).split("\\|");
                if (stringArray.length > 0) {
                   String str = new JSONObject(stringArray[(stringArray.length - 1)]).optString("ad_id");
                   if (TextUtils.isEmpty(str)) {
                      return null;
                   }else {
                      stringArray = str.split("_");
                      if (stringArray.length != 2) {
                         return null;
                      }else {
                         uof.g(new l(stringArray, stidContaine));
                      }
                   }
                }
             }
          }
       }
       return null;
    }
    public a CR(){
       Object obj = PatchProxy.apply(null, this, k.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PhotoAdAPKDownloadManagerInitModule();
    }
    public final void F(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("AdTachikomaPreload", "preload tk ad template", objArray);
       a uoa = a.a();
       d uod = new d(this);
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(uod, uoa, a.class, "3")) {
          String str = "ADTKTemplateApi";
          g.d(str, "check update style templates");
          if (uoa.b == null) {
             g.c(str, "", new TemplateException("checkUpdate must be initialized").setErrorType("init"));
          }else {
             uoa = uoa.a;
             c e = uoa.e;
             c b = uoa.b;
             if (!PatchProxy.applyVoidThreeRefs(e, uod, b, null, f.class, "1")) {
                uod.a(new d(e, b));
             }
          }
       }
       return;
    }
    public void Lm(Application p0){
       JsonObject jsonObject;
       boolean b;
       b uob2;
       LogCache f;
       Object obj = this;
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, obj, ok, "2")) {
          return;
       }
       int i = 0;
       int i1 = a.t().a("adLogTraceUser", i);
       if (i1) {
          jsonObject = new JsonObject();
          jsonObject.a0("focus_user", Integer.valueOf(i1));
       }else {
          jsonObject = null;
       }
       b uob = b.g();
       a uoa = new a();
       c uoc = new c();
       b = SystemUtil.I();
       Objects.requireNonNull(uob);
       b uob1 = b.class;
       if (PatchProxy.isSupport(uob1)) {
          uob2 = uob1;
          if (!PatchProxy.applyVoidFourRefs(uoa, uoc, jsonObject, Boolean.valueOf(b), uob, b.class, "2")) {
          label_0068 :
             int i2 = 4;
             int i3 = 5;
             int i4 = 3;
             int i5 = 2;
             if (PatchProxy.isSupport(uob2)) {
                Object[] objArray = new Object[i3];
                objArray[i] = uoa;
                objArray[1] = uoc;
                objArray[i5] = jsonObject;
                objArray[i4] = Boolean.valueOf(b);
                objArray[i2] = Boolean.TRUE;
                if (!PatchProxy.applyVoid(objArray, uob, uob2, "3")) {
                }
             }else if(uob.i != null){
                uob.a = uoa;
                uob.b = uoc;
                uob.c = jsonObject;
                uob.d = b;
                uob.e = true;
                HandlerThread handlerThrea = new HandlerThread("KSCommercialLogger");
                handlerThrea.start();
                uob.k = new a(uob, handlerThrea.getLooper());
                Iterator iterator = uob.f.iterator();
                String str = "1";
                while (iterator.hasNext()) {
                   LogCache logCache = iterator.next();
                   logCache.g = uob;
                   if (PatchProxy.applyVoid(null, logCache, LogCache.class, str) || logCache.g == null) {
                      continue ;
                   }else {
                      int i6 = LogCache$a.a[logCache.a.ordinal()];
                      if (i6 != 1) {
                         if (i6 != i5) {
                            if (i6 != i4) {
                               if (i6 != i2) {
                                  if (i6 != i3) {
                                     continue ;
                                  }else {
                                     f = logCache.f;
                                     if (f == LogCache$SubType.CA) {
                                        logCache.g.d(logCache.b, logCache.c, logCache.d);
                                     }else if(f == LogCache$SubType.CT){
                                        logCache.g.c(logCache.b, logCache.c, logCache.e);
                                     }else {
                                        logCache.g.e(logCache.b, logCache.e, logCache.d);
                                     }
                                  }
                               }else if(logCache.f == LogCache$SubType.CA){
                                  logCache.g.u(logCache.b, logCache.c, logCache.d);
                               }else {
                                  logCache.g.t(logCache.b, logCache.c, logCache.e);
                               }
                            }else if(logCache.f == LogCache$SubType.CA){
                               logCache.g.i(logCache.b, logCache.c, logCache.d);
                            }else {
                               logCache.g.h(logCache.b, logCache.c, logCache.e);
                            }
                         }else if(logCache.f == LogCache$SubType.CA){
                            logCache.g.b(logCache.b, logCache.c, logCache.d);
                         }else {
                            logCache.g.a(logCache.b, logCache.c, logCache.e);
                         }
                      }else if(logCache.f == LogCache$SubType.CA){
                         logCache.g.s(logCache.b, logCache.c, logCache.d);
                      }else {
                         logCache.g.r(logCache.b, logCache.c, logCache.e);
                      }
                   }
                }
                iterator = uob.g.iterator();
                while (iterator.hasNext()) {
                   RTLogCache rTLogCache = iterator.next();
                   rTLogCache.e = uob.b;
                   if (PatchProxy.applyVoid(null, rTLogCache, RTLogCache.class, str) || rTLogCache.e == null) {
                      continue ;
                   }else {
                      i2 = RTLogCache$a.a[rTLogCache.a.ordinal()];
                      if (i2 != 1) {
                         if (i2 != i5) {
                            if (i2 != i4) {
                               continue ;
                            }
                         }else {
                            rTLogCache.e.a(rTLogCache.c, rTLogCache.d);
                         }
                      }else {
                         rTLogCache.e.logCustomEvent(rTLogCache.c, rTLogCache.d);
                      }
                   }
                   rTLogCache.e.b(rTLogCache.b, rTLogCache.c, rTLogCache.d);
                }
                uob.f.clear();
                uob.g.clear();
                uob.i = true;
             }
          }
       }else {
          uob2 = uob1;
          int i7 = 1;
          goto label_0068 ;
       }
       SegmentManager.Instance.init(a.t().a("ksCommercialLogSnapshotConfig", i), SystemUtil.I());
       b.a(0xc5bd719).b(new k$a(obj, "ad_scenarized_interpreter"));
       if (!PatchProxy.applyVoid(null, obj, ok, "7")) {
          c$b uob3 = new c$b();
          uob3.d = new m();
          uob3.b = new r();
          uob3.a = f.a;
          uob3.c = new t();
          uob3.e = a.b();
          uob3.f = e.a;
          uob3.g = a.a().c();
          a uoa1 = a.a();
          c uoc1 = PatchProxy.apply(null, uob3, c$b.class, "1");
          if (uoc1 != PatchProxyResult.class) {
          }else {
             c uoc2 = new c(uob3.d, uob3.c, uob3.b, uob3.a, uob3.e, uob3.f, uob3.g, null);
          }
          _monitor_enter(uoa1);
          if (PatchProxy.applyVoidOneRefs(uoc1, uoa1, a.class, "2")) {
             _monitor_exit(uoa1);
          }else if(uoa1.b == null){
             uoa1.a = uoc1;
             g.a = uoc1.c;
             b.f = uoc1.d;
             f.a = uoc1.f;
             p op = p.e();
             Objects.requireNonNull(op);
             op.b = uoc1.e;
             op.c = uoc1.b;
             ok = k.d();
             Objects.requireNonNull(ok);
             ok.b = uoc1.e;
             ok.c = uoc1.b;
             ok.d = uoc1.g;
             a.a().a = uoc1.a;
             uoa1.b = true;
          }
          _monitor_exit(uoa1);
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void k(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "13")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "3")) {
          k1.r(new h(this), 0x2710);
       }
       return;
    }
    public void onForeground(){
       k ok = k.class;
       String str = "1";
       if (PatchProxy.applyVoid(null, this, ok, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, ok, "8") && (SystemUtil.L(a.B) && (b.a() && (f.b("enableUploadClipboardMsg", Boolean.class, Boolean.FALSE).booleanValue() && !TextUtils.isEmpty(b.I()))))) {
          if (this.b == null) {
             this.b = new d();
          }
          k tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, d.class, str)) {
             s1.d(new b(tb));
          }
       }
    label_0064 :
       if (!PatchProxy.applyVoid(null, this, ok, "9")) {
          g.a();
       }
       return;
    }
    public void tO(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "10")) {
          return;
       }
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
       intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
       intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
       intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
       intentFilter.addDataScheme("package");
       UniversalReceiver.e(p0, new AppInstalledReceiver(), intentFilter);
       return;
    }
    public void te(Context p0,RequestTiming p1){
    }
    public void v5(){
       if (PatchProxy.applyVoid(null, this, k.class, "11")) {
          return;
       }
       b.b.b(i.b);
       return;
    }
}
