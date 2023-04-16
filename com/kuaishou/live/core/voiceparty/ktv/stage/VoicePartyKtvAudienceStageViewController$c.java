package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$c;
import erd.r;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class VoicePartyKtvAudienceStageViewController$c implements r	// class@001539
{
    public static final VoicePartyKtvAudienceStageViewController$c b;

    static {
       VoicePartyKtvAudienceStageViewController$c.b = new VoicePartyKtvAudienceStageViewController$c();
    }
    public void VoicePartyKtvAudienceStageViewController$c(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyKtvAudienceStageViewController$c.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "time");
          b = (p0.longValue() - 1 > 0)? true: false;
       }
       return b;
    }
}
