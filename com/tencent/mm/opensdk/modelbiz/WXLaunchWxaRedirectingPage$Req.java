package com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import android.os.Bundle;

public final class WXLaunchWxaRedirectingPage$Req extends BaseReq	// class@000ebe
{
    public String callbackActivity;
    public String invokeTicket;

    public void WXLaunchWxaRedirectingPage$Req(){
       super();
    }
    public boolean checkArgs(){
       return (TextUtils.isEmpty(this.invokeTicket) ^ 0x01);
    }
    public void fromArray(String[] p0){
       this.invokeTicket = p0[0];
       this.callbackActivity = p0[1];
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.invokeTicket = p0.getString("_launch_wx_wxa_redirecting_page_invoke_ticket");
       this.callbackActivity = p0.getString("_launch_wx_wxa_redirecting_page_callback_activity");
    }
    public int getType(){
       return 30;
    }
    public String[] toArray(){
       String[] stringArray = new String[]{this.invokeTicket,this.callbackActivity};
       return stringArray;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_launch_wx_wxa_redirecting_page_invoke_ticket", this.invokeTicket);
       p0.putString("_launch_wx_wxa_redirecting_page_callback_activity", this.callbackActivity);
    }
}
