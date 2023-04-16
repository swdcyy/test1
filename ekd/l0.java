package ekd.l0;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Boolean;
import java.util.Collection;
import java.util.Iterator;

public class l0	// class@000d5a
{
    public ConcurrentHashMap a;
    public Runnable b;
    public boolean c;

    public void l0(Runnable p0,String[] p1){
       super();
       this.c = true;
       this.a = new ConcurrentHashMap(p1.length);
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          this.a.put(p1[i], Boolean.TRUE);
       }
       this.b = p0;
       return;
    }
    public void l0(String[] p0){
       super(null, p0);
    }
    public void a(String p0){
       this.a.put(p0, Boolean.TRUE);
    }
    public void b(String p0){
       l0 ol0;
       this.a.put(p0, Boolean.FALSE);
       Iterator iterator = this.a.values().iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().booleanValue()) {
                ol0 = null;
             }
          }else {
             ol0 = 1;
          }
          if (ol0) {
             ol0 = this.b;
             if (ol0 != null && this.c != null) {
                ol0.run();
                break ;
             }
          }
          break ;
       }
       return;
    }
}
