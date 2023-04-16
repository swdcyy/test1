package kqd.h;
import io.netty.buffer.d;
import java.nio.ByteBuffer;
import io.netty.util.internal.PlatformDependent;
import kqd.e;
import java.nio.ByteOrder;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.StringBuilder;
import zqd.w;
import java.lang.IndexOutOfBoundsException;
import java.io.InputStream;
import java.nio.channels.ScatteringByteChannel;
import java.lang.IllegalArgumentException;
import java.nio.ReadOnlyBufferException;
import java.lang.UnsupportedOperationException;
import wqd.n;
import io.netty.util.a;
import java.nio.channels.GatheringByteChannel;
import java.io.OutputStream;
import java.nio.charset.Charset;
import zqd.b;

public final class h extends d	// class@001b58
{
    public final e b;
    public final ByteOrder c;
    public final String d;
    public h e;
    public static final ByteBuffer f;
    public static final long g;

    static {
       ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(0);
       h.f = uByteBuffer;
       long l = 0;
       if (PlatformDependent.q()) {
          l = PlatformDependent.d(uByteBuffer);
       }
       h.g = l;
    }
    public void h(e p0){
       super(p0, ByteOrder.BIG_ENDIAN);
    }
    public void h(e p0,ByteOrder p1){
       super();
       Objects.requireNonNull(p0, "alloc");
       this.b = p0;
       this.c = p1;
       StringBuilder str = w.b(this);
       String str1 = (p1 == ByteOrder.BIG_ENDIAN)? "BE": "LE";
       this.d = str+str1;
       return;
    }
    public long A4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public short A5(){
       throw new IndexOutOfBoundsException();
    }
    public int A6(InputStream p0,int p1){
       this.Y6(p1);
       return 0;
    }
    public int B4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public short B5(){
       throw new IndexOutOfBoundsException();
    }
    public int B6(ScatteringByteChannel p0,int p1){
       this.Y6(p1);
       return 0;
    }
    public d C3(int p0){
       if (p0 < 0) {
          throw new IllegalArgumentException("minWritableBytes: "+p0+" \(expected: >= 0\)");
       }
       if (!p0) {
          return this;
       }
       throw new IndexOutOfBoundsException();
    }
    public int C4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public d C5(int p0){
       this.Y6(p0);
       return this;
    }
    public d C6(d p0){
       throw new IndexOutOfBoundsException();
    }
    public d D2(int p0,int p1){
       this.X6(p0, p1);
       return this;
    }
    public short D4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public short D5(){
       throw new IndexOutOfBoundsException();
    }
    public d D6(d p0,int p1){
       this.Y6(p1);
       return this;
    }
    public short E4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public long E5(){
       throw new IndexOutOfBoundsException();
    }
    public d E6(d p0,int p1,int p2){
       this.Y6(p2);
       return this;
    }
    public d F2(){
       return this;
    }
    public short F4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public long F5(){
       throw new IndexOutOfBoundsException();
    }
    public d F6(ByteBuffer p0){
       this.Y6(p0.remaining());
       return this;
    }
    public long G4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public int G5(){
       throw new IndexOutOfBoundsException();
    }
    public d G6(byte[] p0){
       this.Y6(p0.length);
       return this;
    }
    public long H4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public int H5(){
       throw new IndexOutOfBoundsException();
    }
    public d H6(byte[] p0,int p1,int p2){
       this.Y6(p2);
       return this;
    }
    public int I4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public int I5(){
       throw new IndexOutOfBoundsException();
    }
    public d I6(int p0){
       throw new IndexOutOfBoundsException();
    }
    public int J4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public int J5(){
       throw new IndexOutOfBoundsException();
    }
    public d J6(double p0){
       throw new IndexOutOfBoundsException();
    }
    public int K4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public d K6(float p0){
       throw new IndexOutOfBoundsException();
    }
    public int L0(){
       return 0;
    }
    public int L4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public int L5(){
       return 0;
    }
    public d L6(int p0){
       throw new IndexOutOfBoundsException();
    }
    public boolean M4(){
       return true;
    }
    public int M5(){
       return 0;
    }
    public d M6(int p0){
       throw new IndexOutOfBoundsException();
    }
    public boolean N4(){
       boolean b = (h.g)? true: false;
       return b;
    }
    public d N5(int p0){
       this.W6(p0);
       return this;
    }
    public d N6(long p0){
       throw new IndexOutOfBoundsException();
    }
    public int O4(int p0,int p1,byte p2){
       this.W6(p0);
       this.W6(p1);
       return -1;
    }
    public d O5(){
       return this;
    }
    public d O6(long p0){
       throw new IndexOutOfBoundsException();
    }
    public ByteBuffer P4(int p0,int p1){
       return h.f;
    }
    public d P5(){
       return this;
    }
    public d P6(int p0){
       throw new IndexOutOfBoundsException();
    }
    public boolean Q4(){
       return true;
    }
    public d Q5(){
       return this;
    }
    public d Q6(int p0){
       throw new IndexOutOfBoundsException();
    }
    public boolean R4(){
       return false;
    }
    public d R5(int p0){
       return this;
    }
    public d R6(int p0){
       throw new IndexOutOfBoundsException();
    }
    public boolean S4(int p0){
       return false;
    }
    public d S5(int p0,boolean p1){
       throw new IndexOutOfBoundsException();
    }
    public d S6(int p0){
       throw new IndexOutOfBoundsException();
    }
    public boolean T4(int p0){
       return false;
    }
    public d T5(int p0,int p1){
       throw new IndexOutOfBoundsException();
    }
    public d T6(int p0){
       this.Y6(p0);
       return this;
    }
    public d U4(){
       return this;
    }
    public int U5(int p0,InputStream p1,int p2){
       this.X6(p0, p2);
       return 0;
    }
    public int U6(){
       return 0;
    }
    public d V1(int p0){
       throw new ReadOnlyBufferException();
    }
    public boolean V2(){
       return false;
    }
    public d V4(){
       return this;
    }
    public int V5(int p0,ScatteringByteChannel p1,int p2){
       this.X6(p0, p2);
       return 0;
    }
    public d V6(int p0){
       this.W6(p0);
       return this;
    }
    public int W4(){
       return 0;
    }
    public d W5(int p0,d p1){
       throw new IndexOutOfBoundsException();
    }
    public final d W6(int p0){
       if (!p0) {
          return this;
       }
       throw new IndexOutOfBoundsException();
    }
    public int X0(byte p0){
       return -1;
    }
    public int X4(){
       return 0;
    }
    public d X5(int p0,d p1,int p2){
       this.X6(p0, p2);
       return this;
    }
    public final d X6(int p0,int p1){
       if (p1 < 0) {
          throw new IllegalArgumentException("length: "+p1);
       }
       if (!p0 && !p1) {
          return this;
       }
       throw new IndexOutOfBoundsException();
    }
    public d Y1(){
       return this;
    }
    public long Y4(){
       if (this.N4()) {
          return h.g;
       }
       throw new UnsupportedOperationException();
    }
    public d Y5(int p0,d p1,int p2,int p3){
       this.X6(p0, p3);
       return this;
    }
    public final d Y6(int p0){
       if (p0 < 0) {
          throw new IllegalArgumentException("length: "+p0+" \(expected: >= 0\)");
       }
       if (!p0) {
          return this;
       }
       throw new IndexOutOfBoundsException();
    }
    public ByteBuffer Z4(){
       return h.f;
    }
    public d Z5(int p0,ByteBuffer p1){
       this.X6(p0, p1.remaining());
       return this;
    }
    public ByteBuffer a5(int p0,int p1){
       this.X6(p0, p1);
       return this.Z4();
    }
    public d a6(int p0,byte[] p1){
       this.X6(p0, p1.length);
       return this;
    }
    public n b(){
       return this;
    }
    public int b5(){
       return 1;
    }
    public d b6(int p0,byte[] p1,int p2,int p3){
       this.X6(p0, p3);
       return this;
    }
    public ByteBuffer[] c5(){
       ByteBuffer[] uByteBufferA = new ByteBuffer[]{h.f};
       return uByteBufferA;
    }
    public d c6(int p0,int p1){
       throw new IndexOutOfBoundsException();
    }
    public int compareTo(Object p0){
       return this.l2(p0);
    }
    public n d(Object p0){
       return this;
    }
    public ByteBuffer[] d5(int p0,int p1){
       this.X6(p0, p1);
       return this.c5();
    }
    public d d6(int p0,double p1){
       throw new IndexOutOfBoundsException();
    }
    public d e5(ByteOrder p0){
       Objects.requireNonNull(p0, "endianness");
       if (p0 == this.f5()) {
          return this;
       }
       h te = this.e;
       if (te != null) {
          return te;
       }
       te = new h(this.m0(), p0);
       this.e = te;
       return te;
    }
    public d e6(int p0,float p1){
       throw new IndexOutOfBoundsException();
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof d && !p0.R4())? true: false;
       return b;
    }
    public ByteOrder f5(){
       return this.c;
    }
    public d f6(int p0,int p1){
       this.W6(p0);
       this.W6(p1);
       return this;
    }
    public int g0(){
       return 1;
    }
    public boolean g5(){
       throw new IndexOutOfBoundsException();
    }
    public d g6(int p0,int p1){
       throw new IndexOutOfBoundsException();
    }
    public boolean getBoolean(int p0){
       throw new IndexOutOfBoundsException();
    }
    public double getDouble(int p0){
       throw new IndexOutOfBoundsException();
    }
    public float getFloat(int p0){
       throw new IndexOutOfBoundsException();
    }
    public int getInt(int p0){
       throw new IndexOutOfBoundsException();
    }
    public long getLong(int p0){
       throw new IndexOutOfBoundsException();
    }
    public int h4(int p0,int p1,a p2){
       this.X6(p0, p1);
       return -1;
    }
    public byte h5(){
       throw new IndexOutOfBoundsException();
    }
    public d h6(int p0,int p1){
       throw new IndexOutOfBoundsException();
    }
    public int hashCode(){
       return 0;
    }
    public int i5(GatheringByteChannel p0,int p1){
       this.Y6(p1);
       return 0;
    }
    public d i6(int p0,long p1){
       throw new IndexOutOfBoundsException();
    }
    public d j5(int p0){
       this.Y6(p0);
       return this;
    }
    public d j6(int p0,long p1){
       throw new IndexOutOfBoundsException();
    }
    public d k5(d p0){
       this.Y6(p0.x6());
       return this;
    }
    public d k6(int p0,int p1){
       throw new IndexOutOfBoundsException();
    }
    public n l(int p0){
       return this;
    }
    public int l2(d p0){
       int i = (p0.R4())? -1: 0;
       return i;
    }
    public int l4(a p0){
       return -1;
    }
    public d l5(d p0,int p1){
       this.Y6(p1);
       return this;
    }
    public d l6(int p0,int p1){
       throw new IndexOutOfBoundsException();
    }
    public e m0(){
       return this.b;
    }
    public d m3(){
       return this;
    }
    public d m5(d p0,int p1,int p2){
       this.Y6(p2);
       return this;
    }
    public d m6(int p0,int p1){
       throw new IndexOutOfBoundsException();
    }
    public int n1(int p0,byte p1){
       this.Y6(p0);
       return -1;
    }
    public d n3(){
       return this;
    }
    public int n4(int p0,int p1,a p2){
       this.X6(p0, p1);
       return -1;
    }
    public d n5(OutputStream p0,int p1){
       this.Y6(p1);
       return this;
    }
    public d n6(int p0,int p1){
       throw new IndexOutOfBoundsException();
    }
    public int o4(a p0){
       return -1;
    }
    public d o5(ByteBuffer p0){
       this.Y6(p0.remaining());
       return this;
    }
    public d o6(int p0,int p1){
       this.X6(p0, p1);
       return this;
    }
    public byte p4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public d p5(byte[] p0){
       this.Y6(p0.length);
       return this;
    }
    public d p6(int p0){
       this.Y6(p0);
       return this;
    }
    public d q2(){
       return this;
    }
    public int q4(int p0,GatheringByteChannel p1,int p2){
       this.X6(p0, p2);
       return 0;
    }
    public d q5(byte[] p0,int p1,int p2){
       this.Y6(p2);
       return this;
    }
    public d q6(){
       return this;
    }
    public d r4(int p0,d p1){
       this.X6(p0, p1.x6());
       return this;
    }
    public char r5(){
       throw new IndexOutOfBoundsException();
    }
    public d r6(int p0,int p1){
       this.X6(p0, p1);
       return this;
    }
    public boolean release(){
       return false;
    }
    public n retain(){
       return this;
    }
    public d s4(int p0,d p1,int p2){
       this.X6(p0, p2);
       return this;
    }
    public double s5(){
       throw new IndexOutOfBoundsException();
    }
    public String s6(int p0,int p1,Charset p2){
       this.X6(p0, p1);
       return "";
    }
    public d t4(int p0,d p1,int p2,int p3){
       this.X6(p0, p3);
       return this;
    }
    public float t5(){
       throw new IndexOutOfBoundsException();
    }
    public String t6(Charset p0){
       return "";
    }
    public String toString(){
       return this.d;
    }
    public boolean u(int p0){
       return false;
    }
    public d u4(int p0,OutputStream p1,int p2){
       this.X6(p0, p2);
       return this;
    }
    public int u5(){
       throw new IndexOutOfBoundsException();
    }
    public d u6(){
       return this;
    }
    public d v4(int p0,ByteBuffer p1){
       this.X6(p0, p1.remaining());
       return this;
    }
    public int v5(){
       throw new IndexOutOfBoundsException();
    }
    public d v6(Object p0){
       return this;
    }
    public byte[] w0(){
       return b.a;
    }
    public int w1(int p0,int p1,byte p2){
       this.X6(p0, p1);
       return -1;
    }
    public d w4(int p0,byte[] p1){
       this.X6(p0, p1.length);
       return this;
    }
    public long w5(){
       throw new IndexOutOfBoundsException();
    }
    public d w6(){
       return null;
    }
    public d x4(int p0,byte[] p1,int p2,int p3){
       this.X6(p0, p3);
       return this;
    }
    public long x5(){
       throw new IndexOutOfBoundsException();
    }
    public int x6(){
       return 0;
    }
    public int y1(){
       return 0;
    }
    public int y3(int p0,boolean p1){
       if (p0 < 0) {
          throw new IllegalArgumentException("minWritableBytes: "+p0+" \(expected: >= 0\)");
       }
       if (!p0) {
          return 0;
       }
       return 1;
    }
    public char y4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public int y5(){
       throw new IndexOutOfBoundsException();
    }
    public d y6(boolean p0){
       throw new IndexOutOfBoundsException();
    }
    public int z4(int p0){
       throw new IndexOutOfBoundsException();
    }
    public int z5(){
       throw new IndexOutOfBoundsException();
    }
    public d z6(int p0){
       throw new IndexOutOfBoundsException();
    }
}
