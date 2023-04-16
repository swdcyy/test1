package io.netty.buffer.p;
import kqd.c;
import kqd.e;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.nio.ByteBuffer;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.StringBuilder;
import io.netty.buffer.d;
import io.netty.buffer.a;
import java.nio.Buffer;
import java.lang.IndexOutOfBoundsException;
import io.netty.util.internal.PlatformDependent;
import java.nio.channels.GatheringByteChannel;
import java.io.OutputStream;
import java.lang.Math;
import java.lang.UnsupportedOperationException;
import java.io.InputStream;
import java.nio.channels.ScatteringByteChannel;
import io.netty.buffer.f;
import java.nio.ByteOrder;

public class p extends c	// class@00106e
{
    public final e m;
    public ByteBuffer n;
    public ByteBuffer o;
    public int p;
    public boolean q;

    public void p(e p0,int p1,int p2){
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
          this.L7(ByteBuffer.allocateDirect(p1));
          return;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p1),Integer.valueOf(p2)};
          throw new IllegalArgumentException(String.format("initialCapacity\(%d\) > maxCapacity\(%d\)", objArray));
       }
    }
    public void C7(){
       p tn = this.n;
       if (tn == null) {
          return;
       }
       this.n = null;
       if (this.q == null) {
          this.F7(tn);
       }
       return;
    }
    public d D2(int p0,int p1){
       try{
          this.w7();
          return this.m0().h(p1, this.W4()).F6(this.n.duplicate().clear().position(p0).limit((p0 + p1)));
       }catch(java.lang.IllegalArgumentException e0){
          throw new IndexOutOfBoundsException("Too many bytes to read - Need "+(p0 + p1));
       }
    }
    public short D4(int p0){
       this.w7();
       return this.b7(p0);
    }
    public ByteBuffer E7(int p0){
       return ByteBuffer.allocateDirect(p0);
    }
    public void F7(ByteBuffer p0){
       PlatformDependent.f(p0);
    }
    public final int G7(int p0,GatheringByteChannel p1,int p2,boolean p3){
       this.w7();
       if (!p2) {
          return 0;
       }
       ByteBuffer uByteBuffer = (p3)? this.K7(): this.n.duplicate();
       uByteBuffer.clear().position(p0).limit((p0 + p2));
       return p1.write(uByteBuffer);
    }
    public final void H7(int p0,OutputStream p1,int p2,boolean p3){
       this.w7();
       if (!p2) {
          return;
       }
       if (this.n.hasArray()) {
          p1.write(this.n.array(), (p0 + this.n.arrayOffset()), p2);
       }else {
          byte[] uobyteArray = new byte[p2];
          ByteBuffer uByteBuffer = (p3)? this.K7(): this.n.duplicate();
          uByteBuffer.clear().position(p0);
          uByteBuffer.get(uobyteArray);
          p1.write(uobyteArray);
       }
       return;
    }
    public int I4(int p0){
       this.w7();
       return this.d7(p0);
    }
    public final void I7(int p0,ByteBuffer p1,boolean p2){
       this.q7(p0);
       Objects.requireNonNull(p1, "dst");
       int i = Math.min((this.y1() - p0), p1.remaining());
       ByteBuffer uByteBuffer = (p2)? this.K7(): this.n.duplicate();
       uByteBuffer.clear().position(p0).limit((p0 + i));
       p1.put(uByteBuffer);
       return;
    }
    public final void J7(int p0,byte[] p1,int p2,int p3,boolean p4){
       this.p7(p0, p3, p2, p1.length);
       ByteBuffer uByteBuffer = (p4)? this.K7(): this.n.duplicate();
       uByteBuffer.clear().position(p0).limit((p0 + p3));
       uByteBuffer.get(p1, p2, p3);
       return;
    }
    public final ByteBuffer K7(){
       p to = this.o;
       if (to == null) {
          to = this.n.duplicate();
          this.o = to;
       }
       return to;
    }
    public int L0(){
       throw new UnsupportedOperationException("direct buffer");
    }
    public final void L7(ByteBuffer p0){
       p tn = this.n;
       if (tn != null) {
          if (this.q != null) {
             this.q = false;
          }else {
             this.F7(tn);
          }
       }
       this.n = p0;
       this.o = null;
       this.p = p0.remaining();
       return;
    }
    public boolean M4(){
       return false;
    }
    public boolean N4(){
       return false;
    }
    public ByteBuffer P4(int p0,int p1){
       this.r7(p0, p1);
       return this.K7().clear().position(p0).limit((p0 + p1));
    }
    public boolean Q4(){
       return true;
    }
    public d T5(int p0,int p1){
       this.w7();
       this.f7(p0, p1);
       return this;
    }
    public int U5(int p0,InputStream p1,int p2){
       this.w7();
       if (this.n.hasArray()) {
          return p1.read(this.n.array(), (this.n.arrayOffset() + p0), p2);
       }
       byte[] uobyteArray = new byte[p2];
       int i = p1.read(uobyteArray);
       if (i <= 0) {
          return i;
       }
       ByteBuffer uByteBuffer = this.K7();
       uByteBuffer.clear().position(p0);
       uByteBuffer.put(uobyteArray, 0, i);
       return i;
    }
    public d V1(int p0){
       this.w7();
       if (p0 < 0 || p0 > this.W4()) {
          throw new IllegalArgumentException("newCapacity: "+p0);
       }
       int i = this.M5();
       int i1 = this.U6();
       p tp = this.p;
       if (p0 > tp) {
          p tn = this.n;
          ByteBuffer uByteBuffer = this.E7(p0);
          tn.position(0).limit(tn.capacity());
          uByteBuffer.position(0).limit(tn.capacity());
          uByteBuffer.put(tn);
          uByteBuffer.clear();
          this.L7(uByteBuffer);
       }else if(p0 < tp){
          tp = this.n;
          ByteBuffer uByteBuffer1 = this.E7(p0);
          if (i < p0) {
             if (i1 > p0) {
                this.V6(p0);
             }else {
                p0 = i1;
             }
             tp.position(i).limit(p0);
             uByteBuffer1.position(i).limit(p0);
             uByteBuffer1.put(tp);
             uByteBuffer1.clear();
          }else {
             this.f6(p0, p0);
          }
          this.L7(uByteBuffer1);
       }
       return this;
    }
    public int V5(int p0,ScatteringByteChannel p1,int p2){
       this.w7();
       Buffer uBuffer = this.K7().clear().position(p0);
       p0 = p0 + p2;
       try{
          uBuffer.limit(p0);
          return p1.read(this.o);
       }catch(java.nio.channels.ClosedChannelException e0){
          return -1;
       }
    }
    public byte W6(int p0){
       return this.n.get(p0);
    }
    public int X6(int p0){
       return this.n.getInt(p0);
    }
    public long Y4(){
       throw new UnsupportedOperationException();
    }
    public d Y5(int p0,d p1,int p2,int p3){
       this.v7(p0, p3, p2, p1.y1());
       if (p1.b5() > 0) {
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
       return f.e(this.n.getInt(p0));
    }
    public d Z5(int p0,ByteBuffer p1){
       this.w7();
       ByteBuffer uByteBuffer = this.K7();
       if (p1 == uByteBuffer) {
          p1 = p1.duplicate();
       }
       uByteBuffer.clear().position(p0).limit((p0 + p1.remaining()));
       uByteBuffer.put(p1);
       return this;
    }
    public long Z6(int p0){
       return this.n.getLong(p0);
    }
    public ByteBuffer a5(int p0,int p1){
       this.r7(p0, p1);
       return this.n.duplicate().position(p0).limit((p0 + p1)).slice();
    }
    public long a7(int p0){
       return f.f(this.n.getLong(p0));
    }
    public int b5(){
       return 1;
    }
    public d b6(int p0,byte[] p1,int p2,int p3){
       this.v7(p0, p3, p2, p1.length);
       ByteBuffer uByteBuffer = this.K7();
       uByteBuffer.clear().position(p0).limit((p0 + p3));
       uByteBuffer.put(p1, p2, p3);
       return this;
    }
    public short b7(int p0){
       return this.n.getShort(p0);
    }
    public short c7(int p0){
       return f.h(this.n.getShort(p0));
    }
    public ByteBuffer[] d5(int p0,int p1){
       ByteBuffer[] uByteBufferA = new ByteBuffer[]{this.a5(p0, p1)};
       return uByteBufferA;
    }
    public int d7(int p0){
       return ((this.p4((p0 + 2)) & 0x00ff) | (((this.p4(p0) & 0x00ff) << 16) | ((this.p4((p0 + 1)) & 0x00ff) << 8)));
    }
    public int e7(int p0){
       return (((this.p4((p0 + 2)) & 0x00ff) << 16) | ((this.p4(p0) & 0x00ff) | ((this.p4((p0 + 1)) & 0x00ff) << 8)));
    }
    public ByteOrder f5(){
       return ByteOrder.BIG_ENDIAN;
    }
    public void f7(int p0,int p1){
       this.n.put(p0, (byte)p1);
    }
    public d g6(int p0,int p1){
       this.w7();
       this.g7(p0, p1);
       return this;
    }
    public void g7(int p0,int p1){
       this.n.putInt(p0, p1);
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
       this.n.putInt(p0, f.e(p1));
    }
    public int i5(GatheringByteChannel p0,int p1){
       this.t7(p1);
       int i = this.G7(this.b, p0, p1, true);
       this.b = this.b + i;
       return i;
    }
    public d i6(int p0,long p1){
       this.w7();
       this.i7(p0, p1);
       return this;
    }
    public void i7(int p0,long p1){
       this.n.putLong(p0, p1);
    }
    public void j7(int p0,long p1){
       this.n.putLong(p0, f.f(p1));
    }
    public d k6(int p0,int p1){
       this.w7();
       this.k7(p0, p1);
       return this;
    }
    public void k7(int p0,int p1){
       this.T5(p0, (byte)(p1 >> 16));
       this.T5((p0 + 1), (byte)(p1 >> 8));
       this.T5((p0 + 2), (byte)p1);
    }
    public void l7(int p0,int p1){
       this.T5(p0, (byte)p1);
       this.T5((p0 + 1), (byte)(p1 >> 8));
       this.T5((p0 + 2), (byte)(p1 >> 16));
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
       this.n.putShort(p0, (short)p1);
    }
    public d n5(OutputStream p0,int p1){
       this.t7(p1);
       this.H7(this.b, p0, p1, true);
       this.b = this.b + p1;
       return this;
    }
    public void n7(int p0,int p1){
       this.n.putShort(p0, f.h((short)p1));
    }
    public d o5(ByteBuffer p0){
       int i = p0.remaining();
       this.t7(i);
       this.I7(this.b, p0, true);
       this.b = this.b + i;
       return this;
    }
    public byte p4(int p0){
       this.w7();
       return this.W6(p0);
    }
    public int q4(int p0,GatheringByteChannel p1,int p2){
       return this.G7(p0, p1, p2, false);
    }
    public d q5(byte[] p0,int p1,int p2){
       this.t7(p2);
       this.J7(this.b, p0, p1, p2, true);
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
       this.H7(p0, p1, p2, false);
       return this;
    }
    public d v4(int p0,ByteBuffer p1){
       this.I7(p0, p1, false);
       return this;
    }
    public byte[] w0(){
       throw new UnsupportedOperationException("direct buffer");
    }
    public d w6(){
       return null;
    }
    public d x4(int p0,byte[] p1,int p2,int p3){
       this.J7(p0, p1, p2, p3, false);
       return this;
    }
    public int y1(){
       return this.p;
    }
}
