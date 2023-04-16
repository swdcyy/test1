package com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateChangedAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import eca.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import xoc.c;
import xoc.a;
import java.util.Objects;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import com.yxcorp.gifshow.v3.editor.aicut.util.AICutStyleFunnel$funnelTemplateSelect$1$1;
import msd.l;

public final class VideoTemplateChangedAction extends EditSdkAction	// class@001b7b
{
    public final g item;

    public void VideoTemplateChangedAction(g p0){
       a.p(p0, "item");
       super();
       this.item = p0;
    }
    public final g getItem(){
       return this.item;
    }
    public boolean needForceStartPlayer(){
       return true;
    }
    public void performAction(c p0,c p1){
       a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoTemplateChangedAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("VideoTemplateChangedAct", "performAction\(\) called ", objArray);
       VideoTemplate videoTemplat = this.item.b();
       if (videoTemplat != null) {
          c.a.c(p0, videoTemplat, this.item.g());
          a = a.a;
          VideoTemplateChangedAction titem = this.item;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(titem, a, a.class, "1") && titem != null) {
             PostFunnelManager.j.a().d().l(new AICutStyleFunnel$funnelTemplateSelect$1$1(titem));
          }
       }
       return;
    }
}
