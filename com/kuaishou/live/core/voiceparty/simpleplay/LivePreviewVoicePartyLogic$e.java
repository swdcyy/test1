package com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$e;
import ee3.z;
import java.lang.Object;
import fe3.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;

public final class LivePreviewVoicePartyLogic$e implements z	// class@001906
{
    public static final LivePreviewVoicePartyLogic$e a;

    static {
       LivePreviewVoicePartyLogic$e.a = new LivePreviewVoicePartyLogic$e();
    }
    public void LivePreviewVoicePartyLogic$e(){
       super();
    }
    public final d a(){
       Object obj = PatchProxy.apply(null, this, LivePreviewVoicePartyLogic$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       String id = mE.getId();
       a.o(id, "QCurrentUser.ME.id");
       return new d(id);
    }
}
