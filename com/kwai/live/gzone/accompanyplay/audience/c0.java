package com.kwai.live.gzone.accompanyplay.audience.c0;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.audience.b0;
import o37.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAudienceAccompanyFleetInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import g37.c;
import com.kwai.live.gzone.widget.e$a;
import k37.p1;
import com.kwai.library.widget.popup.common.c;
import k37.a0;
import lnc.i3;

public class c0 implements View$OnClickListener	// class@000b71
{
    public final a b;
    public final b0 c;

    public void c0(b0 p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       a mFleetInfo1;
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.c.p.a();
       Activity activity = this.c.getActivity();
       if (a1.i(activity)) {
          c0 tb = this.b;
          a mFleetInfo = tb.mFleetInfo;
          if (mFleetInfo != null) {
             if (mFleetInfo.mWaitingMemberCount <= null) {
                return;
             }else {
                a mGameInfo = tb.mGameInfo;
                if (mGameInfo != null) {
                   liveStreamPa.gameName = mGameInfo.mGameName;
                   liveStreamPa.gameId = mGameInfo.mGameId;
                }
                mFleetInfo1 = this.b.mFleetInfo;
                c uoc = new c(new e$a(activity), this.c.p.w(), mFleetInfo1.mAccompanyId, mFleetInfo1.mCurrentRoundId, liveStreamPa, "AUDIENCE_CARD");
                v7.Z();
             }
          }
       }
       a0.d(liveStreamPa, this.c.p.t(), "AUDIENCE_AMOUNT_BUTTON", 0);
       mFleetInfo1 = this.c.p.t();
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, mFleetInfo1, null, a0.class, "9")) {
          a0.k("AUDIENCE_LIST_POP", a0.a(mFleetInfo1).e(), liveStreamPa, mFleetInfo1);
       }
       return;
    }
}
