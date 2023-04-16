package com.kwai.framework.network.cronet.i;
import db6.a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import db6.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import com.kwai.framework.network.cronet.i$a;
import com.kuaishou.aegon.Aegon$b;
import com.kuaishou.aegon.Aegon;
import aegon.chrome.net.d;
import java.lang.Boolean;
import android.content.SharedPreferences;
import com.kuaishou.aegon.NetworkActivationHelper;
import com.kwai.framework.network.cronet.f;
import java.lang.Runnable;
import t45.c;
import db6.f;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ta6.c;
import q87.c;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.aegon.okhttp.CronetInterceptorConfig;
import com.kwai.framework.network.cronet.k;
import com.kuaishou.aegon.AegonLoggerDispatcher;
import java.util.concurrent.ConcurrentLinkedQueue;
import com.kwai.framework.network.cronet.d;
import o56.c;
import o56.a;
import bo.p;
import bo.i;
import io.b;
import bo.l;
import io.a;
import bo.f;
import java.lang.Number;
import java.lang.Integer;
import bo.g;
import com.kuaishou.aegon.okhttp.CronetInterceptorConfig$ListType;
import android.text.TextUtils;
import org.json.JSONObject;
import java.util.Iterator;
import org.json.JSONArray;
import java.util.ArrayList;
import java.util.Map;
import java.lang.Exception;
import bo.t;
import com.yxcorp.utility.SystemUtil;
import com.kwai.framework.network.cronet.e;
import android.os.Handler;
import ekd.s1;
import android.os.Looper;
import android.os.HandlerThread;
import com.kwai.framework.network.cronet.g;

public class i implements a	// class@000bfb
{
    public final AtomicBoolean a;
    public AtomicBoolean b;
    public AtomicBoolean c;

