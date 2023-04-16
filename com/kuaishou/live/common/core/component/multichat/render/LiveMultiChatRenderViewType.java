package com.kuaishou.live.common.core.component.multichat.render.LiveMultiChatRenderViewType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiChatRenderViewType extends Enum	// class@0014d5
{
    public final String type;
    public static final LiveMultiChatRenderViewType[] $VALUES;
    public static final LiveMultiChatRenderViewType CELL;

    static {
       LiveMultiChatRenderViewType liveMultiCha1;
       LiveMultiChatRenderViewType[] liveMultiCha = new LiveMultiChatRenderViewType[]{liveMultiCha1};
       liveMultiCha1 = new LiveMultiChatRenderViewType("CELL", 0, "CELL");
       LiveMultiChatRenderViewType.CELL = liveMultiCha1;
       LiveMultiChatRenderViewType.$VALUES = liveMultiCha;
    }
    public void LiveMultiChatRenderViewType(String p0,int p1,String p2){
       super(p0, p1);
       this.type = p2;
    }
    public static LiveMultiChatRenderViewType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiChatRenderViewType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiChatRenderViewType.class, p0);
    }
    public static LiveMultiChatRenderViewType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiChatRenderViewType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiChatRenderViewType.$VALUES.clone();
    }
    public final String getType(){
       return this.type;
    }
}
