package com.yxcorp.gifshow.v3.AbsDefaultEditorActivityViewBinder;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lwc.h;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.AbsDefaultEditorActivityViewBinder$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import sm6.b;
import android.view.View;
import com.kuaishou.viewbinder.BaseViewBinder;
import ekd.m1;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import android.widget.FrameLayout;
import com.kwai.feature.post.api.flywheel.widget.FlyWheelFrameLayout;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.a1;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator;
import com.kwai.library.widget.button.KwaiRadioGroup;
import android.widget.RadioGroup;
import com.kwai.library.widget.button.SizeAdjustableRadioButton;
import java.util.Objects;
import android.widget.RadioButton;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kuaishou.ax2c.PreLoader;
import android.content.Context;
import ag6.a;

public abstract class AbsDefaultEditorActivityViewBinder extends AbsEditorActivityViewBinder	// class@000d0c
{
    public h s;
    public boolean t;

    public void AbsDefaultEditorActivityViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
       this.t = true;
    }
    public void G(h p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AbsDefaultEditorActivityViewBinder.class, "6")) {
          return;
       }
       a.p(p0, "editorPreviewViewModel");
       a.p(p1, "fragment");
       this.s = p0;
       p0.A0().observe(p1, new AbsDefaultEditorActivityViewBinder$a(this, p0));
       return;
    }
    public int p(){
       Object obj = PatchProxy.apply(null, this, AbsDefaultEditorActivityViewBinder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (b.d())? 0x7f0d002b: 0x7f0d002a;
       return i;
    }
    public void s(View p0){
       AbsDefaultEditorActivityViewBinder uAbsDefaultE = AbsDefaultEditorActivityViewBinder.class;
       AbsEditorActivityViewBinder uAbsEditorAc = AbsEditorActivityViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAbsDefaultE, "3")) {
          return;
       }
       a.p(p0, "rootView");
       this.d = p0;
       View view = m1.f(p0, R.id.left_btn);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.left_btn\)");
       String str = "<set-?>";
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsEditorAc, "2")) {
          a.p(view, str);
          this.e = view;
       }
       view = m1.f(p0, R.id.right_btn);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.right_btn\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsEditorAc, "4")) {
          a.p(view, str);
          this.f = view;
       }
       view = m1.f(p0, R.id.photo_visibility_btn);
       a.o(view, "ViewBindUtils.bindWidget¡­.id.photo_visibility_btn\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsEditorAc, "6")) {
          a.p(view, str);
          this.g = view;
       }
       view = m1.f(p0, R.id.left_btn_text);
       a.o(view, "ViewBindUtils.bindWidget¡­View, R.id.left_btn_text\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsEditorAc, "8")) {
          a.p(view, str);
          this.h = view;
       }
       view = m1.f(p0, R.id.left_btn_container);
       a.o(view, "ViewBindUtils.bindWidget¡­ R.id.left_btn_container\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsEditorAc, "10")) {
          a.p(view, str);
          this.i = view;
       }
       view = m1.f(p0, R.id.editor_activity_root);
       a.o(view, "ViewBindUtils.bindWidget¡­.id.editor_activity_root\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsEditorAc, "12")) {
          a.p(view, str);
          this.j = view;
       }
       view = m1.f(p0, R.id.title_root);
       a.o(view, "ViewBindUtils.bindWidget¡­ootView, R.id.title_root\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsEditorAc, "14")) {
          a.p(view, str);
          this.k = view;
       }
       int i = 4;
       this.D().setVisibility(i);
       view = m1.f(p0, R.id.recover_camera_btn);
       a.o(view, "ViewBindUtils.bindWidget¡­ R.id.recover_camera_btn\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsEditorAc, "16")) {
          a.p(view, str);
          this.l = view;
       }
       view = m1.f(p0, R.id.tabs_container);
       a.o(view, "ViewBindUtils.bindWidget¡­iew, R.id.tabs_container\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsEditorAc, "18")) {
          a.p(view, str);
          this.m = view;
       }
       view = m1.f(p0, R.id.title_tv);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.title_tv\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsEditorAc, "20")) {
          a.p(view, str);
          this.n = view;
       }
       view = m1.f(p0, R.id.container_all);
       a.o(view, "ViewBindUtils.bindWidget¡­View, R.id.container_all\)");
       if (!PatchProxy.applyVoidOneRefs(view, this, uAbsEditorAc, "24")) {
          a.p(view, str);
          this.q = view;
       }
       this.o = m1.f(p0, 0x7f0a0c80);
       FlyWheelFrameLayout uFlyWheelFra = this.y();
       if (uFlyWheelFra != null) {
          uFlyWheelFra.setVisibility(i);
       }
       p0 = m1.f(p0, R.id.edit_player_mask_view);
       a.o(p0, "ViewBindUtils.bindWidget¡­id.edit_player_mask_view\)");
       if (!PatchProxy.applyVoidOneRefs(p0, this, uAbsEditorAc, "22")) {
          a.p(p0, str);
          this.p = p0;
       }
       if (!PatchProxy.applyVoid(null, this, uAbsDefaultE, "7") && PostExperimentUtils.b1()) {
          this.C().setIndicatorColor(a1.a(R.color.arg_RES_7f0620c7));
          this.C().setIndicatorCornerColor(a1.a(R.color.arg_RES_7f0620c7));
          KwaiRadioGroup kwaiRadioGro = this.C().findViewById(R.id.radio_group);
          if (kwaiRadioGro != null) {
             int childCount = kwaiRadioGro.getChildCount();
             int i1 = 0;
             while (i1 < childCount) {
                if (kwaiRadioGro.getChildAt(i1) instanceof SizeAdjustableRadioButton) {
                   view = kwaiRadioGro.getChildAt(i1);
                   Objects.requireNonNull(view, "null cannot be cast to non-null type com.kwai.library.widget.button.SizeAdjustableRadioButton");
                   view.setShadowLayer(5.00f, view.getShadowDx(), view.getShadowDy(), view.getShadowColor());
                }
                i1 = i1 + 1;
             }
          }
       }
       return;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View orWait;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AbsDefaultEditorActivityViewBinder.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       int i = 0x7f0d002b;
       if (PostExperimentUtils.H0()) {
          PreLoader instance = PreLoader.getInstance();
          Context context = p0.getContext();
          if (!b.d()) {
             i = 0x7f0d002a;
          }
          orWait = instance.getOrWait(context, i, null, false);
          a.m(orWait);
          a.o(orWait, "PreLoader.getInstance\(\).¡­ty_editor, null, false\)!!");
       }else if(b.d()){
          i = 0x7f0d002a;
       }
       orWait = a.c(p0, i, p1, false);
       a.m(orWait);
       return orWait;
    }
}
