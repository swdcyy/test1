package com.meizu.cloud.pushsdk.c.a.b;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.c.g;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.a.b$a;
import java.util.HashMap;
import com.meizu.cloud.pushsdk.c.a.d;
import java.util.concurrent.Executor;
import com.meizu.cloud.pushsdk.c.a.b$b;
import android.graphics.Bitmap$Config;
import android.widget.ImageView$ScaleType;
import com.meizu.cloud.pushsdk.c.a.b$c;
import com.meizu.cloud.pushsdk.c.a.b$d;
import org.json.JSONObject;
import org.json.JSONArray;
import java.io.File;
import com.meizu.cloud.pushsdk.c.d.a;
import com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.c.a.e;
import com.meizu.cloud.pushsdk.c.e.c;
import com.meizu.cloud.pushsdk.c.c.k;
import com.meizu.cloud.pushsdk.c.a.b$2;
import java.lang.Enum;
import com.meizu.cloud.pushsdk.c.h.b;
import com.meizu.cloud.pushsdk.c.b.a;
import java.lang.Throwable;
import com.meizu.cloud.pushsdk.c.c.l;
import com.meizu.cloud.pushsdk.c.g.d;
import com.meizu.cloud.pushsdk.c.g.m;
import com.meizu.cloud.pushsdk.c.g.g;
import java.lang.Exception;
import com.meizu.cloud.pushsdk.c.c.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.meizu.cloud.pushsdk.c.c.f;
import com.meizu.cloud.pushsdk.c.c.f$a;
import com.meizu.cloud.pushsdk.c.a.b$1;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.c.b$a;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.c.c.b;
import com.meizu.cloud.pushsdk.c.c.h$a;
import com.meizu.cloud.pushsdk.c.c.h;
import com.meizu.cloud.pushsdk.c.c.c;
import com.meizu.cloud.pushsdk.c.c.c$a;

public class b	// class@0014bf
{
    public a A;
    public int B;
    public boolean C;
    public int D;
    public a E;
    public Bitmap$Config F;
    public int G;
    public int H;
    public ImageView$ScaleType I;
    public final Executor J;
    public String K;
    public Type L;
    public final int b;
    public final d c;
    public final int d;
    public final String e;
    public int f;
    public final Object g;
    public e h;
    public final HashMap i;
    public HashMap j;
    public HashMap k;
    public HashMap l;
    public final HashMap m;
    public final HashMap n;
    public HashMap o;
    public String p;
    public String q;
    public JSONObject r;
    public JSONArray s;
    public String t;
    public byte[] u;
    public File v;
    public g y;
    public static final String a = "b";
    public static final g w;
    public static final g x;
    public static final Object z;

