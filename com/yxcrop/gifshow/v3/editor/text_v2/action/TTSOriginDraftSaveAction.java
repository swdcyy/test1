package com.yxcrop.gifshow.v3.editor.text_v2.action.TTSOriginDraftSaveAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import rwc.j;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wnd.g;
import java.util.Objects;
import faa.a;
import q87.c;
import jba.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Tts;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.concurrent.CountDownLatch;
import wnd.f;
import java.lang.Runnable;
import t45.c;

public final class TTSOriginDraftSaveAction extends EditDraftAction	// class@000b16
{
    public final j originDraftRef;

    public void TTSOriginDraftSaveAction(){
       super(null, 1, null);
    }
    public void TTSOriginDraftSaveAction(j p0){
       super(false, 1, null);
       this.originDraftRef = p0;
    }
    public void TTSOriginDraftSaveAction(j p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public void performAction(c p0,c p1){
       g a;
       Object[] objArray1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TTSOriginDraftSaveAction.class, "1")) {
          return;
       }
       String str = "workspaceDraft";
       a.p(p0, str);
       a.p(p1, "store");
       super.performAction(p0, p1);
       a = g.a;
       TTSOriginDraftSaveAction toriginDraft = this.originDraftRef;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(toriginDraft, p0, a, g.class, "13")) {
          a.p(p0, str);
          int i = 0;
          Object[] objArray = new Object[i];
          String str1 = "TTSDraftUtil";
          a.D().w(str1, "saveOriginTtsDraft: ", objArray);
          a uoa = p0.Z0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.ttsDraft ?: return");
             if (toriginDraft != null) {
                if (uoa.v() == null) {
                   objArray1 = new Object[i];
                   a.D().w(str1, "saveOriginTtsDraft:  ttsdraft is null", objArray1);
                   toriginDraft.setValue(null);
                }else {
                   Tts tts = uoa.v();
                   a.m(tts);
                   a.o(tts, "ttsDraft.firstMessage!!");
                   if (!tts.getTtsAudiosCount()) {
                      objArray1 = new Object[i];
                      a.D().w(str1, "saveOriginTtsDraft:  ttsdraft size is 0", objArray1);
                      toriginDraft.setValue(null);
                   }else {
                      Ref$ObjectRef objectRef = new Ref$ObjectRef();
                      objectRef.element = new CountDownLatch(1);
                      c.a(new f(uoa, p0, toriginDraft, objectRef));
                   }
                }
             }
          }
       }
       return;
    }
}
