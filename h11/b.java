package h11.b;
import bf1.c;
import ok.o;
import z1.a;
import com.kwai.framework.model.user.User;
import df1.c;
import df1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bf1.j;
import android.view.View;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyLocalLikeView;
import android.content.Context;
import ne1.k;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$HighFluencyStyle;
import h11.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lnc.a1;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$HighFluencyStyle$StrongStyle;
import va1.l0;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import i11.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public class b extends c	// class@002607
{
    public final o h;
    public final a i;
    public final User j;

    public void b(o p0,a p1,User p2){
       super();
       this.j = p2;
       this.h = p0;
       this.i = p1;
    }
    public boolean q(c p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(super.q(p0) || this.h.apply(p0)){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public View r(c p0){
       HighFluencyLocalLikeView highFluencyL = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (highFluencyL != PatchProxyResult.class) {
       }else {
          HighFluencyLocalLikeView highFluencyL1 = new HighFluencyLocalLikeView(this.k());
          highFluencyL1.setIsEnableShadow(k.a());
          LiveAudienceDelayInfosResponse$HighFluencyStyle highFluencyS = this.n();
          a uoa = new a(this);
          if (!PatchProxy.applyVoidThreeRefs(p0, highFluencyS, uoa, highFluencyL1, HighFluencyLocalLikeView.class, "3")) {
             highFluencyL1.m = p0;
             highFluencyL1.l = uoa;
             if (highFluencyS != null && !PatchProxy.applyVoidOneRefs(highFluencyS, highFluencyL1, HighFluencyLocalLikeView.class, "10")) {
                String str = (TextUtils.x(highFluencyS.mLikeLeftIconUrl))? c0.a.b("/udata/pkg/kwai-client-image/live_high_fluency_message/live_high_fluency_message_left_icon_like.webp"): highFluencyS.mLikeLeftIconUrl;
                highFluencyL1.d.L(str);
                LiveAudienceDelayInfosResponse$HighFluencyStyle mStrongStyle = highFluencyS.mStrongStyle;
                if (mStrongStyle != null && !PatchProxy.applyVoidOneRefs(mStrongStyle, highFluencyL1, HighFluencyLocalLikeView.class, "11")) {
                   b uob = new b();
                   uob.l(l0.j(mStrongStyle.mBackgroundStartColor, a1.a(R.color.arg_RES_7f0604ca)), l0.j(mStrongStyle.mBackgroundEndColor, a1.a(R.color.arg_RES_7f0604be)));
                   uob.g(KwaiRadiusStyles.R12);
                   highFluencyL1.b.setBackground(uob.a());
                }
             }
          label_00a3 :
             if (highFluencyL1.j != null) {
                int i = a1.a(R.color.arg_RES_7f0604bb);
                highFluencyL1.a(highFluencyL1.e, i);
                highFluencyL1.a(highFluencyL1.f, i);
                highFluencyL1.a(highFluencyL1.g, i);
                highFluencyL1.a(highFluencyL1.h, i);
             }
             if (!PatchProxy.applyVoidOneRefs(p0, highFluencyL1, HighFluencyLocalLikeView.class, "12")) {
                p0.l().observe(highFluencyL1, new a(highFluencyL1, new HighFluencyLikeViewStateController(highFluencyL1.getLifecycle(), highFluencyL1, 2500)));
             }
          }
          highFluencyL1.setAnchorUser(this.j);
          highFluencyL = highFluencyL1;
       }
       return highFluencyL;
    }
    public void s(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
       }else {
          this.i.accept(p0);
       }
       return;
    }
    public String toString(){
       return "HighFluencyLocalLikeHandler{}";
    }
}
