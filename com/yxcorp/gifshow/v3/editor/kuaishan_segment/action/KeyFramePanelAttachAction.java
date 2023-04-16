package com.yxcorp.gifshow.v3.editor.kuaishan_segment.action.KeyFramePanelAttachAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import vaa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import maa.a;
import qaa.a;

public final class KeyFramePanelAttachAction extends EditDraftAction	// class@00100d
{
    public final double curPlaybackPts;
    public final c draft;
    public final boolean isPlaying;
    public final double templateDuration;

    public void KeyFramePanelAttachAction(c p0,double p1,boolean p2,double p3){
       a.p(p0, "draft");
       super(false, 1, null);
       this.draft = p0;
       this.curPlaybackPts = p1;
       this.isPlaying = p2;
       this.templateDuration = p3;
    }
    public final double getCurPlaybackPts(){
       return this.curPlaybackPts;
    }
    public final c getDraft(){
       return this.draft;
    }
    public final double getTemplateDuration(){
       return this.templateDuration;
    }
    public final boolean isPlaying(){
       return this.isPlaying;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KeyFramePanelAttachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("KeyFramePanelAttachAction", "performAction", objArray);
       a uoa = a.m(p0);
       if (!uoa.D()) {
          uoa.c0();
       }
       uoa = a.c(p0);
       if (!uoa.D()) {
          uoa.c0();
       }
       a uoa1 = a.f(p0);
       if (!uoa1.D()) {
          uoa1.c0();
       }
       return;
    }
}
