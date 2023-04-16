package r87.k;
import java.lang.Runnable;
import java.lang.Object;
import r87.l;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import q87.d;
import com.kwai.logger.internal.LogService;

public final class k implements Runnable	// class@002322
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final void run(){
       List b = l.b;
       if (b.isEmpty()) {
       }else {
          _monitor_enter(b);
          b.clear();
          _monitor_exit(b);
          Iterator iterator = new ArrayList(b).iterator();
          while (iterator.hasNext()) {
             LogService.a(iterator.next());
          }
       }
       return;
    }
}
