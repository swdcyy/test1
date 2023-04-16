package fc.b;
import ec.a;
import qc.c;
import java.lang.Object;
import android.util.SparseArray;
import com.facebook.common.references.a;
import bd.c;
import bd.g;
import bd.h;
import java.io.Closeable;
import com.facebook.imagepipeline.image.a;
import bd.b;
import android.graphics.Bitmap;
import nd.a;
import ab.e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import com.facebook.cache.common.CacheKey;
import tc.l;
import qc.c$b;
import tc.v;
import ec.a$a;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import cb.a;

public class b implements a	// class@001fe5
{
    public final c a;
    public final boolean b;
    public final SparseArray c;
    public a d;
    public static final Class e;

    static {
       b.e = b.class;
    }
    public void b(c p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new SparseArray();
    }
    public static a h(a p0){
       if (a.l(p0) && p0.j() instanceof c) {
          a.f(p0);
          return p0.j().j();
       }else {
          a.f(p0);
          return null;
       }
    }
    public static a i(a p0){
       return a.o(new c(p0, g.d, 0));
    }
    public static int j(a p0){
       int i = 0;
       if (!a.l(p0)) {
          return i;
       }
       p0 = p0.j();
       if (p0 instanceof b) {
          i = a.d(p0.g());
       }
       return i;
    }
    public synchronized void a(int p0,a p1,int p2){
       e.d(p1);
       this.k(p0);
       a uoa = b.i(p1);
       if (uoa != null) {
          a.f(this.d);
          this.d = this.a.a(p0, uoa);
       }
       a.f(uoa);
       return;
    }
    public synchronized a b(int p0,int p1,int p2){
       CacheKey uCacheKey;
       a uoa = null;
       if (this.b == null) {
          return uoa;
       }
       b ta = this.a;
       while (true) {
          _monitor_enter(ta);
          Iterator iterator = ta.d.iterator();
          if (iterator.hasNext()) {
             uCacheKey = iterator.next();
             iterator.remove();
          }else {
             uCacheKey = uoa;
          }
          _monitor_exit(ta);
          if (uCacheKey != null) {
             a uoa1 = ta.b.e(uCacheKey);
             if (uoa1 != null) {
                uoa = uoa1;
                break ;
             }
          }
          break ;
       }
       return b.h(uoa);
    }
    public synchronized a c(int p0){
       return b.h(a.d(this.d));
    }
    public synchronized void clear(){
       a.f(this.d);
       this.d = null;
       for (int i = 0; i < this.c.size(); i = i + 1) {
          a.f(this.c.valueAt(i));
       }
       this.c.clear();
       return;
    }
    public synchronized boolean d(int p0){
       b ta = this.a;
       return ta.b.contains(ta.b(p0));
    }
    public void e(a$a p0){
    }
    public synchronized a f(int p0){
       b ta = this.a;
       return b.h(ta.b.get(ta.b(p0)));
    }
    public synchronized void g(int p0,a p1,int p2){
       e.d(p1);
       a uoa = b.i(p1);
       if (uoa == null) {
          a.f(uoa);
          return;
       }else {
          p1 = this.a.a(p0, uoa);
          if (a.l(p1)) {
             a.f(this.c.get(p0));
             this.c.put(p0, p1);
             a.o(b.e, "cachePreparedFrame\(%d\) cached. Pending frames: %s", Integer.valueOf(p0), this.c);
          }
          a.f(uoa);
          return;
       }
    }
    public synchronized int getSizeInBytes(){
       int i = b.j(this.d);
       int i2 = 0;
       for (int i1 = 0; i1 < this.c.size(); i1 = i1 + 1) {
          i2 = i2 + b.j(this.c.valueAt(i1));
       }
       return (i + i2);
    }
    public synchronized final void k(int p0){
       a uoa = this.c.get(p0);
       if (uoa != null) {
          this.c.delete(p0);
          a.f(uoa);
          a.o(b.e, "removePreparedReference\(%d\) removed. Pending frames: %s", Integer.valueOf(p0), this.c);
       }
       return;
    }
}
