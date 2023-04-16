package com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public class SubscribeMiniProgramMsg$Resp extends BaseResp	// class@000ea3
{
    public String nickname;
    public String unionId;

    public void SubscribeMiniProgramMsg$Resp(){
       super();
    }
    public void SubscribeMiniProgramMsg$Resp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.unionId = p0.getString("_wxapi_subscribeminiprogram_resp_unionId");
       this.nickname = p0.getString("_wxapi_subscribeminiprogram_resp_nickname");
    }
    public int getType(){
       return 23;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_subscribeminiprogram_resp_unionId", this.unionId);
       p0.putString("_wxapi_subscribeminiprogram_resp_nickname", this.nickname);
    }
}
