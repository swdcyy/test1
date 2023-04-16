package com.xiaomi.mipush.sdk.f;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.util.Map;
import android.content.Intent;
import com.xiaomi.push.service.k;
import vs8.f0;
import android.content.SharedPreferences;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collection;
import ws8.p0;
import android.content.SharedPreferences$Editor;
import ws8.d7;
import com.xiaomi.mipush.sdk.PushMessageHandler$a;
import java.lang.StringBuilder;
import rs8.c;
import java.lang.System;
import java.lang.Long;
import ws8.y3;
import com.xiaomi.push.id;
import com.xiaomi.push.is;
import com.xiaomi.push.i;
import com.xiaomi.push.hu;
import com.xiaomi.push.hh;
import vs8.v0;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import java.lang.Throwable;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import vs8.r;
import vs8.s;
import ws8.x3;
import vs8.w;
import java.lang.Enum;
import ws8.b2;
import com.xiaomi.push.hy;
import com.xiaomi.push.hr;
import com.xiaomi.mipush.sdk.au;
import vs8.x;
import com.xiaomi.push.ig;
import java.util.List;
import com.xiaomi.push.hv;
import java.util.Iterator;
import ys8.r;
import com.xiaomi.push.hm;
import vs8.r0;
import com.xiaomi.push.if;
import ys8.s;
import com.xiaomi.push.ie;
import vs8.d0;
import ys8.v;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import java.lang.NumberFormatException;
import com.xiaomi.push.ii;
import vs8.l;
import com.xiaomi.push.io;
import ys8.x0;
import com.xiaomi.push.ic;
import com.xiaomi.push.ex;
import java.util.TimeZone;
import vs8.n;
import com.xiaomi.push.iq;
import java.util.ArrayList;
import com.xiaomi.push.im;
import android.os.SystemClock;
import vs8.d;
import com.xiaomi.push.ik;
import com.xiaomi.push.ht;
import java.util.HashMap;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.push.service.k$c;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import oe6.o;
import java.lang.Math;
import oe6.g;
import ws8.x0;
import java.lang.Boolean;
import com.xiaomi.push.hw;
import ys8.b0;
import com.xiaomi.push.hx;
import com.xiaomi.mipush.sdk.e;
import vs8.o0;
import com.xiaomi.mipush.sdk.ag;
import vs8.l0;
import ys8.o;
import com.xiaomi.push.g;

public class f	// class@0010f0
{
    public Context a;
    public static f b;
    public static Queue c;
    public static Object d;

