package com.kuaishou.live.common.core.component.chat.widget.LiveChatCountdownDialog$DialogMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveChatCountdownDialog$DialogMode extends Enum	// class@001053
{
    public static final LiveChatCountdownDialog$DialogMode[] $VALUES;
    public static final LiveChatCountdownDialog$DialogMode ANCHOR;
    public static final LiveChatCountdownDialog$DialogMode AUDIENCE;

    static {
       LiveChatCountdownDialog$DialogMode uDialogMode = new LiveChatCountdownDialog$DialogMode("ANCHOR", 0);
       LiveChatCountdownDialog$DialogMode.ANCHOR = uDialogMode;
       LiveChatCountdownDialog$DialogMode uDialogMode1 = new LiveChatCountdownDialog$DialogMode("AUDIENCE", 1);
       LiveChatCountdownDialog$DialogMode.AUDIENCE = uDialogMode1;
       LiveChatCountdownDialog$DialogMode[] uDialogModeA = new LiveChatCountdownDialog$DialogMode[]{uDialogMode,uDialogMode1};
       LiveChatCountdownDialog$DialogMode.$VALUES = uDialogModeA;
    }
    public void LiveChatCountdownDialog$DialogMode(String p0,int p1){
       super(p0, p1);
    }
    public static LiveChatCountdownDialog$DialogMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveChatCountdownDialog$DialogMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveChatCountdownDialog$DialogMode.class, p0);
    }
    public static LiveChatCountdownDialog$DialogMode[] values(){
       Object obj = PatchProxy.apply(null, null, LiveChatCountdownDialog$DialogMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveChatCountdownDialog$DialogMode.$VALUES.clone();
    }
}
