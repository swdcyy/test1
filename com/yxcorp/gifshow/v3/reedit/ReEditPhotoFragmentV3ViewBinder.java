package com.yxcorp.gifshow.v3.reedit.ReEditPhotoFragmentV3ViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder;
import com.yxcorp.gifshow.v3.reedit.ReEditPhotoFragmentV3ViewBinder$a;
import nsd.u;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.RectF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager;
import roc.e;
import wwc.n0;
import ywc.c;
import android.widget.FrameLayout;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import ekd.m1;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout;
import com.yxcorp.gifshow.widget.PicturesContainer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import soc.i;
import com.kuaishou.viewbinder.BaseViewBinder;

public final class ReEditPhotoFragmentV3ViewBinder extends AbsPhotoFragmentV3ViewBinder	// class@00161f
{
    public RecyclerView x;
    public static final ReEditPhotoFragmentV3ViewBinder$a y;

    static {
       ReEditPhotoFragmentV3ViewBinder.y = new ReEditPhotoFragmentV3ViewBinder$a(null);
    }
    public void ReEditPhotoFragmentV3ViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
    }
    public void l0(RectF p0,RectF p1,RectF p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReEditPhotoFragmentV3ViewBinder.class, "4")) {
          return;
       }
       a.p(p0, "limitRect");
       a.p(p1, "originLayoutRect");
       a.p(p2, "customTransformRect");
       super.l0(p0, p1, p2);
       c uoc = this.G();
       Objects.requireNonNull(uoc, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.BaseEditorFragment");
       BaseEditorFragment b = uoc.B;
       if (b != null) {
          b.M();
       }
       this.f0().f();
       n0.f();
       uoc = c.b;
       FrameLayout uFrameLayout = this.I();
       ReEditPhotoFragmentV3ViewBinder tx = this.x;
       if (tx == null) {
          a.S("bottomRecyclerView");
       }
       uoc.a(uFrameLayout, tx);
       Object[] objArray = new Object[0];
       a.D().w("ReEditPhotoFragmentV3ViewBinder", "onPreviewLayoutChange limitRect:"+p0+", originLayoutRect:"+p1+", "+"customTransformRect:"+p2, objArray);
       return;
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReEditPhotoFragmentV3ViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.touch_view);
       a.o(view, "ViewBindUtils.bindWidget¡­ootView, R.id.touch_view\)");
       this.r0(view);
       this.q0(m1.f(p0, R.id.edit_tab_mask));
       this.m0(m1.f(p0, R.id.edit_bottom_mask));
       view = m1.f(p0, R.id.preview_player_container);
       a.o(view, "ViewBindUtils.bindWidget¡­preview_player_container\)");
       this.p0(view);
       view = m1.f(p0, R.id.next_step_button);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.next_step_button\)");
       this.Y(view);
       view = m1.f(p0, R.id.pictures_container);
       a.o(view, "ViewBindUtils.bindWidget¡­ R.id.pictures_container\)");
       this.o0(view);
       p0 = m1.f(p0, R.id.action_recycler_view);
       a.o(p0, "ViewBindUtils.bindWidget¡­.id.action_recycler_view\)");
       this.x = p0;
       this.j0().setUndersideView(this.g0());
       this.k0();
       Object[] objArray = new Object[0];
       a.D().w("ReEditPhotoFragmentV3ViewBinder", "bindView", objArray);
       return;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReEditPhotoFragmentV3ViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.fragment_reedit_photos_edit_preview, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­review, container, false\)");
       return view;
    }
    public e y(EditorManager p0,Workspace$Type p1,Workspace$Source p2,EditorDelegate p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, ReEditPhotoFragmentV3ViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "editorManager");
       a.p(p1, "type");
       a.p(p2, "source");
       a.p(p3, "editorDelegate");
       i oi = new i(p0, this.d, p1, p2, p3);
       this.n0(obj);
       return this.f0();
    }
}
