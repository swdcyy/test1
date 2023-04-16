package g19.l;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import jta.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;

public class l	// class@0023c8
{
    public final List a;

    public void l(){
       super();
       this.a = new CopyOnWriteArrayList();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public List b(){
       return this.a;
    }
    public void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.a.remove(p0);
       return;
    }
}
