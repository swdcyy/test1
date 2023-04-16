package bb3.j;
import erd.g;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;

public final class j implements g	// class@000363
{
    public final ArrayList b;

    public void j(ArrayList p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             ViewGroup viewGroup = iterator.next();
             if (viewGroup != null) {
                a.o(p0, "it");
                viewGroup.setAlpha(p0.floatValue());
                if (a.e(p0, 0)) {
                   viewGroup.setVisibility(4);
                }else {
                   viewGroup.setVisibility(0);
                }
             }
          }
       }
       return;
    }
}
