package f52.d0;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.n;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPreInfo;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.framework.model.feed.BaseFeed;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import j52.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class d0 extends m	// class@002884
{
    public final LiveStreamFeedWrapper c;
    public final n d;

    public void d0(n p0,LiveStreamFeedWrapper p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
          return;
       }
       QPreInfo qPreInfo = new QPreInfo();
       qPreInfo.mPreExpTag = this.c.getExpTag();
       qPreInfo.mPreUserId = this.c.getUserId();
       qPreInfo.mPreLLSId = String.valueOf(this.c.getListLoadSequenceID());
       qPreInfo.mPrePhotoIndex = this.c.getPosition();
       qPreInfo.mPrePhotoId = this.c.getPhotoId();
       ProfileStartParam profileStart = ProfileStartParam.l(this.c.getUser());
       profileStart.A(qPreInfo);
       profileStart.x(this.c.mEntity);
       d.a(-1718536792).Y7(this.d.getActivity(), profileStart);
       ClientContent$LiveStreamPackage liveStreamPa = this.d.p.Z2.a();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, a.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AUTHOR_HEAD";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u(1, uElementPack, uContentPack);
       }
       return;
    }
}
