package com.kwai.live.gzone.accompanyplay.anchor.y$b;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.y;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k37.p1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import g37.c;
import com.kwai.live.gzone.widget.e$a;
import com.kwai.library.widget.popup.common.c;
import h37.n0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class y$b implements View$OnClickListener	// class@000b40
{
    public final y b;

    public void y$b(y p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       ClientEvent$ElementPackage uElementPack;
       i3 oi3;
       ClientContent$ContentPackage uContentPack;
       if (PatchProxy.applyVoidOneRefs(p0, this, y$b.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.b.C.a.a();
       Activity activity = this.b.getActivity();
       if (a1.i(activity)) {
          y w = this.b.w;
          if (w != null) {
             if (w.mWaitingMemberCount <= null) {
                return;
             }else {
                liveStreamPa.gameName = w.mGameName;
                liveStreamPa.gameId = w.mGameId;
                y$b tb = this.b;
                c uoc = new c(new e$a(activity), tb.C, tb.x, tb.w.mRoundId, liveStreamPa, "AUDIENCE_CARD_ANCHOR");
                v7.Z();
                tb = this.b;
                y x = tb.x;
                LiveGzoneAccompanyFleetInfo mRoundId = tb.w.mRoundId;
                if (!PatchProxy.applyVoidThreeRefs(x, mRoundId, liveStreamPa, null, n0.class, "15")) {
                   uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "CURRENT_QUEUE_BUTTON";
                   oi3 = i3.f();
                   oi3.d("round_id", mRoundId);
                   oi3.d("accompany_id", x);
                   uElementPack.params = oi3.e();
                   uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = liveStreamPa;
                   u1.u(1, uElementPack, uContentPack);
                }
                tb = this.b;
                x = tb.x;
                mRoundId = tb.w.mRoundId;
                if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, x, mRoundId, null, n0.class, "7")) {
                   uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "AUDIENCE_QUEUE_ANCHOR_POP";
                   oi3 = i3.f();
                   oi3.d("accompany_id", x);
                   oi3.d("round_id", mRoundId);
                   uElementPack.params = oi3.e();
                   uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = liveStreamPa;
                   u1.u0(10, uElementPack, uContentPack);
                }
             }
          }
       }
       return;
    }
}
