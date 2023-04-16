package com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public class WXChannelOpenLive$Resp extends BaseResp	// class@000eac
{
    public String extMsg;

    public void WXChannelOpenLive$Resp(){
       super();
    }
    public void WXChannelOpenLive$Resp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.extMsg = p0.getString("_wxapi_finder_extMsg");
    }
    public int getType(){
       return 35;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_finder_extMsg", this.extMsg);
    }
}
