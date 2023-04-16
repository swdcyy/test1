package com.kwai.feature.component.photofeatures.reward.widget.RewardItemViewV3;
import com.kwai.feature.component.photofeatures.reward.widget.BreathRewardItemView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$KsCoinLevel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.text.TextPaint;
import android.widget.ImageView;

public final class RewardItemViewV3 extends BreathRewardItemView	// class@00126e
{

    public void RewardItemViewV3(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void RewardItemViewV3(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void RewardItemViewV3(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void a(RewardPanelInfoResponse$KsCoinLevel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardItemViewV3.class, "2")) {
          return;
       }
       a.p(p0, "coinLevel");
       return;
    }
    public void b(boolean p0){
       TextPaint paint;
       if (PatchProxy.isSupport(RewardItemViewV3.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RewardItemViewV3.class, "1")) {
          return;
       }
       int i = 0;
       if (p0) {
          int i1 = 3;
          View[] viewArray = new View[i1];
          viewArray[i] = this.getMRewardGiftImage();
          viewArray[1] = this.getMRewardGiftName();
          viewArray[2] = this.getMRewardDiscountPrice();
          for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
             viewArray[i2].setAlpha(0x3f800000);
          }
          TextView[] textViewArra = new TextView[]{this.getMRewardOriginPrice()};
          for (; i < 1; i = i + 1) {
             textViewArra[i].setAlpha(0x3f000000);
          }
          paint = this.getMRewardGiftName().getPaint();
          a.o(paint, "mRewardGiftName.paint");
          paint.setFakeBoldText(1);
       }else {
          this.getMRewardGiftImage().setAlpha(0.30f);
          this.getMRewardGiftName().setAlpha(0.30f);
          this.getMRewardOriginPrice().setAlpha(0.30f);
          this.getMRewardDiscountPrice().setAlpha(0x3f19999a);
          paint = this.getMRewardGiftName().getPaint();
          a.o(paint, "mRewardGiftName.paint");
          paint.setFakeBoldText(i);
       }
       return;
    }
    public int getPanelVersion(){
       return 3;
    }
}
