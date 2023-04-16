package com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView;
import b2b.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$a;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import b2b.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView$avatar1Animator$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView$avatar1LottieAnimator$2;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView$avatar2Animator$2;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView$avatar2LottieAnimator$2;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView$matchIconAnimator$2;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView$animationSet$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView$a;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.local.sub.entrance.function.model.HeaderFunctionCard;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class NearbyFunctionMatchView extends ConstraintLayout implements a	// class@001ab6
{
    public ViewGroup B;
    public ViewGroup C;
    public KwaiImageView D;
    public KwaiImageView E;
    public KwaiLottieAnimationView F;
    public KwaiLottieAnimationView G;
    public KwaiImageView H;
    public float I;
    public float J;
    public HeaderFunctionCard K;
    public final p L;
    public final p M;
    public final p N;
    public final p O;
    public final p P;
    public final p Q;
    public NearbyHeaderFunctionEntranceView$a R;
    public int S;

    public void NearbyFunctionMatchView(Context p0,NearbyHeaderFunctionEntranceView$a p1,int p2,AttributeSet p3,int p4,u p5){
       a.p(p0, "context");
       super(p0, null);
       this.R = p1;
       this.S = p2;
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d1091, this);
       View view = this.findViewById(R.id.user_content_avatar1);
       a.o(view, "findViewById\(R.id.user_content_avatar1\)");
       this.B = view;
       view = this.findViewById(R.id.user_content_avatar2);
       a.o(view, "findViewById\(R.id.user_content_avatar2\)");
       this.C = view;
       view = this.findViewById(R.id.avatar1);
       a.o(view, "findViewById\(R.id.avatar1\)");
       this.D = view;
       view = this.findViewById(R.id.lottie_avatar1);
       a.o(view, "findViewById\(R.id.lottie_avatar1\)");
       this.F = view;
       view = this.findViewById(R.id.avatar2);
       a.o(view, "findViewById\(R.id.avatar2\)");
       this.E = view;
       view = this.findViewById(R.id.lottie_avatar2);
       a.o(view, "findViewById\(R.id.lottie_avatar2\)");
       this.G = view;
       view = this.findViewById(R.id.match_icon);
       a.o(view, "findViewById\(R.id.match_icon\)");
       this.H = view;
       this.L(this.F, R.string.arg_RES_7f102fb3);
       this.L(this.G, R.string.arg_RES_7f102fb1);
       this.setOnClickListener(new b(this));
       this.L = s.c(new NearbyFunctionMatchView$avatar1Animator$2(this));
       this.M = s.c(new NearbyFunctionMatchView$avatar1LottieAnimator$2(this));
       this.N = s.c(new NearbyFunctionMatchView$avatar2Animator$2(this));
       this.O = s.c(new NearbyFunctionMatchView$avatar2LottieAnimator$2(this));
       this.P = s.c(new NearbyFunctionMatchView$matchIconAnimator$2(this));
       this.Q = s.c(NearbyFunctionMatchView$animationSet$2.INSTANCE);
    }
    public final void L(KwaiLottieAnimationView p0,int p1){
       if (PatchProxy.isSupport(NearbyFunctionMatchView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NearbyFunctionMatchView.class, "9")) {
          return;
       }
       p0.setRepeatCount(3);
       p0.setVisibility(0);
       p0.D(p1);
       p0.setProgress(0);
       return;
    }
    public final void M(){
       if (PatchProxy.applyVoid(null, this, NearbyFunctionMatchView.class, "8")) {
          return;
       }
       this.getAnimationSet().play(this.getAvatar1Animator()).with(this.getAvatar1LottieAnimator()).with(this.getAvatar2Animator()).with(this.getAvatar2LottieAnimator()).with(this.getMatchIconAnimator());
       this.getAnimationSet().addListener(new NearbyFunctionMatchView$a(this));
       this.getAnimationSet().start();
       return;
    }
    public final AnimatorSet getAnimationSet(){
       Object obj = PatchProxy.apply(null, this, NearbyFunctionMatchView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Q.getValue();
    }
    public final ObjectAnimator getAvatar1Animator(){
       Object obj = PatchProxy.apply(null, this, NearbyFunctionMatchView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L.getValue();
    }
    public final ObjectAnimator getAvatar1LottieAnimator(){
       Object obj = PatchProxy.apply(null, this, NearbyFunctionMatchView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.M.getValue();
    }
    public final ObjectAnimator getAvatar2Animator(){
       Object obj = PatchProxy.apply(null, this, NearbyFunctionMatchView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.N.getValue();
    }
    public final ObjectAnimator getAvatar2LottieAnimator(){
       Object obj = PatchProxy.apply(null, this, NearbyFunctionMatchView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.O.getValue();
    }
    public NearbyHeaderFunctionEntranceView$a getMItemClickListener(){
       return this.R;
    }
    public int getMPosition(){
       return this.S;
    }
    public final ObjectAnimator getMatchIconAnimator(){
       Object obj = PatchProxy.apply(null, this, NearbyFunctionMatchView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P.getValue();
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(NearbyFunctionMatchView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, NearbyFunctionMatchView.class, "7")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.I = (float)((double)this.getWidth() * 0x3fe147ae147ae148);
       this.J = (float)((this.getHeight() - this.B.getHeight()) / 2);
       this.B.setTranslationX((- this.I));
       this.F.setTranslationX((- this.I));
       this.C.setTranslationX(this.I);
       this.G.setTranslationX((- this.I));
       this.H.setTranslationY(this.J);
       return;
    }
    public void setData(HeaderFunctionCard p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyFunctionMatchView.class, "11")) {
          return;
       }
       a.p(p0, "functionCard");
       this.K = p0;
       this.D.U(p0.mHeadUrls);
       this.E.U(p0.mMomentHeadUrls);
       return;
    }
    public void setMItemClickListener(NearbyHeaderFunctionEntranceView$a p0){
       this.R = p0;
    }
    public void setMPosition(int p0){
       this.S = p0;
    }
}
