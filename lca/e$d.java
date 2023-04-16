package lca.e$d;
import erd.a;
import lca.e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import qsc.a;
import wba.p;
import com.kuaishou.edit.draft.Workspace$Type;
import kotlin.jvm.internal.a;

public final class e$d implements a	// class@002db0
{
    public final e b;
    public final c c;

    public void e$d(e p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e$d.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FineTuningPicTemplateProcessor", "commit: ", objArray);
       this.b.g(this.c.o0());
       e$d tc = this.c;
       Workspace$Type type = tc.a1();
       a.o(type, "projectDraft.type");
       p.a.e(tc, type);
       return;
    }
}
