package dn8.a;
import dn8.c;
import java.lang.Object;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.lang.Iterable;
import qrd.l1;

public abstract class a implements c	// class@0020d3
{
    public Object a;
    public Set b;

    public void a(){
       super();
       this.b = new LinkedHashSet();
    }
    public synchronized void a(Object p0){
       this.a = p0;
       a tb = this.b;
       _monitor_enter(tb);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       _monitor_exit(tb);
       return;
    }
}
