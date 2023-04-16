package usd.q;
import usd.p;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import usd.k;
import ssd.e;
import java.lang.Object;
import kotlin.jvm.internal.a;
import ssd.f;
import java.util.NoSuchElementException;
import usd.n;
import usd.g;
import usd.f;
import java.lang.Integer;
import java.lang.Comparable;
import java.lang.Number;
import usd.c;
import java.lang.Character;
import java.lang.Long;
import usd.a;
import usd.a$a;
import usd.i;
import usd.i$a;
import usd.l;
import usd.l$a;
import java.lang.Double;
import java.lang.Short;
import java.lang.Byte;
import java.lang.Float;
import usd.c$a;
import usd.k$a;
import usd.n$a;

public class q extends p	// class@002620
{

    public void q(){
       super();
    }
    public static final float A(float p0,float p1,float p2){
       if (p1 - p2 > 0) {
          throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum "+p2+" is less than minimum "+p1+'.');
       }
       if (p0 - p1 < 0) {
          return p1;
       }
       if (p0 - p2 > 0) {
          return p2;
       }
       return p0;
    }
    public static final int A0(k p0,e p1){
       a.p(p0, "$this$random");
       try{
          a.p(p1, "random");
          return f.h(p1, p0);
       }catch(java.lang.IllegalArgumentException e1){
          throw new NoSuchElementException(e1.getMessage());
       }
    }
    public static final int B(int p0,int p1,int p2){
       if (p1 > p2) {
          throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum "+p2+" is less than minimum "+p1+'.');
       }
       if (p0 < p1) {
          return p1;
       }
       if (p0 > p2) {
          return p2;
       }
       return p0;
    }
    public static final long B0(n p0){
       return q.C0(p0, e.b);
    }
    public static final int C(int p0,g p1){
       a.p(p1, "range");
       if (p1 instanceof f) {
          return q.G(Integer.valueOf(p0), p1).intValue();
       }
       if (p1.isEmpty()) {
          throw new IllegalArgumentException("Cannot coerce value to an empty range: "+p1+'.');
       }
       if (p0 < p1.getStart().intValue()) {
          p0 = p1.getStart().intValue();
       }else if(p0 > p1.d().intValue()){
          p0 = p1.d().intValue();
       }
       return p0;
    }
    public static final long C0(n p0,e p1){
       a.p(p0, "$this$random");
       try{
          a.p(p1, "random");
          return f.i(p1, p0);
       }catch(java.lang.IllegalArgumentException e1){
          throw new NoSuchElementException(e1.getMessage());
       }
    }
    public static final long D(long p0,long p1,long p2){
       if (p1 - p2 > 0) {
          throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum "+p2+" is less than minimum "+p1+'.');
       }
       if (p0 - p1 < 0) {
          return p1;
       }
       if (p0 - p2 > 0) {
          return p2;
       }
       return p0;
    }
    public static final Character D0(c p0){
       return q.E0(p0, e.b);
    }
    public static final long E(long p0,g p1){
       a.p(p1, "range");
       if (p1 instanceof f) {
          return q.G(Long.valueOf(p0), p1).longValue();
       }
       if (p1.isEmpty()) {
          throw new IllegalArgumentException("Cannot coerce value to an empty range: "+p1+'.');
       }
       if (p0 - p1.getStart().longValue() < 0) {
          p0 = p1.getStart().longValue();
       }else if(p0 - p1.d().longValue() > 0){
          p0 = p1.d().longValue();
       }
       return p0;
    }
    public static final Character E0(c p0,e p1){
       a.p(p0, "$this$randomOrNull");
       a.p(p1, "random");
       if (p0.isEmpty()) {
          return null;
       }
       return Character.valueOf((char)p1.m(p0.l(), (p0.m() + 1)));
    }
    public static final Comparable F(Comparable p0,Comparable p1,Comparable p2){
       a.p(p0, "$this$coerceIn");
       if (p1 != null && p2 != null) {
          if (p1.compareTo(p2) <= 0) {
             if (p0.compareTo(p1) < 0) {
                return p1;
             }else if(p0.compareTo(p2) > 0){
                return p2;
             }
          }else {
             throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum "+p2+" is less than minimum "+p1+'.');
          }
       }else if(p1 != null && p0.compareTo(p1) < 0){
          return p1;
       }else if(p2 != null && p0.compareTo(p2) > 0){
          return p2;
       }
       return p0;
    }
    public static final Integer F0(k p0){
       return q.G0(p0, e.b);
    }
    public static final Comparable G(Comparable p0,f p1){
       a.p(p0, "$this$coerceIn");
       a.p(p1, "range");
       if (p1.isEmpty()) {
          throw new IllegalArgumentException("Cannot coerce value to an empty range: "+p1+'.');
       }
       if (p1.b(p0, p1.getStart()) && !p1.b(p1.getStart(), p0)) {
          p0 = p1.getStart();
       }else if(p1.b(p1.d(), p0) && !p1.b(p0, p1.d())){
          p0 = p1.d();
       }
       return p0;
    }
    public static final Integer G0(k p0,e p1){
       a.p(p0, "$this$randomOrNull");
       a.p(p1, "random");
       if (p0.isEmpty()) {
          return null;
       }
       return Integer.valueOf(f.h(p1, p0));
    }
    public static final Comparable H(Comparable p0,g p1){
       a.p(p0, "$this$coerceIn");
       a.p(p1, "range");
       if (p1 instanceof f) {
          return q.G(p0, p1);
       }
       if (p1.isEmpty()) {
          throw new IllegalArgumentException("Cannot coerce value to an empty range: "+p1+'.');
       }
       if (p0.compareTo(p1.getStart()) < 0) {
          p0 = p1.getStart();
       }else if(p0.compareTo(p1.d()) > 0){
          p0 = p1.d();
       }
       return p0;
    }
    public static final Long H0(n p0){
       return q.I0(p0, e.b);
    }
    public static final short I(short p0,short p1,short p2){
       if (p1 > p2) {
          throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum "+p2+" is less than minimum "+p1+'.');
       }
       if (p0 < p1) {
          return p1;
       }
       if (p0 > p2) {
          return p2;
       }
       return p0;
    }
    public static final Long I0(n p0,e p1){
       a.p(p0, "$this$randomOrNull");
       a.p(p1, "random");
       if (p0.isEmpty()) {
          return null;
       }
       return Long.valueOf(f.i(p1, p0));
    }
    public static final boolean J(c p0,Character p1){
       a.p(p0, "$this$contains");
       boolean b = (p1 != null && p0.q(p1.charValue()))? true: false;
       return b;
    }
    public static final a J0(a p0){
       a.p(p0, "$this$reversed");
       return a.e.a(p0.m(), p0.l(), (- p0.n()));
    }
    public static final boolean K(k p0,Integer p1){
       a.p(p0, "$this$contains");
       boolean b = (p1 != null && p0.q(p1.intValue()))? true: false;
       return b;
    }
    public static final i K0(i p0){
       a.p(p0, "$this$reversed");
       return i.e.a(p0.m(), p0.l(), (- p0.n()));
    }
    public static final boolean L(n p0,Long p1){
       a.p(p0, "$this$contains");
       boolean b = (p1 != null && p0.q(p1.longValue()))? true: false;
       return b;
    }
    public static final l L0(l p0){
       a.p(p0, "$this$reversed");
       return l.e.a(p0.m(), p0.l(), (- p0.n()));
    }
    public static final boolean M(g p0,byte p1){
       a.p(p0, "$this$contains");
       return p0.contains(Double.valueOf((double)p1));
    }
    public static final boolean M0(g p0,byte p1){
       a.p(p0, "$this$contains");
       return p0.contains(Short.valueOf((short)p1));
    }
    public static final boolean N(g p0,float p1){
       a.p(p0, "$this$contains");
       return p0.contains(Double.valueOf((double)p1));
    }
    public static final boolean N0(g p0,double p1){
       a.p(p0, "$this$contains");
       Short shortx = q.e1(p1);
       boolean b = (shortx != null)? p0.contains(shortx): false;
       return b;
    }
    public static final boolean O(g p0,int p1){
       a.p(p0, "$this$contains");
       return p0.contains(Double.valueOf((double)p1));
    }
    public static final boolean O0(g p0,float p1){
       a.p(p0, "$this$contains");
       Short shortx = q.f1(p1);
       boolean b = (shortx != null)? p0.contains(shortx): false;
       return b;
    }
    public static final boolean P(g p0,long p1){
       a.p(p0, "$this$contains");
       return p0.contains(Double.valueOf((double)p1));
    }
    public static final boolean P0(g p0,int p1){
       a.p(p0, "$this$contains");
       Short shortx = q.g1(p1);
       boolean b = (shortx != null)? p0.contains(shortx): false;
       return b;
    }
    public static final boolean Q(g p0,short p1){
       a.p(p0, "$this$contains");
       return p0.contains(Double.valueOf((double)p1));
    }
    public static final boolean Q0(g p0,long p1){
       a.p(p0, "$this$contains");
       Short shortx = q.h1(p1);
       boolean b = (shortx != null)? p0.contains(shortx): false;
       return b;
    }
    public static final a R(char p0,char p1){
       return a.e.a(p0, p1, -1);
    }
    public static final a R0(a p0,int p1){
       a.p(p0, "$this$step");
       boolean b = (p1 > 0)? true: false;
       p.a(b, Integer.valueOf(p1));
       a$a e = a.e;
       char c = p0.l();
       char c1 = p0.m();
       if (p0.n() <= 0) {
          p1 = - p1;
       }
       return e.a(c, c1, p1);
    }
    public static final i S(byte p0,byte p1){
       return i.e.a(p0, p1, -1);
    }
    public static final i S0(i p0,int p1){
       int i;
       a.p(p0, "$this$step");
       boolean b = (p1 > 0)? true: false;
       p.a(b, Integer.valueOf(p1));
       i$a e = i.e;
       i = p0.l();
       int i1 = p0.m();
       if (p0.n() <= 0) {
          p1 = - p1;
       }
       return e.a(i, i1, p1);
    }
    public static final i T(byte p0,int p1){
       return i.e.a(p0, p1, -1);
    }
    public static final l T0(l p0,long p1){
       long l;
       a.p(p0, "$this$step");
       boolean b = (p1 > 0)? true: false;
       p.a(b, Long.valueOf(p1));
       l$a e = l.e;
       l = p0.l();
       long l1 = p0.m();
       if (p0.n() <= 0) {
          p1 = - p1;
       }
       return e.a(l, l1, p1);
    }
    public static final i U(byte p0,short p1){
       return i.e.a(p0, p1, -1);
    }
    public static final Byte U0(double p0){
       double d = (double)127;
       Byte uByte = (p0 - (double)-128 >= 0 && p0 - d <= 0)? Byte.valueOf((byte)(int)p0): null;
       return uByte;
    }
    public static final i V(int p0,byte p1){
       return i.e.a(p0, p1, -1);
    }
    public static final Byte V0(float p0){
       float f = (float)127;
       Byte uByte = (p0 - (float)-128 >= 0 && p0 - f <= 0)? Byte.valueOf((byte)(int)p0): null;
       return uByte;
    }
    public static final i W(int p0,int p1){
       return i.e.a(p0, p1, -1);
    }
    public static final Byte W0(int p0){
       Byte uByte;
       if (-128 > p0) {
       }else if(127 >= p0){
          uByte = Byte.valueOf((byte)p0);
       label_0010 :
          return uByte;
       }
       uByte = null;
       goto label_0010 ;
    }
    public static final i X(int p0,short p1){
       return i.e.a(p0, p1, -1);
    }
    public static final Byte X0(long p0){
       Byte uByte;
       long l = (long)127;
       if ((long)-128 - p0 > 0) {
       }else if(l - p0 >= 0){
          uByte = Byte.valueOf((byte)(int)p0);
       label_0017 :
          return uByte;
       }
       uByte = null;
       goto label_0017 ;
    }
    public static final i Y(short p0,byte p1){
       return i.e.a(p0, p1, -1);
    }
    public static final Byte Y0(short p0){
       Byte uByte;
       short s = (short)127;
       if ((short)-128 > p0) {
       }else if(s >= p0){
          uByte = Byte.valueOf((byte)p0);
       label_0012 :
          return uByte;
       }
       uByte = null;
       goto label_0012 ;
    }
    public static final i Z(short p0,int p1){
       return i.e.a(p0, p1, -1);
    }
    public static final Integer Z0(double p0){
       double d = (double)Integer.MAX_VALUE;
       Integer integer = (p0 - (double)Integer.MIN_VALUE >= 0 && p0 - d <= 0)? Integer.valueOf((int)p0): null;
       return integer;
    }
    public static final i a0(short p0,short p1){
       return i.e.a(p0, p1, -1);
    }
    public static final Integer a1(float p0){
       float f = (float)Integer.MAX_VALUE;
       Integer integer = (p0 - (float)Integer.MIN_VALUE >= 0 && p0 - f <= 0)? Integer.valueOf((int)p0): null;
       return integer;
    }
    public static final l b0(byte p0,long p1){
       return l.e.a((long)p0, p1, -1);
    }
    public static final Integer b1(long p0){
       Integer integer;
       long l = (long)Integer.MAX_VALUE;
       if ((long)Integer.MIN_VALUE - p0 > 0) {
       }else if(l - p0 >= 0){
          integer = Integer.valueOf((int)p0);
       label_0017 :
          return integer;
       }
       integer = null;
       goto label_0017 ;
    }
    public static final l c0(int p0,long p1){
       return l.e.a((long)p0, p1, -1);
    }
    public static final Long c1(double p0){
       double d = (double)Long.MAX_VALUE;
       Long longx = (p0 - (double)Long.MIN_VALUE >= 0 && p0 - d <= 0)? Long.valueOf((long)p0): null;
       return longx;
    }
    public static final l d0(long p0,byte p1){
       return l.e.a(p0, (long)p1, -1);
    }
    public static final Long d1(float p0){
       float f = (float)Long.MAX_VALUE;
       Long longx = (p0 - (float)Long.MIN_VALUE >= 0 && p0 - f <= 0)? Long.valueOf((long)p0): null;
       return longx;
    }
    public static final l e0(long p0,int p1){
       return l.e.a(p0, (long)p1, -1);
    }
    public static final Short e1(double p0){
       double d = (double)0x7fff;
       Short shortx = (p0 - (double)-32768 >= 0 && p0 - d <= 0)? Short.valueOf((short)(int)p0): null;
       return shortx;
    }
    public static final boolean f(g p0,double p1){
       a.p(p0, "$this$contains");
       Byte uByte = q.U0(p1);
       boolean b = (uByte != null)? p0.contains(uByte): false;
       return b;
    }
    public static final l f0(long p0,long p1){
       return l.e.a(p0, p1, -1);
    }
    public static final Short f1(float p0){
       float f = (float)0x7fff;
       Short shortx = (p0 - (float)-32768 >= 0 && p0 - f <= 0)? Short.valueOf((short)(int)p0): null;
       return shortx;
    }
    public static final boolean g(g p0,float p1){
       a.p(p0, "$this$contains");
       Byte uByte = q.V0(p1);
       boolean b = (uByte != null)? p0.contains(uByte): false;
       return b;
    }
    public static final l g0(long p0,short p1){
       return l.e.a(p0, (long)p1, -1);
    }
    public static final Short g1(int p0){
       Short shortx;
       if (-32768 > p0) {
       }else if(0x7fff >= p0){
          shortx = Short.valueOf((short)p0);
       label_0010 :
          return shortx;
       }
       shortx = null;
       goto label_0010 ;
    }
    public static final boolean h(g p0,int p1){
       a.p(p0, "$this$contains");
       Byte uByte = q.W0(p1);
       boolean b = (uByte != null)? p0.contains(uByte): false;
       return b;
    }
    public static final l h0(short p0,long p1){
       return l.e.a((long)p0, p1, -1);
    }
    public static final Short h1(long p0){
       Short shortx;
       long l = (long)0x7fff;
       if ((long)-32768 - p0 > 0) {
       }else if(l - p0 >= 0){
          shortx = Short.valueOf((short)(int)p0);
       label_0017 :
          return shortx;
       }
       shortx = null;
       goto label_0017 ;
    }
    public static final boolean i(g p0,long p1){
       a.p(p0, "$this$contains");
       Byte uByte = q.X0(p1);
       boolean b = (uByte != null)? p0.contains(uByte): false;
       return b;
    }
    public static final boolean i0(g p0,byte p1){
       a.p(p0, "$this$contains");
       return p0.contains(Float.valueOf((float)p1));
    }
    public static final c i1(char p0,char p1){
       if (a.t(p1, 0) <= 0) {
          return c.g.a();
       }
       p1--;
       return new c(p0, (char)p1);
    }
    public static final boolean j(g p0,short p1){
       a.p(p0, "$this$contains");
       Byte uByte = q.Y0(p1);
       boolean b = (uByte != null)? p0.contains(uByte): false;
       return b;
    }
    public static final boolean j0(g p0,double p1){
       a.p(p0, "$this$contains");
       return p0.contains(Float.valueOf((float)p1));
    }
    public static final k j1(byte p0,byte p1){
       p1--;
       return new k(p0, p1);
    }
    public static final byte k(byte p0,byte p1){
       if (p0 < p1) {
          p0 = p1;
       }
       return p0;
    }
    public static final boolean k0(g p0,int p1){
       a.p(p0, "$this$contains");
       return p0.contains(Float.valueOf((float)p1));
    }
    public static final k k1(byte p0,int p1){
       if (p1 <= Integer.MIN_VALUE) {
          return k.g.a();
       }
       p1--;
       return new k(p0, p1);
    }
    public static final double l(double p0,double p1){
       if (p0 - p1 < 0) {
          p0 = p1;
       }
       return p0;
    }
    public static final boolean l0(g p0,long p1){
       a.p(p0, "$this$contains");
       return p0.contains(Float.valueOf((float)p1));
    }
    public static final k l1(byte p0,short p1){
       p1--;
       return new k(p0, p1);
    }
    public static final float m(float p0,float p1){
       if (p0 - p1 < 0) {
          p0 = p1;
       }
       return p0;
    }
    public static final boolean m0(g p0,short p1){
       a.p(p0, "$this$contains");
       return p0.contains(Float.valueOf((float)p1));
    }
    public static final k m1(int p0,byte p1){
       p1--;
       return new k(p0, p1);
    }
    public static final int n(int p0,int p1){
       if (p0 < p1) {
          p0 = p1;
       }
       return p0;
    }
    public static final boolean n0(g p0,byte p1){
       a.p(p0, "$this$contains");
       return p0.contains(Integer.valueOf(p1));
    }
    public static final k n1(int p0,int p1){
       if (p1 <= Integer.MIN_VALUE) {
          return k.g.a();
       }
       p1--;
       return new k(p0, p1);
    }
    public static final long o(long p0,long p1){
       if (p0 - p1 < 0) {
          p0 = p1;
       }
       return p0;
    }
    public static final boolean o0(g p0,double p1){
       a.p(p0, "$this$contains");
       Integer integer = q.Z0(p1);
       boolean b = (integer != null)? p0.contains(integer): false;
       return b;
    }
    public static final k o1(int p0,short p1){
       p1--;
       return new k(p0, p1);
    }
    public static final Comparable p(Comparable p0,Comparable p1){
       a.p(p0, "$this$coerceAtLeast");
       a.p(p1, "minimumValue");
       if (p0.compareTo(p1) < 0) {
          p0 = p1;
       }
       return p0;
    }
    public static final boolean p0(g p0,float p1){
       a.p(p0, "$this$contains");
       Integer integer = q.a1(p1);
       boolean b = (integer != null)? p0.contains(integer): false;
       return b;
    }
    public static final k p1(short p0,byte p1){
       p1--;
       return new k(p0, p1);
    }
    public static final short q(short p0,short p1){
       if (p0 < p1) {
          p0 = p1;
       }
       return p0;
    }
    public static final boolean q0(g p0,long p1){
       a.p(p0, "$this$contains");
       Integer integer = q.b1(p1);
       boolean b = (integer != null)? p0.contains(integer): false;
       return b;
    }
    public static final k q1(short p0,int p1){
       if (p1 <= Integer.MIN_VALUE) {
          return k.g.a();
       }
       p1--;
       return new k(p0, p1);
    }
    public static final byte r(byte p0,byte p1){
       if (p0 > p1) {
          p0 = p1;
       }
       return p0;
    }
    public static final boolean r0(g p0,short p1){
       a.p(p0, "$this$contains");
       return p0.contains(Integer.valueOf(p1));
    }
    public static final k r1(short p0,short p1){
       p1--;
       return new k(p0, p1);
    }
    public static final double s(double p0,double p1){
       if (p0 - p1 > 0) {
          p0 = p1;
       }
       return p0;
    }
    public static final boolean s0(g p0,byte p1){
       a.p(p0, "$this$contains");
       return p0.contains(Long.valueOf((long)p1));
    }
    public static final n s1(byte p0,long p1){
       if (p1 - Long.MIN_VALUE <= 0) {
          return n.g.a();
       }
       return new n((long)p0, (p1 - 1));
    }
    public static final float t(float p0,float p1){
       if (p0 - p1 > 0) {
          p0 = p1;
       }
       return p0;
    }
    public static final boolean t0(g p0,double p1){
       a.p(p0, "$this$contains");
       Long longx = q.c1(p1);
       boolean b = (longx != null)? p0.contains(longx): false;
       return b;
    }
    public static final n t1(int p0,long p1){
       if (p1 - Long.MIN_VALUE <= 0) {
          return n.g.a();
       }
       return new n((long)p0, (p1 - 1));
    }
    public static final int u(int p0,int p1){
       if (p0 > p1) {
          p0 = p1;
       }
       return p0;
    }
    public static final boolean u0(g p0,float p1){
       a.p(p0, "$this$contains");
       Long longx = q.d1(p1);
       boolean b = (longx != null)? p0.contains(longx): false;
       return b;
    }
    public static final n u1(long p0,byte p1){
       return new n(p0, ((long)p1 - 1));
    }
    public static final long v(long p0,long p1){
       if (p0 - p1 > 0) {
          p0 = p1;
       }
       return p0;
    }
    public static final boolean v0(g p0,int p1){
       a.p(p0, "$this$contains");
       return p0.contains(Long.valueOf((long)p1));
    }
    public static final n v1(long p0,int p1){
       return new n(p0, ((long)p1 - 1));
    }
    public static final Comparable w(Comparable p0,Comparable p1){
       a.p(p0, "$this$coerceAtMost");
       a.p(p1, "maximumValue");
       if (p0.compareTo(p1) > 0) {
          p0 = p1;
       }
       return p0;
    }
    public static final boolean w0(g p0,short p1){
       a.p(p0, "$this$contains");
       return p0.contains(Long.valueOf((long)p1));
    }
    public static final n w1(long p0,long p1){
       if (p1 - Long.MIN_VALUE <= 0) {
          return n.g.a();
       }
       return new n(p0, (p1 - 1));
    }
    public static final short x(short p0,short p1){
       if (p0 > p1) {
          p0 = p1;
       }
       return p0;
    }
    public static final char x0(c p0){
       return q.y0(p0, e.b);
    }
    public static final n x1(long p0,short p1){
       return new n(p0, ((long)p1 - 1));
    }
    public static final byte y(byte p0,byte p1,byte p2){
       if (p1 > p2) {
          throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum "+p2+" is less than minimum "+p1+'.');
       }
       if (p0 < p1) {
          return p1;
       }
       if (p0 > p2) {
          return p2;
       }
       return p0;
    }
    public static final char y0(c p0,e p1){
       a.p(p0, "$this$random");
       String str = "random";
       try{
          a.p(p1, str);
          return (char)p1.m(p0.l(), (p0.m() + 1));
       }catch(java.lang.IllegalArgumentException e1){
          throw new NoSuchElementException(e1.getMessage());
       }
    }
    public static final n y1(short p0,long p1){
       if (p1 - Long.MIN_VALUE <= 0) {
          return n.g.a();
       }
       return new n((long)p0, (p1 - 1));
    }
    public static final double z(double p0,double p1,double p2){
       if (p1 - p2 > 0) {
          throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum "+p2+" is less than minimum "+p1+'.');
       }
       if (p0 - p1 < 0) {
          return p1;
       }
       if (p0 - p2 > 0) {
          return p2;
       }
       return p0;
    }
    public static final int z0(k p0){
       return q.A0(p0, e.b);
    }
}
