package com.kuaishou.live.bridge.LiveCommonJsChannels;
import o63.g;
import java.lang.Enum;
import com.kuaishou.live.bridge.LiveCommonJsChannels$1;
import java.lang.String;
import msd.a;
import com.kuaishou.live.bridge.LiveCommonJsChannels$2;
import com.kuaishou.live.bridge.LiveCommonJsChannels$3;
import com.kuaishou.live.bridge.LiveCommonJsChannels$4;
import com.kuaishou.live.bridge.LiveCommonJsChannels$5;
import com.kuaishou.live.bridge.LiveCommonJsChannels$a;
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

public final class LiveCommonJsChannels extends Enum implements g	// class@000d6e
{
    public final String channelName;
    public final a channelProvider;
    public static final LiveCommonJsChannels[] $VALUES;
    public static final LiveCommonJsChannels$a Companion;
    public static final LiveCommonJsChannels InteractBizChange;
    public static final LiveCommonJsChannels InteractChatMediaInfoUpdate;
    public static final LiveCommonJsChannels InteractRoomInfoUpdate;
    public static final LiveCommonJsChannels LiveJsMultiLineChatModeUpdate;
    public static final LiveCommonJsChannels MultiOnlineChatUsers;
    public static final Collection allChannelIds;
    public static final Map mapping;

    static {
       LiveCommonJsChannels liveCommonJs1;
       LiveCommonJsChannels[] liveCommonJs = new LiveCommonJsChannels[]{liveCommonJs1,liveCommonJs1,liveCommonJs1,liveCommonJs1,liveCommonJs1};
       int i = 0;
       liveCommonJs1 = new LiveCommonJsChannels("MultiOnlineChatUsers", i, "onlineInteractiveUsers", LiveCommonJsChannels$1.INSTANCE);
       LiveCommonJsChannels.MultiOnlineChatUsers = liveCommonJs1;
       liveCommonJs1 = new LiveCommonJsChannels("InteractChatMediaInfoUpdate", 1, "interactChatMediaInfoUpdate", LiveCommonJsChannels$2.INSTANCE);
       LiveCommonJsChannels.InteractChatMediaInfoUpdate = liveCommonJs1;
       liveCommonJs1 = new LiveCommonJsChannels("InteractBizChange", 2, "interactBizChange", LiveCommonJsChannels$3.INSTANCE);
       LiveCommonJsChannels.InteractBizChange = liveCommonJs1;
       liveCommonJs1 = new LiveCommonJsChannels("InteractRoomInfoUpdate", 3, "interactRoomInfoUpdate", LiveCommonJsChannels$4.INSTANCE);
       LiveCommonJsChannels.InteractRoomInfoUpdate = liveCommonJs1;
       int i1 = 4;
       liveCommonJs1 = new LiveCommonJsChannels("LiveJsMultiLineChatModeUpdate", i1, "multiLineChatModeUpdate", LiveCommonJsChannels$5.INSTANCE);
       LiveCommonJsChannels.LiveJsMultiLineChatModeUpdate = liveCommonJs1;
       LiveCommonJsChannels.$VALUES = liveCommonJs;
       LiveCommonJsChannels.Companion = new LiveCommonJsChannels$a(null);
       liveCommonJs = LiveCommonJsChannels.values();
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(liveCommonJs.length), 16));
       int len = liveCommonJs.length;
       for (; i < len; i = i + 1) {
          object oobject = liveCommonJs[i];
          linkedHashMa.put(oobject.getChannelName(), oobject);
       }
       LiveCommonJsChannels.mapping = linkedHashMa;
       LiveCommonJsChannels.allChannelIds = linkedHashMa.values();
    }
    public void LiveCommonJsChannels(String p0,int p1,String p2,a p3){
       super(p0, p1);
       this.channelName = p2;
       this.channelProvider = p3;
    }
    public static final LiveCommonJsChannels fromName(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveCommonJsChannels$a obj = PatchProxy.applyOneRefs(p0, null, LiveCommonJsChannels.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = LiveCommonJsChannels.Companion;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, LiveCommonJsChannels$a.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          a.p(p0, "channelName");
          obj1 = LiveCommonJsChannels.mapping.get(p0);
       }
       return obj1;
    }
    public static final Collection getAllChannelIds(){
       return LiveCommonJsChannels.allChannelIds;
    }
    public static LiveCommonJsChannels valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCommonJsChannels.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCommonJsChannels.class, p0);
    }
    public static LiveCommonJsChannels[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCommonJsChannels.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCommonJsChannels.$VALUES.clone();
    }
    public String getChannelName(){
       return this.channelName;
    }
    public a getChannelProvider(){
       return this.channelProvider;
    }
}
