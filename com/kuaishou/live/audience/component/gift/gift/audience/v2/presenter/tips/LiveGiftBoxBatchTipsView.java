package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.LiveGiftBoxBatchTipsView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.basic.tools.l;
import android.widget.ImageView;
import android.view.View;
import lnc.a1;
import android.util.Property;
import android.animation.ObjectAnimator;
import zi1.e;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.LiveGiftBoxBatchTipsView$a;
import android.animation.Animator$AnimatorListener;
import ekd.m1;
import androidx.constraintlayout.widget.Group;
import android.widget.TextView;

public class LiveGiftBoxBatchTipsView extends ConstraintLayout	// class@000b61
{
    public TextView B;
    public TextView C;
    public KwaiImageView D;
    public View E;
    public Group F;
    public Runnable G;
    public static final int H;

    public void LiveGiftBoxBatchTipsView(Context p0){
       super(p0, null);
    }
    public void LiveGiftBoxBatchTipsView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGiftBoxBatchTipsView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public static void L(LiveGiftBoxBatchTipsView p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, LiveGiftBoxBatchTipsView.class, "8")) {
       }else {
          l.j(p0.D);
          p0.D.setVisibility(8);
       }
       return;
    }
    public void M(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxBatchTipsView.class, "4")) {
          return;
       }
       LiveGiftBoxBatchTipsView liveGiftBoxB = (!this.F.getVisibility())? 1: null;
       if (liveGiftBoxB) {
          float[] uofloatArray = new float[]{0,(float)a1.d(0x7f070309)};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.E, View.TRANSLATION_Y, uofloatArray);
          objectAnimat.setDuration(120);
          objectAnimat.setInterpolator(new e(0x3ea8f5c3, 0, 0x3f547ae1, 0x3f547ae1));
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.E, View.ALPHA, new float[2]{0x3f800000,0});
          objectAnimat1.setDuration(160);
          AnimatorSet uAnimatorSet = new AnimatorSet();
          Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
          uAnimatorSet.playTogether(uAnimatorArr);
          uAnimatorSet.addListener(new LiveGiftBoxBatchTipsView$a(this));
          uAnimatorSet.start();
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxBatchTipsView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.F = m1.f(this, 0x7f0a3f15);
       this.B = m1.f(this, 0x7f0a1295);
       this.C = m1.f(this, 0x7f0a06e8);
       this.E = m1.f(this, 0x7f0a3e04);
       this.D = m1.f(this, 0x7f0a1819);
       this.F.setVisibility(8);
       this.D.setVisibility(8);
       return;
    }
}
