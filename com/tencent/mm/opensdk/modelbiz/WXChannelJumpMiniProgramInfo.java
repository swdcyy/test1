package com.tencent.mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo;
import com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXChannelJumpMiniProgramInfo extends WXChannelBaseJumpInfo	// class@000ea6
{
    public String path;
    public String username;

    public void WXChannelJumpMiniProgramInfo(){
       super();
    }
    public boolean checkArgs(){
       String str;
       WXChannelJumpMiniProgramInfo tusername = this.username;
       if (tusername == null || tusername.length() <= 0) {
          str = "checkArgs fail, username is null";
       }else {
          tusername = this.path;
          if (tusername != null && tusername.length() >= 0x2800) {
             str = "checkArgs fail, path is invalid";
          }else {
             return super.checkArgs();
          }
       }
       Log.e("MicroMsg.SDK.WXChannelJumpMiniProgramInfo", str);
       return false;
    }
    public void serialize(Bundle p0){
       super.serialize(p0);
       p0.putString("wx_channel_jump_mini_program_username", this.username);
       p0.putString("wx_channel_jump_mini_program_path", this.path);
    }
    public int type(){
       return 1;
    }
    public void unserialize(Bundle p0){
       super.unserialize(p0);
       this.username = p0.getString("wx_channel_jump_mini_program_username");
       this.path = p0.getString("wx_channel_jump_mini_program_path");
    }
}
