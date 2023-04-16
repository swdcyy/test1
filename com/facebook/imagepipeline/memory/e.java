package com.facebook.imagepipeline.memory.e;
import com.facebook.common.memory.b;
import com.facebook.imagepipeline.memory.c;
import com.facebook.common.memory.c;
import java.lang.Object;
import com.facebook.common.memory.PooledByteBuffer;
import java.lang.Boolean;
import ab.e;
import com.facebook.imagepipeline.memory.BasePool;
import fb.c;
import com.facebook.common.references.a;
import com.facebook.imagepipeline.memory.d;
import java.io.InputStream;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import eb.g;
import java.lang.Throwable;
import java.lang.RuntimeException;
import com.facebook.common.internal.e;
import java.io.OutputStream;

public class e implements b	// class@00048c
{
    public final c a;
    public final c b;

    public void e(c p0,c p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public PooledByteBuffer a(int p0){
       boolean b = (p0 > 0)? true: false;
       e.a(Boolean.valueOf(b));
       a uoa = a.p(this.b.get(p0), this.b);
       uoa.close();
       return new d(uoa, p0);
    }
    public PooledByteBuffer b(InputStream p0){
       MemoryPooledByteBufferOutputStream memoryPooled = new MemoryPooledByteBufferOutputStream(this.b);
       memoryPooled.close();
       return this.g(p0, memoryPooled);
    }
    public PooledByteBuffer c(InputStream p0,int p1){
       MemoryPooledByteBufferOutputStream memoryPooled = new MemoryPooledByteBufferOutputStream(this.b, p1);
       memoryPooled.close();
       return this.g(p0, memoryPooled);
    }
    public g d(){
       return new MemoryPooledByteBufferOutputStream(this.b);
    }
    public PooledByteBuffer e(byte[] p0){
       MemoryPooledByteBufferOutputStream memoryPooled = new MemoryPooledByteBufferOutputStream(this.b, p0.length);
       try{
          int i = 0;
          memoryPooled.write(p0, i, p0.length);
          memoryPooled.close();
          return memoryPooled.e();
       }catch(java.io.IOException e4){
          e.a(e4);
          throw null;
       }
    }
    public g f(int p0){
       return new MemoryPooledByteBufferOutputStream(this.b, p0);
    }
    public d g(InputStream p0,MemoryPooledByteBufferOutputStream p1){
       this.a.a(p0, p1);
       return p1.e();
    }
}