    static {
       b.w = g.a("application/json; charset=utf-8");
       b.x = g.a("text/x-markdown; charset=utf-8");
       b.z = new Object();
    }
    public void b(b$a p0){
       super();
       this.j = new HashMap();
       this.k = new HashMap();
       this.l = new HashMap();
       this.o = new HashMap();
       this.r = null;
       this.s = null;
       this.t = null;
       this.u = null;
       this.v = null;
       this.y = null;
       this.D = 0;
       this.L = null;
       this.d = 1;
       this.b = 0;
       this.c = b$a.a(p0);
       this.e = b$a.b(p0);
       this.g = b$a.c(p0);
       this.p = b$a.d(p0);
       this.q = b$a.e(p0);
       this.i = b$a.f(p0);
       this.m = b$a.g(p0);
       this.n = b$a.h(p0);
       this.D = b$a.i(p0);
       this.J = b$a.j(p0);
       this.K = b$a.k(p0);
    }
    public void b(b$b p0){
       super();
       this.j = new HashMap();
       this.k = new HashMap();
       this.l = new HashMap();
       this.o = new HashMap();
       this.r = null;
       this.s = null;
       this.t = null;
       this.u = null;
       this.v = null;
       this.y = null;
       this.D = 0;
       this.L = null;
       this.d = 0;
       this.b = b$b.a(p0);
       this.c = b$b.b(p0);
       this.e = b$b.c(p0);
       this.g = b$b.d(p0);
       this.i = b$b.e(p0);
       this.F = b$b.f(p0);
       this.H = b$b.g(p0);
       this.G = b$b.h(p0);
       this.I = b$b.i(p0);
       this.m = b$b.j(p0);
       this.n = b$b.k(p0);
       this.J = b$b.l(p0);
       this.K = b$b.m(p0);
    }
    public void b(b$c p0){
       super();
       this.j = new HashMap();
       this.k = new HashMap();
       this.l = new HashMap();
       this.o = new HashMap();
       this.r = null;
       this.s = null;
       this.t = null;
       this.u = null;
       this.v = null;
       this.y = null;
       this.D = 0;
       this.L = null;
       this.d = 2;
       this.b = 1;
       this.c = b$c.a(p0);
       this.e = b$c.b(p0);
       this.g = b$c.c(p0);
       this.i = b$c.d(p0);
       this.m = b$c.e(p0);
       this.n = b$c.f(p0);
       this.l = b$c.g(p0);
       this.o = b$c.h(p0);
       this.D = b$c.i(p0);
       this.J = b$c.j(p0);
       this.K = b$c.k(p0);
       if (b$c.l(p0) != null) {
          this.y = g.a(b$c.l(p0));
       }
       return;
    }
    public void b(b$d p0){
       super();
       this.j = new HashMap();
       this.k = new HashMap();
       this.l = new HashMap();
       this.o = new HashMap();
       this.r = null;
       this.s = null;
       this.t = null;
       this.u = null;
       this.v = null;
       this.y = null;
       this.D = 0;
       this.L = null;
       this.d = 0;
       this.b = b$d.a(p0);
       this.c = b$d.b(p0);
       this.e = b$d.c(p0);
       this.g = b$d.d(p0);
       this.i = b$d.e(p0);
       this.j = b$d.f(p0);
       this.k = b$d.g(p0);
       this.m = b$d.h(p0);
       this.n = b$d.i(p0);
       this.r = b$d.j(p0);
       this.s = b$d.k(p0);
       this.t = b$d.l(p0);
       this.v = b$d.m(p0);
       this.u = b$d.n(p0);
       this.J = b$d.o(p0);
       this.K = b$d.p(p0);
       if (b$d.q(p0) != null) {
          this.y = g.a(b$d.q(p0));
       }
       return;
    }
    public static int a(b p0,int p1){
       p0.B = p1;
       return p1;
    }
    public static boolean a(b p0){
       return p0.C;
    }
    public static a b(b p0){
       return p0.E;
    }
    public c a(){
       this.h = e.a;
       return c.a(this);
    }
    public c a(k p0){
       int i = b$2.a[this.h.ordinal()];
       if (i == 1) {
          return c.a(new JSONArray(g.a(p0.b().a()).h()));
       }
       if (i == 2) {
          return c.a(new JSONObject(g.a(p0.b().a()).h()));
       }
       if (i == 3) {
          return c.a(g.a(p0.b().a()).h());
       }
       if (i != 4) {
          if (i != 5) {
             return null;
          }
          return c.a("prefetch");
       }else {
          Object z = b.z;
          _monitor_enter(z);
          try{
             _monitor_exit(z);
             return b.a(p0, this.G, this.H, this.F, this.I);
          }catch(java.lang.Exception e6){
             _monitor_exit(z);
             return c.a(b.b(new a(e6)));
          }
       }
    }
    public a a(a p0){
       try{
          if (p0.a() != null && (p0.a().b() != null && p0.a().b().a() != null)) {
             p0.b(g.a(p0.a().b().a()).h());
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return p0;
    }
    public void a(a p0){
       this.A = p0;
    }
    public void a(String p0){
       this.K = p0;
    }
    public c b(){
       this.h = e.e;
       return c.a(this);
    }
    public c c(){
       return c.a(this);
    }
    public int d(){
       return this.b;
    }
    public String e(){
       Map$Entry uEntry;
       b te = this.e;
       Iterator iterator = this.n.entrySet().iterator();
       while (iterator.hasNext()) {
          uEntry = iterator.next();
          te = te.replace("{"+uEntry.getKey()+"}", String.valueOf(uEntry.getValue()));
       }
       f$a uoa = f.c(te).f();
       iterator = this.m.entrySet().iterator();
       while (iterator.hasNext()) {
          uEntry = iterator.next();
          String key = uEntry.getKey();
          uoa.a(key, uEntry.getValue());
       }
       return uoa.b().toString();
    }
    public boolean equals(Object p0){
       return super.equals(p0);
    }
    public e f(){
       return this.h;
    }
    public int g(){
       return this.d;
    }
    public String h(){
       return this.K;
    }
    public int hashCode(){
       return super.hashCode();
    }
    public a i(){
       return new b$1(this);
    }
    public String j(){
       return this.p;
    }
    public String k(){
       return this.q;
    }
    public a l(){
       return this.A;
    }
    public j m(){
       b ty;
       b$a uoa;
       Map$Entry uEntry;
       b tr = this.r;
       if (tr != null) {
          ty = this.y;
          if (ty != null) {
             return j.a(ty, tr.toString());
          }
          return j.a(b.w, tr.toString());
       }else {
          tr = this.s;
          if (tr != null) {
             ty = this.y;
             if (ty != null) {
                return j.a(ty, tr.toString());
             }
             return j.a(b.w, tr.toString());
          }else {
             tr = this.t;
             if (tr != null) {
                ty = this.y;
                if (ty != null) {
                   return j.a(ty, tr);
                }
                return j.a(b.x, tr);
             }else {
                tr = this.v;
                if (tr != null) {
                   ty = this.y;
                   if (ty != null) {
                      return j.a(ty, tr);
                   }
                   return j.a(b.x, tr);
                }else {
                   tr = this.u;
                   if (tr != null) {
                      ty = this.y;
                      if (ty != null) {
                         return j.a(ty, tr);
                      }
                      return j.a(b.x, tr);
                   }else {
                      try{
                         uoa = new b$a();
                         Iterator iterator = this.j.entrySet().iterator();
                         while (iterator.hasNext()) {
                            uEntry = iterator.next();
                            if (!TextUtils.isEmpty(uEntry.getKey()) && !TextUtils.isEmpty(uEntry.getValue())) {
                               uoa.a(uEntry.getKey(), uEntry.getValue());
                            }
                         }
                         iterator = this.k.entrySet().iterator();
                         while (iterator.hasNext()) {
                            uEntry = iterator.next();
                            if (!TextUtils.isEmpty(uEntry.getKey()) && !TextUtils.isEmpty(uEntry.getValue())) {
                               uoa.b(uEntry.getKey(), uEntry.getValue());
                            }
                         }
                      }catch(java.lang.Exception e1){
                         e1.printStackTrace();
                      }
                      return uoa.a();
                   }
                }
             }
          }
       }
    }
    public j n(){
       Map$Entry uEntry;
       String name;
       h$a uoa = new h$a().a(h.e);
       try{
          Iterator iterator = this.l.entrySet().iterator();
          String str = "\"";
          String str1 = "form-data; name=\"";
          String str2 = "Content-Disposition";
          int i = 2;
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             String[] stringArray = new String[i];
             stringArray[0] = str2;
             stringArray[1] = str1+uEntry.getKey()+str;
             uoa.a(c.a(stringArray), j.a(null, uEntry.getValue()));
          }
          iterator = this.o.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             if (uEntry.getValue() == null) {
                continue ;
             }else {
                name = uEntry.getValue().getName();
                String[] stringArray1 = new String[i];
                stringArray1[0] = str2;
                stringArray1[1] = str1+uEntry.getKey()+"\"; filename=\""+name+str;
                uoa.a(c.a(stringArray1), j.a(g.a(b.a(name)), uEntry.getValue()));
                b ty = this.y;
                if (ty != null) {
                   uoa.a(ty);
                }
             }
          }
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return uoa.a();
    }
    public c o(){
       c$a uoa;
       try{
          uoa = new c$a();
          Iterator iterator = this.i.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             uoa.a(key, uEntry.getValue());
          }
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return uoa.a();
    }
    public String toString(){
       return "ANRequest{sequenceNumber=\'"+this.f+", mMethod="+this.b+", mPriority="+this.c+", mRequestType="+this.d+", mUrl="+this.e+'}';
    }
}
