package bg8.k;
import java.util.Comparator;
import java.util.Map;
import java.lang.Object;
import gg8.g;
import java.lang.Long;

public final class k implements Comparator	// class@000356
{
    public final Map b;

    public void k(Map p0){
       this.b = p0;
    }
    public final int compare(Object p0,Object p1){
       int i;
       k tb = this.b;
       if (p0 == null) {
          i = 1;
       }else if(p1 == null){
          i = -1;
       }else if(p0.equals(p1)){
          i = 0;
       }else {
          long l = 0;
          p0 = (tb.containsKey(p0.a))? tb.get(p0.a): Long.valueOf(l);
          p1 = (tb.containsKey(p1.a))? tb.get(p1.a): Long.valueOf(l);
          long l1 = (p1 != null)? p1.longValue(): l;
          if (p0 != null) {
             l = p0.longValue();
          }
          i = Long.compare(l1, l);
       }
       return i;
    }
}
