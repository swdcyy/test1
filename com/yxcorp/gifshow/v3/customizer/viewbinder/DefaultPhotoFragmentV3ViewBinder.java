package com.yxcorp.gifshow.v3.customizer.viewbinder.DefaultPhotoFragmentV3ViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.DefaultPhotoFragmentV3ViewBinder$a;
import nsd.u;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
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
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.EditAbilityConfig;
import com.kuaishou.android.post.PostPageArg;
import com.yxcorp.gifshow.v3.v;
import java.lang.Boolean;
import android.view.View;
import k2b.s;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.FrameLayout;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import ooc.h;
import android.widget.RelativeLayout;
import android.text.TextPaint;
import faa.a;
import q87.c;
import android.view.ViewGroup;
import java.lang.StringBuilder;
import ekd.m1;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout;
import com.yxcorp.gifshow.widget.PicturesContainer;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import usd.q;
import android.graphics.drawable.Drawable;
import elb.x;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import soc.i;
import com.kuaishou.viewbinder.BaseViewBinder;

public final class DefaultPhotoFragmentV3ViewBinder extends AbsPhotoFragmentV3ViewBinder	// class@000d64
{
    public final int A;
    public int B;
    public boolean C;
    public RelativeLayout x;
    public RecyclerView y;
    public final int z;
    public static final DefaultPhotoFragmentV3ViewBinder$a D;

