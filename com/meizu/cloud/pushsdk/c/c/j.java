package com.meizu.cloud.pushsdk.c.c.j;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.c.g;
import java.io.File;
import java.lang.String;
import java.util.Objects;
import com.meizu.cloud.pushsdk.c.c.j$2;
import com.meizu.cloud.pushsdk.c.c.m;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import com.meizu.cloud.pushsdk.c.c.j$1;
import com.meizu.cloud.pushsdk.c.g.c;

public abstract class j	// class@0014dc
{

    public void j(){
       super();
    }
    public static j a(g p0,File p1){
       Objects.requireNonNull(p1, "content == null");
       return new j$2(p0, p1);
    }
    public static j a(g p0,String p1){
       Charset c = m.c;
       if (p0 != null) {
          Charset uCharset = p0.b();
          if (uCharset == null) {
             p0 = g.a(p0+"; charset=utf-8");
          }else {
             c = uCharset;
          }
       }
       return j.a(p0, p1.getBytes(c));
    }
    public static j a(g p0,byte[] p1){
       return j.a(p0, p1, 0, p1.length);
    }
    public static j a(g p0,byte[] p1,int p2,int p3){
       Objects.requireNonNull(p1, "content == null");
       m.a((long)p1.length, (long)p2, (long)p3);
       return new j$1(p0, p3, p1, p2);
    }
    public abstract g a();
    public abstract void a(c p0);
    public long b(){
       return -1;
    }
}
