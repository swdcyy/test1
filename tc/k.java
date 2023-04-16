package tc.k;
import tc.b0;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Collection;
import ab.f;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import tc.k$a;

public class k	// class@0024bb
{
    public final b0 a;
    public final LinkedHashMap b;
    public int c;
    public k$a d;

    public void k(b0 p0){
       super();
       this.b = new LinkedHashMap();
       this.c = 0;
       this.a = p0;
    }
    public synchronized ArrayList a(){
       this.b.clear();
       this.c = 0;
       return new ArrayList(this.b.values());
    }
    public synchronized int b(){
       return this.b.size();
    }
    public synchronized ArrayList c(f p0){
       ArrayList uArrayList = new ArrayList(this.b.entrySet().size());
       Iterator iterator = this.b.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (p0 == null || p0.apply(uEntry.getKey())) {
             uArrayList.add(uEntry);
          }
       }
       return uArrayList;
    }
    public synchronized int d(){
       return this.c;
    }
    public final int e(Object p0){
       int i = (p0 == null)? 0: this.a.a(p0);
       return i;
    }
    public synchronized Object f(Object p0,Object p1){
       Object obj = this.b.remove(p0);
       this.c = this.c - this.e(obj);
       this.b.put(p0, p1);
       this.c = this.c + this.e(p1);
       p0 = this.d;
       if (p0 != null) {
          p0.a(obj);
       }
       return obj;
    }
    public synchronized Object g(Object p0){
       p0 = this.b.remove(p0);
       this.c = this.c - this.e(p0);
       k td = this.d;
       if (td != null) {
          td.a(p0);
       }
       return p0;
    }
    public synchronized ArrayList h(f p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.b.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (p0 == null || p0.apply(uEntry.getKey())) {
             uArrayList.add(uEntry.getValue());
             int i = this.c - this.e(uEntry.getValue());
             this.c = i;
             iterator.remove();
             k td = this.d;
             if (td != null) {
                td.a(uEntry.getValue());
             }
          }
       }
       return uArrayList;
    }
}
