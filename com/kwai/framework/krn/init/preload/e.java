package com.kwai.framework.krn.init.preload.e;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import a96.b;
import com.kwai.framework.krn.init.network.tcpproxy.b;
import com.kwai.framework.krn.init.preload.d;
import com.kwai.framework.krn.init.preload.e$f;
import com.kwai.framework.krn.init.network.RequestConfig;
import com.kuaishou.krn.model.LaunchModel;
import com.kwai.framework.krn.init.preload.e$h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.krn.init.network.b;
import brd.t;
import com.facebook.react.bridge.ReactContext;
import c96.a;
import q87.c;
import com.kwai.framework.krn.init.preload.e$i;
import android.os.SystemClock;
import com.kwai.framework.krn.init.preload.KrnPreRequestReportInfo;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import com.kwai.framework.krn.init.preload.a;
import java.lang.System;
import brd.z;
import y86.b;
import a96.p;
import a96.o;
import erd.g;
import crd.b;
import a96.m;
import io7.a;
import com.kwai.framework.krn.init.preload.e$a;
import java.util.TimerTask;
import java.util.Map$Entry;
import java.lang.CharSequence;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.framework.krn.init.preload.e$d;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;
import com.kwai.framework.krn.init.preload.e$e;
import java.lang.StringBuilder;
import ekd.q;
import lk0.k;
import com.kuaishou.krn.experiment.ExpConfigKt;
import com.kuaishou.krn.c;
import jk0.b;
import jk0.c;
import com.kwai.framework.krn.init.preload.e$c;
import okhttp3.Request;
import java.lang.Throwable;
import java.lang.Long;
import gk0.b;
import y86.c;
import y86.s;
import java.util.Objects;
import y86.d;
import android.app.Application;
import o56.a;
import a96.l;
import java.util.ArrayList;
import java.util.Collections;
import android.text.TextUtils;
import java.lang.Integer;
import io7.f;
import com.google.gson.JsonElement;
import com.kwai.framework.krn.init.preload.e$b;
import java.lang.Exception;
import k2b.u1;
import gk0.a;
import java.util.List;
import java.util.Collection;
import com.kwai.framework.krn.init.preload.e$g;
import com.kwai.framework.krn.init.preload.c;
import java.lang.StackTraceElement;
import java.util.Arrays;
import a96.n;
import io.reactivex.g;
import njd.a;

public final class e	// class@001613
{
    public final Timer a;
    public final Timer b;
    public int c;
    public int d;
    public boolean e;
    public final ConcurrentHashMap f;
    public final ConcurrentHashMap g;
    public ConcurrentHashMap h;
    public ConcurrentHashMap i;
    public final ConcurrentHashMap j;
    public static boolean k;

