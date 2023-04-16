package com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXChannelOpenProfile$Req extends BaseReq	// class@000eae
{
    public String userName;

    public void WXChannelOpenProfile$Req(){
       super();
    }
    public boolean checkArgs(){
       String str;
       if (b.b(this.userName)) {
          str = "userName is null";
       }else if((this.userName).length() > 1024){
          str = "userName.length too long";
       }else {
          return true;
       }
       Log.e("MicroMsg.SDK.WXChannelOpenProfile.Req", str);
       return false;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.userName = p0.getString("_wxapi_finder_userName");
    }
    public int getType(){
       return 34;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_finder_userName", this.userName);
    }
}
