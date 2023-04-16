package com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$c;
import erd.g;
import retrofit2.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import okhttp3.Request;
import okhttp3.HttpUrl;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.Integer;
import java.lang.StringBuilder;
import kotlin.text.StringsKt__IndentKt;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$a;
import xf6.l;
import java.util.Map;
import com.kuaishou.live.core.voiceparty.http.a;
import java.lang.Runnable;
import ekd.k1;

public final class LiveVoicePartyApi$LogRequestFailFactory$c implements g	// class@001501
{
    public final a b;

    public void LiveVoicePartyApi$LogRequestFailFactory$c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Map b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyApi$LogRequestFailFactory$c.class, "1")) {
       }else {
          a.p(p0, "throwable");
          String str = this.b.request().url().encodedPath();
          Integer integer = null;
          KwaiException kwaiExceptio = (!p0 instanceof KwaiException)? integer: p0;
          if (kwaiExceptio) {
             integer = Integer.valueOf(kwaiExceptio.mErrorCode);
          }
          p0 = StringsKt__IndentKt.p("\n          debug: ¡ƒÃÏ “«Î«Û ß∞‹ !!!\n          urlPath "+str+"\n          code=["+integer+"]\n          msg=["+p0.getMessage()+"]\n          ");
          b.j0(LiveLogTag.LIVE_VOICE_PARTY, p0);
          if (LiveVoicePartyApi$LogRequestFailFactory.c.a() && l.c("voicePartyErrorRequestToast", true)) {
             b = LiveVoicePartyApi$LogRequestFailFactory.b;
             a.m(b);
             Integer integer1 = b.get(str);
             if (integer1 != null && (integer1.intValue() != -1 && !a.g(integer1, integer))) {
                k1.o(new a(p0));
             }
          }
       }
    label_009b :
       return;
    }
}
