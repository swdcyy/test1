package com.facebook.react.modules.diskcache.a;
import com.facebook.imagepipeline.memory.b;
import java.io.Closeable;
import java.io.FileInputStream;
import java.lang.Object;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel$MapMode;
import java.nio.MappedByteBuffer;
import java.lang.System;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.UnsupportedOperationException;
import java.lang.Integer;
import ne.c;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.lang.Long;
import java.lang.IllegalArgumentException;

public class a implements b, Closeable	// class@0012b1
{
    public ByteBuffer b;
    public final int c;
    public final long d;

    public void a(FileInputStream p0,int p1){
       super();
       this.b = p0.getChannel().map(FileChannel$MapMode.READ_ONLY, 0, (long)p1);
       this.c = p1;
       this.d = (long)System.identityHashCode(this);
    }
    public long B(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       throw new UnsupportedOperationException("Cannot get the pointer of a MappedMemoryChunk");
    }
    public synchronized int D(int p0,byte[] p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p3 = c.a(p0, p3, this.c);
       this.b.position(p0);
       this.b.get(p1, p2, p3);
       return p3;
    }
    public synchronized byte F(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.byteValue();
          }
       }
       return this.b.get(p0);
    }
    public synchronized int a(int p0,byte[] p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p3 = c.a(p0, p3, this.c);
       this.b.position(p0);
       this.b.put(p1, p2, p3);
       return p3;
    }
    public void b(int p0,b p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "4")) {
          return;
       }
       if (!p1.getUniqueId() - this.getUniqueId()) {
          Long.toHexString(this.getUniqueId());
          Long.toHexString(p1.getUniqueId());
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
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "6")) {
          return;
       }
       if (!p1 instanceof a) {
          throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
       }
       p1.getSize();
       this.b.position(p0);
       p1.n().position(p2);
       byte[] uobyteArray = new byte[p3];
       this.b.get(uobyteArray, 0, p3);
       p1.n().put(uobyteArray, 0, p3);
       return;
    }
    public synchronized void close(){
       this.b = null;
    }
    public int getSize(){
       return this.c;
    }
    public long getUniqueId(){
       return this.d;
    }
    public synchronized boolean isClosed(){
       boolean b = (this.b == null)? true: false;
       return b;
    }
    public synchronized ByteBuffer n(){
       return this.b;
    }
}
