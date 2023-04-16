package io.netty.buffer.m;
import kqd.q;
import io.netty.buffer.m$a;
import io.netty.util.Recycler$e;
import io.netty.buffer.o;
import io.netty.util.internal.PlatformDependent;
import kqd.y;
import io.netty.buffer.a;
import io.netty.buffer.d;
import io.netty.buffer.s;
import kqd.k;
import io.netty.buffer.i;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.nio.channels.GatheringByteChannel;
import java.nio.Buffer;
import java.io.InputStream;
import java.nio.channels.ScatteringByteChannel;
import java.io.OutputStream;

public final class m extends q	// class@00106b
{
    public long w;
    public static final Recycler x;

    static {
       m.x = new m$a();
    }
    public void m(Recycler$e p0,int p1,m$a p2){
       super(p0, p1);
    }
    public o A7(){
       if (PlatformDependent.t()) {
          return new y(this);
       }
       return super.A7();
    }
    public d D2(int p0,int p1){
       return s.a(this, this.K7(p0), p0, p1);
    }
    public void F7(k p0,long p1,int p2,int p3,int p4,i p5){
       super.F7(p0, p1, p2, p3, p4, p5);
       this.M7();
    }
    public void G7(k p0,int p1){
       super.G7(p0, p1);
       this.M7();
    }
    public ByteBuffer I7(Object p0){
       return p0.duplicate();
    }
    public final long K7(int p0){
       return (this.w + (long)p0);
    }
    public int L0(){
       throw new UnsupportedOperationException("direct buffer");
    }
    public final int L7(int p0,GatheringByteChannel p1,int p2,boolean p3){
       this.r7(p0, p2);
       if (!p2) {
          return 0;
       }
       ByteBuffer uByteBuffer = (p3)? this.H7(): this.p.duplicate();
       p0 = this.E7(p0);
       Buffer uBuffer = uByteBuffer.clear().position(p0);
       uBuffer.limit((p0 + p2));
       return p1.write(uByteBuffer);
    }
    public boolean M4(){
       return false;
    }
    public final void M7(){
       this.w = PlatformDependent.d(this.p) + (long)this.q;
    }
    public boolean N4(){
       return true;
    }
    public ByteBuffer P4(int p0,int p1){
       this.r7(p0, p1);
       p0 = this.E7(p0);
       Buffer uBuffer = this.H7().clear().position(p0);
       return uBuffer.limit((p0 + p1));
    }
    public boolean Q4(){
       return true;
    }
    public int U5(int p0,InputStream p1,int p2){
       return s.v(this, this.K7(p0), p0, p1, p2);
    }
    public int V5(int p0,ScatteringByteChannel p1,int p2){
       this.r7(p0, p2);
       ByteBuffer uByteBuffer = this.H7();
       p0 = this.E7(p0);
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
       return s.b(this.K7(p0));
    }
    public int X6(int p0){
       return s.h(this.K7(p0));
    }
    public long Y4(){
       this.w7();
       return this.w;
    }
    public d Y5(int p0,d p1,int p2,int p3){
       s.w(this, this.K7(p0), p0, p1, p2, p3);
       return this;
    }
    public int Y6(int p0){
       return s.j(this.K7(p0));
    }
    public d Z5(int p0,ByteBuffer p1){
       s.x(this, this.K7(p0), p0, p1);
       return this;
    }
    public long Z6(int p0){
       return s.k(this.K7(p0));
    }
    public ByteBuffer a5(int p0,int p1){
       this.r7(p0, p1);
       p0 = this.E7(p0);
       Buffer uBuffer = this.p.duplicate().position(p0);
       return uBuffer.limit((p0 + p1)).slice();
    }
    public long a7(int p0){
       return s.m(this.K7(p0));
    }
    public int b5(){
       return 1;
    }
    public d b6(int p0,byte[] p1,int p2,int p3){
       s.y(this, this.K7(p0), p0, p1, p2, p3);
       return this;
    }
    public short b7(int p0){
       return s.n(this.K7(p0));
    }
    public short c7(int p0){
       return s.p(this.K7(p0));
    }
    public ByteBuffer[] d5(int p0,int p1){
       ByteBuffer[] uByteBufferA = new ByteBuffer[]{this.a5(p0, p1)};
       return uByteBufferA;
    }
    public int d7(int p0){
       return s.q(this.K7(p0));
    }
    public int e7(int p0){
       return s.s(this.K7(p0));
    }
    public void f7(int p0,int p1){
       s.t(this.K7(p0), (byte)p1);
    }
    public void g7(int p0,int p1){
       s.z(this.K7(p0), p1);
    }
    public void h7(int p0,int p1){
       s.B(this.K7(p0), p1);
    }
    public int i5(GatheringByteChannel p0,int p1){
       this.t7(p1);
       int i = this.L7(this.b, p0, p1, true);
       this.b = this.b + i;
       return i;
    }
    public void i7(int p0,long p1){
       s.C(this.K7(p0), p1);
    }
    public void j7(int p0,long p1){
       s.E(this.K7(p0), p1);
    }
    public void k7(int p0,int p1){
       s.F(this.K7(p0), p1);
    }
    public void l7(int p0,int p1){
       s.H(this.K7(p0), p1);
    }
    public void m7(int p0,int p1){
       s.I(this.K7(p0), p1);
    }
    public void n7(int p0,int p1){
       s.K(this.K7(p0), p1);
    }
    public d o5(ByteBuffer p0){
       int i = p0.remaining();
       this.t7(i);
       this.v4(this.b, p0);
       this.b = this.b + i;
       return this;
    }
    public int q4(int p0,GatheringByteChannel p1,int p2){
       return this.L7(p0, p1, p2, false);
    }
    public d t4(int p0,d p1,int p2,int p3){
       s.d(this, this.K7(p0), p0, p1, p2, p3);
       return this;
    }
    public d u4(int p0,OutputStream p1,int p2){
       s.e(this, this.K7(p0), p0, p1, p2);
       return this;
    }
    public d v4(int p0,ByteBuffer p1){
       s.f(this, this.K7(p0), p0, p1);
       return this;
    }
    public byte[] w0(){
       throw new UnsupportedOperationException("direct buffer");
    }
    public d x4(int p0,byte[] p1,int p2,int p3){
       s.g(this, this.K7(p0), p0, p1, p2, p3);
       return this;
    }
}
