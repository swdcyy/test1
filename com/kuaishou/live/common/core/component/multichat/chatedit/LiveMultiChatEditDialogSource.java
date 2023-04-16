package com.kuaishou.live.common.core.component.multichat.chatedit.LiveMultiChatEditDialogSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiChatEditDialogSource extends Enum	// class@0014c8
{
    public final int value;
    public static final LiveMultiChatEditDialogSource[] $VALUES;
    public static final LiveMultiChatEditDialogSource SETTING_PANEL;
    public static final LiveMultiChatEditDialogSource USER_TAG;

    static {
       LiveMultiChatEditDialogSource liveMultiCha1;
       LiveMultiChatEditDialogSource[] liveMultiCha = new LiveMultiChatEditDialogSource[]{liveMultiCha1,liveMultiCha1};
       liveMultiCha1 = new LiveMultiChatEditDialogSource("SETTING_PANEL", 0, 1);
       LiveMultiChatEditDialogSource.SETTING_PANEL = liveMultiCha1;
       liveMultiCha1 = new LiveMultiChatEditDialogSource("USER_TAG", 1, 2);
       LiveMultiChatEditDialogSource.USER_TAG = liveMultiCha1;
       LiveMultiChatEditDialogSource.$VALUES = liveMultiCha;
    }
    public void LiveMultiChatEditDialogSource(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LiveMultiChatEditDialogSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiChatEditDialogSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiChatEditDialogSource.class, p0);
    }
    public static LiveMultiChatEditDialogSource[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiChatEditDialogSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiChatEditDialogSource.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
