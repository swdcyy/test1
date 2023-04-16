package com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleRecSuccessAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hba.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import wnd.h;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.v3.model.SubtitleRecognizedInfo$SubtitleInfo;
import tvc.e;
import java.util.Objects;
import zmd.a;
import java.util.Iterator;
import java.lang.Iterable;
import xld.a;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import wnd.e;

public final class SubtitleRecSuccessAction extends EditDraftAction	// class@000ae4
{
    public final List list;

    public void SubtitleRecSuccessAction(List p0){
       a.p(p0, "list");
       super(false, 1, null);
       this.list = p0;
    }
    public final List getList(){
       return this.list;
    }
    public void performAction(c p0,c p1){
       Object obj = this;
       a obj1 = p0;
       e obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, SubtitleRecSuccessAction.class, "1")) {
          return;
       }
       a.p(obj1, "workspaceDraft");
       a.p(obj2, "store");
       super.performAction(p0, p1);
       obj1 = p0.W0();
       if (obj1 != null) {
          a.o(obj1, "workspaceDraft.textDraft ?: return");
          DraftTextStyleInfo uDraftTextSt = h.o();
          if (!obj1.D()) {
             obj1.c0();
          }
          int i = 0;
          int i1 = (obj.list.get(i).getType() != 4 && (obj.list.get(i).getType() == 2 || obj.list.get(i).getType() == 3))? 1: 0;
          obj2 = p1.f();
          Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.state.SubtitleRootState");
          Iterator iterator = obj.list.iterator();
          while (iterator.hasNext()) {
             SubtitleRecognizedInfo$SubtitleInfo subtitleInfo = iterator.next();
             double d = (double)subtitleInfo.getStartTime();
             float f = subtitleInfo.getEndTime() - subtitleInfo.getStartTime();
             double d1 = (double)f;
             if (i1) {
                double d2 = obj2.m() / obj2.n();
                d = d * d2;
                d1 = d1 * d2;
             }
             TimeRange$b uob = TimeRange.newBuilder();
             uob.b(d);
             uob.a(d1);
             GeneratedMessageLite generatedMes = uob.build();
             a.o(generatedMes, "timeRange");
             h.b(obj1, e.a(), subtitleInfo.getText(), generatedMes, uDraftTextSt, true, null, 0, 0, 448, null);
          }
       }
       return;
    }
}
