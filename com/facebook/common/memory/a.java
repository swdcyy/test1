package com.facebook.common.memory.a;
import java.io.InputStream;
import fb.c;
import java.lang.Object;
import ab.e;
import java.io.IOException;
import java.lang.String;
import cb.a;
import java.lang.Math;
import java.lang.System;

public class a extends InputStream	// class@001062
{
    public final InputStream b;
    public final byte[] c;
    public final c d;
    public int e;
    public int f;
    public boolean g;

    public void a(InputStream p0,byte[] p1,c p2){
       super();
       e.d(p0);
       this.b = p0;
       e.d(p1);
       this.c = p1;
       e.d(p2);
       this.d = p2;
       this.e = 0;
       this.f = 0;
       this.g = false;
    }
    public final boolean a(){
       if (this.f < this.e) {
          return true;
       }
       int i = this.b.read(this.c);
       if (i <= 0) {
          return false;
       }
       this.e = i;
       this.f = 0;
       return true;
    }
    public int available(){
       boolean b = (this.f <= this.e)? true: false;
       e.f(b);
       this.c();
       return ((this.e - this.f) + this.b.available());
    }
    public final void c(){
       if (this.g == null) {
          return;
       }
       throw new IOException("stream already closed");
    }
    public void close(){
       if (this.g == null) {
          this.g = true;
          this.d.a(this.c);
          super.close();
       }
       return;
    }
    public void finalize(){
       if (this.g == null) {
          a.g("PooledByteInputStream", "Finalized without closing");
          this.close();
       }
       super.finalize();
       return;
    }
    public int read(){
       boolean b = (this.f <= this.e)? true: false;
       e.f(b);
       this.c();
       if (!this.a()) {
          return -1;
       }else {
          a tf = this.f;
          this.f = tf + 1;
          return (this.c[tf] & 0x00ff);
       }
    }
    public int read(byte[] p0,int p1,int p2){
       boolean b = (this.f <= this.e)? true: false;
       e.f(b);
       this.c();
       if (!this.a()) {
          return -1;
       }else {
          p2 = Math.min((this.e - this.f), p2);
          System.arraycopy(this.c, this.f, p0, p1, p2);
          this.f = this.f + p2;
          return p2;
       }
    }
    public long skip(long p0){
       boolean b = (this.f <= this.e)? true: false;
       e.f(b);
       this.c();
       a te = this.e;
       a tf = this.f;
       long l = (long)(te - tf);
       if (l - p0 >= 0) {
          this.f = (int)((long)tf + p0);
          return p0;
       }else {
          this.f = te;
          return (l + this.b.skip((p0 - l)));
       }
    }
}
