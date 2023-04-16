package com.facebook.imagepipeline.memory.d;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.a;
import java.lang.Object;
import ab.e;
import com.facebook.imagepipeline.memory.b;
import java.lang.Boolean;
import com.facebook.common.memory.PooledByteBuffer$ClosedException;
import java.nio.ByteBuffer;

public class d implements PooledByteBuffer	// class@001106
{
    public final int b;
    public a c;

    public void d(a p0,int p1){
       super();
       e.d(p0);
       boolean b = (p1 >= 0 && p1 <= p0.j().getSize())? true: false;
       e.a(Boolean.valueOf(b));
       this.c = p0.a();
       this.b = p1;
       return;
    }
    public synchronized long B(){
       this.a();
       return this.c.j().B();
    }
    public synchronized int D(int p0,byte[] p1,int p2,int p3){
       this.a();
       boolean b = ((p0 + p3) <= this.b)? true: false;
       e.a(Boolean.valueOf(b));
       return this.c.j().D(p0, p1, p2, p3);
    }
    public synchronized byte F(int p0){
       this.a();
       boolean b = true;
       boolean b1 = (p0 >= 0)? true: false;
       e.a(Boolean.valueOf(b1));
       if (p0 >= this.b) {
          b = false;
       }
       e.a(Boolean.valueOf(b));
       return this.c.j().F(p0);
    }
    public synchronized void a(){
       if (!this.isClosed()) {
          return;
       }
       throw new PooledByteBuffer$ClosedException();
    }
    public synchronized void close(){
       a.f(this.c);
       this.c = null;
    }
    public synchronized boolean isClosed(){
       return (a.l(this.c) ^ 0x01);
    }
    public synchronized ByteBuffer n(){
       return this.c.j().n();
    }
    public synchronized int size(){
       this.a();
       return this.b;
    }
}
