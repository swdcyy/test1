package com.tencent.mm.opensdk.modelmsg.WXStateJumpMiniProgramInfo;
import com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject$IWXStateJumpInfo;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXStateJumpMiniProgramInfo implements WXStateSceneDataObject$IWXStateJumpInfo	// class@000f02
{
    public int miniProgramType;
    public String path;
    public String username;

    public void WXStateJumpMiniProgramInfo(){
       super();
    }
    public boolean checkArgs(){
       WXStateJumpMiniProgramInfo tusername = this.username;
       if (tusername != null && tusername.length() > 0) {
          return true;
       }
       Log.e("MicroMsg.SDK.WXStateJumpUrlInfo", "checkArgs fail, username is null");
       return false;
    }
    public void serialize(Bundle p0){
       p0.putString("wx_state_jump_mini_program_username", this.username);
       p0.putString("wx_state_jump_mini_program_path", this.path);
       p0.putInt("wx_state_jump_mini_program_type", this.miniProgramType);
    }
    public int type(){
       return 2;
    }
    public void unserialize(Bundle p0){
       this.username = p0.getString("wx_state_jump_mini_program_username", "");
       this.path = p0.getString("wx_state_jump_mini_program_path", "");
       this.miniProgramType = p0.getInt("wx_state_jump_mini_program_type", 0);
    }
}
