package com.meizu.cloud.pushsdk.c.a.b$a;
import java.lang.String;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.a.d;
import java.util.HashMap;
import java.util.concurrent.Executor;
import com.meizu.cloud.pushsdk.c.a.b;

public class b$a	// class@0014bb
{
    public d a;
    public final String b;
    public Object c;
    public final HashMap d;
    public final HashMap e;
    public final HashMap f;
    public final String g;
    public final String h;
    public int i;
    public Executor j;
    public String k;

    public void b$a(String p0,String p1,String p2){
       super();
       this.a = d.b;
       this.d = new HashMap();
       this.e = new HashMap();
       this.f = new HashMap();
       this.i = 0;
       this.b = p0;
       this.g = p1;
       this.h = p2;
    }
    public static d a(b$a p0){
       return p0.a;
    }
    public static String b(b$a p0){
       return p0.b;
    }
    public static Object c(b$a p0){
       return p0.c;
    }
    public static String d(b$a p0){
       return p0.g;
    }
    public static String e(b$a p0){
       return p0.h;
    }
    public static HashMap f(b$a p0){
       return p0.d;
    }
    public static HashMap g(b$a p0){
       return p0.e;
    }
    public static HashMap h(b$a p0){
       return p0.f;
    }
    public static int i(b$a p0){
       return p0.i;
    }
    public static Executor j(b$a p0){
       return p0.j;
    }
    public static String k(b$a p0){
       return p0.k;
    }
    public b a(){
       return new b(this);
    }
}
