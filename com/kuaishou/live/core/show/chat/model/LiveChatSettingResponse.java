package com.kuaishou.live.core.show.chat.model.LiveChatSettingResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveChatSettingResponse implements Serializable	// class@000a1c
{
    public LiveChatSettingResponse$SettingStatus mSettingsMap;
    public static final long serialVersionUID = 0x2b437e124748a758;

    public void LiveChatSettingResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveChatSettingResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveChatSettingResponse{mSettingsMap="+this.mSettingsMap+'}';
    }
}
