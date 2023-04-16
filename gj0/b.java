package gj0.b;
import java.lang.Runnable;
import iu6.a;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.krn.c;
import kj0.l;
import java.util.List;
import com.kuaishou.krn.bundle.preload.a;
import java.util.ArrayList;
import java.util.Iterator;
import gj0.d;
import java.lang.Throwable;
import ek0.d;

public final class b implements Runnable	// class@0024f0
{
    public final a b;
    public final String c;

    public void b(a p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       try{
          List list = a.a(c.b().g().L());
          if (tb == null) {
             c.b().o(tc, list);
          }else {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                d uod = iterator.next();
                if ((tb.a()).equals(uod.a())) {
                   uArrayList.add(uod);
                }
             }
             c.b().o(tc, uArrayList);
          }
       }catch(java.lang.Exception e0){
          d.k("tryPreloadBusinessBundles£º", e0);
       }
       return;
    }
}
