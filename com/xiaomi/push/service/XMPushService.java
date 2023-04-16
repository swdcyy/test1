package com.xiaomi.push.service.XMPushService;
import ws8.d5;
import android.app.Service;
import com.xiaomi.push.service.XMJobService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import com.xiaomi.push.service.y;
import com.xiaomi.push.service.i0;
import com.xiaomi.push.service.n;
import ws8.a5;
import ws8.b5;
import android.content.Intent;
import java.lang.String;
import com.xiaomi.push.n;
import java.lang.Enum;
import java.lang.Object;
import ws8.v1;
import android.content.Context;
import com.xiaomi.push.service.bg$b;
import ys8.v;
import com.xiaomi.push.service.bg;
import android.os.Parcelable;
import android.os.Messenger;
import com.xiaomi.push.service.g0;
import ws8.m6;
import java.lang.CharSequence;
import android.text.TextUtils;
import ws8.p5;
import java.util.List;
import java.lang.StringBuilder;
import rs8.c;
import com.xiaomi.push.service.bg$c;
import android.os.SystemClock;
import ws8.g5;
import ws8.k0;
import java.lang.Exception;
import java.lang.Integer;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Throwable;
import android.os.Bundle;
import ys8.b1;
import com.xiaomi.push.ig;
import com.xiaomi.push.is;
import com.xiaomi.push.i;
import ws8.k;
import ys8.q;
import java.lang.ref.WeakReference;
import ws8.k$a;
import com.xiaomi.push.service.XMPushService$j;
import com.xiaomi.push.service.i0$b;
import java.lang.IllegalStateException;
import com.xiaomi.push.service.XMPushService$n;
import com.xiaomi.push.service.XMPushService$b;
import java.util.Iterator;
import com.xiaomi.push.service.XMPushService$s;
import ys8.e1;
import com.xiaomi.push.service.z;
import ws8.l4;
import com.xiaomi.push.b;
import ws8.p4;
import com.xiaomi.push.gg;
import com.xiaomi.push.service.s;
import com.xiaomi.push.id;
import com.xiaomi.push.hh;
import com.xiaomi.push.ih;
import com.xiaomi.push.service.n0;
import ws8.y3;
import java.lang.Boolean;
import ws8.q;
import java.lang.Thread;
import ws8.o0;
import ys8.r;
import com.xiaomi.push.hm;
import ys8.y;
import ws8.o5;
import java.lang.Long;
import ys8.e;
import com.xiaomi.push.service.t;
import ws8.d4;
import ys8.p0;
import java.lang.Runnable;
import com.xiaomi.push.service.XMPushService$o;
import com.xiaomi.push.service.XMPushService$g;
import java.lang.Class;
import ws8.f7;
import java.lang.reflect.Field;
import java.util.Objects;
import ys8.b;
import com.xiaomi.push.service.d0;
import com.xiaomi.push.service.e0;
import com.xiaomi.push.service.m0$a;
import com.xiaomi.push.service.m0;
import com.xiaomi.push.service.w;
import ys8.i;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo$State;
import android.net.NetworkInfo$DetailedState;
import ws8.b6;
import com.xiaomi.push.service.XMPushService$e;
import ws8.f2;
import java.lang.System;
import com.xiaomi.push.e;
import com.xiaomi.push.go;
import com.xiaomi.push.service.XMPushService$q;
import ys8.d1;
import com.xiaomi.push.service.f0;
import ys8.z;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import ws8.i6;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.xiaomi.push.service.k;
import ys8.k;
import com.xiaomi.push.service.g;
import ys8.c;
import com.xiaomi.push.hl;
import ws8.g6;
import com.xiaomi.push.service.XMPushService$a;
import ss8.a$a;
import ss8.a;
import ws8.t0;
import ws8.x3;
import com.xiaomi.push.service.h0;
import com.xiaomi.push.service.XMPushService$f;
import android.content.IntentFilter;
import ys8.a1;
import com.xiaomi.push.service.XMPushService$p;
import ws8.o3;
import ys8.x;
import ws8.r3;
import java.util.Map;
import ys8.o0;
import ws8.f5;
import ws8.m5;
import ws8.h5;
import android.content.ContentResolver;
import android.provider.Settings$System;
import java.util.Date;
import android.os.IBinder;
import com.xiaomi.push.service.l0;
import ws8.c;
import android.os.HandlerThread;
import android.os.Handler;
import android.os.Looper;
import ys8.q0;
import ys8.r0;
import ys8.w;
import ys8.s0;
import ws8.e5;
import ws8.w4;
import ys8.y0;
import com.xiaomi.push.service.b0;
import com.xiaomi.push.service.bg$a;
import com.xiaomi.push.service.j0;
import ws8.h6;
import ws8.d6;
import com.xiaomi.push.service.x;
import com.xiaomi.push.service.o;
import com.xiaomi.push.service.XMPushService$h;
import com.xiaomi.push.service.u;
import com.xiaomi.push.service.XMPushService$t;
import com.xiaomi.push.service.XMPushService$k;
import android.net.Uri;
import com.xiaomi.push.service.c0;
import android.database.ContentObserver;
import com.xiaomi.push.service.XMPushService$r;
import ws8.d2;
import android.os.Process;
import com.xiaomi.push.g;
import com.xiaomi.push.service.a0;
import com.xiaomi.push.service.XMPushService$l;
import ys8.e0;
import ws8.g7;
import com.xiaomi.push.service.XMPushService$i;

public class XMPushService extends Service implements d5	// class@001159
{
    public int a;
    public long a;
    public ContentObserver a;
    public Messenger a;
    public XMPushService$a a;
    public XMPushService$f a;
    public XMPushService$k a;
    public XMPushService$r a;
    public XMPushService$t a;
    public g0 a;
    public i0 a;
    public n a;
    public s a;
    public Class a;
    public ArrayList a;
    public Collection a;
    public a5 a;
    public b5 a;
    public f5 a;
    public w4 a;
    public boolean a;
    public int b;
    public static boolean b;

