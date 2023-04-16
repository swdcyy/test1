package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$f;
import androidx.lifecycle.Observer;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.View;
import lnc.s6;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.lifecycle.LiveData;
import kotlin.Pair;
import com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import mq4.f;
import g9c.a;
import android.animation.AnimatorSet;
import mq4.e;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import th0.n;
import mq4.d;
import android.animation.Animator$AnimatorListener;

public final class MoodTemplateViewBinder$f implements Observer	// class@000b5e
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$f(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder$f.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          String str = "MoodTemplateViewBinder";
          a.D().w(str, "mRemotePanelState it:"+p0, objArray);
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             MoodTemplateViewBinder moodTemplate = MoodTemplateViewBinder.class;
             Object[] objArray1 = null;
             if (!PatchProxy.applyVoid(objArray1, p0, moodTemplate, "15")) {
                Object[] objArray2 = new Object[0];
                a.D().w(str, "openTemplatePanel", objArray2);
                p0.v.setVisibility(0);
                if (s6.m() && p0.n.getLeftButton() instanceof ImageView) {
                   View leftButton = p0.n.getLeftButton();
                   Objects.requireNonNull(leftButton, "null cannot be cast to non-null type android.widget.ImageView");
                   leftButton.setImageResource(R.drawable.arg_RES_7f081be0);
                }
                p0.n.setVisibility(4);
                MoodTemplateViewBinder d = p0.D;
                MoodTemplateViewBinder s = p0.S;
                Objects.requireNonNull(s);
                float[] obj = PatchProxy.apply(objArray1, s, MoodTemplateViewModel.class, "5");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                }else {
                   Object[] objArray3 = new Object[0];
                   a.D().w("MoodTemplateViewModel", "getSelectTemplatePosition", objArray3);
                   Pair value = s.a.getValue();
                   MoodTemplateUiData first = (value != null)? value.getFirst(): objArray1;
                   if (first == null) {
                      i = -1;
                   }else {
                      i = s.r0(first);
                   }
                }
                d.Y0(i);
                if (p0.D.X0() < p0.D.getItemCount()) {
                   int i1 = (p0.D.X0() < 0)? 0: p0.D.X0();
                   p0.H(i1, 0);
                }
                p0.h.setVisibility(0);
                if (!PatchProxy.applyVoid(objArray1, p0, moodTemplate, "16")) {
                   p0.v.setAlpha(0);
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   obj = new float[]{(float)e.f,0};
                   ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0.v, "translationY", obj);
                   a.o(objectAnimat, "panelTranslationY");
                   objectAnimat.setInterpolator(new e());
                   objectAnimat.setDuration(300);
                   ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p0.v, "alpha", new float[2]{0,0x3f800000});
                   a.o(objectAnimat1, "panelAlpha");
                   objectAnimat1.setInterpolator(new e());
                   objectAnimat1.setDuration(300);
                   Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
                   uAnimatorSet.playTogether(uAnimatorArr);
                   uAnimatorSet.start();
                   uAnimatorSet = new AnimatorSet();
                   objectAnimat = ObjectAnimator.ofFloat(p0.w, "alpha", new float[2]{0x3f800000,0});
                   a.o(objectAnimat, "actionAlpha");
                   objectAnimat.setInterpolator(new n());
                   objectAnimat.setDuration(240);
                   uAnimatorSet.addListener(new d(p0));
                   Animator[] uAnimatorArr1 = new Animator[]{objectAnimat};
                   uAnimatorSet.playTogether(uAnimatorArr1);
                   uAnimatorSet.start();
                }
                p0.J(0);
             }
          }else {
             this.b.D();
          }
       }
       return;
    }
}
