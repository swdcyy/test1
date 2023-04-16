package com.yxcorp.gifshow.v3.customizer.viewbinder.DefaultVideoFragmentV4ViewBinder$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.customizer.viewbinder.DefaultVideoFragmentV4ViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import java.util.Objects;
import uoc.h;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.EditAbilityConfig;
import com.kuaishou.android.post.PostPageArg;
import com.yxcorp.gifshow.v3.v;
import android.view.View;
import android.app.Activity;
import android.widget.TextView;
import ooc.h;
import android.widget.FrameLayout;
import elb.x;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.s;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.RelativeLayout;
import lnc.a1;
import android.text.TextPaint;
import android.view.ViewGroup;

public final class DefaultVideoFragmentV4ViewBinder$b implements Runnable	// class@000d69
{
    public final DefaultVideoFragmentV4ViewBinder b;

    public void DefaultVideoFragmentV4ViewBinder$b(DefaultVideoFragmentV4ViewBinder p0){
       this.b = p0;
       super();
    }
    public final void run(){
       c uoc1;
       String str;
       ViewGroup$LayoutParams layoutParams1;
       int i2;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, DefaultVideoFragmentV4ViewBinder$b.class, "1")) {
          return;
       }
       DefaultVideoFragmentV4ViewBinder k = obj.b.K;
       if (k == null) {
          a.S("viewAdjustHelper");
       }
       DefaultVideoFragmentV4ViewBinder$b b = obj.b;
       DefaultVideoFragmentV4ViewBinder i = b.I;
       c uoc = b.N();
       DefaultVideoFragmentV4ViewBinder j = obj.b.J;
       Objects.requireNonNull(k);
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(i), uoc, Boolean.valueOf(j), k, h.class, "3")) {
          a.p(uoc, "workspaceDraft");
          h v = k.v;
          Objects.requireNonNull(v, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
          FragmentActivity activity = v.getActivity();
          if (activity != null) {
             k.a(activity, j);
             if (k.x == null) {
                EditAbilityConfig dEFAULT = EditAbilityConfig.DEFAULT;
                a.o(dEFAULT, "EditAbilityConfig.DEFAULT");
                boolean b1 = v.b(uoc, i.g().getEditAbilityConfig().get(dEFAULT));
                if (i == null) {
                   int i1 = 0;
                   if (b1) {
                      k.k.setVisibility(i1);
                      uoc1 = uoc;
                      h.g(activity, k.l, k.m, k.k, uoc, false, null);
                   }else {
                      uoc1 = uoc;
                   }
                   k.n.setVisibility(i1);
                   if (x.a()) {
                      str = x.c();
                      if (!TextUtils.x(str)) {
                         k.o.setText(str);
                         k.o.setVisibility(i1);
                      }
                   }
                }else {
                   uoc1 = uoc;
                }
                boolean b2 = v.c(activity, uoc1);
                if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b1), Boolean.valueOf(b2), Boolean.FALSE, k, h.class, "6")) {
                   if (b2 && k.w == null) {
                      i oi = i.m();
                      a.o(oi, "PostSession.current\(\)");
                      if (oi.M()) {
                         s.d("SEND_MESSAGE");
                      }
                   }
                   if (b1 && k.w == null) {
                      s.d("EDIT_PUBLISH_PHOTO");
                   }
                   int b3 = true;
                   k.w = b3;
                   ViewGroup$LayoutParams layoutParams = k.o.getLayoutParams();
                   str = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams";
                   Objects.requireNonNull(layoutParams, str);
                   float f = 19.00f;
                   if (!b1) {
                      layoutParams1 = k.n.getLayoutParams();
                      Objects.requireNonNull(layoutParams1, str);
                      i2 = (int)((float)(k.j.getMeasuredWidth() - (a1.e(f) * 2)) * 0x3f19999a);
                      layoutParams1.width = i2;
                      layoutParams.rightMargin = ((k.j.getMeasuredWidth() - i2) / 2) - k.e;
                      layoutParams.bottomMargin = layoutParams1.bottomMargin + k.f;
                   }else if(!b2){
                      k.n.setVisibility(4);
                      layoutParams1 = k.k.getLayoutParams();
                      Objects.requireNonNull(layoutParams1, str);
                      layoutParams1.removeRule(9);
                      layoutParams1.addRule(14);
                      layoutParams1.width = (int)((float)k.u.getWidth() * k.i);
                   }else {
                      ViewGroup$LayoutParams layoutParams2 = k.k.getLayoutParams();
                      Objects.requireNonNull(layoutParams2, str);
                      View view = k.n.findViewById(R.id.next_step_button_text);
                      a.o(view, "nextStepButton.findViewB¡­id.next_step_button_text\)");
                      TextPaint paint = view.getPaint();
                      a.o(paint, "nextStepButton.findViewB¡­t_step_button_text\).paint");
                      paint.setFakeBoldText(b3);
                      ViewGroup$LayoutParams layoutParams3 = k.n.getLayoutParams();
                      Objects.requireNonNull(layoutParams3, str);
                      layoutParams3.addRule(b3, R.id.post_button_v2);
                      layoutParams3.leftMargin = a1.e(16.00f);
                      b3 = a1.e(54.00f);
                      i2 = (k.j.getMeasuredWidth() - b3) / 2;
                      layoutParams2.width = i2;
                      layoutParams3.width = (k.j.getMeasuredWidth() - b3) - i2;
                      layoutParams.rightMargin = a1.e(f) - k.e;
                      layoutParams.bottomMargin = layoutParams3.bottomMargin + k.f;
                   }
                }
                h.h(k.n);
             }
          }
       }
       return;
    }
}
