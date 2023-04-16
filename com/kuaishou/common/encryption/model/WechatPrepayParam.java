package com.kuaishou.common.encryption.model.WechatPrepayParam;
import com.kuaishou.common.encryption.model.GiftPrepayParam;
import com.kuaishou.common.encryption.model.WechatPrepayParam$a;
import java.lang.String;

public class WechatPrepayParam extends GiftPrepayParam	// class@0016c7
{
    public String openId;

    public void WechatPrepayParam(){
       super();
    }
    public static WechatPrepayParam$a newBuilder(){
       return new WechatPrepayParam$a();
    }
    public String getOpenId(){
       return this.openId;
    }
    public void setOpenId(String p0){
       this.openId = p0;
    }
}
