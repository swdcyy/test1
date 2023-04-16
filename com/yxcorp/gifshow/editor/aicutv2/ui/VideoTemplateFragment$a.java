package com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateFragment$a;
import voc.y;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateFragment;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateFragment$a$a;
import java.lang.Runnable;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lnc.g7;
import dca.s;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingEditAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplatePanelDetachAction;
import h69.j;
import wyb.a;
import uxb.l;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import nsd.u;
import java.util.Map;
import nwc.c;
import t36.f;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateFragment$a$b;
import t36.f$a;
import com.yxcorp.gifshow.plugin.music.UpdateSelectSourceAction;
import com.yxcorp.gifshow.plugin.music.SelectSource;

public final class VideoTemplateFragment$a implements y	// class@001b90
{
    public final VideoTemplateFragment b;

    public void VideoTemplateFragment$a(VideoTemplateFragment p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       if (PatchProxy.applyVoid(null, this, VideoTemplateFragment$a.class, "3")) {
          return;
       }
       x.e(this);
       this.b.q.post(new VideoTemplateFragment$a$a(this));
       return;
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       if (PatchProxy.applyVoid(null, this, VideoTemplateFragment$a.class, "2")) {
          return;
       }
       EditorDelegate uEditorDeleg = VideoTemplateFragment.yh(this.b).f();
       a.o(uEditorDeleg, "helperContract.editorDelegate");
       boolean b = true;
       if (g7.a(uEditorDeleg.N())) {
          VideoTemplateFragment.zh(this.b).t0(new VideoTemplateLoadingEditAction(false, b));
          VideoTemplateFragment.zh(this.b).A0();
       }
       VideoTemplateFragment$a tb = this.b;
       BaseEditorFragment t = tb.t;
       a.o(t, "mEditorDelegate");
       c uoc = t.N();
       a.o(uoc, "mEditorDelegate.workspaceDraft");
       String str = j.d(uoc, b);
       VideoTemplatePanelDetachAction videoTemplat = new VideoTemplatePanelDetachAction(VideoTemplateFragment.yh(this.b), tb.J, false, str);
       VideoTemplateFragment.zh(this.b).t0(v8);
       BaseEditorFragment t1 = this.b.t;
       a.o(t1, "mEditorDelegate");
       l.g().K0(t1, new EditSdkAction());
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       if (PatchProxy.applyVoid(null, this, VideoTemplateFragment$a.class, "1")) {
          return;
       }
       EditorDelegate uEditorDeleg = VideoTemplateFragment.yh(this.b).f();
       a.o(uEditorDeleg, "helperContract.editorDelegate");
       if (g7.a(uEditorDeleg.N())) {
          VideoTemplateFragment.zh(this.b).t0(new VideoTemplateLoadingEditAction(false, true));
          VideoTemplateFragment.zh(this.b).A0();
       }
       VideoTemplatePanelDetachAction videoTemplat = new VideoTemplatePanelDetachAction(VideoTemplateFragment.yh(this.b), this.b.J, true, null, 8, null);
       VideoTemplateFragment.zh(this.b).t0(v9);
       BaseEditorFragment t = this.b.t;
       a.o(t, "mEditorDelegate");
       f.p0(t.u(), c.class).s0(VideoTemplateFragment$a$b.a);
       BaseEditorFragment t1 = this.b.t;
       a.o(t1, "mEditorDelegate");
       l.g().K0(t1, new UpdateSelectSourceAction(SelectSource.AI_CUT));
       return;
    }
    public void z2(){
       x.c(this);
    }
}
