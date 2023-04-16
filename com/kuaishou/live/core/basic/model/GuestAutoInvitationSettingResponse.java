package com.kuaishou.live.core.basic.model.GuestAutoInvitationSettingResponse;
import java.io.Serializable;
import java.lang.Object;

public class GuestAutoInvitationSettingResponse implements Serializable	// class@000845
{
    public int autoInviteFriendsSign;
    public static final long serialVersionUID = 0x7a6b090f4e769d83;

    public void GuestAutoInvitationSettingResponse(){
       super();
    }
    public boolean isAutoInviteFriendsEnabled(){
       boolean b = true;
       if (this.autoInviteFriendsSign == b) {
       }else {
          b = false;
       }
       return b;
    }
}
