package com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$magicEffectLoggerManager$2$a;
import dp1.b;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController$magicEffectLoggerManager$2;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController;
import qu2.a;
import k2b.e0;
import com.google.gson.JsonObject;
import dp1.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;

public final class VoicePartyAudienceVideoViewController$magicEffectLoggerManager$2$a implements b	// class@0018b4
{
    public final VoicePartyAudienceVideoViewController$magicEffectLoggerManager$2 a;

    public void VoicePartyAudienceVideoViewController$magicEffectLoggerManager$2$a(VoicePartyAudienceVideoViewController$magicEffectLoggerManager$2 p0){
       this.a = p0;
       super();
    }
    public ClientContent$LiveStreamPackage a(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceVideoViewController$magicEffectLoggerManager$2$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.this$0.r.a();
    }
    public e0 i(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceVideoViewController$magicEffectLoggerManager$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.this$0.r.c();
    }
    public JsonObject j(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceVideoViewController$magicEffectLoggerManager$2$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.this$0.r.q1();
    }
    public JsonObject k(){
       return a.a(this);
    }
    public ClientContent$LiveVoicePartyPackageV2 y(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceVideoViewController$magicEffectLoggerManager$2$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.this$0.r.y();
    }
}
