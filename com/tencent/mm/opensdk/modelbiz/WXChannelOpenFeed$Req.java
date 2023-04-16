package com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXChannelOpenFeed$Req extends BaseReq	// class@000ea8
{
    public String feedID;
    public String nonceID;
    public boolean notGetReleatedList;

    public void WXChannelOpenFeed$Req(){
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
       Log.e("MicroMsg.SDK.WXChannelOpenFeed.Req", str);
       return false;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.feedID = p0.getString("_wxapi_finder_feedID");
       this.nonceID = p0.getString("_wxapi_finder_nonceID");
       this.notGetReleatedList = p0.getBoolean("_wxapi_finder_notGetReleatedList");
    }
    public int getType(){
       return 36;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_finder_feedID", this.feedID);
       p0.putString("_wxapi_finder_nonceID", this.nonceID);
       p0.putBoolean("_wxapi_finder_notGetReleatedList", this.notGetReleatedList);
    }
}
