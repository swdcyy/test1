package com.yxcorp.gifshow.v3.editor.frame_v2.action.FrameDetachAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.lang.String;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import taa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.m$k0;
import qr4.e$h;

public final class FrameDetachAction extends EditSdkAction	// class@000f95
{
    public final boolean isSave;
    public final String originBgTemplateId;
    public final String originFrameRatioString;

    public void FrameDetachAction(boolean p0,String p1,String p2){
       super();
       this.isSave = p0;
       this.originFrameRatioString = p1;
       this.originBgTemplateId = p2;
    }
    public void FrameDetachAction(boolean p0,String p1,String p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public final boolean isSave(){
       return this.isSave;
    }
    public void performAction(c p0,c p1){
       VideoContext videoContext;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrameDetachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       a uoa = p0.P0();
       if (uoa != null) {
          if (!uoa.D()) {
             return;
          }else {
             Object[] objArray = new Object[0];
             a.D().w("FrameDetachAction", "FrameDetachAction isSave="+this.isSave, objArray);
             if (this.isSave != null) {
                uoa.f();
             }else {
                uoa.j();
                FrameDetachAction toriginFrame = this.originFrameRatioString;
                if (toriginFrame != null) {
                   videoContext = p0.d1();
                   a.o(videoContext, "workspaceDraft.videoContext");
                   videoContext.F().b.M = toriginFrame;
                }
                toriginFrame = this.originBgTemplateId;
                if (toriginFrame != null) {
                   VideoContext videoContext1 = p0.d1();
                   a.o(videoContext1, "workspaceDraft.videoContext");
                   videoContext1.N = toriginFrame;
                }
             }
          }
       }
       return;
    }
}
