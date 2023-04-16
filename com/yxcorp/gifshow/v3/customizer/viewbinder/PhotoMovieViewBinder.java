package com.yxcorp.gifshow.v3.customizer.viewbinder.PhotoMovieViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsVideoFragmentV3ViewBinder;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.customizer.viewbinder.PhotoMovieViewBinder$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager;
import roc.e;
import uoc.g;
import com.kuaishou.viewbinder.BaseViewBinder;
import android.view.View;
import nsd.u;
import com.yxcorp.gifshow.v3.customizer.viewbinder.PhotoMovieViewBinder$b;
import java.lang.Runnable;
import ekd.k1;
import ekd.m1;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.v3.widget.EditorContainer;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.widget.EditPreviewPlayControlView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.ax2c.PreLoader;
import android.content.Context;
import ag6.a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import soc.i;

public final class PhotoMovieViewBinder extends AbsVideoFragmentV3ViewBinder	// class@000d73
{
    public RecyclerView H;
    public g I;
    public boolean J;
    public d K;

    public void PhotoMovieViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
       this.K = new PhotoMovieViewBinder$a(this);
    }
    public void Q(){
       if (PatchProxy.applyVoid(null, this, PhotoMovieViewBinder.class, "6")) {
          return;
       }
       super.Q();
       c uoc = this.G();
       Objects.requireNonNull(uoc, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.BaseEditorFragment");
       BaseEditorFragment b = uoc.B;
       if (b != null) {
          b.M();
       }
       this.e0().f();
       return;
    }
    public void S(){
       if (PatchProxy.applyVoid(null, this, PhotoMovieViewBinder.class, "5")) {
          return;
       }
       super.S();
       if (this.I == null) {
          BaseViewBinder td = this.d;
          a.o(td, "rootView");
          g og = new g(td, this.G(), false, 4, null);
          this.I = v0;
       }
       k1.o(new PhotoMovieViewBinder$b(this));
       this.J = true;
       return;
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoMovieViewBinder.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.preview);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.preview\)");
       this.t0(view);
       this.u0(m1.f(p0, R.id.progress_bar));
       this.k0(m1.f(p0, R.id.container_other));
       this.r0(m1.f(p0, R.id.merge_edit_post_layout));
       this.a0(m1.f(p0, R.id.post_button_v2));
       view = m1.f(p0, R.id.next_step_button);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.next_step_button\)");
       this.Y(view);
       view = m1.f(p0, R.id.next_step_tip);
       a.o(view, "ViewBindUtils.bindWidget¡­tView,R.id.next_step_tip\)");
       this.Z(view);
       this.m0(m1.f(p0, R.id.edit_tab_mask));
       this.j0(m1.f(p0, R.id.edit_bottom_mask));
       this.l0(m1.f(p0, R.id.progress));
       this.n0(m1.f(p0, R.id.extra_component_container));
       view = m1.f(p0, R.id.player);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.player\)");
       this.s0(view);
       view = m1.f(p0, R.id.touch_view);
       a.o(view, "ViewBindUtils.bindWidget¡­ootView, R.id.touch_view\)");
       this.v0(view);
       view = m1.f(p0, R.id.frame_delete_shadow);
       a.o(view, "ViewBindUtils.bindWidget¡­R.id.frame_delete_shadow\)");
       this.o0(view);
       view = m1.f(p0, R.id.action_recycler_view);
       a.o(view, "ViewBindUtils.bindWidget¡­.id.action_recycler_view\)");
       this.H = view;
       this.h0().setUndersideView(this.f0());
       this.q0(m1.f(p0, R.id.preview_container_view));
       this.W(m1.f(p0, R.id.new_text_decoration_editor_view));
       this.d0();
       return;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View orWait;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhotoMovieViewBinder.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       if (PostExperimentUtils.H0()) {
          orWait = PreLoader.getInstance().getOrWait(p0.getContext(), R.layout.new_fragment_video_edit_preview_full_screen, p1, false);
          a.m(orWait);
          a.o(orWait, "PreLoader.getInstance\(\).¡­reen, container, false\)!!");
       }else {
          orWait = a.c(p0, R.layout.new_fragment_video_edit_preview_full_screen, p1, false);
          a.o(orWait, "inflater.inflate\(R.layou¡­screen, container, false\)");
       }
       return orWait;
    }
    public e y(EditorManager p0,Workspace$Type p1,Workspace$Source p2,EditorDelegate p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PhotoMovieViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "editorManager");
       a.p(p1, "type");
       a.p(p2, "source");
       a.p(p3, "editorDelegate");
       i oi = new i(p0, this.d, p1, p2, p3);
       this.p0(obj);
       return this.e0();
    }
}
