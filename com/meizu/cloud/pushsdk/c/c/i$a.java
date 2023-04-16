package com.meizu.cloud.pushsdk.c.c.i$a;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.c.c$a;
import com.meizu.cloud.pushsdk.c.c.f;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.c.c;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.meizu.cloud.pushsdk.c.c.d;
import com.meizu.cloud.pushsdk.c.c.i;
import com.meizu.cloud.pushsdk.c.c.i$1;
import java.lang.IllegalStateException;

public class i$a	// class@0014d8
{
    public f a;
    public String b;
    public c$a c;
    public j d;
    public Object e;

    public void i$a(){
       super();
       this.b = "GET";
       this.c = new c$a();
    }
    public static f a(i$a p0){
       return p0.a;
    }
    public static String b(i$a p0){
       return p0.b;
    }
    public static c$a c(i$a p0){
       return p0.c;
    }
    public static j d(i$a p0){
       return p0.d;
    }
    public static Object e(i$a p0){
       return p0.e;
    }
    public i$a a(){
       return this.a("GET", null);
    }
    public i$a a(c p0){
       this.c = p0.c();
       return this;
    }
    public i$a a(f p0){
       if (p0 == null) {
          throw new IllegalArgumentException("url == null");
       }
       this.a = p0;
       return this;
    }
    public i$a a(j p0){
       return this.a("POST", p0);
    }
    public i$a a(String p0){
       StringBuilder str;
       int i;
       if (p0 == null) {
          throw new IllegalArgumentException("url == null");
       }
       if ((p0).regionMatches(true, 0, "ws:", 0, 3)) {
          str = "http:";
          i = 3;
       }else if((p0).regionMatches(true, 0, "wss:", 0, 4)){
          str = "https:";
          i = 4;
       }else {
       label_003f :
          f uof = f.c(p0);
          if (uof != null) {
             return this.a(uof);
          }else {
             throw new IllegalArgumentException("unexpected url: "+p0);
          }
       }
       p0 = str+p0.substring(i);
       goto label_003f ;
    }
    public i$a a(String p0,j p1){
       if (p0 == null || !p0.length()) {
          throw new IllegalArgumentException("method == null || method.length\(\) == 0");
       }
       if (p1 != null && !d.b(p0)) {
          throw new IllegalArgumentException("method "+p0+" must not have a request body.");
       }
       if (p1 == null && d.a(p0)) {
          throw new IllegalArgumentException("method "+p0+" must have a request body.");
       }
       this.b = p0;
       this.d = p1;
       return this;
    }
    public i$a a(String p0,String p1){
       this.c.a(p0, p1);
       return this;
    }
    public i$a b(){
       return this.a("HEAD", null);
    }
    public i$a b(j p0){
       return this.a("DELETE", p0);
    }
    public i$a c(j p0){
       return this.a("PUT", p0);
    }
    public i c(){
       if (this.a != null) {
          return new i(this, null);
       }
       throw new IllegalStateException("url == null");
    }
    public i$a d(j p0){
       return this.a("PATCH", p0);
    }
}
