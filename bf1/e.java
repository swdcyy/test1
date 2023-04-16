package bf1.e;
import bf1.c;
import df1.c;
import android.view.View;
import df1.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.comments.fluency.highfluencymessage.handlers.widget.HighFluencyStrongStyleView;
import android.content.Context;
import bf1.j;
import ne1.k;
import bf1.d;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$HighFluencyStyle;
import lnc.a1;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$HighFluencyStyle$StrongStyle;
import va1.l0;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.lang.CharSequence;
import ef1.d;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$DisplayPosition;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide$TextDescription;
import android.widget.FrameLayout;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder;
import ef1.a;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$a;

public class e extends c	// class@000373
{

    public void e(){
       super();
    }
    public View r(c p0){
       HighFluencyStrongStyleView highFluencyS = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (highFluencyS != PatchProxyResult.class) {
       }else {
          f c = p0.c;
          HighFluencyStrongStyleView highFluencyS1 = new HighFluencyStrongStyleView(this.k());
          if (k.a()) {
             highFluencyS1.setIsEnableShadow(true);
          }
          highFluencyS1.setActionButtonClickListener(new d(this, p0, c));
          LiveAudienceDelayInfosResponse$HighFluencyStyle mStrongStyle = this.n().mStrongStyle;
          if (!PatchProxy.applyVoidTwoRefs(c, mStrongStyle, highFluencyS1, HighFluencyStrongStyleView.class, "4")) {
             highFluencyS1.b();
             if (!PatchProxy.applyVoidOneRefs(mStrongStyle, highFluencyS1, HighFluencyStrongStyleView.class, "7")) {
                if (!PatchProxy.applyVoidOneRefs(mStrongStyle, highFluencyS1, HighFluencyStrongStyleView.class, "8")) {
                   int i = a1.a(R.color.arg_RES_7f0604ca);
                   if (mStrongStyle != null) {
                      i = l0.j(mStrongStyle.mBackgroundStartColor, i);
                   }
                   int i1 = a1.a(R.color.arg_RES_7f0604be);
                   if (mStrongStyle != null) {
                      i1 = l0.j(mStrongStyle.mBackgroundEndColor, i1);
                   }
                   b uob = new b();
                   uob.l(i, i1);
                   uob.j(0);
                   uob.g(KwaiRadiusStyles.R12);
                   highFluencyS1.g.setBackground(uob.a());
                }
                if (!PatchProxy.applyVoidOneRefs(mStrongStyle, highFluencyS1, HighFluencyStrongStyleView.class, "9") && mStrongStyle != null) {
                   highFluencyS1.c.setTextColor(l0.j(mStrongStyle.mButtonTextColor, a1.a(R.color.arg_RES_7f060753)));
                   highFluencyS1.d.L(mStrongStyle.mButtonBackgroundUrl);
                }
             }
          label_00b9 :
             highFluencyS1.b.U(e0.i(c.leftIcon));
             highFluencyS1.c.setText(c.actionText);
             HighFrequencyActionGuide titleLarge = (d.b())? c.titleLarge: c.titleSmall;
             HighFluencyDescriptionBinder highFluencyD = highFluencyS1.a(mStrongStyle, HighFluencyDescriptionBinder$DisplayPosition.Title, titleLarge, highFluencyS1.e);
             highFluencyD.d(titleLarge);
             highFluencyD.e(c.giftId, new a());
             HighFrequencyActionGuide subTitle = c.subTitle;
             highFluencyS1.a(mStrongStyle, HighFluencyDescriptionBinder$DisplayPosition.SubTitle, subTitle, highFluencyS1.f).d(subTitle);
          }
          highFluencyS = highFluencyS1;
       }
       return highFluencyS;
    }
    public String toString(){
       return "HighFluencyStrongStyleHandler{}";
    }
}
