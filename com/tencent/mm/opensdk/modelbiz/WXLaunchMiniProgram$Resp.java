package com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public final class WXLaunchMiniProgram$Resp extends BaseResp	// class@000eb8
{
    public String extMsg;

    public void WXLaunchMiniProgram$Resp(){
       super();
    }
    public void WXLaunchMiniProgram$Resp(Bundle p0){
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
       return 19;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_launch_wxminiprogram_ext_msg", this.extMsg);
    }
}
