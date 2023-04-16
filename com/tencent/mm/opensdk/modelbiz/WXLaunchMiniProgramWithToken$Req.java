package com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public final class WXLaunchMiniProgramWithToken$Req extends BaseReq	// class@000eba
{
    public String token;

    public void WXLaunchMiniProgramWithToken$Req(){
       super();
    }
    public boolean checkArgs(){
       if (!b.b(this.token)) {
          return true;
       }
       Log.e("MicroMsg.SDK.WXLaunchMiniProgramWithToken.Req", "token is null");
       return false;
    }
    public int getType(){
       return 29;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_launch_wxminiprogram_token", this.token);
    }
}
