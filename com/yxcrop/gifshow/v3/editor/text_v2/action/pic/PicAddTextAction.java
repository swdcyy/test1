package com.yxcrop.gifshow.v3.editor.text_v2.action.pic.PicAddTextAction;
import jnd.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hba.a;
import wnd.h;
import wnd.e;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;

public final class PicAddTextAction extends EditDraftAction implements a	// class@000b1c
{
    public final List assetIdentifyList;
    public final boolean commit;
    public final String defaultText;
    public final DraftTextStyleInfo lastUsedStyleInfo;
    public final float moveX;
    public final float moveY;

    public void PicAddTextAction(List p0,DraftTextStyleInfo p1,float p2,float p3,boolean p4,String p5){
       a.p(p0, "assetIdentifyList");
       a.p(p5, "defaultText");
       super(false, 1, null);
       this.assetIdentifyList = p0;
       this.lastUsedStyleInfo = p1;
       this.moveX = p2;
       this.moveY = p3;
       this.commit = p4;
       this.defaultText = p5;
    }
    public void PicAddTextAction(List p0,DraftTextStyleInfo p1,float p2,float p3,boolean p4,String p5,int p6,u p7){
       if (p6 & 0x02) {
          p1 = null;
       }
       DraftTextStyleInfo uDraftTextSt = p1;
       float f = (p6 & 0x04)? 0x3f000000: p2;
       float f1 = (p6 & 0x08)? 0x3f000000: p3;
       boolean b = (p6 & 0x10)? false: p4;
       if (p6 & 0x20) {
          p5 = "";
       }
       super(p0, uDraftTextSt, f, f1, b, p5);
       return;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PicAddTextAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          PicAddTextAction tlastUsedSty = this.lastUsedStyleInfo;
          if (tlastUsedSty == null) {
             tlastUsedSty = h.o();
          }
          PicAddTextAction picAddTextAc = tlastUsedSty;
          int i = e.a();
          TimeRange$b uob = TimeRange.newBuilder();
          uob.b(0);
          uob.a(0x3ff0000000000000);
          GeneratedMessageLite generatedMes = uob.build();
          if (!uoa.D()) {
             uoa.c0();
          }
          a.o(generatedMes, "timeRange");
          h.a(uoa, i, this.defaultText, generatedMes, picAddTextAc, false, this.assetIdentifyList, this.moveX, this.moveY);
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
}
