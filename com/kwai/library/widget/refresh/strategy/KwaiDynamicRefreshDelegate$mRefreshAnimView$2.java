package com.kwai.library.widget.refresh.strategy.KwaiDynamicRefreshDelegate$mRefreshAnimView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.library.widget.refresh.strategy.KwaiDynamicRefreshDelegate;
import com.airbnb.lottie.LottieAnimationView;
import android.view.View;
import android.view.ViewStub;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public final class KwaiDynamicRefreshDelegate$mRefreshAnimView$2 extends Lambda implements a	// class@0009e1
{
    public final KwaiDynamicRefreshDelegate this$0;

    public void KwaiDynamicRefreshDelegate$mRefreshAnimView$2(KwaiDynamicRefreshDelegate p0){
       this.this$0 = p0;
       super(0);
    }
    public final LottieAnimationView invoke(){
       View view = this.this$0.j.inflate();
       Objects.requireNonNull(view, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
       this.this$0.d(view);
       view.setRepeatCount(-1);
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
