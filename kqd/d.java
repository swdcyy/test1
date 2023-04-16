package kqd.d;
import io.netty.buffer.o;
import io.netty.buffer.a;
import io.netty.buffer.d;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteOrder;
import java.lang.Short;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;

public abstract class d extends o	// class@001b54
{
    public final boolean d;
    public final a e;
    public static final boolean f;

    static {
    }
    public void d(a p0){
       super(p0);
       this.e = p0;
       boolean q = PlatformDependent.q;
       boolean b = true;
       int i = (this.f5() == ByteOrder.BIG_ENDIAN)? 1: 0;
       if (q != i) {
          b = false;
       }
       this.d = b;
       return;
    }
    public final short D4(int p0){
       this.e.s7(p0, 2);
       short s = this.Y6(this.e, p0);
       if (this.d != null) {
       }else {
          s = Short.reverseBytes(s);
       }
       return s;
    }
    public final long G4(int p0){
       return ((long)this.getInt(p0) & 0xffffffff);
    }
    public final d I6(int p0){
       this.R6(p0);
       return this;
    }
    public final d J6(double p0){
       this.N6(Double.doubleToRawLongBits(p0));
       return this;
    }
    public final int K4(int p0){
       return (this.D4(p0) & 0xffff);
    }
    public final d K6(float p0){
       this.L6(Float.floatToRawIntBits(p0));
       return this;
    }
    public final d L6(int p0){
       this.e.C3(4);
       d te = this.e;
       a c = te.c;
       if (this.d != null) {
       }else {
          p0 = Integer.reverseBytes(p0);
       }
       this.Z6(te, c, p0);
       d te1 = this.e;
       te1.c = te1.c + 4;
       return this;
    }
    public final d N6(long p0){
       this.e.C3(8);
       d te = this.e;
       a c = te.c;
       if (this.d != null) {
       }else {
          p0 = Long.reverseBytes(p0);
       }
       this.a7(te, c, p0);
       d te1 = this.e;
       te1.c = te1.c + 8;
       return this;
    }
    public final d R6(int p0){
       this.e.C3(2);
       d te = this.e;
       a c = te.c;
       short s = (short)p0;
       if (this.d != null) {
       }else {
          s = Short.reverseBytes(s);
       }
       this.b7(te, c, s);
       d te1 = this.e;
       te1.c = te1.c + 2;
       return this;
    }
    public abstract int W6(a p0,int p1);
    public abstract long X6(a p0,int p1);
    public abstract short Y6(a p0,int p1);
    public abstract void Z6(a p0,int p1,int p2);
    public abstract void a7(a p0,int p1,long p2);
    public abstract void b7(a p0,int p1,short p2);
    public final d c6(int p0,int p1){
       this.m6(p0, p1);
       return this;
    }
    public final d d6(int p0,double p1){
       this.i6(p0, Double.doubleToRawLongBits(p1));
       return this;
    }
    public final d e6(int p0,float p1){
       this.g6(p0, Float.floatToRawIntBits(p1));
       return this;
    }
    public final d g6(int p0,int p1){
       this.e.s7(p0, 4);
       d te = this.e;
       if (this.d != null) {
       }else {
          p1 = Integer.reverseBytes(p1);
       }
       this.Z6(te, p0, p1);
       return this;
    }
    public final double getDouble(int p0){
       return Double.longBitsToDouble(this.getLong(p0));
    }
    public final float getFloat(int p0){
       return Float.intBitsToFloat(this.getInt(p0));
    }
    public final int getInt(int p0){
       this.e.s7(p0, 4);
       p0 = this.W6(this.e, p0);
       if (this.d != null) {
       }else {
          p0 = Integer.reverseBytes(p0);
       }
       return p0;
    }
    public final long getLong(int p0){
       this.e.r7(p0, 8);
       long l = this.X6(this.e, p0);
       if (this.d != null) {
       }else {
          l = Long.reverseBytes(l);
       }
       return l;
    }
    public final d i6(int p0,long p1){
       this.e.r7(p0, 8);
       d te = this.e;
       if (this.d != null) {
       }else {
          p1 = Long.reverseBytes(p1);
       }
       this.a7(te, p0, p1);
       return this;
    }
    public final d m6(int p0,int p1){
       this.e.s7(p0, 2);
       d te = this.e;
       short s = (short)p1;
       if (this.d != null) {
       }else {
          s = Short.reverseBytes(s);
       }
       this.b7(te, p0, s);
       return this;
    }
    public final char y4(int p0){
       return (char)this.D4(p0);
    }
}
