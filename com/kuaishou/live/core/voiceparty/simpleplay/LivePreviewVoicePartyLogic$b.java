package com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$b;
import qu2.a;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.basic.model.StreamType;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.framework.model.user.User;
import k2b.e0;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.model.Race;
import com.google.gson.JsonObject;
import co2.f2;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;

public final class LivePreviewVoicePartyLogic$b implements a	// class@001901
{
    public final LiveStreamFeedWrapper a;
    public final LivePreviewVoicePartyLogic b;

    public void LivePreviewVoicePartyLogic$b(LivePreviewVoicePartyLogic p0){
       this.b = p0;
       super();
       this.a = new LiveStreamFeedWrapper(p0.l.a());
    }
    public int B0(){
       int i;
       QLivePlayConfig obj = PatchProxy.apply(null, this, LivePreviewVoicePartyLogic$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.getLivePlayConfig();
       obj = (obj != null)? obj.mStreamType: StreamType.VIDEO.toInt();
       return obj;
    }
    public boolean U(){
       Object obj = PatchProxy.apply(null, this, LivePreviewVoicePartyLogic$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.l.b;
    }
    public ClientContent$LiveStreamPackage a(){
       Object obj = PatchProxy.apply(null, this, LivePreviewVoicePartyLogic$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.f();
    }
    public String b(){
       Object[] objArray = null;
       User obj = PatchProxy.apply(objArray, this, LivePreviewVoicePartyLogic$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getUser();
       if (obj != null) {
          objArray = obj.getSex();
       }
       return objArray;
    }
    public e0 c(){
       return this.b.m;
    }
    public String d(){
       String obj = PatchProxy.apply(null, this, LivePreviewVoicePartyLogic$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getUserId();
       a.o(obj, "photo.userId");
       return obj;
    }
    public boolean e(){
       return false;
    }
    public Race f(){
       Object[] objArray = null;
       QLivePlayConfig obj = PatchProxy.apply(objArray, this, LivePreviewVoicePartyLogic$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getLivePlayConfig();
       if (obj != null) {
          objArray = obj.getHorseRace();
       }
       return objArray;
    }
    public String getLiveStreamId(){
       String obj = PatchProxy.apply(null, this, LivePreviewVoicePartyLogic$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getLiveStreamId();
       a.o(obj, "photo.liveStreamId");
       return obj;
    }
    public LiveStreamFeed j0(){
       return this.a.mEntity;
    }
    public JsonObject q1(){
       JsonObject obj = PatchProxy.apply(null, this, LivePreviewVoicePartyLogic$b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = n.l(this.b.j());
       a.o(obj, "VoicePartyLoggers.getCom¡­Params\(voicePartyContext\)");
       return obj;
    }
    public String q5(){
       return "";
    }
    public ClientContent$LiveVoicePartyPackageV2 y(){
       Object obj = PatchProxy.apply(null, this, LivePreviewVoicePartyLogic$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return n.h(this.b.j());
    }
}
