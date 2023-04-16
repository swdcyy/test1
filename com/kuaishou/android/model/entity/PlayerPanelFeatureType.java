package com.kuaishou.android.model.entity.PlayerPanelFeatureType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlayerPanelFeatureType extends Enum	// class@000ac8
{
    public final int mType;
    public static final PlayerPanelFeatureType[] $VALUES;
    public static final PlayerPanelFeatureType ASSIST;
    public static final PlayerPanelFeatureType DANMAKU;
    public static final PlayerPanelFeatureType DEFINITION;
    public static final PlayerPanelFeatureType MIRROR;
    public static final PlayerPanelFeatureType SOUND_EFFECT;
    public static final PlayerPanelFeatureType SPEED;
    public static final PlayerPanelFeatureType UNKNOWN;

    static {
       PlayerPanelFeatureType playerPanelF = new PlayerPanelFeatureType("UNKNOWN", 0, 0);
       PlayerPanelFeatureType.UNKNOWN = playerPanelF;
       PlayerPanelFeatureType playerPanelF1 = new PlayerPanelFeatureType("DANMAKU", 1, 1);
       PlayerPanelFeatureType.DANMAKU = playerPanelF1;
       PlayerPanelFeatureType playerPanelF2 = new PlayerPanelFeatureType("MIRROR", 2, 2);
       PlayerPanelFeatureType.MIRROR = playerPanelF2;
       PlayerPanelFeatureType playerPanelF3 = new PlayerPanelFeatureType("SPEED", 3, 3);
       PlayerPanelFeatureType.SPEED = playerPanelF3;
       PlayerPanelFeatureType playerPanelF4 = new PlayerPanelFeatureType("ASSIST", 4, 4);
       PlayerPanelFeatureType.ASSIST = playerPanelF4;
       PlayerPanelFeatureType playerPanelF5 = new PlayerPanelFeatureType("DEFINITION", 5, 5);
       PlayerPanelFeatureType.DEFINITION = playerPanelF5;
       PlayerPanelFeatureType playerPanelF6 = new PlayerPanelFeatureType("SOUND_EFFECT", 6, 7);
       PlayerPanelFeatureType.SOUND_EFFECT = playerPanelF6;
       PlayerPanelFeatureType[] playerPanelF7 = new PlayerPanelFeatureType[]{playerPanelF,playerPanelF1,playerPanelF2,playerPanelF3,playerPanelF4,playerPanelF5,playerPanelF6};
       PlayerPanelFeatureType.$VALUES = playerPanelF7;
    }
    public void PlayerPanelFeatureType(String p0,int p1,int p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static PlayerPanelFeatureType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlayerPanelFeatureType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PlayerPanelFeatureType.class, p0);
    }
    public static PlayerPanelFeatureType[] values(){
       Object obj = PatchProxy.apply(null, null, PlayerPanelFeatureType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlayerPanelFeatureType.$VALUES.clone();
    }
    public int getType(){
       return this.mType;
    }
}
