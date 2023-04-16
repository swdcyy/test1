package com.kuaishou.live.common.core.component.like.e;
import d61.k0$a;
import com.kuaishou.live.common.core.component.like.i$a;
import java.lang.Object;
import w4.e;
import com.kuaishou.live.common.core.component.like.i;
import com.airbnb.lottie.LottieAnimationView;
import go1.h;
import java.lang.Runnable;
import android.os.Handler;

public final class e implements k0$a	// class@001463
{
    public final i$a a;

    public void e(i$a p0){
       this.a = p0;
    }
    public final Object get(Object p0){
       e ta = this.a;
       ta.a.H.setComposition(p0);
       ta.a.S.postDelayed(new h(ta), 440);
       return null;
    }
}
