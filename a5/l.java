package a5.l;
import java.lang.Runnable;
import a5.m;
import java.lang.Object;
import a5.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import a5.h;
import java.lang.Throwable;

public class l implements Runnable	// class@0000eb
{
    public final m b;

    public void l(m p0){
       this.b = p0;
       super();
    }
    public void run(){
       l tb;
       Throwable obj;
       Iterator iterator;
       if (this.b.d == null) {
          return;
       }
       m d = this.b.d;
       if (d.b() != null) {
          tb = this.b;
          obj = d.b();
          _monitor_enter(tb);
          iterator = new ArrayList(tb.a).iterator();
          while (iterator.hasNext()) {
             iterator.next().onResult(obj);
          }
          _monitor_exit(tb);
       }else {
          tb = this.b;
          obj = d.a();
          _monitor_enter(tb);
          ArrayList uArrayList = new ArrayList(tb.b);
          if (uArrayList.isEmpty()) {
             _monitor_exit(tb);
          }else {
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                iterator.next().onResult(obj);
             }
             _monitor_exit(tb);
          }
       }
       return;
    }
}
