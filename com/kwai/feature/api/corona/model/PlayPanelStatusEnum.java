package com.kwai.feature.api.corona.model.PlayPanelStatusEnum;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlayPanelStatusEnum extends Enum	// class@000e16
{
    public static final PlayPanelStatusEnum[] $VALUES;
    public static final PlayPanelStatusEnum ERROR;
    public static final PlayPanelStatusEnum HIDE;
    public static final PlayPanelStatusEnum PLAY;

    static {
       PlayPanelStatusEnum playPanelSta1;
       PlayPanelStatusEnum[] playPanelSta = new PlayPanelStatusEnum[]{playPanelSta1,playPanelSta1,playPanelSta1};
       playPanelSta1 = new PlayPanelStatusEnum("PLAY", 0);
       PlayPanelStatusEnum.PLAY = playPanelSta1;
       playPanelSta1 = new PlayPanelStatusEnum("ERROR", 1);
       PlayPanelStatusEnum.ERROR = playPanelSta1;
       playPanelSta1 = new PlayPanelStatusEnum("HIDE", 2);
       PlayPanelStatusEnum.HIDE = playPanelSta1;
       PlayPanelStatusEnum.$VALUES = playPanelSta;
    }
    public void PlayPanelStatusEnum(String p0,int p1){
       super(p0, p1);
    }
    public static PlayPanelStatusEnum valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlayPanelStatusEnum.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PlayPanelStatusEnum.class, p0);
    }
    public static PlayPanelStatusEnum[] values(){
       Object obj = PatchProxy.apply(null, null, PlayPanelStatusEnum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlayPanelStatusEnum.$VALUES.clone();
    }
}
