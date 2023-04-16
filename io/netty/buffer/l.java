package io.netty.buffer.l;
import kqd.q;
import io.netty.buffer.l$a;
import io.netty.util.Recycler$e;
import io.netty.buffer.d;
import io.netty.buffer.a;
import kqd.e;
import kqd.a;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.nio.Buffer;
import java.io.InputStream;
import java.nio.channels.ScatteringByteChannel;
import kqd.i;
import java.lang.UnsupportedOperationException;
import io.netty.util.internal.PlatformDependent;
import java.lang.System;
import java.io.OutputStream;
import java.lang.Math;

public class l extends q	// class@001069
{
    public static final Recycler w;

    static {
       l.w = new l$a();
    }
    public void l(Recycler$e p0,int p1){
       super(p0, p1);
    }
    public final d D2(int p0,int p1){
       this.r7(p0, p1);
       d uod = this.m0().f(p1, this.W4());
       uod.H6(this.p, this.E7(p0), p1);
       return uod;
    }
    public ByteBuffer I7(Object p0){
       return ByteBuffer.wrap(p0);
    }
    public final int K7(int p0,GatheringByteChannel p1,int p2,boolean p3){
       this.r7(p0, p2);
       p0 = this.E7(p0);
       ByteBuffer uByteBuffer = (p3)? this.H7(): ByteBuffer.wrap(this.p);
       return p1.write(uByteBuffer.clear().position(p0).limit((p0 + p2)));
    }
    public final int L0(){
       return this.q;
    }
    public final boolean M4(){
       return true;
    }
    public final boolean N4(){
       return false;
    }
    public final ByteBuffer P4(int p0,int p1){
       this.r7(p0, p1);
       p0 = this.E7(p0);
       Buffer uBuffer = this.H7().clear().position(p0);
       return uBuffer.limit((p0 + p1));
    }
    public final boolean Q4(){
       return false;
    }
    public final int U5(int p0,InputStream p1,int p2){
       this.r7(p0, p2);
       return p1.read(this.p, this.E7(p0), p2);
    }
    public final int V5(int p0,ScatteringByteChannel p1,int p2){
       this.r7(p0, p2);
       p0 = this.E7(p0);
       try{
          return p1.read(this.H7().clear().position(p0).limit((p0 + p2)));
       }catch(java.nio.channels.ClosedChannelException e0){
          return -1;
       }
    }
    public byte W6(int p0){
       return i.a(this.p, this.E7(p0));
    }
    public int X6(int p0){
       return i.b(this.p, this.E7(p0));
    }
    public final long Y4(){
       throw new UnsupportedOperationException();
    }
    public final d Y5(int p0,d p1,int p2,int p3){
       this.v7(p0, p3, p2, p1.y1());
       if (p1.N4()) {
          PlatformDependent.b((p1.Y4() + (long)p2), this.p, this.E7(p0), (long)p3);
       }else if(p1.M4()){
          this.b6(p0, p1.w0(), (p1.L0() + p2), p3);
       }else {
          p1.x4(p2, this.p, this.E7(p0), p3);
       }
       return this;
    }
    public int Y6(int p0){
       return i.c(this.p, this.E7(p0));
    }
    public final d Z5(int p0,ByteBuffer p1){
       int i = p1.remaining();
       this.r7(p0, i);
       p1.get(this.p, this.E7(p0), i);
       return this;
    }
    public long Z6(int p0){
       return i.d(this.p, this.E7(p0));
    }
    public final ByteBuffer a5(int p0,int p1){
       this.r7(p0, p1);
       return ByteBuffer.wrap(this.p, this.E7(p0), p1).slice();
    }
    public long a7(int p0){
       return i.e(this.p, this.E7(p0));
    }
    public final int b5(){
       return 1;
    }
    public final d b6(int p0,byte[] p1,int p2,int p3){
       this.v7(p0, p3, p2, p1.length);
       System.arraycopy(p1, p2, this.p, this.E7(p0), p3);
       return this;
    }
    public short b7(int p0){
       return i.f(this.p, this.E7(p0));
    }
    public short c7(int p0){
       return i.g(this.p, this.E7(p0));
    }
    public final ByteBuffer[] d5(int p0,int p1){
       ByteBuffer[] uByteBufferA = new ByteBuffer[]{this.a5(p0, p1)};
       return uByteBufferA;
    }
    public int d7(int p0){
       return i.h(this.p, this.E7(p0));
    }
    public int e7(int p0){
       return i.i(this.p, this.E7(p0));
    }
    public void f7(int p0,int p1){
       i.j(this.p, this.E7(p0), p1);
    }
    public void g7(int p0,int p1){
       i.k(this.p, this.E7(p0), p1);
    }
    public void h7(int p0,int p1){
       i.l(this.p, this.E7(p0), p1);
    }
    public final int i5(GatheringByteChannel p0,int p1){
       this.t7(p1);
       int i = this.K7(this.b, p0, p1, true);
       this.b = this.b + i;
       return i;
    }
    public void i7(int p0,long p1){
       i.m(this.p, this.E7(p0), p1);
    }
    public void j7(int p0,long p1){
       i.n(this.p, this.E7(p0), p1);
    }
    public void k7(int p0,int p1){
       i.o(this.p, this.E7(p0), p1);
    }
    public void l7(int p0,int p1){
       i.p(this.p, this.E7(p0), p1);
    }
    public void m7(int p0,int p1){
       i.q(this.p, this.E7(p0), p1);
    }
    public void n7(int p0,int p1){
       i.r(this.p, this.E7(p0), p1);
    }
    public final int q4(int p0,GatheringByteChannel p1,int p2){
       return this.K7(p0, p1, p2, false);
    }
    public final d t4(int p0,d p1,int p2,int p3){
       this.p7(p0, p3, p2, p1.y1());
       if (p1.N4()) {
          PlatformDependent.c(this.p, this.E7(p0), ((long)p2 + p1.Y4()), (long)p3);
       }else if(p1.M4()){
          this.x4(p0, p1.w0(), (p1.L0() + p2), p3);
       }else {
          p1.b6(p2, this.p, this.E7(p0), p3);
       }
       return this;
    }
    public final d u4(int p0,OutputStream p1,int p2){
       this.r7(p0, p2);
       p1.write(this.p, this.E7(p0), p2);
       return this;
    }
    public final d v4(int p0,ByteBuffer p1){
       this.q7(p0);
       p1.put(this.p, this.E7(p0), Math.min((this.y1() - p0), p1.remaining()));
       return this;
    }
    public final byte[] w0(){
       this.w7();
       return this.p;
    }
    public final d x4(int p0,byte[] p1,int p2,int p3){
       this.p7(p0, p3, p2, p1.length);
       System.arraycopy(this.p, this.E7(p0), p1, p2, p3);
       return this;
    }
}
