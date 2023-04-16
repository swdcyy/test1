package com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$mCritScaleAnim$2$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$mCritScaleAnim$2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog;
import com.yxcorp.gifshow.widget.shimmer.ShimmerFrameLayout;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.shimmer.b;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.animation.ValueAnimator;
import android.widget.FrameLayout;

public final class RandomCoinDialog$mCritScaleAnim$2$a extends AnimatorListenerAdapter	// class@0014a2
{
    public final RandomCoinDialog$mCritScaleAnim$2 a;

    public void RandomCoinDialog$mCritScaleAnim$2$a(RandomCoinDialog$mCritScaleAnim$2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RandomCoinDialog$mCritScaleAnim$2$a.class, "1")) {
          return;
       }
       ShimmerFrameLayout shimmerFrame = RandomCoinDialog.e0(this.a.this$0);
       Objects.requireNonNull(shimmerFrame);
       if (!PatchProxy.isSupport(ShimmerFrameLayout.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, shimmerFrame, ShimmerFrameLayout.class, "6")) {
          shimmerFrame.d = true;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, shimmerFrame, ShimmerFrameLayout.class, "3")) {
             ShimmerFrameLayout c = shimmerFrame.c;
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoid(objArray, c, b.class, "2") && (c.e != null && (!c.a() && c.getCallback() != null))) {
                c.e.start();
             }
          }
       label_005f :
          shimmerFrame.invalidate();
       }
       PatchProxy.onMethodExit(RandomCoinDialog$mCritScaleAnim$2$a.class, "1");
       return;
    }
}
