package com.yxcorp.gifshow.detail.view.RewardBannerContainerView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper;
import lnc.a1;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper$ArrowPosition;
import com.yxcorp.gifshow.detail.view.RewardBannerContainerView$a;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper$a;
import qrd.l1;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class RewardBannerContainerView extends ConstraintLayout	// class@001a57
{
    public final ShadowRoundedHelper B;

    public void RewardBannerContainerView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.setLayerType(1, null);
       ShadowRoundedHelper shadowRounde = new ShadowRoundedHelper(a1.a(0x7f061dd7), (float)a1.d(0x7f07042b), (float)a1.d(0x7f070334), (float)a1.d(0x7f070271), (float)a1.d(0x7f0702e3), ShadowRoundedHelper$ArrowPosition.TOP, new RewardBannerContainerView$a(this));
       1.b((float)a1.d(R.dimen.arg_RES_7f0702df));
       this.B = 1;
    }
    public void RewardBannerContainerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.setLayerType(1, null);
       ShadowRoundedHelper shadowRounde = new ShadowRoundedHelper(a1.a(0x7f061dd7), (float)a1.d(0x7f07042b), (float)a1.d(0x7f070334), (float)a1.d(0x7f070271), (float)a1.d(0x7f0702e3), ShadowRoundedHelper$ArrowPosition.TOP, new RewardBannerContainerView$a(this));
       1.b((float)a1.d(R.dimen.arg_RES_7f0702df));
       this.B = 1;
    }
    public void RewardBannerContainerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.setLayerType(1, null);
       ShadowRoundedHelper shadowRounde = new ShadowRoundedHelper(a1.a(0x7f061dd7), (float)a1.d(0x7f07042b), (float)a1.d(0x7f070334), (float)a1.d(0x7f070271), (float)a1.d(0x7f0702e3), ShadowRoundedHelper$ArrowPosition.TOP, new RewardBannerContainerView$a(this));
       1.b((float)a1.d(R.dimen.arg_RES_7f0702df));
       this.B = 1;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardBannerContainerView.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.B.a(p0);
       }
       super.dispatchDraw(p0);
       return;
    }
    public final ShadowRoundedHelper getMHelper(){
       return this.B;
    }
}
