package com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer$AudienceStatus;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer$b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveBlessingBagContainer$AudienceStatus extends Enum implements LiveBlessingBagContainer$b	// class@000a01
{
    public final int mValue;
    public static final LiveBlessingBagContainer$AudienceStatus[] $VALUES;
    public static final LiveBlessingBagContainer$AudienceStatus COUNTDOWN;
    public static final LiveBlessingBagContainer$AudienceStatus FINISH;
    public static final LiveBlessingBagContainer$AudienceStatus UNKNOW;
    public static final LiveBlessingBagContainer$AudienceStatus WAITING_RECEIVE;
    public static final LiveBlessingBagContainer$AudienceStatus WAITING_SEND;

    static {
       LiveBlessingBagContainer$AudienceStatus uAudienceSta = new LiveBlessingBagContainer$AudienceStatus("UNKNOW", 0, 0);
       LiveBlessingBagContainer$AudienceStatus.UNKNOW = uAudienceSta;
       LiveBlessingBagContainer$AudienceStatus uAudienceSta1 = new LiveBlessingBagContainer$AudienceStatus("COUNTDOWN", 1, 1);
       LiveBlessingBagContainer$AudienceStatus.COUNTDOWN = uAudienceSta1;
       LiveBlessingBagContainer$AudienceStatus uAudienceSta2 = new LiveBlessingBagContainer$AudienceStatus("WAITING_RECEIVE", 2, 2);
       LiveBlessingBagContainer$AudienceStatus.WAITING_RECEIVE = uAudienceSta2;
       LiveBlessingBagContainer$AudienceStatus uAudienceSta3 = new LiveBlessingBagContainer$AudienceStatus("WAITING_SEND", 3, 3);
       LiveBlessingBagContainer$AudienceStatus.WAITING_SEND = uAudienceSta3;
       LiveBlessingBagContainer$AudienceStatus uAudienceSta4 = new LiveBlessingBagContainer$AudienceStatus("FINISH", 4, 4);
       LiveBlessingBagContainer$AudienceStatus.FINISH = uAudienceSta4;
       LiveBlessingBagContainer$AudienceStatus[] uAudienceSta5 = new LiveBlessingBagContainer$AudienceStatus[]{uAudienceSta,uAudienceSta1,uAudienceSta2,uAudienceSta3,uAudienceSta4};
       LiveBlessingBagContainer$AudienceStatus.$VALUES = uAudienceSta5;
    }
    public void LiveBlessingBagContainer$AudienceStatus(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LiveBlessingBagContainer$AudienceStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveBlessingBagContainer$AudienceStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveBlessingBagContainer$AudienceStatus.class, p0);
    }
    public static LiveBlessingBagContainer$AudienceStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveBlessingBagContainer$AudienceStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveBlessingBagContainer$AudienceStatus.$VALUES.clone();
    }
    public String value(){
       Object obj = PatchProxy.apply(null, this, LiveBlessingBagContainer$AudienceStatus.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mValue+"";
    }
}
