package eub.p;
import io.reactivex.g;
import eub.q$a;
import y26.b$a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;
import java.util.Objects;
import eub.q;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import kotlin.Pair;
import java.lang.Double;
import g6c.m;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import com.yxcorp.gifshow.postwork.PostStatus;
import r26.a;
import nsd.u;
import brd.g;

public final class p implements g	// class@002831
{
    public final q$a b;
    public final b$a c;

    public void p(q$a p0,b$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       Object[] objArray = new Object[0];
       a.D().w("EditPageNoUiToShareParamStageImpl", "onNextStep complete", objArray);
       q$a b = this.b.b;
       Objects.requireNonNull(b);
       Object[] objArray1 = null;
       if (!PatchProxy.applyVoid(objArray1, b, q.class, "4")) {
          q j = b.j;
          if (j != null) {
             a.m(j);
             j.dismiss();
             b.j = objArray1;
          }
       }
       m om = new m(null, null, null, null, this.c, 15, null);
       p0.onNext(new Pair(Double.valueOf(100.00f), v10));
       p0.onComplete();
       return;
    }
}
