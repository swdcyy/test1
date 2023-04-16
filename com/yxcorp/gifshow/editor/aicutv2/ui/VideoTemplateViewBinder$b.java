package com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lnc.g7;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingEditAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import dca.s;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateClearAction;
import lnc.e7;

public final class VideoTemplateViewBinder$b extends m	// class@001b93
{
    public final VideoTemplateViewBinder c;

    public void VideoTemplateViewBinder$b(VideoTemplateViewBinder p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplateViewBinder$b.class, "1")) {
          return;
       }
       EditorDelegate uEditorDeleg = this.c.m.f();
       a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
       if (g7.a(uEditorDeleg.N())) {
          this.c.l.t0(new VideoTemplateLoadingEditAction(false, true));
          this.c.l.A0();
       }
       this.c.l.t0(new VideoTemplateClearAction());
       e7.c("ai_cut_origin");
       return;
    }
}
