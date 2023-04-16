package com.kuaishou.live.core.show.luckystar.pendant.LiveLuckyStarNewPendantV2View;
import com.kuaishou.live.core.show.luckystar.pendant.LiveBaseLuckyStarPendantView;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.luckystar.pendant.LiveLuckyStarNewPendantV2View$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import yz7.n;
import ekd.k1;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

public class LiveLuckyStarNewPendantV2View extends LiveBaseLuckyStarPendantView	// class@000cee
{
    public LottieAnimationView d;
    public KwaiImageView e;

    public void LiveLuckyStarNewPendantV2View(Context p0){
       super(p0, null);
    }
    public void LiveLuckyStarNewPendantV2View(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLuckyStarNewPendantV2View(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setClipChildren(false);
    }
    public void a(View p0){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLuckyStarNewPendantV2View.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.d = p0.findViewById(0x7f0a2143);
       this.e = p0.findViewById(0x7f0a2142);
       this.d.a(new LiveLuckyStarNewPendantV2View$a(this));
       return;
    }
    public final void f(String p0,boolean p1){
       if (PatchProxy.isSupport(LiveLuckyStarNewPendantV2View.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveLuckyStarNewPendantV2View.class, "6")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       this.g();
       this.d.setAnimationFromUrl(p0);
       if (p1) {
          this.d.setRepeatCount(-1);
       }else {
          this.d.setRepeatCount(0);
       }
       this.d.s();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarNewPendantV2View.class, "5")) {
          return;
       }
       LiveLuckyStarNewPendantV2View td = this.d;
       if (td == null) {
          return;
       }
       td.f();
       return;
    }
    public int getCountDownTextSizeDp(){
       Object obj = PatchProxy.apply(null, this, LiveLuckyStarNewPendantV2View.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.g((float)a1.d(0x7f070980));
    }
    public int getLayoutRes(){
       return 0x7f0d0c81;
    }
    public int getOpeningTextSizeDp(){
       Object obj = PatchProxy.apply(null, this, LiveLuckyStarNewPendantV2View.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.g((float)a1.d(0x7f070981));
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarNewPendantV2View.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       k1.n(this);
       return;
    }
    public void setBackgroundImage(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLuckyStarNewPendantV2View.class, "10")) {
          return;
       }
       String str = e0.d(p0);
       if (!TextUtils.x(str)) {
          this.e.L(str);
       }else {
          this.e.setImageDrawable(a1.f(R.drawable.arg_RES_7f081307));
       }
       return;
    }
    public void setCountDownTextViewVisible(boolean p0){
       if (PatchProxy.isSupport(LiveLuckyStarNewPendantV2View.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveLuckyStarNewPendantV2View.class, "2")) {
          return;
       }
       LiveBaseLuckyStarPendantView tb = this.b;
       int i = (p0)? 0: 8;
       tb.setVisibility(i);
       return;
    }
}
