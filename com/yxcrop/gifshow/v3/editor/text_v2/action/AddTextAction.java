package com.yxcrop.gifshow.v3.editor.text_v2.action.AddTextAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.kuaishou.edit.draft.TimeRange;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.TimeRange$b;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import hba.a;
import wnd.h;
import wnd.e;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.List;

public final class AddTextAction extends EditDraftAction	// class@000b03
{
    public final double currentTime;
    public final String defaultText;
    public final double duration;
    public final boolean isCommit;
    public final boolean isFirstAdd;
    public final DraftTextStyleInfo lastUsedStyleInfo;
    public final double openingDuration;

    public void AddTextAction(double p0,double p1,DraftTextStyleInfo p2,double p3,String p4,boolean p5,boolean p6){
       a.p(p4, "defaultText");
       super(false, 1, null);
       this.currentTime = p0;
       this.duration = p1;
       this.lastUsedStyleInfo = p2;
       this.openingDuration = p3;
       this.defaultText = p4;
       this.isFirstAdd = p5;
       this.isCommit = p6;
    }
    public void AddTextAction(double p0,double p1,DraftTextStyleInfo p2,double p3,String p4,boolean p5,boolean p6,int p7,u p8){
       DraftTextStyleInfo uDraftTextSt = (p7 & 0x04)? null: p2;
       String str = (p7 & 0x10)? "": p4;
       boolean b = (p7 & 0x20)? false: p5;
       boolean b1 = (p7 & 0x40)? true: p6;
       super(p0, p1, uDraftTextSt, p3, str, b, b1);
       return;
    }
    public final double getCurrentTime(){
       return this.currentTime;
    }
    public final TimeRange getTimeRange(){
       GeneratedMessageLite generatedMes;
       TimeRange$b obj = PatchProxy.apply(null, this, AddTextAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isFirstAdd != null) {
          obj = TimeRange.newBuilder();
          obj.b(this.openingDuration);
          obj.a(this.duration);
          generatedMes = obj.build();
          a.o(generatedMes, "TimeRange.newBuilder\(\).s¡­uration\(duration\).build\(\)");
       }else {
          obj = TimeRange.newBuilder();
          obj.b(this.currentTime);
          obj.a((this.duration - this.currentTime));
          generatedMes = obj.build();
          a.o(generatedMes, "TimeRange.newBuilder\(\).s¡­on - currentTime\).build\(\)");
       }
       return generatedMes;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AddTextAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          AddTextAction tlastUsedSty = this.lastUsedStyleInfo;
          if (tlastUsedSty == null) {
             tlastUsedSty = h.o();
          }
          AddTextAction uAddTextActi = tlastUsedSty;
          int i = e.a();
          TimeRange timeRange = this.getTimeRange();
          Object[] objArray = new Object[0];
          a.D().w("AddTextAction", "timeRange start="+timeRange.getStart()+" duration="+timeRange.getDuration(), objArray);
          if (!uoa.D()) {
             uoa.c0();
          }
          h.b(uoa, i, this.defaultText, timeRange, uAddTextActi, false, null, 0, 0, 448, null);
          if (this.isCommit != null) {
             uoa.f();
          }
       }
       return;
    }
}
