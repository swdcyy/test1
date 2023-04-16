package com.yxcorp.gifshow.gamezone.model.GameZoneModels$SubscribeStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GameZoneModels$SubscribeStatus extends Enum	// class@0012c8
{
    public static final GameZoneModels$SubscribeStatus[] $VALUES;
    public static final GameZoneModels$SubscribeStatus subscribed;
    public static final GameZoneModels$SubscribeStatus unSubscribed;
    public static final GameZoneModels$SubscribeStatus unknown;

    static {
       GameZoneModels$SubscribeStatus subscribeSta = new GameZoneModels$SubscribeStatus("unknown", 0);
       GameZoneModels$SubscribeStatus.unknown = subscribeSta;
       GameZoneModels$SubscribeStatus subscribeSta1 = new GameZoneModels$SubscribeStatus("unSubscribed", 1);
       GameZoneModels$SubscribeStatus.unSubscribed = subscribeSta1;
       GameZoneModels$SubscribeStatus subscribeSta2 = new GameZoneModels$SubscribeStatus("subscribed", 2);
       GameZoneModels$SubscribeStatus.subscribed = subscribeSta2;
       GameZoneModels$SubscribeStatus[] subscribeSta3 = new GameZoneModels$SubscribeStatus[]{subscribeSta,subscribeSta1,subscribeSta2};
       GameZoneModels$SubscribeStatus.$VALUES = subscribeSta3;
    }
    public void GameZoneModels$SubscribeStatus(String p0,int p1){
       super(p0, p1);
    }
    public static GameZoneModels$SubscribeStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GameZoneModels$SubscribeStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GameZoneModels$SubscribeStatus.class, p0);
    }
    public static GameZoneModels$SubscribeStatus[] values(){
       Object obj = PatchProxy.apply(null, null, GameZoneModels$SubscribeStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GameZoneModels$SubscribeStatus.$VALUES.clone();
    }
}
