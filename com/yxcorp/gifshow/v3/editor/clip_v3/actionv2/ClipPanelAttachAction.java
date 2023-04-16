package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.ClipPanelAttachAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import cq.a;
import q87.c;
import haa.a;
import kba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import maa.a;
import com.yxcorp.gifshow.v3.editor.clip_v3.ClipUtils;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import faa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Workspace;
import yoc.j;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;

public final class ClipPanelAttachAction extends EditSdkAction	// class@000dac
{

    public void ClipPanelAttachAction(){
       super();
    }
    public void performAction(c p0,c p1){
       double d;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipPanelAttachAction.class, "1")) {
          return;
       }
       String str = "workspaceDraft";
       a.p(p0, str);
       a.p(p1, "store");
       super.performAction(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("ClipPanelAttachAction", "performAction", objArray);
       a.a.u(p0).c0();
       a.c(p0).c0();
       ClipUtils c = ClipUtils.c;
       Objects.requireNonNull(c);
       Object obj = PatchProxy.applyOneRefs(p0, c, ClipUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          d = obj.doubleValue();
       }else {
          a.p(p0, str);
          Object[] objArray1 = new Object[i];
          a.D().w("ClipUtils", "loadTotalMaxLimitDuration", objArray1);
          Workspace workspace = p0.v();
          d = 0;
          double editSplitLim = (workspace != null)? workspace.getEditSplitLimitDuration(): d;
          if (j.a(editSplitLim, d)) {
             d = LongVideoLocalProject.d();
          }else {
             d = editSplitLim;
          }
       }
       Objects.requireNonNull(c);
       ClipUtils.a = d;
       return;
    }
}
