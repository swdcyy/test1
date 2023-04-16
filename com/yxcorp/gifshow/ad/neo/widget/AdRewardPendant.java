package com.yxcorp.gifshow.ad.neo.widget.AdRewardPendant;
import ml8.d;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.ad.neo.widget.AdRewardPendant$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import qw.e;
import com.kwai.framework.network.cdn.CdnHostGroupType;
import tw.i;
import com.airbnb.lottie.LottieTask;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.drawee.view.SimpleDraweeView;

public final class AdRewardPendant extends FrameLayout implements d	// class@0017a7
{
    public AppCompatTextView b;
    public KwaiImageView c;
    public LottieAnimationView d;
    public HashMap e;
    public static final AdRewardPendant$a f;

    static {
       AdRewardPendant.f = new AdRewardPendant$a(null);
    }
    public void AdRewardPendant(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void AdRewardPendant(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void AdRewardPendant(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       e.b(e.b, p0, i.c("https://static.yximgs.com/udata/pkg/ad-res/ad_neo_merchant_success_lottie.0ecc90f4d7c1997a.json", null, 2, null), null, 4, null);
    }
    public static final KwaiImageView a(AdRewardPendant p0){
       p0 = p0.c;
       if (p0 == null) {
          a.S("mCountDownBg");
       }
       return p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdRewardPendant.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.reward_merchant_text);
       a.o(view, "bindWidget\(rootView, R.id.reward_merchant_text\)");
       this.b = view;
       view = m1.f(p0, R.id.reward_merchant_count_down_bg);
       a.o(view, "bindWidget\(rootView, R.i¡­d_merchant_count_down_bg\)");
       this.c = view;
       p0 = m1.f(p0, R.id.reward_merchant_count_down_lottie);
       a.o(p0, "bindWidget\(rootView, R.i¡­rchant_count_down_lottie\)");
       this.d = p0;
       AdRewardPendant tc = this.c;
       if (tc == null) {
          a.S("mCountDownBg");
       }
       tc.setActualImageResource(R.drawable.arg_RES_7f081de6);
       tc = this.d;
       if (tc == null) {
          a.S("mAnimationView");
       }
       tc.setAnimationFromUrl(e.b.c("https://static.yximgs.com/udata/pkg/ad-res/ad_neo_merchant_success_lottie.0ecc90f4d7c1997a.json"));
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, AdRewardPendant.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
}
