package com.yxcorp.gifshow.util.PermissionUtils;
import com.yxcorp.gifshow.util.PermissionUtils$1;
import com.yxcorp.gifshow.util.PermissionUtils$2;
import java.util.ArrayList;
import com.kwai.component.misc.collector.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.misc.collector.a;
import com.yxcorp.gifshow.util.PermissionUtils$b;
import wwb.f;
import com.yxcorp.gifshow.permission.a;
import android.content.Context;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import lnc.b1;
import android.app.Application;
import o56.a;
import androidx.core.content.ContextCompat;
import java.lang.Exception;
import com.yxcorp.utility.Log;
import vk7.g0;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import k2b.u1;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import brd.t;
import com.tbruyelle.rxpermissions2.g;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import zq8.a;
import java.util.Arrays;
import com.yxcorp.gifshow.util.PermissionUtils$a;
import erd.g;
import lnc.z5;
import java.util.HashMap;
import java.lang.Boolean;
import lnc.a6;
import java.util.Map;
import android.os.Build$VERSION;
import java.lang.StringBuilder;
import android.content.res.Resources;
import java.util.Objects;
import kzc.d;
import u07.t$a;
import lnc.y5;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import lnc.x5;
import com.yxcorp.utility.RomUtils;
import android.content.Intent;
import android.net.Uri;
import ekd.w0;

public class PermissionUtils	// class@001338
{
    public static List a;
    public static List b;
    public static List c;

