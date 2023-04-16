package laa.u;
import java.lang.Runnable;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.edit.draft.model.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import haa.f;
import q87.c;
import haa.g;
import java.util.LinkedHashMap;
import java.lang.StringBuilder;

public final class u implements Runnable	// class@002d9d
{
    public final DraftFileManager b;
    public final c c;

    public void u(DraftFileManager p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       Object[] objArray1;
       u tc = this.c;
       DraftFileManager h = this.b.h;
       Objects.requireNonNull(h);
       if (PatchProxy.applyVoidOneRefs(tc, h, b0.class, "5")) {
       }else {
          int i = 1;
          Object[] objArray = new Object[i];
          objArray[0] = tc.D0();
          f.D().w("WorkspaceSimpleMapManager", "updateWorkspaceInSimpleMap\(\) called", objArray);
          g og = h.a(tc);
          if (og.a()) {
             h.b.put(og.a, og);
             objArray1 = new Object[i];
             objArray1[0] = og.a;
             f.D().w("WorkspaceSimpleMapManager", "updateWorkspaceInSimpleMap\(\) add to map", objArray1);
          }else {
             h.b.remove(og.a);
             objArray1 = new Object[i];
             objArray1[0] = og.a;
             f.D().w("WorkspaceSimpleMapManager", "updateWorkspaceInSimpleMap\(\) remove from map", objArray1);
          }
          Object[] objArray2 = new Object[0];
          f.D().w("WorkspaceSimpleMapManager", "updateWorkspaceInSimpleMap\(\) new size is "+h.b.size(), objArray2);
       }
       return;
    }
}
