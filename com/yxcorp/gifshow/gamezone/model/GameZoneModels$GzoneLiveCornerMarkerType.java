package com.yxcorp.gifshow.gamezone.model.GameZoneModels$GzoneLiveCornerMarkerType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GameZoneModels$GzoneLiveCornerMarkerType extends Enum	// class@0012c7
{
    public String mType;
    public static final GameZoneModels$GzoneLiveCornerMarkerType[] $VALUES;
    public static final GameZoneModels$GzoneLiveCornerMarkerType KshellGiftReco;

    static {
       GameZoneModels$GzoneLiveCornerMarkerType gzoneLiveCor = new GameZoneModels$GzoneLiveCornerMarkerType("KshellGiftReco", 0, "1");
       GameZoneModels$GzoneLiveCornerMarkerType.KshellGiftReco = gzoneLiveCor;
       GameZoneModels$GzoneLiveCornerMarkerType[] gzoneLiveCor1 = new GameZoneModels$GzoneLiveCornerMarkerType[]{gzoneLiveCor};
       GameZoneModels$GzoneLiveCornerMarkerType.$VALUES = gzoneLiveCor1;
    }
    public void GameZoneModels$GzoneLiveCornerMarkerType(String p0,int p1,String p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static GameZoneModels$GzoneLiveCornerMarkerType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GameZoneModels$GzoneLiveCornerMarkerType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GameZoneModels$GzoneLiveCornerMarkerType.class, p0);
    }
    public static GameZoneModels$GzoneLiveCornerMarkerType[] values(){
       Object obj = PatchProxy.apply(null, null, GameZoneModels$GzoneLiveCornerMarkerType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GameZoneModels$GzoneLiveCornerMarkerType.$VALUES.clone();
    }
}