    static {
       PermissionUtils.a = new PermissionUtils$1();
       PermissionUtils.b = new PermissionUtils$2();
       PermissionUtils.c = new ArrayList();
       if (PatchProxy.applyVoid(null, null, b.class, "1")) {
       }else {
          PermissionUtils.e(a.a);
       }
       if (!PatchProxy.applyVoid(null, null, f.class, "1")) {
          PermissionUtils.e(a.a);
       }
    }
    public static boolean a(Context p0,String p1){
       boolean b = false;
       if (p0 != null && !TextUtils.x(p1)) {
          if (PermissionUtils.r(p1)) {
             if (!p0.checkSelfPermission(p1)) {
                b = true;
             }
             return b;
          }else if(("android.permission.READ_CONTACTS").equals(p1) && b.a(0x90bbf25) != null){
             try{
                if (!ContextCompat.checkSelfPermission(a.b(), "android.permission.READ_CONTACTS")) {
                   b = true;
                }
             }catch(java.lang.Exception e4){
                Log.d("ContactPermissionManager", e4.getMessage());
             }
             return b;
          }else if(!g0.a(p0, p1)){
             b = true;
          }
       }
       return b;
    }
    public static boolean b(Context p0,List p1,List p2,int p3){
       ClientEvent$ElementPackage uElementPack;
       if (p1 == null || p2 == null) {
          return false;
       }
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
                   if (PermissionUtils.a(p0, iterator.next())) {
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
                   u1.g0(showEvent);
                   return true;
                }
             }
             return false;
          }
       }
       return false;
    }
    public static void c(Activity p0,boolean p1,boolean p2){
       if (p1) {
          PermissionUtils.d(p0, PermissionUtils.a, 0x7883);
       }
       if (p2) {
          PermissionUtils.d(p0, PermissionUtils.b, 0x7914);
       }
       return;
    }
    public static void d(Context p0,List p1,int p2){
       ClientEvent$ElementPackage uElementPack;
       double d;
       if (p1 == null) {
          return;
       }
       int i = 0;
       Iterator iterator = p1.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (PermissionUtils.a(p0, iterator.next())) {
                i = 1;
             }
          }
          uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = p2;
          d = (i)? 0x3ff0000000000000: 2.00f;
          break ;
       }
       uElementPack.value = d;
       u1.u(1, uElementPack, null);
       return;
    }
    public static void e(PermissionUtils$b p0){
       PermissionUtils.c.add(p0);
    }
    public static t f(Activity p0,String p1){
       return PermissionUtils.g(new g(p0), p0, p1);
    }
    public static t g(g p0,Activity p1,String p2){
       return PermissionUtils.h(p0, p1, p2, true);
    }
    public static t h(g p0,Activity p1,String p2,boolean p3){
       return PermissionUtils.i(p0, p1, p2, p3, null);
    }
    public static t i(g p0,Activity p1,String p2,boolean p3,KwaiDialogOption p4){
       boolean b = true;
       if (PermissionUtils.a(p1, p2)) {
          return t.just(new a(p2, b));
       }
       String[] stringArray = new String[b];
       stringArray[0] = p2;
       stringArray = new String[b];
       stringArray[0] = p2;
       stringArray = new String[b];
       stringArray[0] = p2;
       PermissionUtils$a uoa = new PermissionUtils$a(p1, PermissionUtils.b(p1, Arrays.asList(stringArray), PermissionUtils.a, 0x7882), PermissionUtils.b(p1, Arrays.asList(stringArray), PermissionUtils.b, 0x7913), p3, p2, PermissionUtils.l(p1, p2), p4);
       return p0.e(stringArray).doOnNext(v8);
    }
    public static t j(Activity p0,String[] p1){
       return new g(p0).d(p1).doOnNext(new z5(p0, PermissionUtils.b(p0, Arrays.asList(p1), PermissionUtils.a, 0x7882), PermissionUtils.b(p0, Arrays.asList(p1), PermissionUtils.b, 0x7913)));
    }
    public static t k(Activity p0,String[] p1){
       if (p0 != null && (p0.isFinishing() || p0.isDestroyed())) {
          return t.empty();
       }
       HashMap hashMap = new HashMap();
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p1[i];
          boolean b = PermissionUtils.l(p0, oobject);
          if (!b && PermissionUtils.a(p0, oobject)) {
             b = true;
          }
          hashMap.put(oobject, Boolean.valueOf(b));
       }
       return PermissionUtils.j(p0, p1).doOnNext(new a6(hashMap, p0));
    }
    public static boolean l(Activity p0,String p1){
       boolean b = (Build$VERSION.SDK_INT >= 23 && p0.shouldShowRequestPermissionRationale(p1))? true: false;
       return b;
    }
    public static void m(Activity p0,KwaiDialogOption p1,String[] p2){
       StringBuilder str = "";
       int len = p2.length;
       int i = 0;
       String str1 = 1;
       while (i < len) {
          object oobject = p2[i];
          if (!PermissionUtils.a(p0, oobject)) {
             Resources resources = p0.getResources();
             Objects.requireNonNull(oobject);
             int i1 = -1;
             switch (oobject.hashCode()){
                 case 0x8f6e743f:
                   if (!oobject.equals("android.permission.ACCESS_FINE_LOCATION")) {
                   label_0079 :
                      str1 = -1;
                   }else {
                      str1 = 0;
                   }
                   break;
                 case 0xe7cc5230:
                   if (!oobject.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                      goto label_0079 ;
                   }
                   break;
                 case 0xfc3e53aa:
                   if (!oobject.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                      goto label_0079 ;
                   }else {
                      str1 = 2;
                   }
                   break;
                 case 0xffaaf457:
                   if (!oobject.equals("android.permission.READ_PHONE_STATE")) {
                      goto label_0079 ;
                   }else {
                      str1 = 3;
                   }
                   break;
                 case 0x1b9efa65:
                   if (!oobject.equals("android.permission.CAMERA")) {
                      goto label_0079 ;
                   }else {
                      str1 = 4;
                   }
                   break;
                 case 0x516a29a7:
                   if (!oobject.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                      goto label_0079 ;
                   }else {
                      str1 = 5;
                   }
                   break;
                 case 0x6d24f988:
                   if (!oobject.equals("android.permission.RECORD_AUDIO")) {
                      goto label_0079 ;
                   }else {
                      str1 = 6;
                   }
                   break;
                 case 0x75dd2d9c:
                   if (!oobject.equals("android.permission.READ_CONTACTS")) {
                      goto label_0079 ;
                   }else {
                      str1 = 7;
                   }
                   break;
                 default:
                   goto label_0079 ;
             }
             switch (str1){
                 case 0:
                 case 2:
                   i1 = 0x7f1042ac;
                   break;
                 case 1:
                 case 5:
                   i1 = 0x7f1042aa;
                   break;
                 case 3:
                   i1 = 0x7f1042af;
                   break;
                 case 4:
                   i1 = 0x7f1042a8;
                   break;
                 case 6:
                   i1 = 0x7f1042b0;
                   break;
                 case 7:
                   i1 = 0x7f1042ae;
                   break;
                 default:
             }
             str = str+resources.getString(i1)+10;
          }
          i = i + 1;
       }
       if (str.length()) {
          str.deleteCharAt((str.length() - str1));
       }
       if (TextUtils.x(str)) {
          return;
       }else {
          d uod = new d(p0);
          if (p1 != null) {
             uod.b1(p1);
          }
          uod.z0(str);
          uod.S0(R.string.arg_RES_7f103a83);
          uod.Q0(R.string.cancel);
          uod.u0(new y5(p0));
          uod.v(str1);
          f.e(uod).Y(PopupInterface.a);
          return;
       }
    }
    public static void n(Activity p0,String[] p1){
       PermissionUtils.m(p0, null, p1);
    }
    public static void o(Activity p0,String p1){
       if (TextUtils.x(p1)) {
          return;
       }
       t$a uoa = new t$a(p0);
       uoa.z0(p1);
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.Q0(R.string.cancel);
       uoa.u0(new x5(p0));
       uoa.v(true);
       f.e(uoa).Y(PopupInterface.a);
       return;
    }
    public static void p(Activity p0){
       if (!RomUtils.q()) {
          PermissionUtils.q(p0);
          return;
       }else {
          Intent intent = new Intent();
          intent.setFlags(0x10000000);
          String str = RomUtils.i();
          String str1 = "extra_pkgname";
          if (("V6").equals(str) || ("V7").equals(str)) {
             intent.setAction("miui.intent.action.APP_PERM_EDITOR");
             intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
             intent.putExtra(str1, p0.getPackageName());
          }else if(("V8").equals(str) || ("V9").equals(str)){
             intent.setAction("miui.intent.action.APP_PERM_EDITOR");
             intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
             intent.putExtra(str1, p0.getPackageName());
          }else {
             intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
             intent.setData(w0.d("package", p0.getPackageName(), null));
          }
          p0.startActivity(intent);
          return;
       }
    }
    public static void q(Activity p0){
       Intent intent = new Intent();
       intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
       intent.setData(w0.d("package", p0.getPackageName(), null));
       p0.startActivity(intent);
    }
    public static boolean r(String p0){
       boolean b = (Build$VERSION.SDK_INT >= 31 && (("android.permission.CAMERA").equals(p0) || ("android.permission.RECORD_AUDIO").equals(p0)))? true: false;
       return b;
    }
    public static boolean s(Activity p0){
       try{
          if (RomUtils.q()) {
             PermissionUtils.p(p0);
          }else {
             PermissionUtils.q(p0);
          }
          return true;
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          return false;
       }
    }
}
