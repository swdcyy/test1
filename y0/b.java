package y0.b;
import java.lang.Iterable;
import java.lang.Object;
import java.util.WeakHashMap;
import java.util.Map$Entry;
import y0.b$c;
import java.util.Iterator;
import y0.b$b;
import java.lang.Boolean;
import y0.b$e;
import y0.b$a;
import y0.b$d;
import java.util.Set;
import y0.b$f;
import java.lang.String;
import java.lang.StringBuilder;

public class b implements Iterable	// class@002832
{
    public b$c b;
    public b$c c;
    public WeakHashMap d;
    public int e;

    public void b(){
       super();
       this.d = new WeakHashMap();
       this.e = 0;
    }
    public Map$Entry b(){
       return this.b;
    }
    public b$c d(Object p0){
       b tb = this.b;
       while (tb != null && !tb.b.equals(p0)) {
          tb = tb.d;
       }
       return tb;
    }
    public Iterator descendingIterator(){
       b$b uob = new b$b(this.c, this.b);
       this.d.put(uob, Boolean.FALSE);
       return uob;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof b) {
          return false;
       }
       if (this.size() != p0.size()) {
          return false;
       }
       Iterator iterator = this.iterator();
       p0 = p0.iterator();
       while (true) {
          Iterator iterator1 = iterator;
          if (iterator1.hasNext()) {
             Iterator iterator2 = p0;
             if (iterator2.hasNext()) {
                Map$Entry uEntry = iterator1.next();
                Object obj = iterator2.next();
                if (uEntry != null || (obj != null || (uEntry != null && !uEntry.equals(obj)))) {
                   return false;
                }
                continue ;
             }
          }
          if (iterator1.hasNext() || p0.hasNext()) {
             b = false;
             break ;
          }
          break ;
       }
       return b;
    }
    public int hashCode(){
       Iterator iterator = this.iterator();
       int i = 0;
       Iterator iterator1 = iterator;
       while (iterator1.hasNext()) {
          i = i + iterator1.next().hashCode();
       }
       return i;
    }
    public Iterator iterator(){
       b$a uoa = new b$a(this.b, this.c);
       this.d.put(uoa, Boolean.FALSE);
       return uoa;
    }
    public b$d l(){
       b$d uod = new b$d(this);
       this.d.put(uod, Boolean.FALSE);
       return uod;
    }
    public Map$Entry m(){
       return this.c;
    }
    public b$c n(Object p0,Object p1){
       b$c uoc = new b$c(p0, p1);
       this.e = this.e + 1;
       p0 = this.c;
       if (p0 == null) {
          this.b = uoc;
          this.c = uoc;
          return uoc;
       }else {
          p0.d = uoc;
          uoc.e = p0;
          this.c = uoc;
          return uoc;
       }
    }
    public Object p(Object p0,Object p1){
       b$c uoc = this.d(p0);
       if (uoc != null) {
          return uoc.c;
       }
       this.n(p0, p1);
       return null;
    }
    public Object q(Object p0){
       p0 = this.d(p0);
       if (p0 == null) {
          return null;
       }
       this.e = this.e - 1;
       if (!this.d.isEmpty()) {
          Iterator iterator = this.d.keySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
       }
       b$c e = p0.e;
       if (e != null) {
          e.d = p0.d;
       }else {
          this.b = p0.d;
       }
       b$c d = p0.d;
       if (d != null) {
          d.e = e;
       }else {
          this.c = e;
       }
       p0.d = null;
       p0.e = null;
       return p0.c;
    }
    public int size(){
       return this.e;
    }
    public String toString(){
       StringBuilder str = "[";
       Iterator iterator = this.iterator();
       Iterator iterator1 = iterator;
       while (iterator1.hasNext()) {
          str = str+iterator1.next().toString();
          if (iterator1.hasNext()) {
             str = str+", ";
          }
       }
       return str+"]";
    }
}
