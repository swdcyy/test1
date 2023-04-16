package e52.a;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import e52.a$a;

public class a	// class@00262a
{
    public List a;

    public void a(){
       super();
       this.a = new ArrayList();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          a$a uoa = iterator.next();
          if (uoa != null) {
             uoa.a();
          }
       }
       return;
    }
}
