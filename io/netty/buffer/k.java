package io.netty.buffer.k;
import kqd.q;
import io.netty.buffer.k$a;
import io.netty.util.Recycler$e;
import io.netty.buffer.d;
import io.netty.buffer.a;
import kqd.e;
import kqd.a;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.nio.Buffer;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.io.OutputStream;
import java.lang.Math;
import java.io.InputStream;
import java.nio.channels.ScatteringByteChannel;
import io.netty.buffer.f;

public final class k extends q	// class@001067
{
    public static final Recycler w;

    static {
       k.w = new k$a();
    }
    public void k(Recycler$e p0,int p1,k$a p2){
       super(p0, p1);
    }
    public d D2(int p0,int p1){
       this.r7(p0, p1);
       d uod = this.m0().h(p1, this.W4());
       uod.E6(this, p0, p1);
       return uod;
    }
    public ByteBuffer I7(Object p0){
       return p0.duplicate();
    }
    public final int K7(int p0,GatheringByteChannel p1,int p2,boolean p3){
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
    public int L0(){
       throw new UnsupportedOperationException("direct buffer");
    }
    public final void L7(int p0,OutputStream p1,int p2,boolean p3){
       this.r7(p0, p2);
       if (!p2) {
          return;
       }
       byte[] uobyteArray = new byte[p2];
       ByteBuffer uByteBuffer = (p3)? this.H7(): this.p.duplicate();
       uByteBuffer.clear().position(this.E7(p0));
       uByteBuffer.get(uobyteArray);
       p1.write(uobyteArray);
       return;
    }
    public boolean M4(){
       return false;
    }
    public final void M7(int p0,ByteBuffer p1,boolean p2){
       this.q7(p0);
       int i = Math.min((this.y1() - p0), p1.remaining());
       ByteBuffer uByteBuffer = (p2)? this.H7(): this.p.duplicate();
       p0 = this.E7(p0);
       Buffer uBuffer = uByteBuffer.clear().position(p0);
       uBuffer.limit((p0 + i));
       p1.put(uByteBuffer);
       return;
    }
    public boolean N4(){
       return false;
    }
    public final void N7(int p0,byte[] p1,int p2,int p3,boolean p4){
       this.p7(p0, p3, p2, p1.length);
       ByteBuffer uByteBuffer = (p4)? this.H7(): this.p.duplicate();
       p0 = this.E7(p0);
       Buffer uBuffer = uByteBuffer.clear().position(p0);
       uBuffer.limit((p0 + p3));
       uByteBuffer.get(p1, p2, p3);
       return;
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
       this.r7(p0, p2);
       byte[] uobyteArray = new byte[p2];
       int i = p1.read(uobyteArray);
       if (i <= 0) {
          return i;
       }
       ByteBuffer uByteBuffer = this.H7();
       uByteBuffer.clear().position(this.E7(p0));
       uByteBuffer.put(uobyteArray, 0, i);
       return i;
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
       return this.p.get(this.E7(p0));
    }
    public int X6(int p0){
       return this.p.getInt(this.E7(p0));
    }
    public long Y4(){
       throw new UnsupportedOperationException();
    }
    public d Y5(int p0,d p1,int p2,int p3){
       this.v7(p0, p3, p2, p1.y1());
       if (p1.M4()) {
          this.b6(p0, p1.w0(), (p1.L0() + p2), p3);
       }else if(p1.b5() > 0){
          ByteBuffer[] uByteBufferA = p1.d5(p2, p3);
          p2 = uByteBufferA.length;
          for (p3 = 0; p3 < p2; p3++) {
             object oobject = uByteBufferA[p3];
             this.Z5(p0, oobject);
             p0 = p0 + oobject.remaining();
          }
       }else {
          p1.t4(p2, this, p0, p3);
       }
       return this;
    }
    public int Y6(int p0){
       return f.e(this.X6(p0));
    }
    public d Z5(int p0,ByteBuffer p1){
       this.r7(p0, p1.remaining());
       ByteBuffer uByteBuffer = this.H7();
       if (p1 == uByteBuffer) {
          p1 = p1.duplicate();
       }
       p0 = this.E7(p0);
       Buffer uBuffer = uByteBuffer.clear().position(p0);
       uBuffer.limit((p0 + p1.remaining()));
       uByteBuffer.put(p1);
       return this;
    }
    public long Z6(int p0){
       return this.p.getLong(this.E7(p0));
    }
    public ByteBuffer a5(int p0,int p1){
       this.r7(p0, p1);
       p0 = this.E7(p0);
       Buffer uBuffer = this.p.duplicate().position(p0);
       return uBuffer.limit((p0 + p1)).slice();
    }
    public long a7(int p0){
       return f.f(this.Z6(p0));
    }
    public int b5(){
       return 1;
    }
    public d b6(int p0,byte[] p1,int p2,int p3){
       this.v7(p0, p3, p2, p1.length);
       ByteBuffer uByteBuffer = this.H7();
       p0 = this.E7(p0);
       Buffer uBuffer = uByteBuffer.clear().position(p0);
       uBuffer.limit((p0 + p3));
       uByteBuffer.put(p1, p2, p3);
       return this;
    }
    public short b7(int p0){
       return this.p.getShort(this.E7(p0));
    }
    public short c7(int p0){
       return f.h(this.b7(p0));
    }
    public ByteBuffer[] d5(int p0,int p1){
       ByteBuffer[] uByteBufferA = new ByteBuffer[]{this.a5(p0, p1)};
       return uByteBufferA;
    }
    public int d7(int p0){
       p0 = this.E7(p0);
       return ((this.p.get((p0 + 2)) & 0x00ff) | (((this.p.get(p0) & 0x00ff) << 16) | ((this.p.get((p0 + 1)) & 0x00ff) << 8)));
    }
    public int e7(int p0){
       p0 = this.E7(p0);
       return (((this.p.get((p0 + 2)) & 0x00ff) << 16) | ((this.p.get(p0) & 0x00ff) | ((this.p.get((p0 + 1)) & 0x00ff) << 8)));
    }
    public void f7(int p0,int p1){
       this.p.put(this.E7(p0), (byte)p1);
    }
    public void g7(int p0,int p1){
       this.p.putInt(this.E7(p0), p1);
    }
    public void h7(int p0,int p1){
       this.g7(p0, f.e(p1));
    }
    public int i5(GatheringByteChannel p0,int p1){
       this.t7(p1);
       int i = this.K7(this.b, p0, p1, true);
       this.b = this.b + i;
       return i;
    }
    public void i7(int p0,long p1){
       this.p.putLong(this.E7(p0), p1);
    }
    public void j7(int p0,long p1){
       this.i7(p0, f.f(p1));
    }
    public void k7(int p0,int p1){
       p0 = this.E7(p0);
       this.p.put(p0, (byte)(p1 >> 16));
       this.p.put((p0 + 1), (byte)(p1 >> 8));
       this.p.put((p0 + 2), (byte)p1);
    }
    public void l7(int p0,int p1){
       p0 = this.E7(p0);
       this.p.put(p0, (byte)p1);
       this.p.put((p0 + 1), (byte)(p1 >> 8));
       this.p.put((p0 + 2), (byte)(p1 >> 16));
    }
    public void m7(int p0,int p1){
       this.p.putShort(this.E7(p0), (short)p1);
    }
    public d n5(OutputStream p0,int p1){
       this.t7(p1);
       this.L7(this.b, p0, p1, true);
       this.b = this.b + p1;
       return this;
    }
    public void n7(int p0,int p1){
       this.m7(p0, f.h((short)p1));
    }
    public d o5(ByteBuffer p0){
       int i = p0.remaining();
       this.t7(i);
       this.M7(this.b, p0, true);
       this.b = this.b + i;
       return this;
    }
    public int q4(int p0,GatheringByteChannel p1,int p2){
       return this.K7(p0, p1, p2, false);
    }
    public d q5(byte[] p0,int p1,int p2){
       this.t7(p2);
       this.N7(this.b, p0, p1, p2, true);
       this.b = this.b + p2;
       return this;
    }
    public d t4(int p0,d p1,int p2,int p3){
       this.p7(p0, p3, p2, p1.y1());
       if (p1.M4()) {
          this.x4(p0, p1.w0(), (p1.L0() + p2), p3);
       }else if(p1.b5() > 0){
          ByteBuffer[] uByteBufferA = p1.d5(p2, p3);
          p2 = uByteBufferA.length;
          for (p3 = 0; p3 < p2; p3++) {
             object oobject = uByteBufferA[p3];
             this.v4(p0, oobject);
             p0 = p0 + oobject.remaining();
          }
       }else {
          p1.Y5(p2, this, p0, p3);
       }
       return this;
    }
    public d u4(int p0,OutputStream p1,int p2){
       this.L7(p0, p1, p2, false);
       return this;
    }
    public d v4(int p0,ByteBuffer p1){
       this.M7(p0, p1, false);
       return this;
    }
    public byte[] w0(){
       throw new UnsupportedOperationException("direct buffer");
    }
    public d x4(int p0,byte[] p1,int p2,int p3){
       this.N7(p0, p1, p2, p3, false);
       return this;
    }
}
