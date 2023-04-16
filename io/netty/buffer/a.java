package io.netty.buffer.a;
import io.netty.buffer.d;
import java.lang.Class;
import ard.b;
import ard.c;
import java.lang.String;
import zqd.x;
import java.lang.Boolean;
import java.lang.Object;
import io.netty.util.ResourceLeakDetector;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.io.InputStream;
import io.netty.buffer.o;
import java.nio.channels.ScatteringByteChannel;
import java.lang.Integer;
import java.lang.IndexOutOfBoundsException;
import java.nio.ByteBuffer;
import java.lang.Double;
import java.lang.Float;
import io.netty.buffer.f;
import java.lang.Math;
import io.netty.util.a$f;
import io.netty.util.a;
import java.util.Objects;
import wqd.n;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import kqd.v;
import kqd.e;
import kqd.g;
import java.io.OutputStream;
import zqd.f;
import kqd.u;
import java.nio.charset.Charset;
import wqd.g;
import zqd.d;
import zqd.z;
import java.util.IdentityHashMap;
import java.util.Map;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import io.netty.util.concurrent.e;
import java.nio.CharBuffer;
import java.nio.Buffer;
import zqd.w;
import io.netty.util.IllegalReferenceCountException;
import java.lang.Throwable;
import io.netty.util.internal.PlatformDependent;

