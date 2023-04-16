package lca.e$c;
import erd.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import maa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset$b;
import wba.f;

public final class e$c implements a	// class@002daf
{
    public final c b;
    public final String c;

    public void e$c(c p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FineTuningPicTemplateProcessor", "clear: ", objArray);
       a uoa = a.c(this.b);
       if (!uoa.D()) {
          return;
       }
       Asset$b uob = f.a(uoa, this.c);
       if (uob != null) {
          uob.c();
       }
       return;
    }
}
