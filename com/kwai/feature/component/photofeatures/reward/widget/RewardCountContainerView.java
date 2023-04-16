package com.kwai.feature.component.photofeatures.reward.widget.RewardCountContainerView;
import android.widget.LinearLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.Paint;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper;
import lnc.a1;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper$ArrowPosition;
import com.kwai.feature.component.photofeatures.reward.widget.RewardCountContainerView$a;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper$a;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public final class RewardCountContainerView extends LinearLayout	// class@001269
{
    public final ShadowRoundedHelper b;

    public void RewardCountContainerView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void RewardCountContainerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void RewardCountContainerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.setLayerType(1, null);
       ShadowRoundedHelper shadowRounde = new ShadowRoundedHelper(a1.a(0x7f0606da), (float)a1.d(0x7f07031b), a1.a(0x7f0604cb), 0x41f00000, (float)a1.d(0x7f070334), (float)a1.d(0x7f070271), (float)a1.d(0x7f07031b), ShadowRoundedHelper$ArrowPosition.BOTTOM, new RewardCountContainerView$a(this));
       this.b = 1;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardCountContainerView.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.b.a(p0);
       }
       super.dispatchDraw(p0);
       return;
    }
    public final ShadowRoundedHelper getMHelper(){
       return this.b;
    }
}
