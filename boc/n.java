package boc.n;
import java.lang.Runnable;
import java.util.List;
import t16.a;
import java.lang.Object;
import java.util.Iterator;
import boc.b;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import qfc.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class n implements Runnable	// class@000449
{
    public final List b;
    public final boolean c;
    public final a d;

    public void n(List p0,boolean p1,a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       n tb = this.b;
       n tc = this.c;
       n td = this.d;
       Iterator iterator = tb.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (tc != null) {
             n.B(uob, true, false, true, null, td);
          }else {
             n.o(uob, td);
          }
       }
       Object[] objArray = new Object[0];
       a.C().w("ResourceDownloadProgressHelper", "startDownloadCategory "+tb, objArray);
       return;
    }
}
