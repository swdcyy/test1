package com.heytap.msp.push.encrypt.b;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import java.lang.Object;
import java.lang.System;
import java.lang.Math;
import java.lang.String;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public abstract class b implements BinaryDecoder, BinaryEncoder	// class@000552
{
    public final byte f;
    public final int g;
    public byte[] h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public final int n;
    public final int o;
    public final int p;
    public int q;

    public void b(int p0,int p1,int p2,int p3){
       super();
       this.f = 61;
       this.n = p0;
       this.o = p1;
       p2 = (p2 > 0 && p3 > 0)? (p2 / p1) * p1: 0;
       this.g = p2;
       this.p = p3;
       return;
    }
    public static boolean c(byte p0){
       if (p0 != 9 && (p0 != 10 && (p0 != 13 && p0 != 32))) {
          return false;
       }
       return true;
    }
    public final void a(){
       b th = this.h;
       if (th == null) {
          byte[] uobyteArray = new byte[this.d()];
          this.h = uobyteArray;
          this.i = 0;
          this.q = 0;
       }else {
          byte[] uobyteArray1 = new byte[(th.length * 2)];
          System.arraycopy(th, 0, uobyteArray1, 0, th.length);
          this.h = uobyteArray1;
       }
       return;
    }
    public void a(int p0){
       b th = this.h;
       if (th == null || th.length < (this.i + p0)) {
          this.a();
       }
       return;
    }
    public abstract void a(byte[] p0,int p1,int p2);
    public abstract void b(byte[] p0,int p1,int p2);
    public boolean b(){
       boolean b = (this.h != null)? true: false;
       return b;
    }
    public abstract boolean b(byte p0);
    public boolean b(byte[] p0,boolean p1){
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             return true;
          }
          if (!this.b(p0[i]) && (!p1 || (p0[i] != 61 && !b.c(p0[i])))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public int c(){
       int i = (this.h != null)? this.i - this.q: 0;
       return i;
    }
    public int c(byte[] p0,int p1,int p2){
       int i;
       if (this.h != null) {
          p2 = Math.min(this.c(), p2);
          System.arraycopy(this.h, this.q, p0, p1, p2);
          i = this.q + p2;
          this.q = i;
          if (i >= this.i) {
             this.h = null;
          }
          return p2;
       }else if(this.j != null){
          i = -1;
       }else {
          i = 0;
       }
       return i;
    }
    public byte[] c(String p0){
       return this.decode(StringUtils.getBytesUtf8(p0));
    }
    public int d(){
       return 8192;
    }
    public boolean d(String p0){
       return this.b(StringUtils.getBytesUtf8(p0), true);
    }
    public Object decode(Object p0){
       if (p0 instanceof byte[]) {
          return this.decode(p0);
       }
       if (p0 instanceof String) {
          return this.c(p0);
       }
       throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }
    public byte[] decode(byte[] p0){
       this.e();
       if (p0 == null || !p0.length) {
          return p0;
       }
       this.b(p0, 0, p0.length);
       this.b(p0, 0, -1);
       b ti = this.i;
       byte[] uobyteArray = new byte[ti];
       this.c(uobyteArray, 0, ti);
       return uobyteArray;
    }
    public final void e(){
       this.h = null;
       this.i = 0;
       this.q = 0;
       this.k = 0;
       this.l = 0;
       this.j = false;
    }
    public Object encode(Object p0){
       if (p0 instanceof byte[]) {
          return this.encode(p0);
       }
       throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }
    public byte[] encode(byte[] p0){
       this.e();
       if (p0 == null || !p0.length) {
          return p0;
       }
       this.a(p0, 0, p0.length);
       this.a(p0, 0, -1);
       int i = this.i - this.q;
       byte[] uobyteArray = new byte[i];
       this.c(uobyteArray, 0, i);
       return uobyteArray;
    }
    public String j(byte[] p0){
       return StringUtils.newStringUtf8(this.encode(p0));
    }
    public String k(byte[] p0){
       return StringUtils.newStringUtf8(this.encode(p0));
    }
    public boolean l(byte[] p0){
       if (p0 == null) {
          return false;
       }
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          byte b = p0[i];
          if (61 == b || this.b(b)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public long m(byte[] p0){
       b tn = this.n;
       long l = (long)(((p0.length + tn) - 1) / tn) * (long)this.o;
       b tg = this.g;
       if (tg > null) {
          l = l + (((((long)tg + l) - 1) / (long)tg) * (long)this.p);
       }
       return l;
    }
}
