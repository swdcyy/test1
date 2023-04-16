package com.xiaomi.push.service.bg$b;
import java.lang.Object;
import com.xiaomi.push.service.bg$c;
import java.util.concurrent.CopyOnWriteArrayList;
import com.xiaomi.push.service.XMPushService$c;
import com.xiaomi.push.service.bg$b$b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.p;
import com.xiaomi.push.service.bg$b$a;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Math;
import android.os.IBinder;
import android.os.Messenger;
import android.os.IBinder$DeathRecipient;
import android.content.Context;
import com.xiaomi.push.service.g0;
import android.os.Handler;
import android.os.Message;
import com.xiaomi.push.service.bg$b$c;
import java.lang.StringBuilder;
import rs8.c;
import java.lang.Exception;
import java.util.Iterator;
import ys8.v;
import com.xiaomi.push.service.XMPushService$j;

public class bg$b	// class@001162
{
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public g0 k;
    public Context l;
    public bg$c m;
    public int n;
    public final CopyOnWriteArrayList o;
    public XMPushService p;
    public bg$c q;
    public Messenger r;
    public boolean s;
    public XMPushService$c t;
    public IBinder$DeathRecipient u;
    public final bg$b$b v;

    public void bg$b(){
       super();
       this.m = bg$c.a;
       this.n = 0;
       this.o = new CopyOnWriteArrayList();
       this.q = null;
       this.s = false;
       this.t = new XMPushService$c(this);
       this.u = null;
       this.v = new bg$b$b(this);
    }
    public void bg$b(XMPushService p0){
       super();
       this.m = bg$c.a;
       this.n = 0;
       this.o = new CopyOnWriteArrayList();
       this.q = null;
       this.s = false;
       this.t = new XMPushService$c(this);
       this.u = null;
       this.v = new bg$b$b(this);
       this.p = p0;
       this.i(new p(this));
    }
    public static XMPushService$c b(bg$b p0){
       return p0.t;
    }
    public static XMPushService c(bg$b p0){
       return p0.p;
    }
    public static String e(String p0){
       String str = "";
       if (TextUtils.isEmpty(p0)) {
          return str;
       }
       int i = p0.lastIndexOf("/");
       if (i != -1) {
          str = p0.substring((i + 1));
       }
       return str;
    }
    public static void j(bg$b p0,int p1,int p2,String p3,String p4){
       p0.g(p1, p2, p3, p4);
    }
    public static boolean m(bg$b p0,int p1,int p2,String p3){
       return p0.l(p1, p2, p3);
    }
    public long a(){
       return (((long)((Math.random() * 20.00f) - 10.00f) + (long)((this.n + 1) * 15)) * 1000);
    }
    public String d(int p0){
       if (p0 == 1) {
          return "OPEN";
       }
       if (p0 == 2) {
          return "CLOSE";
       }
       if (p0 != 3) {
          return "unknown";
       }
       return "KICK";
    }
    public void f(){
       try{
          bg$b tr = this.r;
          if (tr != null && this.u != null) {
             tr.getBinder().unlinkToDeath(this.u, 0);
          }
       label_0012 :
          this.q = null;
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void g(int p0,int p1,String p2,String p3){
       bg$b tm = this.m;
       this.q = tm;
       if (p0 == 2) {
          this.k.f(this.l, this, p1);
       }else if(p0 == 3){
          this.k.g(this.l, this, p3, p2);
       }else if(p0 == 1){
          boolean b = (tm == bg$c.c)? true: false;
          if (!b && ("wait").equals(p3)) {
             this.n = this.n + 1;
          }else if(b){
             this.n = 0;
             if (this.r != null) {
                Message message = Message.obtain(null, 16, this.p.a);
                this.r.send(message);
             }
          }
          this.k.h(this.p, this, b, p1, p2);
       }
    }
    public void h(Messenger p0){
       try{
          this.f();
          if (p0 != null) {
             this.r = p0;
             this.s = true;
             this.u = new bg$b$c(this, this, p0);
             p0.getBinder().linkToDeath(this.u, 0);
          }else {
             c.s("peer linked with old sdk chid = "+this.h);
          }
       }catch(java.lang.Exception e4){
          c.s("peer linkToDeath err: "+e4.getMessage());
          this.r = null;
          this.s = false;
       }
       return;
    }
    public void i(bg$b$a p0){
       this.o.add(p0);
    }
    public void k(bg$c p0,int p1,int p2,String p3,String p4){
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          bg$b$a uob$a = iterator.next();
          if (uob$a != null) {
             uob$a.a(this.m, p0, p2);
          }
       }
       bg$b tm = this.m;
       int i = 0;
       if (tm != p0) {
          Object[] objArray = new Object[]{tm,p0,this.d(p1),v.a(p2),p3,p4,this.h};
          c.l(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", objArray));
          this.m = p0;
       }
       if (this.k == null) {
          c.u("status changed while the client dispatcher is missing");
          return;
       }else if(p0 == bg$c.b){
          return;
       }else if(this.q != null){
          tm = this.s;
          if (tm != null) {
             i = (this.r != null && tm != null)? 1000: 0x2774;
          }
       }
       this.p.b(this.v);
       if (this.o(p1, p2, p4)) {
          this.g(p1, p2, p3, p4);
       }else {
          tm = this.v;
          tm.c(p1, p2, p3, p4);
          this.p.a(tm, (long)i);
       }
       return;
    }
    public final boolean l(int p0,int p1,String p2){
       StringBuilder str;
       String str1;
       bg$b tq = this.q;
       boolean b = true;
       if (tq != null) {
          bg$b ts = this.s;
          if (ts != null) {
             if (tq == this.m) {
                str = "";
                str1 = " status recovered, don\'t notify client:";
             }else if(this.r != null && ts != null){
                c.s("Peer alive notify status to client:"+this.h);
                return b;
             }else {
                str = "";
                str1 = "peer died, ignore notify ";
             }
             c.s(str+str1+this.h);
             return false;
          }
       }
       return b;
    }
    public void n(bg$b$a p0){
       this.o.remove(p0);
    }
    public final boolean o(int p0,int p1,String p2){
       if (p0 != 1) {
          if (p0 == 2) {
             return this.p.c();
          }
          if (p0 != 3) {
             return false;
          }
          return ("wait".equals(p2) ^ 1);
       }else if(this.m == bg$c.c){
          return false;
       }else if(!this.p.c()){
          return false;
       }else if(p1 == 21 || (p1 == 7 && "wait".equals(p2))){
          return false;
       }else {
          return 1;
       }
    }
}
