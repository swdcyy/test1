package com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationHandlerEndAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.Math;
import qsd.d;
import eba.a;
import wnd.h;
import com.kuaishou.edit.draft.StickerResult;
import wnd.g;
import jba.a;

public final class DecorationHandlerEndAction extends EditSdkAction	// class@000a2a
{
    public final boolean commitModify;
    public final boolean isSticker;
    public final ITimelineView$IRangeView$a rangeViewData;
    public final float scrollBlockSecond;

    public void DecorationHandlerEndAction(float p0,ITimelineView$IRangeView$a p1,boolean p2,boolean p3){
       a.p(p1, "rangeViewData");
       super();
       this.scrollBlockSecond = p0;
       this.rangeViewData = p1;
       this.isSticker = p2;
       this.commitModify = p3;
    }
    public void DecorationHandlerEndAction(float p0,ITimelineView$IRangeView$a p1,boolean p2,boolean p3,int p4,u p5){
       if (p4 & 0x04) {
          p2 = false;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final boolean getCommitModify(){
       return this.commitModify;
    }
    public final ITimelineView$IRangeView$a getRangeViewData(){
       return this.rangeViewData;
    }
    public final float getScrollBlockSecond(){
       return this.scrollBlockSecond;
    }
    public final boolean isSticker(){
       return this.isSticker;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationHandlerEndAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          if (this.isSticker == null && (this.commitModify != null && !uoa.D())) {
             uoa.c0();
          }
       label_0034 :
          if (this.scrollBlockSecond - (float)0 > 0 && this.rangeViewData.d() != null) {
             double d = this.rangeViewData.h();
             if (!(d - Math.floor(d)) - 0x3fe0000000000000) {
                d = d - 0x3f747ae147ae147b;
             }
             double d1 = (double)d.G0(d);
             double d2 = (double)d.G0(this.rangeViewData.j());
             if (this.isSticker != null) {
                a uoa1 = p0.U0();
                if (uoa1 != null) {
                   a.o(uoa1, "workspaceDraft.stickerDraft ?: return");
                   if (this.commitModify != null && !uoa1.D()) {
                      uoa1.c0();
                   }
                   h.p(uoa1, this.rangeViewData.e(), d1, d2);
                   if (this.commitModify != null) {
                      uoa1.f();
                   }
                }else {
                   return;
                }
             }else {
                h.q(uoa, this.rangeViewData.e(), d1, d2);
             }
          }
       label_00a5 :
          if (this.isSticker == null) {
             g.a.i(p0.Z0(), uoa, this.rangeViewData.e(), this.rangeViewData.h(), true);
             if (this.commitModify != null) {
                uoa.f();
             }
          }
       }
    label_00c7 :
       return;
    }
}
