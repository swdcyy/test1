package com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyLikeFinishView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import d61.c0;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Integer;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Boolean;
import lnc.a1;

public class HighFluencyLikeFinishView extends ConstraintLayout	// class@000b86
{
    public KwaiImageView B;
    public LiveLottieAnimationView C;
    public TextView D;
    public TextView E;

    public void HighFluencyLikeFinishView(Context p0){
       super(p0, null);
    }
    public void HighFluencyLikeFinishView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HighFluencyLikeFinishView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HighFluencyLikeFinishView.class, "5")) {
       }else {
          View view = a.c(this.getContext(), R.layout.arg_RES_7f0d0c0d, this);
          if (!PatchProxy.applyVoidOneRefs(view, this, HighFluencyLikeFinishView.class, "6")) {
             this.B = m1.f(view, 0x7f0a0333);
             this.D = m1.f(view, 0x7f0a0200);
             this.C = m1.f(view, 0x7f0a1286);
             this.E = m1.f(view, 0x7f0a3e81);
             if (!PatchProxy.applyVoid(objArray, this, HighFluencyLikeFinishView.class, "7")) {
                this.C.setAnimationFromUrl(c0.a.b("/udata/pkg/kwai-client-image/live_like/live_high_fluency_message_like_finish_heart_animate.json"));
             }
          }
       }
       return;
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, HighFluencyLikeFinishView.class, "4")) {
          return;
       }
       if (this.C.p()) {
          return;
       }
       this.C.s();
       return;
    }
    public final void M(TextView p0,int p1){
       if (PatchProxy.isSupport(HighFluencyLikeFinishView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, HighFluencyLikeFinishView.class, "2")) {
          return;
       }
       p0.setShadowLayer(3.00f, 0, 3.00f, p1);
       return;
    }
    public void setAnchorUser(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HighFluencyLikeFinishView.class, "3")) {
          return;
       }
       this.B.L(p0.mAvatar);
       this.D.setText("£À"+b.c(UserInfo.convertFromQUser(p0)));
       return;
    }
    public void setIsEnableShadow(boolean p0){
       if (PatchProxy.isSupport(HighFluencyLikeFinishView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HighFluencyLikeFinishView.class, "1")) {
          return;
       }
       if (p0) {
          this.M(this.E, a1.a(R.color.arg_RES_7f0604bb));
          this.M(this.D, a1.a(R.color.arg_RES_7f0604bb));
       }
       return;
    }
}
