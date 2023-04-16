package com.kuaishou.commercial.splash.i;
import java.lang.Object;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import lnc.i3;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import java.lang.StringBuilder;
import yx.j0;
import android.app.Activity;
import p49.c;
import p49.f;
import p49.e;
import yy.u;
import p49.a;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BusinessPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CustomV2;
import java.lang.CharSequence;
import android.text.TextUtils;
import g59.o;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import q2b.h$b;
import cz.b;
import com.kwai.robust.PatchProxyResult;
import cz.d;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Long;
import com.kuaishou.commercial.splash.SplashUtils;
import yy.v;
import cz.a;
import com.google.gson.JsonObject;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import yy.p;
import java.lang.Float;
import yy.w;
import yy.t;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.commercial.splash.f;
import ok.h;
import tl8.e;
import com.kuaishou.commercial.splash.g;
import android.net.Uri;
import ekd.x0;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.commercial.splash.h;
import java.lang.Runnable;
import t45.c;
import cz.c;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import lnc.y0;
import cz.e;
import java.util.Objects;

public class i	// class@0015b0
{
    public static String A = "REALTIME_PIC_DOWNLOAD_OVERTIME";
    public static String B = "REALTIME_PIC_LOAD_OVERTIME";
    public static String C = "REALTIME_PIC_INCORRECT_MATERIAL";
    public static String D = "REALTIME_PIC_PARSE_EXCEPTION";
    public static String E = "DAYNIGHT";
    public static String F = "FORWARD_TO_CAMERA";
    public static String G = "PUSH";
    public static String H = "LAHUO";
    public static String I = "URL_SCHEME_START";
    public static String J = "THIRD_APP_START";
    public static String K = "SplashAdLogger";
    public static String a = "KEEP_LIVE";
    public static String b = "BACKGROUND";
    public static String c = "OVERTIME";
    public static String d = "HOTSTART";
    public static String e = "PUSH";
    public static String f = "LAHUO";
    public static String g = "URL_SCHEME_START";
    public static String h = "THIRD_APP_START";
    public static String i = "PERSONALIZED_TAB";
    public static String j = "OTHER";
    public static String k = "MATERIAL_OVERTIME";
    public static String l = "EYEMAX_INSERT_FAILED";
    public static String m = "HOME_NOT_CREATED";
    public static String n = "NO_REQUEST";
    public static String o = "CACHE_DATA_NOT_EXISTS";
    public static String p = "MATERIAL_DATA_NOT_EXISTS";
    public static String q = "DATA_READ_FAILED";
    public static String r = "PLAY_VIDEO_FAILED";
    public static String s = "PLAY_VIDEO_ERROR";
    public static String t = "SHOW_IMAGE_FAILED";
    public static String u = "SHOW_IMAGE_ERROR";
    public static String v = "CLIPBOARD_FORBIDDEN";
    public static String w = "UNKNOWN";
    public static String x = "SPLASH_STATE_OVERTIME";
    public static String y = "REALTIME_PIC_LOAD_ERROR";
    public static String z = "REALTIME_PIC_START_DOWNLOAD_OVERTIME";

