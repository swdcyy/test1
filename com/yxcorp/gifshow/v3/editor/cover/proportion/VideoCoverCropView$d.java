package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView$d;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView;
import android.animation.ValueAnimator;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView$b;
import android.graphics.RectF;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;

public final class VideoCoverCropView$d extends AnimatorListenerAdapter	// class@000e9c
{
    public final VideoCoverCropView a;
    public final ValueAnimator b;

    public void VideoCoverCropView$d(VideoCoverCropView p0,ValueAnimator p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverCropView$d.class, "2")) {
          return;
       }
       Iterator iterator = this.a.o.values().iterator();
       while (iterator.hasNext()) {
          VideoCoverCropView$b uob = iterator.next();
          if (uob != null) {
             uob.c();
          }
       }
       RectF mTarViewCrop = this.a.getMTargetViewCropPercentRect();
       a.m(mTarViewCrop);
       RectF rectF = new RectF(mTarViewCrop);
       this.a.e(rectF);
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverCropView", "createChangeRatioAnimator onTranslateEnd", objArray);
       Iterator iterator1 = this.a.o.values().iterator();
       while (iterator1.hasNext()) {
          VideoCoverCropView$b uob1 = iterator1.next();
          if (uob1 != null) {
             uob1.a(rectF);
          }
       }
       this.b.removeAllUpdateListeners();
       this.b.removeAllListeners();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverCropView$d.class, "1")) {
          return;
       }
       Iterator iterator = this.a.o.values().iterator();
       while (iterator.hasNext()) {
          VideoCoverCropView$b uob = iterator.next();
          if (uob != null) {
             uob.d();
          }
       }
       return;
    }
}
