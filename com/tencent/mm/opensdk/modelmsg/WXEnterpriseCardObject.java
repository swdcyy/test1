package com.tencent.mm.opensdk.modelmsg.WXEnterpriseCardObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXEnterpriseCardObject implements WXMediaMessage$IMediaObject	// class@000ef4
{
    public String cardInfo;
    public int msgType;

    public void WXEnterpriseCardObject(){
       super();
    }
    public boolean checkArgs(){
       WXEnterpriseCardObject tcardInfo = this.cardInfo;
       if (tcardInfo != null && tcardInfo.length()) {
          return true;
       }
       Log.e("MicroMsg.SDK.WXEnterpriseCardObject", "checkArgs fail, cardInfo is invalid");
       return false;
    }
    public void serialize(Bundle p0){
       p0.putInt("_wxenterprisecard_msgtype", this.msgType);
       p0.putString("_wxenterprisecard_cardinfo", this.cardInfo);
    }
    public int type(){
       return 45;
    }
    public void unserialize(Bundle p0){
       this.msgType = p0.getInt("_wxenterprisecard_msgtype");
       this.cardInfo = p0.getString("_wxenterprisecard_cardinfo");
    }
}
