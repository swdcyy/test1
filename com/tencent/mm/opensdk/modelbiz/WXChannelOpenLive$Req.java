package com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXChannelOpenLive$Req extends BaseReq	// class@000eab
{
    public String feedID;
    public String nonceID;

    public void WXChannelOpenLive$Req(){
       super();
    }
    public boolean checkArgs(){
       String str;
       if (b.b(this.feedID)) {
          str = "feedID is null";
       }else if(b.b(this.nonceID)){
          str = "nonceID is null";
       }else if((this.feedID).length() > 1024){
          str = "feedID.length too long!";
       }else if((this.nonceID).length() > 1024){
          str = "nonceID.length too long!";
       }else {
          return true;
       }
       Log.e("MicroMsg.SDK.WXChannelOpenLive.Req", str);
       return false;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.feedID = p0.getString("_wxapi_finder_feedID");
       this.nonceID = p0.getString("_wxapi_finder_nonceID");
    }
    public int getType(){
       return 35;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_finder_feedID", this.feedID);
       p0.putString("_wxapi_finder_nonceID", this.nonceID);
    }
}
