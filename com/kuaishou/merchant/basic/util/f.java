package com.kuaishou.merchant.basic.util.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import android.app.Activity;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import us3.f;
import tkd.b;
import tkd.d;
import fs5.a;
import com.kuaishou.merchant.router.RouterConfig;
import com.kuaishou.merchant.router.b;
import androidx.fragment.app.c;
import ab4.f;
import ot3.v;
import z1.a;
import ot3.u;
import android.content.Context;
import us3.i;
import com.kwai.framework.model.feed.BaseFeed;
import p74.a;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import com.kuaishou.merchant.basic.util.e;
import lnc.c3$b;
import lnc.c3;
import o74.a;
import k2b.e0;
import java.lang.Exception;
import java.lang.Throwable;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.merchant.basic.util.FoldUtils;
import fs3.e;
import wp5.c;
import java.util.Collection;
import xkd.b;
import nb4.f;
import n04.a;
import q87.c;
import com.kuaishou.merchant.basic.MerchantYodaWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import androidx.fragment.app.FragmentActivity;
import ot3.s;
import rr3.r;
import qa4.e;
import java.util.UUID;
import qa4.f;
import com.kuaishou.merchant.preload.net.MethodRequest;
import java.util.Map;
import wkd.b;
import nf6.i;
import com.kuaishou.android.model.feed.k;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.util.HashMap;
import java.lang.StringBuilder;

public class f	// class@0015db
{
    public static String a = "useMerchantWeb";
    public static String b = "1";
    public static String c = "detail_feedId";
    public static String d = "detail_streamId";
    public static String e = "liveControllerHash";

