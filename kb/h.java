package kb.h;
import ab.h;
import java.lang.Object;
import java.util.WeakHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.Iterator;
import kb.h$b;
import com.facebook.datasource.AbstractDataSource;
import kb.h$a;

public class h implements h	// class@0024a4
{
    public final Set a;
    public h b;

    public void h(){
       super();
       this.a = Collections.newSetFromMap(new WeakHashMap());
       this.b = null;
    }
    public void b(h p0){
       this.b = p0;
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          h$b uob = iterator.next();
          if (!uob.isClosed()) {
             uob.q(p0);
          }
       }
       return;
    }
    public Object get(){
       h$b uob = new h$b(null);
       uob.q(this.b);
       this.a.add(uob);
       return uob;
    }
}
