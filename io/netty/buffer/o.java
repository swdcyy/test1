package io.netty.buffer.o;
import io.netty.buffer.d;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.nio.ByteOrder;
import io.netty.buffer.f;
import java.io.InputStream;
import java.nio.channels.ScatteringByteChannel;
import java.nio.ByteBuffer;
import java.lang.Double;
import java.lang.Float;
import wqd.n;
import io.netty.util.a;
import java.nio.channels.GatheringByteChannel;
import kqd.e;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.lang.StringBuilder;

public class o extends d	// class@00106d
{
    public final d b;
    public final ByteOrder c;

    public void o(d p0){
       super();
       Objects.requireNonNull(p0, "buf");
       this.b = p0;
       ByteOrder bIG_ENDIAN = ByteOrder.BIG_ENDIAN;
       this.c = (p0.f5() == bIG_ENDIAN)? ByteOrder.LITTLE_ENDIAN: bIG_ENDIAN;
       return;
    }
    public long A4(int p0){
       return this.b.getLong(p0);
    }
    public short A5(){
       return f.h(this.b.A5());
    }
    public int A6(InputStream p0,int p1){
       return this.b.A6(p0, p1);
    }
    public int B4(int p0){
       return f.g(this.b.B4(p0));
    }
    public short B5(){
       return this.b.A5();
    }
    public int B6(ScatteringByteChannel p0,int p1){
       return this.b.B6(p0, p1);
    }
    public d C3(int p0){
       this.b.C3(p0);
       return this;
    }
    public int C4(int p0){
       return this.b.B4(p0);
    }
    public d C5(int p0){
       return this.b.C5(p0).e5(this.c);
    }
    public d C6(d p0){
       this.b.C6(p0);
       return this;
    }
    public d D2(int p0,int p1){
       return this.b.D2(p0, p1).e5(this.c);
    }
    public short D4(int p0){
       return f.h(this.b.D4(p0));
    }
    public short D5(){
       return this.b.D5();
    }
    public d D6(d p0,int p1){
       this.b.D6(p0, p1);
       return this;
    }
    public short E4(int p0){
       return this.b.D4(p0);
    }
    public long E5(){
       return ((long)this.u5() & 0xffffffff);
    }
    public d E6(d p0,int p1,int p2){
       this.b.E6(p0, p1, p2);
       return this;
    }
    public d F2(){
       this.b.F2();
       return this;
    }
    public short F4(int p0){
       return this.b.F4(p0);
    }
    public long F5(){
       return ((long)this.v5() & 0xffffffff);
    }
    public d F6(ByteBuffer p0){
       this.b.F6(p0);
       return this;
    }
    public long G4(int p0){
       return ((long)this.getInt(p0) & 0xffffffff);
    }
    public int G5(){
       return (this.y5() & 0xffffff);
    }
    public d G6(byte[] p0){
       this.b.G6(p0);
       return this;
    }
    public long H4(int p0){
       return ((long)this.z4(p0) & 0xffffffff);
    }
    public int H5(){
       return (this.z5() & 0xffffff);
    }
    public d H6(byte[] p0,int p1,int p2){
       this.b.H6(p0, p1, p2);
       return this;
    }
    public int I4(int p0){
       return (this.B4(p0) & 0xffffff);
    }
    public int I5(){
       return (this.A5() & 0xffff);
    }
    public d I6(int p0){
       this.R6(p0);
       return this;
    }
    public int J4(int p0){
       return (this.C4(p0) & 0xffffff);
    }
    public int J5(){
       return (this.B5() & 0xffff);
    }
    public d J6(double p0){
       this.N6(Double.doubleToRawLongBits(p0));
       return this;
    }
    public int K4(int p0){
       return (this.D4(p0) & 0xffff);
    }
    public d K6(float p0){
       this.L6(Float.floatToRawIntBits(p0));
       return this;
    }
    public int L0(){
       return this.b.L0();
    }
    public int L4(int p0){
       return (this.E4(p0) & 0xffff);
    }
    public int L5(){
       return this.b.L5();
    }
    public d L6(int p0){
       this.b.L6(f.e(p0));
       return this;
    }
    public boolean M4(){
       return this.b.M4();
    }
    public int M5(){
       return this.b.M5();
    }
    public d M6(int p0){
       this.b.L6(p0);
       return this;
    }
    public boolean N4(){
       return this.b.N4();
    }
    public d N5(int p0){
       this.b.N5(p0);
       return this;
    }
    public d N6(long p0){
       this.b.N6(f.f(p0));
       return this;
    }
    public int O4(int p0,int p1,byte p2){
       return this.b.O4(p0, p1, p2);
    }
    public d O5(){
       this.b.O5();
       return this;
    }
    public d O6(long p0){
       this.b.N6(p0);
       return this;
    }
    public ByteBuffer P4(int p0,int p1){
       return this.a5(p0, p1);
    }
    public d P5(){
       this.b.P5();
       return this;
    }
    public d P6(int p0){
       this.b.P6(f.g(p0));
       return this;
    }
    public boolean Q4(){
       return this.b.Q4();
    }
    public d Q5(){
       this.b.Q5();
       return this;
    }
    public d Q6(int p0){
       this.b.P6(p0);
       return this;
    }
    public boolean R4(){
       return this.b.R4();
    }
    public d R5(int p0){
       this.b.R5(p0);
       return this;
    }
    public d R6(int p0){
       this.b.R6(f.h((short)p0));
       return this;
    }
    public boolean S4(int p0){
       return this.b.S4(p0);
    }
    public d S5(int p0,boolean p1){
       this.b.S5(p0, p1);
       return this;
    }
    public d S6(int p0){
       this.b.R6((short)p0);
       return this;
    }
    public boolean T4(int p0){
       return this.b.T4(p0);
    }
    public d T5(int p0,int p1){
       this.b.T5(p0, p1);
       return this;
    }
    public d T6(int p0){
       this.b.T6(p0);
       return this;
    }
    public d U4(){
       this.b.U4();
       return this;
    }
    public int U5(int p0,InputStream p1,int p2){
       return this.b.U5(p0, p1, p2);
    }
    public int U6(){
       return this.b.U6();
    }
    public d V1(int p0){
       this.b.V1(p0);
       return this;
    }
    public boolean V2(){
       return this.b.V2();
    }
    public d V4(){
       this.b.V4();
       return this;
    }
    public int V5(int p0,ScatteringByteChannel p1,int p2){
       return this.b.V5(p0, p1, p2);
    }
    public d V6(int p0){
       this.b.V6(p0);
       return this;
    }
    public int W4(){
       return this.b.W4();
    }
    public d W5(int p0,d p1){
       this.b.W5(p0, p1);
       return this;
    }
    public int X0(byte p0){
       return this.b.X0(p0);
    }
    public int X4(){
       return this.b.X4();
    }
    public d X5(int p0,d p1,int p2){
       this.b.X5(p0, p1, p2);
       return this;
    }
    public d Y1(){
       this.b.Y1();
       return this;
    }
    public long Y4(){
       return this.b.Y4();
    }
    public d Y5(int p0,d p1,int p2,int p3){
       this.b.Y5(p0, p1, p2, p3);
       return this;
    }
    public ByteBuffer Z4(){
       return this.b.Z4().order(this.c);
    }
    public d Z5(int p0,ByteBuffer p1){
       this.b.Z5(p0, p1);
       return this;
    }
    public ByteBuffer a5(int p0,int p1){
       return this.b.a5(p0, p1).order(this.c);
    }
    public d a6(int p0,byte[] p1){
       this.b.a6(p0, p1);
       return this;
    }
    public n b(){
       this.u6();
       return this;
    }
    public int b5(){
       return this.b.b5();
    }
    public d b6(int p0,byte[] p1,int p2,int p3){
       this.b.b6(p0, p1, p2, p3);
       return this;
    }
    public ByteBuffer[] c5(){
       ByteBuffer[] uByteBufferA = this.b.c5();
       for (int i = 0; i < uByteBufferA.length; i = i + 1) {
          uByteBufferA[i] = uByteBufferA[i].order(this.c);
       }
       return uByteBufferA;
    }
    public d c6(int p0,int p1){
       this.m6(p0, p1);
       return this;
    }
    public int compareTo(Object p0){
       return this.l2(p0);
    }
    public n d(Object p0){
       this.v6(p0);
       return this;
    }
    public ByteBuffer[] d5(int p0,int p1){
       ByteBuffer[] uByteBufferA = this.b.d5(p0, p1);
       for (p1 = 0; p1 < uByteBufferA.length; p1++) {
          uByteBufferA[p1] = uByteBufferA[p1].order(this.c);
       }
       return uByteBufferA;
    }
    public d d6(int p0,double p1){
       this.i6(p0, Double.doubleToRawLongBits(p1));
       return this;
    }
    public d e5(ByteOrder p0){
       Objects.requireNonNull(p0, "endianness");
       if (p0 == this.c) {
          return this;
       }
       return this.b;
    }
    public d e6(int p0,float p1){
       this.g6(p0, Float.floatToRawIntBits(p1));
       return this;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 instanceof d) {
          return f.c(this, p0);
       }
       return false;
    }
    public ByteOrder f5(){
       return this.c;
    }
    public d f6(int p0,int p1){
       this.b.f6(p0, p1);
       return this;
    }
    public int g0(){
       return this.b.g0();
    }
    public boolean g5(){
       return this.b.g5();
    }
    public d g6(int p0,int p1){
       this.b.g6(p0, f.e(p1));
       return this;
    }
    public boolean getBoolean(int p0){
       return this.b.getBoolean(p0);
    }
    public double getDouble(int p0){
       return Double.longBitsToDouble(this.getLong(p0));
    }
    public float getFloat(int p0){
       return Float.intBitsToFloat(this.getInt(p0));
    }
    public int getInt(int p0){
       return f.e(this.b.getInt(p0));
    }
    public long getLong(int p0){
       return f.f(this.b.getLong(p0));
    }
    public int h4(int p0,int p1,a p2){
       return this.b.h4(p0, p1, p2);
    }
    public byte h5(){
       return this.b.h5();
    }
    public d h6(int p0,int p1){
       this.b.g6(p0, p1);
       return this;
    }
    public int hashCode(){
       return this.b.hashCode();
    }
    public int i5(GatheringByteChannel p0,int p1){
       return this.b.i5(p0, p1);
    }
    public d i6(int p0,long p1){
       this.b.i6(p0, f.f(p1));
       return this;
    }
    public d j5(int p0){
       return this.b.j5(p0).e5(this.f5());
    }
    public d j6(int p0,long p1){
       this.b.i6(p0, p1);
       return this;
    }
    public d k5(d p0){
       this.b.k5(p0);
       return this;
    }
    public d k6(int p0,int p1){
       this.b.k6(p0, f.g(p1));
       return this;
    }
    public n l(int p0){
       this.R5(p0);
       return this;
    }
    public int l2(d p0){
       return f.a(this, p0);
    }
    public int l4(a p0){
       return this.b.l4(p0);
    }
    public d l5(d p0,int p1){
       this.b.l5(p0, p1);
       return this;
    }
    public d l6(int p0,int p1){
       this.b.k6(p0, p1);
       return this;
    }
    public e m0(){
       return this.b.m0();
    }
    public d m3(){
       this.b.m3();
       return this;
    }
    public d m5(d p0,int p1,int p2){
       this.b.m5(p0, p1, p2);
       return this;
    }
    public d m6(int p0,int p1){
       this.b.m6(p0, f.h((short)p1));
       return this;
    }
    public int n1(int p0,byte p1){
       return this.b.n1(p0, p1);
    }
    public d n3(){
       return this.b.n3().e5(this.c);
    }
    public int n4(int p0,int p1,a p2){
       return this.b.n4(p0, p1, p2);
    }
    public d n5(OutputStream p0,int p1){
       this.b.n5(p0, p1);
       return this;
    }
    public d n6(int p0,int p1){
       this.b.m6(p0, (short)p1);
       return this;
    }
    public int o4(a p0){
       return this.b.o4(p0);
    }
    public d o5(ByteBuffer p0){
       this.b.o5(p0);
       return this;
    }
    public d o6(int p0,int p1){
       this.b.o6(p0, p1);
       return this;
    }
    public byte p4(int p0){
       return this.b.p4(p0);
    }
    public d p5(byte[] p0){
       this.b.p5(p0);
       return this;
    }
    public d p6(int p0){
       this.b.p6(p0);
       return this;
    }
    public d q2(){
       return this.b.q2().e5(this.c);
    }
    public int q4(int p0,GatheringByteChannel p1,int p2){
       return this.b.q4(p0, p1, p2);
    }
    public d q5(byte[] p0,int p1,int p2){
       this.b.q5(p0, p1, p2);
       return this;
    }
    public d q6(){
       return this.b.q6().e5(this.c);
    }
    public d r4(int p0,d p1){
       this.b.r4(p0, p1);
       return this;
    }
    public char r5(){
       return (char)this.A5();
    }
    public d r6(int p0,int p1){
       return this.b.r6(p0, p1).e5(this.c);
    }
    public boolean release(){
       return this.b.release();
    }
    public n retain(){
       this.Q5();
       return this;
    }
    public d s4(int p0,d p1,int p2){
       this.b.s4(p0, p1, p2);
       return this;
    }
    public double s5(){
       return Double.longBitsToDouble(this.w5());
    }
    public String s6(int p0,int p1,Charset p2){
       return this.b.s6(p0, p1, p2);
    }
    public d t4(int p0,d p1,int p2,int p3){
       this.b.t4(p0, p1, p2, p3);
       return this;
    }
    public float t5(){
       return Float.intBitsToFloat(this.u5());
    }
    public String t6(Charset p0){
       return this.b.t6(p0);
    }
    public String toString(){
       return "Swapped\("+this.b+')';
    }
    public boolean u(int p0){
       return this.b.u(p0);
    }
    public d u4(int p0,OutputStream p1,int p2){
       this.b.u4(p0, p1, p2);
       return this;
    }
    public int u5(){
       return f.e(this.b.u5());
    }
    public d u6(){
       this.b.u6();
       return this;
    }
    public d v4(int p0,ByteBuffer p1){
       this.b.v4(p0, p1);
       return this;
    }
    public int v5(){
       return this.b.u5();
    }
    public d v6(Object p0){
       this.b.v6(p0);
       return this;
    }
    public byte[] w0(){
       return this.b.w0();
    }
    public int w1(int p0,int p1,byte p2){
       return this.b.w1(p0, p1, p2);
    }
    public d w4(int p0,byte[] p1){
       this.b.w4(p0, p1);
       return this;
    }
    public long w5(){
       return f.f(this.b.w5());
    }
    public d w6(){
       return this.b.w6();
    }
    public d x4(int p0,byte[] p1,int p2,int p3){
       this.b.x4(p0, p1, p2, p3);
       return this;
    }
    public long x5(){
       return this.b.w5();
    }
    public int x6(){
       return this.b.x6();
    }
    public int y1(){
       return this.b.y1();
    }
    public int y3(int p0,boolean p1){
       return this.b.y3(p0, p1);
    }
    public char y4(int p0){
       return (char)this.D4(p0);
    }
    public int y5(){
       return f.g(this.b.y5());
    }
    public d y6(boolean p0){
       this.b.y6(p0);
       return this;
    }
    public int z4(int p0){
       return this.b.getInt(p0);
    }
    public int z5(){
       return this.b.y5();
    }
    public d z6(int p0){
       this.b.z6(p0);
       return this;
    }
}