    static {
       DefaultPhotoFragmentV3ViewBinder.D = new DefaultPhotoFragmentV3ViewBinder$a(null);
    }
    public void DefaultPhotoFragmentV3ViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
       this.z = a1.e(5.00f);
       this.A = a1.e(38.00f);
    }
    public void l0(RectF p0,RectF p1,RectF p2){
       int i;
       String str1;
       int i1;
       float this;
       ViewGroup$LayoutParams layoutParams1;
       DefaultPhotoFragmentV3ViewBinder x1;
       float f;
       DefaultPhotoFragmentV3ViewBinder uDefaultPhot = this;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DefaultPhotoFragmentV3ViewBinder.class, "4")) {
          return;
       }
       a.p(obj, "limitRect");
       a.p(obj1, "originLayoutRect");
       a.p(obj2, "customTransformRect");
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
          EditAbilityConfig dEFAULT = EditAbilityConfig.DEFAULT;
          a.o(dEFAULT, "EditAbilityConfig.DEFAULT");
          boolean b1 = v.b(this.N(), i.g().getEditAbilityConfig().get(dEFAULT));
          boolean b2 = v.c(this.z(), this.N());
          c uoc1 = this.N();
          String str = "DefaultPhotoFragmentV3ViewBinder";
          i = 0;
          if (PatchProxy.isSupport(DefaultPhotoFragmentV3ViewBinder.class) && (!PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b1), Boolean.valueOf(b2), uoc1, this, DefaultPhotoFragmentV3ViewBinder.class, "5") && (this.K() == null || uDefaultPhot.x == null))) {
             str1 = str;
             i1 = 0;
          }else if(b2 && uDefaultPhot.C == null){
             i oi = i.m();
             a.o(oi, "PostSession.current\(\)");
             if (oi.M()) {
                s.d("SEND_MESSAGE");
             }
          }
          if (b1 && uDefaultPhot.C == null) {
             s.d("EDIT_PUBLISH_PHOTO");
          }
          int b3 = true;
          uDefaultPhot.C = b3;
          ViewGroup$LayoutParams layoutParams = this.J().getLayoutParams();
          String str2 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams";
          Objects.requireNonNull(layoutParams, str2);
          this = 0x3f19999a;
          if (!b2) {
             this.I().setVisibility(4);
             View view = this.K();
             a.m(view);
             view.setVisibility(i);
             view = this.K();
             a.m(view);
             layoutParams1 = view.getLayoutParams();
             Objects.requireNonNull(layoutParams1, str2);
             str1 = str;
             h.g(this.z(), this.L(), this.M(), this.K(), uoc1, false, false);
             DefaultPhotoFragmentV3ViewBinder x = uDefaultPhot.x;
             a.m(x);
             int i2 = (int)((float)x.getMeasuredWidth() * this);
             layoutParams1.width = i2;
             x1 = uDefaultPhot.x;
             a.m(x1);
             layoutParams1.leftMargin = (x1.getMeasuredWidth() - i2) / 2;
          }else {
             str1 = str;
             i1 = 0;
             f = 19.00f;
             if (!b1) {
                this.I().setVisibility(i1);
                this.s0();
                layoutParams1 = this.I().getLayoutParams();
                Objects.requireNonNull(layoutParams1, str2);
                x1 = uDefaultPhot.x;
                if (x1 != null) {
                   int this1 = (int)((float)(x1.getMeasuredWidth() - (a1.e(f) * 2)) * this);
                   layoutParams1.width = this1;
                   layoutParams.rightMargin = ((x1.getMeasuredWidth() - this1) / 2) - uDefaultPhot.z;
                   layoutParams.bottomMargin = (layoutParams1.bottomMargin + uDefaultPhot.A) - uDefaultPhot.B;
                }
             }else {
                this.I().setVisibility(i1);
                View TextPaint view1 = this.K();
                a.m(view1);
                view1.setVisibility(i1);
                this.s0();
                h.g(this.z(), this.L(), this.M(), this.K(), uoc1, false, false);
                view1 = this.I().findViewById(R.id.next_step_button_text);
                a.o(view1, "nextStepButton.findViewB¡­id.next_step_button_text\)");
                view1 = view1.getPaint();
                a.o(view1, "nextStepButton.findViewB¡­t_step_button_text\).paint");
                view1.setFakeBoldText(b3);
                view1 = this.K();
                a.m(view1);
                ViewGroup$LayoutParams view11 = view1.getLayoutParams();
                Objects.requireNonNull(view11, str2);
                ViewGroup$LayoutParams layoutParams2 = this.I().getLayoutParams();
                Objects.requireNonNull(layoutParams2, str2);
                layoutParams2.addRule(b3, R.id.post_button_v2);
                layoutParams2.leftMargin = a1.e(16.00f);
                b3 = a1.e(54.00f);
                x1 = uDefaultPhot.x;
                a.m(x1);
                int i3 = (x1.getMeasuredWidth() - b3) / 2;
                DefaultPhotoFragmentV3ViewBinder x2 = uDefaultPhot.x;
                a.m(x2);
                view11.width = i3;
                layoutParams2.width = (x2.getMeasuredWidth() - b3) - i3;
                layoutParams.rightMargin = a1.e(f) - uDefaultPhot.z;
                layoutParams.bottomMargin = (layoutParams2.bottomMargin + uDefaultPhot.A) - uDefaultPhot.B;
                Object[] objArray1 = new Object[i1];
                a.D().w(str1, "adjustPostNextButtonSize", objArray1);
             }
          }
          h.h(this.I());
          Object[] objArray = new Object[i1];
          a.D().w(str1, "onPreviewLayoutChange limitRect:"+obj+", originLayoutRect:"+obj1+", "+"customTransformRect:"+obj2, objArray);
          return;
       }
    }
    public void s(View p0){
       Object[] objArray1;
       ViewGroup$LayoutParams layoutParams1;
       ViewGroup$LayoutParams height;
       DefaultPhotoFragmentV3ViewBinder uDefaultPhot = DefaultPhotoFragmentV3ViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uDefaultPhot, "1")) {
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
       this.y = m1.f(p0, 0x7f0a00ab);
       this.j0().setUndersideView(this.g0());
       this.k0();
       Object[] objArray = null;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, uDefaultPhot, "7")) {
          Object[] objArray2 = new Object[i];
          a.D().w("DefaultPhotoFragmentV3ViewBinder", "adjustBottomPostLayout: ", objArray2);
          if (PostExperimentUtils.Y0()) {
             uDefaultPhot = this.x;
             if (uDefaultPhot != null) {
                layoutParams1 = uDefaultPhot.getLayoutParams();
                height = layoutParams1.height;
                layoutParams1.height = a1.d(0x7f070319);
                if (layoutParams1 instanceof RelativeLayout$LayoutParams) {
                   layoutParams1.bottomMargin = a1.e(8.50f);
                }
                this.B = q.n((height - layoutParams1.height), i);
                uDefaultPhot.setLayoutParams(layoutParams1);
             }
             View view2 = this.K();
             int i1 = 0x7f070309;
             if (view2 != null) {
                height = view2.getLayoutParams();
                height.height = a1.d(i1);
                view2.setLayoutParams(height);
             }
             FrameLayout uFrameLayout = this.I();
             height = uFrameLayout.getLayoutParams();
             height.height = a1.d(i1);
             uFrameLayout.setLayoutParams(height);
             uDefaultPhot = this.y;
             if (uDefaultPhot != null) {
                layoutParams1 = uDefaultPhot.getLayoutParams();
                Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                layoutParams1.bottomMargin = a1.d(0x7f070335);
                uDefaultPhot.setLayoutParams(layoutParams1);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, AbsPhotoFragmentV3ViewBinder.class, "14") && PostExperimentUtils.b1()) {
          objArray1 = new Object[i];
          a.D().w("AbsPhotoFragmentV3ViewBinder", "adjustMaskViewShadow: ", objArray1);
          AbsPhotoFragmentV3ViewBinder tu = this.u;
          String str = "childView";
          if (tu != null) {
             tu = tu.findViewById(R.id.edit_tab_mask_animate);
             a.o(tu, str);
             tu.setBackground(a1.f(R.drawable.arg_RES_7f0808fa));
          }
          tu = this.v;
          if (tu != null) {
             View view1 = tu.findViewById(R.id.edit_bottom_mask_animate);
             a.o(view1, str);
             view1.setBackground(a1.f(R.drawable.arg_RES_7f080825));
             ViewGroup$LayoutParams layoutParams = tu.getLayoutParams();
             layoutParams.height = a1.d(0x7f0702ae);
             tu.setLayoutParams(layoutParams);
          }
       }
    label_01b0 :
       objArray1 = new Object[i];
       a.D().w("DefaultPhotoFragmentV3ViewBinder", "bindView", objArray1);
       return;
    }
    public final void s0(){
       if (PatchProxy.applyVoid(null, this, DefaultPhotoFragmentV3ViewBinder.class, "6")) {
          return;
       }
       if (x.a()) {
          String str = x.c();
          if (!TextUtils.x(str)) {
             this.J().setText(str);
             this.J().setVisibility(0);
          }
       }
       return;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultPhotoFragmentV3ViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.fragment_photos_edit_preview_v3_full_screen, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­screen, container, false\)");
       return view;
    }
    public e y(EditorManager p0,Workspace$Type p1,Workspace$Source p2,EditorDelegate p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, DefaultPhotoFragmentV3ViewBinder.class, "2");
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
