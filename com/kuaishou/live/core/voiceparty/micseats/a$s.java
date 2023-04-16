package com.kuaishou.live.core.voiceparty.micseats.a$s;
import erd.g;
import com.kuaishou.live.core.voiceparty.micseats.a;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartySwitchMicResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import z12.e;
import co2.f2;
import ht2.a;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatInfo;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo;
import brd.y;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.util.Iterator;
import java.lang.Iterable;
import qs2.r;
import pt2.b;
import e17.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import com.google.common.base.Optional;
import co2.k1;

public final class a$s implements g	// class@001575
{
    public final a b;
    public final VoicePartyMicSeatData c;

    public void a$s(a p0,VoicePartyMicSeatData p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo userMicSeatL1;
       LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo userMicSeatL2;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$s.class, "1")) {
       }else {
          String str = "response";
          a.p(p0, str);
          int i = 0;
          String[] stringArray = new String[i];
          e.c("VoicePartyAudienceMicManager", "switchMic success", stringArray);
          a$s tb = this.b;
          tb.s.k = p0.mMicSeatsVersion;
          VoicePartySwitchMicResponse mNewMicSeat = p0.mNewMicSeat;
          a.o(mNewMicSeat, "response.mNewMicSeat");
          LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo userMicSeatL = null;
          tb.A.onNext(new a(mNewMicSeat, p0.mMicSeatsVersion, userMicSeatL));
          a w = this.b.w;
          Objects.requireNonNull(w);
          String obj = PatchProxy.applyOneRefs(p0, w, AudienceMicSeatsDataManager.class, "6");
          if (obj != PatchProxyResult.class) {
             userMicSeatL = obj;
          }else {
             a.p(p0, str);
             VoicePartySwitchMicResponse mNewMicSeat1 = p0.mNewMicSeat;
             Iterator iterator = w.k().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   userMicSeatL1 = iterator.next();
                   if (!r.g(userMicSeatL1)) {
                      continue ;
                   }
                }else {
                   userMicSeatL1 = userMicSeatL;
                }
                iterator = w.k().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      userMicSeatL2 = iterator.next();
                      Object obj1 = (userMicSeatL2.mId == mNewMicSeat1.mMicSeatId)? 1: null;
                      if (!obj1) {
                         continue ;
                      }
                   }else {
                      userMicSeatL2 = userMicSeatL;
                   }
                   VoicePartyMicSeatData mMicUser = (userMicSeatL1 != null)? userMicSeatL1.mMicUser: userMicSeatL;
                   if (mMicUser != null && userMicSeatL2 != null) {
                      userMicSeatL2.mMicState = mNewMicSeat1.mMicState;
                      VoicePartyMicSeatData mMicUser1 = userMicSeatL1.mMicUser;
                      userMicSeatL2.mMicUser = mMicUser1;
                      a.m(mMicUser1);
                      mMicUser1.g = p0.mKsCoin;
                      mMicUser1 = userMicSeatL2.mMicUser;
                      a.m(mMicUser1);
                      mMicUser1.h = p0.mUserLevel;
                      userMicSeatL1.mMicUser = userMicSeatL;
                      w.C(w.k(), i);
                      userMicSeatL = userMicSeatL2;
                   }
                }
             }
          }
          if (userMicSeatL != null && r.f(userMicSeatL.mMicState)) {
             i.a(R.style.arg_RES_7f11066a, 0x7f102e11);
          }
          p0 = this.b;
          tb = this.c;
          obj = p0.X(tb);
          p0 = r.a(this.c);
          a.o(p0, "VoicePartyMicSeatUtils.getUserInfo\(micInfo\)");
          k1.b(this.b.q.a(), p0.s, tb, obj, p0.isPresent(), 14);
       }
       return;
    }
}
