package com.tencent.mm.opensdk.modelbiz.WXChannelJumpUrlInfo;
import com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXChannelJumpUrlInfo extends WXChannelBaseJumpInfo	// class@000ea7
{
    public String url;

    public void WXChannelJumpUrlInfo(){
       super();
    }
    public boolean checkArgs(){
       String str;
       WXChannelJumpUrlInfo turl = this.url;
       if (turl == null || turl.length() <= 0) {
          str = "checkArgs fail, url is null";
       }else if((this.url).length() >= 0x2800){
          str = "checkArgs fail, url is invalid";
       }else {
          return true;
       }
       Log.e("MicroMsg.SDK.WXChannelJumpUrlInfo", str);
       return false;
    }
    public void serialize(Bundle p0){
       super.serialize(p0);
       p0.putString("wx_channel_jump_url", this.url);
    }
    public int type(){
       return 2;
    }
    public void unserialize(Bundle p0){
       super.unserialize(p0);
       this.url = p0.getString("wx_channel_jump_url");
    }
}
