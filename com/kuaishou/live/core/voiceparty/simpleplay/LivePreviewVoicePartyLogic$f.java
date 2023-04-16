package com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$f;
import erd.o;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zo2.m0;
import kotlin.jvm.internal.a;

public final class LivePreviewVoicePartyLogic$f implements o	// class@001907
{
    public static final LivePreviewVoicePartyLogic$f b;

    static {
       LivePreviewVoicePartyLogic$f.b = new LivePreviewVoicePartyLogic$f();
    }
    public void LivePreviewVoicePartyLogic$f(){
       super();
    }
    public Object apply(Object p0){
       m0 om0 = PatchProxy.applyOneRefs(p0, this, LivePreviewVoicePartyLogic$f.class, "1");
       if (om0 != PatchProxyResult.class) {
       }else {
          a.p(p0, "_offline");
          om0 = new m0(p0.booleanValue(), false);
       }
       return om0;
    }
}
