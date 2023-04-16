package ed.i;
import com.facebook.imagepipeline.memory.b;
import java.io.Closeable;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.System;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import ab.e;
import ed.q;
import java.nio.Buffer;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.IllegalArgumentException;

public class i implements b, Closeable	// class@001f2b
{
    public ByteBuffer b;
    public final int c;
    public final long d;

    public void i(int p0){
       super();
       this.b = ByteBuffer.allocateDirect(p0);
       this.c = p0;
       this.d = (long)System.identityHashCode(this);
    }
    public long B(){
       throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }
    public synchronized int D(int p0,byte[] p1,int p2,int p3){
       e.d(p1);
       boolean b = (!this.isClosed())? true: false;
       e.f(b);
       p3 = q.a(p0, p3, this.c);
       q.b(p0, p1.length, p2, p3, this.c);
       this.b.position(p0);
       this.b.get(p1, p2, p3);
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
       return this.b.get(p0);
    }
    public synchronized int a(int p0,byte[] p1,int p2,int p3){
       e.d(p1);
       boolean b = (!this.isClosed())? true: false;
       e.f(b);
       p3 = q.a(p0, p3, this.c);
       q.b(p0, p1.length, p2, p3, this.c);
       this.b.position(p0);
       this.b.put(p1, p2, p3);
       return p3;
    }
    public void b(int p0,b p1,int p2,int p3){
       e.d(p1);
       if (!p1.getUniqueId() - this.getUniqueId()) {
          Long.toHexString(this.getUniqueId());
          Long.toHexString(p1.getUniqueId());
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
       if (!p1 instanceof i) {
          throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
       }
       e.f((this.isClosed() ^ 0x01));
       e.f((p1.isClosed() ^ 0x01));
       q.b(p0, p1.getSize(), p2, p3, this.c);
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
