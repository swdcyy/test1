package com.yxcorp.gifshow.webview.c;
import java.lang.String;
import java.lang.Object;
import com.kwai.yoda.model.LaunchModel;
import android.content.Intent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import com.kwai.yoda.model.LaunchModelInternal;
import java.lang.Boolean;
import android.net.Uri;
import ekd.x0;
import com.kwai.yoda.model.LaunchModel$a;
import java.io.Serializable;
import java.lang.Throwable;
import yz7.r;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.os.SystemClock;
import java.lang.System;
import com.kwai.yoda.Yoda;
import com.kwai.yoda.cache.YodaXCache;
import com.yxcorp.gifshow.webview.c$a;
import sx7.i;
import android.os.Bundle;
import yb7.b;
import com.yxcorp.gifshow.webview.c$b;
import android.content.Context;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Integer;
import n3d.a;

public class c	// class@00173b
{
    public static final String[] a;

    static {
       String[] stringArray = new String[]{"fid","cc","kpn","subBiz","shareId"};
       c.a = stringArray;
    }
    public void c(){
       super();
    }
    public static LaunchModel a(LaunchModel p0,Intent p1,String p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       c.b(p0, p2);
       if (PatchProxy.applyTwoRefs(p0, p1, null, c.class, "11") != patchProxyRe) {
       }else {
          p2 = "ACTIONBAR_TITLE_COLOR";
          String str = j0.f(p1, p2);
          if (!TextUtils.x(str)) {
             p0.getExtras().put(p2, str);
          }
          p2 = "KEY_HIDE_ACTIONBAR";
          if (j0.g(p1, p2)) {
             p0.getExtras().put(p2, Boolean.toString(j0.a(p1, p2, false)));
          }
          if (j0.g(p1, "KEY_ENABLE_SWIPE_BACK")) {
             p0.getExtras().put("KEY_ENABLE_SWIPE_BACK", Boolean.toString(j0.a(p1, "KEY_ENABLE_SWIPE_BACK", true)));
          }
       }
       return p0;
    }
    public static LaunchModel b(LaunchModel p0,String p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Uri uri = Uri.parse(TextUtils.k(p1));
       if (uri != null && uri.isHierarchical()) {
          obj = "layoutType";
          String str = x0.a(uri, obj);
          if (!TextUtils.x(str)) {
             p0.getExtras().put(obj, str);
          }
          obj = "webview_bgcolor";
          str = x0.a(uri, obj);
          if (!TextUtils.x(str)) {
             p0.getExtras().put(obj, str);
          }
          obj = "title";
          str = x0.a(uri, obj);
          if (!TextUtils.x(str)) {
             p0.getExtras().put(obj, str);
          }
          uri = x0.a(uri, "loadingType");
          if (!TextUtils.x(uri)) {
             p0.setEnableProgress(false);
             p0.getExtras().put("loadingType", uri);
          }
       }
    label_0071 :
       return p0;
    }
    public static LaunchModel$a c(String p0,String p1){
       LaunchModel$a obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LaunchModel$a(p0);
       if (!TextUtils.x(p1)) {
          obj.c(p1);
       }
       return obj;
    }
    public static boolean d(Intent p0){
       Object obj3;
       String str1;
       String obj4;
       HashMap hashMap;
       Object obj = p0;
       String str = "model";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       String obj1 = null;
       LaunchModel obj2 = PatchProxy.applyOneRefs(obj, obj1, uoc, "13");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       if (obj == null) {
          return false;
       }
       try{
          obj2 = j0.e(obj, str);
       }catch(java.lang.Exception e0){
          r.f(e0);
          obj2 = obj1;
       }
       if (obj2 == null) {
          Uri uri = PatchProxy.applyOneRefs(obj, obj1, uoc, "14");
          if (uri != patchProxyRe) {
          }else if(p0.getData() == null){
             uri = p0.getData();
             if (uri.isHierarchical()) {
                obj3 = uri;
             label_0049 :
                if (obj3 != null) {
                   str1 = "backUri";
                   obj4 = PatchProxy.applyOneRefs(obj, obj1, uoc, "17");
                   if (obj4 != patchProxyRe) {
                   }else if(p0.getData() != null){
                      try{
                         obj4 = x0.a(p0.getData(), str1);
                         if (!TextUtils.x(obj4)) {
                            obj.putExtra(str1, URLDecoder.decode(obj4, "utf-8"));
                         }
                      }catch(java.io.UnsupportedEncodingException e0){
                         e0.printStackTrace();
                      }
                      str1 = x0.a(p0.getData(), "url");
                      if (!TextUtils.x(str1)) {
                         Uri data = p0.getData();
                         String[] obj5 = PatchProxy.applyTwoRefs(str1, data, obj1, uoc, "18");
                         if (obj5 != patchProxyRe) {
                            obj4 = obj5;
                         }else {
                            hashMap = new HashMap();
                            obj5 = c.a;
                            int len = obj5.length;
                            int i = 0;
                            while (i < len) {
                               object oobject = obj5[i];
                               String str2 = x0.a(data, oobject);
                               if (!TextUtils.x(str2)) {
                                  hashMap.put(oobject, str2);
                               }
                               i = i + 1;
                            }
                            obj4 = TextUtils.e(str1, hashMap);
                         }
                      }
                   }
                   obj4 = "";
                   str1 = x0.a(obj3, "bizId");
                }else {
                   obj4 = obj.getStringExtra("KEY_URL");
                   str1 = obj1;
                }
                if (TextUtils.x(obj4) && TextUtils.x(str1)) {
                   return false;
                }else {
                   hashMap = new HashMap();
                   if (!PatchProxy.applyVoidTwoRefs(obj3, hashMap, obj1, uoc, "15") && obj3 != null) {
                      Iterator iterator = obj3.getQueryParameterNames().iterator();
                      while (iterator.hasNext()) {
                         obj1 = iterator.next();
                         if ("url".equalsIgnoreCase(obj1)) {
                         }else {
                            Iterator iterator1 = obj3.getQueryParameters(TextUtils.k(obj1)).iterator();
                            while (iterator1.hasNext()) {
                               hashMap.put(obj1, iterator1.next());
                            }
                         }
                      }
                   }
                   LaunchModel$a uoa = c.c(obj4, str1);
                   uoa.h = hashMap;
                   c.f(uoa, obj);
                   obj2 = uoa.a();
                   if (TextUtils.x(obj2.getUrl())) {
                      return false;
                   }else {
                      c.a(obj2, obj, obj4);
                      SerializableHook.putExtra(obj, str, obj2);
                      obj.putExtra("KEY_URL", obj4);
                      obj.putExtra("KEY_LEFT_TOP_BTN_TYPE", "back");
                   }
                }
             }
          }
          obj3 = obj1;
          goto label_0049 ;
       }
       return true;
    }
    public static void e(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "1")) {
          return;
       }
       p0.putExtra("userIntentRealTime", SystemClock.elapsedRealtime());
       p0.putExtra("userIntentTimestamp", System.currentTimeMillis());
       return;
    }
    public static void f(LaunchModel$a p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "16")) {
          return;
       }
       HashMap hashMap = new HashMap(1);
       String str = j0.f(p1, "KEY_REFER");
       if (!TextUtils.x(str)) {
          hashMap.put("Refer", str);
       }
       if (!hashMap.isEmpty()) {
          p0.g = hashMap;
       }
       return;
    }
    public static void g(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "23")) {
          return;
       }
       String str = j0.f(p0, "KEY_URL");
       if (!Yoda.get().hasInit()) {
          return;
       }
       LaunchModel launchModel = j0.e(p0, "model");
       if (launchModel == null && !TextUtils.x(str)) {
          launchModel = new LaunchModel$a(str).a();
       }
       if (launchModel != null) {
          YodaXCache.n.t(launchModel, new c$a());
       }
       return;
    }
    public static void h(Bundle p0){
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, c.class, "24")) {
          return;
       }
       String str = b.d(p0, "KEY_URL", obj);
       if (!Yoda.get().hasInit()) {
          return;
       }
       LaunchModel launchModel = b.c(p0, "model");
       if (launchModel == null && !TextUtils.x(str)) {
          launchModel = new LaunchModel$a(str).a();
       }
       if (launchModel != null) {
          YodaXCache.n.t(launchModel, new c$b());
       }
       return;
    }
    public static void i(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "2")) {
          return;
       }
       if (p1 != null && p0 != null) {
          if (!p0 instanceof Activity) {
             p1.addFlags(0x10000000);
          }
          c.e(p1);
          p0.startActivity(p1);
       }
       return;
    }
    public static void j(GifshowActivity p0,Intent p1,int p2){
       if (PatchProxy.isSupport2(c.class, "3") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), null, c.class, "3")) {
          return;
       }
       if (p0 == null) {
          PatchProxy.onMethodExit(c.class, "3");
          return;
       }else {
          c.e(p1);
          p0.startActivityForResult(p1, p2);
          PatchProxy.onMethodExit(c.class, "3");
          return;
       }
    }
    public static void k(GifshowActivity p0,Intent p1,int p2,a p3){
       if (PatchProxy.isSupport2(c.class, "4") && PatchProxy.applyVoidFourRefsWithListener(p0, p1, Integer.valueOf(p2), p3, null, c.class, "4")) {
          return;
       }
       if (p1 == null || p0 == null) {
          PatchProxy.onMethodExit(c.class, "4");
          return;
       }else {
          c.e(p1);
          p0.t1(p1, p2, p3);
          PatchProxy.onMethodExit(c.class, "4");
          return;
       }
    }
}
