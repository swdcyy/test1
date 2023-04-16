package com.kwai.live.gzone.accompanyplay.anchor.b0$e;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.b0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import h37.n0;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import java.util.List;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import e17.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import u07.t$a;
import u07.f;
import com.kwai.live.gzone.accompanyplay.anchor.a0;
import u07.u;
import h37.j0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import android.widget.TextView;
import h37.i0;
import h37.h0;

public class b0$e implements View$OnClickListener	// class@000afc
{
    public final b0 b;

    public void b0$e(b0 p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       int b1;
       b0 w;
       LiveGzoneAccompanyFleetInfo mOnBoardMemb;
       LiveGzoneAccompanyFleetInfo mGameId;
       String str1;
       Activity activity;
       ClientContent$LiveStreamPackage liveStreamPa;
       Object[] obj = this;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, obj, b0$e.class, str)) {
          return;
       }
       b0$e b = obj.b;
       Objects.requireNonNull(b);
       n0 on0 = n0.class;
       b0 uob0 = b0.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, b, uob0, "8")) {
          LiveGzoneAccompanyFleetInfo mAccompanySt = b.v.mAccompanyStatus;
          b0 uob01 = 3;
          LiveGzoneAccompanyFleetInfo liveGzoneAcc = 4;
          LiveGzoneAccompanyFleetInfo liveGzoneAcc1 = 5;
          int i = 0;
          if (mAccompanySt != 2) {
             if (mAccompanySt != uob01) {
                if (mAccompanySt != liveGzoneAcc) {
                   if (mAccompanySt == liveGzoneAcc1) {
                      b.V8();
                   }
                }else if(PatchProxy.applyVoid(objArray, b, uob0, "15")){
                   b1 = b.P8();
                   w = b.w;
                   b0 v = b.v;
                   liveGzoneAcc1 = v.mRoundId;
                   liveGzoneAcc = v.mWaitingMemberCount;
                   mOnBoardMemb = v.mOnBoardMembers;
                   int i1 = (mOnBoardMemb == null)? 0: mOnBoardMemb.size();
                   uob01 = b.y;
                   b0 v1 = b.v;
                   mGameId = v1.mGameId;
                   LiveGzoneAccompanyFleetInfo mGameName = v1.mGameName;
                   if (PatchProxy.isSupport(on0)) {
                      obj = new Object[]{w,liveGzoneAcc1,Integer.valueOf(liveGzoneAcc),Integer.valueOf(i1),Boolean.valueOf(b1),uob01,mGameId,mGameName};
                      str1 = str;
                      if (PatchProxy.applyVoid(obj, null, on0, "21")) {
                      label_00f2 :
                         if (!b1) {
                            i.a(R.style.arg_RES_7f11066a, 0x7f102394);
                         }else {
                            activity = b.getActivity();
                            if (b.v != null && a1.i(activity)) {
                               t$a uoa = f.e(new t$a(activity));
                               uoa.W0(R.string.arg_RES_7f102350);
                               uoa.S0(R.string.arg_RES_7f103a83);
                               uoa.Q0(R.string.cancel);
                               uoa.u0(new a0(b));
                               b.A = uoa.Y(new j0(b));
                            }
                         }
                      }
                   }else {
                      str1 = str;
                   }
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "COMPLETE_ORDER";
                   i3 oi3 = i3.f();
                   oi3.c("fleet_audience_num", Integer.valueOf(i1));
                   oi3.c("queue_audience_num", Integer.valueOf(liveGzoneAcc));
                   oi3.d("accompany_id", w);
                   String str2 = (b1)? str1: "0";
                   oi3.d("is_complete_countdown", str2);
                   oi3.d("round_id", liveGzoneAcc1);
                   uElementPack.params = oi3.e();
                   liveStreamPa = new ClientContent$LiveStreamPackage();
                   liveStreamPa.liveStreamId = uob01;
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = liveStreamPa;
                   liveStreamPa.gameId = mGameId;
                   liveStreamPa.gameName = mGameName;
                   u1.u(1, uElementPack, uContentPack);
                   goto label_00f2 ;
                }
             }else {
                b.X8();
             }
          }else if(PatchProxy.applyVoid(null, b, uob0, "13")){
             activity = b.getActivity();
             if (b.v == null || (b.p.isSelected() && a1.i(activity))) {
                b0 w1 = b.w;
                uob0 = b.v;
                mOnBoardMemb = uob0.mWaitingMemberCount;
                LiveGzoneAccompanyFleetInfo mOnBoardMemb1 = uob0.mOnBoardMembers;
                b1 = (mOnBoardMemb1 == null)? 0: mOnBoardMemb1.size();
                w = b.y;
                b0 v2 = b.v;
                mGameId = v2.mGameId;
                liveGzoneAcc1 = v2.mGameName;
                if (PatchProxy.isSupport(on0)) {
                   Object[] objArray1 = new Object[]{w1,Integer.valueOf(mOnBoardMemb),Integer.valueOf(b1),w,mGameId,liveGzoneAcc1};
                   if (PatchProxy.applyVoid(objArray1, null, on0, "23")) {
                      t$a uoa1 = 1;
                   label_01e6 :
                      b0 v3 = b.v;
                      mOnBoardMemb1 = v3.mOnBoardMembers;
                      mGameId = (mOnBoardMemb1 == null || v3.mAllowedMaxUser > mOnBoardMemb1.size())? 1: 0;
                      if (mGameId) {
                         uoa1 = f.e(new t$a(activity));
                         uoa1.W0(R.string.arg_RES_7f1023a8);
                         uoa1.Q0(R.string.cancel);
                         uoa1.S0(R.string.arg_RES_7f103a83);
                         uoa1.u0(new i0(b, activity));
                         b.z = uoa1.Y(new h0(b));
                      }else {
                         b.W8(i, activity);
                      }
                   }
                }
                ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                uElementPack1.action2 = "PREPARE_BUTTON";
                i3 oi31 = i3.f();
                oi31.c("fleet_audience_num", Integer.valueOf(b1));
                oi31.c("queue_audience_num", Integer.valueOf(mOnBoardMemb));
                oi31.d("accompany_id", w1);
                uElementPack1.params = oi31.e();
                liveStreamPa = new ClientContent$LiveStreamPackage();
                liveStreamPa.liveStreamId = w;
                ClientContent$ContentPackage uContentPack1 = new ClientContent$ContentPackage();
                uContentPack1.liveStreamPackage = liveStreamPa;
                liveStreamPa.gameId = mGameId;
                liveStreamPa.gameName = liveGzoneAcc1;
                u1.u(1, uElementPack1, uContentPack1);
                goto label_01e6 ;
             }
          }
       }
    label_022c :
       return;
    }
}
