package nod.d$b;
import androidx.lifecycle.Observer;
import nod.d;
import java.lang.Object;
import qod.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import voc.n;
import tvc.e;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import yld.l;
import kotlin.jvm.internal.a;
import xld.a;

public final class d$b implements Observer	// class@001e9c
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
       }else {
          a uoa = this.b.T().u0();
          Iterator iterator = this.b.v.iterator();
          while (iterator.hasNext()) {
             a uoa1 = iterator.next();
             if (uoa1 instanceof l) {
                a.o(p0, "newState");
                uoa1.x(p0, uoa);
             }
          }
       }
       return;
    }
}
