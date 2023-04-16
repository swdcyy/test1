package com.kwai.framework.network.access.control.CommonParamsControlManager;
import va6.b;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.network.access.control.CommonParamsControlManager$enableHostCollection$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.framework.network.access.control.CommonParamsControlManager$enableParamsControl$2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import yb6.d;
import wkd.b;
import wa6.a;
import com.kwai.framework.network.access.control.CommonParamsControlManager$a;
import java.lang.Runnable;
import ekd.s1;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import va6.a;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.utility.Log;
import qrd.l1;
import java.util.Collection;
import java.util.Iterator;
import zsd.u;
import uk.a;
import ab6.e;
import android.app.Application;
import o56.a;
import java.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import android.content.res.AssetManager;
import android.content.Context;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.Reader;
import android.util.Base64;
import zsd.d;
import java.nio.charset.Charset;
import com.google.gson.JsonElement;
import java.lang.Number;

public final class CommonParamsControlManager implements b	// class@001796
{
    public static final Set a;
    public static final Set b;
    public static final Set c;
    public static final Set d;
    public static final Set e;
    public static final Set f;
    public static final Set g;
    public static final Set h;
    public static final p i;
    public static final p j;
    public static long k;
    public static boolean l;
    public static final CommonParamsControlManager m;

    static {
       CommonParamsControlManager.m = new CommonParamsControlManager();
       Set set = Collections.newSetFromMap(new ConcurrentHashMap());
       a.o(set, "Collections.newSetFromMap\(ConcurrentHashMap\(\)\)");
       CommonParamsControlManager.a = set;
       set = Collections.newSetFromMap(new ConcurrentHashMap());
       a.o(set, "Collections.newSetFromMap\(ConcurrentHashMap\(\)\)");
       CommonParamsControlManager.b = set;
       set = Collections.newSetFromMap(new ConcurrentHashMap());
       a.o(set, "Collections.newSetFromMap\(ConcurrentHashMap\(\)\)");
       CommonParamsControlManager.c = set;
       set = Collections.newSetFromMap(new ConcurrentHashMap());
       a.o(set, "Collections.newSetFromMap\(ConcurrentHashMap\(\)\)");
       CommonParamsControlManager.d = set;
       set = Collections.newSetFromMap(new ConcurrentHashMap());
       a.o(set, "Collections.newSetFromMap\(ConcurrentHashMap\(\)\)");
       CommonParamsControlManager.e = set;
       set = Collections.newSetFromMap(new ConcurrentHashMap());
       a.o(set, "Collections.newSetFromMap\(ConcurrentHashMap\(\)\)");
       CommonParamsControlManager.f = set;
       set = Collections.newSetFromMap(new ConcurrentHashMap());
       a.o(set, "Collections.newSetFromMap\(ConcurrentHashMap\(\)\)");
       CommonParamsControlManager.g = set;
       set = Collections.newSetFromMap(new ConcurrentHashMap());
       a.o(set, "Collections.newSetFromMap\(ConcurrentHashMap\(\)\)");
       CommonParamsControlManager.h = set;
       CommonParamsControlManager.i = s.c(CommonParamsControlManager$enableHostCollection$2.INSTANCE);
       CommonParamsControlManager.j = s.c(CommonParamsControlManager$enableParamsControl$2.INSTANCE);
    }
    public void CommonParamsControlManager(){
       super();
    }
    public boolean a(String p0){
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CommonParamsControlManager uCommonParam = CommonParamsControlManager.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uCommonParam, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       boolean b1 = (p0 == null || !p0.length())? true: false;
       if (b1 || !this.d()) {
          return true;
       }else {
          Object obj1 = PatchProxy.apply(null, this, uCommonParam, "10");
          if (obj1 != patchProxyRe) {
             b2 = obj1.booleanValue();
          }else if(CommonParamsControlManager.k > 0 && (d.a() - CommonParamsControlManager.k <= 0 && (CommonParamsControlManager.a.isEmpty() || CommonParamsControlManager.b.isEmpty()))){
             b2 = false;
          }else {
             b2 = true;
          }
          if (!b2) {
             return true;
          }else {
             Boolean uBoolean = PatchProxy.apply(null, this, uCommonParam, "2");
             if (uBoolean == patchProxyRe) {
                uBoolean = CommonParamsControlManager.j.getValue();
             }
             if (uBoolean.booleanValue()) {
                if (!this.e(p0)) {
                   if (!this.f(p0) && !this.g(p0)) {
                      if (this.c() && !b.a(-1942878494).a(p0)) {
                         b.a(-1942878494).c(p0);
                      }
                   }else {
                   label_00c8 :
                      b = true;
                   }
                }
             }else if(this.c() && !b.a(-1942878494).a(p0)){
                s1.d(new CommonParamsControlManager$a(p0));
                goto label_00c8 ;
             }else {
                goto label_00c8 ;
             }
             return b;
          }
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, CommonParamsControlManager.class, "5")) {
          return;
       }
       f uof = a.t().f("commonParamsControlConfig");
       _monitor_enter(this);
       CommonParamsControlManager m = CommonParamsControlManager.m;
       if (m.d()) {
          _monitor_exit(this);
          return;
       }else {
          CommonParamsControlManager.l = true;
          a uoa = m.i(uof);
          if (uoa != null && uoa.a()) {
             Log.g("CommonParamsControlManager", "读取到有效的<缓存>公参管控配置:"+a.a.q(uoa));
             m.j(uoa);
             _monitor_exit(this);
             return;
          }else {
             uoa = m.h();
             if (uoa != null && uoa.a()) {
                Log.g("CommonParamsControlManager", "读取到有效的<预埋>公参管控配置:"+a.a.q(uoa));
                m.j(uoa);
                _monitor_exit(this);
                return;
             }else {
                _monitor_exit(this);
                return;
             }
          }
       }
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, CommonParamsControlManager.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = CommonParamsControlManager.i.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean d(){
       return CommonParamsControlManager.l;
    }
    public final boolean e(String p0){
       Set obj = PatchProxy.applyOneRefs(p0, this, CommonParamsControlManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = CommonParamsControlManager.c;
       if (obj.contains(p0)) {
          return true;
       }
       if (CommonParamsControlManager.e.contains(p0)) {
          return false;
       }
       Set b = CommonParamsControlManager.b;
       if (b.isEmpty() ^ true) {
          if (b.contains(p0)) {
             obj.add(p0);
             return true;
          }else {
             Iterator iterator = b.iterator();
             while (iterator.hasNext()) {
                if (u.H1(p0, '.'+iterator.next(), false, 2, null)) {
                   CommonParamsControlManager.c.add(p0);
                   return true;
                }
             }
          }
       }
       CommonParamsControlManager.e.add(p0);
       return false;
    }
    public final boolean f(String p0){
       Set obj = PatchProxy.applyOneRefs(p0, this, CommonParamsControlManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = CommonParamsControlManager.d;
       if (obj.contains(p0)) {
          return true;
       }
       if (CommonParamsControlManager.f.contains(p0)) {
          return false;
       }
       Set a = CommonParamsControlManager.a;
       if (a.isEmpty() ^ true) {
          if (a.contains(p0)) {
             obj.add(p0);
             return true;
          }else {
             Iterator iterator = a.iterator();
             while (iterator.hasNext()) {
                if (u.H1(p0, '.'+iterator.next(), false, 2, null)) {
                   CommonParamsControlManager.d.add(p0);
                   return true;
                }
             }
          }
       }
       CommonParamsControlManager.f.add(p0);
       return false;
    }
    public final boolean g(String p0){
       Set obj = PatchProxy.applyOneRefs(p0, this, CommonParamsControlManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = CommonParamsControlManager.g;
       if (obj.contains(p0)) {
          return true;
       }
       Set h = CommonParamsControlManager.h;
       if (h.contains(p0)) {
          return false;
       }
       if (a.c(p0)) {
          obj.add(p0);
          return true;
       }else {
          h.add(p0);
          return false;
       }
    }
    public final a h(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, CommonParamsControlManager.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = e.a;
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       Objects.requireNonNull(obj);
       String str = PatchProxy.applyTwoRefs(uApplication, "commonParamsControlConfig.txt", obj, e.class, "1");
       if (str != patchProxyRe) {
       }else {
          a.p(uApplication, "context");
          a.p("commonParamsControlConfig.txt", "fileName");
          try{
             StringBuilder str1 = "";
             BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(SplitAssetHelper.open(uApplication.getAssets(), "commonParamsControlConfig.txt")));
             String str2 = uBufferedRea.readLine();
             while (str2 != null) {
                str1 = str1+str2;
             }
          }catch(java.lang.Exception e0){
             Log.g("CommonParamsControlManager", "read commonParamsControlConfig.txt fail");
          }
          str = e0;
          a.o(str, "stringBuilder.toString\(\)");
       }
       int i = 0;
       byte[] uobyteArray = (str.length() > 0)? 1: null;
       if (uobyteArray) {
          try{
             uobyteArray = Base64.decode(str, i);
             a.o(uobyteArray, "Base64.decode\(base64Str, Base64.DEFAULT\)");
             str = new String(uobyteArray, d.a);
             objArray = a.a.h(str, a.class);
          }catch(java.lang.Exception e0){
             Log.g("CommonParamsControlManager", "switchConfig to hostListInfo error!");
          }
       }
    }
    public final a i(f p0){
       a obj = PatchProxy.applyOneRefs(p0, this, CommonParamsControlManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          try{
             obj = a.a.h(p0.c().toString(), a.class);
          }catch(java.lang.Exception e0){
             Log.g("CommonParamsControlManager", "switchConfig to hostListInfo error!");
          }
       }
    }
    public final void j(a p0){
       CommonParamsControlManager uCommonParam = CommonParamsControlManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uCommonParam, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uCommonParam, "3")) {
          CommonParamsControlManager.a.clear();
          CommonParamsControlManager.b.clear();
          CommonParamsControlManager.c.clear();
          CommonParamsControlManager.d.clear();
          CommonParamsControlManager.e.clear();
          CommonParamsControlManager.f.clear();
          CommonParamsControlManager.g.clear();
          CommonParamsControlManager.h.clear();
       }
       a domainWhiteL = p0.domainWhiteList;
       if (domainWhiteL != null) {
          CommonParamsControlManager.a.addAll(domainWhiteL);
       }
       domainWhiteL = p0.blackList;
       if (domainWhiteL != null) {
          CommonParamsControlManager.b.addAll(domainWhiteL);
       }
       p0 = p0.expireTimeMs;
       if (p0 != null) {
          CommonParamsControlManager.k = p0.longValue();
       }
       return;
    }
}
