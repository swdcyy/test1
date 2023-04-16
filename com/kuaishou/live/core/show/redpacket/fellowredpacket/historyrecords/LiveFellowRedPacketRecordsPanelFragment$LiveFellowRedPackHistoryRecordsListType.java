package com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType extends Enum	// class@000e87
{
    public static final LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType[] $VALUES;
    public static final LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType GRABBED;
    public static final LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType SENT;

    static {
       LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType liveFellowRe = new LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType("SENT", 0);
       LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType.SENT = liveFellowRe;
       LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType liveFellowRe1 = new LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType("GRABBED", 1);
       LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType.GRABBED = liveFellowRe1;
       LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType[] liveFellowRe2 = new LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType[]{liveFellowRe,liveFellowRe1};
       LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType.$VALUES = liveFellowRe2;
    }
    public void LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType.class, p0);
    }
    public static LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveFellowRedPacketRecordsPanelFragment$LiveFellowRedPackHistoryRecordsListType.$VALUES.clone();
    }
}
