package ua.a;
import ua.a$b;
import java.lang.Object;
import ab.e;
import ua.a$a;
import java.lang.String;
import ab.h;
import ua.b;
import com.facebook.cache.common.c;
import ta.c;
import xa.c;
import android.content.Context;
import com.facebook.cache.common.CacheErrorLogger;

public class a	// class@0025c8
{
    public final int a;
    public final String b;
    public final h c;
    public final long d;
    public final long e;
    public final long f;
    public final b g;
    public final CacheErrorLogger h;
    public final CacheEventListener i;
    public final b j;
    public final Context k;
    public final boolean l;

    public void a(a$b p0){
       c uoc;
       super();
       a$b l = p0.l;
       this.k = l;
       boolean b = (p0.c != null || l != null)? true: false;
       e.g(b, "Either a non-null context or a base directory path or supplier must be provided.");
       if (p0.c == null && l != null) {
          p0.c = new a$a(this);
       }
       this.a = p0.a;
       l = p0.b;
       e.d(l);
       this.b = l;
       l = p0.c;
       e.d(l);
       this.c = l;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       l = p0.g;
       e.d(l);
       this.g = l;
       l = p0.h;
       if (l == null) {
          uoc = c.class;
          _monitor_enter(uoc);
          if (c.a == null) {
             c.a = new c();
          }
          _monitor_exit(uoc);
          uoc = c.a;
       }
       this.h = uoc;
       l = p0.i;
       if (l == null) {
          uoc = c.class;
          _monitor_enter(uoc);
          if (c.a == null) {
             c.a = new c();
          }
          _monitor_exit(uoc);
          uoc = c.a;
       }
       this.i = uoc;
       l = p0.j;
       if (l == null) {
          uoc = c.class;
          _monitor_enter(uoc);
          if (c.a == null) {
             c.a = new c();
          }
          _monitor_exit(uoc);
          uoc = c.a;
       }
       this.j = uoc;
       this.l = p0.k;
       return;
    }
    public static a$b c(Context p0){
       return new a$b(p0);
    }
    public CacheErrorLogger a(){
       return this.h;
    }
    public long b(){
       return this.d;
    }
}
