package com.yxcorp.gifshow.v3.reedit.ReEditVideoFragmentV3ViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsVideoFragmentV3ViewBinder;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager;
import roc.e;
import ywc.c;
import android.widget.FrameLayout;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ekd.m1;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.v3.widget.EditorContainer;
import com.yxcorp.gifshow.v3.widget.EditPreviewPlayControlView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.widget.PassThroughEventView;
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
import com.kuaishou.viewbinder.BaseViewBinder;

public class ReEditVideoFragmentV3ViewBinder extends AbsVideoFragmentV3ViewBinder	// class@001620
{
    public RecyclerView H;

    public void ReEditVideoFragmentV3ViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
    }
    public void Q(){
       if (PatchProxy.applyVoid(null, this, ReEditVideoFragmentV3ViewBinder.class, "4")) {
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
       uoc = c.b;
       FrameLayout uFrameLayout = this.I();
       ReEditVideoFragmentV3ViewBinder tH = this.H;
       if (tH == null) {
          a.S("bottomRecyclerView");
       }
       uoc.a(uFrameLayout, tH);
       return;
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReEditVideoFragmentV3ViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.preview);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.preview\)");
       this.t0(view);
       this.u0(m1.f(p0, R.id.progress_bar));
       this.k0(m1.f(p0, R.id.container_other));
       view = m1.f(p0, R.id.next_step_button);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.next_step_button\)");
       this.Y(view);
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
       return;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View orWait;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReEditVideoFragmentV3ViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       if (PostExperimentUtils.H0()) {
          orWait = PreLoader.getInstance().getOrWait(p0.getContext(), R.layout.fragment_reedit_video_edit_preview, p1, false);
          a.m(orWait);
          a.o(orWait, "PreLoader.getInstance\(\).¡­view, container, false\)!!");
          return orWait;
       }else {
          orWait = a.c(p0, R.layout.fragment_reedit_video_edit_preview, p1, false);
          a.o(orWait, "inflater.inflate\(R.layou¡­review, container, false\)");
          return orWait;
       }
    }
    public e y(EditorManager p0,Workspace$Type p1,Workspace$Source p2,EditorDelegate p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, ReEditVideoFragmentV3ViewBinder.class, "2");
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
