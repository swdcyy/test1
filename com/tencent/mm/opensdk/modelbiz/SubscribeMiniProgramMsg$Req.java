package com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import android.os.Bundle;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;

public class SubscribeMiniProgramMsg$Req extends BaseReq	// class@000ea2
{
    public String miniProgramAppId;

    public void SubscribeMiniProgramMsg$Req(){
       super();
    }
    public void SubscribeMiniProgramMsg$Req(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       SubscribeMiniProgramMsg$Req tminiProgram = this.miniProgramAppId;
       if (tminiProgram != null && tminiProgram.length()) {
          return true;
       }
       Log.e("MicroMsg.SDK.SubscribeMessage.Req", "checkArgs fail, miniProgramAppId is null");
       return false;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.miniProgramAppId = p0.getString("_wxapi_subscribeminiprogram_req_miniprogramappid");
    }
    public int getType(){
       return 23;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_subscribeminiprogram_req_miniprogramappid", this.miniProgramAppId);
    }
}
