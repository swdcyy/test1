package com.kuaishou.live.common.core.component.comments.fluency.LiveCommentBottomMessageType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveCommentBottomMessageType extends Enum	// class@001079
{
    public static final LiveCommentBottomMessageType[] $VALUES;
    public static final LiveCommentBottomMessageType FoldMessage;
    public static final LiveCommentBottomMessageType HighFluencyMessage;
    public static final LiveCommentBottomMessageType QuickMessage;

    static {
       LiveCommentBottomMessageType liveCommentB1;
       LiveCommentBottomMessageType[] liveCommentB = new LiveCommentBottomMessageType[]{liveCommentB1,liveCommentB1,liveCommentB1};
       liveCommentB1 = new LiveCommentBottomMessageType("FoldMessage", 0);
       LiveCommentBottomMessageType.FoldMessage = liveCommentB1;
       liveCommentB1 = new LiveCommentBottomMessageType("HighFluencyMessage", 1);
       LiveCommentBottomMessageType.HighFluencyMessage = liveCommentB1;
       liveCommentB1 = new LiveCommentBottomMessageType("QuickMessage", 2);
       LiveCommentBottomMessageType.QuickMessage = liveCommentB1;
       LiveCommentBottomMessageType.$VALUES = liveCommentB;
    }
    public void LiveCommentBottomMessageType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveCommentBottomMessageType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCommentBottomMessageType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCommentBottomMessageType.class, p0);
    }
    public static LiveCommentBottomMessageType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCommentBottomMessageType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCommentBottomMessageType.$VALUES.clone();
    }
}
