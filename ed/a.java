package ed.a;
import com.facebook.imagepipeline.memory.b;
import java.io.Closeable;
import java.lang.Object;
import java.lang.System;
import java.lang.Boolean;
import ab.e;
import java.lang.String;
import android.os.SharedMemory;
import java.nio.ByteBuffer;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.UnsupportedOperationException;
import ed.q;
import java.nio.Buffer;
import java.lang.Long;
import java.lang.IllegalArgumentException;

public class a implements b, Closeable	// class@001f22
{
    public SharedMemory b;
    public ByteBuffer c;
    public final long d;

    public void a(){
       super();
       this.b = null;
       this.c = null;
       this.d = (long)System.identityHashCode(this);
    }
    public void a(int p0){
       super();
       boolean b = (p0 > 0)? true: false;
       Boolean uBoolean = Boolean.valueOf(b);
       try{
          e.a(uBoolean);
          SharedMemory sharedMemory = SharedMemory.create("AshmemMemoryChunk", p0);
          this.b = sharedMemory;
          this.c = sharedMemory.mapReadWrite();
          this.d = (long)System.identityHashCode(this);
          return;
       }catch(android.system.ErrnoException e3){
          throw new RuntimeException("Fail to create AshmemMemory", e3);
       }
    }
    public long B(){
       throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }
    public synchronized int D(int p0,byte[] p1,int p2,int p3){
       e.d(p1);
       boolean b = (!this.isClosed())? true: false;
       e.f(b);
       p3 = q.a(p0, p3, this.getSize());
       q.b(p0, p1.length, p2, p3, this.getSize());
       this.c.position(p0);
       this.c.get(p1, p2, p3);
       return p3;
    }
    public synchronized byte F(int p0){
       boolean b = true;
       boolean b1 = (!this.isClosed())? true: false;
       e.f(b1);
       b1 = (p0 >= 0)? true: false;
       e.a(Boolean.valueOf(b1));
       if (p0 >= this.getSize()) {
          b = false;
       }
       e.a(Boolean.valueOf(b));
       return this.c.get(p0);
    }
    public synchronized int a(int p0,byte[] p1,int p2,int p3){
       e.d(p1);
       boolean b = (!this.isClosed())? true: false;
       e.f(b);
       p3 = q.a(p0, p3, this.getSize());
       q.b(p0, p1.length, p2, p3, this.getSize());
       this.c.position(p0);
       this.c.put(p1, p2, p3);
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
       if (!p1 instanceof a) {
          throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
       }
       e.f((this.isClosed() ^ 0x01));
       e.f((p1.isClosed() ^ 0x01));
       q.b(p0, p1.getSize(), p2, p3, this.getSize());
       this.c.position(p0);
       p1.n().position(p2);
       byte[] uobyteArray = new byte[p3];
       this.c.get(uobyteArray, 0, p3);
       p1.n().put(uobyteArray, 0, p3);
       return;
    }
    public synchronized void close(){
       if (!this.isClosed()) {
          SharedMemory.unmap(this.c);
          this.b.close();
          this.c = null;
          this.b = null;
       }
       return;
    }
    public int getSize(){
       e.f((this.isClosed() ^ 0x01));
       return this.b.getSize();
    }
    public long getUniqueId(){
       return this.d;
    }
    public synchronized boolean isClosed(){
       boolean b = (this.c == null || this.b == null)? true: false;
       return b;
    }
    public ByteBuffer n(){
       return this.c;
    }
}
