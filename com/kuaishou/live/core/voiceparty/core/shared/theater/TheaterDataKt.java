package com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDataKt;
import com.kuaishou.livestream.message.nano.TheaterEpisodeInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import op2.f;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$SeriesPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import d61.h0;
import op2.e;
import msd.l;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDataKt$toTheaterPackage$1;

public final class TheaterDataKt	// class@00145e
{

    public static final boolean a(TheaterEpisodeInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TheaterDataKt.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isLive");
       boolean b = (p0.type == 4 || p0.isSyntheticStream != null)? true: false;
       return b;
    }
    public static final ClientContentWrapper$SeriesPackage b(f p0){
       ClientContentWrapper$SeriesPackage obj = PatchProxy.applyOneRefs(p0, null, TheaterDataKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$toSeriesPackage");
       obj = new ClientContentWrapper$SeriesPackage();
       obj.sSeriesId = p0.e();
       obj.seriesName = p0.f();
       ClientContent$PhotoPackage[] photoPackage = new ClientContent$PhotoPackage[1];
       obj.photoPackage = photoPackage;
       ClientContent$PhotoPackage photoPackage1 = new ClientContent$PhotoPackage();
       photoPackage1.keyword = p0.d();
       TheaterEpisodeInfo photoId = p0.b.photoId;
       if (photoId == null) {
          photoId = "";
       }
       photoPackage1.identity = h0.a(photoId);
       photoId[0] = photoPackage1;
       return obj;
    }
    public static final ClientContent$LiveVoicePartyTheaterPackage c(e p0,l p1){
       ClientContent$LiveVoicePartyTheaterPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, TheaterDataKt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$toTheaterPackage");
       a.p(p1, "modifier");
       obj = new ClientContent$LiveVoicePartyTheaterPackage();
       obj.theaterId = p0.k0();
       f uof = p0.a();
       int i = (uof != null)? uof.g(): 0;
       obj.dramaType = i;
       p1.invoke(obj);
       return obj;
    }
    public static ClientContent$LiveVoicePartyTheaterPackage d(e p0,l p1,int p2,Object p3){
       TheaterDataKt$toTheaterPackage$1 iNSTANCE = (p2 & 0x01)? TheaterDataKt$toTheaterPackage$1.INSTANCE: null;
       return TheaterDataKt.c(p0, iNSTANCE);
    }
}
