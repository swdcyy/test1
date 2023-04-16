package com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ClientProgressSync$AdjustAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClientProgressSync$AdjustAction extends Enum	// class@0019bd
{
    public static final ClientProgressSync$AdjustAction[] $VALUES;
    public static final ClientProgressSync$AdjustAction NONE;
    public static final ClientProgressSync$AdjustAction PAUSE;
    public static final ClientProgressSync$AdjustAction PLAY;
    public static final ClientProgressSync$AdjustAction SEEK;

    static {
       ClientProgressSync$AdjustAction uAdjustActio1;
       ClientProgressSync$AdjustAction[] uAdjustActio = new ClientProgressSync$AdjustAction[]{uAdjustActio1,uAdjustActio1,uAdjustActio1,uAdjustActio1};
       uAdjustActio1 = new ClientProgressSync$AdjustAction("NONE", 0);
       ClientProgressSync$AdjustAction.NONE = uAdjustActio1;
       uAdjustActio1 = new ClientProgressSync$AdjustAction("PAUSE", 1);
       ClientProgressSync$AdjustAction.PAUSE = uAdjustActio1;
       uAdjustActio1 = new ClientProgressSync$AdjustAction("SEEK", 2);
       ClientProgressSync$AdjustAction.SEEK = uAdjustActio1;
       uAdjustActio1 = new ClientProgressSync$AdjustAction("PLAY", 3);
       ClientProgressSync$AdjustAction.PLAY = uAdjustActio1;
       ClientProgressSync$AdjustAction.$VALUES = uAdjustActio;
    }
    public void ClientProgressSync$AdjustAction(String p0,int p1){
       super(p0, p1);
    }
    public static ClientProgressSync$AdjustAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClientProgressSync$AdjustAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClientProgressSync$AdjustAction.class, p0);
    }
    public static ClientProgressSync$AdjustAction[] values(){
       Object obj = PatchProxy.apply(null, null, ClientProgressSync$AdjustAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClientProgressSync$AdjustAction.$VALUES.clone();
    }
}
