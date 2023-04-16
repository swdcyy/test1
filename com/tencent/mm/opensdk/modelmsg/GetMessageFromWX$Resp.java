package com.tencent.mm.opensdk.modelmsg.GetMessageFromWX$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$Builder;

public class GetMessageFromWX$Resp extends BaseResp	// class@000eda
{
    public WXMediaMessage message;

    public void GetMessageFromWX$Resp(){
       super();
    }
    public void GetMessageFromWX$Resp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       GetMessageFromWX$Resp tmessage = this.message;
       if (tmessage != null) {
          return tmessage.checkArgs();
       }
       Log.e("MicroMsg.SDK.GetMessageFromWX.Resp", "checkArgs fail, message is null");
       return false;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.message = WXMediaMessage$Builder.fromBundle(p0);
    }
    public int getType(){
       return 3;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putAll(WXMediaMessage$Builder.toBundle(this.message));
    }
}
