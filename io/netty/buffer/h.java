package io.netty.buffer.h;
import kqd.b;
import io.netty.buffer.d;
import io.netty.buffer.a;
import java.nio.ByteBuffer;
import java.io.InputStream;
import java.nio.channels.ScatteringByteChannel;
import java.nio.ByteOrder;
import io.netty.util.a;
import kqd.e;
import java.nio.channels.GatheringByteChannel;
import java.io.OutputStream;

public class h extends b	// class@00105b
{
    public final d k;

    public void h(d p0){
       super(p0.W4());
       this.k = (p0 instanceof h)? p0.k: p0;
       this.f6(p0.M5(), p0.U6());
       this.U4();
       this.V4();
       return;
    }
    public d D2(int p0,int p1){
       return this.k.D2(p0, p1);
    }
    public short D4(int p0){
       return this.k.D4(p0);
    }
    public int I4(int p0){
       return this.k.I4(p0);
    }
    public int L0(){
       return this.k.L0();
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
    public d T5(int p0,int p1){
       this.k.T5(p0, p1);
       return this;
    }
    public int U5(int p0,InputStream p1,int p2){
       return this.k.U5(p0, p1, p2);
    }
    public d V1(int p0){
       this.k.V1(p0);
       return this;
    }
    public int V5(int p0,ScatteringByteChannel p1,int p2){
       return this.k.V5(p0, p1, p2);
    }
    public byte W6(int p0){
       return this.k.p4(p0);
    }
    public int X6(int p0){
       return this.k.getInt(p0);
    }
    public long Y4(){
       return this.k.Y4();
    }
    public d Y5(int p0,d p1,int p2,int p3){
       this.k.Y5(p0, p1, p2, p3);
       return this;
    }
    public int Y6(int p0){
       return this.k.z4(p0);
    }
    public d Z5(int p0,ByteBuffer p1){
       this.k.Z5(p0, p1);
       return this;
    }
    public long Z6(int p0){
       return this.k.getLong(p0);
    }
    public long a7(int p0){
       return this.k.A4(p0);
    }
    public int b5(){
       return this.k.b5();
    }
    public d b6(int p0,byte[] p1,int p2,int p3){
       this.k.b6(p0, p1, p2, p3);
       return this;
    }
    public short b7(int p0){
       return this.k.D4(p0);
    }
    public short c7(int p0){
       return this.k.E4(p0);
    }
    public ByteBuffer[] d5(int p0,int p1){
       return this.k.d5(p0, p1);
    }
    public int d7(int p0){
       return this.k.I4(p0);
    }
    public int e7(int p0){
       return this.k.J4(p0);
    }
    public ByteOrder f5(){
       return this.k.f5();
    }
    public void f7(int p0,int p1){
       this.k.T5(p0, p1);
    }
    public d g6(int p0,int p1){
       this.k.g6(p0, p1);
       return this;
    }
    public void g7(int p0,int p1){
       this.k.g6(p0, p1);
    }
    public int getInt(int p0){
       return this.k.getInt(p0);
    }
    public long getLong(int p0){
       return this.k.getLong(p0);
    }
    public int h4(int p0,int p1,a p2){
       return this.k.h4(p0, p1, p2);
    }
    public void h7(int p0,int p1){
       this.k.h6(p0, p1);
    }
    public d i6(int p0,long p1){
       this.k.i6(p0, p1);
       return this;
    }
    public void i7(int p0,long p1){
       this.k.i6(p0, p1);
    }
    public void j7(int p0,long p1){
       this.k.j6(p0, p1);
    }
    public d k6(int p0,int p1){
       this.k.k6(p0, p1);
       return this;
    }
    public void k7(int p0,int p1){
       this.k.k6(p0, p1);
    }
    public void l7(int p0,int p1){
       this.k.l6(p0, p1);
    }
    public e m0(){
       return this.k.m0();
    }
    public d m6(int p0,int p1){
       this.k.m6(p0, p1);
       return this;
    }
    public void m7(int p0,int p1){
       this.k.m6(p0, p1);
    }
    public int n4(int p0,int p1,a p2){
       return this.k.n4(p0, p1, p2);
    }
    public void n7(int p0,int p1){
       this.k.n6(p0, p1);
    }
    public byte p4(int p0){
       return this.k.p4(p0);
    }
    public int q4(int p0,GatheringByteChannel p1,int p2){
       return this.k.q4(p0, p1, p2);
    }
    public d r6(int p0,int p1){
       return this.k.r6(p0, p1);
    }
    public d t4(int p0,d p1,int p2,int p3){
       this.k.t4(p0, p1, p2, p3);
       return this;
    }
    public d u4(int p0,OutputStream p1,int p2){
       this.k.u4(p0, p1, p2);
       return this;
    }
    public d v4(int p0,ByteBuffer p1){
       this.k.v4(p0, p1);
       return this;
    }
    public byte[] w0(){
       return this.k.w0();
    }
    public d w6(){
       return this.k;
    }
    public d x4(int p0,byte[] p1,int p2,int p3){
       this.k.x4(p0, p1, p2, p3);
       return this;
    }
    public int y1(){
       return this.k.y1();
    }
}
