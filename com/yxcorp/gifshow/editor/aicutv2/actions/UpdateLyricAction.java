package com.yxcorp.gifshow.editor.aicutv2.actions.UpdateLyricAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import yaa.c;
import yaa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import tkd.b;
import tkd.d;
import kob.i;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.KSStore;
import java.util.Objects;
import cca.b;

public final class UpdateLyricAction extends EditSdkAction	// class@001b7a
{
    public final AICutStyle aiCutStyle;

    public void UpdateLyricAction(AICutStyle p0){
       super();
       this.aiCutStyle = p0;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UpdateLyricAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       if (this.aiCutStyle == null) {
          p0 = p0.J0();
          if (p0 != null) {
             a uoa = p0.f0();
             if (uoa != null) {
                uoa.d();
             }
          }
       }else {
          AICutStyle mLyricStyleI = this.aiCutStyle.mLyricStyleId;
          a.o(mLyricStyleI, "aiCutStyle.mLyricStyleId");
          e uoe = p1.b();
          Objects.requireNonNull(uoe, "null cannot be cast to non-null type com.yxcorp.gifshow.editor.aicutv2.state.VideoTemplateRootState");
          d.a(0x2be267d).K30(p0, mLyricStyleI, this.aiCutStyle.getLyricPositionX(), this.aiCutStyle.getLyricPositionY(), uoe.k, false);
       }
       return;
    }
}
