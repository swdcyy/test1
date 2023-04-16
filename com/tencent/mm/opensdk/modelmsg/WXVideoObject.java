package com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXVideoObject implements WXMediaMessage$IMediaObject	// class@000f08
{
    public String videoLowBandUrl;
    public String videoUrl;

    public void WXVideoObject(){
       super();
    }
    public boolean checkArgs(){
       String str;
       WXVideoObject tvideoUrl = this.videoUrl;
       if (tvideoUrl == null || !tvideoUrl.length()) {
          tvideoUrl = this.videoLowBandUrl;
          if (tvideoUrl == null || !tvideoUrl.length()) {
             str = "both arguments are null";
          }else {
          label_0018 :
             tvideoUrl = this.videoUrl;
             if (tvideoUrl != null && tvideoUrl.length() > 0x2800) {
                str = "checkArgs fail, videoUrl is too long";
             }else {
                tvideoUrl = this.videoLowBandUrl;
                if (tvideoUrl != null && tvideoUrl.length() > 0x2800) {
                   str = "checkArgs fail, videoLowBandUrl is too long";
                }else {
                   return true;
                }
             }
          }
       }else {
          goto label_0018 ;
       }
       Log.e("MicroMsg.SDK.WXVideoObject", str);
       return false;
    }
    public void serialize(Bundle p0){
       p0.putString("_wxvideoobject_videoUrl", this.videoUrl);
       p0.putString("_wxvideoobject_videoLowBandUrl", this.videoLowBandUrl);
    }
    public int type(){
       return 4;
    }
    public void unserialize(Bundle p0){
       this.videoUrl = p0.getString("_wxvideoobject_videoUrl");
       this.videoLowBandUrl = p0.getString("_wxvideoobject_videoLowBandUrl");
    }
}
