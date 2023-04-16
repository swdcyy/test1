package com.tencent.mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo;
import com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject$IWXStateJumpInfo;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXStateJumpChannelProfileInfo implements WXStateSceneDataObject$IWXStateJumpInfo	// class@000f01
{
    public String username;

    public void WXStateJumpChannelProfileInfo(){
       super();
    }
    public boolean checkArgs(){
       String str;
       WXStateJumpChannelProfileInfo tusername = this.username;
       if (tusername == null || tusername.length() <= 0) {
          str = "checkArgs fail, username is null";
       }else if((this.username).length() >= 1024){
          str = "checkArgs fail, username length exceed limit";
       }else {
          return true;
       }
       Log.e("MicroMsg.SDK.WXStateJumpUrlInfo", str);
       return false;
    }
    public void serialize(Bundle p0){
       p0.putString("wx_state_jump_channel_profile_username", this.username);
    }
    public int type(){
       return 3;
    }
    public void unserialize(Bundle p0){
       this.username = p0.getString("wx_state_jump_channel_profile_username", "");
    }
}
