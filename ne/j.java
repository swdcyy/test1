package ne.j;
import eb.c;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import java.lang.Object;
import eb.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Map;
import java.lang.ref.WeakReference;

public class j implements c	// class@0026fd
{
    public final MetaDiskCache b;

    public void j(MetaDiskCache p0){
       this.b = p0;
       super();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.b.g.remove(Integer.valueOf(p0.hashCode()));
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       this.b.g.put(Integer.valueOf(p0.hashCode()), new WeakReference(p0));
       return;
    }
}
