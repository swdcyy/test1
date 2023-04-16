package com.meizu.cloud.pushsdk.c.c.k$a;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.c.c$a;
import com.meizu.cloud.pushsdk.c.c.i;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.c.l;
import com.meizu.cloud.pushsdk.c.c.k;
import com.meizu.cloud.pushsdk.c.c.c;
import com.meizu.cloud.pushsdk.c.c.k$1;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class k$a	// class@0014de
{
    public i a;
    public int b;
    public String c;
    public c$a d;
    public l e;
    public k f;
    public k g;
    public k h;

    public void k$a(){
       super();
       this.b = -1;
       this.d = new c$a();
    }
    public static i a(k$a p0){
       return p0.a;
    }
    public static int b(k$a p0){
       return p0.b;
    }
    public static String c(k$a p0){
       return p0.c;
    }
    public static c$a d(k$a p0){
       return p0.d;
    }
    public static l e(k$a p0){
       return p0.e;
    }
    public static k f(k$a p0){
       return p0.f;
    }
    public static k g(k$a p0){
       return p0.g;
    }
    public static k h(k$a p0){
       return p0.h;
    }
    public k$a a(int p0){
       this.b = p0;
       return this;
    }
    public k$a a(c p0){
       this.d = p0.c();
       return this;
    }
    public k$a a(i p0){
       this.a = p0;
       return this;
    }
    public k$a a(l p0){
       this.e = p0;
       return this;
    }
    public k$a a(String p0){
       this.c = p0;
       return this;
    }
    public k a(){
       if (this.a == null) {
          throw new IllegalStateException("request == null");
       }
       if (this.b >= null) {
          return new k(this, null);
       }
       throw new IllegalStateException("code < 0: "+this.b);
    }
}
