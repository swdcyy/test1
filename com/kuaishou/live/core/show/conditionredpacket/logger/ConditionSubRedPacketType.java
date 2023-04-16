package com.kuaishou.live.core.show.conditionredpacket.logger.ConditionSubRedPacketType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ConditionSubRedPacketType extends Enum	// class@000aa9
{
    public final int subRedPacketType;
    public static final ConditionSubRedPacketType[] $VALUES;
    public static final ConditionSubRedPacketType SUB_RED_PACKET_TYPE_CONDITION_ARROW;
    public static final ConditionSubRedPacketType SUB_RED_PACKET_TYPE_CONDITION_COMMON;
    public static final ConditionSubRedPacketType SUB_RED_PACKET_TYPE_CONDITION_FANS_GROUP;
    public static final ConditionSubRedPacketType SUB_RED_PACKET_TYPE_CONDITION_GIFT;
    public static final ConditionSubRedPacketType SUB_RED_PACKET_TYPE_CONDITION_PASSWORD;
    public static final ConditionSubRedPacketType SUB_RED_PACKET_TYPE_CONDITION_SHARE;

    static {
       ConditionSubRedPacketType uConditionSu1;
       ConditionSubRedPacketType[] uConditionSu = new ConditionSubRedPacketType[]{uConditionSu1,uConditionSu1,uConditionSu1,uConditionSu1,uConditionSu1,uConditionSu1};
       uConditionSu1 = new ConditionSubRedPacketType("SUB_RED_PACKET_TYPE_CONDITION_COMMON", 0, 1);
       ConditionSubRedPacketType.SUB_RED_PACKET_TYPE_CONDITION_COMMON = uConditionSu1;
       uConditionSu1 = new ConditionSubRedPacketType("SUB_RED_PACKET_TYPE_CONDITION_ARROW", 1, 2);
       ConditionSubRedPacketType.SUB_RED_PACKET_TYPE_CONDITION_ARROW = uConditionSu1;
       uConditionSu1 = new ConditionSubRedPacketType("SUB_RED_PACKET_TYPE_CONDITION_SHARE", 2, 3);
       ConditionSubRedPacketType.SUB_RED_PACKET_TYPE_CONDITION_SHARE = uConditionSu1;
       uConditionSu1 = new ConditionSubRedPacketType("SUB_RED_PACKET_TYPE_CONDITION_FANS_GROUP", 3, 4);
       ConditionSubRedPacketType.SUB_RED_PACKET_TYPE_CONDITION_FANS_GROUP = uConditionSu1;
       uConditionSu1 = new ConditionSubRedPacketType("SUB_RED_PACKET_TYPE_CONDITION_GIFT", 4, 5);
       ConditionSubRedPacketType.SUB_RED_PACKET_TYPE_CONDITION_GIFT = uConditionSu1;
       uConditionSu1 = new ConditionSubRedPacketType("SUB_RED_PACKET_TYPE_CONDITION_PASSWORD", 5, 6);
       ConditionSubRedPacketType.SUB_RED_PACKET_TYPE_CONDITION_PASSWORD = uConditionSu1;
       ConditionSubRedPacketType.$VALUES = uConditionSu;
    }
    public void ConditionSubRedPacketType(String p0,int p1,int p2){
       super(p0, p1);
       this.subRedPacketType = p2;
    }
    public static ConditionSubRedPacketType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ConditionSubRedPacketType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ConditionSubRedPacketType.class, p0);
    }
    public static ConditionSubRedPacketType[] values(){
       Object obj = PatchProxy.apply(null, null, ConditionSubRedPacketType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ConditionSubRedPacketType.$VALUES.clone();
    }
    public final int getSubRedPacketType(){
       return this.subRedPacketType;
    }
}
