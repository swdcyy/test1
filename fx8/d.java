package fx8.d;
import erd.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import pb9.p;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.HashMap;
import pb9.g;
import pb9.k;

public final class d implements a	// class@002378
{
    public final c b;

    public void d(c p0){
       this.b = p0;
    }
    public final void run(){
       p op = p.e();
       String str = this.b.V0();
       Objects.requireNonNull(op);
       if (PatchProxy.applyVoidOneRefs(str, op, p.class, "11")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().s("FrameUploadManager", "remove, taskId="+str, objArray);
          g og = op.b.remove(str);
          if (og != null) {
             og.a();
          }
          k ok = op.c.remove(str);
          if (ok != null) {
             ok.b();
          }
       }
       return;
    }
}
