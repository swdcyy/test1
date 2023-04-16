package com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$b;
import erd.g;
import retrofit2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$a;
import com.kuaishou.android.live.log.LiveLogTag;
import okhttp3.Request;
import okhttp3.HttpUrl;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveVoicePartyApi$LogRequestFailFactory$b implements g	// class@001500
{
    public final a b;

    public void LiveVoicePartyApi$LogRequestFailFactory$b(a p0){
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyApi$LogRequestFailFactory$b.class, "1")) {
          return;
       }
       if (LiveVoicePartyApi$LogRequestFailFactory.c.a()) {
          b.c0(LiveLogTag.LIVE_VOICE_PARTY, "REST request end   <<<", "urlPath", this.b.request().url().encodedPath());
       }
       return;
    }
}
