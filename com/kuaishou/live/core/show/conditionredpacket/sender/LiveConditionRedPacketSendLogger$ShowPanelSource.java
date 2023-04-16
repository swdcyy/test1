package com.kuaishou.live.core.show.conditionredpacket.sender.LiveConditionRedPacketSendLogger$ShowPanelSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveConditionRedPacketSendLogger$ShowPanelSource extends Enum	// class@000ac3
{
    public static final LiveConditionRedPacketSendLogger$ShowPanelSource[] $VALUES;
    public static final LiveConditionRedPacketSendLogger$ShowPanelSource APPEND_RED_PACKET;
    public static final LiveConditionRedPacketSendLogger$ShowPanelSource APPEND_RED_PACKET_FANS;
    public static final LiveConditionRedPacketSendLogger$ShowPanelSource APPEND_RED_PACKET_FOR_POP_VIEW;
    public static final LiveConditionRedPacketSendLogger$ShowPanelSource APPEND_RED_PACKET_PASSWORD;
    public static final LiveConditionRedPacketSendLogger$ShowPanelSource APPEND_RED_PACKET_SHARE;
    public static final LiveConditionRedPacketSendLogger$ShowPanelSource FANS_GROUP_PANEL;
    public static final LiveConditionRedPacketSendLogger$ShowPanelSource FANS_RED_PACKET_GUIDE_POPUP;
    public static final LiveConditionRedPacketSendLogger$ShowPanelSource LIVE_COMMON_NOTIFICATION;
    public static final LiveConditionRedPacketSendLogger$ShowPanelSource MORE_SEND_RED_PACKET_ICON;

    static {
       LiveConditionRedPacketSendLogger$ShowPanelSource showPanelSou = new LiveConditionRedPacketSendLogger$ShowPanelSource("MORE_SEND_RED_PACKET_ICON", 0);
       LiveConditionRedPacketSendLogger$ShowPanelSource.MORE_SEND_RED_PACKET_ICON = showPanelSou;
       LiveConditionRedPacketSendLogger$ShowPanelSource showPanelSou1 = new LiveConditionRedPacketSendLogger$ShowPanelSource("APPEND_RED_PACKET", 1);
       LiveConditionRedPacketSendLogger$ShowPanelSource.APPEND_RED_PACKET = showPanelSou1;
       LiveConditionRedPacketSendLogger$ShowPanelSource showPanelSou2 = new LiveConditionRedPacketSendLogger$ShowPanelSource("LIVE_COMMON_NOTIFICATION", 2);
       LiveConditionRedPacketSendLogger$ShowPanelSource.LIVE_COMMON_NOTIFICATION = showPanelSou2;
       LiveConditionRedPacketSendLogger$ShowPanelSource showPanelSou3 = new LiveConditionRedPacketSendLogger$ShowPanelSource("FANS_GROUP_PANEL", 3);
       LiveConditionRedPacketSendLogger$ShowPanelSource.FANS_GROUP_PANEL = showPanelSou3;
       LiveConditionRedPacketSendLogger$ShowPanelSource showPanelSou4 = new LiveConditionRedPacketSendLogger$ShowPanelSource("FANS_RED_PACKET_GUIDE_POPUP", 4);
       LiveConditionRedPacketSendLogger$ShowPanelSource.FANS_RED_PACKET_GUIDE_POPUP = showPanelSou4;
       LiveConditionRedPacketSendLogger$ShowPanelSource showPanelSou5 = new LiveConditionRedPacketSendLogger$ShowPanelSource("APPEND_RED_PACKET_FOR_POP_VIEW", 5);
       LiveConditionRedPacketSendLogger$ShowPanelSource.APPEND_RED_PACKET_FOR_POP_VIEW = showPanelSou5;
       LiveConditionRedPacketSendLogger$ShowPanelSource showPanelSou6 = new LiveConditionRedPacketSendLogger$ShowPanelSource("APPEND_RED_PACKET_PASSWORD", 6);
       LiveConditionRedPacketSendLogger$ShowPanelSource.APPEND_RED_PACKET_PASSWORD = showPanelSou6;
       LiveConditionRedPacketSendLogger$ShowPanelSource showPanelSou7 = new LiveConditionRedPacketSendLogger$ShowPanelSource("APPEND_RED_PACKET_SHARE", 7);
       LiveConditionRedPacketSendLogger$ShowPanelSource.APPEND_RED_PACKET_SHARE = showPanelSou7;
       LiveConditionRedPacketSendLogger$ShowPanelSource showPanelSou8 = new LiveConditionRedPacketSendLogger$ShowPanelSource("APPEND_RED_PACKET_FANS", 8);
       LiveConditionRedPacketSendLogger$ShowPanelSource.APPEND_RED_PACKET_FANS = showPanelSou8;
       LiveConditionRedPacketSendLogger$ShowPanelSource[] showPanelSou9 = new LiveConditionRedPacketSendLogger$ShowPanelSource[9];
       showPanelSou9[0] = showPanelSou;
       showPanelSou9[1] = showPanelSou1;
       showPanelSou9[2] = showPanelSou2;
       showPanelSou9[3] = showPanelSou3;
       showPanelSou9[4] = showPanelSou4;
       showPanelSou9[5] = showPanelSou5;
       showPanelSou9[6] = showPanelSou6;
       showPanelSou9[7] = showPanelSou7;
       showPanelSou9[8] = showPanelSou8;
       LiveConditionRedPacketSendLogger$ShowPanelSource.$VALUES = showPanelSou9;
    }
    public void LiveConditionRedPacketSendLogger$ShowPanelSource(String p0,int p1){
       super(p0, p1);
    }
    public static LiveConditionRedPacketSendLogger$ShowPanelSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveConditionRedPacketSendLogger$ShowPanelSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveConditionRedPacketSendLogger$ShowPanelSource.class, p0);
    }
    public static LiveConditionRedPacketSendLogger$ShowPanelSource[] values(){
       Object obj = PatchProxy.apply(null, null, LiveConditionRedPacketSendLogger$ShowPanelSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveConditionRedPacketSendLogger$ShowPanelSource.$VALUES.clone();
    }
}
