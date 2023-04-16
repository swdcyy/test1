package com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import com.tencent.mm.opensdk.channel.a.a;

public abstract class BaseReq	// class@000e84
{
    public String openId;
    public String transaction;

    public void BaseReq(){
       super();
    }
    public abstract boolean checkArgs();
    public void fromBundle(Bundle p0){
       this.transaction = a.a(p0, "_wxapi_basereq_transaction");
       this.openId = a.a(p0, "_wxapi_basereq_openid");
    }
    public abstract int getType();
    public void toBundle(Bundle p0){
       p0.putInt("_wxapi_command_type", this.getType());
       p0.putString("_wxapi_basereq_transaction", this.transaction);
       p0.putString("_wxapi_basereq_openid", this.openId);
    }
}
