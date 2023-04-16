package com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$mNumAddUpAnim$2$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$mNumAddUpAnim$2;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;

public final class RandomCoinDialog$mNumAddUpAnim$2$a implements ValueAnimator$AnimatorUpdateListener	// class@0014a4
{
    public final RandomCoinDialog$mNumAddUpAnim$2 a;

    public void RandomCoinDialog$mNumAddUpAnim$2$a(RandomCoinDialog$mNumAddUpAnim$2 p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RandomCoinDialog$mNumAddUpAnim$2$a.class, "1")) {
          return;
       }
       RandomCoinDialog v = this.a.this$0.v;
       if (v == null) {
          a.S("mTvCoinNum");
       }
       a.o(p0, "it");
       v.setText(p0.getAnimatedValue().toString());
       PatchProxy.onMethodExit(RandomCoinDialog$mNumAddUpAnim$2$a.class, "1");
       return;
    }
}
