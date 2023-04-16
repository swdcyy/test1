package io.netty.buffer.n;
import kqd.b;
import io.netty.buffer.d;
import io.netty.buffer.h;
import io.netty.buffer.a;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.String;
import java.nio.ByteBuffer;
import java.io.InputStream;
import java.lang.UnsupportedOperationException;
import java.nio.channels.ScatteringByteChannel;
import java.nio.ByteOrder;
import io.netty.util.a;
import kqd.e;
import java.nio.channels.GatheringByteChannel;
import java.io.OutputStream;

public class n extends b	// class@00106c
{
    public final d k;
    public final int l;
    public final int m;

    public void n(d p0,int p1,int p2){
       super(p2);
       if (p1 < 0 || p1 > (p0.y1() - p2)) {
          throw new IndexOutOfBoundsException(p0+".slice\("+p1+", "+p2+')');
       }
       if (p0 instanceof n) {
          this.k = p0.k;
          this.l = p0.l + p1;
       }else if(p0 instanceof h){
          this.k = p0.w6();
          this.l = p1;
       }else {
          this.k = p0;
          this.l = p1;
       }
       this.m = p2;
       this.V6(p2);
       return;
    }
    public final int C7(int p0){
       return (p0 + this.l);
    }
    public d D2(int p0,int p1){
       this.s7(p0, p1);
       return this.k.D2(this.C7(p0), p1);
    }
    public int L0(){
       return this.C7(this.k.L0());
    }
    public boolean M4(){
       return this.k.M4();
    }
    public boolean N4(){
       return this.k.N4();
    }
    public ByteBuffer P4(int p0,int p1){
       return this.a5(p0, p1);
    }
    public boolean Q4(){
       return this.k.Q4();
    }
    public int U5(int p0,InputStream p1,int p2){
       this.s7(p0, p2);
       return this.k.U5(this.C7(p0), p1, p2);
    }
    public d V1(int p0){
       throw new UnsupportedOperationException("sliced buffer");
    }
    public int V5(int p0,ScatteringByteChannel p1,int p2){
       this.s7(p0, p2);
       return this.k.V5(this.C7(p0), p1, p2);
    }
    public byte W6(int p0){
       return this.k.p4(this.C7(p0));
    }
    public int X6(int p0){
       return this.k.getInt(this.C7(p0));
    }
    public long Y4(){
       return (this.k.Y4() + (long)this.l);
    }
    public d Y5(int p0,d p1,int p2,int p3){
       this.s7(p0, p3);
       this.k.Y5(this.C7(p0), p1, p2, p3);
       return this;
    }
    public int Y6(int p0){
       return this.k.z4(this.C7(p0));
    }
    public d Z5(int p0,ByteBuffer p1){
       this.s7(p0, p1.remaining());
       this.k.Z5(this.C7(p0), p1);
       return this;
    }
    public long Z6(int p0){
       return this.k.getLong(this.C7(p0));
    }
    public ByteBuffer a5(int p0,int p1){
       this.s7(p0, p1);
       return this.k.a5(this.C7(p0), p1);
    }
    public long a7(int p0){
       return this.k.A4(this.C7(p0));
    }
    public int b5(){
       return this.k.b5();
    }
    public d b6(int p0,byte[] p1,int p2,int p3){
       this.s7(p0, p3);
       this.k.b6(this.C7(p0), p1, p2, p3);
       return this;
    }
    public short b7(int p0){
       return this.k.D4(this.C7(p0));
    }
    public short c7(int p0){
       return this.k.E4(this.C7(p0));
    }
    public ByteBuffer[] d5(int p0,int p1){
       this.s7(p0, p1);
       return this.k.d5(this.C7(p0), p1);
    }
    public int d7(int p0){
       return this.k.I4(this.C7(p0));
    }
    public int e7(int p0){
       return this.k.J4(this.C7(p0));
    }
    public ByteOrder f5(){
       return this.k.f5();
    }
    public void f7(int p0,int p1){
       this.k.T5(this.C7(p0), p1);
    }
    public void g7(int p0,int p1){
       this.k.g6(this.C7(p0), p1);
    }
    public int h4(int p0,int p1,a p2){
       this.s7(p0, p1);
       p0 = this.k.h4(this.C7(p0), p1, p2);
       n tl = this.l;
       if (p0 >= tl) {
          return (p0 - tl);
       }
       return -1;
    }
    public void h7(int p0,int p1){
       this.k.h6(this.C7(p0), p1);
    }
    public void i7(int p0,long p1){
       this.k.i6(this.C7(p0), p1);
    }
    public void j7(int p0,long p1){
       this.k.j6(this.C7(p0), p1);
    }
    public void k7(int p0,int p1){
       this.k.k6(this.C7(p0), p1);
    }
    public void l7(int p0,int p1){
       this.k.l6(this.C7(p0), p1);
    }
    public e m0(){
       return this.k.m0();
    }
    public void m7(int p0,int p1){
       this.k.m6(this.C7(p0), p1);
    }
    public d n3(){
       d uod = this.k.r6(this.l, this.m);
       uod.f6(this.M5(), this.U6());
       return uod;
    }
    public int n4(int p0,int p1,a p2){
       this.s7(p0, p1);
       p0 = this.k.n4(this.C7(p0), p1, p2);
       n tl = this.l;
       if (p0 >= tl) {
          return (p0 - tl);
       }
       return -1;
    }
    public void n7(int p0,int p1){
       this.k.n6(this.C7(p0), p1);
    }
    public int q4(int p0,GatheringByteChannel p1,int p2){
       this.s7(p0, p2);
       return this.k.q4(this.C7(p0), p1, p2);
    }
    public d r6(int p0,int p1){
       this.s7(p0, p1);
       return this.k.r6(this.C7(p0), p1);
    }
    public d t4(int p0,d p1,int p2,int p3){
       this.s7(p0, p3);
       this.k.t4(this.C7(p0), p1, p2, p3);
       return this;
    }
    public d u4(int p0,OutputStream p1,int p2){
       this.s7(p0, p2);
       this.k.u4(this.C7(p0), p1, p2);
       return this;
    }
    public d v4(int p0,ByteBuffer p1){
       this.s7(p0, p1.remaining());
       this.k.v4(this.C7(p0), p1);
       return this;
    }
    public byte[] w0(){
       return this.k.w0();
    }
    public d w6(){
       return this.k;
    }
    public d x4(int p0,byte[] p1,int p2,int p3){
       this.s7(p0, p3);
       this.k.x4(this.C7(p0), p1, p2, p3);
       return this;
    }
    public int y1(){
       return this.m;
    }
}
