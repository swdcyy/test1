package eub.i$d;
import java.util.concurrent.Callable;
import eub.i;
import g6c.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import faa.a;
import q87.c;
import g6c.m;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import eub.a;
import xvc.f;
import qba.d;
import com.yxcorp.gifshow.activity.preview.f;
import kotlin.jvm.internal.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import java.lang.Double;
import java.lang.RuntimeException;

public final class i$d implements Callable	// class@002825
{
    public final i b;
    public final c c;

    public void i$d(i p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       Object[] objArray = null;
       Pair pair = PatchProxy.apply(objArray, this, i$d.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          int i = 0;
          Object[] objArray1 = new Object[i];
          a.D().w("EditPageNoUiPublishStageImpl", "loadProject", objArray1);
          c uoc = this.c.b().b();
          if (uoc != null) {
             i$d tb = this.b;
             boolean b = tb instanceof a;
             if (tb.f != null) {
                objArray1 = new Object[i];
                a.D().w("EditPageNoUiPublishStageImpl", "EditPageNoUiPublishStageImpl initDraft picture type skip", objArray1);
             }else {
                d uod = f.i(true, b);
                a.o(uod, "getWorkspaceLoaderConfig¡­ue, noUiPublishFromDraft\)");
                tb.l().f(uoc, uod, objArray);
                d uod1 = f.i(true, b);
                a.o(uod1, "getWorkspaceLoaderConfig¡­ue, noUiPublishFromDraft\)");
                objArray = this.b.l().i(uoc, uod1);
                this.b.n(uoc, objArray);
             }
             Object[] objArray2 = new Object[i];
             a.D().w("EditPageNoUiPublishStageImpl", "EditPageNoUiPublishStageImpl initDraft project build complete", objArray2);
             pair = new Pair(Double.valueOf(100.00f), objArray);
          }else {
             throw new RuntimeException("EditPageNoUiPublishStageImpl loadProject error draft is null");
          }
       }
       return pair;
    }
}
