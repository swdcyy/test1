package com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$onCreate$5;
import msd.s;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import hu2.j;
import hu2.i;
import com.kuaishou.live.core.voiceparty.h;
import t02.a0;
import k2b.e0;
import z12.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import xs2.m;
import co2.q1;
import co2.f2;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import mw2.e;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.u1;

public final class VoicePartyAudienceViewController$onCreate$5 extends Lambda implements s	// class@001845
{
    public final VoicePartyAudienceViewController this$0;

    public void VoicePartyAudienceViewController$onCreate$5(VoicePartyAudienceViewController p0){
       this.this$0 = p0;
       super(5);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4){
       this.invoke(p0.longValue(), p1.longValue(), p2.longValue(), p3.intValue(), p4.intValue());
       return l1.a;
    }
    public final void invoke(long p0,long p1,long p2,int p3,int p4){
       e0 uoe0;
       ClientContent$LiveStreamPackage liveStreamPa;
       h c;
       Object[] objArray2;
       int i5;
       m om;
       Object[] objArray3;
       ClientContentWrapper$LiveVoicePartyPackage liveVoicePar;
       ClientContentWrapper$ContentWrapper uContentWrap;
       ClientContent$ContentPackage uContentPack;
       h$b uob;
       ClientEvent$ElementPackage uElementPack;
       Object obj = this;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 1;
       int i4 = 5;
       if (PatchProxy.isSupport(VoicePartyAudienceViewController$onCreate$5.class)) {
          Object[] objArray = new Object[i4];
          objArray[0] = Long.valueOf(p0);
          objArray[i3] = Long.valueOf(p1);
          objArray[i2] = Long.valueOf(p2);
          objArray[i1] = Integer.valueOf(p3);
          objArray[i] = Integer.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, obj, VoicePartyAudienceViewController$onCreate$5.class, "1")) {
             return;
          }
       }
       h oh = obj.this$0.H.d().b();
       if (oh != null) {
          h oh1 = h.class;
          if (PatchProxy.isSupport(oh1)) {
             Object[] objArray1 = new Object[i4];
             objArray1[0] = Long.valueOf(p0);
             objArray1[i3] = Long.valueOf(p1);
             objArray1[i2] = Long.valueOf(p2);
             objArray1[i1] = Integer.valueOf(p3);
             objArray1[i] = Integer.valueOf(p4);
             if (!PatchProxy.applyVoid(objArray1, oh, oh1, "26")) {
             }
          }else {
          }
       }
    label_0154 :
       return;
    }
}
