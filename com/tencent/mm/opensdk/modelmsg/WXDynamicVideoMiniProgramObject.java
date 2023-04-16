package com.tencent.mm.opensdk.modelmsg.WXDynamicVideoMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXDynamicVideoMiniProgramObject extends WXMiniProgramObject	// class@000ef0
{
    public String appThumbUrl;
    public String videoSource;

    public void WXDynamicVideoMiniProgramObject(){
       super();
    }
    public boolean checkArgs(){
       String str;
       if (b.b(this.webpageUrl)) {
          str = "webPageUrl is null";
       }else if(b.b(this.userName)){
          str = "userName is null";
       }else {
          WXMiniProgramObject tminiprogram = this.miniprogramType;
          if (tminiprogram < null || tminiprogram > 2) {
             str = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
          }else {
             return true;
          }
       }
       Log.e("MicroMsg.SDK.WXDynamicVideoMiniProgramObject", str);
       return false;
    }
    public void serialize(Bundle p0){
       p0.putString("_wxminiprogram_webpageurl", this.webpageUrl);
       p0.putString("_wxminiprogram_username", this.userName);
       p0.putString("_wxminiprogram_path", this.path);
       p0.putString("_wxminiprogram_videoSource", this.videoSource);
       p0.putString("_wxminiprogram_appThumbUrl", this.appThumbUrl);
       p0.putBoolean("_wxminiprogram_withsharetiket", this.withShareTicket);
       p0.putInt("_wxminiprogram_type", this.miniprogramType);
       p0.putInt("_wxminiprogram_disableforward", this.disableforward);
    }
    public int type(){
       return 46;
    }
    public void unserialize(Bundle p0){
       this.webpageUrl = p0.getString("_wxminiprogram_webpageurl");
       this.userName = p0.getString("_wxminiprogram_username");
       this.path = p0.getString("_wxminiprogram_path");
       this.videoSource = p0.getString("_wxminiprogram_videoSource");
       this.appThumbUrl = p0.getString("_wxminiprogram_appThumbUrl");
       this.withShareTicket = p0.getBoolean("_wxminiprogram_withsharetiket");
       this.miniprogramType = p0.getInt("_wxminiprogram_type");
       this.disableforward = p0.getInt("_wxminiprogram_disableforward");
    }
}
