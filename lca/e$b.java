package lca.e$b;
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
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.FineTuningParam;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FineTuningParam$b;

public final class e$b implements a	// class@002dae
{
    public final c b;
    public final String c;
    public final c d;

    public void e$b(c p0,String p1,c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$b.class, "1")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("FineTuningPicTemplateProcessor", "apply: ", objArray1);
       a uoa = a.c(this.b);
       if (!uoa.D()) {
          return;
       }
       Asset$b uob = f.a(uoa, this.c);
       if (uob != null) {
          a uoa1 = this.d.o0();
          if (uoa1 != null) {
             Asset uAsset = uoa1.v();
             if (uAsset != null) {
                objArray = uAsset.getFineTuningParam();
             }
          }
          if (objArray == null) {
             uob.c();
          }else {
             uob.l(objArray.toBuilder().build());
          }
       }
       return;
    }
}
