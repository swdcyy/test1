package com.yxcorp.gifshow.v3.customizer.viewbinder.FullScreenPreviewViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsVideoFragmentV3ViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.FullScreenPreviewViewBinder$a;
import nsd.u;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.customizer.viewbinder.FullScreenPreviewViewBinder$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager;
import roc.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import uoc.g;
import com.kuaishou.viewbinder.BaseViewBinder;
import android.view.View;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import lwc.h;
import com.kuaishou.edit.draft.Asset$ShootInfo$Resolution;
import android.graphics.RectF;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.lang.Float;
import java.util.Collection;
import toc.d;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.customizer.viewbinder.FullScreenPreviewViewBinder$c;
import java.lang.Runnable;
import ekd.k1;
import ekd.m1;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.v3.widget.EditorContainer;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
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
import soc.n;
import soc.i;

public final class FullScreenPreviewViewBinder extends AbsVideoFragmentV3ViewBinder	// class@000d70
{
    public RecyclerView H;
    public boolean I;
    public d J;
    public static final FullScreenPreviewViewBinder$a K;

    static {
       FullScreenPreviewViewBinder.K = new FullScreenPreviewViewBinder$a(null);
    }
    public void FullScreenPreviewViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
       this.J = new FullScreenPreviewViewBinder$b(this);
    }
    public void Q(){
       if (PatchProxy.applyVoid(null, this, FullScreenPreviewViewBinder.class, "5")) {
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
       uoc = this.G();
       Objects.requireNonNull(uoc, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
       FragmentActivity activity = uoc.getActivity();
       if (activity != null) {
          BaseViewBinder td = this.d;
          a.o(td, "rootView");
          g og = new g(td, this.G(), false, 4, null);
          v7.b(activity);
       }
       return;
    }
    public void S(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FullScreenPreviewViewBinder.class, "4")) {
          return;
       }
       this.g0().b(this.B(), objArray);
       FlexScreenStatusData uFlexScreenS = this.B();
       Asset$ShootInfo$Resolution shootInfo$Re = this.D().E0();
       FullScreenPreviewViewBinder tJ = this.J;
       RectF limitRect = this.g0().getLimitRect();
       List list = this.D().w0();
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          Size size = iterator.next();
          float f = (float)size.b * 0x3f800000;
          f = f / (float)size.c;
          uArrayList.add(Float.valueOf(f));
       }
       this.g0().setOriginLayoutRect(tJ.b(uFlexScreenS, limitRect, uArrayList, shootInfo$Re));
       BaseEditorPreviewContainerLayout.e(this.g0(), true, false, 2, objArray);
       this.D().A0().setValue(this.g0().getOriginLayoutRect());
       k1.o(new FullScreenPreviewViewBinder$c(this));
       this.I = true;
       return;
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FullScreenPreviewViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.preview);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.preview\)");
       this.t0(view);
       this.u0(m1.f(p0, R.id.progress_bar));
       AbsVideoFragmentV3ViewBinder tw = this.w;
       if (tw != null) {
          tw.setVisibility(8);
       }
       this.k0(m1.f(p0, R.id.container_other));
       this.r0(m1.f(p0, R.id.merge_edit_post_layout));
       this.a0(m1.f(p0, R.id.post_button_v2));
       this.b0(m1.f(p0, R.id.post_button_v2_principal));
       this.c0(m1.f(p0, R.id.post_button_v2_secondary));
       view = m1.f(p0, R.id.next_step_button);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.next_step_button\)");
       this.Y(view);
       view = m1.f(p0, R.id.next_step_tip);
       a.o(view, "ViewBindUtils.bindWidget¡­View, R.id.next_step_tip\)");
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
       return;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View orWait;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FullScreenPreviewViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       if (p1 != null) {
          p1.setClipChildren(false);
       }
       if (PostExperimentUtils.H0()) {
          orWait = PreLoader.getInstance().getOrWait(p0.getContext(), R.layout.new_fragment_video_edit_preview_full_screen, p1, false);
          a.m(orWait);
          a.o(orWait, "PreLoader.getInstance\(\).¡­ontainer, false\n      \)!!");
       }else {
          orWait = a.c(p0, R.layout.new_fragment_video_edit_preview_full_screen, p1, false);
          a.o(orWait, "inflater.inflate\(R.layou¡­screen, container, false\)");
       }
       return orWait;
    }
    public e y(EditorManager p0,Workspace$Type p1,Workspace$Source p2,EditorDelegate p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, FullScreenPreviewViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "editorManager");
       a.p(p1, "type");
       a.p(p2, "source");
       a.p(p3, "editorDelegate");
       if (p3.I() >= 0) {
          BaseViewBinder td = this.d;
          a.o(td, "rootView");
          n on = new n(p0, td, p1, p2, p3);
       }else {
          i oi = new i(p0, this.d, p1, p2, p3);
       }
       this.p0(obj);
       return this.e0();
    }
}
