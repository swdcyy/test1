package em0.a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.ad.watchlive.widget.WatchLivePendantView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import tkd.b;
import tkd.d;
import os5.d;
import android.graphics.drawable.Drawable;
import lnc.a1;

public final class a extends AnimatorListenerAdapter	// class@0021aa
{
    public final WatchLivePendantView a;

    public void a(WatchLivePendantView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       WatchLivePendantView d = this.a.d;
       if (d != null) {
          d.setVisibility(0);
       }
       this.a.setBackground(a1.f(d.a(-2004767397).Rg(3)));
       return;
    }
}
