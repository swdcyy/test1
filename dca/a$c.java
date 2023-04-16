package dca.a$c;
import com.yxcorp.gifshow.widget.m;
import dca.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lnc.g7;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingEditAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadListAction;

public final class a$c extends m	// class@001eec
{
    public final a c;

    public void a$c(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       a.p(p0, "v");
       EditorDelegate uEditorDeleg = this.c.p.f();
       a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
       boolean b = g7.a(uEditorDeleg.N());
       this.c.k.t0(new VideoTemplateLoadingEditAction((b ^ 0x01), b));
       if (!b) {
          this.c.k.t0(new VideoTemplateLoadListAction());
       }
       return;
    }
}
