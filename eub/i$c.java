package eub.i$c;
import erd.o;
import eub.i;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.Double;

public final class i$c implements o	// class@002824
{
    public final i b;

    public void i$c(i p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Pair pair = PatchProxy.applyOneRefs(p0, this, i$c.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          Object[] objArray = new Object[0];
          a.D().w("EditPageNoUiPublishStageImpl", "EditPageNoUiPublishStageImpl initDraft draft build complete", objArray);
          this.b.f = DraftUtils.V(p0);
          pair = new Pair(Double.valueOf(100.00f), p0);
       }
       return pair;
    }
}
