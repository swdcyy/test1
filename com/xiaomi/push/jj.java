package com.xiaomi.push.jj;
import com.xiaomi.push.iz;
import ws8.x6;
import java.lang.String;
import ws8.q6;
import com.xiaomi.push.ix;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import java.nio.ByteBuffer;
import ws8.o6;
import ws8.p6;
import ws8.s6;

public class jj extends iz	// class@00113d
{
    public static int o = 10000;
    public static int p = 10000;
    public static int q = 10000;
    public static int r = 10485760;
    public static int s = 104857600;

    public void jj(x6 p0,boolean p1,boolean p2){
       super(p0, p1, p2);
    }
    public String e(){
       int i = this.c();
       if (i > jj.r) {
          throw new je(3, "Thrift string size "+i+" out of range!");
       }
       if (this.a.f() < i) {
          return this.J(i);
       }
       try{
          this.a.c(i);
          return new String(this.a.e(), this.a.a(), i, "UTF-8");
       }catch(java.io.UnsupportedEncodingException e0){
          throw new ix("JVM DOES NOT SUPPORT UTF-8");
       }
    }
    public ByteBuffer f(){
       int i = this.c();
       if (i > jj.s) {
          throw new je(3, "Thrift binary size "+i+" out of range!");
       }
       this.L(i);
       if (this.a.f() >= i) {
          this.a.c(i);
          return ByteBuffer.wrap(this.a.e(), this.a.a(), i);
       }else {
          byte[] uobyteArray = new byte[i];
          this.a.g(uobyteArray, 0, i);
          return ByteBuffer.wrap(uobyteArray);
       }
    }
    public o6 h(){
       byte b = this.a();
       int i = this.c();
       if (i <= jj.p) {
          return new o6(b, i);
       }
       throw new je(3, "Thrift list size "+i+" out of range!");
    }
    public p6 i(){
       byte b = this.a();
       byte b1 = this.a();
       int i = this.c();
       if (i <= jj.o) {
          return new p6(b, b1, i);
       }
       throw new je(3, "Thrift map size "+i+" out of range!");
    }
    public s6 j(){
       byte b = this.a();
       int i = this.c();
       if (i <= jj.q) {
          return new s6(b, i);
       }
       throw new je(3, "Thrift set size "+i+" out of range!");
    }
}
