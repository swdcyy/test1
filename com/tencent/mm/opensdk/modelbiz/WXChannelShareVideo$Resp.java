package com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public class WXChannelShareVideo$Resp extends BaseResp	// class@000eb2
{
    public String extMsg;

    public void WXChannelShareVideo$Resp(){
       super();
    }
    public void WXChannelShareVideo$Resp(Bundle p0){
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
       return 33;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_finder_extMsg", this.extMsg);
    }
}
