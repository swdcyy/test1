package tc.g;
import com.facebook.cache.disk.f;
import com.facebook.common.memory.b;
import com.facebook.common.memory.c;
import java.util.concurrent.Executor;
import tc.r;
import java.lang.Object;
import tc.a0;
import com.facebook.cache.common.CacheKey;
import ab.e;
import bd.d;
import java.lang.String;
import java.lang.Class;
import cb.a;
import bolts.Task;
import cd.a;
import tc.g$c;
import java.util.concurrent.Callable;
import java.lang.Throwable;
import java.lang.Exception;
import java.lang.Boolean;
import tc.e;
import java.util.Map;
import java.lang.System;
import java.lang.Integer;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.b;
import tc.f;
import tc.g$a;
import java.lang.Runnable;
import com.facebook.common.memory.PooledByteBuffer;
import sa.a;
import java.io.InputStream;
import tc.g$b;
import tc.g$d;
import com.facebook.cache.common.d;

public class g	// class@0024b5
{
    public final f a;
    public final b b;
    public final c c;
    public final Executor d;
    public final Executor e;
    public final a0 f;
    public final r g;
    public static final Class h;

    static {
       g.h = g.class;
    }
    public void g(f p0,b p1,c p2,Executor p3,Executor p4,r p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.g = p5;
       this.f = new a0();
    }
    public void a(CacheKey p0){
       e.d(p0);
       this.a.h(p0);
    }
    public boolean b(CacheKey p0){
       d uod = this.f.b(p0);
       if (uod != null) {
          uod.close();
          a.n(g.h, "Found image for %s in staging area", p0.a());
          this.g.a(p0);
          return true;
       }else {
          a.n(g.h, "Did not find image for %s in staging area", p0.a());
          g tg = this.g;
          try{
             tg.k(p0);
             return this.a.j(p0);
          }catch(java.lang.Exception e0){
             return false;
          }
       }
    }
    public Task c(){
       this.f.a();
       Object obj = a.c("BufferedDiskCache_clearAll");
       try{
          return Task.call(new g$c(this, obj), this.e);
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          a.w(g.h, e0, "Failed to schedule disk-cache clear", objArray);
          return Task.forError(e0);
       }
    }
    public Task d(CacheKey p0){
       Task task;
       if (this.e(p0)) {
          return Task.forResult(Boolean.TRUE);
       }
       try{
          task = Task.call(new e(this, a.c("BufferedDiskCache_containsAsync"), p0), this.d);
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[]{task.a()};
          a.w(g.h, e0, "Failed to schedule disk-cache read for %s", objArray);
          task = Task.forError(e0);
       }
       return task;
    }
    public boolean e(CacheKey p0){
       g tf = this.f;
       _monitor_enter(tf);
       e.d(p0);
       boolean b = true;
       if (!tf.a.containsKey(p0)) {
          _monitor_exit(tf);
       }else {
          d uod = tf.a.get(p0);
          _monitor_enter(uod);
          if (!d.v(uod)) {
             tf.a.remove(p0);
             Object[] objArray = new Object[]{Integer.valueOf(System.identityHashCode(uod)),p0.a(),Integer.valueOf(System.identityHashCode(p0))};
             a.v(a0.b, "Found closed reference %d for key %s \(%d\)", objArray);
             _monitor_exit(uod);
             _monitor_exit(tf);
          }else {
             _monitor_exit(uod);
             _monitor_exit(tf);
             tf = 1;
          label_0052 :
             if (!tf && !this.a.i(p0)) {
                b = false;
             }
             return b;
          }
       }
       tf = null;
       goto label_0052 ;
    }
    public boolean f(CacheKey p0){
       if (this.e(p0)) {
          return true;
       }
       return this.b(p0);
    }
    public Task g(CacheKey p0,AtomicBoolean p1){
       Task task;
       if (b.d()) {
          b.a("BufferedDiskCache#get");
       }
       d uod = this.f.b(p0);
       if (uod != null) {
          a.n(g.h, "Found image for %s in staging area", p0.a());
          this.g.a(p0);
          task = Task.forResult(uod);
          if (b.d()) {
             b.b();
          }
          return task;
       }else {
          try{
             task = Task.call(new f(this, a.c("BufferedDiskCache_getAsync"), p1, p0), this.d);
          }catch(java.lang.Exception e5){
             Object[] objArray = new Object[]{task.a()};
             a.w(g.h, e5, "Failed to schedule disk-cache read for %s", objArray);
             task = Task.forError(e5);
          }
          if (b.d()) {
             b.b();
          }
          return task;
       }
    }
    public long h(){
       return this.a.getSize();
    }
    public void i(CacheKey p0,d p1){
       if (b.d()) {
          b.a("BufferedDiskCache#put");
       }
       e.d(p0);
       e.a(Boolean.valueOf(d.v(p1)));
       g tf = this.f;
       _monitor_enter(tf);
       e.d(p0);
       e.a(Boolean.valueOf(d.v(p1)));
       d.b(tf.a.put(p0, d.a(p1)));
       tf.c();
       _monitor_exit(tf);
       d uod = d.a(p1);
       try{
          this.e.execute(new g$a(this, a.c("BufferedDiskCache_putAsync"), p0, uod));
       }catch(java.lang.Exception e1){
          Object[] objArray = new Object[]{p0.a()};
          a.w(g.h, e1, "Failed to schedule disk-cache write for %s", objArray);
          this.f.e(p0, p1);
          d.b(uod);
       }
       if (b.d()) {
          b.b();
       }
       return;
    }
    public PooledByteBuffer j(CacheKey p0){
       try{
          Class h = g.h;
          a.n(h, "Disk cache read for %s", p0.a());
          a uoa = this.a.c(p0);
          if (uoa == null) {
             a.n(h, "Disk cache miss for %s", p0.a());
             this.g.i(p0);
             return null;
          }else {
             a.n(h, "Found entry in disk cache for %s", p0.a());
             this.g.c(p0);
             InputStream inputStream = uoa.a();
             PooledByteBuffer pooledByteBu = this.b.c(inputStream, (int)uoa.size());
             inputStream.close();
             a.n(h, "Successful read from disk cache for %s", p0.a());
             return pooledByteBu;
          }
       }catch(java.io.IOException e0){
          Object[] objArray = new Object[]{p0.a()};
          a.w(g.h, e0, "Exception reading from cache for %s", objArray);
          this.g.n(p0);
          throw e0;
       }
    }
    public Task k(CacheKey p0){
       e.d(p0);
       g tf = this.f;
       try{
          tf.d(p0);
          return Task.call(new g$b(this, a.c("BufferedDiskCache_remove"), p0), this.e);
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[]{p0.a()};
          a.w(g.h, e0, "Failed to schedule disk-cache remove for %s", objArray);
          return Task.forError(e0);
       }
    }
    public void l(CacheKey p0,d p1){
       Class h = g.h;
       String str = p0.a();
       String str1 = "About to write to disk-cache for key %s";
       try{
          a.n(h, str1, str);
          this.a.k(p0, new g$d(this, p1));
          this.g.e(p0);
          a.n(h, "Successful disk-cache write for key %s", p0.a());
       }catch(java.io.IOException e5){
          Object[] objArray = new Object[]{p0.a()};
          a.w(g.h, e5, "Failed to write to disk-cache for key %s", objArray);
       }
       return;
    }
}
