package com.yxcrop.gifshow.v3.editor.text_v2.action.TTSApplyAllChangeAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jba.a;
import wnd.g;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.List;
import faa.a;
import q87.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Tts$b;
import com.google.protobuf.GeneratedMessageLite;

public final class TTSApplyAllChangeAction extends EditDraftAction	// class@000b09
{
    public final boolean commit;
    public final boolean isChecked;

    public void TTSApplyAllChangeAction(boolean p0,boolean p1){
       super(false, 1, null);
       this.isChecked = p0;
       this.commit = p1;
    }
    public void TTSApplyAllChangeAction(boolean p0,boolean p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public final boolean getCommit(){
       return this.commit;
    }
    public final boolean isChecked(){
       return this.isChecked;
    }
    public void performAction(c p0,c p1){
       g a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TTSApplyAllChangeAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.Z0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.ttsDraft ?: return");
          a = g.a;
          TTSApplyAllChangeAction tisChecked = this.isChecked;
          TTSApplyAllChangeAction tcommit = this.commit;
          Objects.requireNonNull(a);
          if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidThreeRefs(uoa, Boolean.valueOf(tisChecked), Boolean.valueOf(tcommit), a, g.class, "8")) {
             a.p(uoa, "ttsDraft");
             if (tcommit != null && !uoa.D()) {
                uoa.c0();
             }
             int i = 0;
             if (!uoa.z().size()) {
                Object[] objArray = new Object[i];
                a.D().w("TTSDraftUtil", "saveApplyToAll ttsDraft is empty, need append", objArray);
                uoa.b().build();
             }
             GeneratedMessageLite$Builder uBuilder = uoa.n(i);
             a.o(uBuilder, "ttsDraft.getBuilder\(0\)");
             uBuilder.d(tisChecked);
             uBuilder.build();
             if (tcommit != null) {
                uoa.f();
             }
          }
       }
       return;
    }
}
