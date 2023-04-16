package com.tencent.mm.opensdk.modelbiz.WXQRCodePay$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.CharSequence;
import android.text.TextUtils;

public class WXQRCodePay$Req extends BaseReq	// class@000ed6
{
    public String codeContent;
    public String extraMsg;

    public void WXQRCodePay$Req(){
       super();
    }
    public boolean checkArgs(){
       return (TextUtils.isEmpty(this.codeContent) ^ 0x01);
    }
    public int getType(){
       return 38;
    }
}
