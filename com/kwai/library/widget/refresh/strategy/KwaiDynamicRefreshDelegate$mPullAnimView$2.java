package com.kwai.library.widget.refresh.strategy.KwaiDynamicRefreshDelegate$mPullAnimView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.library.widget.refresh.strategy.KwaiDynamicRefreshDelegate;
import com.airbnb.lottie.LottieAnimationView;
import android.view.View;
import android.view.ViewStub;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import w4.h;

public final class KwaiDynamicRefreshDelegate$mPullAnimView$2 extends Lambda implements a	// class@0009e0
{
    public final KwaiDynamicRefreshDelegate this$0;

    public void KwaiDynamicRefreshDelegate$mPullAnimView$2(KwaiDynamicRefreshDelegate p0){
       this.this$0 = p0;
       super(0);
    }
    public final LottieAnimationView invoke(){
       View view = this.this$0.i.inflate();
       Objects.requireNonNull(view, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
       int i = (this.this$0.f != null)? -1: 0;
       view.setRepeatCount(i);
       this.this$0.d(view);
       view.g.y(0, 0x3f800000);
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
