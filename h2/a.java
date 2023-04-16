package h2.a;
import java.lang.ThreadLocal;
import java.lang.Object;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import h2.a$a;
import h2.a$b;
import h2.a$c;
import android.os.SystemClock;
import java.lang.Long;
import h2.a$d;

public class a	// class@0020cf
{
    public final SimpleArrayMap a;
    public final ArrayList b;
    public final a$a c;
    public a$c d;
    public long e;
    public boolean f;
    public static final ThreadLocal g;

    static {
       a.g = new ThreadLocal();
    }
    public void a(){
       super();
       this.a = new SimpleArrayMap();
       this.b = new ArrayList();
       this.c = new a$a(this);
       this.e = 0;
       this.f = false;
    }
    public static a d(){
       ThreadLocal g = a.g;
       if (g.get() == null) {
          g.set(new a());
       }
       return g.get();
    }
    public void a(a$b p0,long p1){
       if (!this.b.size()) {
          this.e().a();
       }
       if (!this.b.contains(p0)) {
          this.b.add(p0);
       }
       if (p1 - null > 0) {
          this.a.put(p0, Long.valueOf((SystemClock.uptimeMillis() + p1)));
       }
       return;
    }
    public final void b(){
       if (this.f != null) {
          int i = this.b.size() - 1;
          while (i >= 0) {
             if (this.b.get(i) == null) {
                this.b.remove(i);
             }
             i = i - 1;
          }
          this.f = false;
       }
       return;
    }
    public void c(long p0){
       long l = SystemClock.uptimeMillis();
       int i = 0;
       while (i < this.b.size()) {
          a$b uob = this.b.get(i);
          if (uob != null && this.f(uob, l)) {
             uob.a(p0);
          }
          i = i + 1;
       }
       this.b();
       return;
    }
    public a$c e(){
       if (this.d == null) {
          this.d = new a$d(this.c);
       }
       return this.d;
    }
    public final boolean f(a$b p0,long p1){
       Long longx = this.a.get(p0);
       if (longx == null) {
          return true;
       }
       if (longx.longValue() - p1 >= 0) {
          return false;
       }
       this.a.remove(p0);
       return true;
    }
    public void g(a$b p0){
       this.a.remove(p0);
       int i = this.b.indexOf(p0);
       if (i >= 0) {
          this.b.set(i, null);
          this.f = true;
       }
       return;
    }
}
