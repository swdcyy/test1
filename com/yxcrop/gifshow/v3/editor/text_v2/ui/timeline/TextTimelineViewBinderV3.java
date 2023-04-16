package com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineViewBinderV3;
import yld.j;
import androidx.fragment.app.Fragment;
import amd.c;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import voc.o;
import nsd.u;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import android.widget.TextView;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineViewBinderV3$ttsFragment$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import android.widget.LinearLayout;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import xld.c;
import xld.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.v3.editor.k;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineViewBinderV3$a;
import android.view.View$OnClickListener;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineViewBinderV3$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import wnd.g;
import xld.b;
import jod.a;
import java.util.List;
import com.yxcorp.gifshow.v3.widget.TimelineCoreView;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import com.yxcorp.gifshow.widget.adv.ITimelineView;

public final class TextTimelineViewBinderV3 extends j	// class@000b5d
{
    public final SelectShapeLinearLayout o;
    public final SelectShapeLinearLayout p;
    public final TextView q;
    public final p r;
    public final EditorDelegate s;
    public final boolean t;

    public void TextTimelineViewBinderV3(Fragment p0,c p1,View p2,EditorDelegate p3,boolean p4){
       int i = this;
       Object obj = p3;
       a.p(p0, "fragment");
       a.p(p1, "viewModel");
       a.p(p2, "rootView");
       a.p(obj, "editorDelegate");
       View view = p3.z();
       Objects.requireNonNull(view, "null cannot be cast to non-null type com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView");
       View view1 = view;
       o oo = p3.x();
       a.o(oo, "editorDelegate.editorContext");
       super(p2, p1, p0, view1, oo, false, 32, null);
       i.s = obj;
       i.t = p4;
       view = p2.findViewById(R.id.add_text);
       a.o(view, "rootView.findViewById\(R.id.add_text\)");
       i.o = view;
       view = p2.findViewById(R.id.text_to_speech);
       a.o(view, "rootView.findViewById\(R.id.text_to_speech\)");
       i.p = view;
       view = p2.findViewById(R.id.text_to_speech_tv);
       a.o(view, "rootView.findViewById\(R.id.text_to_speech_tv\)");
       i.q = view;
       i.r = s.c(new TextTimelineViewBinderV3$ttsFragment$2(this));
    }
    public void B(){
       Workspace$Type type;
       TextTimelineViewBinderV3 textTimeline = TextTimelineViewBinderV3.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, textTimeline, "2")) {
          return;
       }
       super.B();
       if (!PatchProxy.applyVoid(objArray, this, textTimeline, "7")) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          a.D().w("TextTimelineViewBinderV3", "onSetVisibility", objArray1);
          c uoc = this.s.N();
          a.o(uoc, "editorDelegate.workspaceDraft");
          type = uoc.a1();
          int i1 = 8;
          if (!f.A(type)) {
             this.o.setVisibility(i);
             if (f.E(type) || type == Workspace$Type.PHOTO_MOVIE) {
                this.p.setVisibility(i1);
             }else {
                this.p.setVisibility(i);
             }
          }else {
             this.o.setVisibility(i1);
             this.p.setVisibility(i1);
          }
       }
       if (PostExperimentUtils.G((this.P().o0().u() ^ 1))) {
          View view = this.s.z();
          Objects.requireNonNull(view, "null cannot be cast to non-null type com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView");
          k.f().j(view.getVideoProject());
       }
       this.V();
       this.p.setOnClickListener(new TextTimelineViewBinderV3$a(this));
       this.o.setOnClickListener(new TextTimelineViewBinderV3$b(this));
       this.E().V0(1);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, TextTimelineViewBinderV3.class, "3")) {
          return;
       }
       super.C();
       this.E().V0(false);
       return;
    }
    public final void V(){
       if (PatchProxy.applyVoid(null, this, TextTimelineViewBinderV3.class, "6")) {
          return;
       }
       int i = this.P().o0().o();
       if (this.E().p0(i) != null) {
          this.p.setSelected(false);
          if (g.a.e(i, this.P())) {
             this.q.setText(R.string.arg_RES_7f100ca8);
          }else {
             this.q.setText(R.string.arg_RES_7f100ced);
          }
       }else {
          this.p.setSelected(true);
          this.q.setText(R.string.arg_RES_7f100ced);
       }
       return;
    }
    public void x(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextTimelineViewBinderV3.class, "4")) {
       }else {
          a.p(p0, "newState");
          a.p(p1, "lastState");
          super.x(p0, p1);
          if (p0.o() != p1.o()) {
             this.V();
          }
          if (p0.E().d() != p1.E().d()) {
             Object[] objArray = new Object[0];
             a.D().s("timeline_tag", "Text notify!!!", objArray);
             this.T(p0.r().b());
             this.J().getTimeLineView().v(p0.r().b()).E();
          }
       }
       return;
    }
}
