package com.tencent.mm.opensdk.modelbase.BaseResp;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;

public abstract class BaseResp	// class@000e86
{
    public int errCode;
    public String errStr;
    public String openId;
    public String transaction;

    public void BaseResp(){
       super();
    }
    public abstract boolean checkArgs();
    public void fromBundle(Bundle p0){
       this.errCode = p0.getInt("_wxapi_baseresp_errcode");
       this.errStr = p0.getString("_wxapi_baseresp_errstr");
       this.transaction = p0.getString("_wxapi_baseresp_transaction");
       this.openId = p0.getString("_wxapi_baseresp_openId");
    }
    public abstract int getType();
    public void toBundle(Bundle p0){
       p0.putInt("_wxapi_command_type", this.getType());
       p0.putInt("_wxapi_baseresp_errcode", this.errCode);
       p0.putString("_wxapi_baseresp_errstr", this.errStr);
       p0.putString("_wxapi_baseresp_transaction", this.transaction);
       p0.putString("_wxapi_baseresp_openId", this.openId);
    }
}
