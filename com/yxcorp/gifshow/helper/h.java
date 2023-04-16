package com.yxcorp.gifshow.helper.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Application;
import o56.a;
import android.content.Context;
import androidx.core.app.e;
import qra.r;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.helper.PushNotifyAuthoritySource;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Integer;
import org.json.JSONObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import k2b.u1;
import android.app.Activity;
import android.os.Build$VERSION;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kzc.d;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import qra.m;
import u07.u;
import qra.o;
import com.yxcorp.gifshow.helper.f;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import u07.a;
import com.yxcorp.gifshow.helper.h$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import android.net.Uri;
import java.lang.Exception;

public final class h	// class@001639
{

    public void h(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.e(a.b()).a();
    }
    public static void b(r p0,String p1,String p2){
       String str;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, h.class, "5")) {
          return;
       }
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.page2 = p0.a.mPageName;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PUSH_OPEN_GUIDE_DIALOG";
       p0 = p0.c;
       int len = (p0 != null)? p0.length: 0;
       try{
          if (PatchProxy.isSupport(h.class)) {
             str = PatchProxy.applyThreeRefs(p1, p2, Integer.valueOf(len), null, h.class, "6");
             if (str != PatchProxyResult.class) {
             }
          }
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("dialog_id", "107");
          jSONObject.put("dialog_scenes_type", p1);
          jSONObject.put("dialog_click_type", p2);
          jSONObject.put("avatar_cnt", len);
          str = jSONObject.toString();
       }catch(org.json.JSONException e0){
       }
       uElementPack.params = str;
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.type = 1;
       uClickEvent.elementPackage = uElementPack;
       uClickEvent.urlPackage = urlPackage;
       u1.z(null, uClickEvent);
       return;
    }
    public static void c(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, h.class, "9")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 26) {
          Intent intent = new Intent();
          intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
          intent.putExtra("android.provider.extra.APP_PACKAGE", p0.getPackageName());
          intent.putExtra("android.provider.extra.CHANNEL_ID", p0.getApplicationInfo().uid);
          p0.startActivity(intent);
       }else {
          h.g(p0);
       }
       return;
    }
    public static void d(r p0,String p1){
       String str;
       h oh = h.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, oh, "7")) {
          return;
       }
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.page2 = p0.a.mPageName;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PUSH_OPEN_GUIDE_DIALOG";
       p0 = p0.c;
       int len = (p0 != null)? p0.length: 0;
       try{
          if (PatchProxy.isSupport(oh)) {
             str = PatchProxy.applyTwoRefs(p1, Integer.valueOf(len), null, oh, "8");
             if (str != PatchProxyResult.class) {
             }
          }
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("dialog_id", "107");
          jSONObject.put("dialog_scenes_type", p1);
          jSONObject.put("avatar_cnt", len);
          str = e0.toString();
       }catch(org.json.JSONException e0){
       }
       uElementPack.params = str;
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.type = 4;
       showEvent.elementPackage = uElementPack;
       showEvent.urlPackage = urlPackage;
       u1.z0(null, showEvent);
       return;
    }
    public static void e(GifshowActivity p0,r p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, h.class, "2")) {
          return;
       }
       d uod = new d(p0);
       uod.Z0(107);
       uod.B0(R.drawable.arg_RES_7f0805ba);
       uod.W0(R.string.arg_RES_7f10407a);
       uod.y0(R.string.arg_RES_7f10407b);
       uod.S0(R.string.arg_RES_7f10407c);
       uod.w0(false);
       uod.A(false);
       uod.u0(new m(p0, p1));
       uod.s0(new o(p1));
       uod.L(f.b);
       t$a uoa = a.b(uod);
       uoa.Y(new h$a(p1));
       return;
    }
    public static void f(Activity p0){
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, h.class, "11")) {
          return;
       }
       Intent intent = new Intent();
       intent.addFlags(0x10000000);
       intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
       intent.setData(Uri.fromParts("package", p0.getPackageName(), obj));
       p0.startActivity(intent);
       return;
    }
    public static void g(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, h.class, "10")) {
          return;
       }
       if (Build$VERSION.SDK_INT > 22) {
          try{
             h.f(p0);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
             h.h(p0);
          }
       }
    }
    public static void h(Activity p0){
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, h.class, "12")) {
          return;
       }
       Intent intent = new Intent();
       intent.addFlags(0x10000000);
       intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
       intent.setData(Uri.fromParts("package", p0.getPackageName(), obj));
       p0.startActivity(intent);
       return;
    }
}
