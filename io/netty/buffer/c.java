package io.netty.buffer.c;
import io.netty.buffer.u;
import io.netty.buffer.g;
import wqd.o;
import io.netty.buffer.b;
import java.io.InputStream;
import java.nio.channels.ScatteringByteChannel;
import io.netty.buffer.d;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.io.OutputStream;
import wqd.n;
import java.nio.ByteOrder;
import io.netty.util.a;
import java.nio.channels.GatheringByteChannel;
import java.util.Iterator;
import java.nio.charset.Charset;
import java.lang.String;

public final class c extends u	// class@001044
{
    public final o v;

    public void c(g p0,o p1){
       super(p0);
       this.v = p1;
    }
    public long A4(int p0){
       b.W6(this.v);
       return super.A4(p0);
    }
    public short A5(){
       b.W6(this.v);
       return super.A5();
    }
    public int A6(InputStream p0,int p1){
       b.W6(this.v);
       return super.A6(p0, p1);
    }
    public g A8(int p0,int p1){
       b.W6(this.v);
       super.A8(p0, p1);
       return this;
    }
    public int B4(int p0){
       b.W6(this.v);
       return super.B4(p0);
    }
    public short B5(){
       b.W6(this.v);
       return super.B5();
    }
    public int B6(ScatteringByteChannel p0,int p1){
       b.W6(this.v);
       return super.B6(p0, p1);
    }
    public g B8(int p0){
       b.W6(this.v);
       super.B8(p0);
       return this;
    }
    public d C3(int p0){
       this.N7(p0);
       return this;
    }
    public int C4(int p0){
       b.W6(this.v);
       return super.C4(p0);
    }
    public d C5(int p0){
       b.W6(this.v);
       return new b(super.C5(p0), this.v);
    }
    public d C6(d p0){
       this.I8(p0);
       return this;
    }
    public d D2(int p0,int p1){
       b.W6(this.v);
       return super.D2(p0, p1);
    }
    public short D4(int p0){
       b.W6(this.v);
       return super.D4(p0);
    }
    public short D5(){
       b.W6(this.v);
       return super.D5();
    }
    public d D6(d p0,int p1){
       this.J8(p0, p1);
       return this;
    }
    public g D8(){
       this.v.b();
       return this;
    }
    public short E4(int p0){
       b.W6(this.v);
       return super.E4(p0);
    }
    public long E5(){
       b.W6(this.v);
       return super.E5();
    }
    public d E6(d p0,int p1,int p2){
       this.K8(p0, p1, p2);
       return this;
    }
    public g E7(d p0){
       b.W6(this.v);
       super.E7(p0);
       return this;
    }
    public g E8(Object p0){
       this.v.a(p0);
       return this;
    }
    public d F2(){
       this.K7();
       return this;
    }
    public short F4(int p0){
       b.W6(this.v);
       return super.F4(p0);
    }
    public long F5(){
       b.W6(this.v);
       return super.F5();
    }
    public d F6(ByteBuffer p0){
       this.L8(p0);
       return this;
    }
    public long G4(int p0){
       b.W6(this.v);
       return super.G4(p0);
    }
    public int G5(){
       b.W6(this.v);
       return super.G5();
    }
    public d G6(byte[] p0){
       this.M8(p0);
       return this;
    }
    public g G8(boolean p0){
       b.W6(this.v);
       super.G8(p0);
       return this;
    }
    public long H4(int p0){
       b.W6(this.v);
       return super.H4(p0);
    }
    public int H5(){
       b.W6(this.v);
       return super.H5();
    }
    public d H6(byte[] p0,int p1,int p2){
       this.N8(p0, p1, p2);
       return this;
    }
    public g H7(int p0){
       b.W6(this.v);
       super.H7(p0);
       return this;
    }
    public g H8(int p0){
       b.W6(this.v);
       super.H8(p0);
       return this;
    }
    public int I4(int p0){
       b.W6(this.v);
       return super.I4(p0);
    }
    public int I5(){
       b.W6(this.v);
       return super.I5();
    }
    public d I6(int p0){
       this.O8(p0);
       return this;
    }
    public g I8(d p0){
       b.W6(this.v);
       super.I8(p0);
       return this;
    }
    public int J4(int p0){
       b.W6(this.v);
       return super.J4(p0);
    }
    public int J5(){
       b.W6(this.v);
       return super.J5();
    }
    public d J6(double p0){
       this.P8(p0);
       return this;
    }
    public g J8(d p0,int p1){
       b.W6(this.v);
       super.J8(p0, p1);
       return this;
    }
    public int K4(int p0){
       b.W6(this.v);
       return super.K4(p0);
    }
    public d K6(float p0){
       this.Q8(p0);
       return this;
    }
    public g K7(){
       b.W6(this.v);
       super.K7();
       return this;
    }
    public g K8(d p0,int p1,int p2){
       b.W6(this.v);
       super.K8(p0, p1, p2);
       return this;
    }
    public int L4(int p0){
       b.W6(this.v);
       return super.L4(p0);
    }
    public d L6(int p0){
       this.R8(p0);
       return this;
    }
    public g L7(){
       b.W6(this.v);
       super.L7();
       return this;
    }
    public g L8(ByteBuffer p0){
       b.W6(this.v);
       super.L8(p0);
       return this;
    }
    public d M6(int p0){
       b.W6(this.v);
       return super.M6(p0);
    }
    public g M7(){
       b.W6(this.v);
       super.M7();
       return this;
    }
    public g M8(byte[] p0){
       b.W6(this.v);
       super.M8(p0);
       return this;
    }
    public d N6(long p0){
       this.S8(p0);
       return this;
    }
    public g N7(int p0){
       b.W6(this.v);
       super.N7(p0);
       return this;
    }
    public g N8(byte[] p0,int p1,int p2){
       b.W6(this.v);
       super.N8(p0, p1, p2);
       return this;
    }
    public int O4(int p0,int p1,byte p2){
       b.W6(this.v);
       return super.O4(p0, p1, p2);
    }
    public d O6(long p0){
       b.W6(this.v);
       return super.O6(p0);
    }
    public g O8(int p0){
       b.W6(this.v);
       super.O8(p0);
       return this;
    }
    public ByteBuffer P4(int p0,int p1){
       b.W6(this.v);
       return super.P4(p0, p1);
    }
    public d P6(int p0){
       this.T8(p0);
       return this;
    }
    public g P7(int p0,d p1){
       b.W6(this.v);
       super.P7(p0, p1);
       return this;
    }
    public g P8(double p0){
       b.W6(this.v);
       super.P8(p0);
       return this;
    }
    public d Q5(){
       this.i8();
       return this;
    }
    public d Q6(int p0){
       b.W6(this.v);
       return super.Q6(p0);
    }
    public g Q7(int p0,d p1,int p2){
       b.W6(this.v);
       super.Q7(p0, p1, p2);
       return this;
    }
    public g Q8(float p0){
       b.W6(this.v);
       super.Q8(p0);
       return this;
    }
    public d R5(int p0){
       this.j8(p0);
       return this;
    }
    public d R6(int p0){
       this.U8(p0);
       return this;
    }
    public g R7(int p0,d p1,int p2,int p3){
       b.W6(this.v);
       super.R7(p0, p1, p2, p3);
       return this;
    }
    public g R8(int p0){
       b.W6(this.v);
       super.R8(p0);
       return this;
    }
    public d S5(int p0,boolean p1){
       this.k8(p0, p1);
       return this;
    }
    public d S6(int p0){
       b.W6(this.v);
       return super.S6(p0);
    }
    public g S7(int p0,OutputStream p1,int p2){
       b.W6(this.v);
       super.S7(p0, p1, p2);
       return this;
    }
    public g S8(long p0){
       b.W6(this.v);
       super.S8(p0);
       return this;
    }
    public d T5(int p0,int p1){
       return this.l8(p0, p1);
    }
    public d T6(int p0){
       this.V8(p0);
       return this;
    }
    public g T7(int p0,ByteBuffer p1){
       b.W6(this.v);
       super.T7(p0, p1);
       return this;
    }
    public g T8(int p0){
       b.W6(this.v);
       super.T8(p0);
       return this;
    }
    public int U5(int p0,InputStream p1,int p2){
       b.W6(this.v);
       return super.U5(p0, p1, p2);
    }
    public g U7(int p0,byte[] p1){
       b.W6(this.v);
       super.U7(p0, p1);
       return this;
    }
    public g U8(int p0){
       b.W6(this.v);
       super.U8(p0);
       return this;
    }
    public d V1(int p0){
       this.H7(p0);
       return this;
    }
    public int V5(int p0,ScatteringByteChannel p1,int p2){
       b.W6(this.v);
       return super.V5(p0, p1, p2);
    }
    public g V7(int p0,byte[] p1,int p2,int p3){
       b.W6(this.v);
       super.V7(p0, p1, p2, p3);
       return this;
    }
    public g V8(int p0){
       b.W6(this.v);
       super.V8(p0);
       return this;
    }
    public d W5(int p0,d p1){
       this.m8(p0, p1);
       return this;
    }
    public int X0(byte p0){
       b.W6(this.v);
       return super.X0(p0);
    }
    public d X5(int p0,d p1,int p2){
       this.n8(p0, p1, p2);
       return this;
    }
    public d Y5(int p0,d p1,int p2,int p3){
       this.o8(p0, p1, p2, p3);
       return this;
    }
    public g Y7(d p0){
       b.W6(this.v);
       super.Y7(p0);
       return this;
    }
    public ByteBuffer Z4(){
       b.W6(this.v);
       return super.Z4();
    }
    public d Z5(int p0,ByteBuffer p1){
       this.p8(p0, p1);
       return this;
    }
    public g Z7(d p0,int p1){
       b.W6(this.v);
       super.Z7(p0, p1);
       return this;
    }
    public ByteBuffer a5(int p0,int p1){
       b.W6(this.v);
       return super.a5(p0, p1);
    }
    public d a6(int p0,byte[] p1){
       this.q8(p0, p1);
       return this;
    }
    public g a8(d p0,int p1,int p2){
       b.W6(this.v);
       super.a8(p0, p1, p2);
       return this;
    }
    public n b(){
       this.D8();
       return this;
    }
    public int b5(){
       b.W6(this.v);
       return super.b5();
    }
    public d b6(int p0,byte[] p1,int p2,int p3){
       this.r8(p0, p1, p2, p3);
       return this;
    }
    public g b8(OutputStream p0,int p1){
       b.W6(this.v);
       super.b8(p0, p1);
       return this;
    }
    public ByteBuffer[] c5(){
       b.W6(this.v);
       return super.c5();
    }
    public d c6(int p0,int p1){
       this.s8(p0, p1);
       return this;
    }
    public g c8(ByteBuffer p0){
       b.W6(this.v);
       super.c8(p0);
       return this;
    }
    public n d(Object p0){
       this.E8(p0);
       return this;
    }
    public ByteBuffer[] d5(int p0,int p1){
       b.W6(this.v);
       return super.d5(p0, p1);
    }
    public d d6(int p0,double p1){
       this.t8(p0, p1);
       return this;
    }
    public g d8(byte[] p0){
       b.W6(this.v);
       super.d8(p0);
       return this;
    }
    public d e5(ByteOrder p0){
       b.W6(this.v);
       if (this.f5() == p0) {
          return this;
       }
       return new b(super.e5(p0), this.v);
    }
    public d e6(int p0,float p1){
       this.u8(p0, p1);
       return this;
    }
    public g e8(byte[] p0,int p1,int p2){
       b.W6(this.v);
       super.e8(p0, p1, p2);
       return this;
    }
    public boolean g5(){
       b.W6(this.v);
       return super.g5();
    }
    public d g6(int p0,int p1){
       this.w8(p0, p1);
       return this;
    }
    public boolean getBoolean(int p0){
       b.W6(this.v);
       return super.getBoolean(p0);
    }
    public double getDouble(int p0){
       b.W6(this.v);
       return super.getDouble(p0);
    }
    public float getFloat(int p0){
       b.W6(this.v);
       return super.getFloat(p0);
    }
    public int getInt(int p0){
       b.W6(this.v);
       return super.getInt(p0);
    }
    public long getLong(int p0){
       b.W6(this.v);
       return super.getLong(p0);
    }
    public int h4(int p0,int p1,a p2){
       b.W6(this.v);
       return super.h4(p0, p1, p2);
    }
    public byte h5(){
       b.W6(this.v);
       return super.h5();
    }
    public d h6(int p0,int p1){
       b.W6(this.v);
       return super.h6(p0, p1);
    }
    public int i5(GatheringByteChannel p0,int p1){
       b.W6(this.v);
       return super.i5(p0, p1);
    }
    public d i6(int p0,long p1){
       this.x8(p0, p1);
       return this;
    }
    public g i8(){
       this.v.b();
       super.i8();
       return this;
    }
    public Iterator iterator(){
       b.W6(this.v);
       return super.iterator();
    }
    public d j5(int p0){
       b.W6(this.v);
       return super.j5(p0);
    }
    public d j6(int p0,long p1){
       b.W6(this.v);
       return super.j6(p0, p1);
    }
    public g j8(int p0){
       this.v.b();
       super.j8(p0);
       return this;
    }
    public d k5(d p0){
       this.Y7(p0);
       return this;
    }
    public d k6(int p0,int p1){
       this.y8(p0, p1);
       return this;
    }
    public g k8(int p0,boolean p1){
       b.W6(this.v);
       super.k8(p0, p1);
       return this;
    }
    public n l(int p0){
       this.j8(p0);
       return this;
    }
    public int l4(a p0){
       b.W6(this.v);
       return super.l4(p0);
    }
    public d l5(d p0,int p1){
       this.Z7(p0, p1);
       return this;
    }
    public d l6(int p0,int p1){
       b.W6(this.v);
       return super.l6(p0, p1);
    }
    public g l8(int p0,int p1){
       b.W6(this.v);
       super.l8(p0, p1);
       return this;
    }
    public d m3(){
       this.M7();
       return this;
    }
    public d m5(d p0,int p1,int p2){
       this.a8(p0, p1, p2);
       return this;
    }
    public d m6(int p0,int p1){
       this.z8(p0, p1);
       return this;
    }
    public g m8(int p0,d p1){
       b.W6(this.v);
       super.m8(p0, p1);
       return this;
    }
    public int n1(int p0,byte p1){
       b.W6(this.v);
       return super.n1(p0, p1);
    }
    public d n3(){
       b.W6(this.v);
       return new b(super.n3(), this.v);
    }
    public int n4(int p0,int p1,a p2){
       b.W6(this.v);
       return super.n4(p0, p1, p2);
    }
    public d n5(OutputStream p0,int p1){
       this.b8(p0, p1);
       return this;
    }
    public d n6(int p0,int p1){
       b.W6(this.v);
       return super.n6(p0, p1);
    }
    public g n8(int p0,d p1,int p2){
       b.W6(this.v);
       super.n8(p0, p1, p2);
       return this;
    }
    public int o4(a p0){
       b.W6(this.v);
       return super.o4(p0);
    }
    public d o5(ByteBuffer p0){
       this.c8(p0);
       return this;
    }
    public d o6(int p0,int p1){
       this.A8(p0, p1);
       return this;
    }
    public g o8(int p0,d p1,int p2,int p3){
       b.W6(this.v);
       super.o8(p0, p1, p2, p3);
       return this;
    }
    public byte p4(int p0){
       b.W6(this.v);
       return super.p4(p0);
    }
    public d p5(byte[] p0){
       this.d8(p0);
       return this;
    }
    public d p6(int p0){
       this.B8(p0);
       return this;
    }
    public g p8(int p0,ByteBuffer p1){
       b.W6(this.v);
       super.p8(p0, p1);
       return this;
    }
    public d q2(){
       b.W6(this.v);
       return super.q2();
    }
    public int q4(int p0,GatheringByteChannel p1,int p2){
       b.W6(this.v);
       return super.q4(p0, p1, p2);
    }
    public d q5(byte[] p0,int p1,int p2){
       this.e8(p0, p1, p2);
       return this;
    }
    public d q6(){
       b.W6(this.v);
       return new b(super.q6(), this.v);
    }
    public g q8(int p0,byte[] p1){
       b.W6(this.v);
       super.q8(p0, p1);
       return this;
    }
    public d r4(int p0,d p1){
       this.P7(p0, p1);
       return this;
    }
    public char r5(){
       b.W6(this.v);
       return super.r5();
    }
    public d r6(int p0,int p1){
       b.W6(this.v);
       return new b(super.r6(p0, p1), this.v);
    }
    public g r8(int p0,byte[] p1,int p2,int p3){
       b.W6(this.v);
       super.r8(p0, p1, p2, p3);
       return this;
    }
    public boolean release(){
       boolean b = super.release();
       if (b) {
          this.v.close();
       }else {
          this.v.b();
       }
       return b;
    }
    public n retain(){
       this.i8();
       return this;
    }
    public d s4(int p0,d p1,int p2){
       this.Q7(p0, p1, p2);
       return this;
    }
    public double s5(){
       b.W6(this.v);
       return super.s5();
    }
    public String s6(int p0,int p1,Charset p2){
       b.W6(this.v);
       return super.s6(p0, p1, p2);
    }
    public g s8(int p0,int p1){
       b.W6(this.v);
       super.s8(p0, p1);
       return this;
    }
    public d t4(int p0,d p1,int p2,int p3){
       this.R7(p0, p1, p2, p3);
       return this;
    }
    public float t5(){
       b.W6(this.v);
       return super.t5();
    }
    public String t6(Charset p0){
       b.W6(this.v);
       return super.t6(p0);
    }
    public g t8(int p0,double p1){
       b.W6(this.v);
       super.t8(p0, p1);
       return this;
    }
    public boolean u(int p0){
       boolean b = super.u(p0);
       if (b) {
          this.v.close();
       }else {
          this.v.b();
       }
       return b;
    }
    public d u4(int p0,OutputStream p1,int p2){
       this.S7(p0, p1, p2);
       return this;
    }
    public int u5(){
       b.W6(this.v);
       return super.u5();
    }
    public d u6(){
       this.D8();
       return this;
    }
    public g u8(int p0,float p1){
       b.W6(this.v);
       super.u8(p0, p1);
       return this;
    }
    public d v4(int p0,ByteBuffer p1){
       this.T7(p0, p1);
       return this;
    }
    public int v5(){
       b.W6(this.v);
       return super.v5();
    }
    public d v6(Object p0){
       this.E8(p0);
       return this;
    }
    public int w1(int p0,int p1,byte p2){
       b.W6(this.v);
       return super.w1(p0, p1, p2);
    }
    public d w4(int p0,byte[] p1){
       this.U7(p0, p1);
       return this;
    }
    public long w5(){
       b.W6(this.v);
       return super.w5();
    }
    public g w8(int p0,int p1){
       b.W6(this.v);
       super.w8(p0, p1);
       return this;
    }
    public d x4(int p0,byte[] p1,int p2,int p3){
       this.V7(p0, p1, p2, p3);
       return this;
    }
    public long x5(){
       b.W6(this.v);
       return super.x5();
    }
    public g x8(int p0,long p1){
       b.W6(this.v);
       super.x8(p0, p1);
       return this;
    }
    public int y3(int p0,boolean p1){
       b.W6(this.v);
       return super.y3(p0, p1);
    }
    public char y4(int p0){
       b.W6(this.v);
       return super.y4(p0);
    }
    public int y5(){
       b.W6(this.v);
       return super.y5();
    }
    public d y6(boolean p0){
       this.G8(p0);
       return this;
    }
    public g y8(int p0,int p1){
       b.W6(this.v);
       super.y8(p0, p1);
       return this;
    }
    public int z4(int p0){
       b.W6(this.v);
       return super.z4(p0);
    }
    public int z5(){
       b.W6(this.v);
       return super.z5();
    }
    public d z6(int p0){
       this.H8(p0);
       return this;
    }
    public g z8(int p0,int p1){
       b.W6(this.v);
       super.z8(p0, p1);
       return this;
    }
}
