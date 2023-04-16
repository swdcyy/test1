package com.kwai.feature.component.photofeatures.reward.widget.BreathRewardItemView;
import android.widget.RelativeLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$KsCoinLevel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.Animator;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Boolean;

public abstract class BreathRewardItemView extends RelativeLayout	// class@001264
{
    public KwaiImageView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public Animator f;

    public void BreathRewardItemView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void BreathRewardItemView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void BreathRewardItemView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public abstract void a(RewardPanelInfoResponse$KsCoinLevel p0);
    public abstract void b(boolean p0);
    public final void c(){
       BreathRewardItemView tf;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BreathRewardItemView.class, "14")) {
          return;
       }
       if (this.f == null) {
          ObjectAnimator objectAnimat = PatchProxy.apply(objArray, this, BreathRewardItemView.class, "15");
          if (objectAnimat != PatchProxyResult.class) {
          }else {
             tf = this.b;
             if (tf == null) {
                a.S("mRewardGiftImage");
             }
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(RelativeLayout.SCALE_X, new float[3]{0x3f800000,0x3f666666,0x3f800000}),PropertyValuesHolder.ofFloat(RelativeLayout.SCALE_Y, new float[3]{0x3f800000,0x3f666666,0x3f800000})};
             objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tf, propertyValu);
             objectAnimat.setDuration(200);
             a.o(objectAnimat, "ObjectAnimator.ofPropert¡­.apply { duration = 200 }");
          }
          this.f = objectAnimat;
       }
       tf = this.f;
       a.m(tf);
       if (tf.isRunning()) {
          tf = this.f;
          a.m(tf);
          tf.cancel();
       }
       tf = this.f;
       a.m(tf);
       tf.start();
       return;
    }
    public final KwaiImageView getGiftView(){
       BreathRewardItemView obj = PatchProxy.apply(null, this, BreathRewardItemView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("mRewardGiftImage");
       }
       return obj;
    }
    public final TextView getMRewardDiscountPrice(){
       BreathRewardItemView obj = PatchProxy.apply(null, this, BreathRewardItemView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a.S("mRewardDiscountPrice");
       }
       return obj;
    }
    public final KwaiImageView getMRewardGiftImage(){
       BreathRewardItemView obj = PatchProxy.apply(null, this, BreathRewardItemView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("mRewardGiftImage");
       }
       return obj;
    }
    public final TextView getMRewardGiftName(){
       BreathRewardItemView obj = PatchProxy.apply(null, this, BreathRewardItemView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("mRewardGiftName");
       }
       return obj;
    }
    public final TextView getMRewardOriginPrice(){
       BreathRewardItemView obj = PatchProxy.apply(null, this, BreathRewardItemView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("mRewardOriginPrice");
       }
       return obj;
    }
    public abstract int getPanelVersion();
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, BreathRewardItemView.class, "11")) {
          return;
       }
       super.onDetachedFromWindow();
       BreathRewardItemView tf = this.f;
       if (tf != null && tf.isRunning() == true) {
          tf = this.f;
          if (tf != null) {
             tf.cancel();
          }
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, BreathRewardItemView.class, "10")) {
          return;
       }
       super.onFinishInflate();
       View view = this.findViewById(R.id.iv_item_reward_gift);
       a.o(view, "findViewById\(R.id.iv_item_reward_gift\)");
       this.b = view;
       view = this.findViewById(R.id.tv_item_reward_name);
       a.o(view, "findViewById\(R.id.tv_item_reward_name\)");
       this.c = view;
       view = this.findViewById(R.id.tv_reward_price_origin);
       a.o(view, "findViewById\(R.id.tv_reward_price_origin\)");
       this.d = view;
       view = this.findViewById(R.id.tv_reward_price_discount);
       a.o(view, "findViewById\(R.id.tv_reward_price_discount\)");
       this.e = view;
       return;
    }
    public final void setMRewardDiscountPrice(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreathRewardItemView.class, "8")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public final void setMRewardGiftImage(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreathRewardItemView.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public final void setMRewardGiftName(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreathRewardItemView.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public final void setMRewardOriginPrice(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreathRewardItemView.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.d = p0;
       return;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(BreathRewardItemView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BreathRewardItemView.class, "13")) {
          return;
       }
       super.setSelected(p0);
       if (!p0) {
          BreathRewardItemView tf = this.f;
          if (tf != null) {
             a.m(tf);
             if (tf.isRunning()) {
                tf = this.f;
                a.m(tf);
                tf.cancel();
             }
          }
       }
       this.b(p0);
       return;
    }
}