    public void XMPushService(){
       super();
       this.a = false;
       this.a = 0;
       this.b = 0;
       this.a = 0;
       this.a = XMJobService.class;
       this.a = null;
       this.a = null;
       this.a = null;
       this.a = Collections.synchronizedCollection(new ArrayList());
       this.a = new ArrayList();
       this.a = new y(this);
    }
    public static i0 a(XMPushService p0){
       return p0.a;
    }
    public static n a(XMPushService p0){
       return p0.a;
    }
    public static a5 a(XMPushService p0){
       return p0.a;
    }
    public static a5 a(XMPushService p0,a5 p1){
       p0.a = p1;
       return p1;
    }
    public static b5 a(XMPushService p0){
       return p0.a;
    }
    public static void a(XMPushService p0){
       p0.e();
    }
    public static void a(XMPushService p0,Intent p1){
       p0.d(p1);
    }
    public static void a(String p0){
       if ((n.a.name()).equals(p0)) {
          "cn.app.chat.xiaomi.net".l("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
          "cn.app.chat.xiaomi.net".l("cn.app.chat.xiaomi.net", "111.13.141.211:443");
          "cn.app.chat.xiaomi.net".l("cn.app.chat.xiaomi.net", "39.156.81.172:443");
          "cn.app.chat.xiaomi.net".l("cn.app.chat.xiaomi.net", "111.202.1.250:443");
          "cn.app.chat.xiaomi.net".l("cn.app.chat.xiaomi.net", "123.125.102.213:443");
          "resolver.msg.xiaomi.net".l("resolver.msg.xiaomi.net", "111.13.142.153:443");
          "resolver.msg.xiaomi.net".l("resolver.msg.xiaomi.net", "111.202.1.252:443");
       }
       return;
    }
    public static boolean a(XMPushService p0){
       return p0.g();
    }
    public static boolean a(XMPushService p0,Context p1){
       return p0.a(p1);
    }
    public static boolean a(XMPushService p0,boolean p1){
       p0.a = p1;
       return p1;
    }
    public static void b(XMPushService p0){
       p0.c();
    }
    public static boolean b(XMPushService p0){
       return p0.a;
    }
    public static void c(XMPushService p0){
       p0.f();
    }
    public static boolean e(){
       return XMPushService.b;
    }
    public final bg$b a(String p0,Intent p1){
       bg$b uob = bg.c().b(p0, p1.getStringExtra(v.q));
       if (uob == null) {
          uob = new bg$b(this);
       }
       uob.h = p1.getStringExtra(v.t);
       uob.b = p1.getStringExtra(v.q);
       uob.c = p1.getStringExtra(v.v);
       uob.a = p1.getStringExtra(v.B);
       uob.f = p1.getStringExtra(v.z);
       uob.g = p1.getStringExtra(v.A);
       uob.e = p1.getBooleanExtra(v.y, false);
       uob.i = p1.getStringExtra(v.x);
       uob.j = p1.getStringExtra(v.F);
       uob.d = p1.getStringExtra(v.w);
       uob.k = this.a;
       uob.h(p1.getParcelableExtra(v.J));
       uob.l = this.getApplicationContext();
       bg.c().l(uob);
       return uob;
    }
    public g0 a(){
       return new g0();
    }
    public final String a(){
       String str = m6.g("ro.miui.region");
       if (TextUtils.isEmpty(str)) {
          str = m6.g("ro.product.locale.region");
       }
       return str;
    }
    public a5 a(){
       return this.a;
    }
    public final p5 a(p5 p0,String p1,String p2){
       StringBuilder str;
       bg uobg = bg.c();
       ArrayList uArrayList = uobg.g(p1);
       if (uArrayList.isEmpty()) {
          str = "";
          p2 = "open channel should be called first before sending a packet, pkg=";
       }else {
          p0.v(p1);
          p1 = p0.m();
          if (TextUtils.isEmpty(p1)) {
             p1 = uArrayList.get(0);
             p0.p(p1);
          }
          bg$b uob = uobg.b(p1, p0.q());
          if (!this.c()) {
             str = "";
             p2 = "drop a packet as the channel is not connected, chid=";
          }else if(uob == null || uob.m != bg$c.c){
             str = "";
             p2 = "drop a packet as the channel is not opened, chid=";
          }else if(!TextUtils.equals(p2, uob.j)){
             str = "invalid session. "+p2;
          label_001d :
             c.l(str);
             return null;
          }else {
             return p0;
          }
       }
       str = str+p2+p1;
       goto label_001d ;
    }
    public void a(){
       if ((SystemClock.elapsedRealtime() - this.a) - (long)g5.a() < 0) {
          return;
       }
       if (k0.r(this)) {
          this.b(true);
       }
       return;
    }
    public void a(int p0){
       this.a.c(p0);
    }
    public void a(int p0,Exception p1){
       StringBuilder str = "disconnect "+this.hashCode()+", ";
       XMPushService ta = this.a;
       Integer integer = (ta == null)? null: Integer.valueOf(ta.hashCode());
       c.l(str+integer);
       XMPushService ta1 = this.a;
       if (ta1 != null) {
          ta1.u(p0, p1);
          this.a = null;
       }
       this.a(7);
       this.a(4);
       bg.c().j(this, p0);
       return;
    }
    public final void a(BroadcastReceiver p0){
       if (p0 != null) {
          try{
             UniversalReceiver.f(this, p0);
          }catch(java.lang.IllegalArgumentException e1){
             c.o(e1);
          }
       }
    }
    public final void a(Intent p0){
       if (p0 == null) {
          return;
       }
       Bundle extras = p0.getExtras();
       if (extras != null) {
          b1.c(this.getApplicationContext()).f(extras.getString("digest"));
       }
       return;
    }
    public final void a(Intent p0,int p1){
       byte[] byteArrayExt = p0.getByteArrayExtra("mipush_payload");
       boolean booleanExtra = p0.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
       try{
          ig oig = new ig();
          i.c(oig, byteArrayExt);
          k.f(this.getApplicationContext()).k(new q(oig, new WeakReference(this), booleanExtra), p1);
       }catch(com.xiaomi.push.ix e0){
          c.u("aw_ping : send help app ping  error");
       }
       return;
    }
    public void a(XMPushService$j p0){
       this.a(p0, 0);
    }
    public void a(XMPushService$j p0,long p1){
       try{
          this.a.f(p0, p1);
       }catch(java.lang.IllegalStateException e2){
          c.l("can\'t execute job err = "+e2.getMessage());
       }
       return;
    }
    public void a(XMPushService$n p0){
       XMPushService ta = this.a;
       _monitor_enter(ta);
       this.a.add(p0);
       _monitor_exit(ta);
    }
    public void a(bg$b p0){
       if (p0 != null) {
          long l = p0.a();
          c.l("schedule rebind job in "+(l / 1000));
          this.a(new XMPushService$b(this, p0), l);
       }
       return;
    }
    public final void a(String p0,int p1){
       Collection uCollection = bg.c().f(p0);
       if (uCollection != null) {
          Iterator iterator = uCollection.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             if (obj != null) {
                XMPushService$s os = new XMPushService$s(this, obj, p1, null, null);
                this.a(v1);
             }
          }
       }
       bg.c().m(p0);
       return;
    }
    public void a(String p0,String p1,int p2,String p3,String p4){
       bg$b uob = bg.c().b(p0, p1);
       if (uob != null) {
          XMPushService$s os = new XMPushService$s(this, uob, p2, p4, p3);
          this.a(v0);
       }
       bg.c().n(p0, p1);
       return;
    }
    public void a(String p0,byte[] p1,boolean p2){
       Collection uCollection = bg.c().f("5");
       if (uCollection.isEmpty()) {
          if (p2) {
          label_0012 :
             e1.f(p0, p1);
          }
       }else if(uCollection.iterator().next().m != bg$c.c){
          if (p2) {
             goto label_0012 ;
          }
       }else {
          this.a(new z(this, 4, p0, p1));
       }
       return;
    }
    public void a(a5 p0){
       c.t("begin to connect...");
       b.f().a(p0);
    }
    public void a(a5 p0,int p1,Exception p2){
       b.f().a(p0, p1, p2);
       if (!this.i()) {
          this.a(false);
       }
       return;
    }
    public void a(a5 p0,Exception p1){
       b.f().a(p0, p1);
       this.c(false);
       if (!this.i()) {
          this.a(false);
       }
       return;
    }
    public void a(p4 p0){
       XMPushService ta = this.a;
       if (ta == null) {
          throw new gg("try send msg while connection is null.");
       }
       ta.v(p0);
       return;
    }
    public void a(boolean p0){
       this.a.c(p0);
    }
    public void a(byte[] p0,String p1){
       if (p0 == null) {
          e1.b(this, p1, p0, 0x42c1d83, "null payload");
          c.l("register request without payload");
       }else {
          try{
             id oid = new id();
             i.c(oid, p0);
             if (oid.a == hh.a) {
                try{
                   ih oih = new ih();
                   i.c(oih, oid.a());
                   n0 on0 = new n0(this, oid.b(), oih.b(), oih.c(), p0);
                   this.a(v3);
                   y3.a(this.getApplicationContext()).f(oid.b(), "E100003", oih.a(), 6002, null);
                }catch(com.xiaomi.push.ix e1){
                   c.u("app register error. "+e1);
                   e1.b(this, p1, p0, 0x42c1d83, " data action error.");
                }
             }else {
                try{
                   e1.b(this, p1, p0, 0x42c1d83, " registration action required.");
                   c.l("register request with invalid payload");
                }catch(com.xiaomi.push.ix e1){
                   c.u("app register fail. "+e1);
                   e1.b(this, p1, p0, 0x42c1d83, " data container error.");
                }
             }
          }catch(com.xiaomi.push.ix e1){
          }
       }
    }
    public void a(p4[] p0){
       XMPushService ta = this.a;
       if (ta == null) {
          throw new gg("try send msg while connection is null.");
       }
       ta.o(p0);
       return;
    }
    public boolean a(){
       boolean b = k0.p(this);
       boolean b1 = (bg.c().a() > 0)? true: false;
       int i = this.b() ^ 1;
       boolean b2 = this.h();
       int i1 = this.g() ^ 1;
       boolean b3 = (b && (b1 && (i && (b2 && i1))))? true: false;
       if (!b3) {
          Object[] objArray = new Object[]{Boolean.valueOf(b),Boolean.valueOf(b1),Boolean.valueOf(i),Boolean.valueOf(b2),Boolean.valueOf(i1)};
          c.v(String.format("not conn, net=%s;cnt=%s;!dis=%s;enb=%s;!spm=%s;", objArray));
       }
       return b3;
    }
    public boolean a(int p0){
       return this.a.h(p0);
    }
    public final boolean a(Context p0){
       boolean b = true;
       try{
          q.a();
          int i = 100;
          while (true) {
             if (i > 0) {
                if (k0.q(p0)) {
                   c.l("network connectivity ok.");
                   break ;
                }else {
                   long l = 100;
                   try{
                      Thread.sleep(l);
                      i = i - 1;
                   }catch(java.lang.Exception e0){
                   }
                }
             }else {
                b = false;
                break ;
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public final boolean a(String p0,Intent p1){
       bg$b uob = bg.c().b(p0, p1.getStringExtra(v.q));
       boolean b = true;
       StringBuilder str = null;
       if (uob != null && p0 != null) {
          String stringExtra = p1.getStringExtra(v.F);
          String stringExtra1 = p1.getStringExtra(v.x);
          if (!TextUtils.isEmpty(uob.j) && !TextUtils.equals(stringExtra, uob.j)) {
             c.l("session changed. old session="+uob.j+", new session="+stringExtra+" chid = "+p0);
             str = 1;
          }
          if (!stringExtra1.equals(uob.i)) {
             c.l("security changed. chid = "+p0+" sechash = "+o0.b(stringExtra1));
          }else {
             b = str;
          }
       }else {
          b = false;
       }
       return b;
    }
    public final int[] a(){
       String str = r.g(this.getApplicationContext()).e(hm.aN.a(), "");
       if (!TextUtils.isEmpty(str)) {
          String[] stringArray = str.split(",");
          if (stringArray != null) {
             int i = 2;
             if (stringArray.length >= i) {
                int[] ointArray = new int[i];
                i = 0;
                try{
                   ointArray[i] = Integer.valueOf(stringArray[i]).intValue();
                   ointArray[1] = Integer.valueOf(stringArray[1]).intValue();
                   if (ointArray[i] >= 0 && (ointArray[i] <= 23 && (ointArray[1] >= 0 && (ointArray[1] <= 23 && ointArray[i] != ointArray[1])))) {
                      return ointArray;
                   }
                }catch(java.lang.NumberFormatException e0){
                   c.u("parse falldown time range failure: "+e0);
                }
             }
          }
       }
    }
    public g0 b(){
       return this.a;
    }
    public final String b(){
       q.a();
       long l = SystemClock.elapsedRealtime();
       String obj = new Object();
       int i = 0;
       if (("com.xiaomi.xmsf").equals(this.getPackageName())) {
          y oy = y.c(this);
          CharSequence uCharSequenc = null;
          while (TextUtils.isEmpty(uCharSequenc) || !oy.a()) {
             if (TextUtils.isEmpty(uCharSequenc)) {
                uCharSequenc = this.a();
             }
             try{
                _monitor_enter(obj);
                if (i < 30) {
                   obj.wait(1000);
                }else {
                   obj.wait(0x7530);
                }
                _monitor_exit(obj);
                i = i + 1;
             }catch(java.lang.InterruptedException e0){
             }
          }
          obj = this.a();
       }else {
          obj = "CN";
       }
       c.l("wait coutrycode :"+obj+" cost = "+(SystemClock.elapsedRealtime() - l)+" , count = "+i);
       return obj;
    }
    public void b(){
       b1.c(this.getApplicationContext()).s();
       Iterator iterator = new ArrayList(this.a).iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public final void b(Intent p0){
       p4 op4;
       long l;
       String str1;
       XMPushService xMPushServic = this;
       Intent intent = p0;
       String stringExtra = intent.getStringExtra(v.B);
       String stringExtra1 = intent.getStringExtra(v.F);
       Bundle bundleExtra = intent.getBundleExtra("ext_packet");
       bg uobg = bg.c();
       if (bundleExtra != null) {
          o5 oo5 = xMPushServic.a(new o5(bundleExtra), stringExtra, stringExtra1);
          if (oo5 == null) {
             return;
          }else {
             op4 = p4.e(oo5, uobg.b(oo5.m(), oo5.q()).i);
          }
       }else {
          byte[] byteArrayExt = intent.getByteArrayExtra("ext_raw_packet");
          if (byteArrayExt != null) {
             try{
                l = Long.parseLong(intent.getStringExtra(v.q));
             }catch(java.lang.NumberFormatException e0){
                l = 0;
             }
             String stringExtra2 = intent.getStringExtra(v.r);
             String stringExtra3 = intent.getStringExtra(v.s);
             String stringExtra4 = intent.getStringExtra("ext_chid");
             bg$b uob = uobg.b(stringExtra4, String.valueOf(l));
             if (uob != null) {
                p4 op41 = new p4();
                String str = "10";
                if (str.equals(stringExtra4)) {
                   op41.r(Integer.parseInt(str));
                   op41.f.c = intent.getBooleanExtra("screen_on", true);
                   op41.f.d = intent.getBooleanExtra("wifi", true);
                   str1 = stringExtra2;
                   op41.f.e = intent.getLongExtra("rx_msg", -1);
                   op41.f.f = intent.getLongExtra("enqueue", -1);
                   op41.f.b = intent.getIntExtra("num", -1);
                   op41.f.g = intent.getLongExtra("run", -1);
                }else {
                   str1 = stringExtra2;
                }
                try{
                   op41.g(Integer.parseInt(stringExtra4));
                }catch(java.lang.NumberFormatException e0){
                }
                op41.j("SECMSG", null);
                stringExtra2 = (TextUtils.isEmpty(str1))? "xiaomi.com": str1;
                op41.h(l, stringExtra2, stringExtra3);
                op41.i(intent.getStringExtra("ext_pkt_id"));
                op41.l(byteArrayExt, uob.i);
                c.l("send a message: chid="+stringExtra4+", packetId="+intent.getStringExtra("ext_pkt_id"));
                op4 = op41;
             }
          }
          op4 = null;
       }
       if (op4 != null) {
          xMPushServic.c(new t(xMPushServic, op4));
       }
       return;
    }
    public void b(XMPushService$j p0){
       this.a.d(p0.b, p0);
    }
    public void b(a5 p0){
       boolean b;
       b.f().b(p0);
       b = true;
       this.c(b);
       this.a.b();
       if (!d4.e() && !this.i()) {
          c.l("reconnection successful, reactivate alarm.");
          d4.d(b);
       }
       Iterator iterator = bg.c().e().iterator();
       while (iterator.hasNext()) {
          this.a(new XMPushService$b(this, iterator.next()));
       }
       if (this.a == null && m6.j(this.getApplicationContext())) {
          k.f(this.getApplicationContext()).g(new p0(this));
       }
       return;
    }
    public final void b(boolean p0){
       this.a = SystemClock.elapsedRealtime();
       if (this.c()) {
          if (k0.p(this)) {
             this.c(new XMPushService$o(this, p0));
          label_002c :
             return;
          }else {
             this.c(new XMPushService$g(this, 17, null));
          }
       }
       this.a(true);
       goto label_002c ;
    }
    public boolean b(){
       boolean b = false;
       Class uClass = f7.c(this, "miui.os.Build");
       Field field = uClass.getField("IS_CM_CUSTOMIZATION_TEST");
       Field field1 = uClass.getField("IS_CU_CUSTOMIZATION_TEST");
       Field field2 = uClass.getField("IS_CT_CUSTOMIZATION_TEST");
       if (!field.getBoolean(null) && (field1.getBoolean(null) || field2.getBoolean(null))) {
          b = true;
       }
       return b;
    }
    public final void c(){
       v1.h().y();
       Objects.requireNonNull(b1.c(this.getApplicationContext()));
       b uob = b.c(this.getApplicationContext());
       String str = uob.a();
       c.l("region of cache is "+str);
       if (TextUtils.isEmpty(str)) {
          str = m6.c(this.b()).name();
       }
       String str1 = "CN";
       if (TextUtils.isEmpty(str) || !(n.a.name()).equals(str)) {
          if (!TextUtils.isEmpty(str)) {
             if (("com.xiaomi.xmsf").equals(this.getPackageName())) {
                str = "";
                str1 = str;
             }else {
                str = n.a.name();
             }
          }else {
             str = n.a.name();
          label_0084 :
             if ((n.a.name()).equals(str)) {
                b5.c("cn.app.chat.xiaomi.net");
             }
             XMPushService.a(str);
             if (this.h()) {
                d0 uod0 = new d0(this, 11);
                this.a(uod0);
                m0.j(new e0(this, uod0));
             }
             try{
                if (f7.f()) {
                   this.a.d(this);
                }
             }catch(java.lang.Exception e0){
                c.o(e0);
             }
             return;
          }
       }
       uob.e(str, true);
       uob.g(str1, true);
       goto label_0084 ;
    }
    public final void c(Intent p0){
       String stringExtra = p0.getStringExtra(v.B);
       String stringExtra1 = p0.getStringExtra(v.F);
       Parcelable[] parcelableAr = p0.getParcelableArrayExtra("ext_packets");
       int len = parcelableAr.length;
       o5[] oo5Array = new o5[len];
       p0.getBooleanExtra("ext_encrypt", true);
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 < parcelableAr.length) {
             oo5Array[i1] = new o5(parcelableAr[i1]);
             oo5Array[i1] = this.a(oo5Array[i1], stringExtra, stringExtra1);
             if (oo5Array[i1] == null) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             bg uobg = bg.c();
             p4[] op4Array = new p4[len];
             for (; i < len; i++) {
                object oobject = oo5Array[i];
                op4Array[i] = p4.e(oobject, uobg.b(oobject.m(), oobject.q()).i);
             }
             this.c(new w(this, op4Array));
             return;
          }
       }
       return;
    }
    public final void c(XMPushService$j p0){
       this.a.e(p0);
    }
    public final void c(boolean p0){
       try{
          if (f7.f()) {
             if (p0) {
                this.sendBroadcast(new Intent("miui.intent.action.NETWORK_CONNECTED"));
                int i = 0;
                i[] oiArray = new i[i];
                i[] oiArray1 = this.a.toArray(oiArray);
                int len = oiArray1.length;
                for (; i < len; i = i + 1) {
                   oiArray1[i].a();
                }
             }else {
                this.sendBroadcast(new Intent("miui.intent.action.NETWORK_BLOCKED"));
             }
          }
       }catch(java.lang.Exception e4){
          c.o(e4);
       }
       return;
    }
    public boolean c(){
       XMPushService ta = this.a;
       boolean b = (ta != null && ta.B())? true: false;
       return b;
    }
    public final void d(){
       NetworkInfo activeNetwor;
       NetworkInfo$State state;
       boolean b = false;
       try{
          activeNetwor = this.getSystemService("connectivity").getActiveNetworkInfo();
       }catch(java.lang.Exception e1){
          c.o(e1);
          activeNetwor = b;
       }
       b1.c(this.getApplicationContext()).e(activeNetwor);
       if (activeNetwor != null) {
          c.l("network changed,"+"["+"type: "+activeNetwor.getTypeName()+"["+activeNetwor.getSubtypeName()+"], state: "+activeNetwor.getState()+"/"+activeNetwor.getDetailedState());
          state = activeNetwor.getState();
          if (state == NetworkInfo$State.SUSPENDED || state == NetworkInfo$State.UNKNOWN) {
             return;
          }
       }else {
          c.l("network changed, no active network");
       }
       if (b.f() != null) {
          b.f().b();
       }
       b6.h(this);
       this.a.C();
       if (k0.p(this)) {
          if (this.c() && this.f()) {
             this.b(false);
          }
          if (!this.c() && !this.d()) {
             this.a.c(1);
             this.a(new XMPushService$e(this));
          }
          f2.c(this).d();
       }else {
          this.a(new XMPushService$g(this, 2, b));
       }
       this.e();
       return;
    }
    public final void d(Intent p0){
       String stringExtra;
       String str;
       int b;
       XMPushService ta;
       int i3;
       XMPushService$b uob1;
       boolean b1;
       String stringExtra1;
       String stringExtra2;
       String stringExtra3;
       p5 op5;
       t ot;
       SharedPreferences sharedPrefer;
       SharedPreferences$Editor uEditor;
       int intExtra;
       String stringExtra4;
       bg uobg = bg.c();
       int i = 2;
       int i1 = 1;
       int i2 = 0;
       if ((v.d).equalsIgnoreCase(p0.getAction()) || (v.j).equalsIgnoreCase(p0.getAction())) {
          stringExtra = p0.getStringExtra(v.t);
          if (TextUtils.isEmpty(p0.getStringExtra(v.x))) {
             str = "security is empty. ignore.";
          label_0816 :
             c.l(str);
          }else if(!TextUtils.isEmpty(stringExtra)){
             b = this.a(stringExtra, p0);
             bg$b uob = this.a(stringExtra, p0);
             if (!k0.q(this)) {
                ta = this.a;
                i3 = 2;
             }else if(this.c()){
                bg$b m = uob.m;
                if (m == bg$c.a) {
                   uob1 = new XMPushService$b(this, uob);
                label_01b4 :
                   this.c(uob1);
                }else if(b){
                   uob1 = new XMPushService$p(this, uob);
                   goto label_01b4 ;
                }else if(m == bg$c.b){
                   Object[] objArray = new Object[i];
                   objArray[i2] = uob.h;
                   objArray[i1] = bg$b.e(uob.b);
                   str = String.format("the client is binding. %1$s %2$s.", objArray);
                   goto label_0816 ;
                }else if(m == bg$c.c){
                   ta = this.a;
                   b1 = true;
                   i3 = 0;
                }
             }else {
             label_0862 :
                this.a(i1);
             }
             ta.h(this, uob, false, i3, null);
          }else {
             str = "channel id is empty, do nothing!";
          label_0520 :
             c.u(str);
          }
       }else if((v.i).equalsIgnoreCase(p0.getAction())){
          stringExtra1 = p0.getStringExtra(v.B);
          stringExtra2 = p0.getStringExtra(v.t);
          stringExtra3 = p0.getStringExtra(v.q);
          c.l("Service called close channel chid = "+stringExtra2+" res = "+bg$b.e(stringExtra3));
          if (TextUtils.isEmpty(stringExtra2)) {
             Iterator iterator = uobg.g(stringExtra1).iterator();
             while (iterator.hasNext()) {
                this.a(iterator.next(), i);
             }
          }else if(TextUtils.isEmpty(stringExtra3)){
             this.a(stringExtra2, i);
          }else {
             this.a(stringExtra2, stringExtra3, 2, null, null);
          }
       }else if((v.e).equalsIgnoreCase(p0.getAction())){
          if (("10").equals(p0.getStringExtra("ext_chid"))) {
             p0.putExtra("run", System.currentTimeMillis());
          }
          this.b(p0);
       }else if((v.g).equalsIgnoreCase(p0.getAction())){
          this.c(p0);
       }else {
          String str1 = "ext_packet";
          if ((v.f).equalsIgnoreCase(p0.getAction())) {
             op5 = this.a(new e(p0.getBundleExtra(str1)), p0.getStringExtra(v.B), p0.getStringExtra(v.F));
             if (op5 != null) {
                ot = new t(this, p4.e(op5, uobg.b(op5.m(), op5.q()).i));
             }
          }else if((v.h).equalsIgnoreCase(p0.getAction())){
             op5 = this.a(new go(p0.getBundleExtra(str1)), p0.getStringExtra(v.B), p0.getStringExtra(v.F));
             if (op5 != null) {
                ot = new t(this, p4.e(op5, uobg.b(op5.m(), op5.q()).i));
             }
          }else if((v.k).equals(p0.getAction())){
             stringExtra = p0.getStringExtra(v.t);
             stringExtra1 = p0.getStringExtra(v.q);
             if (stringExtra != null) {
                c.l("request reset connection from chid = "+stringExtra);
                bg$b uob2 = bg.c().b(stringExtra, stringExtra1);
                if (uob2 != null && ((uob2.i).equals(p0.getStringExtra(v.x)) && uob2.m == bg$c.c)) {
                   a5 uoa5 = this.a();
                   if (uoa5 == null || !uoa5.q((SystemClock.elapsedRealtime() - 0x3a98))) {
                      uob1 = new XMPushService$q(this);
                      goto label_01b4 ;
                   }
                }
             }
          }else {
             bg$b uob3 = null;
             if ((v.l).equals(p0.getAction())) {
                stringExtra1 = p0.getStringExtra(v.B);
                ArrayList uArrayList = uobg.g(stringExtra1);
                if (uArrayList.isEmpty()) {
                   str = "open channel should be called first before update info, pkg="+stringExtra1;
                }else {
                   stringExtra1 = p0.getStringExtra(v.t);
                   stringExtra2 = p0.getStringExtra(v.q);
                   if (TextUtils.isEmpty(stringExtra1)) {
                      stringExtra1 = uArrayList.get(i2);
                   }
                   if (TextUtils.isEmpty(stringExtra2)) {
                      Collection uCollection = uobg.f(stringExtra1);
                      if (uCollection != null && !uCollection.isEmpty()) {
                         uob3 = uCollection.iterator().next();
                      }
                   }else {
                      uob3 = uobg.b(stringExtra1, stringExtra2);
                   }
                   if (uob3 != null) {
                      if (p0.hasExtra(v.z)) {
                         uob3.f = p0.getStringExtra(v.z);
                      }
                      if (p0.hasExtra(v.A)) {
                         uob3.g = p0.getStringExtra(v.A);
                      }
                   }
                }
             }else {
                stringExtra1 = "android.intent.action.SCREEN_ON";
                stringExtra2 = "android.intent.action.SCREEN_OFF";
                if (stringExtra1.equals(p0.getAction()) || stringExtra2.equals(p0.getAction())) {
                   if (stringExtra1.equals(p0.getAction())) {
                      if (!this.i()) {
                         c.l("exit falldown mode, activate alarm.");
                         this.e();
                         if (!this.c() && !this.d()) {
                            goto label_0862 ;
                         }
                      }
                   }else if(stringExtra2.equals(p0.getAction()) && (this.i() && d4.e())){
                      c.l("enter falldown mode, stop alarm.");
                      d4.a();
                   }
                }else {
                   stringExtra1 = "com.xiaomi.xmsf";
                   stringExtra2 = "mipush_payload";
                   stringExtra3 = "mipush_app_package";
                   if (("com.xiaomi.mipush.REGISTER_APP").equals(p0.getAction())) {
                      if (y.c(this.getApplicationContext()).d() && !y.c(this.getApplicationContext()).a()) {
                         str = "register without being provisioned. "+p0.getStringExtra(stringExtra3);
                      }else {
                         byte[] byteArrayExt = p0.getByteArrayExtra(stringExtra2);
                         stringExtra3 = p0.getStringExtra(stringExtra3);
                         i1 = p0.getIntExtra("mipush_env_type", i1);
                         d1.a(this).h(stringExtra3);
                         if (p0.getBooleanExtra("mipush_env_chanage", i2) && !stringExtra1.equals(this.getPackageName())) {
                            f0 uof0 = new f0(this, 14, i1, stringExtra3, byteArrayExt);
                            goto label_01b4 ;
                         }else {
                            this.a(byteArrayExt, stringExtra3);
                         }
                      }
                   }else {
                      String str2 = "com.xiaomi.mipush.UNREGISTER_APP";
                      if (("com.xiaomi.mipush.SEND_MESSAGE").equals(p0.getAction()) || str2.equals(p0.getAction())) {
                         stringExtra = p0.getStringExtra(stringExtra3);
                         byte[] byteArrayExt1 = p0.getByteArrayExtra(stringExtra2);
                         i = p0.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", i1);
                         if (a1.b(byteArrayExt1, stringExtra)) {
                            str = "duplicate msg from: "+String.valueOf(stringExtra);
                            goto label_0816 ;
                         }else if(str2.equals(p0.getAction())){
                            d1.a(this).b(stringExtra);
                            if (m6.j(this.getApplicationContext())) {
                               c.d(stringExtra);
                            }
                         }
                         this.a(stringExtra, byteArrayExt1, i);
                      }else {
                         str2 = "pref_registered_pkg_names";
                         if ((z.a).equals(p0.getAction())) {
                            str = p0.getStringExtra("uninstall_pkg_name");
                            if (str == null || TextUtils.isEmpty(str.trim())) {
                               return;
                            }else {
                               try{
                                  PackageInfo packageInfo = this.getPackageManager().getPackageInfo(str, i2);
                                  if (packageInfo != null && (packageInfo.applicationInfo != null && i6.i(this, packageInfo.packageName))) {
                                     c.l("dual space\'s app uninstalled "+str);
                                  }else {
                                     i1 = 0;
                                  }
                               }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                               }
                               if (("com.xiaomi.channel").equals(str)) {
                                  stringExtra1 = "1";
                                  if (!bg.c().f(stringExtra1).isEmpty() && i1) {
                                     this.a(stringExtra1, i2);
                                     str = "close the miliao channel as the app is uninstalled.";
                                  }
                               }
                               sharedPrefer = o.c(this, str2, i2);
                               stringExtra1 = sharedPrefer.getString(str, uob3);
                               if (!TextUtils.isEmpty(stringExtra1) && i1) {
                                  uEditor = sharedPrefer.edit();
                                  uEditor.remove(str);
                                  g.b(uEditor);
                                  if (k.V(this, str)) {
                                     k.Z(this, str);
                                  }
                                  k.x(this, str);
                                  k.e(this.getApplicationContext(), str);
                                  if (this.c() && stringExtra1 != null) {
                                     try{
                                        g.i(this, g.a(str, stringExtra1));
                                        c.l("uninstall "+str+" msg sent");
                                     }catch(com.xiaomi.push.gg e12){
                                        c.u("Fail to send Message: "+e12.getMessage());
                                        this.a(10, e12);
                                     }
                                  }
                               }
                            }
                         }else if((z.b).equals(p0.getAction())){
                            str = p0.getStringExtra("data_cleared_pkg_name");
                            if (TextUtils.isEmpty(str)) {
                               return;
                            }else {
                               sharedPrefer = o.c(this, str2, i2);
                               if (sharedPrefer != null) {
                                  uob3 = sharedPrefer.getString(str, uob3);
                               }
                               if (!TextUtils.isEmpty(uob3)) {
                                  uEditor = sharedPrefer.edit();
                                  uEditor.remove(str);
                                  g.b(uEditor);
                                  if (k.V(this, str)) {
                                     k.Z(this, str);
                                  }
                                  k.x(this, str);
                                  this.a(str, i.d(g.m(str, uob3)), i1);
                               }
                               k.e(this, str);
                               if (m6.j(this.getApplicationContext())) {
                                  c.d(str);
                               }
                            }
                         }else if(("com.xiaomi.mipush.CLEAR_NOTIFICATION").equals(p0.getAction())){
                            stringExtra = p0.getStringExtra(v.B);
                            b = p0.getIntExtra(v.C, -2);
                            if (!TextUtils.isEmpty(stringExtra)) {
                               i = -1;
                               if (b >= i) {
                                  k.z(this, stringExtra, b, p0.getIntExtra(v.D, i));
                               }else {
                                  k.A(this, stringExtra, p0.getStringExtra(v.H), p0.getStringExtra(v.I));
                               }
                            }
                         }else if(("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION").equals(p0.getAction())){
                            str = p0.getStringExtra(v.B);
                            if (!TextUtils.isEmpty(str)) {
                               k.R(this, str);
                            }
                         }else if(("com.xiaomi.mipush.SET_NOTIFICATION_TYPE").equals(p0.getAction())){
                            stringExtra = p0.getStringExtra(v.B);
                            stringExtra1 = p0.getStringExtra(v.G);
                            if (p0.hasExtra(v.E)) {
                               intExtra = p0.getIntExtra(v.E, i2);
                               str1 = o0.d(stringExtra+intExtra);
                               i2 = intExtra;
                               i1 = 0;
                            }else {
                               str1 = o0.d(stringExtra);
                            }
                            if (TextUtils.isEmpty(stringExtra) || !TextUtils.equals(stringExtra1, str1)) {
                               str = "invalid notification for "+stringExtra;
                               goto label_0520 ;
                            }else if(i1){
                               k.Z(this, stringExtra);
                            }else {
                               k.S(this, stringExtra, i2);
                            }
                         }else if(("com.xiaomi.mipush.DISABLE_PUSH").equals(p0.getAction())){
                            str = p0.getStringExtra(stringExtra3);
                            if (!TextUtils.isEmpty(str)) {
                               d1.a(this).d(str);
                            }
                            if (!stringExtra1.equals(this.getPackageName())) {
                               this.a(19, uob3);
                               this.e();
                               this.stopSelf();
                            }
                         }else {
                            str1 = "com.xiaomi.mipush.DISABLE_PUSH_MESSAGE";
                            str2 = "android.net.conn.CONNECTIVITY_CHANGE";
                            if (str1.equals(p0.getAction()) || "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(p0.getAction())) {
                               stringExtra4 = p0.getStringExtra(stringExtra3);
                               byte[] byteArrayExt2 = p0.getByteArrayExtra(stringExtra2);
                               String stringExtra5 = p0.getStringExtra("mipush_app_id");
                               stringExtra2 = p0.getStringExtra("mipush_app_token");
                               if (str1.equals(p0.getAction())) {
                                  d1.a(this).f(stringExtra4);
                               }
                               if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(p0.getAction())) {
                                  d1.a(this).i(stringExtra4);
                                  d1.a(this).j(stringExtra4);
                               }
                               if (byteArrayExt2 == null) {
                                  e1.b(this, stringExtra4, byteArrayExt2, 0x42c1d83, "null payload");
                               }else {
                                  e1.f(stringExtra4, byteArrayExt2);
                                  n0 on0 = new n0(this, stringExtra4, stringExtra5, stringExtra2, byteArrayExt2);
                                  this.a(uobg);
                                  if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(p0.getAction()) && this.a == null) {
                                     this.a = new XMPushService$f(this);
                                     UniversalReceiver.e(this, this.a, new IntentFilter(str2));
                                  }
                               }
                            }else if(("com.xiaomi.mipush.SEND_TINYDATA").equals(p0.getAction())){
                               stringExtra = p0.getStringExtra(stringExtra3);
                               byte[] byteArrayExt3 = p0.getByteArrayExtra(stringExtra2);
                               try{
                                  hl ohl = new hl();
                                  i.c(ohl, byteArrayExt3);
                                  g6.b(this).e(ohl, stringExtra);
                               }catch(com.xiaomi.push.ix e12){
                                  c.o(e12);
                               }
                            }else if(("com.xiaomi.push.timer").equalsIgnoreCase(p0.getAction())){
                               c.l("[Alarm] Service called on timer");
                               if (this.i()) {
                                  if (d4.e()) {
                                     c.l("enter falldown mode, stop alarm");
                                     d4.a();
                                  }
                               }else {
                                  d4.d(i2);
                                  if (this.f()) {
                                     this.b(i2);
                                  }
                               }
                               XMPushService ta1 = this.a;
                               if (ta1 != null) {
                                  XMPushService$a.c(ta1);
                               }
                            }else if(("com.xiaomi.push.check_alive").equalsIgnoreCase(p0.getAction())){
                               c.l("Service called on check alive.");
                               if (this.f()) {
                                  this.b(i2);
                               }
                            }else if(("com.xiaomi.mipush.thirdparty").equals(p0.getAction())){
                               c.l("on thirdpart push :"+p0.getStringExtra("com.xiaomi.mipush.thirdparty_DESC"));
                               d4.c(this, p0.getIntExtra("com.xiaomi.mipush.thirdparty_LEVEL", i2));
                            }else if(str2.equals(p0.getAction())){
                               this.d();
                            }else if(("miui.net.wifi.DIGEST_INFORMATION_CHANGED").equals(p0.getAction())){
                               this.a(p0);
                            }else if(("com.xiaomi.xmsf.USE_INTELLIGENT_HB").equals(p0.getAction())){
                               if (p0.getExtras() != null) {
                                  intExtra = p0.getExtras().getInt("effectivePeriod", i2);
                                  if (intExtra > 0 && intExtra <= 0x93a80) {
                                     b1.c(this.getApplicationContext()).d(intExtra);
                                  }
                               }
                            }else if(("action_cr_config").equals(p0.getAction())){
                               long longExtra = p0.getLongExtra("action_cr_event_frequency", 0x15180);
                               long longExtra1 = p0.getLongExtra("action_cr_perf_frequency", 0x15180);
                               long longExtra2 = p0.getLongExtra("action_cr_max_file_size", 0x100000);
                               a$a uoa = a.b();
                               uoa.e(p0.getBooleanExtra("action_cr_event_switch", i2));
                               uoa.d(longExtra);
                               uoa.h(p0.getBooleanExtra("action_cr_perf_switch", i2));
                               uoa.g(longExtra1);
                               uoa.b(t0.b(this.getApplicationContext()));
                               uoa.c(p0.getBooleanExtra("action_cr_event_en", i1));
                               uoa.f(longExtra2);
                               a uoa1 = uoa.a(this.getApplicationContext());
                               if (!stringExtra1.equals(this.getPackageName())) {
                                  Context uContext = null;
                                  if (longExtra - uContext > 0 && (longExtra1 - uContext > 0 && longExtra2 - uContext > 0)) {
                                     x3.n(this.getApplicationContext(), uoa1);
                                  }
                               }
                            }else if(("action_help_ping").equals(p0.getAction())){
                               boolean booleanExtra = p0.getBooleanExtra("extra_help_ping_switch", i2);
                               i = p0.getIntExtra("extra_help_ping_frequency", i2);
                               stringExtra4 = 30;
                               if (i >= 0 && i < stringExtra4) {
                                  c.t("aw_ping: frquency need > 30s.");
                                  i = 30;
                               }
                               if (i >= 0) {
                                  i2 = booleanExtra;
                               }
                               c.l("aw_ping: receive a aw_ping message. switch: "+i2+" frequency: "+i);
                               if (i2 && (i > 0 && !stringExtra1.equals(this.getPackageName()))) {
                                  this.a(p0, i);
                               }
                            }else if(("action_aw_app_logic").equals(p0.getAction())){
                               this.e(p0);
                            }else if((v.n).equals(p0.getAction())){
                               h0.b(this.getApplicationContext(), p0);
                            }
                         }
                      }
                   }
                }
             }
             c.l(str);
             return;
          }
          this.c(ot);
       }
    }
    public boolean d(){
       XMPushService ta = this.a;
       boolean b = (ta != null && ta.z())? true: false;
       return b;
    }
    public final void e(){
       if (this.a()) {
          if (!d4.e()) {
             d4.d(true);
          }
       }else {
          d4.a();
       }
       return;
    }
    public final void e(Intent p0){
       String stringExtra;
       String str;
       Object obj;
       int i;
       try{
          o3.c(this.getApplicationContext()).l(new x());
          stringExtra = p0.getStringExtra("mipush_app_package");
          byte[] byteArrayExt = p0.getByteArrayExtra("mipush_payload");
          if (byteArrayExt == null) {
             return;
          }else {
             ig oig = new ig();
             i.c(oig, byteArrayExt);
             str = oig.b();
             Map map = oig.a();
             if (map != null) {
                obj = map.get("extra_help_aw_info");
                String str1 = map.get("extra_aw_app_online_cmd");
                if (!TextUtils.isEmpty(str1)) {
                   i = Integer.parseInt(str1);
                }
             }
          }
       }catch(com.xiaomi.push.ix e8){
          c.u("aw_logic: translate fail. "+e8.getMessage());
       }catch(java.lang.NumberFormatException e0){
          i = 0;
       }
       if (!TextUtils.isEmpty(stringExtra) && (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(obj))) {
          o3.c(this.getApplicationContext()).f(this, obj, i, stringExtra, str);
       }
    }
    public final void f(){
       String str;
       XMPushService ta = this.a;
       if (ta != null && ta.z()) {
          str = "try to connect while connecting.";
       }else {
          ta = this.a;
          if (ta != null && ta.B()) {
             str = "try to connect while is connected.";
          }else {
             this.a.i(k0.e(this));
             this.g();
             if (this.a == null) {
                bg.c().i(this);
                this.c(false);
             }
             return;
          }
       }
       c.u(str);
       return;
    }
    public final boolean f(){
       if ((SystemClock.elapsedRealtime() - this.a) - 0x7530 < 0) {
          return false;
       }
       return k0.r(this);
    }
    public final void g(){
       try{
          this.a.m(this.a, new o0(this));
          this.a.O();
          this.a = this.a;
       }catch(com.xiaomi.push.gg e0){
          c.n("fail to create Slim connection", e0);
          this.a.u(3, e0);
       }
       return;
    }
    public final boolean g(){
       int i = 0;
       if (("com.xiaomi.xmsf").equals(this.getPackageName()) && Settings$System.getInt(this.getContentResolver(), "power_supersave_mode_open", i) == 1) {
          i = true;
       }
       return i;
    }
    public final void h(){
    }
    public final boolean h(){
       if (!("com.xiaomi.xmsf").equals(this.getPackageName())) {
          return (d1.a(this).e(this.getPackageName()) ^ 0x01);
       }
       c.l("current sdk expect region is cn");
       return (n.a.name()).equals(b.c(this.getApplicationContext()).a());
    }
    public final void i(){
       XMPushService ta = this.a;
       _monitor_enter(ta);
       this.a.clear();
       _monitor_exit(ta);
    }
    public final boolean i(){
       boolean b = ((this.getApplicationContext().getPackageName()).equals("com.xiaomi.xmsf") && (this.j() && (!i6.n(this) && !i6.h(this.getApplicationContext()))))? true: false;
       return b;
    }
    public final boolean j(){
       int i = 1;
       Object[] objArray = new Object[i];
       objArray[0] = new Date();
       int i1 = Integer.valueOf(String.format("%tH", objArray)).intValue();
       XMPushService ta = this.a;
       XMPushService tb = this.b;
       if (ta > tb) {
          if (i1 < ta && i1 >= tb) {
          label_002b :
             i = false;
          }
       }else if(ta < tb && (i1 >= ta && i1 < tb)){
       }
       return i;
    }
    public final boolean k(){
       if (TextUtils.equals(this.getPackageName(), "com.xiaomi.xmsf")) {
          return false;
       }
       return r.g(this).m(hm.H.a(), false);
    }
    public IBinder onBind(Intent p0){
       return this.a.getBinder();
    }
    public void onCreate(){
       HandlerThread handlerThrea;
       super.onCreate();
       c.j(this.getApplicationContext());
       f7.e(this);
       l0 ol0 = m0.b(this);
       if (ol0 != null) {
          c.b(ol0.g);
       }
       y oy = null;
       boolean b = true;
       if (m6.j(this.getApplicationContext())) {
          handlerThrea = new HandlerThread("hb-alarm");
          handlerThrea.start();
          Handler handler = new Handler(handlerThrea.getLooper());
          this.a = new XMPushService$a(this, oy);
          this.registerReceiver(this.a, new IntentFilter(v.p), "com.xiaomi.xmsf.permission.MIPUSH_RECEIVE", handler);
          XMPushService.b = b;
          handler.post(new q0(this));
       }
       this.a = new Messenger(new r0(this));
       w.d(this);
       s0 os0 = new s0(this, null, 5222, "xiaomi.com", null);
       this.a = handlerThrea;
       handlerThrea.e(b);
       this.a = new w4(this, this.a);
       this.a = this.a();
       d4.b(this);
       this.a.l(this);
       this.a = new n(this);
       this.a = new s(this);
       new y0().b();
       b.e().j(this);
       this.a = new i0("Connection Controller Thread");
       bg uobg = bg.c();
       uobg.o();
       uobg.k(new b0(this));
       if (this.k()) {
          this.h();
       }
       g6.b(this).d(new j0(this), "UPLOADER_PUSH_CHANNEL");
       this.a(new d6(this));
       this.a(new x(this));
       if (m6.j(this)) {
          this.a(new o());
       }
       this.a(new XMPushService$h(this));
       this.a.add(u.c(this));
       if (this.h()) {
          this.a = new XMPushService$f(this);
          UniversalReceiver.e(this, this.a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
       }
       if (m6.j(this.getApplicationContext())) {
          this.a = new XMPushService$t(this);
          this.registerReceiver(this.a, new IntentFilter("miui.net.wifi.DIGEST_INFORMATION_CHANGED"), "miui.net.wifi.permission.ACCESS_WIFI_DIGEST_INFO", oy);
          XMPushService$k ok = new XMPushService$k(this);
          this.a = ok;
          this.registerReceiver(ok, new IntentFilter("com.xiaomi.xmsf.USE_INTELLIGENT_HB"), "com.xiaomi.xmsf.permission.INTELLIGENT_HB", oy);
       }
       boolean b1 = false;
       if (("com.xiaomi.xmsf").equals(this.getPackageName())) {
          Uri uriFor = Settings$System.getUriFor("power_supersave_mode_open");
          if (uriFor != null) {
             this.a = new c0(this, new Handler(Looper.getMainLooper()));
             this.getContentResolver().registerContentObserver(uriFor, b1, this.a);
          }
          int[] ointArray = this.a();
          if (ointArray != null) {
             this.a = new XMPushService$r(this);
             IntentFilter intentFilter = new IntentFilter();
             intentFilter.addAction("android.intent.action.SCREEN_ON");
             intentFilter.addAction("android.intent.action.SCREEN_OFF");
             UniversalReceiver.e(this, this.a, intentFilter);
             this.a = ointArray[b1];
             this.b = ointArray[b];
             c.l("falldown initialized: "+this.a+","+this.b);
          }
       }
       try{
          String str = "";
          if (ol0 != null && !TextUtils.isEmpty(ol0.a)) {
             String[] stringArray = (ol0.a).split("@");
             if (stringArray != null && stringArray.length > 0) {
                str = stringArray[b1];
             }
          }
       label_0201 :
          c.v("XMPushService created. pid="+Process.myPid()+", uid="+Process.myUid()+", vc="+g.b(this.getApplicationContext(), this.getPackageName())+", uuid="+str);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void onDestroy(){
       XMPushService ta = this.a;
       XMPushService$f uof = null;
       if (ta != null) {
          this.a(ta);
          this.a = uof;
       }
       ta = this.a;
       if (ta != null) {
          this.a(ta);
          this.a = uof;
       }
       ta = this.a;
       if (ta != null) {
          this.a(ta);
          this.a = uof;
       }
       ta = this.a;
       if (ta != null) {
          this.a(ta);
          this.a = uof;
       }
       ta = this.a;
       if (ta != null) {
          this.a(ta);
          this.a = uof;
       }
       if (("com.xiaomi.xmsf").equals(this.getPackageName()) && this.a != null) {
          this.getContentResolver().unregisterContentObserver(this.a);
       }
    label_0061 :
       this.a.clear();
       this.a.j();
       this.a(new a0(this, 2));
       this.a(new XMPushService$l(this));
       bg.c().o();
       bg.c().j(this, 15);
       bg.c().h();
       this.a.w(this);
       e0.h().i();
       d4.a();
       this.i();
       super.onDestroy();
       c.l("Service destroyed");
       return;
    }
    public void onStart(Intent p0,int p1){
       XMPushService$i oi;
       long l = System.currentTimeMillis();
       if (p0 == null) {
          c.u("onStart\(\) with intent NULL");
       }else {
          Object[] objArray = new Object[]{p0.getAction(),p0.getStringExtra(v.t),p0.getStringExtra(v.B),p0.getStringExtra("mipush_app_package")};
          c.l(String.format("onStart\(\) with intent.Action = %s, chid = %s, pkg = %s|%s", objArray));
       }
       if (p0 != null && p0.getAction() != null) {
          if (("com.xiaomi.push.timer").equalsIgnoreCase(p0.getAction()) || ("com.xiaomi.push.check_alive").equalsIgnoreCase(p0.getAction())) {
             if (this.a.g()) {
                c.u("ERROR, the job controller is blocked.");
                bg.c().j(this, 14);
                this.stopSelf();
             }else {
                oi = new XMPushService$i(this, p0);
             }
          }else if(("com.xiaomi.push.network_status_changed").equalsIgnoreCase(p0.getAction())){
             if (("10").equals(p0.getStringExtra("ext_chid"))) {
                p0.putExtra("rx_msg", System.currentTimeMillis());
                p0.putExtra("screen_on", g7.c(this.getApplicationContext()));
                p0.putExtra("wifi", k0.s(this.getApplicationContext()));
             }
             oi = new XMPushService$i(this, p0);
          }
          this.a(oi);
       }
    label_00c1 :
       long l1 = System.currentTimeMillis() - l;
       if (l1 - 50 > 0) {
          c.t("[Prefs] spend "+l1+" ms, too more times.");
       }
       return;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       this.onStart(p0, p2);
       return 1;
    }
}
