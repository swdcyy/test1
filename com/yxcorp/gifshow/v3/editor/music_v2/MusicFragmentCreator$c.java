package com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$c;
import jn9.b$b;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator;
import java.lang.Object;
import nn9.a;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.v3.f;
import qrc.r;
import qrc.j;
import jn9.b;
import trc.t0;
import lsc.b0;
import com.yxcorp.gifshow.v3.editor.music_v2.action.RecoMusicFetchedAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import nn9.b;
import nn9.d;
import jn9.b$b$a;

public final class MusicFragmentCreator$c implements b$b	// class@00104d
{
    public final MusicFragmentCreator a;

    public void MusicFragmentCreator$c(MusicFragmentCreator p0){
       this.a = p0;
       super();
    }
    public void a(a p0,List p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicFragmentCreator$c.class, "1")) {
          return;
       }
       a.p(p0, "state");
       a.p(p1, "result");
       if (p0.a() == LoadingStatus.DATA_LOADING_FINISH) {
          MusicFragmentCreator$c ta = this.a;
          Objects.requireNonNull(ta);
          p1 = PatchProxy.apply(null, ta, MusicFragmentCreator.class, "17");
          if (p1 != PatchProxyResult.class) {
             b = p1.booleanValue();
          }else {
             c uoc = ta.d.N();
             a.o(uoc, "delegate.workspaceDraft");
             Workspace workspace = uoc.v();
             boolean b1 = (workspace != null)? f.d(workspace): false;
             if (b1 && ta.z.b().i != null) {
                b = true;
             }else {
                b = false;
             }
          }
          if (b) {
             b0.d(this.a.j(), null);
          }
          MusicFragmentCreator f = this.a.f;
          if (f != null) {
             f.t0(new RecoMusicFetchedAction());
          }
       }
       return;
    }
    public void b(b p0,b p1){
       PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicFragmentCreator$c.class, "2");
    }
    public void c(d p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicFragmentCreator$c.class, "3")) {
          return;
       }
       a.p(p0, "newState");
       b$b$a.b(this, p0, p1);
       return;
    }
}
