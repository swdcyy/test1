package com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo;
import com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public abstract class WXChannelBaseJumpInfo implements IWXChannelJumpInfo	// class@000ea5
{
    public String extra;
    public String wording;

    public void WXChannelBaseJumpInfo(){
       super();
    }
    public boolean checkArgs(){
       WXChannelBaseJumpInfo twording = this.wording;
       if (twording == null || twording.length() < 1024) {
          return true;
       }
       Log.e("MicroMsg.SDK.WXChannelBaseJumpInfo", "checkArgs fail, wording is invalid");
       return false;
    }
    public void serialize(Bundle p0){
       p0.putString("wx_channel_jump_base_wording", this.wording);
       p0.putString("wx_channel_jump_base_extra", this.extra);
    }
    public void unserialize(Bundle p0){
       this.wording = p0.getString("wx_channel_jump_base_wording");
       this.extra = p0.getString("wx_channel_jump_base_extra");
    }
}
