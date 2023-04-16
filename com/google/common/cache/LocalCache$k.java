package com.google.common.cache.LocalCache$k;
import com.google.common.cache.LocalCache$s;
import com.google.common.cache.LocalCache;
import java.lang.Object;
import com.google.common.util.concurrent.g;
import ok.v;
import com.google.common.cache.d;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.h;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;
import com.google.common.cache.CacheLoader;
import xk.d;
import com.google.common.util.concurrent.d;
import java.util.Objects;
import ok.n;
import com.google.common.cache.LocalCache$k$a;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.a;
import com.google.common.util.concurrent.a$a;
import ok.h;
import xk.i;
import com.google.common.util.concurrent.AbstractFuture;
import java.lang.Runnable;
import java.lang.Throwable;
import com.google.common.util.concurrent.e$a;
import java.lang.InterruptedException;
import java.lang.Thread;

public class LocalCache$k implements LocalCache$s	// class@001765
{
    public LocalCache$s b;
    public final g c;
    public final v d;

    public void LocalCache$k(){
       super(LocalCache.B());
    }
    public void LocalCache$k(LocalCache$s p0){
       super();
       this.c = new g();
       this.d = v.a();
       this.b = p0;
    }
    public boolean E(){
       return this.b.E();
    }
    public d a(){
       return null;
    }
    public void b(Object p0){
       if (p0 != null) {
          this.h(p0);
       }else {
          this.b = LocalCache.B();
       }
       return;
    }
    public int c(){
       return this.b.c();
    }
    public Object d(){
       return h.a(this.c);
    }
    public LocalCache$s e(ReferenceQueue p0,Object p1,d p2){
       return this;
    }
    public long f(){
       return this.d.b(TimeUnit.NANOSECONDS);
    }
    public d g(Object p0,CacheLoader p1){
       this.d.d();
       Executor obj = this.b.get();
       if (obj == null) {
          p0 = p1.a(p0);
          p0 = (this.h(p0))? this.c: d.b(p0);
          return p0;
       }else {
          Objects.requireNonNull(p1);
          n.j(p0);
          n.j(obj);
          p0 = d.b(p1.a(p0));
          if (p0 == null) {
             return d.b(null);
          }
          LocalCache$k$a ok$a = new LocalCache$k$a(this);
          obj = MoreExecutors.a();
          n.j(ok$a);
          a$a uoa = new a$a(p0, ok$a);
          n.j(obj);
          n.j(uoa);
          if (obj != MoreExecutors.a()) {
             i oi = new i(obj, uoa);
          }
          p0.u(uoa, obj);
          return uoa;
       }
    }
    public Object get(){
       return this.b.get();
    }
    public boolean h(Object p0){
       return this.c.F(p0);
    }
    public boolean i(Throwable p0){
       return this.c.G(p0);
    }
    public boolean isLoading(){
       return true;
    }
}
