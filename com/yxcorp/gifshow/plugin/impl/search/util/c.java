package com.yxcorp.gifshow.plugin.impl.search.util.c;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import nyb.h;
import tkd.b;
import tkd.d;
import lyb.v;
import uy5.b;
import com.yxcorp.gifshow.plugin.impl.search.util.SearchLoadPolicy;
import brd.t;
import t45.d;
import brd.z;
import oyb.c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.text.TextUtils;
import java.lang.Integer;
import cl8.a;
import j06.d;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.plugin.impl.search.util.a;
import java.lang.Boolean;
import km8.b;
import android.content.SharedPreferences;
import o56.a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Long;
import sy5.a;
import java.lang.StringBuilder;
import com.google.gson.JsonObject;
import j06.e;
import java.lang.System;

public class c	// class@000fdb
{
    public static int a = 0;
    public static boolean b = false;
    public static long c;
    public static boolean d = false;
    public static boolean e;

    public void c(){
       super();
    }
    public static void a(PresenterV2 p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, null, c.class, "13")) {
          return;
       }
       int i = 0x560d43;
       if (b.a(i).d()) {
          p0.U7(d.a(-724669335).eS(p1));
       }else {
          b.g("addDetailSearchLayoutPresenter load async start");
          b.a(i).g(v.class, SearchLoadPolicy.SILENT).observeOn(d.a).subscribe(new c(p0, p1), Functions.d());
       }
       PatchProxy.onMethodExit(c.class, "13");
       return;
    }
    public static String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0) && TextUtils.isDigitsOnly(p0)) {
          p0 = a.a(Integer.parseInt(p0), false);
       }
       return p0;
    }
    public static String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(p0);
    }
    public static int d(){
       Object obj = PatchProxy.apply(null, null, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("startDownloadSearchPluginTime", 3);
    }
    public static g e(){
       Object obj = PatchProxy.apply(null, null, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b;
    }
    public static boolean f(){
       SharedPreferences obj = PatchProxy.apply(null, null, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.b("SearchDefaultPreferenceHelper");
       if ((a.m).equals(obj.getString("lastEdgeSearchVersionName", ""))) {
          c.b = false;
          return false;
       }else {
          c.b = true;
          g.a(obj.edit().putString("lastEdgeSearchVersionName", a.m));
          return true;
       }
    }
    public static boolean g(){
       Object obj = PatchProxy.apply(null, null, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(0x560d43).d();
    }
    public static void h(long p0,long p1,long p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), null, c.class, "17")) {
          return;
       }
       if (!c.b) {
          return;
       }
       a uoa = a.k();
       uoa.b("appLaunchFinishTime", c.c);
       uoa.b("startDownloadTime", p0);
       uoa.b("endDownloadTime", p1);
       uoa.b("endInstallTime", p2);
       uoa.a("launchSearchType", c.a);
       b.g("DownloadSearchPluginInfo"+uoa.i());
       e.b("search", "info", "search_first_edge_download_info", uoa.j(), null, false);
       return;
    }
    public static void i(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uoc, "15")) {
          return;
       }
       if (!c.f()) {
          return;
       }
       a uoa = a.k();
       uoa.f("hasDownloadPlugin", p0);
       uoa.a("launchSearchType", c.a);
       b.g("search_first_launch"+uoa.i());
       e.b("search", "info", "search_first_edge_launch", uoa.j(), null, false);
       return;
    }
    public static void j(boolean p0){
       long c;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uoc, "12")) {
          return;
       }
       if (c.e) {
          return;
       }
       c.e = true;
       a uoa = a.k();
       long l = (long)(c.d() * 1000);
       c = c.c;
       long l1 = (System.currentTimeMillis() - c) - l;
       if (l1 - null < 0) {
          return;
       }
       uoa.b("app_launch_finish_time", c).b("pre_load_search_plugin_delay_ms", l).b("total_load_time_ms", l1).f("launch_search_plugin_is_download", c.d).f("download_method_is_async", p0).f("search_plugin_is_load_succeed", c.g());
       b.g(uoa.i());
       e.a("search", "info", "SEARCH_FEATURE_DOWNLOAD_INFO", uoa.j());
       return;
    }
}
