package com.kuaishou.live.core.show.template.h;
import lf3.g;
import com.kuaishou.live.core.show.template.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.util.Objects;
import ekd.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import m91.b;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.Fragment;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveActivityPopUpInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import uc.d;
import brd.t;
import com.kuaishou.live.common.core.basic.tools.l;
import hl2.m;
import hl2.n;
import erd.g;
import crd.b;
import java.lang.Long;
import z12.x;
import lf3.f;

public final class h implements g	// class@001186
{
    public final j b;

    public void h(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       long l;
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null && !j.h(p0.activityPopUpInfo)) {
          SCActionSignal activityPopU = p0.activityPopUpInfo;
          j oj = j.class;
          if (!PatchProxy.applyVoidOneRefs(activityPopU, tb, oj, "5")) {
             LiveLogTag lIVE_GUEST_A = LiveLogTag.LIVE_GUEST_ACTIVITY;
             b.c0(lIVE_GUEST_A, "onReceiveGuestActivityPopupDialogInfo", "message is", a.a.q(activityPopU));
             if (tb.K.N().r2(AudienceBizRelation.VOICE_PARTY)) {
                tb.a9();
                b.Z(lIVE_GUEST_A, "Now in voice party room");
             }else if(tb.K.N().r2(AudienceBizRelation.GIFT_COMBO)){
                tb.a9();
                b.Z(lIVE_GUEST_A, "Now in gift send combo status");
             }else if(tb.K.N().r2(AudienceBizRelation.GIFT_BOX)){
                tb.a9();
                b.Z(lIVE_GUEST_A, "Now in gift box open status");
             }else if(y.d(tb.getActivity())){
                tb.a9();
                b.Z(lIVE_GUEST_A, "Now in landscape status");
             }else if(tb.K.Z2.b() == null || !tb.K.Z2.b().isResumed()){
                b.Z(lIVE_GUEST_A, "not show reason: fragment is null or not resume");
             }else {
                int len = activityPopU.length;
                int i = 0;
                while (i < len) {
                   object oobject = activityPopU[i];
                   if (oobject != null) {
                      if (!PatchProxy.applyVoidOneRefs(oobject, tb, oj, "6") && (!j.h(oobject.picUrl) && oobject.user != null)) {
                         CDNUrl[] uCDNUrlArray = e0.i(oobject.picUrl);
                         UserInfo userInfo = UserInfo.convertFromProto(oobject.user);
                         tb.X7(l.e(uCDNUrlArray, null).subscribe(new m(tb, oobject, userInfo), new n(tb, oobject, userInfo, uCDNUrlArray)));
                      }
                   label_00e3 :
                      LiveActivitySignalMessage$LiveActivityPopUpInfo followReques = oobject.followRequestMaxDelayMs;
                      if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Long.valueOf(followReques), tb, oj, "9")) {
                         if (!followReques) {
                            followReques = 0x2710;
                         }
                         l = x.B(followReques);
                         tb.O = l;
                         Long longx = Long.valueOf(l);
                         b.c0(LiveLogTag.LIVE_GUEST_ACTIVITY, "Follow Request Delay Time", "delay time is", longx);
                         break ;
                      }
                   }
                   i = i + 1;
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
