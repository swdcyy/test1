package com.xiaomi.push.iz;
import ws8.q6;
import ws8.t6;
import ws8.x6;
import java.lang.String;
import com.xiaomi.push.ix;
import java.lang.StringBuilder;
import java.lang.Double;
import java.nio.ByteBuffer;
import ws8.n6;
import ws8.o6;
import ws8.p6;
import ws8.s6;

public class iz extends q6	// class@001138
{
    public boolean b;
    public boolean c;
    public int d;
    public boolean e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;
    public byte[] k;
    public byte[] l;
    public byte[] m;
    public static final t6 n;

    static {
       iz.n = new t6();
    }
    public void iz(x6 p0,boolean p1,boolean p2){
       super(p0);
       this.b = false;
       this.c = true;
       this.e = false;
       byte[] uobyteArray = new byte[true];
       this.f = uobyteArray;
       byte[] uobyteArray1 = new byte[2];
       this.g = uobyteArray1;
       byte[] uobyteArray2 = new byte[4];
       this.h = uobyteArray2;
       byte[] uobyteArray3 = new byte[8];
       this.i = uobyteArray3;
       byte[] uobyteArray4 = new byte[true];
       this.j = uobyteArray4;
       uobyteArray = new byte[2];
       this.k = uobyteArray;
       uobyteArray = new byte[4];
       this.l = uobyteArray;
       uobyteArray = new byte[8];
       this.m = uobyteArray;
       this.b = p1;
       this.c = p2;
    }
    public void A(){
       this.n(0);
    }
    public void B(){
    }
    public void C(){
    }
    public void D(){
    }
    public void E(){
    }
    public void F(){
    }
    public void G(){
    }
    public void H(){
    }
    public final int I(byte[] p0,int p1,int p2){
       this.L(p2);
       return this.a.g(p0, p1, p2);
    }
    public String J(int p0){
       try{
          this.L(p0);
          byte[] uobyteArray = new byte[p0];
          this.a.g(uobyteArray, 0, p0);
          return new String(uobyteArray, "UTF-8");
       }catch(java.io.UnsupportedEncodingException e0){
          throw new ix("JVM DOES NOT SUPPORT UTF-8");
       }
    }
    public void K(int p0){
       this.d = p0;
       this.e = true;
    }
    public void L(int p0){
       if (p0 < 0) {
          throw new ix("Negative length: "+p0);
       }
       if (this.e != null) {
          int i = this.d - p0;
          this.d = i;
          if (i < 0) {
             throw new ix("Message length exceeded: "+p0);
          }
       }
       return;
    }
    public byte a(){
       if (this.a.f() >= 1) {
          this.a.c(1);
          return this.a.e()[this.a.a()];
       }else {
          this.I(this.j, 0, 1);
          return this.j[0];
       }
    }
    public double b(){
       return Double.longBitsToDouble(this.d());
    }
    public int c(){
       iz tl = this.l;
       int i = 0;
       int i1 = 4;
       if (this.a.f() >= i1) {
          tl = this.a.e();
          i = this.a.a();
          this.a.c(i1);
       }else {
          this.I(this.l, i, i1);
       }
       return ((tl[(i + 3)] & 0x00ff) | ((((tl[i] & 0x00ff) << 24) | ((tl[(i + 1)] & 0x00ff) << 16)) | ((tl[(i + 2)] & 0x00ff) << 8)));
    }
    public long d(){
       iz tm = this.m;
       int i = 0;
       int i1 = 8;
       if (this.a.f() >= i1) {
          tm = this.a.e();
          i = this.a.a();
          this.a.c(i1);
       }else {
          this.I(this.m, i, i1);
       }
       return ((long)(tm[(i + 7)] & 0x00ff) | ((((((((long)(tm[i] & 0x00ff) << 56) | ((long)(tm[(i + 1)] & 0x00ff) << 48)) | ((long)(tm[(i + 2)] & 0x00ff) << 40)) | ((long)(tm[(i + 3)] & 0x00ff) << 32)) | ((long)(tm[(i + 4)] & 0x00ff) << 24)) | ((long)(tm[(i + 5)] & 0x00ff) << 16)) | ((long)(tm[(i + 6)] & 0x00ff) << i1)));
    }
    public String e(){
       int i = this.c();
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
    public n6 g(){
       byte b = this.a();
       short s = (!b)? 0: this.l();
       return new n6("", b, s);
    }
    public o6 h(){
       return new o6(this.a(), this.c());
    }
    public p6 i(){
       return new p6(this.a(), this.a(), this.c());
    }
    public s6 j(){
       return new s6(this.a(), this.c());
    }
    public t6 k(){
       return iz.n;
    }
    public short l(){
       iz tk = this.k;
       int i = 0;
       if (this.a.f() >= 2) {
          tk = this.a.e();
          i = this.a.a();
          this.a.c(2);
       }else {
          this.I(this.k, i, 2);
       }
       return (short)((tk[(i + 1)] & 0x00ff) | ((tk[i] & 0x00ff) << 8));
    }
    public void m(){
    }
    public void n(byte p0){
       iz tf = this.f;
       tf[0] = p0;
       this.a.d(tf, 0, 1);
    }
    public void o(int p0){
       iz th = this.h;
       th[0] = (byte)((p0 >> 24) & 0x00ff);
       th[1] = (byte)((p0 >> 16) & 0x00ff);
       th[2] = (byte)((p0 >> 8) & 0x00ff);
       th[3] = (byte)(p0 & 0x00ff);
       this.a.d(th, 0, 4);
    }
    public void p(long p0){
       iz ti = this.i;
       ti[0] = (byte)(int)((p0 >> 56) & 255);
       ti[1] = (byte)(int)((p0 >> 48) & 255);
       ti[2] = (byte)(int)((p0 >> 40) & 255);
       ti[3] = (byte)(int)((p0 >> 32) & 255);
       ti[4] = (byte)(int)((p0 >> 24) & 255);
       ti[5] = (byte)(int)((p0 >> 16) & 255);
       ti[6] = (byte)(int)((p0 >> 8) & 255);
       ti[7] = (byte)(int)(p0 & 255);
       this.a.d(ti, 0, 8);
    }
    public void q(String p0){
       try{
          byte[] bytes = p0.getBytes("UTF-8");
          this.o(bytes.length);
          this.a.d(bytes, 0, bytes.length);
          return;
       }catch(java.io.UnsupportedEncodingException e0){
          throw new ix("JVM DOES NOT SUPPORT UTF-8");
       }
    }
    public void r(ByteBuffer p0){
       int i = (p0.limit() - p0.position()) - p0.arrayOffset();
       this.o(i);
       this.a.d(p0.array(), (p0.position() + p0.arrayOffset()), i);
    }
    public void s(n6 p0){
       this.n(p0.b);
       this.w(p0.c);
    }
    public void t(o6 p0){
       this.n(p0.a);
       this.o(p0.b);
    }
    public void u(p6 p0){
       this.n(p0.a);
       this.n(p0.b);
       this.o(p0.c);
    }
    public void v(t6 p0){
    }
    public void w(short p0){
       iz tg = this.g;
       tg[0] = (byte)((p0 >> 8) & 0x00ff);
       tg[1] = (byte)(p0 & 0x00ff);
       this.a.d(tg, 0, 2);
    }
    public void x(boolean p0){
       this.n(p0);
    }
    public boolean y(){
       boolean b = true;
       if (this.a() == b) {
       }else {
          b = false;
       }
       return b;
    }
    public void z(){
    }
}
