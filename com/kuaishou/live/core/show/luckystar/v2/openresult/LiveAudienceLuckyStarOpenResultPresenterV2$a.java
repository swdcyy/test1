package com.kuaishou.live.core.show.luckystar.v2.openresult.LiveAudienceLuckyStarOpenResultPresenterV2$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveAudienceLuckyStarOpenResultPresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yb2.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveAudienceLuckyStarOpenResultPresenterV2$b;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType;
import java.lang.Enum;
import com.kuaishou.live.core.show.luckystar.v2.luckyuser.LiveLuckyStarLuckyUserFragmentV2;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.dialog.base.LiveBottomSheetFragment;

public class LiveAudienceLuckyStarOpenResultPresenterV2$a extends m	// class@000d06
{
    public final LiveAudienceLuckyStarOpenResultPresenterV2 c;

    public void LiveAudienceLuckyStarOpenResultPresenterV2$a(LiveAudienceLuckyStarOpenResultPresenterV2 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLuckyStarOpenResultPresenterV2$a.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.c.V8().a.a();
       LiveAudienceLuckyStarOpenResultPresenterV2 m = this.c.M;
       LiveAudienceLuckyStarOpenResultPresenterV2$b a = m.a;
       LiveAudienceLuckyStarOpenResultPresenterV2$b b = m.b;
       if (!PatchProxy.isSupport(LiveLuckyStarLogger.class) || !PatchProxy.applyVoidThreeRefs(liveStreamPa, a, Integer.valueOf(b), null, LiveLuckyStarLogger.class, "26")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_LUCKYSTAR_LOTTER_AUDIENCE_POPUP";
          ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
          moreInfoPack.id = TextUtils.k(a);
          moreInfoPack.type = String.valueOf(b);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          uContentPack.moreInfoPackage = moreInfoPack;
          u1.u0(9, uElementPack, uContentPack);
       }
       this.c.X8(LiveAudienceLuckyStarOpenResultPresenterV2$ButtonType.VIEW_ALL.name());
       i oi = this.c.V8();
       LiveAudienceLuckyStarOpenResultPresenterV2$a tc = this.c;
       a = tc.M.a;
       LiveAudienceLuckyStarOpenResultPresenterV2 p = tc.P;
       LiveLuckyStarLuckyUserFragmentV2 liveLuckySta = PatchProxy.applyThreeRefs(oi, a, p, null, LiveLuckyStarLuckyUserFragmentV2.class, "1");
       if (liveLuckySta != PatchProxyResult.class) {
       }else {
          liveLuckySta = new LiveLuckyStarLuckyUserFragmentV2();
          liveLuckySta.C = oi;
          liveLuckySta.D = a;
          liveLuckySta.E = p;
       }
       liveLuckySta.Cb(this.c.V8().a.b().getFragmentManager(), "LiveLuckyStarLuckyUserFragmentV2");
       return;
    }
}
