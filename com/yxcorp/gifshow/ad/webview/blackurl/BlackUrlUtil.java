package com.yxcorp.gifshow.ad.webview.blackurl.BlackUrlUtil;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.ad.webview.blackurl.BlackUrlUtil$UrlTrackInfo;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zk.d;
import com.google.gson.Gson;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.webview.AdYodaActivity;
import com.yxcorp.gifshow.ad.webview.AdYodaActivity2;
import android.content.Intent;
import ekd.j0;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import tw.j;
import java.util.List;
import erd.o;
import java.lang.Boolean;
import java.lang.System;
import java.lang.Iterable;
import brd.t;
import java.util.Objects;
import l59.e;
import erd.g;
import io.reactivex.internal.functions.Functions;
import l59.f;
import erd.a;
import crd.b;
import com.kuaishou.webkit.WebResourceResponse;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.Integer;
import wkd.b;
import mxb.j0;
import l59.d;
import q35.c$a;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import q35.c;
import o56.a;
import yx.j0;
import com.kuaishou.webkit.WebView;
import l59.g;
import java.lang.StringBuilder;
import android.widget.AbsoluteLayout;
import android.view.View;
import l59.c;
import android.view.View$OnClickListener;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.google.gson.JsonArray;
import java.lang.Throwable;

public class BlackUrlUtil	// class@0018b5
{
    public static final List a;
    public static final List b;
    public static long c;

    static {
       BlackUrlUtil.a = new ArrayList();
       BlackUrlUtil.b = new ArrayList();
       BlackUrlUtil.c = 0;
    }
    public void BlackUrlUtil(){
       super();
    }
    public static JsonObject a(String p0,String p1,BlackUrlUtil$UrlTrackInfo p2){
       Gson obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, BlackUrlUtil.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d().b();
       String str = obj.q(p2.mHistoryUrlList);
       String str1 = obj.q(p2.mUrlFailedInfoList);
       String str2 = obj.q(p2.stackTrace);
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("loadUrl", p0);
       jsonObject.c0("riskUrl", p1);
       jsonObject.c0("loadPageHistory", str);
       jsonObject.c0("errorHistory", str1);
       jsonObject.c0("trace", str2);
       return jsonObject;
    }
    public static String b(Activity p0,BaseFeed p1){
       String str = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, str, BlackUrlUtil.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof AdYodaActivity || p0 instanceof AdYodaActivity2) {
          str = j0.f(p0.getIntent(), "KEY_URL");
       }
       if (TextUtils.isEmpty(str) && p1 != null) {
          PhotoAdvertisement photoAdverti = j.k(p1);
          if (photoAdverti != null) {
             str = photoAdverti.mUrl;
          }
       }
       return str;
    }
    public static synchronized List c(List p0,String p1,o p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       _monitor_enter(BlackUrlUtil.class);
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, BlackUrlUtil.class, "4");
       if (obj != patchProxyRe) {
          _monitor_exit(BlackUrlUtil.class);
          return obj;
       }else {
          obj = PatchProxy.applyOneRefs(p0, null, BlackUrlUtil.class, "2");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(!p0.size() || (System.currentTimeMillis() - BlackUrlUtil.c) - 0x15180 >= 0){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             _monitor_exit(BlackUrlUtil.class);
             return p0;
          }else if(BlackUrlUtil.i(p1) != null){
             BlackUrlUtil.c = System.currentTimeMillis();
             Objects.requireNonNull(p0);
             t.fromIterable(p0).map(p2).subscribe(new e(p0), Functions.d(), Functions.c, new f(p0));
          }
          _monitor_exit(BlackUrlUtil.class);
          return p0;
       }
    }
    public static WebResourceResponse d(){
       Object obj = PatchProxy.apply(null, null, BlackUrlUtil.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WebResourceResponse("text/html", "utf-8", new ByteArrayInputStream(("").getBytes()));
    }
    public static String e(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, BlackUrlUtil.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (p0.trim()).toLowerCase();
       obj = ".apk";
       if (p0.contains(obj)) {
          p0 = p0.substring(0, (p0.indexOf(obj) + 4));
       }else {
          obj = "?";
          if (p0.contains(obj)) {
             p0 = p0.substring(0, p0.lastIndexOf(obj));
          }
       }
       return p0;
    }
    public static String f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BlackUrlUtil.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.trim();
       while (p0.endsWith("/")) {
          int i = p0.length() - 1;
          p0 = p0.substring(0, i);
       }
       return p0;
    }
    public static synchronized void g(String p0,String p1,BaseFeed p2,int p3,BlackUrlUtil$UrlTrackInfo p4,boolean p5){
       _monitor_enter(BlackUrlUtil.class);
       if (PatchProxy.isSupport(BlackUrlUtil.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, BlackUrlUtil.class, "14")) {
             _monitor_exit(BlackUrlUtil.class);
             return;
          }
       }
       p4.snapshotThreadTrace();
       b.a(0x1332c7d4).e(916, p2).d(new d(p3, p1, p0, p5)).a();
       c$a uoa = c$a.b();
       uoa.d(BusinessType.OTHER);
       uoa.e("ks_ad_lading_page_balcklist_detected");
       uoa.h("ks_ad_lading_page_balcklist");
       uoa.f(BlackUrlUtil.a(p0, p1, p4));
       c uoc = uoa.a();
       if (a.d()) {
          Object[] objArray1 = new Object[0];
          j0.a("BlackUrlUtil", uoc.toString(), objArray1);
       }
       j0.g(uoc);
       _monitor_exit(BlackUrlUtil.class);
       return;
    }
    public static void h(WebView p0,Object p1,Activity p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, BlackUrlUtil.class, "6")) {
          return;
       }
       if (!p1 instanceof g) {
          p1 = new Object[0];
          j0.c("BlackUrlUtil", "obj:"+p1.getClass().getName()+" was not BlackUrlViewGetter", p1);
          return;
       }else {
          p0.stopLoading();
          p0.setVisibility(8);
          View view = p1.d4();
          if (view != null) {
             view.setOnClickListener(new c(p2));
          }
          KwaiEmptyStateView kwaiEmptySta = p1.J0();
          if (kwaiEmptySta != null) {
             kwaiEmptySta.d(4);
             kwaiEmptySta.setVisibility(0);
             p1 = kwaiEmptySta.getLayoutParams();
             if (p1 instanceof RelativeLayout$LayoutParams) {
             }else {
                p1 = new RelativeLayout$LayoutParams(p1);
             }
             p1.setMargins(0, (int)TypedValue.applyDimension(3, 94.00f, c.c(p2.getResources())), 0, (int)TypedValue.applyDimension(3, 94.00f, c.c(p2.getResources())));
             kwaiEmptySta.setLayoutParams(p1);
             kwaiEmptySta.g(R.string.arg_RES_7f105181);
             kwaiEmptySta.i(R.drawable.arg_RES_7f0805d5);
          }
          return;
       }
    }
    public static List i(String p0){
       List list = null;
       String obj = PatchProxy.applyOneRefs(p0, list, BlackUrlUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().c(p0, list);
       Object[] objArray = new Object[0];
       j0.f("BlackUrlUtil", p0+":"+obj, objArray);
       if (!TextUtils.isEmpty(obj)) {
          list = new d().b().h(c.d(obj).g0("blackList").toString(), List.class);
       }
       return list;
    }
}
