package df2.h;
import androidx.lifecycle.Observer;
import df2.m0;
import java.lang.Object;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import db1.b;
import df2.n0;
import android.view.View;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.framework.model.user.UserProfile;
import cf2.c;
import wj2.r;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import bb1.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import k2b.u1;

public final class h implements Observer	// class@0024f3
{
    public final m0 b;

    public void h(m0 p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       h tb = this.b;
       tb.x.setTargetUserAssType(p0.getAssistType());
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, m0.class, "8")) {
       }else {
          tb.x.bindAdminParams(tb.L);
          tb.M = new n0(tb);
       }
       tb.M9();
       if (tb.x.getOriginUserAssType() == LiveApiParams$AssistantType.PUSHER) {
          tb.E.setVisibility(0);
          tb.H.setVisibility(8);
          tb.G.setVisibility(8);
          tb.I.setVisibility(0);
          tb.I.setText(a1.p(R.string.arg_RES_7f102a8a));
          p0 = tb.x.getUserProfile().mProfile;
          ClientContent$LiveStreamPackage liveStreamPa = tb.v.c().a();
          if (!PatchProxy.applyVoidTwoRefs(p0, liveStreamPa, objArray, f.class, "7")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PERSONAL_CARD_MANAGE_BUTTON";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             uContentPack.userPackage = f.a(p0);
             u1.u0(9, uElementPack, uContentPack);
          }
       }
       return;
    }
}