    static {
       f.d = new Object();
    }
    public void f(Context p0){
       super();
       Context applicationC = p0.getApplicationContext();
       this.a = applicationC;
       if (applicationC == null) {
          this.a = p0;
       }
       return;
    }
    public static Intent a(Context p0,String p1,Map p2,int p3){
       return k.P(p0, p1, p2, p3);
    }
    public static f e(Context p0){
       if (f.b == null) {
          f.b = new f(p0);
       }
       return f.b;
    }
    public static boolean m(Context p0,String p1){
       Object d = f.d;
       _monitor_enter(d);
       f0.d(p0);
       SharedPreferences sharedPrefer = f0.b(p0);
       if (f.c == null) {
          String[] stringArray = (sharedPrefer.getString("pref_msg_ids", "")).split(",");
          f.c = new LinkedList();
          int len = stringArray.length;
          for (int i = 0; i < len; i = i + 1) {
             f.c.add(stringArray[i]);
          }
       }
       if (f.c.contains(p1)) {
          _monitor_exit(d);
          return true;
       }else {
          f.c.add(p1);
          if (f.c.size() > 25) {
             f.c.poll();
          }
          SharedPreferences$Editor uEditor = sharedPrefer.edit();
          uEditor.putString("pref_msg_ids", p0.d(f.c, ","));
          d7.a(uEditor);
          _monitor_exit(d);
          return false;
       }
    }
    public PushMessageHandler$a b(Intent p0){
       y3 oy3;
       String str2;
       Object[] objArray;
       Object[] objArray1;
       id oid1;
       f uof = this;
       Intent intent = p0;
       String action = p0.getAction();
       c.l("receive an intent from server, action="+action);
       String str = "mrt";
       String stringExtra = intent.getStringExtra(str);
       if (stringExtra == null) {
          stringExtra = Long.toString(System.currentTimeMillis());
       }
       String stringExtra1 = intent.getStringExtra("messageId");
       int intExtra = intent.getIntExtra("eventMessageType", -1);
       String str1 = "mipush_payload";
       boolean b = false;
       if (("com.xiaomi.mipush.RECEIVE_MESSAGE").equals(action)) {
          byte[] byteArrayExt = intent.getByteArrayExtra(str1);
          boolean booleanExtra = intent.getBooleanExtra("mipush_notified", b);
          if (byteArrayExt == null) {
             c.u("receiving an empty message, drop");
             y3.a(uof.a).d(uof.a.getPackageName(), intent, "12");
             return null;
          }else {
             try{
                id oid = new id();
                i.c(oid, byteArrayExt);
                f0 uof0 = f0.d(uof.a);
                hu ohu = oid.a();
                hh e = hh.e;
                if (oid.a() == e && (ohu != null && (!uof0.w() && !booleanExtra))) {
                   ohu.a(str, stringExtra);
                   ohu.a("mat", Long.toString(System.currentTimeMillis()));
                   if (!uof.n(oid)) {
                      uof.p(oid);
                   }else {
                      c.s("this is a mina\'s message, ack later");
                      ohu.a("__hybrid_message_ts", String.valueOf(ohu.a()));
                      ohu.a("__hybrid_device_status", String.valueOf(i.a(uof.a, oid)));
                   }
                }
                stringExtra = "";
                if (oid.a() == e && !oid.b()) {
                   if (k.J(oid)) {
                      str = "drop an un-encrypted wake-up messages. %1$s, %2$s";
                      objArray = new Object[2];
                      objArray[0] = oid.b();
                      if (ohu != null) {
                         stringExtra = ohu.a();
                      }
                      objArray[1] = stringExtra;
                      c.l(String.format(str, objArray));
                      oy3 = y3.a(uof.a);
                      stringExtra = uof.a.getPackageName();
                      objArray1 = new Object[]{oid.b()};
                      str1 = String.format("13: %1$s", objArray1);
                   }else {
                      str = "drop an un-encrypted messages. %1$s, %2$s";
                      objArray = new Object[2];
                      objArray[0] = oid.b();
                      if (ohu != null) {
                         stringExtra = ohu.a();
                      }
                      objArray[1] = stringExtra;
                      c.l(String.format(str, objArray));
                      oy3 = y3.a(uof.a);
                      stringExtra = uof.a.getPackageName();
                      objArray1 = new Object[]{oid.b()};
                      str1 = String.format("14: %1$s", objArray1);
                   }
                   oy3.d(stringExtra, intent, str1);
                   oid.c(uof.a, oid, booleanExtra);
                   return null;
                }else if(oid.a() == e && (oid.b() && (!k.J(oid) || (booleanExtra && (ohu != null && (ohu.a() != null && ohu.a().containsKey("notify_effect"))))))){
                   if (!uof0.s() && oid.a != hh.a) {
                      if (k.J(oid)) {
                         return this.c(oid, booleanExtra, byteArrayExt, stringExtra1, intExtra, p0);
                      }else {
                         oid.h(uof.a, oid, booleanExtra);
                         boolean b1 = uof0.u();
                         c.u("receive message without registration. need re-register!registered?"+b1);
                         y3.a(uof.a).d(uof.a.getPackageName(), intent, "15");
                         if (b1) {
                            this.g();
                         }
                      }
                   }else if(uof0.s() && uof0.y()){
                      if (oid.a == hh.b) {
                         if (oid.b()) {
                            uof0.e();
                            MiPushClient.clearExtras(uof.a);
                            PushMessageHandler.a();
                         }else {
                            c.u("receiving an un-encrypt unregistration message");
                         }
                      }else {
                         oid.h(uof.a, oid, booleanExtra);
                         MiPushClient.unregisterPush(uof.a);
                      }
                   }else {
                      return this.c(oid, booleanExtra, byteArrayExt, stringExtra1, intExtra, p0);
                   }
                }else {
                   str = "drop a wake-up messages which not has \'notify_effect\' attr. %1$s, %2$s";
                   objArray = new Object[2];
                   objArray[0] = oid.b();
                   if (ohu != null) {
                      stringExtra = ohu.a();
                   }
                   objArray[1] = stringExtra;
                   c.l(String.format(str, objArray));
                   objArray1 = new Object[]{oid.b()};
                   y3.a(uof.a).d(uof.a.getPackageName(), intent, String.format("25: %1$s", objArray1));
                   oid.e(uof.a, oid, booleanExtra);
                   return null;
                }
             }catch(com.xiaomi.push.ix e0){
                oy3 = y3.a(uof.a);
                stringExtra = uof.a.getPackageName();
                str2 = "16";
             }catch(java.lang.Exception e0){
                oy3 = y3.a(uof.a);
                stringExtra = uof.a.getPackageName();
                str2 = "17";
             }
             oy3.d(stringExtra, intent, str2);
             c.o(e0);
          }
       }else if(("com.xiaomi.mipush.ERROR").equals(action)){
          MiPushCommandMessage miPushComman = new MiPushCommandMessage();
          try{
             oid1 = new id();
             byte[] byteArrayExt1 = intent.getByteArrayExtra(str1);
             if (byteArrayExt1 != null) {
                i.c(oid1, byteArrayExt1);
             }
             e0.setCommand(String.valueOf(oid1.a()));
             e0.setResultCode((long)intent.getIntExtra("mipush_error_code", b));
             e0.setReason(intent.getStringExtra("mipush_error_msg"));
             c.u("receive a error message. code = "+intent.getIntExtra("mipush_error_code", b)+", msg= "+intent.getStringExtra("mipush_error_msg"));
             return e0;
          }catch(com.xiaomi.push.ix e0){
          }
       }else if(("com.xiaomi.mipush.MESSAGE_ARRIVED").equals(action)){
          byte[] byteArrayExt2 = intent.getByteArrayExtra(str1);
          if (byteArrayExt2 == null) {
             c.u("message arrived: receiving an empty message, drop");
             return null;
          }else {
             oid1 = new id();
             i.c(oid1, byteArrayExt2);
             f0 uof01 = f0.d(uof.a);
             if (k.J(oid1)) {
                action = "message arrived: receive ignore reg message, ignore!";
             }else if(!uof01.s()){
                action = "message arrived: receive message without registration. need unregister or re-register!";
             }else if(uof01.s() && uof01.y()){
                action = "message arrived: app info is invalidated";
             }else {
                return uof.d(oid1, byteArrayExt2);
             }
             c.u(action);
          }
       }
       return null;
    }
    public final PushMessageHandler$a c(id p0,boolean p1,byte[] p2,String p3,int p4,Intent p5){
       y3 oy3;
       String packageName;
       String str1;
       String str2;
       id a;
       String str3;
       String str4;
       String str5;
       Intent intent;
       hu ohu;
       long l;
       f a2;
       y3 oy31;
       String packageName1;
       ex g;
       String str7;
       f uof = this;
       id oid = p0;
       boolean b = p1;
       byte[] uobyteArray = p2;
       String str = p3;
       int i = p4;
       r or = r.class;
       PushMessageHandler$a uoa = null;
       try{
          is ois = s.d(uof.a, oid);
          if (ois == null) {
             c.u("receiving an un-recognized message. "+oid.a);
             y3.a(uof.a).i(uof.a.getPackageName(), x3.e(p4), str, "18");
             uof.a.f(uof.a, oid, b);
             return uoa;
          }else {
             try{
                hh ohh = p0.a();
                c.l("processing a message, action="+ohh);
                int i1 = 1;
                boolean b1 = false;
                int i2 = 0;
                switch (w.a[ohh.ordinal()]){
                    case 1:
                      if (!p0.b()) {
                         c.u("receiving an un-encrypt message\(SendMessage\).");
                         return uoa;
                      }else if(f0.d(uof.a).w() && !b){
                         c.l("receive a message in pause state. drop it");
                         y3.a(uof.a).g(uof.a.getPackageName(), x3.e(p4), str, "12");
                         return uoa;
                      }else {
                         ht oht = ois.a();
                         if (oht == null) {
                            c.u("receive an empty message without push content, drop it");
                            y3.a(uof.a).i(uof.a.getPackageName(), x3.e(p4), str, "22");
                            uof.a.g(uof.a, oid, b);
                            return uoa;
                         }else {
                            int intExtra = p5.getIntExtra("notification_click_button", i2);
                            if (b) {
                               if (k.J(p0)) {
                                  MiPushClient.reportIgnoreRegMessageClicked(uof.a, oht.a(), p0.a(), oid.b, oht.b());
                               }else if(p0.a() != null){
                                  ohu = new hu(p0.a());
                               }else {
                                  ohu = new hu();
                               }
                               if (ohu.a() == null) {
                                  ohu.a(new HashMap());
                               }
                               ohu.a().put("notification_click_button", String.valueOf(intExtra));
                               MiPushClient.reportMessageClicked(uof.a, oht.a(), ohu, oht.b());
                            }
                            if (!b) {
                               if (!TextUtils.isEmpty(ois.d()) && MiPushClient.aliasSetTime(uof.a, ois.d()) - b1 < 0) {
                                  MiPushClient.addAlias(uof.a, ois.d());
                               }else if(!TextUtils.isEmpty(ois.c()) && MiPushClient.topicSubscribedTime(uof.a, ois.c()) - b1 < 0){
                                  MiPushClient.addTopic(uof.a, ois.c());
                               }
                            }
                            a = oid.a;
                            if (a != null && a.a() != null) {
                               str3 = oid.a.a.get("jobkey");
                               str4 = str3;
                            }else {
                               str3 = null;
                               str4 = null;
                            }
                            if (TextUtils.isEmpty(str3)) {
                               str3 = oht.a();
                            }
                            if (!b && f.m(uof.a, str3)) {
                               c.l("drop a duplicate message, key="+str3);
                               y3.a(uof.a).j(uof.a.getPackageName(), x3.e(p4), str, "2:"+str3);
                               uoa = null;
                            }else {
                               MiPushMessage miPushMessag = n.b(ois, p0.a(), b);
                               if (!miPushMessag.getPassThrough() && (!b && k.L(miPushMessag.getExtra()))) {
                                  k.q(uof.a, oid, uobyteArray);
                               }else {
                                  c.l("receive a message, msgid="+oht.a()+", jobkey="+str3+", btn="+intExtra);
                                  str5 = k.t(miPushMessag.getExtra(), intExtra);
                                  if (b && (miPushMessag.getExtra() != null && !TextUtils.isEmpty(str5))) {
                                     Map extra = miPushMessag.getExtra();
                                     if (intExtra && p0.a() != null) {
                                        x.l(uof.a).o(p0.a().c(), intExtra);
                                     }
                                     if (k.J(p0)) {
                                        intent = f.a(uof.a, oid.b, extra, intExtra);
                                        intent.putExtra("eventMessageType", i);
                                        intent.putExtra("messageId", str);
                                        intent.putExtra("jobkey", str4);
                                        packageName = oht.c();
                                        if (!TextUtils.isEmpty(packageName)) {
                                           intent.putExtra("payload", packageName);
                                        }
                                        uof.a.startActivity(intent);
                                        str5.b(uof.a, oid);
                                        y3.a(uof.a).f(uof.a.getPackageName(), x3.e(p4), p3, 3006, str5);
                                     }else {
                                        f a1 = uof.a;
                                        intent = f.a(a1, a1.getPackageName(), extra, intExtra);
                                        if (intent != null) {
                                           if (!str5.equals(v.c)) {
                                              SerializableHook.putExtra(intent, "key_message", miPushMessag);
                                              intent.putExtra("eventMessageType", i);
                                              intent.putExtra("messageId", str);
                                              intent.putExtra("jobkey", str4);
                                           }
                                           uof.a.startActivity(intent);
                                           str5.b(uof.a, oid);
                                           c.l("start activity succ");
                                           y3.a(uof.a).f(uof.a.getPackageName(), x3.e(p4), p3, 1006, str5);
                                           if (str5.equals(v.c)) {
                                              y3.a(uof.a).g(uof.a.getPackageName(), x3.e(p4), str, "13");
                                           }
                                        }
                                     }
                                     return null;
                                  }else {
                                     MiPushMessage miPushMessag1 = miPushMessag;
                                  }
                               }
                            }
                            if (p0.a() == null && !b) {
                               uof.k(ois, oid);
                            }
                            return uoa;
                         }
                      }
                      break;
                    case 2:
                      is ois1 = ois;
                      f0 d = f0.d(uof.a).d;
                      if (TextUtils.isEmpty(d) || !TextUtils.equals(d, ois1.a())) {
                         c.l("bad Registration result:");
                         y3.a(uof.a).i(uof.a.getPackageName(), x3.e(p4), str, "21");
                         return uoa;
                      }else {
                         l = x.l(uof.a).b();
                         if (l - b1 > 0 && (SystemClock.elapsedRealtime() - l) - 0xdbba0 > 0) {
                            c.l("The received registration result has expired.");
                            y3.a(uof.a).i(uof.a.getPackageName(), x3.e(p4), str, "26");
                            return uoa;
                         }else {
                            f0.d(uof.a).d = uoa;
                            a2 = uof.a;
                            if (!ois1.a - b1) {
                               f0.d(a2).o(ois1.e, ois1.f, ois1.l);
                               d.a(uof.a);
                               oy31 = y3.a(uof.a);
                               packageName1 = uof.a.getPackageName();
                               packageName = x3.e(p4);
                               str1 = "1";
                            }else {
                               oy31 = y3.a(a2);
                               packageName1 = uof.a.getPackageName();
                               packageName = x3.e(p4);
                               str1 = "2";
                            }
                            oy31.f(packageName1, packageName, p3, 6006, str1);
                            if (!TextUtils.isEmpty(ois1.e)) {
                               uoa = new ArrayList();
                               uoa.add(ois1.e);
                            }
                            x.l(uof.a).X();
                            return n.a(ex.a.a, uoa, ois1.a, ois1.d, null, ois1.a());
                         }
                      }
                      break;
                    case 3:
                      if (!p0.b()) {
                         c.u("receiving an un-encrypt message\(UnRegistration\).");
                         return uoa;
                      }else if(!ois.a - b1){
                         f0.d(uof.a).e();
                         MiPushClient.clearExtras(uof.a);
                      }
                      PushMessageHandler.a();
                      break;
                    case 4:
                      if (!ois.a - b1) {
                         MiPushClient.addTopic(uof.a, ois.b());
                      }
                      if (!TextUtils.isEmpty(ois.b())) {
                         uoa = new ArrayList();
                         uoa.add(ois.b());
                      }
                      g = ex.g;
                      c.v("resp-cmd:"+g+", "+ois.a());
                      return n.a(g.a, uoa, ois.a, ois.d, ois.c(), null);
                      break;
                    case 5:
                      if (!ois.a - b1) {
                         MiPushClient.removeTopic(uof.a, ois.b());
                      }
                      if (!TextUtils.isEmpty(ois.b())) {
                         uoa = new ArrayList();
                         uoa.add(ois.b());
                      }
                      g = ex.h;
                      c.v("resp-cmd:"+g+", "+ois.a());
                      return n.a(g.a, uoa, ois.a, ois.d, ois.c(), null);
                      break;
                    case 6:
                      b2.f(uof.a.getPackageName(), uof.a, ois, hh.j, uobyteArray.length);
                      String str6 = ois.b();
                      List list = ois.a();
                      if (!ois.a - b1) {
                         if (TextUtils.equals(str6, ex.i.a) && (list != null && list.size() > i1)) {
                            MiPushClient.addAcceptTime(uof.a, list.get(i2), list.get(i1));
                            if (("00:00").equals(list.get(i2)) && ("00:00").equals(list.get(i1))) {
                               f0.d(uof.a).j(i1);
                            }else {
                               f0.d(uof.a).j(i2);
                            }
                            list = uof.f(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), list);
                         }else if(TextUtils.equals(str6, ex.c.a) && (list != null && list.size() > 0)){
                            MiPushClient.addAlias(uof.a, list.get(i2));
                         }else if(TextUtils.equals(str6, ex.d.a) && (list != null && list.size() > 0)){
                            MiPushClient.removeAlias(uof.a, list.get(i2));
                         }else if(TextUtils.equals(str6, ex.e.a) && (list != null && list.size() > 0)){
                            MiPushClient.addAccount(uof.a, list.get(i2));
                         }else if(TextUtils.equals(str6, ex.f.a) && (list != null && list.size() > 0)){
                            MiPushClient.removeAccount(uof.a, list.get(i2));
                         }else if(TextUtils.equals(str6, ex.j.a)){
                            return uoa;
                         }
                      }
                      c.v("resp-cmd:"+str6+", "+ois.a());
                      return n.a(str6, list, ois.a, ois.d, ois.c(), null);
                      break;
                    case 7:
                      b2.f(uof.a.getPackageName(), uof.a, ois, hh.i, uobyteArray.length);
                      if (ois instanceof hy) {
                         str5 = ois.a();
                         c.v("resp-type:"+ois.b()+", code:"+ois.a+", "+str5);
                         au uoau = 10;
                         if ((hr.E.a).equalsIgnoreCase(ois.d)) {
                            if (!ois.a - b1) {
                               _monitor_enter(or);
                               if (r.c(uof.a).f(str5)) {
                                  r.c(uof.a).h(str5);
                                  uoau = au.a;
                                  if (("syncing").equals(r.c(uof.a).b(uoau))) {
                                     r.c(uof.a).d(uoau, "synced");
                                     MiPushClient.clearNotification(uof.a);
                                     MiPushClient.clearLocalNotificationType(uof.a);
                                     PushMessageHandler.a();
                                     x.l(uof.a).N();
                                  }
                               }
                               _monitor_exit(or);
                            }else if(("syncing").equals(r.c(uof.a).b(au.a))){
                               _monitor_enter(or);
                               if (r.c(uof.a).f(str5)) {
                                  if (r.c(uof.a).a(str5) < uoau) {
                                     r.c(uof.a).g(str5);
                                     x.l(uof.a).I(i1, str5);
                                  }else {
                                     r.c(uof.a).h(str5);
                                  }
                               }
                               _monitor_exit(or);
                            }
                         }else if((hr.F.a).equalsIgnoreCase(ois.d)){
                            if (!ois.a - b1) {
                               _monitor_enter(or);
                               if (r.c(uof.a).f(str5)) {
                                  r.c(uof.a).h(str5);
                                  uoau = au.b;
                                  if (("syncing").equals(r.c(uof.a).b(uoau))) {
                                     r.c(uof.a).d(uoau, "synced");
                                  }
                               }
                               _monitor_exit(or);
                            }else if(("syncing").equals(r.c(uof.a).b(au.b))){
                               _monitor_enter(or);
                               if (r.c(uof.a).f(str5)) {
                                  if (r.c(uof.a).a(str5) < uoau) {
                                     r.c(uof.a).g(str5);
                                     x.l(uof.a).I(i2, str5);
                                  }else {
                                     r.c(uof.a).h(str5);
                                  }
                               }
                               _monitor_exit(or);
                            }
                         }else if((hr.N.a).equalsIgnoreCase(ois.d)){
                            uof.o(ois);
                         }else if((hr.B.a).equalsIgnoreCase(ois.d)){
                            uof.h(ois);
                         }
                         r.c(uof.a).h(str5);
                      }else if(ois instanceof ig){
                         if (("registration id expired").equalsIgnoreCase(ois.d)) {
                            List allTopic = MiPushClient.getAllTopic(uof.a);
                            List allUserAccou = MiPushClient.getAllUserAccount(uof.a);
                            packageName = MiPushClient.getAcceptTime(uof.a);
                            c.v("resp-type:"+ois.d+", "+ois.a());
                            MiPushClient.reInitialize(uof.a, hv.a);
                            Iterator iterator = MiPushClient.getAllAlias(uof.a).iterator();
                            while (iterator.hasNext()) {
                               str1 = iterator.next();
                               MiPushClient.removeAlias(uof.a, str1);
                               MiPushClient.setAlias(uof.a, str1, uoa);
                            }
                            iterator = allTopic.iterator();
                            while (iterator.hasNext()) {
                               str7 = iterator.next();
                               MiPushClient.removeTopic(uof.a, str7);
                               MiPushClient.subscribe(uof.a, str7, uoa);
                            }
                            iterator = allUserAccou.iterator();
                            while (iterator.hasNext()) {
                               str7 = iterator.next();
                               MiPushClient.removeAccount(uof.a, str7);
                               MiPushClient.setUserAccount(uof.a, str7, uoa);
                            }
                            String[] stringArray = packageName.split(",");
                            if (stringArray.length == 2) {
                               MiPushClient.removeAcceptTime(uof.a);
                               MiPushClient.addAcceptTime(uof.a, stringArray[i2], stringArray[i1]);
                            }
                         }else if((hr.h.a).equalsIgnoreCase(ois.d)){
                            if (ois.a() != null && ois.a().containsKey("app_version")) {
                               f0.d(uof.a).g(ois.a().get("app_version"));
                            }
                         }else if((hr.m.a).equalsIgnoreCase(ois.d)){
                            if (p0.b() && (ois.a() != null && ois.a().containsKey("awake_info"))) {
                               a2 = uof.a;
                               r0.e(a2, f0.d(a2).c(), r.g(uof.a).a(hm.aF.a(), i2), ois.a().get("awake_info"));
                            }
                         }else if((hr.n.a).equalsIgnoreCase(ois.d)){
                            if oif = new if();
                            i.c(oif, ois.a());
                            s.d(r.g(uof.a), oif);
                         }else if((hr.o.a).equalsIgnoreCase(ois.d)){
                            ie oie = new ie();
                            i.c(oie, ois.a());
                            s.c(r.g(uof.a), oie);
                         }else if((hr.w.a).equalsIgnoreCase(ois.d)){
                            d0.c(uof.a, ois);
                         }else if((hr.x.a).equalsIgnoreCase(ois.d)){
                            c.l("receive force sync notification");
                            d0.d(uof.a, i2);
                         }else if((hr.C.a).equals(ois.d)){
                            c.v("resp-type:"+ois.d+", "+ois.a());
                            if (ois.a() != null) {
                               int i3 = -2;
                               if (ois.a().containsKey(v.M)) {
                                  str5 = ois.a().get(v.M);
                                  if (!TextUtils.isEmpty(str5)) {
                                     try{
                                        i3 = Integer.parseInt(str5);
                                     }catch(java.lang.NumberFormatException e0){
                                        e0.printStackTrace();
                                     }
                                  }
                               }
                            }
                         label_0480 :
                            uof.j(ois);
                         }else if((hr.K.a).equals(ois.d)){
                            ii oii = new ii();
                            i.c(oii, ois.a());
                            l.a(uof.a, oii);
                         }else if((hr.M.a).equals(ois.d)){
                            io oio = new io();
                            i.c(oio, ois.a());
                            l.b(uof.a, oio);
                         }else if((hr.P.a).equals(ois.d)){
                         }else if((hr.af.a).equals(ois.d)){
                            c.s("receive detect msg");
                            uof.q(ois);
                         }else if(x0.b(ois)){
                            c.s("receive notification handle by cpra");
                         }
                      }
                      break;
                    default:
                }
             }catch(com.xiaomi.push.ix e0){
                c.o(e0);
             }
          label_0aa5 :
             return null;
          }
          return null;
       }catch(com.xiaomi.mipush.sdk.u e0){
          c.o(e0);
          this.i(p0);
          oy3 = y3.a(uof.a);
          packageName = uof.a.getPackageName();
          str1 = x3.e(p4);
          str2 = "19";
       }catch(com.xiaomi.push.ix e0){
          c.o(e0);
          c.u("receive a message which action string is not valid. is the reg expired?");
          oy3 = y3.a(uof.a);
          packageName = uof.a.getPackageName();
          str1 = x3.e(p4);
          str2 = "20";
       }
       oy3.i(packageName, str1, str, str2);
       uof.a.f(uof.a, oid, b);
       goto label_0ae4 ;
    }
    public final PushMessageHandler$a d(id p0,byte[] p1){
       String str;
       id a;
       PushMessageHandler$a uoa = null;
       try{
          is ois = s.d(this.a, p0);
          if (ois == null) {
             c.u("message arrived: receiving an un-recognized message. "+p0.a);
             return uoa;
          }else {
             hh ohh = p0.a();
             c.l("message arrived: processing an arrived message, action="+ohh);
             boolean b = true;
             if (w.a[ohh.ordinal()] != b) {
                return uoa;
             }else if(!p0.b()){
                str = "message arrived: receiving an un-encrypt message\(SendMessage\).";
             }else {
                ht oht = ois.a();
                if (oht == null) {
                   str = "message arrived: receive an empty message without push content, drop it";
                }else {
                   a = p0.a;
                   if (a != null && a.a() != null) {
                      uoa = p0.a.a.get("jobkey");
                   }
                   MiPushMessage miPushMessag = n.b(ois, p0.a(), false);
                   miPushMessag.setArrivedMessage(b);
                   c.l("message arrived: receive a message, msgid="+oht.a()+", jobkey="+uoa);
                   return miPushMessag;
                }
             }
          }
       }catch(com.xiaomi.mipush.sdk.u e5){
          c.o(e5);
          str = "message arrived: receive a message but decrypt failed. report when click.";
       }catch(com.xiaomi.push.ix e5){
          c.o(e5);
          str = "message arrived: receive a message which action string is not valid. is the reg expired?";
       }
       c.u(str);
       return uoa;
    }
    public List f(TimeZone p0,TimeZone p1,List p2){
       List list = p2;
       if (p0.equals(p1)) {
          return list;
       }
       long l = (long)(((p0.getRawOffset() - p1.getRawOffset()) / 1000) / 60);
       long l1 = ((((Long.parseLong((list.get(0)).split(":")[0]) * 60) + Long.parseLong((list.get(0)).split(":")[1])) - l) + 1440) % 1440;
       long l2 = ((((Long.parseLong((list.get(1)).split(":")[0]) * 60) + Long.parseLong((list.get(1)).split(":")[1])) - l) + 1440) % 1440;
       ArrayList uArrayList = new ArrayList();
       Object[] objArray = new Object[]{Long.valueOf((l1 / 60)),Long.valueOf((l1 % 60))};
       uArrayList.add(String.format("%1$02d:%2$02d", objArray));
       Object[] objArray1 = new Object[]{Long.valueOf((l2 / 60)),Long.valueOf((l2 % 60))};
       uArrayList.add(String.format("%1$02d:%2$02d", objArray1));
       return uArrayList;
    }
    public final void g(){
       SharedPreferences sharedPrefer = o.c(this.a, "mipush_extra", 0);
       long l = System.currentTimeMillis();
       if (Math.abs((l - sharedPrefer.getLong("last_reinitialize", 0))) - 0x1b7740 > 0) {
          MiPushClient.reInitialize(this.a, hv.b);
          g.b(sharedPrefer.edit().putLong("last_reinitialize", l));
       }
       return;
    }
    public final void h(hy p0){
       String str = p0.a();
       c.s("receive ack "+str);
       Map map = p0.a();
       if (map != null) {
          String str1 = map.get("real_source");
          if (!TextUtils.isEmpty(str1)) {
             c.s("receive ack : messageId = "+str+"  realSource = "+str1);
             x0 ox0 = x0.d(this.a);
             boolean b = (!p0.a)? true: false;
             ox0.h(str, str1, Boolean.valueOf(b));
          }
       }
       return;
    }
    public final void i(id p0){
       c.l("receive a message but decrypt failed. report now.");
       ig oig = new ig(p0.a().a, false);
       oig.c(hr.u.a);
       oig.b(p0.a());
       oig.d(p0.b);
       HashMap hashMap = new HashMap();
       oig.a = hashMap;
       hashMap.put("regid", MiPushClient.getRegId(this.a));
       x.l(this.a).x(oig, hh.i, false, null);
    }
    public final void j(ig p0){
       hy ohy = new hy();
       ohy.c(hr.D.a);
       ohy.a(p0.a());
       ohy.a(p0.a());
       ohy.b(p0.b());
       ohy.e(p0.c());
       ohy.a(0);
       ohy.d("success clear push message.");
       x.l(this.a).B(ohy, hh.i, false, true, null, false, this.a.getPackageName(), f0.d(this.a).c(), false);
    }
    public final void k(ik p0,id p1){
       hu ohu = p1.a();
       if (ohu != null) {
          ohu = ohu.a();
          b0.a(ohu);
       }
       hx ohx = new hx();
       ohx.b(p0.b());
       ohx.a(p0.a());
       ohx.a(p0.a().a());
       if (!TextUtils.isEmpty(p0.c())) {
          ohx.c(p0.c());
       }
       if (!TextUtils.isEmpty(p0.d())) {
          ohx.d(p0.d());
       }
       ohx.a(i.a(this.a, p1));
       x.l(this.a).v(ohx, hh.f, ohu);
       return;
    }
    public final void l(String p0,long p1,e p2){
       au uoau = o0.a(p2);
       if (uoau == null) {
          return;
       }
       if (!p1) {
          _monitor_enter(r.class);
          if (r.c(this.a).f(p0)) {
             r.c(this.a).h(p0);
             if (("syncing").equals(r.c(this.a).b(uoau))) {
                r.c(this.a).d(uoau, "synced");
             }
          }
          _monitor_exit(r.class);
       }else if(("syncing").equals(r.c(this.a).b(uoau))){
          _monitor_enter(r.class);
          if (r.c(this.a).f(p0)) {
             if (r.c(this.a).a(p0) < 10) {
                r.c(this.a).g(p0);
                x.l(this.a).D(p0, uoau, p2, "retry");
             }else {
                r.c(this.a).h(p0);
             }
          }
          _monitor_exit(r.class);
       }else {
          r.c(this.a).h(p0);
       }
       return;
    }
    public final boolean n(id p0){
       Map map = (p0.a() == null)? null: p0.a().a();
       if (map == null) {
          return false;
       }else {
          String str = map.get("push_server_action");
          if (TextUtils.equals(str, "hybrid_message") || TextUtils.equals(str, "platform_message")) {
             return true;
          }else {
             return false;
          }
       }
    }
    public final void o(hy p0){
       f ta;
       e b;
       ag e;
       c.t("ASSEMBLE_PUSH : "+p0.toString());
       String str = p0.a();
       Map map = p0.a();
       if (map != null) {
          String str1 = map.get("RegInfo");
          if (!TextUtils.isEmpty(str1)) {
             String str2 = "brand:";
             if (str1.contains(str2+ag.c.name())) {
                c.l("ASSEMBLE_PUSH : receive fcm token sync ack");
                ta = this.a;
                b = e.b;
             }else {
                ag a = ag.a;
                if (str1.contains(str2+a.name()) || str1.contains("channel:"+a.name())) {
                   c.l("ASSEMBLE_PUSH : receive hw token sync ack");
                   ta = this.a;
                   b = e.a;
                }else {
                   a = ag.d;
                   if (str1.contains(str2+a.name()) || str1.contains("channel:"+a.name())) {
                      c.l("ASSEMBLE_PUSH : receive COS token sync ack");
                      ta = this.a;
                      b = e.c;
                   }else {
                      e = ag.e;
                      if (str1.contains(str2+e.name()) || str1.contains("channel:"+e.name())) {
                         c.l("ASSEMBLE_PUSH : receive FTOS token sync ack");
                         ta = this.a;
                         b = e.d;
                      }
                   }
                }
             }
             l0.m(ta, b, str1);
             this.l(str, p0.a, b);
          }
       }
       return;
    }
    public final void p(id p0){
       hu ohu = p0.a();
       if (ohu != null) {
          ohu = ohu.a();
          b0.a(ohu);
       }
       hx ohx = new hx();
       ohx.b(p0.a());
       ohx.a(ohu.a());
       ohx.a(ohu.a());
       if (!TextUtils.isEmpty(ohu.b())) {
          ohx.c(ohu.b());
       }
       ohx.a(i.a(this.a, p0));
       x.l(this.a).x(ohx, hh.f, false, ohu);
       return;
    }
    public final void q(ig p0){
       String str;
       Map map = p0.a();
       if (map == null) {
          str = "detect failed because null";
       }else {
          String str1 = o.f(map, "pkgList", null);
          if (TextUtils.isEmpty(str1)) {
             str = "detect failed because empty";
          }else {
             Map map1 = g.i(this.a, str1);
             if (map1 != null) {
                String str2 = "alive";
                String str3 = map1.get(str2);
                str1 = map1.get("notAlive");
                if (!TextUtils.isEmpty(str3)) {
                   ig oig = new ig();
                   oig.a(p0.a());
                   oig.b(p0.b());
                   oig.d(p0.c());
                   oig.c(hr.ag.a);
                   HashMap hashMap = new HashMap();
                   oig.a = hashMap;
                   hashMap.put(str2, str3);
                   if (Boolean.parseBoolean(o.f(map, "reportNotAliveApp", "false")) && !TextUtils.isEmpty(str1)) {
                      oig.a.put("notAlive", str1);
                   }
                   x.l(this.a).x(oig, hh.i, false, null);
                }else {
                   c.s("detect failed because no alive process");
                }
             }else {
                c.l("detect failed because get status illegal");
             }
             return;
          }
       }
       c.l(str);
       return;
    }
}
