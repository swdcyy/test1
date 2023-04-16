package com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public final class WXLaunchMiniProgramWithToken$Resp extends BaseResp	// class@000ebb
{
    public String extMsg;

    public void WXLaunchMiniProgramWithToken$Resp(){
       super();
    }
    public void WXLaunchMiniProgramWithToken$Resp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.extMsg = p0.getString("_launch_wxminiprogram_ext_msg");
    }
    public int getType(){
       return 29;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_launch_wxminiprogram_ext_msg", this.extMsg);
    }
}
