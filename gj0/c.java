package gj0.c;
import java.lang.Runnable;
import java.util.List;
import iu6.a;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Iterator;
import gj0.d;
import com.kuaishou.krn.c;

public final class c implements Runnable	// class@0024f1
{
    public final List b;
    public final a c;
    public final String d;

    public void c(List p0,a p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       c tc = this.c;
       c td = this.d;
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if ((tc.a()).equals(uod.a())) {
             uArrayList.add(uod);
          }
       }
       if (uArrayList.size() > 0) {
          c.b().o(td, uArrayList);
       }
       return;
    }
}
