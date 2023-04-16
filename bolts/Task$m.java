package bolts.Task$m;
import bolts.a;
import java.util.Collection;
import java.lang.Object;
import bolts.Task;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public final class Task$m implements a	// class@000b65
{
    public final Collection a;

    public void Task$m(Collection p0){
       this.a = p0;
       super();
    }
    public Object a(Task p0){
       List list;
       if (!this.a.size()) {
          list = Collections.emptyList();
       }else {
          list = new ArrayList();
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             list.add(iterator.next().getResult());
          }
       }
       return list;
    }
}
