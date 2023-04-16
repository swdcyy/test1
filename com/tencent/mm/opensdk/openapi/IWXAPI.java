package com.tencent.mm.opensdk.openapi.IWXAPI;
import android.content.Intent;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import java.lang.String;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.ILog;

public interface abstract IWXAPI	// class@000f17
{

    void detach();
    int getWXAppSupportAPI();
    boolean handleIntent(Intent p0,IWXAPIEventHandler p1);
    boolean isWXAppInstalled();
    boolean openWXApp();
    boolean registerApp(String p0);
    boolean registerApp(String p0,long p1);
    boolean sendReq(BaseReq p0);
    boolean sendResp(BaseResp p0);
    void setLogImpl(ILog p0);
    void unregisterApp();
}
