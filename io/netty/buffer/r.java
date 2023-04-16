package io.netty.buffer.r;
import kqd.c;
import kqd.e;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.nio.ByteBuffer;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.StringBuilder;
import io.netty.buffer.o;
import io.netty.util.internal.PlatformDependent;
import kqd.y;
import io.netty.buffer.a;
import io.netty.buffer.d;
import io.netty.buffer.s;
import java.nio.channels.GatheringByteChannel;
import java.nio.Buffer;
import java.lang.UnsupportedOperationException;
import java.io.InputStream;
import java.nio.channels.ScatteringByteChannel;
import java.nio.ByteOrder;
import java.io.OutputStream;

public class r extends c	// class@001070
{
    public final e m;
    public long n;
    public ByteBuffer o;
    public ByteBuffer p;
    public int q;
    public boolean r;

    public void r(e p0,int p1,int p2){
       super(p2);
       Objects.requireNonNull(p0, "alloc");
       if (p1 < 0) {
          throw new IllegalArgumentException("initialCapacity: "+p1);
       }
       if (p2 < 0) {
          throw new IllegalArgumentException("maxCapacity: "+p2);
       }
       if (p1 <= p2) {
          this.m = p0;
          this.J7(this.F7(p1));
          return;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p1),Integer.valueOf(p2)};
          throw new IllegalArgumentException(String.format("initialCapacity\(%d\) > maxCapacity\(%d\)", objArray));
       }
    }
    public o A7(){
       if (PlatformDependent.t()) {
          return new y(this);
       }
       return super.A7();
    }
    public void C7(){
       r to = this.o;
       if (to == null) {
          return;
       }
       this.o = null;
       if (this.r == null) {
          this.G7(to);
       }
       return;
    }
    public d D2(int p0,int p1){
       return s.a(this, this.E7(p0), p0, p1);
    }
    public long E7(int p0){
       return (this.n + (long)p0);
    }
    public ByteBuffer F7(int p0){
       return ByteBuffer.allocateDirect(p0);
    }
    public void G7(ByteBuffer p0){
       PlatformDependent.f(p0);
    }
    public final int H7(int p0,GatheringByteChannel p1,int p2,boolean p3){
       this.w7();
       if (!p2) {
          return 0;
       }
       ByteBuffer uByteBuffer = (p3)? this.I7(): this.o.duplicate();
       uByteBuffer.clear().position(p0).limit((p0 + p2));
       return p1.write(uByteBuffer);
    }
    public final ByteBuffer I7(){
       r tp = this.p;
       if (tp == null) {
          tp = this.o.duplicate();
          this.p = tp;
       }
       return tp;
    }
    public final void J7(ByteBuffer p0){
       r to = this.o;
       if (to != null) {
          if (this.r != null) {
             this.r = false;
          }else {
             this.G7(to);
          }
       }
       this.o = p0;
       this.n = PlatformDependent.d(p0);
       this.p = null;
       this.q = p0.remaining();
       return;
    }
    public int L0(){
       throw new UnsupportedOperationException("direct buffer");
    }
    public boolean M4(){
       return false;
    }
    public boolean N4(){
       return true;
    }
    public ByteBuffer P4(int p0,int p1){
       this.r7(p0, p1);
       return this.I7().clear().position(p0).limit((p0 + p1));
    }
    public boolean Q4(){
       return true;
    }
    public int U5(int p0,InputStream p1,int p2){
       return s.v(this, this.E7(p0), p0, p1, p2);
    }
    public d V1(int p0){
       this.w7();
       if (p0 < 0 || p0 > this.W4()) {
          throw new IllegalArgumentException("newCapacity: "+p0);
       }
       int i = this.M5();
       int i1 = this.U6();
       r tq = this.q;
       if (p0 > tq) {
          r to = this.o;
          ByteBuffer uByteBuffer = this.F7(p0);
          to.position(0).limit(to.capacity());
          uByteBuffer.position(0).limit(to.capacity());
          uByteBuffer.put(to);
          uByteBuffer.clear();
          this.J7(uByteBuffer);
       }else if(p0 < tq){
          tq = this.o;
          ByteBuffer uByteBuffer1 = this.F7(p0);
          if (i < p0) {
             if (i1 > p0) {
                this.V6(p0);
             }else {
                p0 = i1;
             }
             tq.position(i).limit(p0);
             uByteBuffer1.position(i).limit(p0);
             uByteBuffer1.put(tq);
             uByteBuffer1.clear();
          }else {
             this.f6(p0, p0);
          }
          this.J7(uByteBuffer1);
       }
       return this;
    }
    public int V5(int p0,ScatteringByteChannel p1,int p2){
       this.w7();
       ByteBuffer uByteBuffer = this.I7();
       Buffer uBuffer = uByteBuffer.clear().position(p0);
       p0 = p0 + p2;
       try{
          uBuffer.limit(p0);
          return p1.read(uByteBuffer);
       }catch(java.nio.channels.ClosedChannelException e0){
          return -1;
       }
    }
    public byte W6(int p0){
       return s.b(this.E7(p0));
    }
    public int X6(int p0){
       return s.h(this.E7(p0));
    }
    public long Y4(){
       this.w7();
       return this.n;
    }
    public d Y5(int p0,d p1,int p2,int p3){
       s.w(this, this.E7(p0), p0, p1, p2, p3);
       return this;
    }
    public int Y6(int p0){
       return s.j(this.E7(p0));
    }
    public d Z5(int p0,ByteBuffer p1){
       s.x(this, this.E7(p0), p0, p1);
       return this;
    }
    public long Z6(int p0){
       return s.k(this.E7(p0));
    }
    public ByteBuffer a5(int p0,int p1){
       this.r7(p0, p1);
       return this.o.duplicate().position(p0).limit((p0 + p1)).slice();
    }
    public long a7(int p0){
       return s.m(this.E7(p0));
    }
    public int b5(){
       return 1;
    }
    public d b6(int p0,byte[] p1,int p2,int p3){
       s.y(this, this.E7(p0), p0, p1, p2, p3);
       return this;
    }
    public short b7(int p0){
       return s.n(this.E7(p0));
    }
    public short c7(int p0){
       return s.p(this.E7(p0));
    }
    public ByteBuffer[] d5(int p0,int p1){
       ByteBuffer[] uByteBufferA = new ByteBuffer[]{this.a5(p0, p1)};
       return uByteBufferA;
    }
    public int d7(int p0){
       return s.q(this.E7(p0));
    }
    public int e7(int p0){
       return s.s(this.E7(p0));
    }
    public ByteOrder f5(){
       return ByteOrder.BIG_ENDIAN;
    }
    public void f7(int p0,int p1){
       s.t(this.E7(p0), p1);
    }
    public void g7(int p0,int p1){
       s.z(this.E7(p0), p1);
    }
    public void h7(int p0,int p1){
       s.B(this.E7(p0), p1);
    }
    public int i5(GatheringByteChannel p0,int p1){
       this.t7(p1);
       int i = this.H7(this.b, p0, p1, true);
       this.b = this.b + i;
       return i;
    }
    public void i7(int p0,long p1){
       s.C(this.E7(p0), p1);
    }
    public void j7(int p0,long p1){
       s.E(this.E7(p0), p1);
    }
    public void k7(int p0,int p1){
       s.F(this.E7(p0), p1);
    }
    public void l7(int p0,int p1){
       s.H(this.E7(p0), p1);
    }
    public e m0(){
       return this.m;
    }
    public void m7(int p0,int p1){
       s.I(this.E7(p0), p1);
    }
    public void n7(int p0,int p1){
       s.K(this.E7(p0), p1);
    }
    public d o5(ByteBuffer p0){
       int i = p0.remaining();
       this.t7(i);
       this.v4(this.b, p0);
       this.b = this.b + i;
       return this;
    }
    public int q4(int p0,GatheringByteChannel p1,int p2){
       return this.H7(p0, p1, p2, false);
    }
    public d t4(int p0,d p1,int p2,int p3){
       s.d(this, this.E7(p0), p0, p1, p2, p3);
       return this;
    }
    public d u4(int p0,OutputStream p1,int p2){
       s.e(this, this.E7(p0), p0, p1, p2);
       return this;
    }
    public d v4(int p0,ByteBuffer p1){
       s.f(this, this.E7(p0), p0, p1);
       return this;
    }
    public byte[] w0(){
       throw new UnsupportedOperationException("direct buffer");
    }
    public d w6(){
       return null;
    }
    public d x4(int p0,byte[] p1,int p2,int p3){
       s.g(this, this.E7(p0), p0, p1, p2, p3);
       return this;
    }
    public int y1(){
       return this.q;
    }
}
