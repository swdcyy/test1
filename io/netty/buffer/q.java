package io.netty.buffer.q;
import kqd.c;
import kqd.e;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.netty.buffer.d;
import io.netty.buffer.a;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.System;
import java.nio.channels.GatheringByteChannel;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.io.InputStream;
import java.lang.StringBuilder;
import java.nio.channels.ScatteringByteChannel;
import kqd.i;
import java.lang.UnsupportedOperationException;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteOrder;
import java.io.OutputStream;
import java.lang.Math;

public class q extends c	// class@00106f
{
    public final e m;
    public byte[] n;
    public ByteBuffer o;

    public void q(e p0,int p1,int p2){
       byte[] uobyteArray = new byte[p1];
       super(p0, uobyteArray, 0, 0, p2);
    }
    public void q(e p0,byte[] p1,int p2,int p3,int p4){
       super(p4);
       Objects.requireNonNull(p0, "alloc");
       if (p1.length <= p4) {
          this.m = p0;
          this.G7(p1);
          this.f6(p2, p3);
          return;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p1.length),Integer.valueOf(p4)};
          throw new IllegalArgumentException(String.format("initialCapacity\(%d\) > maxCapacity\(%d\)", objArray));
       }
    }
    public void C7(){
       this.n = null;
    }
    public d D2(int p0,int p1){
       this.r7(p0, p1);
       byte[] uobyteArray = new byte[p1];
       System.arraycopy(this.n, p0, uobyteArray, 0, p1);
       q oq = new q(this.m0(), uobyteArray, 0, p1, this.W4());
       return p0;
    }
    public short D4(int p0){
       this.w7();
       return this.b7(p0);
    }
    public final int E7(int p0,GatheringByteChannel p1,int p2,boolean p3){
       this.w7();
       ByteBuffer uByteBuffer = (p3)? this.F7(): ByteBuffer.wrap(this.n);
       return p1.write(uByteBuffer.clear().position(p0).limit((p0 + p2)));
    }
    public final ByteBuffer F7(){
       q to = this.o;
       if (to == null) {
          to = ByteBuffer.wrap(this.n);
          this.o = to;
       }
       return to;
    }
    public final void G7(byte[] p0){
       this.n = p0;
       this.o = null;
    }
    public int I4(int p0){
       this.w7();
       return this.d7(p0);
    }
    public int L0(){
       return 0;
    }
    public boolean M4(){
       return true;
    }
    public boolean N4(){
       return false;
    }
    public ByteBuffer P4(int p0,int p1){
       this.r7(p0, p1);
       return this.F7().clear().position(p0).limit((p0 + p1));
    }
    public boolean Q4(){
       return false;
    }
    public d T5(int p0,int p1){
       this.w7();
       this.f7(p0, p1);
       return this;
    }
    public int U5(int p0,InputStream p1,int p2){
       this.w7();
       return p1.read(this.n, p0, p2);
    }
    public d V1(int p0){
       this.w7();
       if (p0 < 0 || p0 > this.W4()) {
          throw new IllegalArgumentException("newCapacity: "+p0);
       }
       q tn = this.n;
       int len = tn.length;
       if (p0 > len) {
          byte[] uobyteArray = new byte[p0];
          System.arraycopy(tn, 0, uobyteArray, 0, tn.length);
          this.G7(uobyteArray);
       }else if(p0 < len){
          byte[] uobyteArray1 = new byte[p0];
          len = this.M5();
          if (len < p0) {
             int i = this.U6();
             if (i > p0) {
                this.V6(p0);
             }else {
                p0 = i;
             }
             System.arraycopy(this.n, len, uobyteArray1, len, (p0 - len));
          }else {
             this.f6(p0, p0);
          }
          this.G7(uobyteArray1);
       }
       return this;
    }
    public int V5(int p0,ScatteringByteChannel p1,int p2){
       try{
          this.w7();
          return p1.read(this.F7().clear().position(p0).limit((p0 + p2)));
       }catch(java.nio.channels.ClosedChannelException e0){
          return -1;
       }
    }
    public byte W6(int p0){
       return i.a(this.n, p0);
    }
    public int X6(int p0){
       return i.b(this.n, p0);
    }
    public long Y4(){
       throw new UnsupportedOperationException();
    }
    public d Y5(int p0,d p1,int p2,int p3){
       this.v7(p0, p3, p2, p1.y1());
       if (p1.N4()) {
          PlatformDependent.b((p1.Y4() + (long)p2), this.n, p0, (long)p3);
       }else if(p1.M4()){
          this.b6(p0, p1.w0(), (p1.L0() + p2), p3);
       }else {
          p1.x4(p2, this.n, p0, p3);
       }
       return this;
    }
    public int Y6(int p0){
       return i.c(this.n, p0);
    }
    public d Z5(int p0,ByteBuffer p1){
       this.w7();
       p1.get(this.n, p0, p1.remaining());
       return this;
    }
    public long Z6(int p0){
       return i.d(this.n, p0);
    }
    public ByteBuffer a5(int p0,int p1){
       this.w7();
       return ByteBuffer.wrap(this.n, p0, p1).slice();
    }
    public long a7(int p0){
       return i.e(this.n, p0);
    }
    public int b5(){
       return 1;
    }
    public d b6(int p0,byte[] p1,int p2,int p3){
       this.v7(p0, p3, p2, p1.length);
       System.arraycopy(p1, p2, this.n, p0, p3);
       return this;
    }
    public short b7(int p0){
       return i.f(this.n, p0);
    }
    public short c7(int p0){
       return i.g(this.n, p0);
    }
    public ByteBuffer[] d5(int p0,int p1){
       ByteBuffer[] uByteBufferA = new ByteBuffer[]{this.a5(p0, p1)};
       return uByteBufferA;
    }
    public int d7(int p0){
       return i.h(this.n, p0);
    }
    public int e7(int p0){
       return i.i(this.n, p0);
    }
    public ByteOrder f5(){
       return ByteOrder.BIG_ENDIAN;
    }
    public void f7(int p0,int p1){
       i.j(this.n, p0, p1);
    }
    public d g6(int p0,int p1){
       this.w7();
       this.g7(p0, p1);
       return this;
    }
    public void g7(int p0,int p1){
       i.k(this.n, p0, p1);
    }
    public int getInt(int p0){
       this.w7();
       return this.X6(p0);
    }
    public long getLong(int p0){
       this.w7();
       return this.Z6(p0);
    }
    public void h7(int p0,int p1){
       i.l(this.n, p0, p1);
    }
    public int i5(GatheringByteChannel p0,int p1){
       this.t7(p1);
       int i = this.E7(this.b, p0, p1, true);
       this.b = this.b + i;
       return i;
    }
    public d i6(int p0,long p1){
       this.w7();
       this.i7(p0, p1);
       return this;
    }
    public void i7(int p0,long p1){
       i.m(this.n, p0, p1);
    }
    public void j7(int p0,long p1){
       i.n(this.n, p0, p1);
    }
    public d k6(int p0,int p1){
       this.w7();
       this.k7(p0, p1);
       return this;
    }
    public void k7(int p0,int p1){
       i.o(this.n, p0, p1);
    }
    public void l7(int p0,int p1){
       i.p(this.n, p0, p1);
    }
    public e m0(){
       return this.m;
    }
    public d m6(int p0,int p1){
       this.w7();
       this.m7(p0, p1);
       return this;
    }
    public void m7(int p0,int p1){
       i.q(this.n, p0, p1);
    }
    public void n7(int p0,int p1){
       i.r(this.n, p0, p1);
    }
    public byte p4(int p0){
       this.w7();
       return this.W6(p0);
    }
    public int q4(int p0,GatheringByteChannel p1,int p2){
       this.w7();
       return this.E7(p0, p1, p2, false);
    }
    public d t4(int p0,d p1,int p2,int p3){
       this.p7(p0, p3, p2, p1.y1());
       if (p1.N4()) {
          PlatformDependent.c(this.n, p0, (p1.Y4() + (long)p2), (long)p3);
       }else if(p1.M4()){
          this.x4(p0, p1.w0(), (p1.L0() + p2), p3);
       }else {
          p1.b6(p2, this.n, p0, p3);
       }
       return this;
    }
    public d u4(int p0,OutputStream p1,int p2){
       this.w7();
       p1.write(this.n, p0, p2);
       return this;
    }
    public d v4(int p0,ByteBuffer p1){
       this.w7();
       p1.put(this.n, p0, Math.min((this.y1() - p0), p1.remaining()));
       return this;
    }
    public byte[] w0(){
       this.w7();
       return this.n;
    }
    public d w6(){
       return null;
    }
    public d x4(int p0,byte[] p1,int p2,int p3){
       this.p7(p0, p3, p2, p1.length);
       System.arraycopy(this.n, p0, p1, p2, p3);
       return this;
    }
    public int y1(){
       this.w7();
       return this.n.length;
    }
}
