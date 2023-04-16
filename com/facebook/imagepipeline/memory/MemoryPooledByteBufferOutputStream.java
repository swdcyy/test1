package com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import eb.g;
import com.facebook.imagepipeline.memory.c;
import java.lang.Boolean;
import ab.e;
import java.lang.Object;
import com.facebook.imagepipeline.memory.BasePool;
import fb.c;
import com.facebook.common.references.a;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.memory.d;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream$InvalidStreamException;
import java.io.OutputStream;
import com.facebook.imagepipeline.memory.b;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.String;

public class MemoryPooledByteBufferOutputStream extends g	// class@001102
{
    public final c b;
    public a c;
    public int d;

    public void MemoryPooledByteBufferOutputStream(c p0){
       super(p0, p0.k[0]);
    }
    public void MemoryPooledByteBufferOutputStream(c p0,int p1){
       super();
       boolean b = (p1 > 0)? true: false;
       e.a(Boolean.valueOf(b));
       e.d(p0);
       this.b = p0;
       this.d = 0;
       this.c = a.p(p0.get(p1), p0);
       return;
    }
    public PooledByteBuffer a(){
       return this.e();
    }
    public final void c(){
       if (a.l(this.c)) {
          return;
       }
       throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
    }
    public void close(){
       a.f(this.c);
       this.c = null;
       this.d = -1;
       super.close();
    }
    public d e(){
       this.c();
       return new d(this.c, this.d);
    }
    public int size(){
       return this.d;
    }
    public void write(int p0){
       byte[] uobyteArray = new byte[]{(byte)p0};
       this.write(uobyteArray);
    }
    public void write(byte[] p0,int p1,int p2){
       if (p1 < 0 || (p2 < 0 || (p1 + p2) > p0.length)) {
          throw new ArrayIndexOutOfBoundsException("length="+p0.length+"; regionStart="+p1+"; regionLength="+p2);
       }
       this.c();
       int i = this.d + p2;
       this.c();
       if (i > this.c.j().getSize()) {
          b uob = this.b.get(i);
          this.c.j().b(0, uob, 0, this.d);
          this.c.close();
          this.c = a.p(uob, this.b);
       }
       this.c.j().a(this.d, p0, p1, p2);
       this.d = this.d + p2;
       return;
    }
}
