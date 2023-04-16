package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class TimeLineTagContainer$b extends AnimatorListenerAdapter	// class@000dd1
{
    public final TimeLineTagContainer a;

    public void TimeLineTagContainer$b(TimeLineTagContainer p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimeLineTagContainer$b.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationCancel(p0);
       TextView mDurationTex = this.a.getMDurationTextView();
       String str = "mDurationTextView";
       a.o(mDurationTex, str);
       int i = 0;
       mDurationTex = (!mDurationTex.getAlpha() - 0x3f800000)? 1: 0;
       TextView mDurationTex1 = this.a.getMDurationTextView();
       a.o(mDurationTex1, str);
       int i1 = (mDurationTex)? 0: 8;
       mDurationTex1.setVisibility(i1);
       mDurationTex1 = this.a.getMCurrentSpeedView();
       String str1 = "mCurrentSpeedView";
       a.o(mDurationTex1, str1);
       if (mDurationTex) {
          TextView mCurrentSpee = this.a.getMCurrentSpeedView();
          a.o(mCurrentSpee, str1);
          if (!TextUtils.x(mCurrentSpee.getText())) {
             i1 = 0;
          label_0064 :
             mDurationTex1.setVisibility(i1);
             mDurationTex1 = this.a.getMCurrentSpeedUnselectView();
             a.o(mDurationTex1, "mCurrentSpeedUnselectView");
             if (mDurationTex) {
                i = 8;
             }
             mDurationTex1.setVisibility(i);
             return;
          }
       }
       i1 = 8;
       goto label_0064 ;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimeLineTagContainer$b.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationEnd(p0);
       TextView mDurationTex = this.a.getMDurationTextView();
       String str = "mDurationTextView";
       a.o(mDurationTex, str);
       int i = 0;
       mDurationTex = (!mDurationTex.getAlpha() - 0x3f800000)? 1: 0;
       TextView mDurationTex1 = this.a.getMDurationTextView();
       a.o(mDurationTex1, str);
       int i1 = (mDurationTex)? 0: 8;
       mDurationTex1.setVisibility(i1);
       mDurationTex1 = this.a.getMCurrentSpeedView();
       String str1 = "mCurrentSpeedView";
       a.o(mDurationTex1, str1);
       if (mDurationTex) {
          TextView mCurrentSpee = this.a.getMCurrentSpeedView();
          a.o(mCurrentSpee, str1);
          if (!TextUtils.x(mCurrentSpee.getText())) {
             i1 = 0;
          label_0064 :
             mDurationTex1.setVisibility(i1);
             mDurationTex1 = this.a.getMCurrentSpeedUnselectView();
             a.o(mDurationTex1, "mCurrentSpeedUnselectView");
             if (mDurationTex) {
                i = 8;
             }
             mDurationTex1.setVisibility(i);
             return;
          }
       }
       i1 = 8;
       goto label_0064 ;
    }
}
