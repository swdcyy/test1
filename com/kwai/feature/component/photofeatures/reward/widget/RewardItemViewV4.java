package com.kwai.feature.component.photofeatures.reward.widget.RewardItemViewV4;
import com.kwai.feature.component.photofeatures.reward.widget.BreathRewardItemView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$KsCoinLevel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.TextPaint;
import android.widget.TextView;
import java.lang.Boolean;
import android.widget.RelativeLayout;
import lnc.a1;
import android.view.View;

public final class RewardItemViewV4 extends BreathRewardItemView	// class@00126f
{
    public TextView g;

    public void RewardItemViewV4(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void RewardItemViewV4(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void RewardItemViewV4(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void a(RewardPanelInfoResponse$KsCoinLevel p0){
       RewardItemViewV4 tg1;
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardItemViewV4.class, "3")) {
          return;
       }
       a.p(p0, "coinLevel");
       if (!TextUtils.isEmpty(p0.mLabel)) {
          RewardItemViewV4 tg = this.g;
          if (tg == null) {
             a.S("mLabel");
          }
          TextPaint paint = tg.getPaint();
          a.o(paint, "mLabel.paint");
          paint.setFakeBoldText(true);
          tg = this.g;
          if (tg == null) {
             a.S("mLabel");
          }
          tg.setText(p0.mLabel);
          tg1 = this.g;
          if (tg1 == null) {
             a.S("mLabel");
          }
          tg1.setVisibility(0);
       }else {
          tg1 = this.g;
          if (tg1 == null) {
             a.S("mLabel");
          }
          tg1.setVisibility(8);
       }
       return;
    }
    public void b(boolean p0){
       TextPaint paint;
       TextPaint paint1;
       if (PatchProxy.isSupport(RewardItemViewV4.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RewardItemViewV4.class, "1")) {
          return;
       }
       String str = "mRewardGiftName.paint";
       float f = 0x3f000000;
       if (p0) {
          float f1 = 0x3f800000;
          this.setAlpha(f1);
          paint = this.getMRewardGiftName().getPaint();
          a.o(paint, str);
          paint.setFakeBoldText(true);
          if (!TextUtils.isEmpty(this.getMRewardDiscountPrice().getText())) {
             this.getMRewardOriginPrice().setAlpha(f);
             this.getMRewardDiscountPrice().setAlpha(f1);
             this.getMRewardDiscountPrice().setTextColor(a1.a(R.color.arg_RES_7f0604ba));
          }else {
             this.getMRewardOriginPrice().setAlpha(f1);
             paint1 = this.getMRewardGiftName().getPaint();
             a.o(paint1, str);
             paint1.setFakeBoldText(true);
          }
       }else {
          this.setAlpha(0.30f);
          if (!TextUtils.isEmpty(this.getMRewardDiscountPrice().getText())) {
             this.getMRewardOriginPrice().setAlpha(f);
             this.getMRewardDiscountPrice().setAlpha(f);
             this.getMRewardDiscountPrice().setTextColor(a1.a(R.color.arg_RES_7f061d77));
          }else {
             this.getMRewardOriginPrice().setAlpha(f);
          }
          paint1 = this.getMRewardGiftName().getPaint();
          a.o(paint1, str);
          paint1.setFakeBoldText(false);
       }
       return;
    }
    public int getPanelVersion(){
       return 4;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, RewardItemViewV4.class, "2")) {
          return;
       }
       super.onFinishInflate();
       View view = this.findViewById(R.id.tv_reward_label);
       a.o(view, "findViewById\(R.id.tv_reward_label\)");
       this.g = view;
       this.setClipChildren(false);
       this.setClipToPadding(false);
       return;
    }
}
