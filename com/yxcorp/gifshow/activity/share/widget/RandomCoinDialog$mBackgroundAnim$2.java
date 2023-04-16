package com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$mBackgroundAnim$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog;
import android.animation.ObjectAnimator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.view.View;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;

public final class RandomCoinDialog$mBackgroundAnim$2 extends Lambda implements a	// class@0014a1
{
    public final RandomCoinDialog this$0;

    public void RandomCoinDialog$mBackgroundAnim$2(RandomCoinDialog p0){
       this.this$0 = p0;
       super(0);
    }
    public final ObjectAnimator invoke(){
       RandomCoinDialog obj = PatchProxy.apply(null, this, RandomCoinDialog$mBackgroundAnim$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.A;
       if (obj == null) {
          a.S("mBackground");
       }
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(obj, View.ROTATION, new float[2]{0,0x43b40000});
       objectAnimat.setRepeatCount(-1);
       objectAnimat.setDuration(0x5dc0);
       objectAnimat.setInterpolator(new LinearInterpolator());
       return objectAnimat;
    }
    public Object invoke(){
       return this.invoke();
    }
}
