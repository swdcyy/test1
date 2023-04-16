package com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GameCenterDownloadParams$DownloadAction extends Enum	// class@001299
{
    public static final GameCenterDownloadParams$DownloadAction[] $VALUES;
    public static final GameCenterDownloadParams$DownloadAction INSTALL;
    public static final GameCenterDownloadParams$DownloadAction PAUSE;
    public static final GameCenterDownloadParams$DownloadAction REGISTER_LISTENER;
    public static final GameCenterDownloadParams$DownloadAction RESUME;
    public static final GameCenterDownloadParams$DownloadAction START;
    public static final GameCenterDownloadParams$DownloadAction STOP;
    public static final GameCenterDownloadParams$DownloadAction UPDATE;

    static {
       GameCenterDownloadParams$DownloadAction uDownloadAct = new GameCenterDownloadParams$DownloadAction("START", 0);
       GameCenterDownloadParams$DownloadAction.START = uDownloadAct;
       GameCenterDownloadParams$DownloadAction uDownloadAct1 = new GameCenterDownloadParams$DownloadAction("RESUME", 1);
       GameCenterDownloadParams$DownloadAction.RESUME = uDownloadAct1;
       GameCenterDownloadParams$DownloadAction uDownloadAct2 = new GameCenterDownloadParams$DownloadAction("PAUSE", 2);
       GameCenterDownloadParams$DownloadAction.PAUSE = uDownloadAct2;
       GameCenterDownloadParams$DownloadAction uDownloadAct3 = new GameCenterDownloadParams$DownloadAction("STOP", 3);
       GameCenterDownloadParams$DownloadAction.STOP = uDownloadAct3;
       GameCenterDownloadParams$DownloadAction uDownloadAct4 = new GameCenterDownloadParams$DownloadAction("UPDATE", 4);
       GameCenterDownloadParams$DownloadAction.UPDATE = uDownloadAct4;
       GameCenterDownloadParams$DownloadAction uDownloadAct5 = new GameCenterDownloadParams$DownloadAction("INSTALL", 5);
       GameCenterDownloadParams$DownloadAction.INSTALL = uDownloadAct5;
       GameCenterDownloadParams$DownloadAction uDownloadAct6 = new GameCenterDownloadParams$DownloadAction("REGISTER_LISTENER", 6);
       GameCenterDownloadParams$DownloadAction.REGISTER_LISTENER = uDownloadAct6;
       GameCenterDownloadParams$DownloadAction[] uDownloadAct7 = new GameCenterDownloadParams$DownloadAction[]{uDownloadAct,uDownloadAct1,uDownloadAct2,uDownloadAct3,uDownloadAct4,uDownloadAct5,uDownloadAct6};
       GameCenterDownloadParams$DownloadAction.$VALUES = uDownloadAct7;
    }
    public void GameCenterDownloadParams$DownloadAction(String p0,int p1){
       super(p0, p1);
    }
    public static GameCenterDownloadParams$DownloadAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GameCenterDownloadParams$DownloadAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GameCenterDownloadParams$DownloadAction.class, p0);
    }
    public static GameCenterDownloadParams$DownloadAction[] values(){
       Object obj = PatchProxy.apply(null, null, GameCenterDownloadParams$DownloadAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GameCenterDownloadParams$DownloadAction.$VALUES.clone();
    }
}
