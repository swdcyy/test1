package com.kuaishou.live.core.show.luckystar.pendant.b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.luckystar.pendant.a$d;
import com.kuaishou.live.core.show.luckystar.pendant.LiveLuckyStarNewPendantV2View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.RelativeLayout;

public class b extends AnimatorListenerAdapter	// class@000cf5
{
    public final LiveLuckyStarNewPendantV2View a;
    public final a$d b;

    public void b(a$d p0,LiveLuckyStarNewPendantV2View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       b tb = this.b;
       tb.f = false;
       tb.s(a1.f(R.drawable.arg_RES_7f081494));
       this.b.t().setCountDownTextViewVisible(true);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       this.b.s(null);
       this.b.t().setCountDownTextViewVisible(0);
       return;
    }
}
