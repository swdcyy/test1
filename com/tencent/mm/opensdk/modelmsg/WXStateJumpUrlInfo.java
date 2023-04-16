package com.tencent.mm.opensdk.modelmsg.WXStateJumpUrlInfo;
import com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject$IWXStateJumpInfo;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXStateJumpUrlInfo implements WXStateSceneDataObject$IWXStateJumpInfo	// class@000f03
{
    public String jumpUrl;

    public void WXStateJumpUrlInfo(){
       super();
    }
    public boolean checkArgs(){
       String str;
       WXStateJumpUrlInfo tjumpUrl = this.jumpUrl;
       if (tjumpUrl == null || tjumpUrl.length() <= 0) {
          str = "checkArgs fail, jumpUrl is null";
       }else if((this.jumpUrl).length() >= 0x2800){
          str = "checkArgs fail, jumpUrl is invalid";
       }else {
          return true;
       }
       Log.e("MicroMsg.SDK.WXStateJumpUrlInfo", str);
       return false;
    }
    public void serialize(Bundle p0){
       p0.putString("wx_state_jump_url", this.jumpUrl);
    }
    public int type(){
       return 1;
    }
    public void unserialize(Bundle p0){
       this.jumpUrl = p0.getString("wx_state_jump_url", "");
    }
}
