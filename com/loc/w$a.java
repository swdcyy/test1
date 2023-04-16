package com.loc.w$a;
import java.lang.String;
import java.lang.Object;
import com.loc.w;
import com.loc.k;

public final class w$a	// class@00146f
{
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public String[] g;

    public void w$a(String p0,String p1,String p2){
       super();
       this.e = true;
       this.f = "standard";
       this.g = null;
       this.a = p1;
       this.b = p1;
       this.d = p2;
       this.c = p0;
    }
    public static String a(w$a p0){
       return p0.a;
    }
    public static String b(w$a p0){
       return p0.b;
    }
    public static String c(w$a p0){
       return p0.c;
    }
    public static String d(w$a p0){
       return p0.d;
    }
    public static boolean e(w$a p0){
       return p0.e;
    }
    public static String f(w$a p0){
       return p0.f;
    }
    public static String[] g(w$a p0){
       return p0.g;
    }
    public final w$a a(String p0){
       this.b = p0;
       return this;
    }
    public final w$a a(String[] p0){
       if (p0 != null) {
          this.g = p0.clone();
       }
       return this;
    }
    public final w a(){
       if (this.g != null) {
          return new w(this, 0);
       }
       throw new k("sdk packages is null");
    }
}
