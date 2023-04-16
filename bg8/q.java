package bg8.q;
import java.lang.Runnable;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.util.Iterator;
import nh8.b;
import com.mini.pms.packagemanager.model.MiniAppInfo;

public final class q implements Runnable	// class@00035c
{
    public final List b;
    public final int c;
    public final String d;

    public void q(List p0,int p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       q tb = this.b;
       q tc = this.c;
       q td = this.d;
       if (tb != null) {
          Iterator iterator = tb.iterator();
          while (iterator.hasNext()) {
             iterator.next().d(tc, td, null);
          }
       }
       return;
    }
}
