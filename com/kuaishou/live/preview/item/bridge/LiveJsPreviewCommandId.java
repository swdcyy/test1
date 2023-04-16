package com.kuaishou.live.preview.item.bridge.LiveJsPreviewCommandId;
import o63.k;
import java.lang.Enum;
import com.kuaishou.live.preview.item.bridge.LiveJsPreviewCommandId$1;
import o63.r;
import java.lang.String;
import msd.a;
import com.kuaishou.live.preview.item.bridge.LiveJsPreviewCommandId$2;
import com.kuaishou.live.preview.item.bridge.LiveJsPreviewCommandId$a;
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

public final class LiveJsPreviewCommandId extends Enum implements k	// class@000ddd
{
    public final String commandName;
    public final a commandProvider;
    public final String nameSpace;
    public final r supportedScene;
    public static final LiveJsPreviewCommandId[] $VALUES;
    public static final LiveJsPreviewCommandId$a Companion;
    public static final LiveJsPreviewCommandId GetLiveRoomInfo;
    public static final LiveJsPreviewCommandId LiveRouter;
    public static final Collection allCommandIds;
    public static final Map mapping;

    static {
       LiveJsPreviewCommandId[] liveJsPrevie = new LiveJsPreviewCommandId[]{v8,v2};
       r f = r.f;
       LiveJsPreviewCommandId.LiveRouter = v8;
       int i = 0;
       LiveJsPreviewCommandId liveJsPrevie2 = new LiveJsPreviewCommandId("GetLiveRoomInfo", 1, "getLiveRoomInfo", LiveJsPreviewCommandId$2.INSTANCE, f, "KwaiLive");
       LiveJsPreviewCommandId.GetLiveRoomInfo = v2;
       LiveJsPreviewCommandId.$VALUES = liveJsPrevie;
       LiveJsPreviewCommandId.Companion = new LiveJsPreviewCommandId$a(null);
       liveJsPrevie = LiveJsPreviewCommandId.values();
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(liveJsPrevie.length), 16));
       int len = liveJsPrevie.length;
       for (LiveJsPreviewCommandId liveJsPrevie1 = new LiveJsPreviewCommandId("LiveRouter", 0, "liveRouter", LiveJsPreviewCommandId$1.INSTANCE, f, "KwaiLive"); i < len; i = i + 1) {
          object oobject = liveJsPrevie[i];
          linkedHashMa.put(oobject.getCommandName(), oobject);
       }
       LiveJsPreviewCommandId.mapping = linkedHashMa;
       LiveJsPreviewCommandId.allCommandIds = linkedHashMa.values();
    }
    public void LiveJsPreviewCommandId(String p0,int p1,String p2,a p3,r p4,String p5){
       super(p0, p1);
       this.commandName = p2;
       this.commandProvider = p3;
       this.supportedScene = p4;
       this.nameSpace = p5;
    }
    public void LiveJsPreviewCommandId(String p0,int p1,String p2,a p3,r p4,String p5,int p6,u p7){
       if (p6 & 0x08) {
          p5 = "Kwai";
       }
       super(p0, p1, p2, p3, p4, p5);
       return;
    }
    public static final LiveJsPreviewCommandId fromName(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveJsPreviewCommandId$a obj = PatchProxy.applyOneRefs(p0, null, LiveJsPreviewCommandId.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = LiveJsPreviewCommandId.Companion;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, LiveJsPreviewCommandId$a.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          a.p(p0, "commandName");
          obj1 = LiveJsPreviewCommandId.mapping.get(p0);
       }
       return obj1;
    }
    public static final Collection getAllCommandIds(){
       return LiveJsPreviewCommandId.allCommandIds;
    }
    public static LiveJsPreviewCommandId valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveJsPreviewCommandId.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveJsPreviewCommandId.class, p0);
    }
    public static LiveJsPreviewCommandId[] values(){
       Object obj = PatchProxy.apply(null, null, LiveJsPreviewCommandId.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveJsPreviewCommandId.$VALUES.clone();
    }
    public String getCommandName(){
       return this.commandName;
    }
    public a getCommandProvider(){
       return this.commandProvider;
    }
    public String getNameSpace(){
       return this.nameSpace;
    }
    public r getSupportedScene(){
       return this.supportedScene;
    }
}
