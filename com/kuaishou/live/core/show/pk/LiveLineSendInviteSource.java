package com.kuaishou.live.core.show.pk.LiveLineSendInviteSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class LiveLineSendInviteSource extends Enum	// class@000d72
{
    public final int mValue;
    public static final LiveLineSendInviteSource[] $VALUES;
    public static final LiveLineSendInviteSource COMMENT_NOTICE;
    public static final LiveLineSendInviteSource GUIDE_POPUP;
    public static final LiveLineSendInviteSource LINE_PANEL;
    public static final LiveLineSendInviteSource PK_SELLING_PANEL;
    public static final LiveLineSendInviteSource UN_KNOW;

    static {
       LiveLineSendInviteSource liveLineSend = new LiveLineSendInviteSource("UN_KNOW", 0, 0);
       LiveLineSendInviteSource.UN_KNOW = liveLineSend;
       LiveLineSendInviteSource liveLineSend1 = new LiveLineSendInviteSource("LINE_PANEL", 1, 1);
       LiveLineSendInviteSource.LINE_PANEL = liveLineSend1;
       LiveLineSendInviteSource liveLineSend2 = new LiveLineSendInviteSource("COMMENT_NOTICE", 2, 2);
       LiveLineSendInviteSource.COMMENT_NOTICE = liveLineSend2;
       LiveLineSendInviteSource liveLineSend3 = new LiveLineSendInviteSource("GUIDE_POPUP", 3, 3);
       LiveLineSendInviteSource.GUIDE_POPUP = liveLineSend3;
       LiveLineSendInviteSource liveLineSend4 = new LiveLineSendInviteSource("PK_SELLING_PANEL", 4, 4);
       LiveLineSendInviteSource.PK_SELLING_PANEL = liveLineSend4;
       LiveLineSendInviteSource[] liveLineSend5 = new LiveLineSendInviteSource[]{liveLineSend,liveLineSend1,liveLineSend2,liveLineSend3,liveLineSend4};
       LiveLineSendInviteSource.$VALUES = liveLineSend5;
    }
    public void LiveLineSendInviteSource(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LiveLineSendInviteSource parseFromInt(int p0){
       LiveLineSendInviteSource[] obj;
       object oobject;
       LiveLineSendInviteSource liveLineSend = LiveLineSendInviteSource.class;
       if (PatchProxy.isSupport(liveLineSend)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, liveLineSend, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = LiveLineSendInviteSource.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return LiveLineSendInviteSource.UN_KNOW;
          }
          oobject = obj[i];
          if (oobject.getValue() == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static LiveLineSendInviteSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLineSendInviteSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLineSendInviteSource.class, p0);
    }
    public static LiveLineSendInviteSource[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLineSendInviteSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLineSendInviteSource.$VALUES.clone();
    }
    public int getValue(){
       return this.mValue;
    }
}
