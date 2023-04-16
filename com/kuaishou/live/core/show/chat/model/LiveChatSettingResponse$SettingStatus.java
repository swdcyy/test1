package com.kuaishou.live.core.show.chat.model.LiveChatSettingResponse$SettingStatus;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveChatSettingResponse$SettingStatus implements Serializable	// class@000a1b
{
    public boolean mAllAudienceCanApply;
    public boolean mOnlyFansCanInvite;
    public boolean mOnlyFollowerCanInvite;
    public boolean mOnlyFriendCanApply;
    public static final long serialVersionUID = 0x17be3017e1983433;

    public void LiveChatSettingResponse$SettingStatus(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveChatSettingResponse$SettingStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SettingStatus{mOnlyFollowerCanInvite="+this.mOnlyFollowerCanInvite+", mOnlyFansCanInvite="+this.mOnlyFansCanInvite+", mOnlyFriendCanApply="+this.mOnlyFriendCanApply+", mAllAudienceCanApply="+this.mAllAudienceCanApply+'}';
    }
}
