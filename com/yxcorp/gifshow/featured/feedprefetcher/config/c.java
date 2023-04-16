package com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.JsonArray;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Object;
import com.yxcorp.gifshow.featured.feedprefetcher.config.a;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.featured.feedprefetcher.config.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import mea.a;
import pea.b;
import iea.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.ArrayList;
import x50.b;
import mea.b;
import mea.c;
import java.lang.Long;
import java.lang.Boolean;
import yb6.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import android.util.Log;
import com.yxcorp.gifshow.featured.feedprefetcher.config.DisablePrefetchPeriodConfig;

public final class c	// class@000fb5
{
    public static b a;
    public static b b;
    public static DisablePrefetchPeriodConfig c;
    public static a d;
    public static c e;
    public static ArrayList f;
    public static final JsonArray g;
    public static final x h;
    public static final x i;

    static {
       c.g = a.t().getValue("PoorNetLowVVThreshold", JsonArray.class, null);
       c.h = Suppliers.a(a.b);
       c.i = Suppliers.a(b.b);
    }
    public void c(){
       super();
    }
    public static int a(){
       Object obj = PatchProxy.apply(null, null, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (c.b() == null)? 0: c.b().mConsumeLimit;
       return i;
    }
    public static a b(){
       c uoc = c.class;
       String obj = PatchProxy.apply(null, null, uoc, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.d == null) {
          _monitor_enter(uoc);
          if (c.d == null) {
             c.d = c.i();
             obj = (c.d == null)? "cold start config null": c.d.toString();
             b.e(obj);
          }
          _monitor_exit(uoc);
          if (c.d == null) {
             SharedPreferences a = b.a;
             if (!a.getBoolean("hasUpgradedDownloadConfig", false)) {
                c.d = new a();
                c.d.mColdStartUseWaitTimeMs = 1;
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putBoolean("hasUpgradedDownloadConfig", true);
                g.a(uEditor);
             }
          }
       }
    label_005d :
       return c.d;
    }
    public static long c(){
       Object obj = PatchProxy.apply(null, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (c.b() == null)? 0: c.b().mColdStartUseWaitTimeMs;
       return l;
    }
    public static ArrayList d(){
       c uoc = c.class;
       Object obj = PatchProxy.apply(null, null, uoc, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.f == null) {
          _monitor_enter(uoc);
          c.f = b.b.b(c.g);
          _monitor_exit(uoc);
       }
       return c.f;
    }
    public static b e(){
       c uoc = c.class;
       String obj = PatchProxy.apply(null, null, uoc, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.a == null) {
          _monitor_enter(uoc);
          if (c.a == null) {
             c.a = c.k();
             obj = (c.a == null)? "download config null": c.a.toString();
             b.e(obj);
          }
          _monitor_exit(uoc);
       }
       if (c.a == null && c.b != null) {
          return c.b;
       }else {
          return c.a;
       }
    }
    public static c f(){
       c uoc = c.class;
       String obj = PatchProxy.apply(null, null, uoc, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.e == null) {
          _monitor_enter(uoc);
          if (c.e == null) {
             c.e = c.l();
             obj = (c.e == null)? "poor net config null": c.e.toString();
             b.e(obj);
          }
          _monitor_exit(uoc);
       }
       return c.e;
    }
    public static long g(){
       Object obj = PatchProxy.apply(null, null, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (c.e() == null)? 0: c.e().mPreloadBytes;
       return l;
    }
    public static boolean h(long p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (c.e() != null && (c.e().mEffectiveDurationMs > 0 && (p0 + c.e().mEffectiveDurationMs) - d.a() <= 0)) {
          b = false;
       }
    label_0043 :
       return b;
    }
    public static a i(){
       String obj = PatchProxy.apply(null, null, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().c("coldStartUsePrefetchConfig", "");
       try{
          if (!TextUtils.x(obj)) {
             return a.a.h(obj, a.class);
          }
       }catch(com.google.gson.JsonSyntaxException e0){
          b.b("ColdStartUsePrefetchConfig", Log.getStackTraceString(e0));
       }
       return null;
    }
    public static DisablePrefetchPeriodConfig j(){
       DisablePrefetchPeriodConfig uDisablePref = DisablePrefetchPeriodConfig.class;
       String obj = PatchProxy.apply(null, null, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().c("disablePrefetchPeriodConfig", "");
       String str = a.t().c("lowVVDisablePrefetchPeriodConfig", "");
       int i = 1;
       if (c.d() == null || !b.b.c(c.d().get(0).longValue(), c.d().get(i).longValue())) {
          i = 0;
       }
       try{
          if (i && !TextUtils.x(str)) {
             b.b("DisablePrefetchPeriodConfig", "hit low vv");
             return a.a.h(str, uDisablePref);
          }else if(!TextUtils.x(obj)){
             return a.a.h(obj, uDisablePref);
          }
       }catch(com.google.gson.JsonSyntaxException e0){
          b.b("DisablePrefetchPeriodConfig", Log.getStackTraceString(e0));
       }
       return null;
    }
    public static b k(){
       b uob = b.class;
       String obj = PatchProxy.apply(null, null, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "";
       obj = a.t().c("photoPrefetchDownloadConfig", str);
       String str1 = a.t().c("lowVVPhotoPrefetchDownloadConfig", str);
       try{
          if (c.d() != null && (b.b.c(c.d().get(0).longValue(), c.d().get(1).longValue()) && !TextUtils.x(str1))) {
             b.b("PhotoPrefetchDownloadConfig", "hit low vv");
             return a.a.h(str1, uob);
          }else if(!TextUtils.x(obj)){
             return a.a.h(obj, uob);
          }
       }catch(com.google.gson.JsonSyntaxException e0){
          b.b("PhotoPrefetchDownloadConfig", Log.getStackTraceString(e0));
       }
       return null;
    }
    public static c l(){
       String obj = PatchProxy.apply(null, null, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().c("poorNetUsePrefetchConfig", "");
       try{
          if (!TextUtils.x(obj)) {
             return a.a.h(obj, c.class);
          }
       }catch(com.google.gson.JsonSyntaxException e0){
          b.b("PoorNetUsePrefetchConfig", Log.getStackTraceString(e0));
       }
       return null;
    }
}
