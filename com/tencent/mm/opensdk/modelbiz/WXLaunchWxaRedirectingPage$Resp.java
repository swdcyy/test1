package com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public final class WXLaunchWxaRedirectingPage$Resp extends BaseResp	// class@000ebf
{
    public String callbackActivity;
    public String invokeTicket;

    public void WXLaunchWxaRedirectingPage$Resp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.invokeTicket = p0.getString("_launch_wx_wxa_redirecting_page_invoke_ticket");
       this.callbackActivity = p0.getString("_launch_wx_wxa_redirecting_page_callback_activity");
    }
    public int getType(){
       return 30;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_launch_wx_wxa_redirecting_page_invoke_ticket", this.invokeTicket);
       p0.putString("_launch_wx_wxa_redirecting_page_callback_activity", this.callbackActivity);
    }
}
