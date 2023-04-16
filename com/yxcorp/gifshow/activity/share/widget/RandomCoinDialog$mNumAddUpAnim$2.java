package com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$mNumAddUpAnim$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dnc.v1;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$mNumAddUpAnim$2$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class RandomCoinDialog$mNumAddUpAnim$2 extends Lambda implements a	// class@0014a5
{
    public final RandomCoinDialog this$0;

    public void RandomCoinDialog$mNumAddUpAnim$2(RandomCoinDialog p0){
       this.this$0 = p0;
       super(0);
    }
    public final ValueAnimator invoke(){
       int[] obj = PatchProxy.apply(null, this, RandomCoinDialog$mNumAddUpAnim$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[]{0,this.this$0.E.a()};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(obj);
       valueAnimato.setDuration(600);
       valueAnimato.setInterpolator(new LinearInterpolator());
       valueAnimato.addUpdateListener(new RandomCoinDialog$mNumAddUpAnim$2$a(this));
       return valueAnimato;
    }
    public Object invoke(){
       return this.invoke();
    }
}
