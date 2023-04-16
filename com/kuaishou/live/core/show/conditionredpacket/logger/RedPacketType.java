package com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RedPacketType extends Enum	// class@000ab0
{
    public final int redPacketType;
    public static final RedPacketType[] $VALUES;
    public static final RedPacketType RED_PACKET_TYPE_ACTIVITY;
    public static final RedPacketType RED_PACKET_TYPE_ARROW;
    public static final RedPacketType RED_PACKET_TYPE_AUDIENCE_GIFT;
    public static final RedPacketType RED_PACKET_TYPE_COMMON;
    public static final RedPacketType RED_PACKET_TYPE_CONDITION;
    public static final RedPacketType RED_PACKET_TYPE_UNKNOWN;

    static {
       RedPacketType redPacketTyp1;
       RedPacketType[] redPacketTyp = new RedPacketType[]{redPacketTyp1,redPacketTyp1,redPacketTyp1,redPacketTyp1,redPacketTyp1,redPacketTyp1};
       redPacketTyp1 = new RedPacketType("RED_PACKET_TYPE_UNKNOWN", 0, 0);
       RedPacketType.RED_PACKET_TYPE_UNKNOWN = redPacketTyp1;
       redPacketTyp1 = new RedPacketType("RED_PACKET_TYPE_COMMON", 1, 1);
       RedPacketType.RED_PACKET_TYPE_COMMON = redPacketTyp1;
       redPacketTyp1 = new RedPacketType("RED_PACKET_TYPE_ARROW", 2, 2);
       RedPacketType.RED_PACKET_TYPE_ARROW = redPacketTyp1;
       redPacketTyp1 = new RedPacketType("RED_PACKET_TYPE_AUDIENCE_GIFT", 3, 3);
       RedPacketType.RED_PACKET_TYPE_AUDIENCE_GIFT = redPacketTyp1;
       redPacketTyp1 = new RedPacketType("RED_PACKET_TYPE_CONDITION", 4, 4);
       RedPacketType.RED_PACKET_TYPE_CONDITION = redPacketTyp1;
       redPacketTyp1 = new RedPacketType("RED_PACKET_TYPE_ACTIVITY", 5, 5);
       RedPacketType.RED_PACKET_TYPE_ACTIVITY = redPacketTyp1;
       RedPacketType.$VALUES = redPacketTyp;
    }
    public void RedPacketType(String p0,int p1,int p2){
       super(p0, p1);
       this.redPacketType = p2;
    }
    public static RedPacketType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RedPacketType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RedPacketType.class, p0);
    }
    public static RedPacketType[] values(){
       Object obj = PatchProxy.apply(null, null, RedPacketType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RedPacketType.$VALUES.clone();
    }
    public final int getRedPacketType(){
       return this.redPacketType;
    }
}
