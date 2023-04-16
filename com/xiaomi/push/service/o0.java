package com.xiaomi.push.service.o0;
import java.lang.Object;
import android.content.Intent;
import com.xiaomi.push.id;
import java.lang.String;
import java.lang.Long;
import android.content.Context;
import java.util.Map;
import com.xiaomi.push.hx;
import com.xiaomi.push.hu;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.xiaomi.push.i;
import com.xiaomi.push.hh;
import com.xiaomi.push.is;
import com.xiaomi.push.service.g;
import ys8.b0;
import java.lang.System;
import java.util.Set;
import java.util.Iterator;
import java.lang.Throwable;
import rs8.c;
import com.xiaomi.push.service.k;
import com.xiaomi.push.service.k$c;
import ws8.b6;
import ws8.m6;
import ys8.c;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.p0;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.ig;
import com.xiaomi.push.service.f;
import com.xiaomi.push.service.d;
import com.xiaomi.push.service.e;
import android.app.Service;
import ws8.b2;
import ws8.y3;
import com.xiaomi.push.g;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.xiaomi.push.ii;
import com.xiaomi.push.service.h0;
import ys8.d1;
import ys8.d;
import ys8.l0;
import com.xiaomi.push.hr;
import ys8.v;
import java.lang.Integer;
import ys8.o;
import ys8.u;
import ws8.i6;
import com.xiaomi.push.gg;
import android.content.pm.PackageManager;
import java.util.List;
import java.util.HashMap;
import java.lang.Boolean;
import com.xiaomi.push.service.a;
import com.xiaomi.push.service.b;
import com.xiaomi.push.service.c;
import com.xiaomi.push.service.bg$b;
import com.xiaomi.push.service.l0;
import com.xiaomi.push.service.m0;
import ws8.p4;
import ws8.p5;
import ws8.o5;
import ws8.n5;
import ys8.a0;

public class o0	// class@00118a
{

