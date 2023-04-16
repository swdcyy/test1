package com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public final class WXPreloadMiniProgram$Req extends BaseReq	// class@000ed0
{
    public String extData;
    public int miniprogramType;
    public String path;
    public String userName;

    public void WXPreloadMiniProgram$Req(){
       super();
       this.path = "";
       this.miniprogramType = 0;
       this.extData = "";
    }
    public boolean checkArgs(){
       String str;
       if (b.b(this.userName)) {
          str = "userName is null";
       }else {
          WXPreloadMiniProgram$Req tminiprogram = this.miniprogramType;
          if (tminiprogram < null || tminiprogram > 2) {
             str = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
          }else {
             return true;
          }
       }
       Log.e("MicroMsg.SDK.WXPreloadMiniProgram.Req", str);
       return false;
    }
    public int getType(){
       return 28;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_launch_wxminiprogram_username", this.userName);
       p0.putString("_launch_wxminiprogram_path", this.path);
       p0.putString("_launch_wxminiprogram_extData", this.extData);
       p0.putInt("_launch_wxminiprogram_type", this.miniprogramType);
    }
}
