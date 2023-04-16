package com.facebook.imagepipeline.memory.NativeMemoryChunk;
import com.facebook.imagepipeline.memory.b;
import java.io.Closeable;
import java.lang.String;
import gg.a;
import java.lang.Object;
import java.lang.Boolean;
import ab.e;
import ed.q;
import java.lang.System;
import java.lang.Integer;
import java.lang.Long;
import java.lang.IllegalArgumentException;
import java.nio.ByteBuffer;

public class NativeMemoryChunk implements b, Closeable	// class@001103
{
    public final long b;
    public final int c;
    public boolean d;

    static {
       a.c("imagepipeline");
    }
    public void NativeMemoryChunk(){
       super();
       this.c = 0;
       this.b = 0;
       this.d = true;
    }
    public void NativeMemoryChunk(int p0){
       super();
       boolean b = (p0 > 0)? true: false;
       e.a(Boolean.valueOf(b));
       this.c = p0;
       this.b = NativeMemoryChunk.nativeAllocate(p0);
       this.d = false;
       return;
    }
    public static native long nativeAllocate(int p0);
    public static native void nativeCopyFromByteArray(long p0,byte[] p1,int p2,int p3);
    public static native void nativeCopyToByteArray(long p0,byte[] p1,int p2,int p3);
    public static native void nativeFree(long p0);
    public static native void nativeMemcpy(long p0,long p1,int p2);
    public static native byte nativeReadByte(long p0);
    public long B(){
       return this.b;
    }
    public synchronized int D(int p0,byte[] p1,int p2,int p3){
       e.d(p1);
       boolean b = (!this.isClosed())? true: false;
       e.f(b);
       p3 = q.a(p0, p3, this.c);
       q.b(p0, p1.length, p2, p3, this.c);
       NativeMemoryChunk.nativeCopyToByteArray((this.b + (long)p0), p1, p2, p3);
       return p3;
    }
    public synchronized byte F(int p0){
       boolean b = true;
       boolean b1 = (!this.isClosed())? true: false;
       e.f(b1);
       b1 = (p0 >= 0)? true: false;
       e.a(Boolean.valueOf(b1));
       if (p0 >= this.c) {
          b = false;
       }
       e.a(Boolean.valueOf(b));
       return NativeMemoryChunk.nativeReadByte((this.b + (long)p0));
    }
    public synchronized int a(int p0,byte[] p1,int p2,int p3){
       e.d(p1);
       boolean b = (!this.isClosed())? true: false;
       e.f(b);
       p3 = q.a(p0, p3, this.c);
       q.b(p0, p1.length, p2, p3, this.c);
       NativeMemoryChunk.nativeCopyFromByteArray((this.b + (long)p0), p1, p2, p3);
       return p3;
    }
    public void b(int p0,b p1,int p2,int p3){
       e.d(p1);
       if (!p1.getUniqueId() - this.getUniqueId()) {
          Integer.toHexString(System.identityHashCode(this));
          Integer.toHexString(System.identityHashCode(p1));
          Long.toHexString(this.b);
          e.a(Boolean.FALSE);
       }
       if (p1.getUniqueId() - this.getUniqueId() < 0) {
          _monitor_enter(p1);
          _monitor_enter(this);
          this.c(p0, p1, p2, p3);
          _monitor_exit(this);
          _monitor_exit(p1);
          return;
       }else {
          _monitor_enter(this);
          _monitor_enter(p1);
          this.c(p0, p1, p2, p3);
          _monitor_exit(p1);
          _monitor_exit(this);
          return;
       }
    }
    public final void c(int p0,b p1,int p2,int p3){
       if (!p1 instanceof NativeMemoryChunk) {
          throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
       }
       e.f((this.isClosed() ^ 0x01));
       e.f((p1.isClosed() ^ 0x01));
       q.b(p0, p1.getSize(), p2, p3, this.c);
       NativeMemoryChunk.nativeMemcpy((p1.B() + (long)p2), (this.b + (long)p0), p3);
       return;
    }
    public synchronized void close(){
       if (this.d == null) {
          this.d = true;
          NativeMemoryChunk.nativeFree(this.b);
       }
       return;
    }
    public void finalize(){
       if (this.isClosed()) {
          return;
       }
       Integer.toHexString(System.identityHashCode(this));
       this.close();
       super.finalize();
       return;
    }
    public int getSize(){
       return this.c;
    }
    public long getUniqueId(){
       return this.b;
    }
    public synchronized boolean isClosed(){
       return this.d;
    }
    public ByteBuffer n(){
       return null;
    }
}
