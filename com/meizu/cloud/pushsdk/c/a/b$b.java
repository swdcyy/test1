package com.meizu.cloud.pushsdk.c.a.b$b;
import java.lang.String;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.a.d;
import java.util.HashMap;
import android.graphics.Bitmap$Config;
import android.widget.ImageView$ScaleType;
import java.util.concurrent.Executor;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.meizu.cloud.pushsdk.c.a.b;

public class b$b	// class@0014bc
{
    public d a;
    public final int b;
    public final String c;
    public Object d;
    public Bitmap$Config e;
    public int f;
    public int g;
    public ImageView$ScaleType h;
    public final HashMap i;
    public final HashMap j;
    public final HashMap k;
    public Executor l;
    public String m;

    public void b$b(String p0){
       super();
       this.a = d.b;
       this.i = new HashMap();
       this.j = new HashMap();
       this.k = new HashMap();
       this.c = p0;
       this.b = 0;
    }
    public static int a(b$b p0){
       return p0.b;
    }
    public static d b(b$b p0){
       return p0.a;
    }
    public static String c(b$b p0){
       return p0.c;
    }
    public static Object d(b$b p0){
       return p0.d;
    }
    public static HashMap e(b$b p0){
       return p0.i;
    }
    public static Bitmap$Config f(b$b p0){
       return p0.e;
    }
    public static int g(b$b p0){
       return p0.g;
    }
    public static int h(b$b p0){
       return p0.f;
    }
    public static ImageView$ScaleType i(b$b p0){
       return p0.h;
    }
    public static HashMap j(b$b p0){
       return p0.j;
    }
    public static HashMap k(b$b p0){
       return p0.k;
    }
    public static Executor l(b$b p0){
       return p0.l;
    }
    public static String m(b$b p0){
       return p0.m;
    }
    public b$b a(HashMap p0){
       if (p0 != null) {
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Object key = uEntry.getKey();
             this.j.put(key, uEntry.getValue());
          }
       }
       return this;
    }
    public b a(){
       return new b(this);
    }
}