    static {
       e.k = a.t().d("krnNetworkOptimize", false);
    }
    public void e(){
       super();
       this.a = new Timer();
       this.b = new Timer();
       this.e = false;
       this.f = new ConcurrentHashMap();
       this.g = new ConcurrentHashMap();
       this.h = new ConcurrentHashMap();
       this.i = new ConcurrentHashMap();
       this.j = new ConcurrentHashMap();
       b.a();
       b.e();
       this.c();
    }
    public void e(d p0){
       super();
       this.a = new Timer();
       this.b = new Timer();
       this.e = false;
       this.f = new ConcurrentHashMap();
       this.g = new ConcurrentHashMap();
       this.h = new ConcurrentHashMap();
       this.i = new ConcurrentHashMap();
       this.j = new ConcurrentHashMap();
       b.a();
       b.e();
       this.c();
    }
    public static e b(){
       return e$f.a;
    }
    public boolean a(RequestConfig p0,LaunchModel p1,e$h p2,boolean p3){
       RequestConfig obj2;
       LaunchModel this;
       e uoe = this;
       Object obj = p0;
       t obj1 = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(e.class)) {
          obj2 = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, e.class, "8");
          if (obj2 != patchProxyRe) {
             return obj2.booleanValue();
          }
       }
       if (!obj || (p0.getUrl() != null && uoe.c > null)) {
          if (uoe.f.get(obj) != null) {
             return true;
          }else if(PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, e.class, "7")){
             obj2 = p0.clone();
             Object obj3 = null;
             t ot = PatchProxy.applyTwoRefs(obj2, obj1, obj3, b.class, "23");
             if (ot != patchProxyRe) {
             }else {
                ot = b.c(obj3, obj2, obj1);
             }
             obj1 = ot;
             if (obj1 == null) {
                Object[] objArray = new Object[0];
                a.D().t("KrnNetwork", "requestConfig is not support, check your request requestConfig", objArray);
             }else if(PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p3), this, e.class, "12")){
                int i = p1;
             }else {
                e$i oi = new e$i(obj3);
                oi.a = obj3;
                oi.b = SystemClock.elapsedRealtime();
                oi.c = obj3;
                oi.d = obj3;
                uoe.f.put(obj, oi);
                KrnPreRequestReportInfo krnPreReques = new KrnPreRequestReportInfo();
                if (p1.g() != null) {
                   String str = "kdsKrnExtraInfoForLogger";
                   if (p1.g().get(str) != null) {
                      Object obj4 = p1.g().get(str);
                      if (obj4 instanceof Bundle) {
                         HashMap hashMap = new HashMap();
                         Iterator iterator = obj4.keySet().iterator();
                         while (iterator.hasNext()) {
                            String str1 = iterator.next();
                            hashMap.put(str1, obj4.get(str1));
                         }
                         krnPreReques.extraInfo = hashMap;
                      }
                   }
                }
                krnPreReques.setUrl(p0.getUrl());
                krnPreReques.bundleID = p1.a();
                krnPreReques.businessName = p0.getBusinessName();
                krnPreReques.isKSwitchConfig = p3;
                krnPreReques.bundleVersionCode = a.M().K(p1);
                uoe.j.put(obj, krnPreReques);
             }
             long l = System.currentTimeMillis();
             if (e.k) {
                obj1 = obj1.subscribeOn(b.c());
             }
             e uoe1 = this;
             RequestConfig requestConfi = p0;
             this = p1;
             long l1 = l;
             p op = new p(uoe1, requestConfi, this, l1);
             o oo = new o(uoe1, requestConfi, this, l1);
             obj1.subscribe(v13, v14);
          }
       }
       return true;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       this.e = true;
       this.c = 0x2710;
       this.d = 0xea60;
       this.k();
       Object[] objArray = new Object[0];
       a.D().w("KrnNetwork", "KrnPreRequestModule parseConfig finished", objArray);
       a.t().p("KrnPrerequestConfigMapKey", new m(this));
       if (this.c > null) {
          this.a.schedule(new e$a(this), 0, (long)this.c);
       }
       return;
    }
    public final void d(RequestConfig p0){
       Gson a;
       String diffParams;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "22")) {
          return;
       }
       KrnPreRequestReportInfo obj = PatchProxy.applyOneRefs(p0, this, uoe, "20");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = null;
          Iterator iterator1 = this.f.entrySet().iterator();
          while (iterator1.hasNext()) {
             RequestConfig key = iterator1.next().getKey();
             if (p0.getUrl() != null && (key.getUrl() != null && (p0.getUrl()).contains(key.getUrl()))) {
                obj = key;
                break ;
             }
          }
       }
       if (obj != null) {
          a = a.a;
          Map map = a.i(a.q(p0), new e$d(this).getType());
          Map map1 = a.i(a.q(obj), new e$e(this).getType());
          KrnPreRequestReportInfo krnPreReques = this.j.get(obj);
          if (krnPreReques != null) {
             krnPreReques.noHitClass = "发起预请求，但参数不一致";
             diffParams = RequestConfig.getDiffParams(map, map1);
             krnPreReques.noHitReason = diffParams;
          }else {
             diffParams = "";
          }
          a.M().E("\x27\x02 \x6c\x02\x54\x02\x4e\x02\x98\x02\x8b\x02\x6c\x02\xff\x02\x56\x02\x4e\x02\x8b\x02\x8b\x02\x6c\x02\x91\x02\x7f\x02\x95\x02\x8b\x02\xff\x02URL\x66\x02: \n\x00"+p0.getUrl()+"\n端上预请求配置的参数: \n "+obj+"\n前端业务请求时的参数: \n "+p0+"\n原因是："+diffParams);
       }else {
          obj = this.j.get(p0);
          if (obj != null) {
             if (obj.isTimeOut != null) {
                obj.noHitClass = "发起预请求，但超时被清除";
             }else if(obj.isSuccess == null){
                obj.noHitClass = "发起预请求，但请求失败被清除";
             }else {
                obj.noHitClass = "其他";
             }
          }
          a.M().E("\x27\x02 \x6c\x02\x54\x02\x4e\x02\x98\x02\x8b\x02\x6c\x02\xff\x02\x56\x02\x4e\x02\x8b\x02url\x8b\x02\x6c\x02\x4e\x02\x57\x02\x91\x02\x7f\x02\x4e\x02\xff\x02URL\x66\x02: \n \x00"+p0.getUrl()+"\n 已缓存的配置有"+this.f.size()+"个");
          if (this.f.size() > 0) {
             Iterator iterator = this.f.keySet().iterator();
             while (iterator.hasNext()) {
                a.M().E("缓存的配置是： \n "+iterator.next().toString()+"\n");
             }
          }
       }
       return;
    }
    public final void e(RequestConfig p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "18")) {
          return;
       }
       if (q.h(this.j)) {
          return;
       }
       RequestConfig requestConfi = PatchProxy.applyOneRefs(p0, this, uoe, "19");
       if (requestConfi != PatchProxyResult.class) {
       }else {
          Iterator iterator = this.j.entrySet().iterator();
          while (true) {
             if (iterator.hasNext()) {
                RequestConfig key = iterator.next().getKey();
                if (p0.getUrl() != null && (key.getUrl() != null && (p0.getUrl()).contains(key.getUrl()))) {
                   p0 = key;
                }
             }
             requestConfi = p0;
          }
       }
       KrnPreRequestReportInfo krnPreReques = this.j.get(requestConfi);
       if (krnPreReques != null) {
          p1 = (krnPreReques.isHit != null || p1)? true: false;
          krnPreReques.isHit = p1;
          krnPreReques.hasBizRequest = true;
          krnPreReques.setStartRequest(SystemClock.elapsedRealtime());
          if (krnPreReques.getEndRequest() - -1) {
             this.l(krnPreReques, requestConfi);
          }
       }
       return;
    }
    public boolean f(LaunchModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (k.a(p0.a(), p0.b())) {
          return b;
       }
       if (p0.l() - ExpConfigKt.m() > 0) {
          b = false;
       }
       return b;
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (c.b().k() && c.a().g()) {
          return true;
       }
       if (!c.b().k() && (a.t().d("krnPreRequestEnable", true) && c.a().g())) {
          return true;
       }
       return false;
    }
    public final void h(RequestConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "15")) {
          return;
       }
       this.b.schedule(new e$c(this, p0), (long)this.d);
       return;
    }
    public final void i(RequestConfig p0,Request p1,LaunchModel p2,long p3,Throwable p4){
       b uob;
       boolean b;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p2;
       e uoe = e.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,Long.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, obj, uoe, "14")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i1];
       a.D().w("KrnNetwork", "KrnPreRequest: onRequestFailed="+p0.getUrl(), objArray1);
       if (obj.f(oobject1)) {
          b.a().f(p2.a(), p2.b(), p0.getUrl(), p3, System.currentTimeMillis());
       }
       KrnPreRequestReportInfo krnPreReques = obj.j.get(oobject);
       if (krnPreReques != null) {
          krnPreReques.onRequestFailed();
          if (p1 != null) {
             c uoc = s.e(p1);
             if (uoc != null) {
                uob = null;
                b = (uoc.isSocketReused - uob > 0)? true: false;
                krnPreReques.isSocketReused = b;
                if (uoc.isUseKlinkProxy - uob <= 0) {
                   i = false;
                }
                krnPreReques.isUseKlinkProxy = i;
                krnPreReques.setKlinkTimeCost(uoc.klinkTimeCost);
                krnPreReques.setKlinkTimeCost(uoc.klinkTimeCost);
                krnPreReques.mRequestBodyLength = uoc.mRequestBodyLength;
                krnPreReques.mResponseBodyLength = uoc.mResponseBodyLength;
             }
          }
          if (krnPreReques.hasBizRequest != null) {
             obj.l(krnPreReques, oobject);
          }
          this.h(p0);
       }
       e$i oi = obj.f.get(oobject);
       if (oi != null) {
          a.M().F("预请求已回包，请求失败，URL是: \n "+p0.getUrl());
       }
       if (oi != null && oi.c != null) {
          uob = b.b();
          e$i c = oi.c;
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidFourRefs(p2, p4, p0, c, uob, b.class, "15")) {
             uob.h(p2, null, p4, p0, c);
          }
       }else if(oi != null){
          oi = oi.d;
          if (oi != null) {
             oi.a("-1000", a.b().getString(R.string.arg_RES_7f1038e3));
          }
       }
       obj.f.remove(oobject);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, e.class, "11")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       long l = SystemClock.elapsedRealtime();
       Iterator iterator = this.f.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          long l1 = l - uEntry.getValue().b;
          if ((long)this.c - l1 <= 0 && uEntry.getValue().c == null) {
             uArrayList.add(uEntry.getKey());
             Object[] objArray = new Object[0];
             a.D().w("KrnNetwork", "KrnPreRequest: onTimeout url="+uEntry.getKey().getUrl(), objArray);
          }
       }
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          RequestConfig requestConfi = iterator1.next();
          this.f.remove(requestConfi);
          KrnPreRequestReportInfo krnPreReques = this.j.get(requestConfi);
          if (krnPreReques != null) {
             krnPreReques.isTimeOut = true;
          }
       }
       return;
    }
    public final void k(){
       Gson a;
       String str = "KRNPreRequestForAndroid";
       String str1 = String.class;
       if (PatchProxy.applyVoid(null, this, e.class, "10")) {
          return;
       }
       int i = 2;
       Type[] typeArray = new Type[i];
       typeArray[0] = str1;
       typeArray[1] = str1;
       Type type = a.getParameterized(Map.class, typeArray).getType();
       try{
          this.g.clear();
          this.g.putAll(a.t().getValue("KrnPrerequestConfigMapKey", type, Collections.emptyMap()));
          String str2 = this.g.get("timeout");
          String str3 = this.g.get("reportTimeout");
          String str4 = this.g.get("focusKeys");
          if (!TextUtils.isEmpty(str4)) {
             RequestConfig.keys = str4.split(",");
          }
          if (!TextUtils.isEmpty(str2)) {
             this.c = Integer.parseInt(str2);
          }
          if (!TextUtils.isEmpty(str3)) {
             this.d = Integer.parseInt(str3);
          }
          typeArray = new Type[]{Map.class};
          Type[] typeArray1 = new Type[i];
          typeArray1[0] = str1;
          typeArray1[1] = a.getParameterized(ArrayList.class, typeArray).getType();
          type = a.getParameterized(Map.class, typeArray1).getType();
          f uof = a.t().f(str);
          str4 = "";
          if (uof != null && uof.c() != null) {
             str4 = String.valueOf(uof.c());
          }
          Object[] objArray1 = new Object[0];
          a.D().w("KrnNetwork", "KrnPreRequest: businessJsonConfig="+str4, objArray1);
          typeArray = new Type[]{new e$b(this).getType()};
          Type[] typeArray2 = new Type[i];
          typeArray2[0] = str1;
          typeArray2[1] = a.getParameterized(ArrayList.class, typeArray).getType();
          a = a.a;
          this.h.putAll(a.i(a.q(a.t().getValue(str, type, Collections.emptyMap())), a.getParameterized(Map.class, typeArray2).getType()));
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          a.D().t("KrnNetwork", "KrnPreRequest parseConfig Exception: "+e0.toString(), objArray);
       }
       return;
    }
    public void l(KrnPreRequestReportInfo p0,RequestConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "17")) {
          return;
       }
       int i = 0;
       try{
          p0.calculate();
          String str = a.a.q(p0);
          u1.Y("kds_prerequest_event", str, 20);
          Object[] objArray = new Object[i];
          a.D().w("KrnNetwork", "KrnNetworkOptimizer, reportInfo="+str, objArray);
          this.j.remove(p1);
       }catch(java.lang.Exception e6){
          Object[] objArray1 = new Object[i];
          a.D().A("KrnNetwork", "KrnNetworkOptimizer:"+e6.toString(), objArray1);
       }
       return;
    }
    public void m(LaunchModel p0){
       Object[] objArray;
       ArrayList uArrayList;
       Iterator iterator;
       e$g a;
       boolean b;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, e.class, "6")) {
          return;
       }
       if (!this.g()) {
          a.M().F("已关闭预请求优化，发起正常网络请求");
          return;
       }else {
          int i = 0;
          if (obj1 == null) {
             a.M().c0(-1002, "total", "KrnTryPreRequest LaunchModel=null");
             objArray = new Object[i];
             a.D().A("KrnNetwork", "KrnTryPreRequest LaunchModel=null", objArray);
             return;
          }else if(this.f(p0)){
             String str = p0.a();
             String str1 = p0.b();
             b uob = b.a();
             long l = System.currentTimeMillis();
             Objects.requireNonNull(uob);
             if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(str, str1, Long.valueOf(l), uob, b.class, "4")) {
                a uoa1 = new a(str, str1, "", l, 0);
                iterator = uob.d.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      a uoa2 = iterator.next();
                      if (!str.equals(uoa2.a) || !str1.equals(uoa2.b)) {
                         continue ;
                      }
                   }else {
                      uob.d.add(v15);
                   }
                }
             }
          }
          a uoa = null;
          try{
             if (a.M().X(obj1)) {
                uArrayList = obj.h.get(p0.a());
                a.M().F("检测到需要优先使用KSwtich的预请求配置");
                if (q.f(uArrayList)) {
                   a.M().E("\x27\x02 KSwtich\x6c\x02\x67\x02\x98\x02\x8b\x02\x6c\x02\x91\x02\x7f\x02\x00");
                   return;
                }else {
                   a.M().F("\x27\x02 \x5d\x02\x4f\x02\x75\x02KSwtich\x76\x02\x98\x02\x8b\x02\x6c\x02\x91\x02\x7f\x02\x00");
                }
             }else {
                e$g og = obj.i.get(p0.a());
                if (og != null) {
                   a = og.a;
                   og = og.d;
                   if (!a.M().T(og.c, og.b)) {
                      return;
                   }else if(c.b().k()){
                      a.M().F("尝试使用optimize.config.json文件中的预请求配置");
                   }else {
                      a.M().F("尝试使用bundle中的预请求配置");
                   }
                   if (!q.f(a)) {
                      if (c.b().k()) {
                         a.M().F("\x27\x02 \x5d\x02\x4f\x02\x75\x02optimize.config.json\x65\x02\x4e\x02\x4e\x02\x76\x02\x98\x02\x8b\x02\x6c\x02\x91\x02\x7f\x02\x00");
                      }else {
                         a.M().F("\x27\x02 \x5d\x02\x4f\x02\x75\x02bundle\x4e\x02\x76\x02\x98\x02\x8b\x02\x6c\x02\x91\x02\x7f\x02\x00");
                      }
                      uArrayList = a;
                      b = false;
                   }else if(c.b().k()){
                      a.M().E("\x27\x02 optimize.config.json\x65\x02\x4e\x02\x4e\x02\x6c\x02\x67\x02\x98\x02\x8b\x02\x6c\x02\x91\x02\x7f\x02\x00");
                   }else {
                      a.M().E("\x27\x02 bundle\x4e\x02\x6c\x02\x67\x02\x98\x02\x8b\x02\x6c\x02\x91\x02\x7f\x02\x00");
                   }
                }
                return;
             }
             if (20 - (long)obj.j.size() < 0) {
                obj.j.clear();
             }
             Object[] objArray1 = new Object[i];
             a.D().E("requestJsonList = "+uArrayList, objArray1);
             uArrayList = new c().f(uArrayList, obj1);
             if (!q.f(uArrayList)) {
                a.M().F("该业务即将发起"+uArrayList.size()+"个预请求");
             }
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                RequestConfig requestConfi = iterator.next().clone();
                obj.a(requestConfi, obj1, uoa, true);
                Object[] objArray2 = new Object[i];
                a.D().w("KrnNetwork", "KrnPreRequest: tryPreRequest="+a.a.q(requestConfi)+"-LaunchModel="+obj1, objArray2);
                a.M().F("发起预请求，URL是: \n"+requestConfi.getUrl());
             }
          }catch(java.lang.Exception e0){
             a.M().d0(-1000, p0.a(), "KrnTryPreRequest Exception="+e0.toString(), Arrays.toString(e0.getStackTrace()));
             objArray = new Object[i];
             a.D().A("KrnNetwork", "tryPreRequest Exception="+e0.toString()+", stackTrack="+Arrays.toString(e0.getStackTrace()), objArray);
          }
          return;
       }
    }
    public t n(RequestConfig p0){
       t ot;
       e$i obj = PatchProxy.applyOneRefs(p0, this, e.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f.get(p0);
       n on = null;
       if (obj != null) {
          ot = t.create(new n(this, obj, p0));
          on = true;
       }else {
          Object[] objArray = new Object[on];
          a.D().w("KrnNetwork", "KrnPreRequest:krn network intercept tryUsePrerequestIfPossible="+this.f.size()+"url="+p0.getUrl(), objArray);
          this.d(p0);
          ot = null;
       }
       this.e(p0, on);
       if (on) {
          return ot;
       }else {
          return null;
       }
    }
    public boolean o(ReactContext p0,RequestConfig p1,d p2){
       e$i a;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if (!e.b().g()) {
             return b;
          }
          e$i oi = this.f.get(p1);
          if (oi != null && oi.c != null) {
             a.M().E("\x27\x02  \x6c\x02\x54\x02\x4e\x02\x98\x02\x8b\x02\x6c\x02\xff\x02\x56\x02\x4e\x02\x8b\x02\x8b\x02\x6c\x02\x5d\x02\x7e\x02\x88\x02\x6d\x02\x8d\x02\x8f\x02\x4e\x02\xff\x02URL\x66\x02: \n \x00"+p1.getUrl());
             return b;
          }else {
             boolean b1 = true;
             if (oi != null) {
                oi.c = p2;
                oi.e = p1.isHitKrnPageLoadMonitorSample();
                if (oi.a != null) {
                   b.b().i(p0, p1, oi.a, p2);
                   a = oi.a;
                   a uoa = (a != null && a.b() == b1)? 1: null;
                   if (uoa) {
                      a.M().F("\x27\x02 \x54\x02\x4e\x02\x98\x02\x8b\x02\x6c\x02\xff\x02\x4e\x02\x8b\x02\x6c\x02\x5d\x02\x56\x02\x53\x02\xff\x02URL\x66\x02: \n \x00"+p1.getUrl());
                   }else {
                      a.M().F("\x27\x02 \x54\x02\x4e\x02\x98\x02\x8b\x02\x6c\x02\xff\x02\x4f\x02\x8b\x02\x6c\x02\x59\x02\x8d\x02\x4e\x02\xff\x02URL\x66\x02: \n \x00"+p1.getUrl()+"\n网络错误信息: \n"+oi.a.c());
                   }
                   this.f.remove(p1);
                }else {
                   a.M().F("\x27\x02 \x54\x02\x4e\x02\x98\x02\x8b\x02\x6c\x02\xff\x02\x4f\x02\x8b\x02\x6c\x02\x8f\x02\x67\x02\x56\x02\x53\x02\xff\x02URL\x66\x02: \n \x00"+p1.getUrl());
                }
             }else {
                Object[] objArray = new Object[b];
                a.D().w("KrnNetwork", "KrnPreRequest: tryUsePrerequestIfPossible="+this.f.size()+"，url="+p1.getUrl(), objArray);
                this.d(p1);
                b1 = false;
             }
             this.e(p1, b1);
             return b1;
          }
       }catch(java.lang.Exception e9){
          a.M().d0(-1000, p1.getUrl(), "KrnTryUsePreRequestIfPossible Exception="+e9.getMessage(), Arrays.toString(e9.getStackTrace()));
          return b;
       }
    }
}
