package io.netty.buffer.b;
import io.netty.buffer.t;
import java.lang.Class;
import ard.b;
import ard.c;
import java.lang.String;
import zqd.x;
import java.lang.Boolean;
import java.lang.Object;
import io.netty.buffer.d;
import wqd.o;
import java.io.InputStream;
import java.nio.channels.ScatteringByteChannel;
import java.nio.ByteBuffer;
import wqd.n;
import java.nio.ByteOrder;
import io.netty.util.a;
import java.nio.channels.GatheringByteChannel;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class b extends t	// class@001043
{
    public final o c;
    public static final boolean d;
    public static final b e;

    static {
       boolean b;
       b uob = c.a(b.class);
       b.e = uob;
       b = x.c("io.netty.leakDetection.acquireAndReleaseOnly", false);
       b.d = b;
       if (uob.isDebugEnabled()) {
          uob.debug("-D{}: {}", "io.netty.leakDetection.acquireAndReleaseOnly", Boolean.valueOf(b));
       }
    }
    public void b(d p0,o p1){
       super(p0);
       this.c = p1;
    }
    public static void W6(o p0){
       if (!b.d) {
          p0.b();
       }
       return;
    }
    public long A4(int p0){
       b.W6(this.c);
       return super.A4(p0);
    }
    public short A5(){
       b.W6(this.c);
       return super.A5();
    }
    public int A6(InputStream p0,int p1){
       b.W6(this.c);
       return super.A6(p0, p1);
    }
    public int B4(int p0){
       b.W6(this.c);
       return super.B4(p0);
    }
    public short B5(){
       b.W6(this.c);
       return super.B5();
    }
    public int B6(ScatteringByteChannel p0,int p1){
       b.W6(this.c);
       return super.B6(p0, p1);
    }
    public d C3(int p0){
       b.W6(this.c);
       super.C3(p0);
       return this;
    }
    public int C4(int p0){
       b.W6(this.c);
       return super.C4(p0);
    }
    public d C5(int p0){
       b.W6(this.c);
       return new b(super.C5(p0), this.c);
    }
    public d C6(d p0){
       b.W6(this.c);
       super.C6(p0);
       return this;
    }
    public d D2(int p0,int p1){
       b.W6(this.c);
       return super.D2(p0, p1);
    }
    public short D4(int p0){
       b.W6(this.c);
       return super.D4(p0);
    }
    public short D5(){
       b.W6(this.c);
       return super.D5();
    }
    public d D6(d p0,int p1){
       b.W6(this.c);
       super.D6(p0, p1);
       return this;
    }
    public short E4(int p0){
       b.W6(this.c);
       return super.E4(p0);
    }
    public long E5(){
       b.W6(this.c);
       return super.E5();
    }
    public d E6(d p0,int p1,int p2){
       b.W6(this.c);
       super.E6(p0, p1, p2);
       return this;
    }
    public d F2(){
       b.W6(this.c);
       super.F2();
       return this;
    }
    public short F4(int p0){
       b.W6(this.c);
       return super.F4(p0);
    }
    public long F5(){
       b.W6(this.c);
       return super.F5();
    }
    public d F6(ByteBuffer p0){
       b.W6(this.c);
       super.F6(p0);
       return this;
    }
    public long G4(int p0){
       b.W6(this.c);
       return super.G4(p0);
    }
    public int G5(){
       b.W6(this.c);
       return super.G5();
    }
    public d G6(byte[] p0){
       b.W6(this.c);
       super.G6(p0);
       return this;
    }
    public long H4(int p0){
       b.W6(this.c);
       return super.H4(p0);
    }
    public int H5(){
       b.W6(this.c);
       return super.H5();
    }
    public d H6(byte[] p0,int p1,int p2){
       b.W6(this.c);
       super.H6(p0, p1, p2);
       return this;
    }
    public int I4(int p0){
       b.W6(this.c);
       return super.I4(p0);
    }
    public int I5(){
       b.W6(this.c);
       return super.I5();
    }
    public d I6(int p0){
       b.W6(this.c);
       super.I6(p0);
       return this;
    }
    public int J4(int p0){
       b.W6(this.c);
       return super.J4(p0);
    }
    public int J5(){
       b.W6(this.c);
       return super.J5();
    }
    public d J6(double p0){
       b.W6(this.c);
       super.J6(p0);
       return this;
    }
    public int K4(int p0){
       b.W6(this.c);
       return super.K4(p0);
    }
    public d K6(float p0){
       b.W6(this.c);
       super.K6(p0);
       return this;
    }
    public int L4(int p0){
       b.W6(this.c);
       return super.L4(p0);
    }
    public d L6(int p0){
       b.W6(this.c);
       super.L6(p0);
       return this;
    }
    public d M6(int p0){
       b.W6(this.c);
       super.M6(p0);
       return this;
    }
    public d N6(long p0){
       b.W6(this.c);
       super.N6(p0);
       return this;
    }
    public int O4(int p0,int p1,byte p2){
       b.W6(this.c);
       return super.O4(p0, p1, p2);
    }
    public d O6(long p0){
       b.W6(this.c);
       super.O6(p0);
       return this;
    }
    public ByteBuffer P4(int p0,int p1){
       b.W6(this.c);
       return super.P4(p0, p1);
    }
    public d P6(int p0){
       b.W6(this.c);
       super.P6(p0);
       return this;
    }
    public d Q5(){
       this.c.b();
       super.Q5();
       return this;
    }
    public d Q6(int p0){
       b.W6(this.c);
       super.Q6(p0);
       return this;
    }
    public d R5(int p0){
       this.c.b();
       super.R5(p0);
       return this;
    }
    public d R6(int p0){
       b.W6(this.c);
       super.R6(p0);
       return this;
    }
    public d S5(int p0,boolean p1){
       b.W6(this.c);
       super.S5(p0, p1);
       return this;
    }
    public d S6(int p0){
       b.W6(this.c);
       super.S6(p0);
       return this;
    }
    public d T5(int p0,int p1){
       b.W6(this.c);
       super.T5(p0, p1);
       return this;
    }
    public d T6(int p0){
       b.W6(this.c);
       super.T6(p0);
       return this;
    }
    public int U5(int p0,InputStream p1,int p2){
       b.W6(this.c);
       return super.U5(p0, p1, p2);
    }
    public d V1(int p0){
       b.W6(this.c);
       super.V1(p0);
       return this;
    }
    public int V5(int p0,ScatteringByteChannel p1,int p2){
       b.W6(this.c);
       return super.V5(p0, p1, p2);
    }
    public d W5(int p0,d p1){
       b.W6(this.c);
       super.W5(p0, p1);
       return this;
    }
    public int X0(byte p0){
       b.W6(this.c);
       return super.X0(p0);
    }
    public d X5(int p0,d p1,int p2){
       b.W6(this.c);
       super.X5(p0, p1, p2);
       return this;
    }
    public d Y5(int p0,d p1,int p2,int p3){
       b.W6(this.c);
       super.Y5(p0, p1, p2, p3);
       return this;
    }
    public ByteBuffer Z4(){
       b.W6(this.c);
       return super.Z4();
    }
    public d Z5(int p0,ByteBuffer p1){
       b.W6(this.c);
       super.Z5(p0, p1);
       return this;
    }
    public ByteBuffer a5(int p0,int p1){
       b.W6(this.c);
       return super.a5(p0, p1);
    }
    public d a6(int p0,byte[] p1){
       b.W6(this.c);
       super.a6(p0, p1);
       return this;
    }
    public n b(){
       this.u6();
       return this;
    }
    public int b5(){
       b.W6(this.c);
       return super.b5();
    }
    public d b6(int p0,byte[] p1,int p2,int p3){
       b.W6(this.c);
       super.b6(p0, p1, p2, p3);
       return this;
    }
    public ByteBuffer[] c5(){
       b.W6(this.c);
       return super.c5();
    }
    public d c6(int p0,int p1){
       b.W6(this.c);
       super.c6(p0, p1);
       return this;
    }
    public n d(Object p0){
       this.v6(p0);
       return this;
    }
    public ByteBuffer[] d5(int p0,int p1){
       b.W6(this.c);
       return super.d5(p0, p1);
    }
    public d d6(int p0,double p1){
       b.W6(this.c);
       super.d6(p0, p1);
       return this;
    }
    public d e5(ByteOrder p0){
       b.W6(this.c);
       if (this.f5() == p0) {
          return this;
       }
       return new b(super.e5(p0), this.c);
    }
    public d e6(int p0,float p1){
       b.W6(this.c);
       super.e6(p0, p1);
       return this;
    }
    public boolean g5(){
       b.W6(this.c);
       return super.g5();
    }
    public d g6(int p0,int p1){
       b.W6(this.c);
       super.g6(p0, p1);
       return this;
    }
    public boolean getBoolean(int p0){
       b.W6(this.c);
       return super.getBoolean(p0);
    }
    public double getDouble(int p0){
       b.W6(this.c);
       return super.getDouble(p0);
    }
    public float getFloat(int p0){
       b.W6(this.c);
       return super.getFloat(p0);
    }
    public int getInt(int p0){
       b.W6(this.c);
       return super.getInt(p0);
    }
    public long getLong(int p0){
       b.W6(this.c);
       return super.getLong(p0);
    }
    public int h4(int p0,int p1,a p2){
       b.W6(this.c);
       return super.h4(p0, p1, p2);
    }
    public byte h5(){
       b.W6(this.c);
       return super.h5();
    }
    public d h6(int p0,int p1){
       b.W6(this.c);
       super.h6(p0, p1);
       return this;
    }
    public int i5(GatheringByteChannel p0,int p1){
       b.W6(this.c);
       return super.i5(p0, p1);
    }
    public d i6(int p0,long p1){
       b.W6(this.c);
       super.i6(p0, p1);
       return this;
    }
    public d j5(int p0){
       b.W6(this.c);
       return super.j5(p0);
    }
    public d j6(int p0,long p1){
       b.W6(this.c);
       super.j6(p0, p1);
       return this;
    }
    public d k5(d p0){
       b.W6(this.c);
       super.k5(p0);
       return this;
    }
    public d k6(int p0,int p1){
       b.W6(this.c);
       super.k6(p0, p1);
       return this;
    }
    public n l(int p0){
       this.R5(p0);
       return this;
    }
    public int l4(a p0){
       b.W6(this.c);
       return super.l4(p0);
    }
    public d l5(d p0,int p1){
       b.W6(this.c);
       super.l5(p0, p1);
       return this;
    }
    public d l6(int p0,int p1){
       b.W6(this.c);
       super.l6(p0, p1);
       return this;
    }
    public d m3(){
       b.W6(this.c);
       super.m3();
       return this;
    }
    public d m5(d p0,int p1,int p2){
       b.W6(this.c);
       super.m5(p0, p1, p2);
       return this;
    }
    public d m6(int p0,int p1){
       b.W6(this.c);
       super.m6(p0, p1);
       return this;
    }
    public int n1(int p0,byte p1){
       b.W6(this.c);
       return super.n1(p0, p1);
    }
    public d n3(){
       b.W6(this.c);
       return new b(super.n3(), this.c);
    }
    public int n4(int p0,int p1,a p2){
       b.W6(this.c);
       return super.n4(p0, p1, p2);
    }
    public d n5(OutputStream p0,int p1){
       b.W6(this.c);
       super.n5(p0, p1);
       return this;
    }
    public d n6(int p0,int p1){
       b.W6(this.c);
       super.n6(p0, p1);
       return this;
    }
    public int o4(a p0){
       b.W6(this.c);
       return super.o4(p0);
    }
    public d o5(ByteBuffer p0){
       b.W6(this.c);
       super.o5(p0);
       return this;
    }
    public d o6(int p0,int p1){
       b.W6(this.c);
       super.o6(p0, p1);
       return this;
    }
    public byte p4(int p0){
       b.W6(this.c);
       return super.p4(p0);
    }
    public d p5(byte[] p0){
       b.W6(this.c);
       super.p5(p0);
       return this;
    }
    public d p6(int p0){
       b.W6(this.c);
       super.p6(p0);
       return this;
    }
    public d q2(){
       b.W6(this.c);
       return super.q2();
    }
    public int q4(int p0,GatheringByteChannel p1,int p2){
       b.W6(this.c);
       return super.q4(p0, p1, p2);
    }
    public d q5(byte[] p0,int p1,int p2){
       b.W6(this.c);
       super.q5(p0, p1, p2);
       return this;
    }
    public d q6(){
       b.W6(this.c);
       return new b(super.q6(), this.c);
    }
    public d r4(int p0,d p1){
       b.W6(this.c);
       super.r4(p0, p1);
       return this;
    }
    public char r5(){
       b.W6(this.c);
       return super.r5();
    }
    public d r6(int p0,int p1){
       b.W6(this.c);
       return new b(super.r6(p0, p1), this.c);
    }
    public boolean release(){
       boolean b = super.release();
       if (b) {
          this.c.close();
       }else {
          this.c.b();
       }
       return b;
    }
    public n retain(){
       this.Q5();
       return this;
    }
    public d s4(int p0,d p1,int p2){
       b.W6(this.c);
       super.s4(p0, p1, p2);
       return this;
    }
    public double s5(){
       b.W6(this.c);
       return super.s5();
    }
    public String s6(int p0,int p1,Charset p2){
       b.W6(this.c);
       return super.s6(p0, p1, p2);
    }
    public d t4(int p0,d p1,int p2,int p3){
       b.W6(this.c);
       super.t4(p0, p1, p2, p3);
       return this;
    }
    public float t5(){
       b.W6(this.c);
       return super.t5();
    }
    public String t6(Charset p0){
       b.W6(this.c);
       return super.t6(p0);
    }
    public boolean u(int p0){
       boolean b = super.u(p0);
       if (b) {
          this.c.close();
       }else {
          this.c.b();
       }
       return b;
    }
    public d u4(int p0,OutputStream p1,int p2){
       b.W6(this.c);
       super.u4(p0, p1, p2);
       return this;
    }
    public int u5(){
       b.W6(this.c);
       return super.u5();
    }
    public d u6(){
       this.c.b();
       return this;
    }
    public d v4(int p0,ByteBuffer p1){
       b.W6(this.c);
       super.v4(p0, p1);
       return this;
    }
    public int v5(){
       b.W6(this.c);
       return super.v5();
    }
    public d v6(Object p0){
       this.c.a(p0);
       return this;
    }
    public int w1(int p0,int p1,byte p2){
       b.W6(this.c);
       return super.w1(p0, p1, p2);
    }
    public d w4(int p0,byte[] p1){
       b.W6(this.c);
       super.w4(p0, p1);
       return this;
    }
    public long w5(){
       b.W6(this.c);
       return super.w5();
    }
    public d x4(int p0,byte[] p1,int p2,int p3){
       b.W6(this.c);
       super.x4(p0, p1, p2, p3);
       return this;
    }
    public long x5(){
       b.W6(this.c);
       return super.x5();
    }
    public int y3(int p0,boolean p1){
       b.W6(this.c);
       return super.y3(p0, p1);
    }
    public char y4(int p0){
       b.W6(this.c);
       return super.y4(p0);
    }
    public int y5(){
       b.W6(this.c);
       return super.y5();
    }
    public d y6(boolean p0){
       b.W6(this.c);
       super.y6(p0);
       return this;
    }
    public int z4(int p0){
       b.W6(this.c);
       return super.z4(p0);
    }
    public int z5(){
       b.W6(this.c);
       return super.z5();
    }
    public d z6(int p0){
       b.W6(this.c);
       super.z6(p0);
       return this;
    }
}
