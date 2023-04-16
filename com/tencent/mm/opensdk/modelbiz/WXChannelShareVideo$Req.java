package com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo;
import android.os.Bundle;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.Exception;

public class WXChannelShareVideo$Req extends BaseReq	// class@000eb1
{
    public String extData;
    public IWXChannelJumpInfo jumpInfo;
    public String videoPath;

    public void WXChannelShareVideo$Req(){
       super();
    }
    public boolean checkArgs(){
       String str;
       if (b.b(this.videoPath)) {
          str = "videoPath is null";
       }else {
          WXChannelShareVideo$Req tjumpInfo = this.jumpInfo;
          if (tjumpInfo != null && !tjumpInfo.checkArgs()) {
             str = "checkArgs fail, jumpInfo is invalid";
          }else {
             return true;
          }
       }
       Log.e("MicroMsg.SDK.WXChannelShareVideo.Req", str);
       return false;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.videoPath = p0.getString("_wxapi_finder_share_video_path");
       this.extData = p0.getString("_wxapi_finder_share_video_extData");
       String str = p0.getString("_wxapi_channel_share_video_jump_info_identifier");
       if (str != null) {
          try{
             IWXChannelJumpInfo iWXChannelJu = Class.forName(str).newInstance();
             this.jumpInfo = iWXChannelJu;
             iWXChannelJu.unserialize(p0);
          }catch(java.lang.Exception e4){
             Log.e("MicroMsg.SDK.WXChannelShareVideo.Req", "get WXChannelJumpInfo from bundle failed: unknown ident "+str+", ex = "+e4.getMessage());
          }
       }
    }
    public int getType(){
       return 33;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_finder_share_video_path", this.videoPath);
       p0.putString("_wxapi_finder_share_video_extData", this.extData);
       WXChannelShareVideo$Req tjumpInfo = this.jumpInfo;
       if (tjumpInfo != null) {
          p0.putString("_wxapi_channel_share_video_jump_info_identifier", tjumpInfo.getClass().getName());
          this.jumpInfo.serialize(p0);
       }
       return;
    }
}
