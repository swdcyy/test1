package com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem$c;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import com.airbnb.lottie.LottieAnimationView;

public final class LiteAnchorInfoFollowItem$c	// class@001e5b
{
    public final LivePkShimmerLayout a;
    public final LottieAnimationView b;
    public final View c;

    public void LiteAnchorInfoFollowItem$c(View p0){
       a.p(p0, "rootView");
       super();
       this.c = p0;
       View view = p0.findViewById(R.id.lite_follow_shimmder);
       a.o(view, "rootView.findViewById\(R.id.lite_follow_shimmder\)");
       this.a = view;
       p0 = p0.findViewById(R.id.lite_follow_finish_anim);
       a.o(p0, "rootView.findViewById\(R.бн.lite_follow_finish_anim\)");
       this.b = p0;
    }
    public final LottieAnimationView a(){
       return this.b;
    }
}