    public void f(){
       super();
    }
    public static boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.x(p0)) {
          return b;
       }
       Uri uri = x0.f(p0);
       if (uri == null) {
          return b;
       }
       if (TextUtils.n(f.b, x0.a(uri, f.a))) {
          return true;
       }
       uri = uri.getHost();
       if (!TextUtils.n(uri, "www.kwaishop.com") && (!TextUtils.n(uri, "im.kwaishop.com") && (TextUtils.n(uri, "app.kwaixiaodian.com") || TextUtils.n(uri, "im.kwaixiaodian.com")))) {
          b = true;
       }
       return b;
    }
    public static boolean b(Activity p0,LiveMerchantBaseContext p1,String p2,f p3){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, f.class, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p2, null, f.class, "15");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(!TextUtils.x(p2) && (d.a(-1397441499).zU(p2) || p2.startsWith("kwaimerchant://"))){
          b = true;
       }else {
          b = false;
       }
       if (b && p1 != null) {
          b.q(p1.getMerchantSessionId(), p0, p2, null, p3);
          return true;
       }else {
          return false;
       }
    }
    public static void c(Activity p0,LiveMerchantBaseContext p1,String p2,c p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, f.class, "10")) {
          return;
       }
       f.d(p0, p1, p2, p3, null);
       return;
    }
    public static void d(Activity p0,LiveMerchantBaseContext p1,String p2,c p3,f p4){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uof, "11")) {
             return;
          }
       }
       if (p0 != null && !p0.isFinishing()) {
          if (f.b(p0, p1, p2, p4)) {
             return;
          }else if(!f.a.e(new v(p1)).h(new u(p3)).f(p0, f.o(p2, p1)).c()){
             f.f(p0, p2, p1.getLiveFeed());
          }
       }
       return;
    }
    public static void e(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "4")) {
          return;
       }
       f.h(p0, null, p1, null);
       return;
    }
    public static void f(Activity p0,String p1,BaseFeed p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "7")) {
          return;
       }
       f.h(p0, null, p1, p2);
       return;
    }
    public static void g(Activity p0,a p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "6")) {
          return;
       }
       f.h(p0, p1, p2, null);
       return;
    }
    public static void h(Activity p0,a p1,String p2,BaseFeed p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, f.class, "8")) {
          return;
       }
       f.i(p0, p1, p2, p3, false);
       return;
    }
    public static boolean i(Activity p0,a p1,String p2,BaseFeed p3,boolean p4){
       String obj;
       boolean b;
       object oobject = p0;
       object oobject1 = p3;
       f uof = f.class;
       int i = 0;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{oobject,p1,p2,oobject1,Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, uof, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.u(MerchantCommonLogBiz.ROUTER, "JumpUriUtils", "jumpToAnyUrl", "activity", c3.a(oobject, e.a), "url", p2);
       obj = (oobject instanceof e0)? oobject.o(): "";
       String str = obj;
       MerchantCommonLogBiz merchantComm = (p1 == null)? MerchantCommonLogBiz.UTILS: p1;
       if (TextUtils.x(p2)) {
          a.m(merchantComm, "JumpUriUtils", "jumpUrl is Empty", new Exception("jumpUrl is Empty").fillInStackTrace(), "page2", str);
          return i;
       }else {
          Uri uri = x0.f(p2);
          if (uri == null) {
             a.n(merchantComm, "JumpUriUtils", "fail to parse jumpUrl", new Exception("fail to parse jumpUrl").fillInStackTrace(), "page2", str, "url", p2);
             return i;
          }else if(oobject1 instanceof LiveStreamFeed && !FoldUtils.b(p0)){
             d.a(-1397441499).k1(p0, oobject1, "merchant_float_window", d.a(0x55e6228c).i0(), d.a(0x55e6228c).p());
          }
          if (b.f(uri)) {
             f.j(oobject, uri.toString());
             return 1;
          }else {
             b = f.n(oobject, uri, p4);
             if (!b && f.a("fail to jumpUrl")) {
                a.n(merchantComm, "JumpUriUtils", "fail to jumpUrl", new Exception("fail to jumpUrl").fillInStackTrace(), "page2", str, "url", p2);
             }
             return b;
          }
       }
    }
    public static void j(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "2")) {
          return;
       }
       if (p0 == null) {
          Object[] objArray = new Object[0];
          a.C().A("JumpUriUtils", "jumpToH5\(\), activity is null", objArray);
          return;
       }else {
          c.i(p0, KwaiYodaWebViewActivity.F3(p0, MerchantYodaWebViewActivity.class, p1).a());
          return;
       }
    }
    public static void k(Fragment p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, f.class, "26")) {
          return;
       }
       if (p0 != null && (!p0.isAdded() || p0.getActivity() == null)) {
          Object[] objArray = new Object[0];
          a.C().A("JumpUriUtils", "jumpToH5InFragment params error", objArray);
          return;
       }else {
          r.a(f.a.f(new s(p1, p0, p3)).f(p0.getActivity(), p2), p2);
          return;
       }
    }
    public static void l(Activity p0,String p1,LiveMerchantBaseContext p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "12")) {
          return;
       }
       f.m(p0, p1, p2, null);
       return;
    }
    public static void m(Activity p0,String p1,LiveMerchantBaseContext p2,f p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, f.class, "13")) {
          return;
       }
       if (p0 == null || (!p0.isFinishing() && !TextUtils.x(p1))) {
          if (f.b(p0, p2, p1, p3)) {
             return;
          }else if(p2 == null){
             f.f(p0, p1, null);
          }else {
             f.f(p0, f.p(f.o(p1, p2), p2), p2.getLiveFeed());
          }
       }
       return;
    }
    public static boolean n(Activity p0,Uri p1,boolean p2){
       String obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, f.class, "22");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = p1.toString();
       String str = null;
       String obj1 = PatchProxy.applyOneRefs(obj, str, uof, "23");
       if (obj1 != patchProxyRe) {
       }else {
          String str1 = e.d.d(obj);
          if (str1 != null) {
             obj1 = UUID.randomUUID().toString();
             f a = f.a;
             a.d(str1, new MethodRequest(str, obj).setTraceId(obj1));
             a.c(str1, obj1);
             str = obj1;
          }
          obj1 = str;
       }
       Intent intent = b.a(0x66dce92a).c(p0, p1, false, p2);
       if (intent != null) {
          if (obj1 != null) {
             intent.putExtra("preloadTraceId", obj1);
          }
          p0.startActivity(intent);
          return true;
       }else {
          return false;
       }
    }
    public static String o(String p0,LiveMerchantBaseContext p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 == null) {
          return p0;
       }
       if (p1.getLiveFeed() != null) {
          p0 = b.a(0x5f22eaa1).w(p0, p1.getLiveFeed().get("AD"));
       }
       if (!TextUtils.x(p1.getJumpParams())) {
          p0 = TextUtils.d(p0, p1.getJumpParams());
       }
       return p0;
    }
    public static String p(String p0,LiveMerchantBaseContext p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, uof, "18");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p1 != null) {
          Object obj2 = PatchProxy.applyOneRefs(p0, obj, uof, "19");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(!p0.startsWith("kwai://merchant/selfdetail") && (p0.startsWith("kwai://merchant/halfselfdetail") || p0.startsWith("kwai://merchant/detailv2"))){
             b = true;
          }else {
             b = false;
          }
          if (b && (p1.getLiveFeed() != null && p1.getLiveFeed() instanceof LiveStreamFeed)) {
             HashMap hashMap = new HashMap();
             hashMap.put(f.c, p1.getLiveFeed().getId());
             hashMap.put(f.d, p1.getLiveStreamId());
             hashMap.put(f.e, p1.getPlayerControllerHashCode()+"");
             p0 = TextUtils.e(p0, hashMap);
          }
       }
    label_0087 :
       return p0;
    }
}
