package com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol;
import rx.d;
import com.google.gson.JsonObject;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$a;
import nsd.u;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Object;
import o56.a;
import java.lang.StringBuilder;
import yx.j0;
import vx.b;
import kotlin.jvm.internal.a;
import android.util.LruCache;
import mxb.j;
import kotlin.Pair;
import erd.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import msd.l;
import java.lang.Number;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$c;
import rx.d$b;
import erd.o;
import wkd.b;
import yx.i0;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Boolean;
import com.yxcorp.gifshow.ad.AdProcess;
import android.view.View;
import rx.b;
import com.yxcorp.gifshow.ad.report.monitor.DynamicMonitorFactory;
import cm9.a;
import wx.a;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$e;
import vx.a;
import android.os.SystemClock;
import java.lang.Math;
import java.lang.Long;
import java.util.Set;
import nx8.g;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess;
import com.yxcorp.gifshow.ad.AdMainProcess;
import java.lang.Float;
import o49.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.google.gson.JsonElement;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$b;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import q35.c$a;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import q35.d;
import q35.c;
import o56.c;
import com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager;
import com.kwai.adclient.kscommerciallogger.snapshot.Span;
import zk.g;
import java.lang.CharSequence;
import zsd.u;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import g59.f;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$d;
import java.util.Objects;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$logActionByAdFull$sharedData$1;
import mxb.f0;
import mxb.j0;
import mxb.i0;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$performConvertReport$shared$1;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$f;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$g;
import crd.b;

public class HbBaseProtocol implements d	// class@0014ec
{
    public static final JsonObject b;
    public static final b c;
    public static final b d;
    public static final LruCache e;
    public static final LruCache f;
    public static final HbBaseProtocol$a g;

