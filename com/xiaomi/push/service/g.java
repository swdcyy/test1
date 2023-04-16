package com.xiaomi.push.service.g;
import java.lang.String;
import com.xiaomi.push.id;
import com.xiaomi.push.ig;
import ws8.p5;
import com.xiaomi.push.hh;
import com.xiaomi.push.is;
import com.xiaomi.push.i;
import com.xiaomi.push.hw;
import java.nio.ByteBuffer;
import com.xiaomi.push.hu;
import java.lang.Object;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.xiaomi.push.service.XMPushService;
import ws8.p4;
import android.content.Context;
import com.xiaomi.push.service.l0;
import com.xiaomi.push.service.m0;
import java.lang.Throwable;
import rs8.c;
import android.app.Service;
import com.xiaomi.push.service.bg$b;
import com.xiaomi.push.service.bg;
import ws8.b2;
import ws8.a5;
import com.xiaomi.push.gg;
import android.os.Messenger;
import com.xiaomi.push.service.j;
import com.xiaomi.push.service.bg$b$a;
import com.xiaomi.push.service.u;
import com.xiaomi.push.service.i;
import com.xiaomi.push.service.u$a;
import ys8.e1;
import com.xiaomi.push.hr;
import ys8.u;

public final class g	// class@00116e
{

    public static id a(String p0,String p1){
       ig oig = new ig();
       oig.b(p1);
       oig.c("package uninstalled");
       oig.a(p5.k());
       oig.a(false);
       return g.b(p0, p1, oig, hh.i);
    }
    public static id b(String p0,String p1,is p2,hh p3){
       return g.c(p0, p1, p2, p3, true);
    }
    public static id c(String p0,String p1,is p2,hh p3,boolean p4){
       id oid = new id();
       hw ohw = new hw();
       ohw.a = 5;
       ohw.a = "fakeid";
       oid.a(ohw);
       oid.a(ByteBuffer.wrap(i.d(p2)));
       oid.a(p3);
       oid.b(p4);
       oid.b(p0);
       oid.a(false);
       oid.a(p1);
       return oid;
    }
    public static String d(id p0){
       id a = p0.a;
       if (a != null) {
          hu b = a.b;
          if (b != null) {
             String str = b.get("ext_traffic_source_pkg");
             if (!TextUtils.isEmpty(str)) {
                return str;
             }
          }
       }
       return p0.b;
    }
    public static String e(String p0){
       return p0+".permission.MIPUSH_RECEIVE";
    }
    public static p4 f(XMPushService p0,byte[] p1){
       try{
          id oid = new id();
          i.c(oid, p1);
          return g.g(m0.b(p0), p0, oid);
       }catch(com.xiaomi.push.ix e1){
          c.o(e1);
          return null;
       }
    }
    public static p4 g(l0 p0,Context p1,id p2){
       try{
          p4 op4 = new p4();
          op4.g(5);
          op4.v(p0.a);
          op4.s(g.d(p2));
          op4.j("SECMSG", "message");
          l0 a = p0.a;
          p2.a.a = a.substring(0, a.indexOf("@"));
          p2.a.c = a.substring((a.indexOf("/") + 1));
          op4.l(i.d(p2), p0.c);
          op4.k(1);
          c.l("try send mi push message. packagename:"+p2.b+" action:"+p2.a);
          return op4;
       }catch(java.lang.NullPointerException e4){
          c.o(e4);
          return null;
       }
    }
    public static void h(XMPushService p0){
       l0 ol0 = m0.b(p0.getApplicationContext());
       if (ol0 != null) {
          bg$b uob = m0.b(p0.getApplicationContext()).a(p0);
          c.l("prepare account. "+uob.a);
          g.j(p0, uob);
          bg.c().l(uob);
          g.k(p0, ol0, 0x2a300);
       }
       return;
    }
    public static void i(XMPushService p0,id p1){
       b2.e(p1.b(), p0.getApplicationContext(), p1, -1);
       a5 uoa5 = p0.a();
       if (uoa5 == null) {
          throw new gg("try send msg while connection is null.");
       }
       if (!uoa5.p()) {
          throw new gg("Don\'t support XMPP connection.");
       }
       p4 op4 = g.g(m0.b(p0), p0, p1);
       if (op4 != null) {
          uoa5.v(op4);
       }
       return;
    }
    public static void j(XMPushService p0,bg$b p1){
       p1.h(null);
       p1.i(new j(p0));
    }
    public static void k(XMPushService p0,l0 p1,int p2){
       i oi = new i("MSAID", (long)p2, p0, p1);
       u.c(p0).f(v7);
    }
    public static void l(XMPushService p0,String p1,byte[] p2){
       b2.g(p1, p0.getApplicationContext(), p2);
       a5 uoa5 = p0.a();
       if (uoa5 == null) {
          throw new gg("try send msg while connection is null.");
       }
       if (!uoa5.p()) {
          throw new gg("Don\'t support XMPP connection.");
       }
       p4 op4 = g.f(p0, p2);
       if (op4 != null) {
          uoa5.v(op4);
          return;
       }else {
          e1.b(p0, p1, p2, 0x42c1d83, "not a valid message");
          return;
       }
    }
    public static id m(String p0,String p1){
       ig oig = new ig();
       oig.b(p1);
       oig.c(hr.ac.a);
       oig.a(u.a());
       oig.a(false);
       return g.b(p0, p1, oig, hh.i);
    }
    public static id n(String p0,String p1,is p2,hh p3){
       return g.c(p0, p1, p2, p3, false);
    }
}
