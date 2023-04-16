package com.xiaomi.push.service.g0;
import java.lang.Object;
import com.xiaomi.push.service.o0;
import com.xiaomi.push.service.bg$b;
import java.lang.String;
import java.lang.StringBuilder;
import android.content.Context;
import android.content.Intent;
import ws8.p4;
import com.xiaomi.push.service.bg;
import java.lang.Integer;
import java.util.Collection;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import ws8.p5;
import ws8.m6;
import rs8.c;
import ys8.v;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import java.lang.Boolean;
import com.xiaomi.push.service.XMPushService;
import android.os.SystemClock;
import java.lang.System;
import ys8.e;
import ys8.f;
import ws8.o5;
import com.xiaomi.push.e;
import com.xiaomi.push.go;
import android.os.Bundle;

public class g0	// class@00116d
{
    public o0 a;

    public void g0(){
       this.a = new o0();
    }
    public static String c(bg$b p0){
       StringBuilder str;
       String str1;
       if (!("9").equals(p0.h)) {
          str = p0.a;
          str1 = ".permission.MIPUSH_RECEIVE";
       }else {
          str = p0.a;
          str1 = ".permission.MIMC_RECEIVE";
       }
       return str+str1;
    }
    public static void e(Context p0,Intent p1,bg$b p2){
       if (("com.xiaomi.xmsf").equals(p0.getPackageName())) {
          p0.sendBroadcast(p1);
       }else {
          p0.sendBroadcast(p1, g0.c(p2));
       }
       return;
    }
    public bg$b a(p4 p0){
       bg$b uob;
       Collection uCollection = bg.c().f(Integer.toString(p0.a()));
       if (uCollection.isEmpty()) {
          return null;
       }
       Iterator iterator = uCollection.iterator();
       if (uCollection.size() == 1) {
          return iterator.next();
       }
       String str = p0.z();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uob = iterator.next();
          if (TextUtils.equals(str, uob.b)) {
             break ;
          }
       }
       return uob;
    }
    public bg$b b(p5 p0){
       bg$b uob;
       Collection uCollection = bg.c().f(p0.m());
       if (uCollection.isEmpty()) {
          return null;
       }
       Iterator iterator = uCollection.iterator();
       if (uCollection.size() == 1) {
          return iterator.next();
       }
       String str = p0.q();
       String str1 = p0.o();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uob = iterator.next();
          if (TextUtils.equals(str, uob.b) || TextUtils.equals(str1, uob.b)) {
             break ;
          }
       }
       return uob;
    }
    public void d(Context p0){
       Intent intent = new Intent();
       intent.setAction("com.xiaomi.push.service_started");
       if (m6.r()) {
          intent.addFlags(0x1000000);
       }
       c.l("[Bcst] send ***.push.service_started broadcast to inform push service has started.");
       p0.sendBroadcast(intent);
       return;
    }
    public void f(Context p0,bg$b p1,int p2){
       if (("5").equalsIgnoreCase(p1.h)) {
       }else {
          try{
             Intent intent = new Intent();
             intent.setAction("com.xiaomi.push.channel_closed");
             intent.setPackage(p1.a);
             intent.putExtra(v.t, p1.h);
             intent.putExtra("ext_reason", p2);
             intent.putExtra(v.q, p1.b);
             intent.putExtra(v.F, p1.j);
             if (p1.r != null && ("9").equals(p1.h)) {
                Message message = Message.obtain(null, 17, intent);
                p1.r.send(message);
                return;
             }else {
                Object[] objArray = new Object[]{p1.h,p1.a,Integer.valueOf(p2)};
                c.l(String.format("[Bcst] notify channel closed. %s,%s,%d", objArray));
                g0.e(p0, intent, p1);
             }
          }catch(android.os.RemoteException e0){
             p1.r = p2;
             p1 = p1.b;
             c.l("peer may died: "+p1.substring(p1.lastIndexOf(64)));
          }
       }
    }
    public void g(Context p0,bg$b p1,String p2,String p3){
       if (("5").equalsIgnoreCase(p1.h)) {
          c.u("mipush kicked by server");
       }else {
          Intent intent = new Intent();
          intent.setAction("com.xiaomi.push.kicked");
          intent.setPackage(p1.a);
          intent.putExtra("ext_kick_type", p2);
          intent.putExtra("ext_kick_reason", p3);
          intent.putExtra("ext_chid", p1.h);
          intent.putExtra(v.q, p1.b);
          intent.putExtra(v.F, p1.j);
          Object[] objArray = new Object[]{p1.h,p1.a,p3};
          c.l(String.format("[Bcst] notify packet\(blob\) arrival. %s,%s,%s", objArray));
          g0.e(p0, intent, p1);
       }
       return;
    }
    public void h(Context p0,bg$b p1,boolean p2,int p3,String p4){
       if (("5").equalsIgnoreCase(p1.h)) {
          this.a.f(p0, p1, p2, p3, p4);
       }else {
          Intent intent = new Intent();
          intent.setAction("com.xiaomi.push.channel_opened");
          intent.setPackage(p1.a);
          intent.putExtra("ext_succeeded", p2);
          if (!p2) {
             intent.putExtra("ext_reason", p3);
          }
          if (!TextUtils.isEmpty(p4)) {
             intent.putExtra("ext_reason_msg", p4);
          }
          intent.putExtra("ext_chid", p1.h);
          intent.putExtra(v.q, p1.b);
          intent.putExtra(v.F, p1.j);
          Object[] objArray = new Object[]{p1.h,p1.a,Boolean.valueOf(p2),Integer.valueOf(p3)};
          c.l(String.format("[Bcst] notify channel open result. %s,%s,%b,%d", objArray));
          g0.e(p0, intent, p1);
       }
       return;
    }
    public void i(XMPushService p0,String p1,p4 p2){
       bg$b uob = this.a(p2);
       if (uob == null) {
          c.u("error while notify channel closed! channel "+p1+" not registered");
          return;
       }else if(("5").equalsIgnoreCase(p1)){
          this.a.l(p0, p2, uob);
       }else {
          bg$b a = uob.a;
          Intent intent = new Intent();
          intent.setAction("com.xiaomi.push.new_msg");
          intent.setPackage(a);
          intent.putExtra("ext_rcv_timestamp", SystemClock.elapsedRealtime());
          intent.putExtra("ext_chid", p1);
          intent.putExtra("ext_raw_packet", p2.o(uob.i));
          intent.putExtra(v.F, uob.j);
          intent.putExtra(v.x, uob.i);
          if (uob.r != null) {
             Message message = Message.obtain(null, 17, intent);
             try{
                uob.r.send(message);
                c.l("message was sent by messenger for chid="+p1);
                return;
             }catch(android.os.RemoteException e0){
                e0.r = v4;
                bg$b b = e0.b;
                c.l("peer may died: "+b.substring(b.lastIndexOf(64)));
             }
             if (!("com.xiaomi.xmsf").equals(a)) {
                Object[] objArray = new Object[]{e0.h,e0.a,p2.x()};
                c.l(String.format("[Bcst] notify packet\(blob\) arrival. %s,%s,%s", objArray));
                g0.e(p0, intent, e0);
                if (("10").equals(p1)) {
                   p4 f = p2.f;
                   if (f != null) {
                      f.h = System.currentTimeMillis();
                      f.d(p0, "coord_down", p2.f);
                   }
                }
             }
          }else {
             goto label_00ac ;
          }
       }
       return;
    }
    public void j(XMPushService p0,String p1,p5 p2){
       String str;
       String str1;
       bg$b uob = this.b(p2);
       if (uob == null) {
          str = "error while notify channel closed! channel "+p1+" not registered";
       }else if(("5").equalsIgnoreCase(p1)){
          this.a.m(p0, p2, uob);
       }else {
          bg$b a = uob.a;
          if (p2 instanceof o5) {
             str1 = "com.xiaomi.push.new_msg";
          }else if(p2 instanceof e){
             str1 = "com.xiaomi.push.new_iq";
          }else if(p2 instanceof go){
             str1 = "com.xiaomi.push.new_pres";
          }else {
             str = "unknown packet type, drop it";
          }
          Intent intent = new Intent();
          intent.setAction(str1);
          intent.setPackage(a);
          intent.putExtra("ext_chid", p1);
          intent.putExtra("ext_packet", p2.a());
          intent.putExtra(v.F, uob.j);
          intent.putExtra(v.x, uob.i);
          Object[] objArray = new Object[]{uob.h,uob.a,p2.l()};
          c.l(String.format("[Bcst] notify packet arrival. %s,%s,%s", objArray));
          g0.e(p0, intent, uob);
       }
       return;
       c.u(str);
       return;
    }
}
