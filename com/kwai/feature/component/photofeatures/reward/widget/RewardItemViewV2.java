package com.kwai.feature.component.photofeatures.reward.widget.RewardItemViewV2;
import com.kwai.feature.component.photofeatures.reward.widget.BreathRewardItemView;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$KsCoinLevel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.Boolean;
import android.view.View;
import android.widget.RelativeLayout;

public class RewardItemViewV2 extends BreathRewardItemView	// class@00126d
{
    public TextView g;

    public void RewardItemViewV2(Context p0){
       super(p0);
    }
    public void RewardItemViewV2(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RewardItemViewV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(RewardPanelInfoResponse$KsCoinLevel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardItemViewV2.class, "3")) {
          return;
       }
       if (!TextUtils.x(p0.mCornerText)) {
          this.g.setVisibility(0);
          this.g.setText(TextUtils.I(p0.mCornerText));
          this.g.getPaint().setFakeBoldText(true);
       }else {
          this.g.setVisibility(8);
       }
       return;
    }
    public void b(boolean p0){
       if (PatchProxy.isSupport(RewardItemViewV2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RewardItemViewV2.class, "2")) {
          return;
       }
       if (!this.g.getVisibility()) {
          this.g.setSelected(p0);
       }
       return;
    }
    public int getPanelVersion(){
       return 2;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, RewardItemViewV2.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.g = this.findViewById(0x7f0a4243);
       return;
    }
}
