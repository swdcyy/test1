package nsd.q0;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;

public class q0	// class@001ed7
{
    public final ArrayList a;

    public void q0(int p0){
       super();
       this.a = new ArrayList(p0);
    }
    public void a(Object p0){
       this.a.add(p0);
    }
    public void b(Object p0){
       if (p0 == null) {
          return;
       }
       if (p0 instanceof Object[]) {
          if (p0.length > 0) {
             q0 ta = this.a;
             ta.ensureCapacity((ta.size() + p0.length));
             Collections.addAll(this.a, p0);
          }
       }else if(p0 instanceof Collection){
          this.a.addAll(p0);
       }else if(p0 instanceof Iterable){
          p0 = p0.iterator();
          while (p0.hasNext()) {
             this.a.add(p0.next());
          }
       }else if(p0 instanceof Iterator){
          while (p0.hasNext()) {
             this.a.add(p0.next());
          }
       }else {
          throw new UnsupportedOperationException("Don\'t know how to spread "+p0.getClass());
       }
       return;
    }
    public int c(){
       return this.a.size();
    }
    public Object[] d(Object[] p0){
       return this.a.toArray(p0);
    }
}
