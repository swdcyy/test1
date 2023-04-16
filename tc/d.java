package tc.d;
import java.lang.Object;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class d	// class@0024ae
{
    public int a;
    public LinkedHashSet b;

    public void d(int p0){
       super();
       this.b = new LinkedHashSet(p0);
       this.a = p0;
    }
    public synchronized boolean a(Object p0){
       if (this.b.size() == this.a) {
          d tb = this.b;
          tb.remove(tb.iterator().next());
       }
       this.b.remove(p0);
       return this.b.add(p0);
    }
    public synchronized boolean b(Object p0){
       return this.b.contains(p0);
    }
}
