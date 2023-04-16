package com.kwai.feature.api.pendant.core.model.RedPacketStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RedPacketStatus extends Enum	// class@001035
{
    public final int value;
    public static final RedPacketStatus[] $VALUES;
    public static final RedPacketStatus DOUBLE;
    public static final RedPacketStatus EXTRA_TASK;
    public static final RedPacketStatus GENERAL;
    public static final RedPacketStatus LIMIT_DOUBLE;
    public static final RedPacketStatus PIGGY_BANK;
    public static final RedPacketStatus SHRINK;

    static {
       RedPacketStatus redPacketSta1;
       RedPacketStatus[] redPacketSta = new RedPacketStatus[]{redPacketSta1,redPacketSta1,redPacketSta1,redPacketSta1,redPacketSta1,redPacketSta1};
       redPacketSta1 = new RedPacketStatus("GENERAL", 0, 0);
       RedPacketStatus.GENERAL = redPacketSta1;
       redPacketSta1 = new RedPacketStatus("DOUBLE", 1, 1);
       RedPacketStatus.DOUBLE = redPacketSta1;
       redPacketSta1 = new RedPacketStatus("SHRINK", 2, 2);
       RedPacketStatus.SHRINK = redPacketSta1;
       redPacketSta1 = new RedPacketStatus("LIMIT_DOUBLE", 3, 3);
       RedPacketStatus.LIMIT_DOUBLE = redPacketSta1;
       redPacketSta1 = new RedPacketStatus("EXTRA_TASK", 4, 5);
       RedPacketStatus.EXTRA_TASK = redPacketSta1;
       redPacketSta1 = new RedPacketStatus("PIGGY_BANK", 5, 6);
       RedPacketStatus.PIGGY_BANK = redPacketSta1;
       RedPacketStatus.$VALUES = redPacketSta;
    }
    public void RedPacketStatus(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static RedPacketStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RedPacketStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RedPacketStatus.class, p0);
    }
    public static RedPacketStatus[] values(){
       Object obj = PatchProxy.apply(null, null, RedPacketStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RedPacketStatus.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
