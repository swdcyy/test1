package com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$onCreate$6;
import msd.u;
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
import xs2.m;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import co2.q1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import co2.f2;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$SeriesPackage;
import mw2.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import lnc.i3;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;

public final class VoicePartyAudienceViewController$onCreate$6 extends Lambda implements u	// class@001846
{
    public final VoicePartyAudienceViewController this$0;

    public void VoicePartyAudienceViewController$onCreate$6(VoicePartyAudienceViewController p0){
       this.this$0 = p0;
       super(7);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6){
       this.invoke(p0.longValue(), p1.longValue(), p2.longValue(), p3.intValue(), p4.intValue(), p5.intValue(), p6.intValue());
       return l1.a;
    }
    public final void invoke(long p0,long p1,long p2,int p3,int p4,int p5,int p6){
       e0 uoe0;
       ClientContent$LiveStreamPackage liveStreamPa;
       h c;
       h h;
       m om;
       int i5;
       int i6;
       Object[] objArray2;
       ClientContentWrapper$ContentWrapper uContentWrap;
       ClientContentWrapper$LiveVoicePartyPackage liveVoicePar;
       ClientContentWrapper$MoreInfoPackage moreInfoPack;
       String str;
       ClientContentWrapper$SeriesPackage seriesPackag;
       ClientContent$ContentPackage uContentPack;
       i3 oi3;
       String str1;
       ClientEvent$ElementPackage uElementPack;
       Object obj = this;
       int i = 6;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 2;
       if (PatchProxy.isSupport(VoicePartyAudienceViewController$onCreate$6.class)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),Long.valueOf(p1),Long.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, obj, VoicePartyAudienceViewController$onCreate$6.class, "1")) {
             return;
          }
       }
       h oh = obj.this$0.H.d().b();
       if (oh != null) {
          h oh1 = h.class;
          if (PatchProxy.isSupport(oh1)) {
             Object[] objArray1 = new Object[]{Long.valueOf(p0),Long.valueOf(p1),Long.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
             if (!PatchProxy.applyVoid(objArray1, oh, oh1, "27")) {
             }
          }else {
          }
       }
    label_01b0 :
       return;
    }
}
