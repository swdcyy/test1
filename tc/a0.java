package tc.a0;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import bd.d;
import com.facebook.cache.common.CacheKey;
import ab.e;
import java.lang.System;
import java.lang.Integer;
import java.lang.String;
import java.lang.Class;
import cb.a;
import java.lang.Boolean;
import com.facebook.common.references.a;

public class a0	// class@0024a8
{
    public Map a;
    public static final Class b;

    static {
       a0.b = a0.class;
    }
    public void a0(){
       super();
       this.a = new HashMap();
    }
    public void a(){
       _monitor_enter(this);
       ArrayList uArrayList = new ArrayList(this.a.values());
       this.a.clear();
       _monitor_exit(this);
       int i = 0;
       while (i < uArrayList.size()) {
          d uod = uArrayList.get(i);
          if (uod != null) {
             uod.close();
          }
          i = i + 1;
       }
       return;
    }
    public synchronized d b(CacheKey p0){
       e.d(p0);
       d uod = this.a.get(p0);
       if (uod != null) {
          _monitor_enter(uod);
          if (!d.v(uod)) {
             this.a.remove(p0);
             Object[] objArray = new Object[]{Integer.valueOf(System.identityHashCode(uod)),p0.a(),Integer.valueOf(System.identityHashCode(p0))};
             a.v(a0.b, "Found closed reference %d for key %s \(%d\)", objArray);
             _monitor_exit(uod);
             return null;
          }else {
             _monitor_exit(uod);
             uod = d.a(uod);
          }
       }
       return uod;
    }
    public synchronized final void c(){
       a.n(a0.b, "Count = %d", Integer.valueOf(this.a.size()));
    }
    public boolean d(CacheKey p0){
       e.d(p0);
       _monitor_enter(this);
       d uod = this.a.remove(p0);
       _monitor_exit(this);
       if (uod == null) {
          return false;
       }
       uod.close();
       return uod.u();
    }
    public synchronized boolean e(CacheKey p0,d p1){
       e.d(p0);
       e.d(p1);
       e.a(Boolean.valueOf(d.v(p1)));
       d uod = this.a.get(p0);
       boolean b = false;
       if (uod == null) {
          return b;
       }
       a uoa = uod.e();
       a uoa1 = p1.e();
       if (uoa != null && (uoa1 == null || uoa.j() != uoa1.j())) {
          a.f(uoa1);
          a.f(uoa);
          d.b(uod);
          return b;
       }else {
          this.a.remove(p0);
          a.f(uoa1);
          a.f(uoa);
          d.b(uod);
          this.c();
          return true;
       }
    }
}
