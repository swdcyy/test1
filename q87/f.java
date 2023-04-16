package q87.f;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.lang.String;
import q87.e;
import java.lang.Object;
import com.kwai.logger.KwaiLog;
import java.util.List;
import q87.b;
import java.util.Iterator;
import q87.g;
import r87.i;
import r87.g;
import r87.q$b;
import r87.s;
import r87.q;
import r87.q$a;

public class f	// class@00224a
{
    public static Map a;

    static {
       f.a = new ConcurrentHashMap();
    }
    public static Map a(){
       return f.a;
    }
    public static synchronized e b(String p0){
       g og;
       int i;
       b f;
       _monitor_enter(f.class);
       e uoe = f.a.get(p0);
       if (uoe != null) {
          _monitor_exit(f.class);
          return uoe;
       }else {
          List list = KwaiLog.a.e();
          e uoe1 = null;
          if (list != null) {
             Iterator iterator = list.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   og = iterator.next();
                   if ((og.a).equals(p0)) {
                   label_0032 :
                      if (og == null) {
                         break ;
                      }else {
                         i oi = i.class;
                         _monitor_enter(oi);
                         g og1 = i.a.get(p0);
                         _monitor_exit(oi);
                         if (og1 == null) {
                            _monitor_exit(f.class);
                            return uoe1;
                         }else {
                            q$b uob = new q$b();
                            uob.c = og.d;
                            i = KwaiLog.a.c();
                            uob.d = i;
                            b a = KwaiLog.a;
                            b e = a.e;
                            uob.a = e;
                            f = a.f;
                            uob.b = f;
                            q oq = new q(e, f, uob.c, i, null);
                            s os = new s(og, og1);
                            f.a.put(p0, os);
                            _monitor_exit(f.class);
                            return os;
                         }
                      }
                   }
                }
             }
             _monitor_exit(f.class);
             return uoe1;
          }
          og = uoe1;
          goto label_0032 ;
       }
    }
}
