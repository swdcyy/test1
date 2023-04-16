package com.vivo.push.e;
import java.lang.Object;
import android.util.SparseArray;
import com.vivo.push.d;
import android.content.Context;
import java.lang.String;
import android.os.SystemClock;
import com.vivo.push.util.b;
import com.vivo.push.e$a;
import com.vivo.push.b.b;
import com.vivo.push.IPushActionListener;
import com.vivo.push.b.c;
import com.vivo.push.h;
import java.lang.Runnable;
import java.lang.Integer;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.t;
import com.vivo.push.util.w;
import com.vivo.push.b.g;
import com.vivo.push.o;
import android.content.Intent;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.IPushClientFactory;
import com.vivo.push.util.p;
import com.vivo.push.d.z;
import java.lang.StringBuilder;
import com.vivo.push.b.n;
import com.vivo.push.l;
import com.vivo.push.m;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.g;
import java.util.ArrayList;
import com.vivo.push.b.a;
import com.vivo.push.b.z;
import java.util.List;
import java.util.Iterator;
import org.json.JSONObject;
import java.lang.System;
import org.json.JSONException;
import com.vivo.push.util.z;
import com.vivo.push.j;
import com.vivo.push.i;
import com.vivo.push.f;
import java.lang.Boolean;
import com.vivo.push.k;
import java.lang.Long;

public final class e	// class@00107f
{
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Context h;
    public boolean i;
    public b j;
    public String k;
    public String l;
    public SparseArray m;
    public int n;
    public Boolean o;
    public Long p;
    public boolean q;
    public IPushClientFactory r;
    public int s;
    public static e a;

