package com.yxcorp.gifshow.v3.widget.musicrotate.MusicRotateIconView;
import ml8.d;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.v3.widget.musicrotate.MusicRotateIconView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.util.AttributeSet;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.v3.widget.musicrotate.MusicRotateIconView$b;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import qrd.l1;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import cxc.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;

public final class MusicRotateIconView extends FrameLayout implements d	// class@001674
{
    public KwaiImageView b;
    public ImageView c;
    public View d;
    public View e;
    public a f;
    public AnimatorSet g;
    public HashMap h;
    public static final MusicRotateIconView$a i;

    static {
       MusicRotateIconView.i = new MusicRotateIconView$a(null);
    }
    public void MusicRotateIconView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.doBindView(a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d102d, this, true));
    }
    public void MusicRotateIconView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.doBindView(a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d102d, this, true));
    }
    public void MusicRotateIconView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.doBindView(a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d102d, this, true));
    }
    public final Animator a(View p0,long p1){
       ObjectAnimator obj;
       if (PatchProxy.isSupport(MusicRotateIconView.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, MusicRotateIconView.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = ObjectAnimator.ofFloat(p0, "rotation", new float[2]{0,0x43b40000});
       obj.addListener(new MusicRotateIconView$b(p0, p1));
       obj.setRepeatCount(-1);
       obj.setDuration(p1);
       a.o(obj, "ObjectAnimator.ofFloat\(v¡­  duration = time\n      }");
       return obj;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, MusicRotateIconView.class, "4")) {
          return;
       }
       MusicRotateIconView tg = this.g;
       if (tg != null) {
          tg.cancel();
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setInterpolator(new LinearInterpolator());
       Animator[] uAnimatorArr = new Animator[2];
       int i = 0;
       MusicRotateIconView tb = this.b;
       if (tb == null) {
          a.S("mCoverView");
       }
       uAnimatorArr[i] = this.a(tb, 8000);
       tb = this.c;
       if (tb == null) {
          a.S("mGramophoneView");
       }
       uAnimatorArr[1] = this.a(tb, 8000);
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.start();
       this.g = uAnimatorSet;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicRotateIconView.class, "1")) {
          return;
       }
       if (p0 != null) {
          View view = p0.findViewById(R.id.music_wheel_container);
          a.o(view, "view.findViewById\(R.id.music_wheel_container\)");
          this.d = view;
          view = p0.findViewById(R.id.music_wheel_gramophone);
          a.o(view, "view.findViewById\(R.id.music_wheel_gramophone\)");
          this.c = view;
          view = p0.findViewById(R.id.music_wheel_cover);
          a.o(view, "view.findViewById\(R.id.music_wheel_cover\)");
          this.b = view;
          view = p0.findViewById(R.id.music_note_layout);
          a.o(view, "view.findViewById\(R.id.music_note_layout\)");
          this.e = view;
          this.f = new a(p0);
          if (!PostExperimentUtils.m1()) {
             this.b();
             MusicRotateIconView tf = this.f;
             if (tf != null) {
                tf.b();
             }
          }
       }
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, MusicRotateIconView.class, "3")) {
          return;
       }
       super.onAttachedToWindow();
       if (!PostExperimentUtils.m1()) {
          this.b();
          MusicRotateIconView tf = this.f;
          if (tf != null) {
             tf.b();
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, MusicRotateIconView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       MusicRotateIconView tg = this.g;
       if (tg != null) {
          tg.cancel();
       }
       tg = this.f;
       if (tg != null) {
          tg.a();
       }
       this.g = null;
       return;
    }
}
