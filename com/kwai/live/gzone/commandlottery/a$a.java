package com.kwai.live.gzone.commandlottery.a$a;
import ekd.f$j;
import com.kwai.live.gzone.commandlottery.a;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class a$a extends f$j	// class@000c8d
{
    public final LottieAnimationView a;
    public final a b;

    public void a$a(a p0,LottieAnimationView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.a.setBackground(null);
       return;
    }
}