    public void i(){
       super();
    }
    public static void a(RequestTiming p0,i3 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, i.class, "19")) {
          return;
       }
       if (a.t().d("splashClientLogReportLaunchType", true)) {
          Object[] objArray = new Object[0];
          j0.f(i.K, "appendStartType: "+p0, objArray);
          if (p0 == RequestTiming.COLD_START) {
             p1.d("launch_type", "cold");
          }else if(p0 == RequestTiming.ON_HOME_PAGE_CREATED){
             p1.d("launch_type", "warm");
          }else {
             p1.d("launch_type", "hot");
          }
       }
       return;
    }
    public static void b(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i.class, "17")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       e.a(c.m).b(0.20f).h(new u(p0));
       return;
    }
    public static void c(RequestTiming p0,boolean p1,String p2,String p3,String p4,i3 p5){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, oi, "10")) {
             return;
          }
       }
       if (p1 && !d.a(-536296199).LG()) {
          return;
       }else {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$BusinessPackageV2 uBusinessPac = new ClientContent$BusinessPackageV2();
          uBusinessPac.businessLine = "品牌广告业务";
          ClientContent$CustomV2 uCustomV2 = new ClientContent$CustomV2();
          uCustomV2.isRealtime = p1;
          uCustomV2.failType = p2;
          if (!TextUtils.isEmpty(p3)) {
             uCustomV2.splashIdNew = p3;
          }
          if (!TextUtils.isEmpty(p4) && TextUtils.isDigitsOnly(p4)) {
             uCustomV2.llsid = o.b(p4, -1);
          }
          uContentPack.businessPackage = uBusinessPac;
          uBusinessPac.custom = uCustomV2;
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 89;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          if (p5 == null) {
             p5 = i3.f();
          }
          i.a(p0, p5);
          uElementPack.params = p5.e();
          h$b uob = h$b.e(8, "SENT_AD_REQUEST_TASK");
          uob.h(uContentPack);
          uob.u(urlPackage);
          uob.k(uElementPack);
          b.a(0x4b316083).J(uob);
          return;
       }
    }
    public static void d(b p0){
       b b;
       i3 oi3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, i.class, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       b uob1 = PatchProxy.apply(obj, p0, uob, "10");
       if (uob1 != patchProxyRe) {
       }else {
          p0.f(d.a.h(p0.g));
          uob1 = p0;
       }
       b g = uob1.g;
       b a = p0.a;
       b = p0.b;
       b c = p0.c;
       b f = p0.f;
       Object obj1 = PatchProxy.apply(obj, p0, uob, "9");
       if (obj1 != patchProxyRe) {
          oi3 = obj1;
       }else {
          i3 oi31 = i3.f();
          a.o(oi31, "JsonStringBuilder.newInstance\(\)");
          oi31.c("is_empty", Integer.valueOf(p0.d));
          oi31.c("is_realtime_show", Integer.valueOf(p0.h));
          uob = p0.i;
          if (uob > 0) {
             oi31.c("parse_json", Long.valueOf(uob));
          }
          uob = p0.j;
          if (uob > 0) {
             oi31.c("read_data", Long.valueOf(uob));
          }
          uob = p0.k;
          if (uob > 0) {
             oi31.c("read_material", Long.valueOf(uob));
          }
          if (!SplashUtils.B()) {
             oi31.d("request_status", "background");
          }
          oi31.c("is_eyemax", Integer.valueOf(p0.e));
          oi3 = oi31;
       }
       i.c(g, a, b, c, f, oi3);
       return;
    }
    public static void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i.class, "16")) {
          return;
       }
       e.a(c.u).b(0x3f800000).h(new v(p0));
       return;
    }
    public static void f(a p0){
       int i;
       int i2;
       PhotoAdvertisement photoAdverti = null;
       if (PatchProxy.applyVoidOneRefs(p0, photoAdverti, i.class, "13")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       c k = c.k;
       i = 1;
       if (p0.a == i) {
          k = c.I;
       }
       a h = p0.h;
       JsonObject jsonObject = PatchProxy.apply(photoAdverti, p0, a.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          jsonObject = new JsonObject();
          jsonObject.c0("splash_id", p0.b);
          jsonObject.a0("delete_reason", Integer.valueOf(p0.j));
          a i1 = p0.i;
          PhotoAdvertisement photoAdverti1 = -1;
          SplashInfo$SplashLocalRecordInfo mImpressionC = (i1 != null)? i1.mImpressionCount: -1;
          jsonObject.a0("impression_count", Integer.valueOf(mImpressionC));
          i1 = p0.i;
          mImpressionC = (i1 != null)? i1.mValidCarriedCount: -1;
          jsonObject.a0("valid_carried_count", Integer.valueOf(mImpressionC));
          i1 = p0.g;
          if (i1 != null) {
             photoAdverti = i1.get("AD");
          }
          PhotoAdvertisement mSourceType = (photoAdverti != null)? photoAdverti.mSourceType: -1;
          jsonObject.a0("sourceType", Integer.valueOf(mSourceType));
          if (photoAdverti != null) {
             photoAdverti1 = photoAdverti.mSourceType;
          }
          jsonObject.a0("source_type", Integer.valueOf(photoAdverti1));
          jsonObject.c0("llsid", p0.k);
          jsonObject.a0("disk_size", Long.valueOf(p0.l.k()));
          a h1 = p0.h;
          if (h1 != null) {
             jsonObject.H("ie_eyemax", Boolean.valueOf(h1));
             jsonObject.a0("splash_display_type", Integer.valueOf(i));
          }
          if (p0.a == i) {
             h1 = p0.c;
             if (h1 != null) {
                jsonObject.c0("material_name", h1);
             }
             jsonObject.a0("material_size", Long.valueOf(p0.d));
             jsonObject.a0("splash_material_preload_type", Integer.valueOf(p0.e));
          }else {
             jsonObject.a0("splash_material_type", Integer.valueOf(p0.f));
             jsonObject.a0("splash_material_preload_type", Integer.valueOf(p0.f));
          }
       }
       i.g(k, 0.20f, h, jsonObject);
       return;
    }
    public static void g(c p0,float p1,boolean p2,JsonObject p3){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(p0, Float.valueOf(p1), Boolean.valueOf(p2), p3, null, i.class, "14")) {
          return;
       }
       e.a(p0).b(p1).h(new w(p2, p3));
       return;
    }
    public static void h(long p0,long p1,boolean p2,int p3){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), Boolean.valueOf(p2), Integer.valueOf(p3), null, i.class, "12")) {
          return;
       }
       t ot = new t(p1, p0, p2, p3);
       e.a(c.J).b(0.00f).h(v8);
       return;
    }
    public static void i(String p0,boolean p1,int p2,int p3,BaseFeed p4,String p5,String p6,String p7,long p8,long p9,int p10){
       object oobject = p0;
       int i = p2;
       object oobject1 = p4;
       object oobject2 = p5;
       object oobject3 = p6;
       object oobject4 = p7;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[11];
          objArray[0] = oobject;
          objArray[1] = Boolean.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = oobject1;
          objArray[5] = oobject2;
          objArray[6] = oobject3;
          objArray[7] = oobject4;
          objArray[8] = Long.valueOf(p8);
          objArray[9] = Long.valueOf(p9);
          objArray[10] = Integer.valueOf(p10);
          if (PatchProxy.applyVoid(objArray, null, oi, "11")) {
             return;
          }
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$BusinessPackageV2 uBusinessPac = new ClientContent$BusinessPackageV2();
       uBusinessPac.businessLine = "BRAND";
       ClientContent$CustomV2 uCustomV2 = new ClientContent$CustomV2();
       uContentPack.businessPackage = uBusinessPac;
       uBusinessPac.custom = uCustomV2;
       if (!TextUtils.isEmpty(p0)) {
          uCustomV2.splashIdNew = oobject;
       }
       uCustomV2.llsid = o.b(oobject2, 0);
       if (!TextUtils.isEmpty(p6)) {
          uCustomV2.failType = oobject3;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.c("splash_material_preload_type", Integer.valueOf(p3));
       oi3.c("is_empty", Integer.valueOf(p1));
       oi3.c("download_delay_dur_ms", Long.valueOf(p9));
       oi3.c("splash_display_type", Integer.valueOf(p10));
       oi3.c("source_type", Integer.valueOf(e.d(oobject1, "AD", f.b)));
       oi3.c("sourceType", Integer.valueOf(e.d(oobject1, "AD", g.b)));
       if (!TextUtils.isEmpty(p7)) {
          oi3.d("material_url", oobject4);
       }
       Uri uri = x0.f(p7);
       if (uri != null) {
          String lastPathSegm = uri.getLastPathSegment();
          if (!TextUtils.x(lastPathSegm)) {
             oi3.d("material_name", lastPathSegm);
          }
       }
       if (i == 7) {
          oi3.c("material_size", Long.valueOf(p8));
          if (SplashUtils.H(p4)) {
             oi3.c("eyemax_cached_duration_enough", Integer.valueOf(SplashUtils.E(p4)));
          }
       }
       uElementPack.params = oi3.e();
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.page = 89;
       h$b uob = h$b.e(p2, "SENT_AD_SPLASH_PRELOAD_REQUEST_TASK");
       uob.h(uContentPack);
       uob.u(urlPackage);
       uob.k(uElementPack);
       b.a(0x4b316083).J(uob);
       return;
    }
    public static void j(){
       if (PatchProxy.applyVoid(null, null, i.class, "1")) {
          return;
       }
       c.a(h.b);
       return;
    }
    public static void k(c p0){
       i3 oi3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       String obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, i.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       c g = p0.g;
       c uoc1 = PatchProxy.apply(obj, p0, uoc, "7");
       if (uoc1 != patchProxyRe) {
       }else {
          p0.a(d.a.h(p0.a));
          uoc1 = p0;
       }
       c a = uoc1.a;
       c b = p0.b;
       Object obj1 = PatchProxy.apply(obj, p0, uoc, "1");
       if (obj1 != patchProxyRe) {
          oi3 = obj1;
       }else {
          i3 oi31 = i3.f();
          a.o(oi31, "JsonStringBuilder.newInstance\(\)");
          obj = "is_empty";
          if (p0.h != null) {
             oi31.c(obj, Integer.valueOf(1));
          }else {
             oi31.c(obj, Integer.valueOf(0));
          }
          oi31.c("is_eyemax", Integer.valueOf(p0.d));
          oi31.c("is_realtime_show", Integer.valueOf(p0.c));
          c e = p0.e;
          if (e > 0) {
             oi31.c("read_params_dur_ms", Long.valueOf(e));
          }
          e = p0.f;
          if (e > 0) {
             oi31.c("request_dur_ms", Long.valueOf(e));
          }
          if (!SplashUtils.B()) {
             oi31.d("request_status", "background");
          }
          if (SplashUtils.I()) {
             oi31.c("splash_finish", Integer.valueOf(1));
          }
          oi3 = oi31;
       }
       i.p(a, true, g, b, oi3, "AD_SPLASH_REQUEST_FILITED");
       return;
    }
    public static void l(RequestTiming p0,boolean p1,String p2,List p3,List p4,i3 p5){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, oi, "2")) {
             return;
          }
       }
       if (p1 && !d.a(-536296199).LG()) {
          return;
       }else {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$BusinessPackageV2 uBusinessPac = new ClientContent$BusinessPackageV2();
          uBusinessPac.businessLine = "品牌广告业务";
          ClientContent$CustomV2 uCustomV2 = new ClientContent$CustomV2();
          uCustomV2.isRealtime = p1;
          if (!TextUtils.isEmpty(p2)) {
             uCustomV2.duration = p2;
          }
          uContentPack.businessPackage = uBusinessPac;
          uBusinessPac.custom = uCustomV2;
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 89;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          if (p5 == null) {
             p5 = i3.f();
          }
          if (!q.f(p3) && p3 instanceof ArrayList) {
             p5.d("splash_models", y0.y(p3));
          }
          if (!q.f(p4) && p4 instanceof ArrayList) {
             p5.d("splash_materials", y0.y(p4));
          }
          i.a(p0, p5);
          uElementPack.params = p5.e();
          h$b uob = h$b.e(1, "SENT_AD_REQUEST_TASK");
          uob.h(uContentPack);
          uob.u(urlPackage);
          uob.k(uElementPack);
          b.a(0x4b316083).J(uob);
          return;
       }
    }
    public static void m(RequestTiming p0,boolean p1,String p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, null, i.class, "6")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("error_cause", p2);
       i.c(p0, p1, i.j, "", "", oi3);
       return;
    }
    public static void n(RequestTiming p0,boolean p1,String p2,boolean p3,String p4){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, oi, "7")) {
             return;
          }
       }
       i3 oi3 = i3.f();
       if (!SplashUtils.B()) {
          oi3.d("response_status", "background");
       }
       oi3.c("is_empty", Integer.valueOf(p3));
       i.c(p0, p1, i.c, p2, p4, oi3);
       return;
    }
    public static void o(e p0){
       e e;
       i3 oi3;
       e h;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, i.class, "3")) {
          return;
       }
       Objects.requireNonNull(p0);
       e uoe1 = PatchProxy.apply(null, p0, uoe, "9");
       if (uoe1 != patchProxyRe) {
       }else {
          p0.d(d.a.h(p0.f));
          uoe1 = p0;
       }
       e f = uoe1.f;
       e a = p0.a;
       e b = p0.b;
       e = p0.e;
       Object obj = PatchProxy.apply(null, p0, uoe, "8");
       if (obj != patchProxyRe) {
          oi3 = obj;
       }else {
          i3 oi31 = i3.f();
          a.o(oi31, "JsonStringBuilder.newInstance\(\)");
          if (p0.a != null) {
             oi31.c("is_empty", Integer.valueOf(p0.d));
             oi31.c("is_eyemax", Integer.valueOf(p0.c));
             oi31.c("is_realtime_show", Integer.valueOf(y0.p(Boolean.valueOf(p0.j))));
             h = p0.h;
             if (h > 0) {
                oi31.c("read_params_dur_ms", Long.valueOf(h));
             }
             if (SplashUtils.I()) {
                oi31.c("splash_finish", Integer.valueOf(1));
             }
          }else {
             oi31.c("splash_models_count", Integer.valueOf(p0.k));
          }
          h = p0.i;
          if (h > 0) {
             oi31.c("request_dur_ms", Long.valueOf(h));
          }
          if (!SplashUtils.B()) {
             oi31.d("request_status", "background");
          }
          oi3 = oi31;
       }
       i.p(f, a, b, e, oi3, "SENT_AD_REQUEST_TASK");
       return;
    }
    public static void p(RequestTiming p0,boolean p1,String p2,String p3,i3 p4,String p5){
       int i;
       i oi = i.class;
       i = 1;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, oi, "5")) {
             return;
          }
       }
       if (p1 && !d.a(-536296199).LG()) {
          return;
       }else {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$BusinessPackageV2 uBusinessPac = new ClientContent$BusinessPackageV2();
          uBusinessPac.businessLine = "品牌广告业务";
          ClientContent$CustomV2 uCustomV2 = new ClientContent$CustomV2();
          uCustomV2.isRealtime = p1;
          int i1 = TextUtils.isEmpty(p2) ^ i;
          if (i1 && TextUtils.isDigitsOnly(p2)) {
             uCustomV2.splashId = Long.parseLong(p2);
          }
          if (i1) {
             uCustomV2.splashIdNew = p2;
          }
          if (!TextUtils.isEmpty(p3) && TextUtils.isDigitsOnly(p3)) {
             uCustomV2.llsid = Long.parseLong(p3);
          }
          uContentPack.businessPackage = uBusinessPac;
          uBusinessPac.custom = uCustomV2;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          if (p4 == null) {
             p4 = i3.f();
          }
          i.a(p0, p4);
          uElementPack.params = p4.e();
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 89;
          h$b uob = h$b.e(7, p5);
          uob.h(uContentPack);
          uob.u(urlPackage);
          uob.k(uElementPack);
          b.a(0x4b316083).J(uob);
          return;
       }
    }
}
