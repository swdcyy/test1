package com.kuaishou.live.basic.bridge.LiveJsChannels;
import o63.g;
import java.lang.Enum;
import com.kuaishou.live.basic.bridge.LiveJsChannels$1;
import java.lang.String;
import msd.a;
import com.kuaishou.live.basic.bridge.LiveJsChannels$2;
import com.kuaishou.live.basic.bridge.LiveJsChannels$a;
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

public final class LiveJsChannels extends Enum implements g	// class@000ca9
{
    public final String channelName;
    public final a channelProvider;
    public static final LiveJsChannels[] $VALUES;
    public static final LiveJsChannels$a Companion;
    public static final LiveJsChannels SocketMessage;
    public static final LiveJsChannels Tick;
    public static final Collection allChannelIds;
    public static final Map mapping;

    static {
       LiveJsChannels liveJsChanne1;
       LiveJsChannels[] liveJsChanne = new LiveJsChannels[]{liveJsChanne1,liveJsChanne1};
       int i = 0;
       liveJsChanne1 = new LiveJsChannels("Tick", i, "tick", LiveJsChannels$1.INSTANCE);
       LiveJsChannels.Tick = liveJsChanne1;
       int i1 = 1;
       liveJsChanne1 = new LiveJsChannels("SocketMessage", i1, "socketMessage", LiveJsChannels$2.INSTANCE);
       LiveJsChannels.SocketMessage = liveJsChanne1;
       LiveJsChannels.$VALUES = liveJsChanne;
       LiveJsChannels.Companion = new LiveJsChannels$a(null);
       liveJsChanne = LiveJsChannels.values();
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(liveJsChanne.length), 16));
       int len = liveJsChanne.length;
       for (; i < len; i = i + 1) {
          object oobject = liveJsChanne[i];
          linkedHashMa.put(oobject.getChannelName(), oobject);
       }
       LiveJsChannels.mapping = linkedHashMa;
       LiveJsChannels.allChannelIds = linkedHashMa.values();
    }
    public void LiveJsChannels(String p0,int p1,String p2,a p3){
       super(p0, p1);
       this.channelName = p2;
       this.channelProvider = p3;
    }
    public static final LiveJsChannels fromName(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveJsChannels$a obj = PatchProxy.applyOneRefs(p0, null, LiveJsChannels.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = LiveJsChannels.Companion;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, LiveJsChannels$a.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          a.p(p0, "channelName");
          obj1 = LiveJsChannels.mapping.get(p0);
       }
       return obj1;
    }
    public static final Collection getAllChannelIds(){
       return LiveJsChannels.allChannelIds;
    }
    public static LiveJsChannels valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveJsChannels.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveJsChannels.class, p0);
    }
    public static LiveJsChannels[] values(){
       Object obj = PatchProxy.apply(null, null, LiveJsChannels.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveJsChannels.$VALUES.clone();
    }
    public String getChannelName(){
       return this.channelName;
    }
    public a getChannelProvider(){
       return this.channelProvider;
    }
}
