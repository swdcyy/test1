package com.kwai.live.gzone.api.model.LiveGzonePendantUserStatusResponse;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.live.gzone.api.model.LiveGzonePendantUserStatusResponse$UserStatusData;

public class LiveGzonePendantUserStatusResponse implements Serializable	// class@000c5f
{
    public LiveGzonePendantUserStatusResponse$UserStatusData mStatusData;
    public static final long serialVersionUID = 0x6919c3b4fa705a50;

    public void LiveGzonePendantUserStatusResponse(){
       super();
    }
    public boolean isEnable(){
       LiveGzonePendantUserStatusResponse tmStatusData = this.mStatusData;
       if (tmStatusData != null && tmStatusData.mDisable != null) {
          return false;
       }
       return true;
    }
}
