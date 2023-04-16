package ci0.a$a;
import androidx.lifecycle.Observer;
import ci0.a;
import java.lang.Object;
import tvc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.a;

public final class a$a implements Observer	// class@0004bf
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          a c = this.b.c;
          e uoe = (c != null)? c.get(): null;
          if (uoe != p0) {
             this.b.c = new WeakReference(p0);
             a.o(p0, "it");
             this.b.F(uoe, p0);
          }
       }
       return;
    }
}
