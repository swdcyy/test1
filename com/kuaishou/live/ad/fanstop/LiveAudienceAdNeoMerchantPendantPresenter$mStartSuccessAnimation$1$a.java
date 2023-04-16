package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1$a;
import java.lang.Runnable;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoMerchantPendantView;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter;
import java.util.Objects;
import java.lang.Long;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import android.animation.PropertyValuesHolder;
import android.widget.FrameLayout;
import android.util.Property;
import android.animation.ObjectAnimator;
import tl0.b;
import android.animation.Animator$AnimatorListener;

public final class LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1$a implements Runnable	// class@000961
{
    public final LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1 b;
    public final long c;
    public final a d;

    public void LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1$a(LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1 p0,long p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1$a.class, "1")) {
          return;
       }
       LiveAdNeoMerchantPendantView liveAdNeoMer = this.b.this$0.P8();
       LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1$a tc = this.c;
       LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1$a td = this.d;
       Objects.requireNonNull(liveAdNeoMer);
       if (!PatchProxy.isSupport(LiveAdNeoMerchantPendantView.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(tc), td, liveAdNeoMer, LiveAdNeoMerchantPendantView.class, "3")) {
          a.p(td, "endCallback");
          LiveAdNeoMerchantPendantView b = liveAdNeoMer.b;
          if (b == null) {
             a.S("mCountDownTextView");
          }
          b.setText(R.string.arg_RES_7f1014d2);
          b = liveAdNeoMer.c;
          if (b == null) {
             a.S("mCountDownImageGroup");
          }
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(FrameLayout.SCALE_X, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(FrameLayout.SCALE_Y, new float[2]{0x3f800000,0})};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(b, propertyValu);
          objectAnimat.setDuration(250);
          objectAnimat.addListener(new b(liveAdNeoMer, tc, td));
          objectAnimat.start();
       }
       return;
    }
}
