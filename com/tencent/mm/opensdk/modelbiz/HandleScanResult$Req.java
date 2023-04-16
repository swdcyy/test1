package com.tencent.mm.opensdk.modelbiz.HandleScanResult$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import android.os.Bundle;
import java.net.URLEncoder;

public class HandleScanResult$Req extends BaseReq	// class@000e91
{
    public String scanResult;

    public void HandleScanResult$Req(){
       super();
    }
    public boolean checkArgs(){
       HandleScanResult$Req tscanResult = this.scanResult;
       if (tscanResult == null || tscanResult.length() < 0) {
          return false;
       }
       if ((this.scanResult).length() > 0x2800) {
          return false;
       }
       return true;
    }
    public int getType(){
       return 17;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_scan_qrcode_result", URLEncoder.encode(this.scanResult));
    }
}
