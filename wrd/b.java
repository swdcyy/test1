package wrd.b;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import kotlin.jvm.internal.a;
import wrd.b$a;
import wrd.b$c;
import wrd.b$b;
import wrd.b$d;
import trd.c;
import qrd.y0;
import trd.c$a;
import qrd.n1;
import qrd.i1;
import qrd.c1;
import qrd.u0;
import msd.l;
import java.math.BigDecimal;
import qrd.t0;
import qrd.x0;
import qrd.b1;
import qrd.h1;
import java.math.BigInteger;

public class b	// class@002929
{

    public void b(){
       super();
    }
    public static final List a(int[] p0){
       a.p(p0, "$this$asList");
       return new b$a(p0);
    }
    public static final List b(byte[] p0){
       a.p(p0, "$this$asList");
       return new b$c(p0);
    }
    public static final List c(long[] p0){
       a.p(p0, "$this$asList");
       return new b$b(p0);
    }
    public static final List d(short[] p0){
       a.p(p0, "$this$asList");
       return new b$d(p0);
    }
    public static final int e(int[] p0,int p1,int p2,int p3){
       int i;
       a.p(p0, "$this$binarySearch");
       c.b.d(p2, p3, y0.w(p0));
       p3--;
       while (true) {
          if (p2 <= p3) {
             i = p2 + p3;
             i = i >> 1;
             int i1 = n1.c(p0[i], p1);
             if (i1 < 0) {
                i = i + 1;
                p2 = i;
             }else if(i1 > 0){
                i = i - 1;
                p3 = i;
             }else {
                break ;
             }
          }else {
             p2++;
             return (- p2);
          }
       }
       return i;
    }
    public static int f(int[] p0,int p1,int p2,int p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = y0.w(p0);
       }
       return b.e(p0, p1, p2, p3);
    }
    public static final int g(short[] p0,short p1,int p2,int p3){
       int i1;
       a.p(p0, "$this$binarySearch");
       c.b.d(p2, p3, i1.w(p0));
       int i = p1 & 0xffff;
       p3--;
       while (true) {
          if (p2 <= p3) {
             i1 = p2 + p3;
             i1 = i1 >> 1;
             int i2 = n1.c(p0[i1], i);
             if (i2 < 0) {
                i1 = i1 + 1;
                p2 = i1;
             }else if(i2 > 0){
                i1 = i1 - 1;
                p3 = i1;
             }else {
                break ;
             }
          }else {
             p2++;
             return (- p2);
          }
       }
       return i1;
    }
    public static int h(short[] p0,short p1,int p2,int p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = i1.w(p0);
       }
       return b.g(p0, p1, p2, p3);
    }
    public static final int i(long[] p0,long p1,int p2,int p3){
       int i;
       a.p(p0, "$this$binarySearch");
       c.b.d(p2, p3, c1.w(p0));
       p3--;
       while (true) {
          if (p2 <= p3) {
             i = p2 + p3;
             i = i >> 1;
             int i1 = n1.g(p0[i], p1);
             if (i1 < 0) {
                i = i + 1;
                p2 = i;
             }else if(i1 > 0){
                i = i - 1;
                p3 = i;
             }else {
                break ;
             }
          }else {
             p2++;
             return (- p2);
          }
       }
       return i;
    }
    public static int j(long[] p0,long p1,int p2,int p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = c1.w(p0);
       }
       return b.i(p0, p1, p2, p3);
    }
    public static final int k(byte[] p0,byte p1,int p2,int p3){
       int i1;
       a.p(p0, "$this$binarySearch");
       c.b.d(p2, p3, u0.w(p0));
       int i = p1 & 0x00ff;
       p3--;
       while (true) {
          if (p2 <= p3) {
             i1 = p2 + p3;
             i1 = i1 >> 1;
             int i2 = n1.c(p0[i1], i);
             if (i2 < 0) {
                i1 = i1 + 1;
                p2 = i1;
             }else if(i2 > 0){
                i1 = i1 - 1;
                p3 = i1;
             }else {
                break ;
             }
          }else {
             p2++;
             return (- p2);
          }
       }
       return i1;
    }
    public static int l(byte[] p0,byte p1,int p2,int p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = u0.w(p0);
       }
       return b.k(p0, p1, p2, p3);
    }
    public static final byte m(byte[] p0,int p1){
       return u0.u(p0, p1);
    }
    public static final short n(short[] p0,int p1){
       return i1.u(p0, p1);
    }
    public static final int o(int[] p0,int p1){
       return y0.u(p0, p1);
    }
    public static final long p(long[] p0,int p1){
       return c1.u(p0, p1);
    }
    public static final BigDecimal q(byte[] p0,l p1){
       int i = 0;
       BigDecimal uBigDecimal = BigDecimal.valueOf((long)i);
       a.o(uBigDecimal, "BigDecimal.valueOf\(this.toLong\(\)\)");
       int len = p0.length;
       for (; i < len; i = i + 1) {
          uBigDecimal = uBigDecimal.add(p1.invoke(t0.b(p0[i])));
          a.o(uBigDecimal, "this.add\(other\)");
       }
       return uBigDecimal;
    }
    public static final BigDecimal r(int[] p0,l p1){
       int i = 0;
       BigDecimal uBigDecimal = BigDecimal.valueOf((long)i);
       a.o(uBigDecimal, "BigDecimal.valueOf\(this.toLong\(\)\)");
       int len = p0.length;
       for (; i < len; i = i + 1) {
          uBigDecimal = uBigDecimal.add(p1.invoke(x0.b(p0[i])));
          a.o(uBigDecimal, "this.add\(other\)");
       }
       return uBigDecimal;
    }
    public static final BigDecimal s(long[] p0,l p1){
       int i = 0;
       BigDecimal uBigDecimal = BigDecimal.valueOf((long)i);
       a.o(uBigDecimal, "BigDecimal.valueOf\(this.toLong\(\)\)");
       int len = p0.length;
       for (; i < len; i = i + 1) {
          uBigDecimal = uBigDecimal.add(p1.invoke(b1.b(p0[i])));
          a.o(uBigDecimal, "this.add\(other\)");
       }
       return uBigDecimal;
    }
    public static final BigDecimal t(short[] p0,l p1){
       int i = 0;
       BigDecimal uBigDecimal = BigDecimal.valueOf((long)i);
       a.o(uBigDecimal, "BigDecimal.valueOf\(this.toLong\(\)\)");
       int len = p0.length;
       for (; i < len; i = i + 1) {
          uBigDecimal = uBigDecimal.add(p1.invoke(h1.b(p0[i])));
          a.o(uBigDecimal, "this.add\(other\)");
       }
       return uBigDecimal;
    }
    public static final BigInteger u(byte[] p0,l p1){
       int i = 0;
       BigInteger uBigInteger = BigInteger.valueOf((long)i);
       a.o(uBigInteger, "BigInteger.valueOf\(this.toLong\(\)\)");
       int len = p0.length;
       for (; i < len; i = i + 1) {
          uBigInteger = uBigInteger.add(p1.invoke(t0.b(p0[i])));
          a.o(uBigInteger, "this.add\(other\)");
       }
       return uBigInteger;
    }
    public static final BigInteger v(int[] p0,l p1){
       int i = 0;
       BigInteger uBigInteger = BigInteger.valueOf((long)i);
       a.o(uBigInteger, "BigInteger.valueOf\(this.toLong\(\)\)");
       int len = p0.length;
       for (; i < len; i = i + 1) {
          uBigInteger = uBigInteger.add(p1.invoke(x0.b(p0[i])));
          a.o(uBigInteger, "this.add\(other\)");
       }
       return uBigInteger;
    }
    public static final BigInteger w(long[] p0,l p1){
       int i = 0;
       BigInteger uBigInteger = BigInteger.valueOf((long)i);
       a.o(uBigInteger, "BigInteger.valueOf\(this.toLong\(\)\)");
       int len = p0.length;
       for (; i < len; i = i + 1) {
          uBigInteger = uBigInteger.add(p1.invoke(b1.b(p0[i])));
          a.o(uBigInteger, "this.add\(other\)");
       }
       return uBigInteger;
    }
    public static final BigInteger x(short[] p0,l p1){
       int i = 0;
       BigInteger uBigInteger = BigInteger.valueOf((long)i);
       a.o(uBigInteger, "BigInteger.valueOf\(this.toLong\(\)\)");
       int len = p0.length;
       for (; i < len; i = i + 1) {
          uBigInteger = uBigInteger.add(p1.invoke(h1.b(p0[i])));
          a.o(uBigInteger, "this.add\(other\)");
       }
       return uBigInteger;
    }
}
