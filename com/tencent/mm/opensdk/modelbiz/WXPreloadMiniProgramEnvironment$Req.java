package com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import android.os.Bundle;
import java.lang.String;

public final class WXPreloadMiniProgramEnvironment$Req extends BaseReq	// class@000ed3
{
    public String extData;

    public void WXPreloadMiniProgramEnvironment$Req(){
       this.extData = "";
    }
    public boolean checkArgs(){
       return true;
    }
    public int getType(){
       return 32;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_preload_wxminiprogram_environment_extData", this.extData);
    }
}
