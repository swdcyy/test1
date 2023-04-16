package fud.c;
import org.apache.internal.commons.codec.b;
import org.apache.internal.commons.codec.a;
import java.lang.Object;
import fud.c$a;
import java.lang.String;
import fud.e;
import org.apache.internal.commons.codec.DecoderException;
import org.apache.internal.commons.codec.EncoderException;
import java.lang.System;
import java.lang.Math;

public abstract class c implements b, a	// class@000ee8
{
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public void c(int p0,int p1,int p2,int p3){
       super();
       this.a = 61;
       this.b = p0;
       this.c = p1;
       p0 = 0;
       int i = (p2 > 0 && p3 > 0)? 1: 0;
       if (i) {
          p0 = (p2 / p1) * p1;
       }
       this.d = p0;
       this.e = p3;
       return;
    }
    public boolean a(byte[] p0){
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          byte b = p0[i];
          if (61 == b || this.g(b)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public abstract void b(byte[] p0,int p1,int p2,c$a p3);
    public byte[] c(String p0){
       return this.decode(e.a(p0));
    }
    public abstract void d(byte[] p0,int p1,int p2,c$a p3);
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
       if (p0 == null || !p0.length) {
          return p0;
       }
       c$a uoa = new c$a();
       this.b(p0, 0, p0.length, uoa);
       this.b(p0, 0, -1, uoa);
       c$a d = uoa.d;
       byte[] uobyteArray = new byte[d];
       this.h(uobyteArray, 0, d, uoa);
       return uobyteArray;
    }
    public String e(byte[] p0){
       return e.b(this.encode(p0));
    }
    public Object encode(Object p0){
       if (p0 instanceof byte[]) {
          return this.encode(p0);
       }
       throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }
    public byte[] encode(byte[] p0){
       if (p0 == null || !p0.length) {
          return p0;
       }
       c$a uoa = new c$a();
       this.d(p0, 0, p0.length, uoa);
       this.d(p0, 0, -1, uoa);
       int i = uoa.d - uoa.e;
       byte[] uobyteArray = new byte[i];
       this.h(uobyteArray, 0, i, uoa);
       return uobyteArray;
    }
    public byte[] f(int p0,c$a p1){
       c$a c = p1.c;
       if (c != null && c.length >= (p1.d + p0)) {
          return c;
       }
       p0 = 0;
       if (c == null) {
          byte[] uobyteArray = new byte[8192];
          p1.c = uobyteArray;
          p1.d = p0;
          p1.e = p0;
       }else {
          byte[] uobyteArray1 = new byte[(c.length * 2)];
          System.arraycopy(c, p0, uobyteArray1, p0, c.length);
          p1.c = uobyteArray1;
       }
       return p1.c;
    }
    public abstract boolean g(byte p0);
    public int h(byte[] p0,int p1,int p2,c$a p3){
       int i;
       if (p3.c != null) {
          p2 = Math.min((p3.d - p3.e), p2);
          System.arraycopy(p3.c, p3.e, p0, p1, p2);
          i = p3.e + p2;
          p3.e = i;
          if (i >= p3.d) {
             p3.c = null;
          }
          return p2;
       }else if(p3.f != null){
          i = -1;
       }else {
          i = 0;
       }
       return i;
    }
}
