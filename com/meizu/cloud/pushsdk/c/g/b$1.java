package com.meizu.cloud.pushsdk.c.g.b$1;
import java.io.InputStream;
import com.meizu.cloud.pushsdk.c.g.b;
import java.lang.Math;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;

public class b$1 extends InputStream	// class@0014ea
{
    public final b a;

    public void b$1(b p0){
       this.a = p0;
       super();
    }
    public int available(){
       return (int)Math.min(this.a.b, 0x7fffffff);
    }
    public void close(){
    }
    public int read(){
       b$1 ta = this.a;
       if (ta.b > 0) {
          return (ta.f() & 0x00ff);
       }
       return -1;
    }
    public int read(byte[] p0,int p1,int p2){
       return this.a.a(p0, p1, p2);
    }
    public String toString(){
       return this.a+".inputStream\(\)";
    }
}
