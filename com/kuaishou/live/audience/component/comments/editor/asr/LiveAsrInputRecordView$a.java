package com.kuaishou.live.audience.component.comments.editor.asr.LiveAsrInputRecordView$a;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.comments.editor.asr.LiveAsrInputRecordView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t52.d;
import java.util.Objects;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import ay0.a;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.android.live.log.LiveLogTag;
import android.view.View;
import java.lang.Float;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LiveAsrInputRecordView$a implements Runnable	// class@000a9d
{
    public final LiveAsrInputRecordView b;

    public void LiveAsrInputRecordView$a(LiveAsrInputRecordView p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAsrInputRecordView$a.class, "1")) {
          return;
       }
       LiveAsrInputRecordView$a tb = this.b;
       boolean b = true;
       tb.e = b;
       tb.f = false;
       LiveAsrInputRecordView c = tb.c;
       if (c != null) {
          c.onStart();
       }
       this.b.b();
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LiveAsrInputRecordView.class, "7")) {
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[2]{0x3f400000,0x3f800000}),PropertyValuesHolder.ofFloat("scaleY", new float[2]{0x3f400000,0x3f800000})};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tb.b, propertyValu);
          objectAnimat.setDuration(200);
          AnimatorSet uAnimatorSet = new AnimatorSet();
          tb.h = uAnimatorSet;
          uAnimatorSet.setInterpolator(new LinearInterpolator());
          tb.h.play(objectAnimat);
          tb.h.addListener(new a(tb));
          b.d0(LiveLogTag.LIVE_ASR_INPUT, "AsrAnim | mVolumeShowAnimSet.start", "curScaleX", Float.valueOf(tb.b.getScaleX()), "curScaleY", Float.valueOf(tb.b.getScaleY()));
          tb.h.start();
          tb.b.setVisibility(false);
       }
       return;
    }
}
