package com.xiaomi.push.c;
import java.io.OutputStream;
import java.lang.Object;
import ws8.g4;
import java.lang.String;
import ws8.a;
import ws8.l3;
import java.lang.RuntimeException;
import java.lang.System;
import java.lang.IllegalStateException;
import com.xiaomi.push.c$a;
import java.lang.UnsupportedOperationException;

public final class c	// class@0010fd
{
    public final byte[] a;
    public final int b;
    public int c;
    public final OutputStream d;

    public void c(OutputStream p0,byte[] p1){
       super();
       this.d = p0;
       this.a = p1;
       this.c = 0;
       this.b = p1.length;
    }
    public void c(byte[] p0,int p1,int p2){
       super();
       this.d = null;
       this.a = p0;
       this.c = p1;
       this.b = p1 + p2;
    }
    public static int F(int p0){
       return c.U(p0);
    }
    public static int G(int p0,int p1){
       return (c.O(p0) + c.F(p1));
    }
    public static int H(int p0,long p1){
       return (c.O(p0) + c.I(p1));
    }
    public static int I(long p0){
       return c.P(p0);
    }
    public static int O(int p0){
       return c.U(g4.b(p0, 0));
    }
    public static int P(long p0){
       if (!(-128 & p0)) {
          return 1;
       }
       if (!(-16384 & p0)) {
          return 2;
       }
       if (!(-2097152 & p0)) {
          return 3;
       }
       if (!(-268435456 & p0)) {
          return 4;
       }
       if (!(0xfffffff800000000 & p0)) {
          return 5;
       }
       if (!(0xfffffc0000000000 & p0)) {
          return 6;
       }
       if (!(0xfffe000000000000 & p0)) {
          return 7;
       }
       if (!(0xff00000000000000 & p0)) {
          return 8;
       }
       if (!(p0 & Long.MIN_VALUE)) {
          return 9;
       }
       return 10;
    }
    public static int U(int p0){
       if (!(p0 & 0x80)) {
          return 1;
       }
       if (!(p0 & 0xc000)) {
          return 2;
       }
       if (!(0xffe00000 & p0)) {
          return 3;
       }
       if (!(p0 & 0xf0000000)) {
          return 4;
       }
       return 5;
    }
    public static int b(int p0){
       if (p0 >= 0) {
          return c.U(p0);
       }
       return 10;
    }
    public static int c(int p0,int p1){
       return (c.O(p0) + c.b(p1));
    }
    public static int d(int p0,long p1){
       return (c.O(p0) + c.i(p1));
    }
    public static int e(int p0,String p1){
       return (c.O(p0) + c.j(p1));
    }
    public static int f(int p0,a p1){
       return (c.O(p0) + c.k(p1));
    }
    public static int g(int p0,l3 p1){
       return (c.O(p0) + c.l(p1));
    }
    public static int h(int p0,boolean p1){
       return (c.O(p0) + 1);
    }
    public static int i(long p0){
       return c.P(p0);
    }
    public static int j(String p0){
       try{
          byte[] bytes = p0.getBytes("UTF-8");
          return (c.U(bytes.length) + bytes.length);
       }catch(java.io.UnsupportedEncodingException e0){
          throw new RuntimeException("UTF-8 not supported.");
       }
    }
    public static int k(a p0){
       return (c.U(p0.a()) + p0.a());
    }
    public static int l(l3 p0){
       int i = p0.i();
       return (c.U(i) + i);
    }
    public static c m(OutputStream p0){
       return c.n(p0, 4096);
    }
    public static c n(OutputStream p0,int p1){
       byte[] uobyteArray = new byte[p1];
       return new c(p0, uobyteArray);
    }
    public static c o(byte[] p0,int p1,int p2){
       return new c(p0, p1, p2);
    }
    public void A(a p0){
       byte[] uobyteArray = p0.d();
       this.V(uobyteArray.length);
       this.D(uobyteArray);
    }
    public void B(l3 p0){
       this.V(p0.a());
       p0.e(this);
    }
    public void C(boolean p0){
       this.R(p0);
    }
    public void D(byte[] p0){
       this.E(p0, 0, p0.length);
    }
    public void E(byte[] p0,int p1,int p2){
       c tc = this.c;
       int i = this.b - tc;
       if (i >= p2) {
          System.arraycopy(p0, p1, this.a, tc, p2);
          this.c = this.c + p2;
       }else {
          System.arraycopy(p0, p1, this.a, tc, i);
          p1 = p1 + i;
          p2 = p2 - i;
          this.c = this.b;
          this.Q();
          if (p2 <= this.b) {
             System.arraycopy(p0, p1, this.a, 0, p2);
             this.c = p2;
          }else {
             this.d.write(p0, p1, p2);
          }
       }
       return;
    }
    public void J(){
       if (!this.a()) {
          return;
       }
       throw new IllegalStateException("Did not write as much data as expected.");
    }
    public void K(int p0){
       this.V(p0);
    }
    public void L(int p0,int p1){
       this.S(p0, 0);
       this.K(p1);
    }
    public void M(int p0,long p1){
       this.S(p0, 0);
       this.N(p1);
    }
    public void N(long p0){
       this.T(p0);
    }
    public final void Q(){
       c td = this.d;
       if (td == null) {
          throw new c$a();
       }
       td.write(this.a, 0, this.c);
       this.c = 0;
       return;
    }
    public void R(int p0){
       this.q((byte)p0);
    }
    public void S(int p0,int p1){
       this.V(g4.b(p0, p1));
    }
    public void T(long p0){
       long l = -128 & p0;
       while (l) {
          int i = (int)p0 & 0x7f;
          i = i | 0x0080;
          this.R(i);
          p0 = p0 >> 7;
       }
       this.R((int)p0);
       return;
    }
    public void V(int p0){
       int i = p0 & 0x80;
       while (i) {
          i = p0 & 0x7f;
          i = i | 0x0080;
          this.R(i);
          p0 = p0 >> 7;
       }
       this.R(p0);
       return;
    }
    public int a(){
       if (this.d == null) {
          return (this.b - this.c);
       }
       throw new UnsupportedOperationException("spaceLeft\(\) can only be called on CodedOutputStreams that are writing to a flat array.");
    }
    public void p(){
       if (this.d != null) {
          this.Q();
       }
       return;
    }
    public void q(byte p0){
       if (this.c == this.b) {
          this.Q();
       }
       c tc = this.c;
       this.c = tc + 1;
       this.a[tc] = p0;
       return;
    }
    public void r(int p0){
       if (p0 >= 0) {
          this.V(p0);
       }else {
          this.T((long)p0);
       }
       return;
    }
    public void s(int p0,int p1){
       this.S(p0, 0);
       this.r(p1);
    }
    public void t(int p0,long p1){
       this.S(p0, 0);
       this.y(p1);
    }
    public void u(int p0,String p1){
       this.S(p0, 2);
       this.z(p1);
    }
    public void v(int p0,a p1){
       this.S(p0, 2);
       this.A(p1);
    }
    public void w(int p0,l3 p1){
       this.S(p0, 2);
       this.B(p1);
    }
    public void x(int p0,boolean p1){
       this.S(p0, 0);
       this.C(p1);
    }
    public void y(long p0){
       this.T(p0);
    }
    public void z(String p0){
       byte[] bytes = p0.getBytes("UTF-8");
       this.V(bytes.length);
       this.D(bytes);
    }
}
