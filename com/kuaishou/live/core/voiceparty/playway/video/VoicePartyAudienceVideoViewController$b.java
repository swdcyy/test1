package com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$b;
import erd.o;
import java.lang.Object;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.QCurrentUser;

public final class VoicePartyAudienceVideoViewController$b implements o	// class@0018b1
{
    public static final VoicePartyAudienceVideoViewController$b b;

    static {
       VoicePartyAudienceVideoViewController$b.b = new VoicePartyAudienceVideoViewController$b();
    }
    public void VoicePartyAudienceVideoViewController$b(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, VoicePartyAudienceVideoViewController$b.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          uBoolean = Boolean.valueOf(p0.contains(qCurrentUser.getId()));
       }
       return uBoolean;
    }
}
