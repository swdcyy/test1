package kv1.a$a;
import kv1.a;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Iterator;

public class a$a implements a	// class@002e07
{
    public final List a;

    public void a$a(){
       super();
       this.a = new ArrayList();
    }
    public void a(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().run();
       }
       return;
    }
}
