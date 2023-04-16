package dl9.p$a;
import java.lang.Runnable;
import dl9.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.g;
import kotlin.jvm.internal.a;
import qvb.i;

public final class p$a implements Runnable	// class@001f90
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p$a.class, "1")) {
          return;
       }
       p$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, p.class, "5") && tb.r.kb()) {
          g og = tb.r.g7();
          a.o(og, "mFragment.originAdapter");
          if (!og.e1()) {
             tb.r.q().load();
          }
       }
       return;
    }
}
