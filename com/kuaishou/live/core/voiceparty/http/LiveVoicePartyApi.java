package com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$voicePartyApi$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$voicePartyKTVApi$2;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$voicePartyTheaterApi$2;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$voicePartyTeamPkApi$2;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$voicePartyMicSeatApi$2;
import java.lang.Object;
import bs2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bs2.b;
import bs2.d;
import bs2.e;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import retrofit2.q;
import com.yxcorp.retrofit.e;
import retrofit2.q$b;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory;
import java.util.List;

public final class LiveVoicePartyApi	// class@00150d
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final LiveVoicePartyApi f;

    static {
       LiveVoicePartyApi.f = new LiveVoicePartyApi();
       LiveVoicePartyApi.a = s.c(LiveVoicePartyApi$voicePartyApi$2.INSTANCE);
       LiveVoicePartyApi.b = s.c(LiveVoicePartyApi$voicePartyKTVApi$2.INSTANCE);
       LiveVoicePartyApi.c = s.c(LiveVoicePartyApi$voicePartyTheaterApi$2.INSTANCE);
       LiveVoicePartyApi.d = s.c(LiveVoicePartyApi$voicePartyTeamPkApi$2.INSTANCE);
       LiveVoicePartyApi.e = s.c(LiveVoicePartyApi$voicePartyMicSeatApi$2.INSTANCE);
    }
    public void LiveVoicePartyApi(){
       super();
    }
    public static final a b(){
       Object obj = PatchProxy.apply(null, null, LiveVoicePartyApi.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveVoicePartyApi.a.getValue();
    }
    public static final b c(){
       Object obj = PatchProxy.apply(null, null, LiveVoicePartyApi.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveVoicePartyApi.b.getValue();
    }
    public static final d d(){
       Object obj = PatchProxy.apply(null, null, LiveVoicePartyApi.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveVoicePartyApi.d.getValue();
    }
    public static final e e(){
       Object obj = PatchProxy.apply(null, null, LiveVoicePartyApi.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveVoicePartyApi.c.getValue();
    }
    public final Object a(Class p0){
       q$b obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyApi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.a(b.a(-1961311520).a(RouteType.LIVE, d.b)).c();
       obj.e.add(0, new LiveVoicePartyApi$LogRequestFailFactory());
       return obj.d().a(p0);
    }
}
