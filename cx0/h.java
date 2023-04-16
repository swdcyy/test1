package cx0.h;
import ms5.a$b;
import cx0.g;
import com.kuaishou.live.authentication.LiveAudienceAuthorAuthenticationTopPendantInfo;
import java.lang.Object;
import ms5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ms5.b;
import cx0.b;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import d61.l;
import android.animation.TimeInterpolator;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.view.animation.AlphaAnimation;
import java.lang.Math;
import u79.b;
import android.view.animation.Interpolator;
import cx0.f;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import java.lang.Throwable;

public final class h implements a$b	// class@001e96
{
    public final g b;
    public final LiveAudienceAuthorAuthenticationTopPendantInfo c;
    public final int d;

    public void h(g p0,LiveAudienceAuthorAuthenticationTopPendantInfo p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void Ee(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       a.p(p0, "item");
       b.e(this, p0);
       this.b.b9(this.c, this.d);
       return;
    }
    public boolean Kc(a p0){
       return b.b(this, p0);
    }
    public void Lc(a p0){
       b c;
       b a;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, str)) {
          return;
       }
       a.p(p0, "item");
       b.c(this, p0);
       g n = this.b.N;
       if (n != null) {
          b uob = b.class;
          if (!PatchProxy.applyVoid(null, n, uob, str) && n.e == 2) {
             if (n.f == null) {
                uob = n.b;
                if (uob != null) {
                   uob.setTranslationY(0);
                }
                c = n.c;
                if (c != null) {
                   c.setVisibility(8);
                }
             }else if(PatchProxy.applyVoid(null, n, uob, "5") || n.d != null){
                a = n.a;
                if (a != null) {
                   a.k(a, R.layout.arg_RES_7f0d09ec, true);
                   View view = m1.f(a, R.id.live_audience_authentication_top_pendant_shimmer);
                   a.o(view, "bindWidget\(it, R.id.live¡­tion_top_pendant_shimmer\)");
                   view.setGradientColors(b.j);
                   view.setGradientPosition(b.k);
                   view.setTimeInterpolator(new l(0.40f, 0, 0.20f, 0x3f800000));
                   ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                   if (layoutParams != null) {
                      layoutParams.width = a.getWidth();
                   }
                   if (layoutParams) {
                      layoutParams.height = a.getHeight();
                   }
                   view.setLayoutParams(layoutParams);
                   n.d = view;
                }
             }
             if (!PatchProxy.applyVoid(null, n, uob, "3")) {
                AlphaAnimation uAlphaAnimat = new AlphaAnimation(0, 0x3f800000);
                uAlphaAnimat.setDuration(Math.max(0, n.h.mShowDurationMs));
                uAlphaAnimat.setInterpolator(new b(0.40f, 0, 0.20f, 0x3f800000));
                uAlphaAnimat.setAnimationListener(new f(n));
                c = n.b;
                if (c != null) {
                   c.startAnimation(uAlphaAnimat);
                }
             }
          }
       }
       return;
    }
    public void Lg(a p0,Throwable p1){
       b.d(this, p0, p1);
    }
    public void da(a p0){
       b.a(this, p0);
    }
}
