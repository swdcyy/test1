package dl2.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.subscribe.subscribelist.a;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedAnchorInfo$LiveSubscribedAnchor;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import wk2.s;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k2b.u1;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;

public final class c implements View$OnClickListener	// class@00253e
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       ClientEvent$ElementPackage uElementPack = s.c(tb.P8(), tb.t);
       ClientContent$ContentPackage uContentPack = s.b(tb.t);
       if (PatchProxy.applyVoidTwoRefs(uElementPack, uContentPack, null, s.class, "5")) {
       }else {
          uElementPack.action2 = "LIVE_ORDER_ANCHOR_HEAD_SUBCARD";
          u1.u(1, uElementPack, uContentPack);
       }
       d.a(-1718536792).Y7(tb.getActivity(), ProfileStartParam.m(tb.t.mUserInfo.mId));
       return;
    }
}
