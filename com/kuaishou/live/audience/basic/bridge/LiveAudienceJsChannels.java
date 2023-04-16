package com.kuaishou.live.audience.basic.bridge.LiveAudienceJsChannels;
import o63.g;
import java.lang.Enum;
import com.kuaishou.live.audience.basic.bridge.LiveAudienceJsChannels$1;
import java.lang.String;
import msd.a;
import com.kuaishou.live.audience.basic.bridge.LiveAudienceJsChannels$2;
import com.kuaishou.live.audience.basic.bridge.LiveAudienceJsChannels$a;
import nsd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.Map;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;

public final class LiveAudienceJsChannels extends Enum implements g	// class@000a37
{
    public final String channelName;
    public final a channelProvider;
    public static final LiveAudienceJsChannels[] $VALUES;
    public static final LiveAudienceJsChannels ChatApplyState;
    public static final LiveAudienceJsChannels$a Companion;
    public static final LiveAudienceJsChannels GiftSendSuccess;
    public static final Collection allChannelIds;
    public static final Map mapping;

    static {
       LiveAudienceJsChannels liveAudience1;
       LiveAudienceJsChannels[] liveAudience = new LiveAudienceJsChannels[]{liveAudience1,liveAudience1};
       int i = 0;
       liveAudience1 = new LiveAudienceJsChannels("ChatApplyState", i, "chatApplyState", LiveAudienceJsChannels$1.INSTANCE);
       LiveAudienceJsChannels.ChatApplyState = liveAudience1;
       int i1 = 1;
       liveAudience1 = new LiveAudienceJsChannels("GiftSendSuccess", i1, "onGiftSendToAnchorSuccess", LiveAudienceJsChannels$2.INSTANCE);
       LiveAudienceJsChannels.GiftSendSuccess = liveAudience1;
       LiveAudienceJsChannels.$VALUES = liveAudience;
       LiveAudienceJsChannels.Companion = new LiveAudienceJsChannels$a(null);
       liveAudience = LiveAudienceJsChannels.values();
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(liveAudience.length), 16));
       int len = liveAudience.length;
       for (; i < len; i = i + 1) {
          object oobject = liveAudience[i];
          linkedHashMa.put(oobject.getChannelName(), oobject);
       }
       LiveAudienceJsChannels.mapping = linkedHashMa;
       LiveAudienceJsChannels.allChannelIds = linkedHashMa.values();
    }
    public void LiveAudienceJsChannels(String p0,int p1,String p2,a p3){
       super(p0, p1);
       this.channelName = p2;
       this.channelProvider = p3;
    }
    public static final LiveAudienceJsChannels fromName(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAudienceJsChannels$a obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceJsChannels.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = LiveAudienceJsChannels.Companion;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, LiveAudienceJsChannels$a.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          a.p(p0, "channelName");
          obj1 = LiveAudienceJsChannels.mapping.get(p0);
       }
       return obj1;
    }
    public static final Collection getAllChannelIds(){
       return LiveAudienceJsChannels.allChannelIds;
    }
    public static LiveAudienceJsChannels valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceJsChannels.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceJsChannels.class, p0);
    }
    public static LiveAudienceJsChannels[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceJsChannels.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceJsChannels.$VALUES.clone();
    }
    public String getChannelName(){
       return this.channelName;
    }
    public a getChannelProvider(){
       return this.channelProvider;
    }
}
