package com.facebook.imagepipeline.producers.j;
import id.b0;
import java.util.concurrent.Executor;
import com.facebook.common.memory.b;
import java.lang.Object;
import java.io.InputStream;
import bd.d;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.Closeable;
import com.facebook.common.references.a;
import com.facebook.common.internal.b;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import id.i;
import id.c0;
import id.e0;
import com.facebook.imagepipeline.producers.j$a;
import com.facebook.imagepipeline.producers.j$b;
import id.i0;
import id.d0;
import java.lang.Runnable;

public abstract class j implements b0	// class@001139
{
    public final Executor a;
    public final b b;

    public void j(Executor p0,b p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public d b(InputStream p0,int p1){
       a uoa = (p1 <= 0)? a.o(this.b.b(p0)): a.o(this.b.c(p0, p1));
       a uoa1 = uoa;
       b.b(p0);
       a.f(uoa1);
       return new d(uoa1);
    }
    public abstract d c(ImageRequest p0);
    public d d(InputStream p0,int p1){
       return this.b(p0, p1);
    }
    public abstract String e();
    public void produceResults(i p0,c0 p1){
       e0 uoe0 = p1.l();
       p1.n("local", "fetch");
       j$a uoa = new j$a(this, p0, uoe0, p1, this.e(), p1.b(), uoe0, p1);
       p1.k(new j$b(this, v9));
       this.a.execute(v9);
    }
}