    public void e(){
       super();
       this.b = -1;
       this.c = -1;
       this.d = -1;
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.i = true;
       this.m = new SparseArray();
       this.n = 0;
       this.r = new d();
    }
    public static Context a(e p0){
       return p0.h;
    }
    public static synchronized e a(){
       _monitor_enter(e.class);
       if (e.a == null) {
          e.a = new e();
       }
       _monitor_exit(e.class);
       return e.a;
    }
    public static String a(e p0,String p1){
       p0.k = p1;
       return p1;
    }
    public static boolean a(long p0){
       long l = SystemClock.elapsedRealtime();
       if (p0 - -1 && (l - p0 <= 0 || l - (p0 + 2000) >= 0)) {
          return true;
       }
       return false;
    }
    public static b b(e p0){
       return p0.j;
    }
    public static void b(e p0,String p1){
       p0.e(p1);
    }
    public static e$a c(e p0,String p1){
       return p0.d(p1);
    }
    public static void c(e p0){
       p0.m();
    }
    public static void d(e p0){
       p0.j.b("APP_TAGS");
    }
    public final e$a a(b p0,IPushActionListener p1){
       e$a uoa = new e$a(p0, p1);
       String str = this.a(uoa);
       p0.b(str);
       uoa.a(new h(this, p0, str));
       return uoa;
    }
    public synchronized final String a(e$a p0){
       this.m.put(this.n, p0);
       e tn = this.n;
       this.n = tn + 1;
       return Integer.toString(tn);
    }
    public synchronized final void a(Context p0){
       if (this.h == null) {
          this.h = ContextDelegate.getContext(p0);
          this.q = t.c(p0, p0.getPackageName());
          w.b().a(this.h);
          this.a(new g());
          b uob = new b();
          this.j = uob;
          uob.a(this.h, "com.vivo.push_preferences.appconfig_v1");
          this.k = this.f();
          this.l = this.j.b("APP_ALIAS", null);
       }
       return;
    }
    public final void a(Intent p0,PushMessageCallback p1){
       o oo = this.r.createReceiverCommand(p0);
       e h = e.a().h;
       String str = "PushClientManager";
       if (oo == null) {
          p.a(str, "sendCommand, null command!");
          if (h != null) {
             p.c(h, "[执行指令失败]指令空！");
          }
          return;
       }else {
          z oz = this.r.createReceiveTask(oo);
          if (oz == null) {
             p.a(str, ("sendCommand, null command task! pushCommand = ").concat(String.valueOf(oo)));
             if (h != null) {
                p.c(h, "[执行指令失败]指令"+oo+"任务空！");
             }
             return;
          }else if(h != null && !oo instanceof n){
             p.a(h, ("[接收指令]").concat(String.valueOf(oo)));
          }
          oz.a(p1);
          m.a(oz);
          return;
       }
    }
    public final void a(IPushActionListener p0){
       int i = 102;
       if (this.h == null) {
          if (p0 != null) {
             p0.onStateChanged(i);
          }
          return;
       }else {
          String str = this.f();
          this.k = str;
          if (!TextUtils.isEmpty(str)) {
             if (p0 != null) {
                p0.onStateChanged(0);
             }
             return;
          }else if(!e.a(this.b)){
             if (p0 != null) {
                p0.onStateChanged(1002);
             }
             return;
          }else {
             this.b = SystemClock.elapsedRealtime();
             str = this.h.getPackageName();
             e$a uoa = null;
             if (this.h == null) {
                if (p0 != null) {
                   p0.onStateChanged(i);
                }
             }else {
                b uob = new b(true, str);
                uob.g();
                uob.d();
                uob.e();
                uob.a(100);
                if (this.q != null) {
                   if (!this.n()) {
                      if (p0 != null) {
                         p0.onStateChanged(101);
                      }
                   }else {
                      uoa = this.a(uob, p0);
                   }
                }else if(uob.a(this.h) == 2){
                   uoa = this.a(uob, p0);
                }else {
                   this.a(uob);
                   if (p0 != null) {
                      p0.onStateChanged(0);
                   }
                }
             }
             if (uoa == null) {
                return;
             }else {
                uoa.a(new g(this, uoa));
                uoa.a();
                return;
             }
          }
       }
    }
    public final void a(o p0){
       e h = e.a().h;
       String str = "PushClientManager";
       if (p0 == null) {
          p.a(str, "sendCommand, null command!");
          if (h != null) {
             p.c(h, "[执行指令失败]指令空！");
          }
          return;
       }else {
          l ol = this.r.createTask(p0);
          if (ol == null) {
             p.a(str, ("sendCommand, null command task! pushCommand = ").concat(String.valueOf(p0)));
             if (h != null) {
                p.c(h, "[执行指令失败]指令"+p0+"任务空！");
             }
             return;
          }else {
             p.d(str, ("client--sendCommand, command = ").concat(String.valueOf(p0)));
             m.a(ol);
             return;
          }
       }
    }
    public final void a(String p0){
       this.k = p0;
       this.j.a("APP_TOKEN", p0);
    }
    public final void a(String p0,int p1){
       e$a uoa = this.d(p0);
       if (uoa != null) {
          Object[] objArray = new Object[0];
          uoa.a(p1, objArray);
          return;
       }else {
          p.d("PushClientManager", "notifyStatusChanged token is null");
          return;
       }
    }
    public final void a(String p0,int p1,Object[] p2){
       e$a uoa = this.d(p0);
       if (uoa != null) {
          uoa.a(p1, p2);
          return;
       }else {
          p.d("PushClientManager", "notifyApp token is null");
          return;
       }
    }
    public final void a(String p0,IPushActionListener p1){
       if (this.h == null) {
          if (p1 != null) {
             p1.onStateChanged(102);
          }
          return;
       }else if(!TextUtils.isEmpty(this.l) && (this.l).equals(p0)){
          if (p1 != null) {
             p1.onStateChanged(0);
          }
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(p0);
          a uoa = new a(true, this.h.getPackageName(), uArrayList);
          uoa.a(100);
          if (this.q != null) {
             if (!this.n()) {
                if (p1 != null) {
                   p1.onStateChanged(101);
                }
                return;
             }else if(!e.a(this.d)){
                if (p1 != null) {
                   p1.onStateChanged(1002);
                }
                return;
             }else {
                this.d = SystemClock.elapsedRealtime();
                String str = this.a(new e$a(uoa, p1));
                uoa.b(str);
                if (TextUtils.isEmpty(this.k)) {
                   this.a(str, 0x7531);
                   return;
                }else if(TextUtils.isEmpty(p0)){
                   this.a(str, 0x7532);
                   return;
                }else if((long)p0.length() - 70 > 0){
                   this.a(str, 0x7533);
                   return;
                }else {
                   this.a(uoa);
                   this.e(str);
                   return;
                }
             }
          }else {
             this.a(uoa);
             if (p1 != null) {
                p1.onStateChanged(0);
             }
             return;
          }
       }
    }
    public final void a(ArrayList p0,IPushActionListener p1){
       e th = this.h;
       if (th == null) {
          if (p1 != null) {
             p1.onStateChanged(102);
          }
          return;
       }else {
          z oz = new z(true, th.getPackageName(), p0);
          int i = 500;
          oz.a(i);
          if (this.q != null) {
             if (!this.n()) {
                if (p1 != null) {
                   p1.onStateChanged(101);
                }
                return;
             }else if(!e.a(this.f)){
                if (p1 != null) {
                   p1.onStateChanged(1002);
                }
                return;
             }else {
                this.f = SystemClock.elapsedRealtime();
                String str = this.a(new e$a(oz, p1));
                oz.b(str);
                if (TextUtils.isEmpty(this.k)) {
                   this.a(str, 0x4e21);
                   return;
                }else if(p0.size() < 0){
                   this.a(str, 0x4e22);
                   return;
                }else if((p0.size() + this.c().size()) > i){
                   this.a(str, 0x4e24);
                   return;
                }else {
                   Iterator iterator = p0.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if ((long)(iterator.next()).length() - 70 > 0) {
                            break ;
                         }
                      }else {
                         this.a(oz);
                         this.e(str);
                         return;
                      }
                   }
                   this.a(str, 0x4e23);
                   return;
                }
             }
          }else {
             this.a(oz);
             if (p1 != null) {
                p1.onStateChanged(0);
             }
             return;
          }
       }
    }
    public final void a(List p0){
       String str = "APP_TAGS";
       try{
          if (p0.size() <= 0) {
             return;
          }
          String str1 = this.j.b(str, null);
          JSONObject jSONObject = (TextUtils.isEmpty(str1))? new JSONObject(): new JSONObject(str1);
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             jSONObject.put(iterator.next(), System.currentTimeMillis());
          }
          String str2 = jSONObject.toString();
          if (TextUtils.isEmpty(str2)) {
             this.j.b(str);
             return;
          }else {
             this.j.a(str, str2);
             return;
          }
       }catch(org.json.JSONException e6){
          e6.printStackTrace();
          this.j.b(str);
          return;
       }
    }
    public final void a(boolean p0){
       this.i = p0;
    }
    public final void b(){
       e th = this.h;
       if (th != null) {
          z.b(th);
       }
       return;
    }
    public final void b(IPushActionListener p0){
       int i = 102;
       if (this.h == null) {
          if (p0 != null) {
             p0.onStateChanged(i);
          }
          return;
       }else if(("").equals(this.k)){
          p0.onStateChanged(0);
          return;
       }else if(!e.a(this.c)){
          if (p0 != null) {
             p0.onStateChanged(1002);
          }
          return;
       }else {
          this.c = SystemClock.elapsedRealtime();
          String packageName = this.h.getPackageName();
          e$a uoa = null;
          if (this.h == null) {
             if (p0 != null) {
                p0.onStateChanged(i);
             }
          }else {
             b uob = new b(0, packageName);
             uob.d();
             uob.e();
             uob.g();
             uob.a(100);
             if (this.q != null) {
                if (!this.n()) {
                   if (p0 != null) {
                      p0.onStateChanged(101);
                   }
                }else {
                   uoa = new e$a(uob, p0);
                   String str = this.a(uoa);
                   uob.b(str);
                   uoa.a(new j(this, uob, str));
                }
             }else if(uob.a(this.h) == 2){
                uoa = this.a(uob, p0);
             }else {
                this.a(uob);
                if (p0 != null) {
                   p0.onStateChanged(0);
                }
             }
          }
          if (uoa == null) {
             return;
          }else {
             uoa.a(new i(this));
             uoa.a();
             return;
          }
       }
    }
    public final void b(String p0){
       this.l = p0;
       this.j.a("APP_ALIAS", p0);
    }
    public final void b(String p0,IPushActionListener p1){
       if (this.h == null) {
          if (p1 != null) {
             p1.onStateChanged(102);
          }
          return;
       }else if(TextUtils.isEmpty(this.l)){
          if (p1 != null) {
             p1.onStateChanged(0);
          }
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(p0);
          a uoa = new a(0, this.h.getPackageName(), uArrayList);
          uoa.a(100);
          if (this.q != null) {
             if (!this.n()) {
                if (p1 != null) {
                   p1.onStateChanged(101);
                }
                return;
             }else if(!e.a(this.e)){
                if (p1 != null) {
                   p1.onStateChanged(1002);
                }
                return;
             }else {
                this.e = SystemClock.elapsedRealtime();
                String str = this.a(new e$a(uoa, p1));
                uoa.b(str);
                if (TextUtils.isEmpty(this.k)) {
                   this.a(str, 0x7531);
                   return;
                }else if(TextUtils.isEmpty(p0)){
                   this.a(str, 0x7532);
                   return;
                }else if((long)p0.length() - 70 > 0){
                   this.a(str, 0x7533);
                   return;
                }else {
                   this.a(uoa);
                   this.e(str);
                   return;
                }
             }
          }else {
             this.a(uoa);
             if (p1 != null) {
                p1.onStateChanged(0);
             }
             return;
          }
       }
    }
    public final void b(ArrayList p0,IPushActionListener p1){
       e th = this.h;
       if (th == null) {
          if (p1 != null) {
             p1.onStateChanged(102);
          }
          return;
       }else {
          boolean b = false;
          z oz = new z(b, th.getPackageName(), p0);
          int i = 500;
          oz.a(i);
          if (this.q != null) {
             if (!this.n()) {
                if (p1 != null) {
                   p1.onStateChanged(101);
                }
                return;
             }else if(!e.a(this.g)){
                if (p1 != null) {
                   p1.onStateChanged(1002);
                }
                return;
             }else {
                this.g = SystemClock.elapsedRealtime();
                String str = this.a(new e$a(oz, p1));
                oz.b(str);
                if (TextUtils.isEmpty(this.k)) {
                   this.a(str, 0x4e21);
                   return;
                }else if(p0.size() < 0){
                   this.a(str, 0x4e22);
                   return;
                }else if(p0.size() > i){
                   this.a(str, 0x4e24);
                   return;
                }else {
                   Iterator iterator = p0.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if ((long)(iterator.next()).length() - 70 > 0) {
                            break ;
                         }
                      }else {
                         this.a(oz);
                         this.e(str);
                         return;
                      }
                   }
                   this.a(str, 0x4e23);
                   return;
                }
             }
          }else {
             this.a(oz);
             if (p1 != null) {
                p1.onStateChanged(b);
             }
             return;
          }
       }
    }
    public final void b(List p0){
       String str = "APP_TAGS";
       try{
          if (p0.size() <= 0) {
             return;
          }
          String str1 = this.j.b(str, null);
          JSONObject jSONObject = (TextUtils.isEmpty(str1))? new JSONObject(): new JSONObject(str1);
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             jSONObject.remove(iterator.next());
          }
          String str2 = jSONObject.toString();
          if (TextUtils.isEmpty(str2)) {
             this.j.b(str);
             return;
          }else {
             this.j.a(str, str2);
             return;
          }
       }catch(org.json.JSONException e4){
          e4.printStackTrace();
          this.j.b(str);
          return;
       }
    }
    public final List c(){
       ArrayList uArrayList;
       String str = "APP_TAGS";
       String str1 = this.j.b(str, null);
       try{
          uArrayList = new ArrayList();
          if (TextUtils.isEmpty(str1)) {
             return uArrayList;
          }else {
             Iterator iterator = new JSONObject(str1).keys();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next());
             }
          }
       }catch(org.json.JSONException e0){
          this.j.b(str);
          uArrayList.clear();
          p.d("PushClientManager", "getTags error");
       }
       return uArrayList;
    }
    public final void c(String p0){
       m.c(new f(this, p0));
    }
    public final void c(List p0){
       if (p0.contains(this.l)) {
          this.m();
       }
       return;
    }
    public synchronized final e$a d(String p0){
       if (p0 == null) {
          return null;
       }
       try{
          int i = Integer.parseInt(p0);
          this.m.delete(i);
          return this.m.get(i);
       }catch(java.lang.Exception e0){
       }
    }
    public final boolean d(){
       if (this.h == null) {
          p.d("PushClientManager", "support:context is null");
          return false;
       }else {
          Boolean uBoolean = Boolean.valueOf(this.n());
          this.o = uBoolean;
          return uBoolean.booleanValue();
       }
    }
    public final void e(String p0){
       m.a(new k(this, p0));
    }
    public final boolean e(){
       return this.q;
    }
    public final String f(){
       if (!TextUtils.isEmpty(this.k)) {
          return this.k;
       }
       e tj = this.j;
       String str = (tj != null)? tj.b("APP_TOKEN", null): "";
       this.c(str);
       return str;
    }
    public final boolean g(){
       return this.i;
    }
    public final Context h(){
       return this.h;
    }
    public final void i(){
       this.j.a();
    }
    public final String j(){
       return this.l;
    }
    public final int k(){
       return this.s;
    }
    public final long l(){
       e th = this.h;
       if (th == null) {
          return -1;
       }
       if (this.p == null) {
          this.p = Long.valueOf(z.a(th));
       }
       return this.p.longValue();
    }
    public final void m(){
       this.l = null;
       this.j.b("APP_ALIAS");
    }
    public final boolean n(){
       if (this.o == null) {
          boolean b = (this.l() - 1230 >= 0 && z.d(this.h))? true: false;
          this.o = Boolean.valueOf(b);
       }
       return this.o.booleanValue();
    }
}