public abstract class a extends d	// class@001042
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public o g;
    public static final b h;
    public static final boolean i;
    public static final ResourceLeakDetector j;

    static {
       b uob = c.a(a.class);
       a.h = uob;
       String str = "io.netty.buffer.bytebuf.checkAccessible";
       boolean b = x.c(str, true);
       a.i = b;
       if (uob.isDebugEnabled()) {
          uob.debug("-D{}: {}", str, Boolean.valueOf(b));
       }
       a.j = new ResourceLeakDetector(d.class);
    }
    public void a(int p0){
       super();
       if (p0 < 0) {
          throw new IllegalArgumentException("maxCapacity: "+p0+" \(expected: >= 0\)");
       }
       this.f = p0;
       return;
    }
    public long A4(int p0){
       this.r7(p0, 8);
       return this.a7(p0);
    }
    public short A5(){
       this.u7(2);
       this.b = this.b + 2;
       return this.b7(this.b);
    }
    public int A6(InputStream p0,int p1){
       this.w7();
       this.C3(p1);
       int i = this.U5(this.c, p0, p1);
       if (i > 0) {
          this.c = this.c + i;
       }
       return i;
    }
    public o A7(){
       return new o(this);
    }
    public int B4(int p0){
       p0 = this.I4(p0);
       if (Float.MIN_NORMAL & p0) {
          p0 = p0 | 0xff000000;
       }
       return p0;
    }
    public short B5(){
       this.u7(2);
       this.b = this.b + 2;
       return this.c7(this.b);
    }
    public int B6(ScatteringByteChannel p0,int p1){
       this.w7();
       this.C3(p1);
       int i = this.V5(this.c, p0, p1);
       if (i > 0) {
          this.c = this.c + i;
       }
       return i;
    }
    public final void B7(int p0,int p1){
       this.b = p0;
       this.c = p1;
    }
    public d C3(int p0){
       if (p0 >= 0) {
          this.x7(p0);
          return this;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0)};
          throw new IllegalArgumentException(String.format("minWritableBytes: %d \(expected: >= 0\)", objArray));
       }
    }
    public int C4(int p0){
       p0 = this.J4(p0);
       if (Float.MIN_NORMAL & p0) {
          p0 = p0 | 0xff000000;
       }
       return p0;
    }
    public d C5(int p0){
       this.b = this.b + p0;
       return this.r6(this.b, p0);
    }
    public d C6(d p0){
       this.D6(p0, p0.L5());
       return this;
    }
    public short D4(int p0){
       this.r7(p0, 2);
       return this.b7(p0);
    }
    public short D5(){
       return (short)(this.h5() & 0x00ff);
    }
    public d D6(d p0,int p1){
       if (p1 <= p0.L5()) {
          this.E6(p0, p0.M5(), p1);
          p0.N5((p0.M5() + p1));
          return this;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p1),Integer.valueOf(p0.L5()),p0};
          throw new IndexOutOfBoundsException(String.format("length\(%d\) exceeds src.readableBytes\(%d\) where src is: %s", objArray));
       }
    }
    public short E4(int p0){
       this.r7(p0, 2);
       return this.c7(p0);
    }
    public long E5(){
       return ((long)this.u5() & 0xffffffff);
    }
    public d E6(d p0,int p1,int p2){
       this.w7();
       this.C3(p2);
       this.Y5(this.c, p0, p1, p2);
       this.c = this.c + p2;
       return this;
    }
    public d F2(){
       this.w7();
       a tb = this.b;
       if (tb == null) {
          return this;
       }
       a tc = this.c;
       if (tb != tc) {
          this.Y5(0, this, tb, (tc - tb));
          tc = this.b;
          this.c = this.c - tc;
          this.o7(tc);
          this.b = 0;
       }else {
          this.o7(tb);
          this.b = 0;
          this.c = 0;
       }
       return this;
    }
    public short F4(int p0){
       return (short)(this.p4(p0) & 0x00ff);
    }
    public long F5(){
       return ((long)this.v5() & 0xffffffff);
    }
    public d F6(ByteBuffer p0){
       this.w7();
       int i = p0.remaining();
       this.C3(i);
       this.Z5(this.c, p0);
       this.c = this.c + i;
       return this;
    }
    public long G4(int p0){
       return ((long)this.getInt(p0) & 0xffffffff);
    }
    public int G5(){
       this.u7(3);
       this.b = this.b + 3;
       return this.d7(this.b);
    }
    public d G6(byte[] p0){
       this.H6(p0, 0, p0.length);
       return this;
    }
    public long H4(int p0){
       return ((long)this.z4(p0) & 0xffffffff);
    }
    public int H5(){
       this.u7(3);
       this.b = this.b + 3;
       return this.e7(this.b);
    }
    public d H6(byte[] p0,int p1,int p2){
       this.w7();
       this.C3(p2);
       this.b6(this.c, p0, p1, p2);
       this.c = this.c + p2;
       return this;
    }
    public int I4(int p0){
       this.r7(p0, 3);
       return this.d7(p0);
    }
    public int I5(){
       return (this.A5() & 0xffff);
    }
    public d I6(int p0){
       this.R6(p0);
       return this;
    }
    public int J4(int p0){
       this.r7(p0, 3);
       return this.e7(p0);
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
    public int L4(int p0){
       return (this.E4(p0) & 0xffff);
    }
    public int L5(){
       return (this.c - this.b);
    }
    public d L6(int p0){
       this.w7();
       this.x7(4);
       this.g7(this.c, p0);
       this.c = this.c + 4;
       return this;
    }
    public int M5(){
       return this.b;
    }
    public d M6(int p0){
       this.w7();
       this.x7(4);
       this.h7(this.c, p0);
       this.c = this.c + 4;
       return this;
    }
    public d N5(int p0){
       if (p0 >= 0 && p0 <= this.c) {
          this.b = p0;
          return this;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(this.c)};
          throw new IndexOutOfBoundsException(String.format("readerIndex: %d \(expected: 0 <= readerIndex <= writerIndex\(%d\)\)", objArray));
       }
    }
    public d N6(long p0){
       this.w7();
       this.x7(8);
       this.i7(this.c, p0);
       this.c = this.c + 8;
       return this;
    }
    public int O4(int p0,int p1,byte p2){
       int i = -1;
       if (p0 <= p1) {
          p0 = Math.max(p0, 0);
          if (p0 < p1 && this.y1()) {
             i = this.h4(p0, (p1 - p0), new a$f(p2));
          }
       }else {
          p0 = Math.min(p0, this.y1());
          if (p0 >= 0 && this.y1()) {
             i = this.n4(p1, (p0 - p1), new a$f(p2));
          }
       }
       return i;
    }
    public d O5(){
       this.N5(this.d);
       return this;
    }
    public d O6(long p0){
       this.w7();
       this.x7(8);
       this.j7(this.c, p0);
       this.c = this.c + 8;
       return this;
    }
    public d P5(){
       this.c = this.e;
       return this;
    }
    public d P6(int p0){
       this.w7();
       this.x7(3);
       this.k7(this.c, p0);
       this.c = this.c + 3;
       return this;
    }
    public d Q6(int p0){
       this.w7();
       this.x7(3);
       this.l7(this.c, p0);
       this.c = this.c + 3;
       return this;
    }
    public boolean R4(){
       boolean b = (this.c > this.b)? true: false;
       return b;
    }
    public d R6(int p0){
       this.w7();
       this.x7(2);
       this.m7(this.c, p0);
       this.c = this.c + 2;
       return this;
    }
    public boolean S4(int p0){
       boolean b = ((this.c - this.b) >= p0)? true: false;
       return b;
    }
    public d S5(int p0,boolean p1){
       this.T5(p0, p1);
       return this;
    }
    public d S6(int p0){
       this.w7();
       this.x7(2);
       this.n7(this.c, p0);
       this.c = this.c + 2;
       return this;
    }
    public boolean T4(int p0){
       boolean b = ((this.y1() - this.c) >= p0)? true: false;
       return b;
    }
    public d T5(int p0,int p1){
       this.q7(p0);
       this.f7(p0, p1);
       return this;
    }
    public d T6(int p0){
       if (!p0) {
          return this;
       }
       this.C3(p0);
       a tc = this.c;
       this.r7(tc, p0);
       int i = p0 >> 3;
       p0 = p0 & 0x07;
       while (i > 0) {
          this.i7(tc, 0);
          tc = tc + 8;
          i = i - 1;
       }
       if (p0 == 4) {
          this.g7(tc, 0);
          tc = tc + 4;
       }else if(p0 < 4){
          while (p0 > 0) {
             this.f7(tc, 0);
             tc = tc + 1;
             p0--;
          }
       }else {
          this.g7(tc, 0);
          tc = tc + 4;
          p0 = p0 - 4;
          while (p0 > 0) {
             this.f7(tc, 0);
             tc = tc + 1;
             p0--;
          }
       }
       this.c = tc;
       return this;
    }
    public d U4(){
       this.d = this.b;
       return this;
    }
    public int U6(){
       return this.c;
    }
    public boolean V2(){
       boolean b = (this.y1() > this.c)? true: false;
       return b;
    }
    public d V4(){
       this.e = this.c;
       return this;
    }
    public d V6(int p0){
       if (p0 >= this.b && p0 <= this.y1()) {
          this.c = p0;
          return this;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(this.b),Integer.valueOf(this.y1())};
          throw new IndexOutOfBoundsException(String.format("writerIndex: %d \(expected: readerIndex\(%d\) <= writerIndex <= capacity\(%d\)\)", objArray));
       }
    }
    public int W4(){
       return this.f;
    }
    public d W5(int p0,d p1){
       this.X5(p0, p1, p1.L5());
       return this;
    }
    public abstract byte W6(int p0);
    public int X0(byte p0){
       return this.w1(this.M5(), this.L5(), p0);
    }
    public int X4(){
       return (this.W4() - this.c);
    }
    public d X5(int p0,d p1,int p2){
       this.r7(p0, p2);
       Objects.requireNonNull(p1, "src");
       if (p2 <= p1.L5()) {
          this.Y5(p0, p1, p1.M5(), p2);
          p1.N5((p1.M5() + p2));
          return this;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p2),Integer.valueOf(p1.L5()),p1};
          throw new IndexOutOfBoundsException(String.format("length\(%d\) exceeds src.readableBytes\(%d\) where src is: %s", objArray));
       }
    }
    public abstract int X6(int p0);
    public d Y1(){
       this.c = 0;
       this.b = 0;
       return this;
    }
    public abstract int Y6(int p0);
    public ByteBuffer Z4(){
       return this.a5(this.b, this.L5());
    }
    public abstract long Z6(int p0);
    public d a6(int p0,byte[] p1){
       this.b6(p0, p1, 0, p1.length);
       return this;
    }
    public abstract long a7(int p0);
    public n b(){
       return this.u6();
    }
    public abstract short b7(int p0);
    public ByteBuffer[] c5(){
       return this.d5(this.b, this.L5());
    }
    public d c6(int p0,int p1){
       this.m6(p0, p1);
       return this;
    }
    public abstract short c7(int p0);
    public int compareTo(Object p0){
       return this.l2(p0);
    }
    public n d(Object p0){
       return this.v6(p0);
    }
    public d d6(int p0,double p1){
       this.i6(p0, Double.doubleToRawLongBits(p1));
       return this;
    }
    public abstract int d7(int p0);
    public d e5(ByteOrder p0){
       Objects.requireNonNull(p0, "endianness");
       if (p0 == this.f5()) {
          return this;
       }
       a tg = this.g;
       if (tg == null) {
          tg = this.A7();
          this.g = tg;
       }
       return tg;
    }
    public d e6(int p0,float p1){
       this.g6(p0, Float.floatToRawIntBits(p1));
       return this;
    }
    public abstract int e7(int p0);
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 instanceof d) {
          return f.c(this, p0);
       }
       return false;
    }
    public d f6(int p0,int p1){
       if (p0 >= 0 && (p0 <= p1 && p1 <= this.y1())) {
          this.B7(p0, p1);
          return this;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(this.y1())};
          throw new IndexOutOfBoundsException(String.format("readerIndex: %d, writerIndex: %d \(expected: 0 <= readerIndex <= writerIndex <= capacity\(%d\)\)", objArray));
       }
    }
    public abstract void f7(int p0,int p1);
    public boolean g5(){
       boolean b = (this.h5())? true: false;
       return b;
    }
    public d g6(int p0,int p1){
       this.r7(p0, 4);
       this.g7(p0, p1);
       return this;
    }
    public abstract void g7(int p0,int p1);
    public boolean getBoolean(int p0){
       boolean b = (this.p4(p0))? true: false;
       return b;
    }
    public double getDouble(int p0){
       return Double.longBitsToDouble(this.getLong(p0));
    }
    public float getFloat(int p0){
       return Float.intBitsToFloat(this.getInt(p0));
    }
    public int getInt(int p0){
       this.r7(p0, 4);
       return this.X6(p0);
    }
    public long getLong(int p0){
       this.r7(p0, 8);
       return this.Z6(p0);
    }
    public int h4(int p0,int p1,a p2){
       this.r7(p0, p1);
       return this.y7(p0, p1, p2);
    }
    public byte h5(){
       this.u7(1);
       a tb = this.b;
       byte b = this.W6(tb);
       this.b = tb + 1;
       return b;
    }
    public d h6(int p0,int p1){
       this.r7(p0, 4);
       this.h7(p0, p1);
       return this;
    }
    public abstract void h7(int p0,int p1);
    public int hashCode(){
       int i4;
       int i = this.L5();
       int i1 = i >> 2;
       i = i & 0x03;
       int i2 = this.M5();
       int i3 = 1;
       if (this.f5() == ByteOrder.BIG_ENDIAN) {
          i4 = 1;
          while (i1 > 0) {
             i4 = i4 * 31;
             i4 = i4 + this.getInt(i2);
             i2 = i2 + 4;
             i1 = i1 - 1;
          }
       }else {
          i4 = 1;
          while (i1 > 0) {
             i4 = i4 * 31;
             i4 = i4 + f.e(this.getInt(i2));
             i2 = i2 + 4;
             i1 = i1 - 1;
          }
       }
       while (i > 0) {
          i4 = i4 * 31;
          i1 = i2 + 1;
          i4 = i4 + this.p4(i2);
          i = i - 1;
          i2 = i1;
       }
       if (i4) {
          i3 = i4;
       }
       return i3;
    }
    public int i5(GatheringByteChannel p0,int p1){
       this.t7(p1);
       int i = this.q4(this.b, p0, p1);
       this.b = this.b + i;
       return i;
    }
    public d i6(int p0,long p1){
       this.r7(p0, 8);
       this.i7(p0, p1);
       return this;
    }
    public abstract void i7(int p0,long p1);
    public d j5(int p0){
       this.t7(p0);
       if (!p0) {
          return v.d;
       }
       d uod = v.a.f(p0, this.f);
       uod.E6(this, this.b, p0);
       this.b = this.b + p0;
       return uod;
    }
    public d j6(int p0,long p1){
       this.r7(p0, 8);
       this.j7(p0, p1);
       return this;
    }
    public abstract void j7(int p0,long p1);
    public d k5(d p0){
       this.l5(p0, p0.x6());
       return this;
    }
    public d k6(int p0,int p1){
       this.r7(p0, 3);
       this.k7(p0, p1);
       return this;
    }
    public abstract void k7(int p0,int p1);
    public n l(int p0){
       return this.R5(p0);
    }
    public int l2(d p0){
       return f.a(this, p0);
    }
    public int l4(a p0){
       a tb = this.b;
       this.w7();
       return this.y7(tb, (this.c - tb), p0);
    }
    public d l5(d p0,int p1){
       if (p1 <= p0.x6()) {
          this.m5(p0, p0.U6(), p1);
          p0.V6((p0.U6() + p1));
          return this;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p1),Integer.valueOf(p0.x6()),p0};
          throw new IndexOutOfBoundsException(String.format("length\(%d\) exceeds dst.writableBytes\(%d\) where dst is: %s", objArray));
       }
    }
    public d l6(int p0,int p1){
       this.r7(p0, 3);
       this.l7(p0, p1);
       return this;
    }
    public abstract void l7(int p0,int p1);
    public d m3(){
       this.w7();
       a tb = this.b;
       if (tb == null) {
          return this;
       }
       if (tb == this.c) {
          this.o7(tb);
          this.b = 0;
          this.c = 0;
          return this;
       }else if(tb >= (this.y1() >> 1)){
          tb = this.b;
          this.Y5(0, this, tb, (this.c - tb));
          a tb1 = this.b;
          this.c = this.c - tb1;
          this.o7(tb1);
          this.b = 0;
       }
       return this;
    }
    public d m5(d p0,int p1,int p2){
       this.t7(p2);
       this.t4(this.b, p0, p1, p2);
       this.b = this.b + p2;
       return this;
    }
    public d m6(int p0,int p1){
       this.r7(p0, 2);
       this.m7(p0, p1);
       return this;
    }
    public abstract void m7(int p0,int p1);
    public int n1(int p0,byte p1){
       this.t7(p0);
       return this.w1(this.M5(), p0, p1);
    }
    public d n3(){
       return new g(this);
    }
    public int n4(int p0,int p1,a p2){
       this.r7(p0, p1);
       return this.z7(p0, p1, p2);
    }
    public d n5(OutputStream p0,int p1){
       this.t7(p1);
       this.u4(this.b, p0, p1);
       this.b = this.b + p1;
       return this;
    }
    public d n6(int p0,int p1){
       this.r7(p0, 2);
       this.n7(p0, p1);
       return this;
    }
    public abstract void n7(int p0,int p1);
    public int o4(a p0){
       a tb = this.b;
       this.w7();
       return this.z7(tb, (this.c - tb), p0);
    }
    public d o5(ByteBuffer p0){
       int i = p0.remaining();
       this.t7(i);
       this.v4(this.b, p0);
       this.b = this.b + i;
       return this;
    }
    public d o6(int p0,int p1){
       if (!p1) {
          return this;
       }
       this.r7(p0, p1);
       int i = p1 >> 3;
       p1 = p1 & 0x07;
       while (i > 0) {
          this.i7(p0, 0);
          p0 = p0 + 8;
          i = i - 1;
       }
       if (p1 == 4) {
          this.g7(p0, 0);
       }else if(p1 < 4){
          while (p1 > 0) {
             this.f7(p0, 0);
             p0++;
             p1--;
          }
       }else {
          this.g7(p0, 0);
          p0 = p0 + 4;
          p1 = p1 - 4;
          while (p1 > 0) {
             this.f7(p0, 0);
             p0++;
             p1--;
          }
       }
       return this;
    }
    public final void o7(int p0){
       a td = this.d;
       if (td <= p0) {
          this.d = 0;
          a te = this.e;
          this.e = (te <= p0)? 0: te - p0;
       }else {
          this.d = td - p0;
          this.e = this.e - p0;
       }
       return;
    }
    public byte p4(int p0){
       this.q7(p0);
       return this.W6(p0);
    }
    public d p5(byte[] p0){
       this.q5(p0, 0, p0.length);
       return this;
    }
    public d p6(int p0){
       this.t7(p0);
       this.b = this.b + p0;
       return this;
    }
    public final void p7(int p0,int p1,int p2,int p3){
       this.r7(p0, p1);
       if (!f.b(p2, p1, p3)) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p2),Integer.valueOf(p1),Integer.valueOf(p3)};
       throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d \(expected: range\(0, %d\)\)", objArray));
    }
    public d q2(){
       return this.D2(this.b, this.L5());
    }
    public d q5(byte[] p0,int p1,int p2){
       this.t7(p2);
       this.x4(this.b, p0, p1, p2);
       this.b = this.b + p2;
       return this;
    }
    public d q6(){
       return this.r6(this.b, this.L5());
    }
    public final void q7(int p0){
       this.r7(p0, 1);
    }
    public d r4(int p0,d p1){
       this.s4(p0, p1, p1.x6());
       return this;
    }
    public char r5(){
       return (char)this.A5();
    }
    public d r6(int p0,int p1){
       return new u(this, p0, p1);
    }
    public final void r7(int p0,int p1){
       this.w7();
       this.s7(p0, p1);
    }
    public n retain(){
       return this.Q5();
    }
    public d s4(int p0,d p1,int p2){
       this.t4(p0, p1, p1.U6(), p2);
       p1.V6((p1.U6() + p2));
       return this;
    }
    public double s5(){
       return Double.longBitsToDouble(this.w5());
    }
    public String s6(int p0,int p1,Charset p2){
       String str;
       if (!p1) {
          str = "";
       }else {
          Objects.requireNonNull(p2, "charset");
          d uod = d.b();
          z k = uod.k;
          if (k == null) {
             k = new IdentityHashMap();
             uod.k = k;
          }
          CharsetDecoder uCharsetDeco = k.get(p2);
          if (uCharsetDeco != null) {
             uCharsetDeco.reset();
             uCharsetDeco.onMalformedInput(CodingErrorAction.REPLACE);
             uCharsetDeco.onUnmappableCharacter(CodingErrorAction.REPLACE);
          }else {
             uCharsetDeco = p2.newDecoder();
             uCharsetDeco.onMalformedInput(CodingErrorAction.REPLACE);
             uCharsetDeco.onUnmappableCharacter(CodingErrorAction.REPLACE);
             k.put(p2, uCharsetDeco);
          }
          int i = (int)((double)p1 * (double)uCharsetDeco.maxCharsPerByte());
          e b = f.b;
          CharBuffer uCharBuffer = b.b();
          if (uCharBuffer.length() < i) {
             uCharBuffer = CharBuffer.allocate(i);
             if (i <= f.c) {
                if (uCharBuffer != d.w) {
                   b.h(d.b(), uCharBuffer);
                }else {
                   b.f(d.c());
                }
             }
          }else {
             uCharBuffer.clear();
          }
          if (this.b5() == 1) {
             f.b(uCharsetDeco, this.P4(p0, p1), uCharBuffer);
          }else {
             d uod1 = this.m0().o(p1);
             uod1.E6(this, p0, p1);
             f.b(uCharsetDeco, uod1.P4(0, p1), uCharBuffer);
             uod1.release();
          }
          str = uCharBuffer.flip().toString();
       }
       return str;
    }
    public final void s7(int p0,int p1){
       if (!f.b(p0, p1, this.y1())) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(this.y1())};
       throw new IndexOutOfBoundsException(String.format("index: %d, length: %d \(expected: range\(0, %d\)\)", objArray));
    }
    public float t5(){
       return Float.intBitsToFloat(this.u5());
    }
    public String t6(Charset p0){
       return this.s6(this.b, this.L5(), p0);
    }
    public final void t7(int p0){
       if (p0 < 0) {
          throw new IllegalArgumentException("minimumReadableBytes: "+p0+" \(expected: >= 0\)");
       }
       this.u7(p0);
       return;
    }
    public String toString(){
       if (!this.g0()) {
          return w.b(this)+"\(freed\)";
       }
       StringBuilder str = w.b(this)+"\(ridx: "+this.b+", widx: "+this.c+", cap: "+this.y1();
       if (this.f != Integer.MAX_VALUE) {
          str = str+'/'+this.f;
       }
       d uod = this.w6();
       if (uod != null) {
          str = str+", unwrapped: "+uod;
       }
       return str+')';
    }
    public int u5(){
       this.u7(4);
       this.b = this.b + 4;
       return this.X6(this.b);
    }
    public final void u7(int p0){
       this.w7();
       if (this.b <= (this.c - p0)) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(this.b),Integer.valueOf(p0),Integer.valueOf(this.c),this};
       throw new IndexOutOfBoundsException(String.format("readerIndex\(%d\) + length\(%d\) exceeds writerIndex\(%d\): %s", objArray));
    }
    public int v5(){
       this.u7(4);
       this.b = this.b + 4;
       return this.Y6(this.b);
    }
    public final void v7(int p0,int p1,int p2,int p3){
       this.r7(p0, p1);
       if (!f.b(p2, p1, p3)) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p2),Integer.valueOf(p1),Integer.valueOf(p3)};
       throw new IndexOutOfBoundsException(String.format("srcIndex: %d, length: %d \(expected: range\(0, %d\)\)", objArray));
    }
    public int w1(int p0,int p1,byte p2){
       p1 = this.O4(p0, (p1 + p0), p2);
       if (p1 < 0) {
          return -1;
       }
       return (p1 - p0);
    }
    public d w4(int p0,byte[] p1){
       this.x4(p0, p1, 0, p1.length);
       return this;
    }
    public long w5(){
       this.u7(8);
       this.b = this.b + 8;
       return this.Z6(this.b);
    }
    public final void w7(){
       if (!a.i || this.g0()) {
          return;
       }
       throw new IllegalReferenceCountException(0);
    }
    public long x5(){
       this.u7(8);
       this.b = this.b + 8;
       return this.a7(this.b);
    }
    public int x6(){
       return (this.y1() - this.c);
    }
    public final void x7(int p0){
       if (p0 <= this.x6()) {
          return;
       }
       if (p0 <= (this.f - this.c)) {
          this.V1(this.m0().p((this.c + p0), this.f));
          return;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(this.c),Integer.valueOf(p0),Integer.valueOf(this.f),this};
          throw new IndexOutOfBoundsException(String.format("writerIndex\(%d\) + minWritableBytes\(%d\) exceeds maxCapacity\(%d\): %s", objArray));
       }
    }
    public int y3(int p0,boolean p1){
       int i = 0;
       int i1 = 1;
       if (p0 >= 0) {
          if (p0 <= this.x6()) {
             return i;
          }
          if (p0 > (this.f - this.c) && p1) {
             if (this.y1() == this.W4()) {
                return i1;
             }
             this.V1(this.W4());
             return 3;
          }else {
             this.V1(this.m0().p((this.c + p0), this.f));
             return 2;
          }
       }else {
          Object[] objArray = new Object[i1];
          objArray[i] = Integer.valueOf(p0);
          throw new IllegalArgumentException(String.format("minWritableBytes: %d \(expected: >= 0\)", objArray));
       }
    }
    public char y4(int p0){
       return (char)this.D4(p0);
    }
    public int y5(){
       int i = this.G5();
       if (Float.MIN_NORMAL & i) {
          i = i | 0xff000000;
       }
       return i;
    }
    public d y6(boolean p0){
       this.z6(p0);
       return this;
    }
    public final int y7(int p0,int p1,a p2){
       Objects.requireNonNull(p2, "processor");
       if (!p1) {
          return -1;
       }
       p1 = p1 + p0;
       try{
          while (true) {
             if (!p2.a(this.W6(p0))) {
                return p0;
             }
             p0++;
             if (p0 >= p1) {
                break ;
             }
          }
       }catch(java.lang.Exception e3){
          PlatformDependent.H(e3);
       }
       return -1;
    }
    public int z4(int p0){
       this.r7(p0, 4);
       return this.Y6(p0);
    }
    public int z5(){
       int i = this.H5();
       if (Float.MIN_NORMAL & i) {
          i = i | 0xff000000;
       }
       return i;
    }
    public d z6(int p0){
       this.w7();
       this.x7(1);
       a tc = this.c;
       this.c = tc + 1;
       this.f7(tc, p0);
       return this;
    }
    public final int z7(int p0,int p1,a p2){
       Objects.requireNonNull(p2, "processor");
       if (!p1) {
          return -1;
       }
       p1 = (p1 + p0) - 1;
       try{
          while (true) {
             if (!p2.a(this.W6(p1))) {
                return p1;
             }
             p1--;
             if (p1 < p0) {
                break ;
             }
          }
       }catch(java.lang.Exception e3){
          PlatformDependent.H(e3);
       }
       return -1;
    }
}