    static {
       HbBaseProtocol$a uoa = new HbBaseProtocol$a(null);
       HbBaseProtocol.g = uoa;
       JsonObject value = a.t().getValue("hornbillLogRate", JsonObject.class, new JsonObject());
       HbBaseProtocol.b = value;
       JsonObject value1 = a.t().getValue("hornbillActionTypeConfig", JsonObject.class, new JsonObject());
       if (a.d()) {
          Object[] objArray = new Object[0];
          j0.a("ad_hornbill", "behaviorConfigs = "+value1+",hbSceneConfig = "+value, objArray);
       }
       a.o(value1, "behaviorConfigs");
       HbBaseProtocol.c = new b(uoa.a(value1, "impression"));
       HbBaseProtocol.d = new b(uoa.a(value1, "convert"));
       HbBaseProtocol.e = new LruCache(10);
       HbBaseProtocol.f = new LruCache(20);
    }
    public void HbBaseProtocol(){
       super();
    }
    public static d r(HbBaseProtocol p0,j p1,int p2,String p3,Pair p4,g p5,int p6,Object p7){
       g og = (p6 & 0x10)? null: p5;
       return p0.q(p1, p2, p3, null, og);
    }
    public PresenterV2 D1(int p0){
       if (PatchProxy.isSupport2(HbBaseProtocol.class, "39")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, HbBaseProtocol.class, "39");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PatchProxy.onMethodExit(HbBaseProtocol.class, "39");
       return new PresenterV2();
    }
    public void F1(BaseFeed p0,String p1,l p2,Integer p3,g p4){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       HbBaseProtocol hbBaseProtoc = HbBaseProtocol.class;
       if (PatchProxy.isSupport(hbBaseProtoc)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, hbBaseProtoc, "35")) {
             return;
          }
       }
       a.p(p0, "baseFeed");
       a.p(oobject1, "scene");
       a.p(oobject2, "convert");
       Object obj = oobject2.invoke(p0);
       if (p3 != null) {
          HbBaseProtocol$c uoc = new HbBaseProtocol$c(this, obj, p4, p0, p1);
          HbBaseProtocol$c uoc1 = v7;
          d$b.c(this, p3.intValue(), p0, p1, null, uoc1, 8, 0);
       }
       if (this.o(p0)) {
          return;
       }else {
          this.u(p0, oobject1, 0);
          return;
       }
    }
    public d H0(int p0,BaseFeed p1,String p2,Pair p3,o p4){
       HbBaseProtocol hbBaseProtoc = HbBaseProtocol.class;
       if (PatchProxy.isSupport(hbBaseProtoc)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, hbBaseProtoc, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "baseFeed");
       a.p(p2, "scene");
       j oj = b.a(0x1d6683e9).c(p1);
       a.o(oj, "wrapper");
       return this.s(oj, p0, p2, p3, p4);
    }
    public d L0(BaseFeed p0,String p1,Pair p2,g p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, HbBaseProtocol.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       return this.z0(1, p0, p1, p2, p3);
    }
    public int S(Activity p0,AdDataWrapper p1,String p2,boolean p3,Integer p4,g p5){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       HbBaseProtocol hbBaseProtoc = HbBaseProtocol.class;
       if (PatchProxy.isSupport(hbBaseProtoc)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Boolean.valueOf(p3),p4,p5};
          Object obj = PatchProxy.apply(objArray, this, hbBaseProtoc, "34");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "activity");
       a.p(p1, "adDataWrapper");
       a.p(oobject2, "scene");
       if (p4 != null) {
          j adLogWrapper = p1.getAdLogWrapper();
          a.o(adLogWrapper, "adDataWrapper.adLogWrapper");
          HbBaseProtocol.r(this, adLogWrapper, p4.intValue(), p2, null, p5, 8, null);
       }
       this.u(p1.getPhoto(), oobject2, 1);
       return this.b(p0, p1, p3).m();
    }
    public final b T0(BaseFeed p0,String p1,View p2,boolean p3){
       String obj;
       if (PatchProxy.isSupport(HbBaseProtocol.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, HbBaseProtocol.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       obj = this.g(p1);
       Object[] objArray = new Object[0];
       j0.a("ad_hornbill", "do inject: baseFeed = "+p0.getId()+", scene = "+obj, objArray);
       b uob = null;
       if (!this.p(p1) && !this.o(p0)) {
          this.v(p0, obj, 0);
          if (p2 != null) {
             uob = new a(DynamicMonitorFactory.c.b(p0, obj, p2), p3);
          }
       }
       return uob;
    }
    public d X0(BaseFeed p0,String p1,g p2,int p3,int p4){
       HbBaseProtocol hbBaseProtoc = HbBaseProtocol.class;
       if (PatchProxy.isSupport(hbBaseProtoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, hbBaseProtoc, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       return d$b.c(this, 2, p0, p1, null, new HbBaseProtocol$e(p3, p4, p2), 8, null);
    }
    public final void a(BaseFeed p0,String p1,int p2,JsonObject p3){
       long l;
       int i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(HbBaseProtocol.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, HbBaseProtocol.class, "22")) {
          return;
       }
       int i = HbBaseProtocol.g.b(p2, p1);
       if (p2 > 0) {
          p3.a0("log_type", Integer.valueOf(i));
       }
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, HbBaseProtocol.class, "6");
       if (obj != patchProxyRe) {
       }else {
          obj = HbBaseProtocol.f.get(this.i(p0, p1));
       }
       if (obj != null) {
          int i1 = 0;
          if (PatchProxy.isSupport(HbBaseProtocol.class)) {
             p0 = PatchProxy.applyThreeRefs(Integer.valueOf(p2), p1, obj, this, HbBaseProtocol.class, "23");
             if (p0 != patchProxyRe) {
                l = p0.longValue();
             label_00bd :
                p3.a0("event_duration_ms", Long.valueOf(Math.max(l, 0)));
                if (PatchProxy.isSupport(HbBaseProtocol.class)) {
                   l = PatchProxy.applyThreeRefs(Integer.valueOf(i), obj, Integer.valueOf(p2), this, HbBaseProtocol.class, "24");
                   if (l != patchProxyRe) {
                      i2 = l.intValue();
                   label_011f :
                      p3.a0("is_multi", Integer.valueOf(i2));
                      obj.e().add(Integer.valueOf(p2));
                   }
                }
                i2 = 1;
                if (i != i2) {
                   if (i != 2) {
                      if (obj.e().contains(Integer.valueOf(p2))) {
                      label_011d :
                         i1 = 1;
                      }
                   }else {
                      obj.e = obj.a() + i2;
                      if (obj.a() > i2) {
                         goto label_011d ;
                      }
                   }
                }else {
                   obj.d = obj.b() + i2;
                   if (obj.b() > i2) {
                      goto label_011d ;
                   }
                }
                i2 = i1;
                goto label_011f ;
             }
          }
          long l1 = SystemClock.elapsedRealtime();
          if (HbBaseProtocol.c.a(p2, p1)) {
             obj.b = l1;
             l = obj.d();
          }else {
             l = obj.c();
          }
          l = l1 - l;
          Object[] objArray = new Object[i1];
          j0.a("ad_hornbill", "fillBehaviorInfo,actionType = "+p2+", duration = "+l+','+"injectTime = "+obj.d()+",impressionTime = "+obj.c(), objArray);
          goto label_00bd ;
       }
       return;
    }
    public final AdProcess b(Activity p0,AdDataWrapper p1,boolean p2){
       if (PatchProxy.isSupport(HbBaseProtocol.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, HbBaseProtocol.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "adDataWrapper");
       AdNonActionbarProcess uAdNonAction = (p2)? g.a.b(p0, p1): g.a.a(p0, p1);
       return uAdNonAction;
    }
    public final JsonObject c(String p0,String p1,float p2,BaseFeed p3){
       JsonObject obj;
       if (PatchProxy.isSupport(HbBaseProtocol.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), p3, this, HbBaseProtocol.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new JsonObject();
       obj.c0("session", p0);
       obj.c0("event", p1);
       obj.a0("ratio", Float.valueOf(p2));
       int i = (!p2)? 0: (int)(0x3f800000 / p2);
       obj.a0("ratio_count", Integer.valueOf(i));
       if (p3 != null) {
          JsonObject jsonObject = new JsonObject();
          g.a.e(jsonObject, new QPhoto(p3));
          obj.G("feed", jsonObject);
       }
       return obj;
    }
    public final t d(BaseFeed p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, HbBaseProtocol.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       t ot = t.just(p0).observeOn(d.c).map(new HbBaseProtocol$b(this, p1));
       a.o(ot, "Observable.just\(baseFeed¡­\(feed, realScene\)\n      }");
       return ot;
    }
    public final JsonObject e(String p0,BaseFeed p1,String p2,int p3,l p4){
       String obj;
       float f1;
       float f2;
       int i = 2;
       if (PatchProxy.isSupport(HbBaseProtocol.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, HbBaseProtocol.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray1 = new Object[0];
       j0.a("ad_hornbill", "hornbillEventReport >>> "+p0, objArray1);
       if (this.p(p2)) {
          return new JsonObject();
       }else if(a.g("convert", p0)){
          p3 = 2;
       }else {
          p3 = HbBaseProtocol.g.b(p3, p2);
       }
       float f = 0x3f800000;
       if (PatchProxy.isSupport(HbBaseProtocol.class)) {
          obj = PatchProxy.applyTwoRefs(p2, Integer.valueOf(p3), this, HbBaseProtocol.class, "27");
          if (obj != PatchProxyResult.class) {
             f1 = obj.floatValue();
          label_00b0 :
             JsonObject jsonObject = this.c(p2, p0, f1, p1);
             JsonObject jsonObject1 = new JsonObject();
             p4.invoke(jsonObject1);
             Set set = jsonObject1.entrySet();
             a.o(set, "json.entrySet\(\)");
             Iterator iterator = set.iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                obj = uEntry.getKey();
                jsonObject.G(obj, uEntry.getValue());
             }
             c$a uoa = c$a.b();
             uoa.d(BusinessType.OTHER);
             uoa.g(SubBusinessType.OTHER);
             uoa.i(d.b);
             uoa.e("ad_ks_hornbill");
             uoa.h("ad_hornbill");
             uoa.f(jsonObject);
             c uoc = uoa.a();
             if (PatchProxy.isSupport(HbBaseProtocol.class)) {
                uoa = PatchProxy.applyOneRefs(Float.valueOf(f1), this, HbBaseProtocol.class, "31");
                if (uoa != PatchProxyResult.class) {
                   f2 = uoa.floatValue();
                label_0132 :
                   a.o(uoc, "rtLog");
                   j0.h(f2, uoc);
                   return jsonObject1;
                }
             }
             c uoc1 = a.a();
             a.o(uoc1, "AppEnv.get\(\)");
             if (!uoc1.c()) {
                f = f1;
             }
             f2 = f;
             goto label_0132 ;
          }
       }
       f1 = (p3 == i)? Math.max(this.l(p2, "convertRatio"), f): 0x3f800000;
       float f3 = this.l(p2, "APMRate") * f1;
       Object[] objArray2 = new Object[0];
       j0.a("ad_hornbill", "get factor = "+f1+", ratio = "+f3, objArray2);
       f1 = f3;
       goto label_00b0 ;
    }
    public final void f(BaseFeed p0,String p1,String p2,JsonObject p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, HbBaseProtocol.class, "28")) {
          return;
       }
       Span span = SegmentManager.Instance.loadSpan(String.valueOf(this.j(p0)), p1, p2);
       Set set = p3.entrySet();
       a.o(set, "extra.entrySet\(\)");
       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue() instanceof g) {
             uEntry = uEntry.getValue();
             a.o(uEntry, "item.value");
             span.d(uEntry.getKey(), uEntry.w());
          }else {
             span.d(uEntry.getKey(), uEntry.getValue().toString());
          }
       }
       return;
    }
    public final String g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HbBaseProtocol.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (p0 == null || u.S1(p0))? 1: 0;
       if (obj) {
          p0 = this.k();
       }
       return p0;
    }
    public d g0(BaseFeed p0,String p1,Pair p2,g p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, HbBaseProtocol.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       return this.z0(10, p0, p1, p2, p3);
    }
    public final int h(){
       g obj = PatchProxy.apply(null, this, HbBaseProtocol.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.m("default", "snapshotInterval");
       int i = (obj != null)? obj.p(): 300;
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       int i1 = (uoc.c())? 60: i;
       Object[] objArray = new Object[0];
       j0.a("ad_hornbill", "getDefaultSnapshotInterval,config interval = "+i+",interval = "+i1, objArray);
       return i1;
    }
    public final String i(BaseFeed p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, HbBaseProtocol.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j(p0)+'_'+p1;
    }
    public final long j(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HbBaseProtocol.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (p0 != null)? f.a(p0, k.A(p0)): (long)(this.k()).hashCode() + 0x120e217;
       return l;
    }
    public String k(){
       return "undefined";
    }
    public final float l(String p0,String p1){
       float f;
       g obj = PatchProxy.applyTwoRefs(p0, p1, this, HbBaseProtocol.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.m(p0, p1);
       if (obj == null) {
          obj = this.m("default", p1);
          if (obj == null) {
             f = 0.00f;
          label_002a :
             Object[] objArray = new Object[0];
             j0.a("ad_hornbill", "getHbSceneRate,scene = "+p0+", key = "+p1+", value = "+f, objArray);
             return f;
          }
       }
       f = obj.n();
       goto label_002a ;
    }
    public final g m(String p0,String p1){
       JsonElement obj = PatchProxy.applyTwoRefs(p0, p1, this, HbBaseProtocol.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = HbBaseProtocol.b.e0(p0);
       g og = (obj != null)? obj.r().r0(p1): null;
       Object[] objArray = new Object[0];
       j0.a("ad_hornbill", "getValueFromConfig,scene = "+p0+", key = "+p1+", value = "+og, objArray);
       return og;
    }
    public d n(int p0,j p1,String p2,Pair p3,o p4){
       HbBaseProtocol hbBaseProtoc = HbBaseProtocol.class;
       if (PatchProxy.isSupport(hbBaseProtoc)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, hbBaseProtoc, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "adLogWrapper");
       a.p(p2, "scene");
       return this.s(p1, p0, p2, p3, p4);
    }
    public final boolean o(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HbBaseProtocol.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (k.A(p0) == null)? true: false;
       return b;
    }
    public final boolean p(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HbBaseProtocol.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.g("undefined", p0);
    }
    public final d q(j p0,int p1,String p2,Pair p3,g p4){
       HbBaseProtocol hbBaseProtoc = HbBaseProtocol.class;
       if (PatchProxy.isSupport(hbBaseProtoc)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, hbBaseProtoc, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "wrapper");
       a.p(p2, "scene");
       o oo = (p4 == null)? null: new HbBaseProtocol$d(p4);
       this.s(p0, p1, p2, p3, oo);
       return this;
    }
    public d q0(BaseFeed p0,String p1,g p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HbBaseProtocol.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       return d$b.c(this, 11, p0, p1, null, p2, 8, null);
    }
    public final d s(j p0,int p1,String p2,Pair p3,o p4){
       StringBuilder obj1;
       boolean b;
       Object[] objArray1;
       boolean b1;
       JsonObject this;
       Object obj = this;
       object oobject = p0;
       int i = p1;
       object oobject1 = p2;
       object oobject2 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HbBaseProtocol hbBaseProtoc = HbBaseProtocol.class;
       int i1 = 1;
       int i2 = 0;
       if (PatchProxy.isSupport(hbBaseProtoc)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),oobject1,p3,oobject2};
          obj1 = PatchProxy.apply(objArray, obj, hbBaseProtoc, "19");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = PatchProxy.applyOneRefs(oobject, obj, hbBaseProtoc, "32");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(oobject == null || p0.b() == null){
          b = true;
       }else {
          b = false;
       }
       String str = "logAction : actionType = ";
       if (b) {
          objArray1 = new Object[i2];
          j0.c("ad_hornbill", str+i+", wrapper is invalid.", objArray1);
          return obj;
       }else if(obj.o(p0.b())){
          objArray1 = new Object[i2];
          j0.l("ad_hornbill", str+i+",llsid = "+obj.j(p0.b())+",is an invalid AdFeed.", objArray1);
          this.t(p0, p1);
          return obj;
       }else {
          String str1 = obj.g(oobject1);
          obj1 = str+i+", scene = "+str1+", baseFeed id = ";
          BaseFeed uBaseFeed = p0.b();
          str = (uBaseFeed != null)? uBaseFeed.getId(): null;
          Object[] objArray2 = new Object[i2];
          j0.a("ad_hornbill", obj1+str, objArray2);
          BaseFeed obj2 = PatchProxy.applyOneRefs(str1, obj, hbBaseProtoc, "21");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(u.S1(str1) ^ i1){
             HbBaseProtocol$a g = HbBaseProtocol.g;
             Objects.requireNonNull(g);
             Object obj3 = PatchProxy.applyOneRefs(str1, g, HbBaseProtocol$a.class, "2");
             if (obj3 != patchProxyRe) {
                b1 = obj3.booleanValue();
             }else {
                a.p(str1, "adAnchor");
                b1 = false;
             }
             if (b1) {
                b1 = true;
             }
          }
          b1 = false;
          if (b1) {
             BaseFeed uBaseFeed1 = p0.b();
             a.o(uBaseFeed1, "wrapper.baseFeed");
             obj.v(uBaseFeed1, str1, i1);
          }
          this = this.e("log", p0.b(), str1, p1, new HbBaseProtocol$logActionByAdFull$sharedData$1(obj, i, oobject, str1));
          if (!i) {
             Object[] this1 = new Object[i2];
             j0.a("ad_hornbill", "logAction : actionType is invalid!", this1);
             return obj;
          }else if(!obj.p(oobject1)){
             obj2 = -1;
             if (i != i1 && (i != 2 && (i != 10 && i != 11))) {
                i1 = -1;
             }
          label_0152 :
             if (i1 > obj2) {
                obj.f(p0.b(), str1, "log", this);
             }
          }
          if (oobject2 != null) {
             Boolean this2 = oobject2.apply(oobject);
             if (this2 != null) {
                i2 = this2.booleanValue();
             }
          }
          if (p3 != null) {
             b.a(-762347696).r1(p0.b(), p3.getFirst(), p3.getSecond());
          }
          if (!i2) {
             this.t(p0, p1);
          }
          return obj;
       }
    }
    public void t(j p0,int p1){
       HbBaseProtocol hbBaseProtoc = HbBaseProtocol.class;
       if (PatchProxy.isSupport(hbBaseProtoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, hbBaseProtoc, "20")) {
          return;
       }
       a.p(p0, "wrapper");
       i0.a().b(p0, p1);
       return;
    }
    public final void u(BaseFeed p0,String p1,boolean p2){
       if (PatchProxy.isSupport(HbBaseProtocol.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, HbBaseProtocol.class, "36")) {
          return;
       }
       a.p(p1, "scene");
       this.f(p0, p1, "log", this.e("convert", p0, this.g(p1), -1000, new HbBaseProtocol$performConvertReport$shared$1(this, p2, p0, p1)));
       Object[] objArray = new Object[0];
       j0.a("ad_hornbill", "performConvertReport, scene: "+p1+", defaultConvert = "+p2, objArray);
       return;
    }
    public final void v(BaseFeed p0,String p1,boolean p2){
       t ot;
       if (PatchProxy.isSupport(HbBaseProtocol.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, HbBaseProtocol.class, "3")) {
          return;
       }
       String str = this.i(p0, p1);
       if (p2) {
          LruCache e = HbBaseProtocol.e;
          Boolean tRUE = Boolean.TRUE;
          if (a.g(e.get(str), tRUE)) {
             ot = t.just(CollectionsKt__CollectionsKt.E());
          }else {
             e.put(str, tRUE);
             ot = this.d(p0, p1);
          }
       }else {
          ot = this.d(p0, p1);
       }
       HbBaseProtocol.f.put(str, new a());
       ot.observeOn(d.a).subscribe(new HbBaseProtocol$f(this, p0, p1), HbBaseProtocol$g.b);
       return;
    }
    public d z0(int p0,BaseFeed p1,String p2,Pair p3,g p4){
       HbBaseProtocol hbBaseProtoc = HbBaseProtocol.class;
       if (PatchProxy.isSupport(hbBaseProtoc)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, hbBaseProtoc, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "baseFeed");
       a.p(p2, "scene");
       j oj = b.a(0x1d6683e9).c(p1);
       a.o(oj, "wrapper");
       return this.q(oj, p0, p2, p3, p4);
    }
}
