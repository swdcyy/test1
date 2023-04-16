package com.kwai.moved.components.util.KsAlbumPermissionUtils;
import com.kwai.moved.components.util.KsAlbumPermissionUtils$1;
import com.kwai.moved.components.util.KsAlbumPermissionUtils$2;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import vk7.g0;
import java.util.List;
import java.lang.Integer;
import java.util.Iterator;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import g79.a;
import w69.x;
import o79.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.StringBuilder;
import androidx.fragment.app.FragmentActivity;
import brd.t;
import com.tbruyelle.rxpermissions2.g;
import android.app.Activity;
import zq8.a;
import java.util.Arrays;
import com.kwai.moved.components.util.a;
import erd.g;
import android.os.Build$VERSION;
import com.yxcorp.utility.RomUtils;
import android.content.Intent;
import android.net.Uri;
import ic7.d;
import java.lang.Exception;

public class KsAlbumPermissionUtils	// class@000f65
{
    public static List a;
    public static List b;

    static {
       KsAlbumPermissionUtils.a = new KsAlbumPermissionUtils$1();
       KsAlbumPermissionUtils.b = new KsAlbumPermissionUtils$2();
    }
    public void KsAlbumPermissionUtils(){
       super();
    }
    public static boolean a(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KsAlbumPermissionUtils.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || (!TextUtils.x(p1) && !g0.a(p0, p1))) {
          b = true;
       }
    label_0025 :
       return b;
    }
    public static boolean b(Context p0,List p1,List p2,int p3){
       ClientEvent$ElementPackage uElementPack;
       if (PatchProxy.isSupport(KsAlbumPermissionUtils.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, KsAlbumPermissionUtils.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p1 == null || p2 == null) {
          return false;
       }else {
          Iterator iterator = p1.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (p2.contains(iterator.next())) {
                   iterator = 1;
                }
             }else {
                iterator = null;
             }
             if (!iterator) {
                break ;
             }else {
                iterator = p2.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (KsAlbumPermissionUtils.a(p0, iterator.next())) {
                         uElementPack = 1;
                      }else {
                         continue ;
                      }
                   }else {
                      uElementPack = null;
                   }
                   if (uElementPack) {
                   }else {
                      uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action = p3;
                      ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
                      showEvent.type = 4;
                      showEvent.elementPackage = uElementPack;
                      a.c.f().h(showEvent);
                      return true;
                   }
                }
                return false;
             }
          }
          return false;
       }
    }
    public static void c(Context p0,List p1,int p2){
       double d;
       if (PatchProxy.isSupport(KsAlbumPermissionUtils.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, KsAlbumPermissionUtils.class, "5")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       boolean b = false;
       Iterator iterator = p1.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (KsAlbumPermissionUtils.a(p0, iterator.next())) {
                b = true;
             }
          }
          d uod = d.class;
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p2), Boolean.valueOf(b), null, uod, "20")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = p2;
             d = (b)? 0x3ff0000000000000: 2.00f;
             uElementPack.value = d;
             ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
             uClickEvent.type = 1;
             uClickEvent.elementPackage = uElementPack;
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             uClickEvent.urlPackage = urlPackage;
             urlPackage.params = "task_id="+d.a;
             a.c.f().e(uClickEvent);
             break ;
          }
          break ;
       }
       return;
    }
    public static t d(FragmentActivity p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KsAlbumPermissionUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsAlbumPermissionUtils.e(new g(p0), p0, p1);
    }
    public static t e(g p0,Activity p1,String p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, KsAlbumPermissionUtils.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (PatchProxy.isSupport(KsAlbumPermissionUtils.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.TRUE, null, KsAlbumPermissionUtils.class, "3");
          if (obj != patchProxyRe) {
          }else {
          label_002f :
             boolean b = true;
             if (KsAlbumPermissionUtils.a(p1, p2)) {
                obj = t.just(new a(p2, b));
             }else {
                String[] stringArray = new String[b];
                stringArray[0] = p2;
                stringArray = new String[b];
                stringArray[0] = p2;
                stringArray = new String[b];
                stringArray[0] = p2;
                a uoa = new a(p1, KsAlbumPermissionUtils.b(p1, Arrays.asList(stringArray), KsAlbumPermissionUtils.a, 0x7882), KsAlbumPermissionUtils.b(p1, Arrays.asList(stringArray), KsAlbumPermissionUtils.b, 0x7913), 1, p2, KsAlbumPermissionUtils.f(p1, p2));
                obj = p0.e(stringArray).doOnNext(v9);
             }
          }
       }else {
          goto label_002f ;
       }
       return obj;
    }
    public static boolean f(Activity p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KsAlbumPermissionUtils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Build$VERSION.SDK_INT >= 23 && p0.shouldShowRequestPermissionRationale(p1))? true: false;
       return b;
    }
    public static void g(Activity p0){
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, KsAlbumPermissionUtils.class, "12")) {
          return;
       }
       if (!RomUtils.q()) {
          KsAlbumPermissionUtils.h(p0);
          return;
       }else {
          Intent intent = new Intent();
          intent.setFlags(0x10000000);
          String str = RomUtils.i();
          if (("V6").equals(str) || ("V7").equals(str)) {
             intent.setAction("miui.intent.action.APP_PERM_EDITOR");
             intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
             intent.putExtra("extra_pkgname", p0.getPackageName());
          }else if(("V8").equals(str) || ("V9").equals(str)){
             intent.setAction("miui.intent.action.APP_PERM_EDITOR");
             intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
             intent.putExtra("extra_pkgname", p0.getPackageName());
          }else {
             intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
             intent.setData(d.b("package", p0.getPackageName(), obj));
          }
          p0.startActivity(intent);
          return;
       }
    }
    public static void h(Activity p0){
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, KsAlbumPermissionUtils.class, "11")) {
          return;
       }
       Intent intent = new Intent();
       intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
       intent.setData(d.b("package", p0.getPackageName(), obj));
       p0.startActivity(intent);
       return;
    }
    public static void i(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KsAlbumPermissionUtils.class, "10")) {
          return;
       }
       try{
          if (RomUtils.q()) {
             KsAlbumPermissionUtils.g(p0);
          }else {
             KsAlbumPermissionUtils.h(p0);
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
}