    public void o0(){
       super();
    }
    public static Intent a(byte[] p0,long p1){
       id oid = o0.d(p0);
       if (oid == null) {
          return null;
       }
       Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
       intent.putExtra("mipush_payload", p0);
       intent.putExtra("mrt", Long.toString(p1));
       intent.setPackage(oid.b);
       return intent;
    }
    public static id b(Context p0,id p1){
       return o0.c(p0, p1, null);
    }
    public static id c(Context p0,id p1,Map p2){
       hx ohx = new hx();
       ohx.b(p1.a());
       hu ohu = p1.a();
       if (ohu != null) {
          ohx.a(ohu.a());
          ohx.a(ohu.a());
          if (!TextUtils.isEmpty(ohu.b())) {
             ohx.c(ohu.b());
          }
       }
       ohx.a(i.a(p0, p1));
       id oid = g.b(p1.b(), p1.a(), ohx, hh.f);
       hu ohu1 = p1.a();
       if (ohu1 != null) {
          ohu1 = ohu1.a();
          b0.a(ohu1);
       }
       ohu1.a("mat", Long.toString(System.currentTimeMillis()));
       if (p2 != null && p2.size() > 0) {
          Iterator iterator = p2.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             ohu1.a(str, p2.get(str));
          }
       }
       oid.a(ohu1);
       return oid;
    }
    public static id d(byte[] p0){
       id oid = new id();
       i.c(oid, p0);
       return oid;
    }
    public static void e(Context p0,id p1,byte[] p2){
       try{
          k.s(p1);
          p1.a();
          k$c uoc = k.q(p0, p1, p2);
          if (uoc.b - null > 0 && !TextUtils.isEmpty(uoc.a)) {
             b6.j(p0, uoc.a, uoc.b, true, false, System.currentTimeMillis());
          label_0028 :
             if (m6.j(p0) && c.e(p0, p1, uoc.c)) {
                c.b(p0, p1);
                c.l("consume this broadcast by tts");
             }else {
                o0.t(p0, p1, p2);
             }
          }else {
             goto label_0028 ;
          }
       }catch(java.lang.Exception e10){
          c.l("notify push msg error "+e10);
          e10.printStackTrace();
       }
       return;
    }
    public static void g(XMPushService p0,id p1){
       p0.a(new p0(4, p0, p1));
    }
    public static void h(XMPushService p0,id p1,ig p2){
       p0.a(new f(4, p2, p1, p0));
    }
    public static void i(XMPushService p0,id p1,String p2){
       p0.a(new d(4, p0, p1, p2));
    }
    public static void j(XMPushService p0,id p1,String p2,String p3){
       e uoe = new e(4, p0, p1, p2, p3);
       p0.a(v6);
    }
    public static void k(XMPushService p0,String p1,byte[] p2,Intent p3){
       String str2;
       y3 oy3;
       String str4;
       String str5;
       String str6;
       y3 oy31;
       hu a;
       XMPushService xMPushServic = p0;
       byte[] uobyteArray = p2;
       Intent intent = p3;
       id oid = o0.d(p2);
       hu ohu = oid.a();
       is ois = null;
       if (uobyteArray) {
          b2.f(oid.b(), p0.getApplicationContext(), ois, oid.a(), uobyteArray.length);
       }
       if (o0.x(oid) && o0.p(p0, p1)) {
          if (k.c0(oid)) {
             y3.a(p0.getApplicationContext()).g(oid.b(), k.Q(oid), ohu.a(), "5");
          }
          o0.w(xMPushServic, oid);
       }else if(o0.r(oid) && (!o0.p(p0, p1) && !o0.v(oid))){
          if (k.c0(oid)) {
             y3.a(p0.getApplicationContext()).g(oid.b(), k.Q(oid), ohu.a(), "6");
          }
          o0.y(xMPushServic, oid);
       }else if(!k.J(oid) || (g.o(xMPushServic, oid.b) || o0.o(xMPushServic, intent))){
          int i = 0;
          String str = "eventMessageType";
          String str1 = "messageId";
          if (hh.a == oid.a()) {
             str2 = oid.b();
             SharedPreferences$Editor uEditor = o.c(xMPushServic, "pref_registered_pkg_names", i).edit();
             uEditor.putString(str2, oid.a);
             g.b(uEditor);
             ii oii = h0.a(oid);
             if (!oii.a() && !TextUtils.isEmpty(oii.b())) {
                h0.c(xMPushServic, str2, oii.b());
             }else {
                c.u("read regSecret failed");
             }
             d1.a(p0).i(str2);
             d1.a(p0).j(str2);
             y3.a(p0.getApplicationContext()).f(str2, "E100003", ohu.a(), 6003, null);
             if (!TextUtils.isEmpty(ohu.a())) {
                intent.putExtra(str1, ohu.a());
                intent.putExtra(str, 6000);
             }
          }
          if (k.a0(oid)) {
             y3.a(p0.getApplicationContext()).e(oid.b(), k.Q(oid), ohu.a(), 1001, System.currentTimeMillis(), null);
             if (!TextUtils.isEmpty(ohu.a())) {
                intent.putExtra(str1, ohu.a());
                intent.putExtra(str, 1000);
             }
          }
          if (k.W(oid)) {
             y3.a(p0.getApplicationContext()).e(oid.b(), k.Q(oid), ohu.a(), 2001, System.currentTimeMillis(), null);
             if (!TextUtils.isEmpty(ohu.a())) {
                intent.putExtra(str1, ohu.a());
                intent.putExtra(str, 2000);
             }
          }
          if (k.J(oid)) {
             y3.a(p0.getApplicationContext()).e(oid.b(), k.Q(oid), ohu.a(), 3001, System.currentTimeMillis(), null);
             if (!TextUtils.isEmpty(ohu.a())) {
                intent.putExtra(str1, ohu.a());
                intent.putExtra(str, 3000);
             }
          }
          String str3 = 1;
          if (ohu != null && (!TextUtils.isEmpty(ohu.c()) && (!TextUtils.isEmpty(ohu.d()) && (ohu.b == str3 || k.H(xMPushServic, oid.b, k.L(ohu.a())))))) {
             if ("com.xiaomi.xmsf".contains(oid.b) && (!oid.b() && (ohu != null && (ohu.a() != null && ohu.a().containsKey("ab"))))) {
                o0.u(xMPushServic, oid);
                c.t("receive abtest message. ack it."+ohu.a());
             }else if(o0.s(xMPushServic, p1, oid, ohu)){
                if (ohu != null && !TextUtils.isEmpty(ohu.a())) {
                   if (k.W(oid)) {
                      oy3 = y3.a(p0.getApplicationContext());
                      str1 = oid.b();
                      str4 = k.Q(oid);
                      str2 = ohu.a();
                      str5 = null;
                   }else if(k.J(oid)){
                      oy31 = y3.a(p0.getApplicationContext());
                      str = oid.b();
                      str1 = k.Q(oid);
                      str4 = ohu.a();
                      str2 = "7";
                   }else if(k.a0(oid)){
                      oy31 = y3.a(p0.getApplicationContext());
                      str = oid.b();
                      str1 = k.Q(oid);
                      str4 = ohu.a();
                      str2 = "8";
                   }else if(k.b0(oid)){
                      oy3 = y3.a(p0.getApplicationContext());
                      str1 = oid.b();
                      str2 = ohu.a();
                      int i2 = 6004;
                      str5 = null;
                      str4 = "E100003";
                   }
                   oy31.g(str, str1, str4, str2);
                   oy3.f(str1, str4, str2, 2002, str5);
                }
             label_033c :
                if (hh.i == oid.a) {
                   try{
                      ois = l0.a(xMPushServic, oid);
                      if (ois == null) {
                         c.u("receiving an un-recognized notification message. "+oid.a);
                      }else {
                         str6 = 1;
                      label_0377 :
                         if (str6 && (ois instanceof ig && ((hr.C.a).equals(ois.d) && ois.a() != null))) {
                            str6 = ois.a().get(v.M);
                            int i1 = -2;
                            if (!TextUtils.isEmpty(str6)) {
                               try{
                                  i1 = Integer.parseInt(str6);
                               }catch(java.lang.NumberFormatException e0){
                                  c.l("parse notifyId from STRING to INT failed: "+e0);
                               }
                            }
                         }
                      }
                   }catch(com.xiaomi.push.ix e0){
                      c.u("receive a message which action string is not valid. "+e0);
                   }
                   str6 = null;
                   goto label_0377 ;
                }
             label_0423 :
                i = 1;
             label_0424 :
                if (i) {
                   c.l("broadcast passthrough message.");
                   xMPushServic.sendBroadcast(intent, g.e(oid.b));
                }
             }else {
                y3.a(p0.getApplicationContext()).g(oid.b(), k.Q(oid), ohu.a(), "9");
             }
          }else {
             a = ohu.a;
             if (a != null) {
                ois = a.get("jobkey");
             }
             if (TextUtils.isEmpty(ois)) {
                ois = ohu.a();
             }
             if (d.a(xMPushServic, oid.b, ois)) {
                y3.a(p0.getApplicationContext()).j(oid.b(), k.Q(oid), ohu.a(), "1:"+ois);
                str6 = "drop a duplicate message, key="+ois;
             }else if(m6.j(p0) && c.f(oid)){
                str6 = "receive pull down message";
             }else {
                o0.e(xMPushServic, oid, uobyteArray);
             label_026a :
                o0.u(xMPushServic, oid);
             }
             c.l(str6);
             goto label_026a ;
          }
          if (oid.a() == hh.b && !"com.xiaomi.xmsf".equals(p0.getPackageName())) {
             p0.stopSelf();
          }
       }else if(!g.o(xMPushServic, oid.b)){
          if (k.c0(oid)) {
             y3.a(p0.getApplicationContext()).i(oid.b(), k.Q(oid), ohu.a(), "2");
          }
          o0.g(xMPushServic, oid);
       }else {
          c.l("receive a mipush message, we can see the app, but we can\'t see the receiver.");
          if (k.c0(oid)) {
             y3.a(p0.getApplicationContext()).i(oid.b(), k.Q(oid), ohu.a(), "3");
          }
       }
       return;
    }
    public static void n(XMPushService p0,byte[] p1,long p2){
       id oid = o0.d(p1);
       if (oid == null) {
          return;
       }
       if (TextUtils.isEmpty(oid.b)) {
          c.l("receive a mipush message without package name");
          return;
       }else {
          Long longx = Long.valueOf(System.currentTimeMillis());
          Intent intent = o0.a(p1, longx.longValue());
          String str = k.s(oid);
          b6.j(p0, str, p2, true, true, System.currentTimeMillis());
          hu ohu = oid.a();
          if (ohu != null && ohu.a() != null) {
             Object[] objArray = new Object[]{oid.a(),u.b(ohu.a()),oid.a()};
             c.v(String.format("receive a message. appid=%1$s, msgid= %2$s, action=%3$s", objArray));
          }
          if (ohu != null) {
             ohu.a("mrt", Long.toString(longx.longValue()));
          }
          hh e = hh.e;
          String str1 = "";
          if (e == oid.a() && (d1.a(p0).c(oid.b) && !k.J(oid))) {
             if (ohu != null) {
                str1 = ohu.a();
                if (k.c0(oid)) {
                   y3.a(p0.getApplicationContext()).g(oid.b(), k.Q(oid), str1, "1");
                }
             }
             c.l("Drop a message for unregistered, msgid="+str1);
             o0.i(p0, oid, oid.b);
             return;
          }else if(e == oid.a() && (d1.a(p0).g(oid.b) && !k.J(oid))){
             if (ohu != null) {
                str1 = ohu.a();
                if (k.c0(oid)) {
                   y3.a(p0.getApplicationContext()).g(oid.b(), k.Q(oid), str1, "2");
                }
             }
             c.l("Drop a message for push closed, msgid="+str1);
             o0.i(p0, oid, oid.b);
             return;
          }else if(e == oid.a() && (!TextUtils.equals(p0.getPackageName(), "com.xiaomi.xmsf") && !TextUtils.equals(p0.getPackageName(), oid.b))){
             c.l("Receive a message with wrong package name, expect "+p0.getPackageName()+", received "+oid.b);
             o0.j(p0, oid, "unmatched_package", "package should be "+p0.getPackageName()+", but got "+oid.b);
             if (ohu != null && k.c0(oid)) {
                y3.a(p0.getApplicationContext()).g(oid.b(), k.Q(oid), ohu.a(), "3");
             }
             return;
          }else if(e == oid.a() && (i6.c() == 999 && i6.i(p0, str))){
             String str2 = "Receive the uninstalled dual app message";
             try{
                c.l(str2);
                g.i(p0, g.a(str, oid.a()));
                c.l("uninstall "+str+" msg sent");
             }catch(com.xiaomi.push.gg e13){
                c.u("Fail to send Message: "+e13.getMessage());
                p0.a(10, e13);
             }
             k.x(p0, str);
             return;
          }else if(ohu != null){
             Map map = ohu.a();
             if (map != null) {
                String str3 = "hide";
                if (map.containsKey(str3) && ("true").equalsIgnoreCase(map.get(str3))) {
                   o0.u(p0, oid);
                   return;
                }
             }
          }
          o0.k(p0, str, p1, intent);
          return;
       }
    }
    public static boolean o(Context p0,Intent p1){
       boolean b;
       PackageManager packageManag = p0.getPackageManager();
       try{
          int i = 32;
          List list = packageManag.queryBroadcastReceivers(p1, i);
          b = (list != null && !list.isEmpty())? true: false;
       }catch(java.lang.Exception e0){
       }
       return b;
    }
    public static boolean p(Context p0,String p1){
       Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
       intent.setPackage(p1);
       Intent intent1 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
       intent1.setPackage(p1);
       PackageManager packageManag = p0.getPackageManager();
       boolean b = false;
       try{
          int i = 32;
          List list = packageManag.queryIntentServices(intent, i);
          if (!packageManag.queryBroadcastReceivers(intent1, i).isEmpty() || !list.isEmpty()) {
             b = true;
          }
          return b;
       }catch(java.lang.Exception e3){
          c.o(e3);
          return b;
       }
    }
    public static boolean q(Context p0,String p1,byte[] p2){
       int i = 0;
       if (g.k(p0, p1)) {
          Intent intent = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
          intent.putExtra("mipush_payload", p2);
          try{
             intent.setPackage(p1);
             if (!p0.getPackageManager().queryBroadcastReceivers(intent, i).isEmpty()) {
                c.l("broadcast message arrived.");
                p0.sendBroadcast(intent, g.e(p1));
                i = true;
             }
          }catch(java.lang.Exception e3){
             c.l("meet error when broadcast message arrived. "+e3);
          }
       }
    }
    public static boolean r(id p0){
       boolean b = (("com.xiaomi.xmsf").equals(p0.b) && (p0.a() != null && (p0.a().a() != null && p0.a().a().containsKey("miui_package_name"))))? true: false;
       return b;
    }
    public static boolean s(XMPushService p0,String p1,id p2,hu p3){
       boolean b = true;
       if (p3 != null && (p3.a() != null && p3.a().containsKey("__check_alive"))) {
          String str = "__awake";
          if (p3.a().containsKey(str)) {
             ig oig = new ig();
             oig.b(p2.a());
             oig.d(p1);
             oig.c(hr.H.a);
             oig.a(p3.a());
             oig.a = new HashMap();
             boolean b1 = g.k(p0.getApplicationContext(), p1);
             oig.a.put("app_running", Boolean.toString(b1));
             if (!b1) {
                b1 = Boolean.parseBoolean(p3.a().get(str));
                oig.a.put("awaked", Boolean.toString(b1));
                if (!b1) {
                   b = false;
                }
             }
             id oid = g.b(p2.b(), p2.a(), oig, hh.i);
             try{
                g.i(p0, oid);
             }catch(com.xiaomi.push.gg e6){
                c.o(e6);
             }
          }
       }
    }
    public static void t(Context p0,id p1,byte[] p2){
       if (k.J(p1)) {
          return;
       }
       String str = k.s(p1);
       if (TextUtils.isEmpty(str)) {
          return;
       }
       if (!o0.q(p0, str, p2)) {
          y3.a(p0).i(str, k.Q(p1), p1.a().a(), "1");
       }
       return;
    }
    public static void u(XMPushService p0,id p1){
       p0.a(new a(4, p0, p1));
    }
    public static boolean v(id p0){
       Map map = p0.a().a();
       boolean b = (map != null && map.containsKey("notify_effect"))? true: false;
       return b;
    }
    public static void w(XMPushService p0,id p1){
       p0.a(new b(4, p0, p1));
    }
    public static boolean x(id p0){
       if (p0.a() == null || p0.a().a() == null) {
          return false;
       }
       return ("1").equals(p0.a().a().get("obslete_ads_message"));
    }
    public static void y(XMPushService p0,id p1){
       p0.a(new c(4, p0, p1));
    }
    public void f(Context p0,bg$b p1,boolean p2,int p3,String p4){
       if (!p2) {
          l0 ol0 = m0.b(p0);
          if (ol0 != null && ("token-expired").equals(p4)) {
             m0.c(p0, ol0.f, ol0.d, ol0.e);
          }
       }
       return;
    }
    public void l(XMPushService p0,p4 p1,bg$b p2){
       try{
          o0.n(p0, p1.o(p2.i), (long)p1.t());
       }catch(java.lang.IllegalArgumentException e3){
          c.o(e3);
       }
       return;
    }
    public void m(XMPushService p0,p5 p1,bg$b p2){
       if (p1 instanceof o5) {
          p5 op5 = p1;
          n5 on5 = op5.f("s");
          if (on5 != null) {
             try{
                o0.n(p0, a0.h(a0.g(p2.i, op5.l()), on5.i()), (long)b6.b(p1.d()));
             }catch(java.lang.IllegalArgumentException e3){
                c.o(e3);
             }
          }
       }else {
          c.l("not a mipush message");
       }
    }
}
