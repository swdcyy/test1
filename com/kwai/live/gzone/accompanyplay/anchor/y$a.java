package com.kwai.live.gzone.accompanyplay.anchor.y$a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.y;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import java.util.List;
import h37.n0;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import u07.t$a;
import u07.f;
import h37.d0;
import u07.u;
import h37.c0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public class y$a implements View$OnClickListener	// class@000b3f
{
    public final y b;

    public void y$a(y p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       y y;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, y$a.class, "1")) {
          return;
       }
       y$a b = obj.b;
       Objects.requireNonNull(b);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, b, y.class, "6")) {
          Activity activity = b.getActivity();
          if (b.x == null || (b.w != null && a1.i(activity))) {
             y x = b.x;
             y w = b.w;
             LiveGzoneAccompanyFleetInfo mRoundId = w.mRoundId;
             LiveGzoneAccompanyFleetInfo mWaitingMemb = w.mWaitingMemberCount;
             LiveGzoneAccompanyFleetInfo mOnBoardMemb = w.mOnBoardMembers;
             int i = 0;
             int i1 = (mOnBoardMemb == null)? 0: mOnBoardMemb.size();
             String str = (b.w.isEnableQueuing())? "ø™∆Ù≈≈∂”": "Õ£÷π≈≈∂”";
             y = b.y;
             y w1 = b.w;
             LiveGzoneAccompanyFleetInfo mGameId = w1.mGameId;
             LiveGzoneAccompanyFleetInfo mGameName = w1.mGameName;
             n0 on0 = n0.class;
             if (PatchProxy.isSupport(on0)) {
                Object[] objArray1 = new Object[]{x,mRoundId,Integer.valueOf(mWaitingMemb),Integer.valueOf(i1),str,y,mGameId,mGameName};
                if (PatchProxy.applyVoid(objArray1, objArray, on0, "18")) {
                label_00e2 :
                   if (y.D) {
                      b.S8(false);
                   }else if(b.w.isEnableQueuing()){
                      t$a uoa = f.e(new t$a(activity));
                      uoa.W0(R.string.arg_RES_7f102319);
                      uoa.S0(R.string.arg_RES_7f1023c9);
                      uoa.Q0(R.string.arg_RES_7f10231a);
                      uoa.t0(new d0(b, activity));
                      b.z = uoa.Y(new c0(b));
                   }else {
                      b.P8(activity, 1, false);
                   }
                }
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "QUEUE_BUTTON";
             i3 oi3 = i3.f();
             oi3.c("fleet_audience_num", Integer.valueOf(i1));
             oi3.c("queue_audience_num", Integer.valueOf(mWaitingMemb));
             oi3.d("accompany_id", x);
             oi3.d("button_status", str);
             oi3.d("round_id", mRoundId);
             uElementPack.params = oi3.e();
             ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
             liveStreamPa.liveStreamId = y;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             liveStreamPa.gameId = mGameId;
             liveStreamPa.gameName = mGameName;
             u1.u(1, uElementPack, uContentPack);
             goto label_00e2 ;
          }
       }
       return;
    }
}
