package eub.i$b;
import java.util.concurrent.Callable;
import eub.i;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.f;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.Workspace$Type;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.content.Intent;
import crd.a;
import android.util.Pair;
import zxb.r0;

public final class i$b implements Callable	// class@002823
{
    public final i b;
    public final List c;

    public void i$b(i p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       Workspace$Type[] obj;
       Workspace$Type type;
       c uoc = PatchProxy.apply(null, this, i$b.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          i$b tc = this.c;
          a.o(tc, "draftList");
          this.b.p(new f(tc));
          int i = 0;
          if (this.b.m() == null) {
             obj = this.c.get(i);
             a.o(obj, "draftList[0]");
             this.b.l().k(obj);
          }else {
             obj = new Workspace$Type[]{type};
             type = this.b.m();
             a.m(type);
             this.b.l().l(obj);
          }
          uoc = this.b.l().b();
          Object[] objArray = new Object[i];
          a.D().w("EditPageNoUiPublishStageImpl", "EditPageNoUiPublishStageImpl buildWorkspaceDraft targetDraft:"+uoc, objArray);
          i$b tb = this.b;
          r0.E(uoc, tb.c, tb.a);
       }
       return uoc;
    }
}
