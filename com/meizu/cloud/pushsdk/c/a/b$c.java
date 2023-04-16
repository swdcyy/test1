package com.meizu.cloud.pushsdk.c.a.b$c;
import java.lang.String;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.a.d;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.io.File;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.meizu.cloud.pushsdk.c.a.b;

public class b$c	// class@0014bd
{
    public d a;
    public final String b;
    public Object c;
    public final HashMap d;
    public final HashMap e;
    public final HashMap f;
    public final HashMap g;
    public final HashMap h;
    public int i;
    public Executor j;
    public String k;
    public String l;

    public void b$c(String p0){
       super();
       this.a = d.b;
       this.d = new HashMap();
       this.e = new HashMap();
       this.f = new HashMap();
       this.g = new HashMap();
       this.h = new HashMap();
       this.i = 0;
       this.b = p0;
    }
    public static d a(b$c p0){
       return p0.a;
    }
    public static String b(b$c p0){
       return p0.b;
    }
    public static Object c(b$c p0){
       return p0.c;
    }
    public static HashMap d(b$c p0){
       return p0.d;
    }
    public static HashMap e(b$c p0){
       return p0.f;
    }
    public static HashMap f(b$c p0){
       return p0.g;
    }
    public static HashMap g(b$c p0){
       return p0.e;
    }
    public static HashMap h(b$c p0){
       return p0.h;
    }
    public static int i(b$c p0){
       return p0.i;
    }
    public static Executor j(b$c p0){
       return p0.j;
    }
    public static String k(b$c p0){
       return p0.k;
    }
    public static String l(b$c p0){
       return p0.l;
    }
    public b$c a(String p0,File p1){
       this.h.put(p0, p1);
       return this;
    }
    public b$c a(HashMap p0){
       if (p0 != null) {
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Object key = uEntry.getKey();
             this.e.put(key, uEntry.getValue());
          }
       }
       return this;
    }
    public b a(){
       return new b(this);
    }
}
