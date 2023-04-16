package com.kwai.slide.play.detail.rightactionbar.follow.element.AvatarWithFollowLiving;
import com.yxcorp.gifshow.widget.CustomLayout;
import com.kwai.slide.play.detail.rightactionbar.follow.element.AvatarWithFollowLiving$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.CustomLayout$a;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import qrd.l1;
import android.view.View;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import com.kwai.slide.play.detail.rightactionbar.follow.element.RoundedFrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView;
import android.widget.ImageView;
import com.kwai.slide.play.detail.rightactionbar.follow.element.AvatarWithFollow;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.lang.Boolean;
import java.lang.Integer;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;

public final class AvatarWithFollowLiving extends CustomLayout	// class@001850
{
    public final FrameLayout e;
    public final AppCompatTextView f;
    public final SelfAdaptiveImageView g;
    public final AvatarWithFollow h;
    public HashMap i;
    public static final AvatarWithFollowLiving$a j;

    static {
       AvatarWithFollowLiving.j = new AvatarWithFollowLiving$a(null);
    }
    public void AvatarWithFollowLiving(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void AvatarWithFollowLiving(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void AvatarWithFollowLiving(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.setLayoutParams(new CustomLayout$a(this.getMATCH_PARENT(), this.getWRAP_CONTENT()));
       this.setClipChildren(false);
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setBackgroundResource(R.drawable.arg_RES_7f080916);
       CustomLayout$a uoa = new CustomLayout$a(this.getWRAP_CONTENT(), this.getWRAP_CONTENT());
       uoa.bottomMargin = this.f(2);
       uFrameLayout.setLayoutParams(uoa);
       uFrameLayout.setId(R.id.slide_play_living_window);
       uFrameLayout.setVisibility(8);
       LivePlayTextureView livePlayText = new LivePlayTextureView(p0);
       livePlayText.setId(R.id.slide_play_living_window_texture);
       livePlayText.setLayoutParams(new CustomLayout$a(this.f(50), this.f(80)));
       RoundedFrameLayout roundedFrame = new RoundedFrameLayout(p0);
       roundedFrame.addView(livePlayText);
       uFrameLayout.addView(roundedFrame);
       this.b(uFrameLayout);
       this.e = uFrameLayout;
       AppCompatTextView uAppCompatTe = new AppCompatTextView(p0);
       uAppCompatTe.setId(R.id.slide_play_living_tip);
       CustomLayout$a uoa1 = new CustomLayout$a(this.f(39), this.f(21));
       uoa1.bottomMargin = this.f(2);
       uAppCompatTe.setLayoutParams(uoa1);
       uAppCompatTe.setVisibility(8);
       uAppCompatTe.setBackground(ContextCompat.getDrawable(p0, R.drawable.arg_RES_7f081974));
       this.b(uAppCompatTe);
       this.f = uAppCompatTe;
       SelfAdaptiveImageView selfAdaptive = new SelfAdaptiveImageView(p0);
       selfAdaptive.setId(R.id.slide_play_cdn_living_tip);
       uoa1 = new CustomLayout$a(this.f(37), this.f(21));
       uoa1.bottomMargin = this.f(2);
       selfAdaptive.setLayoutParams(uoa1);
       selfAdaptive.setVisibility(8);
       this.b(selfAdaptive);
       this.g = selfAdaptive;
       AvatarWithFollow uAvatarWithF = new AvatarWithFollow(p0, null, 0, 6, null);
       selfAdaptive.setId(R.id.slide_play_right_follow);
       selfAdaptive.setLayoutParams(new CustomLayout$a(this.getMATCH_PARENT(), this.getWRAP_CONTENT()));
       this.b(selfAdaptive);
       this.h = selfAdaptive;
    }
    public void AvatarWithFollowLiving(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final AvatarWithFollow getAvatarWithFollow(){
       return this.h;
    }
    public final SelfAdaptiveImageView getCdnLivingTip(){
       return this.g;
    }
    public final AppCompatTextView getLiveTipText(){
       return this.f;
    }
    public final FrameLayout getLiveWindow(){
       return this.e;
    }
    public final int n(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AvatarWithFollowLiving.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (!this.p())? 0: this.p() - this.d(p0);
       return i;
    }
    public final int o(){
       Object obj = PatchProxy.apply(null, this, AvatarWithFollowLiving.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.max(Math.max(this.d(this.f), this.d(this.g)), this.p());
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(AvatarWithFollowLiving.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, AvatarWithFollowLiving.class, "2")) {
             return;
          }
       }
       AvatarWithFollowLiving tf = this.f;
       int i1 = 4;
       Object obj = null;
       CustomLayout.i(this, tf, this.k(tf), this.n(this.f), false, i1, obj);
       tf = this.g;
       CustomLayout uCustomLayou = this;
       CustomLayout.i(uCustomLayou, tf, this.k(tf), this.n(this.g), false, i1, obj);
       tf = this.e;
       CustomLayout.i(uCustomLayou, tf, this.k(tf), 0, false, i1, obj);
       tf = this.h;
       int i2 = this.k(tf);
       int uCustomLayou1 = this.o();
       ViewGroup$LayoutParams layoutParams = tf.getLayoutParams();
       if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams = null;
       }
       if (layoutParams != null) {
          i = layoutParams.topMargin;
       }
       CustomLayout.i(this, tf, i2, (uCustomLayou1 + i), false, 4, null);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(AvatarWithFollowLiving.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AvatarWithFollowLiving.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       Iterator iterator = ViewGroupKt.b(this).iterator();
       while (iterator.hasNext()) {
          this.c(iterator.next());
       }
       this.setMeasuredDimension(this.getMeasuredWidth(), (this.o() + this.d(this.h)));
       return;
    }
    public final int p(){
       Object obj = PatchProxy.apply(null, this, AvatarWithFollowLiving.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (!this.e.isClickable())? 0: this.d(this.e);
       return i;
    }
}
