package com.kuaishou.live.common.core.component.chat.apply.LiveChatModeChoiceDialogHelper$ChatMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class LiveChatModeChoiceDialogHelper$ChatMode extends Enum	// class@001030
{
    public String[] mPermissions;
    public int mShowTextId;
    public static final LiveChatModeChoiceDialogHelper$ChatMode[] $VALUES;
    public static final LiveChatModeChoiceDialogHelper$ChatMode AUDIO;
    public static final LiveChatModeChoiceDialogHelper$ChatMode VIDEO;

    static {
       String[] stringArray = new String[]{"android.permission.CAMERA","android.permission.RECORD_AUDIO"};
       LiveChatModeChoiceDialogHelper$ChatMode uChatMode = new LiveChatModeChoiceDialogHelper$ChatMode("VIDEO", 0, 0x7f101f2c, stringArray);
       LiveChatModeChoiceDialogHelper$ChatMode.VIDEO = uChatMode;
       String[] stringArray1 = new String[]{"android.permission.RECORD_AUDIO"};
       LiveChatModeChoiceDialogHelper$ChatMode uChatMode1 = new LiveChatModeChoiceDialogHelper$ChatMode("AUDIO", 1, 0x7f101f2d, stringArray1);
       LiveChatModeChoiceDialogHelper$ChatMode.AUDIO = uChatMode1;
       LiveChatModeChoiceDialogHelper$ChatMode[] uChatModeArr = new LiveChatModeChoiceDialogHelper$ChatMode[]{uChatMode,uChatMode1};
       LiveChatModeChoiceDialogHelper$ChatMode.$VALUES = uChatModeArr;
    }
    public void LiveChatModeChoiceDialogHelper$ChatMode(String p0,int p1,int p2,String[] p3){
       super(p0, p1);
       this.mShowTextId = p2;
       this.mPermissions = p3;
    }
    public static LiveChatModeChoiceDialogHelper$ChatMode get(int p0){
       LiveChatModeChoiceDialogHelper$ChatMode[] obj;
       object oobject;
       LiveChatModeChoiceDialogHelper$ChatMode uChatMode = LiveChatModeChoiceDialogHelper$ChatMode.class;
       if (PatchProxy.isSupport(uChatMode)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uChatMode, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = LiveChatModeChoiceDialogHelper$ChatMode.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = obj[i];
          if (oobject.mShowTextId == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static LiveChatModeChoiceDialogHelper$ChatMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveChatModeChoiceDialogHelper$ChatMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveChatModeChoiceDialogHelper$ChatMode.class, p0);
    }
    public static LiveChatModeChoiceDialogHelper$ChatMode[] values(){
       Object obj = PatchProxy.apply(null, null, LiveChatModeChoiceDialogHelper$ChatMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveChatModeChoiceDialogHelper$ChatMode.$VALUES.clone();
    }
}