    public void i(){
       super();
       this.a = new AtomicBoolean(false);
       this.b = new AtomicBoolean(false);
       this.c = new AtomicBoolean(false);
    }
    public void a(Context p0){
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "3")) {
          return;
       }
       if (this.c.get()) {
          return;
       }
       _monitor_enter(oi);
       if (this.c.get()) {
          _monitor_exit(oi);
          return;
       }else {
          Aegon.d(p0, e.d(), p0.getDir("aegon", 0).getAbsolutePath(), new i$a(this));
          this.c.set(true);
          Aegon.c();
          Object obj = PatchProxy.apply(null, null, e.class, "10");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): e.e().getBoolean("enableSwitchNetWork", 0);
          String str = PatchProxy.apply(null, null, e.class, "11");
          if (str != PatchProxyResult.class) {
          }else {
             str = e.e().getString("networkActivationConfig", "");
          }
          NetworkActivationHelper.a(p0, b, str);
          _monitor_exit(oi);
          p0 = PatchProxy.apply(null, null, e.class, "14");
          boolean b1 = (p0 != PatchProxyResult.class)? p0.booleanValue(): e.e().getBoolean("clientPreConnectionAhead", 0);
          if (b1) {
             c.a(f.b);
          }
          return;
       }
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, i.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.get();
    }
    public void c(String p0){
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "8")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, oi, "10")) {
          d uod = Aegon.c();
          if (uod != null) {
             Object obj = null;
             String obj1 = PatchProxy.applyOneRefs(p0, obj, f.class, "2");
             if (obj1 != PatchProxyResult.class) {
                obj = obj1;
             }else {
                File uFile = f.a();
                if (uFile != null) {
                   obj = uFile.getAbsolutePath()+File.separator+p0+"_"+new SimpleDateFormat("yyyyMMdd-HHmmss-SSS").format(new Date(System.currentTimeMillis()))+".log";
                }
             }
             if (!TextUtils.x(obj) && this.a.compareAndSet(false, true)) {
                c uoc = c.C();
                obj1 = "save a new log file. "+obj;
                Object[] objArray = new Object[false];
                try{
                   uoc.w("AegonCronetManager", obj1, objArray);
                   uod.g(obj, false);
                }catch(java.lang.RuntimeException e7){
                   e7.printStackTrace();
                   ExceptionHandler.handleCaughtException(e7);
                }
             }
          }
       }
    }
    public void d(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "9")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "11")) {
          d uod = Aegon.c();
          if (uod != null) {
             uod.h();
             this.a.set(false);
          }
       }
       return;
    }
    public void init(Context p0){
       String str3;
       String[] obj3;
       int i;
       boolean b1;
       Object obj = this;
       Object obj1 = p0;
       i oi = i.class;
       CronetInterceptorConfig uCronetInter = CronetInterceptorConfig.class;
       Aegon uAegon = Aegon.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, oi, str)) {
          return;
       }
       this.a(p0);
       k ok = new k();
       Object obj2 = null;
       if (!PatchProxy.applyVoidOneRefs(ok, obj2, uAegon, "5") && !PatchProxy.applyVoidOneRefs(ok, obj2, AegonLoggerDispatcher.class, "2")) {
          AegonLoggerDispatcher.a.add(ok);
       }
       d a = d.a;
       long l = 0;
       boolean b = true;
       if (a.a().c()) {
          Aegon.i(b);
          Aegon.j(a, false);
          Aegon.k(l, false);
       }else {
          Aegon.i(false);
          Aegon.j(a, b);
          Aegon.k(l, b);
       }
       String str1 = PatchProxy.apply(obj2, obj2, uoe, "8");
       String str2 = "";
       if (str1 != patchProxyRe) {
       }else {
          str1 = e.e().getString("nqeParamsConfig", str2);
       }
       if (!PatchProxy.applyVoidOneRefs(str1, obj2, uAegon, "29") && Aegon.f.get()) {
          b.c(new i(str1));
       }
       str1 = PatchProxy.apply(obj2, obj2, uoe, "6");
       if (str1 != patchProxyRe) {
       }else {
          str1 = e.e().getString("cronetRequestXExp", str2);
       }
       if (!TextUtils.x(str1)) {
          str3 = "X-Exp";
          if (!PatchProxy.applyVoidTwoRefs(str3, str1, obj2, uAegon, "23") && Aegon.f.get()) {
             b.c(new l(str3, str1));
          }
       }
       str1 = "9";
       str3 = PatchProxy.apply(obj2, obj2, uoe, str1);
       if (str3 != patchProxyRe) {
       }else {
          str3 = e.e().getString("quicFallbackToTcpBlacklist", str2);
       }
       if (!PatchProxy.applyVoidOneRefs(str3, obj2, uAegon, "28")) {
          obj3 = a.a(str3);
          if (obj3 != null) {
             b.c(new f(obj3));
          }
       }
       obj3 = PatchProxy.apply(obj2, obj2, uoe, "16");
       l = (obj3 != patchProxyRe)? obj3.longValue(): e.e().getLong("cronetThreadPoolLimit", -1);
       i = (int)l;
       if (!PatchProxy.isSupport(uAegon) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), obj2, uAegon, "14") && Aegon.f.get())) {
          b.c(new g(i));
       }
       String str4 = PatchProxy.apply(obj2, obj2, uoe, "3");
       if (str4 != patchProxyRe) {
       }else {
          str4 = e.e().getString("cronetInterceptorWhitelist", "[\"*\"]");
       }
       CronetInterceptorConfig.c(str4);
       str4 = PatchProxy.apply(obj2, obj2, uoe, str);
       if (str4 != patchProxyRe) {
       }else {
          str4 = e.e().getString("cronetInterceptorBlacklist", "[]");
       }
       if (!PatchProxy.applyVoidOneRefs(str4, obj2, uCronetInter, str)) {
          CronetInterceptorConfig.b(a.a(str4), CronetInterceptorConfig$ListType.BLACK_LIST);
       }
       str4 = PatchProxy.apply(obj2, obj2, uoe, "5");
       if (str4 != patchProxyRe) {
       }else {
          str4 = e.e().getString("cronetPostEarlyDataRouteWhitelist", obj2);
       }
       if (!PatchProxy.applyVoidOneRefs(str4, obj2, uCronetInter, str1)) {
          String[] stringArray = a.a(str4);
          if (stringArray != null) {
             CronetInterceptorConfig.d = stringArray;
          }
       }
       Iterator obj4 = PatchProxy.apply(obj2, obj2, uoe, "12");
       if (obj4 != patchProxyRe) {
          b1 = obj4.booleanValue();
          str1 = 0;
       }else {
          b1 = e.e().getBoolean("cronetInterceptorEnableHttpCache", false);
       }
       CronetInterceptorConfig.e = b1;
       obj4 = PatchProxy.apply(obj2, obj2, uoe, "15");
       l = (obj4 != patchProxyRe)? obj4.longValue(): e.e().getLong("cronetInterceptorCallbackThreadPoolSize", 1);
       CronetInterceptorConfig.g = (int)l;
       str4 = "7";
       String str5 = PatchProxy.apply(obj2, obj2, uoe, str4);
       if (str5 != patchProxyRe) {
       }else {
          str5 = e.e().getString("apiRequestPriorityConfig", str2);
       }
       try{
          if (!PatchProxy.applyVoidOneRefs(str5, obj2, uCronetInter, str4) && !TextUtils.isEmpty(str5)) {
             JSONObject jSONObject = new JSONObject(str5);
             obj4 = jSONObject.keys();
             while (obj4.hasNext()) {
                String str6 = obj4.next();
                JSONArray jSONArray = jSONObject.getJSONArray(str6);
                ArrayList uArrayList = new ArrayList();
                for (int i1 = 0; i1 < jSONArray.length(); i1 = i1 + 1) {
                   uArrayList.add(jSONArray.getString(i1));
                }
                CronetInterceptorConfig.c.put(str6, uArrayList);
             }
          }
       }catch(java.lang.Exception e0){
          t.d("CronetInterceptorConfig", "parse request priority config error: "+e0.getMessage());
       }
       obj.b.set(true);
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, oi, "5") && SystemUtil.L(p0)) {
          c.a(new e(obj));
       }
       if (SystemUtil.L(p0)) {
          new Handler(s1.b().getLooper()).postDelayed(g.b, 3000);
       }
       return;
    }
    public boolean isEnabled(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.get();
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       Aegon.g();
       return;
    }
    public void onForeground(){
       if (PatchProxy.applyVoid(null, this, i.class, "7")) {
          return;
       }
       Aegon.h();
       return;
    }
}
