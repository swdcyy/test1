package com.yxcorp.gifshow.v3.customizer.viewbinder.AbsDisableNormalPublishPhotoFragmentViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsDisableNormalPublishPhotoFragmentViewBinder$a;
import nsd.u;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.RectF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import android.content.Intent;
import com.yxcorp.gifshow.v3.f;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager;
import roc.e;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.View;
import ekd.m1;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import com.yxcorp.gifshow.widget.PicturesContainer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import androidx.recyclerview.widget.RecyclerView;
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

public class AbsDisableNormalPublishPhotoFragmentViewBinder extends AbsPhotoFragmentV3ViewBinder	// class@000d59
{
    public RelativeLayout x;
    public RecyclerView y;
    public static final AbsDisableNormalPublishPhotoFragmentViewBinder$a z;

    static {
       AbsDisableNormalPublishPhotoFragmentViewBinder.z = new AbsDisableNormalPublishPhotoFragmentViewBinder$a(null);
    }
    public void AbsDisableNormalPublishPhotoFragmentViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
    }
    public void l0(RectF p0,RectF p1,RectF p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AbsDisableNormalPublishPhotoFragmentViewBinder.class, "4")) {
          return;
       }
       a.p(p0, "limitRect");
       a.p(p1, "originLayoutRect");
       a.p(p2, "customTransformRect");
       super.l0(p0, p1, p2);
       Activity uActivity = this.z();
       Intent intent = (uActivity != null)? uActivity.getIntent(): null;
       if (f.C(intent)) {
          return;
       }else {
          c uoc = this.G();
          Objects.requireNonNull(uoc, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.BaseEditorFragment");
          BaseEditorFragment b = uoc.B;
          if (b != null) {
             b.M();
          }
          this.f0().f();
          Object[] objArray = new Object[0];
          a.D().w("DisableNormalPublishPhotoFragmentViewBinder", "onPreviewLayoutChange limitRect:"+p0+", originLayoutRect:"+p1+", "+"customTransformRect:"+p2, objArray);
          return;
       }
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsDisableNormalPublishPhotoFragmentViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       this.x = m1.f(p0, 0x7f0a2b4e);
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
       view = m1.f(p0, R.id.next_step_tip);
       a.o(view, "ViewBindUtils.bindWidget¡­tView,R.id.next_step_tip\)");
       this.Z(view);
       this.a0(m1.f(p0, R.id.post_button_v2));
       this.b0(m1.f(p0, R.id.post_button_v2_principal));
       this.c0(m1.f(p0, R.id.post_button_v2_secondary));
       view = m1.f(p0, R.id.pictures_container);
       a.o(view, "ViewBindUtils.bindWidget¡­ R.id.pictures_container\)");
       this.o0(view);
       this.W(m1.f(p0, R.id.new_text_decoration_editor_view));
       this.y = m1.f(p0, 0x7f0a00ab);
       this.j0().setUndersideView(this.g0());
       this.k0();
       this.I().setVisibility(8);
       Object[] objArray = new Object[0];
       a.D().w("DisableNormalPublishPhotoFragmentViewBinder", "bindView", objArray);
       return;
    }
    public final RecyclerView s0(){
       return this.y;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AbsDisableNormalPublishPhotoFragmentViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.fragment_photos_edit_preview_v3_full_screen, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­screen, container, false\)");
       return view;
    }
    public e y(EditorManager p0,Workspace$Type p1,Workspace$Source p2,EditorDelegate p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, AbsDisableNormalPublishPhotoFragmentViewBinder.class, "2");
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
