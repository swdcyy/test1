package com.meizu.cloud.pushsdk.c.a.b$d;
import java.lang.String;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.a.d;
import java.util.HashMap;
import org.json.JSONObject;
import org.json.JSONArray;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.meizu.cloud.pushsdk.c.a.b;

public class b$d	// class@0014be
{
    public d a;
    public final int b;
    public final String c;
    public Object d;
    public JSONObject e;
    public JSONArray f;
    public String g;
    public byte[] h;
    public File i;
    public final HashMap j;
    public final HashMap k;
    public final HashMap l;
    public final HashMap m;
    public final HashMap n;
    public Executor o;
    public String p;
    public String q;

    public void b$d(String p0){
       super();
       this.a = d.b;
       this.e = null;
       this.f = null;
       this.g = null;
       this.h = null;
       this.i = null;
       this.j = new HashMap();
       this.k = new HashMap();
       this.l = new HashMap();
       this.m = new HashMap();
       this.n = new HashMap();
       this.c = p0;
       this.b = 1;
    }
    public static int a(b$d p0){
       return p0.b;
    }
    public static d b(b$d p0){
       return p0.a;
    }
    public static String c(b$d p0){
       return p0.c;
    }
    public static Object d(b$d p0){
       return p0.d;
    }
    public static HashMap e(b$d p0){
       return p0.j;
    }
    public static HashMap f(b$d p0){
       return p0.k;
    }
    public static HashMap g(b$d p0){
       return p0.l;
    }
    public static HashMap h(b$d p0){
       return p0.m;
    }
    public static HashMap i(b$d p0){
       return p0.n;
    }
    public static JSONObject j(b$d p0){
       return p0.e;
    }
    public static JSONArray k(b$d p0){
       return p0.f;
    }
    public static String l(b$d p0){
       return p0.g;
    }
    public static File m(b$d p0){
       return p0.i;
    }
    public static byte[] n(b$d p0){
       return p0.h;
    }
    public static Executor o(b$d p0){
       return p0.o;
    }
    public static String p(b$d p0){
       return p0.p;
    }
    public static String q(b$d p0){
       return p0.q;
    }
    public b$d a(HashMap p0){
       if (p0 != null) {
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Object key = uEntry.getKey();
             this.k.put(key, uEntry.getValue());
          }
       }
       return this;
    }
    public b a(){
       return new b(this);
    }
}
