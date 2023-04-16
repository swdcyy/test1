package h11.e;
import bf1.c;
import z1.a;
import com.kwai.framework.model.user.User;
import df1.c;
import android.view.View;
import df1.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.e;
import bf1.j;
import lq5.a;
import lp3.c;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyMultiLikeView;
import android.content.Context;
import ne1.k;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$HighFluencyStyle;
import h11.d;
import lnc.a1;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$HighFluencyStyle$StrongStyle;
import va1.l0;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.g;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.a;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$DisplayPosition;
import java.lang.Integer;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.h;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.b;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.a;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.i;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.c;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.j;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.d;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.lang.CharSequence;
import ef1.d;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide$TextDescription;
import com.kuaishou.live.common.core.component.highfrequency.widget.HighFluencyIncreaseNumberView;
import android.widget.LinearLayout;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController;
import androidx.lifecycle.Lifecycle;
import i11.f;
import java.lang.Number;
import df1.d;
import i11.e;
import androidx.lifecycle.LiveData;
import df1.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import v91.n;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.f;
import ok.h;
import java.lang.Long;
import i11.c;
import java.lang.Runnable;
import e93.f;
import h11.c;
import android.view.View$OnClickListener;

public class e extends c	// class@00260a
{
    public final a h;
    public final User i;

    public void e(a p0,User p1){
       super();
       this.h = p0;
       this.i = p1;
    }
    public View r(c p0){
       e d;
       HighFrequencyActionGuide obj;
       HighFluencyDescriptionBinder$DisplayPosition subTitle1;
       HighFluencyMultiLikeView highFluencyM = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (highFluencyM != PatchProxyResult.class) {
       }else {
          c uoc = this.m().a(a.class);
          HighFluencyMultiLikeView highFluencyM1 = new HighFluencyMultiLikeView(this.k());
          if (k.a()) {
             highFluencyM1.setIsEnableShadow(true);
          }
          LiveAudienceDelayInfosResponse$HighFluencyStyle mStrongStyle = this.n().mStrongStyle;
          d uod = new d(this);
          if (!PatchProxy.applyVoidThreeRefs(p0, mStrongStyle, uod, highFluencyM1, HighFluencyMultiLikeView.class, "3")) {
             highFluencyM1.r = p0;
             highFluencyM1.q = uod;
             int i = 0;
             if (!PatchProxy.applyVoidOneRefs(mStrongStyle, highFluencyM1, HighFluencyMultiLikeView.class, "11")) {
                if (!PatchProxy.applyVoidOneRefs(mStrongStyle, highFluencyM1, HighFluencyMultiLikeView.class, "12") && mStrongStyle != null) {
                   b uob = new b();
                   uob.j(i);
                   uob.l(l0.j(mStrongStyle.mBackgroundStartColor, a1.a(R.color.arg_RES_7f0604ca)), l0.j(mStrongStyle.mBackgroundEndColor, a1.a(R.color.arg_RES_7f0604be)));
                   uob.g(KwaiRadiusStyles.R12);
                   highFluencyM1.b.setBackground(uob.a());
                }
                if (!PatchProxy.applyVoidOneRefs(mStrongStyle, highFluencyM1, HighFluencyMultiLikeView.class, "13") && mStrongStyle != null) {
                   highFluencyM1.f.setTextColor(l0.j(mStrongStyle.mButtonTextColor, a1.a(R.color.arg_RES_7f060753)));
                   highFluencyM1.e.L(mStrongStyle.mButtonBackgroundUrl);
                }
                if (!PatchProxy.applyVoidOneRefs(mStrongStyle, highFluencyM1, HighFluencyMultiLikeView.class, "14")) {
                   subTitle1 = HighFluencyDescriptionBinder$DisplayPosition.Title;
                   highFluencyM1.n.c(k0.b(mStrongStyle, g.a, a.a).or(Integer.valueOf(a1.a(subTitle1.mDefaultColorRes))).intValue(), k0.b(mStrongStyle, h.a, b.a).or(Integer.valueOf(a1.a(subTitle1.mDefaultShadowColor))).intValue(), subTitle1, highFluencyM1.m);
                }
                if (!PatchProxy.applyVoidOneRefs(mStrongStyle, highFluencyM1, HighFluencyMultiLikeView.class, "15")) {
                   subTitle1 = HighFluencyDescriptionBinder$DisplayPosition.SubTitle;
                   highFluencyM1.o.c(k0.b(mStrongStyle, i.a, c.a).or(Integer.valueOf(a1.a(subTitle1.mDefaultColorRes))).intValue(), k0.b(mStrongStyle, j.a, d.a).or(Integer.valueOf(a1.a(subTitle1.mDefaultShadowColor))).intValue(), subTitle1, highFluencyM1.m);
                }
             }
             d = p0.d;
             if (!PatchProxy.applyVoidOneRefs(d, highFluencyM1, HighFluencyMultiLikeView.class, "16")) {
                highFluencyM1.d.U(e0.i(d.leftIcon));
                highFluencyM1.f.setText(d.actionText);
                obj = (d.b())? d.titleLarge: d.titleSmall;
                String str = 8;
                if (!PatchProxy.applyVoidOneRefs(obj, highFluencyM1, HighFluencyMultiLikeView.class, "18") && obj != null) {
                   if (obj.displayStyle == 3) {
                      highFluencyM1.n.d(obj);
                      highFluencyM1.h.d(obj.startCount, (obj.endCount + true));
                   }else {
                      highFluencyM1.i.setText(obj.text);
                      highFluencyM1.h.setVisibility(str);
                   }
                }
                HighFrequencyActionGuide subTitle = d.subTitle;
                if (!PatchProxy.applyVoidOneRefs(subTitle, highFluencyM1, HighFluencyMultiLikeView.class, "19") && subTitle != null) {
                   if (subTitle.displayStyle == 3) {
                      highFluencyM1.o.d(subTitle);
                   }else {
                      highFluencyM1.k.setText(subTitle.text);
                      highFluencyM1.j.setVisibility(str);
                   }
                }
             }
          label_01e0 :
             HighFluencyLikeViewStateController highFluencyL = new HighFluencyLikeViewStateController(highFluencyM1.getLifecycle(), highFluencyM1, 2500);
             highFluencyL.e = new f(highFluencyM1);
             obj = PatchProxy.apply(null, p0, e.class, "4");
             i = (obj != PatchProxyResult.class)? obj.intValue(): k0.a(p0.c, d.a).or(Integer.valueOf(i)).intValue();
             highFluencyM1.t = i;
             e uoe = new e(highFluencyM1, highFluencyL);
             if (!PatchProxy.applyVoidTwoRefs(highFluencyM1, uoe, p0, e.class, "3")) {
                d = p0.c;
                if (d != null) {
                   d.l().observe(highFluencyM1, uoe);
                }
             }
             f.k("HighFluencyMultiLikeView.bind", new c(highFluencyM1, p0), highFluencyM1, n.d("highFrequency_multiLike_v2").transform(f.b).or(Long.valueOf(0x2710)).longValue());
          }
          highFluencyM1.setAnchorUser(this.i);
          highFluencyM1.setLiveLikeService(uoc);
          highFluencyM1.setOnActionButtonClickListener(new c(this, p0));
          highFluencyM = highFluencyM1;
       }
       return highFluencyM;
    }
    public void s(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
       }else {
          this.h.accept(p0);
       }
       return;
    }
    public String toString(){
       return "HighFluencyMultiLikeHandler{}";
    }
}
