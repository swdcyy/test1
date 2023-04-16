package com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import android.content.Context;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import java.lang.StringBuilder;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.openapi.WXApiImplV10;

public class WXAPIFactory	// class@000f1b
{

    public void WXAPIFactory(){
       super();
       throw new RuntimeException("WXAPIFactory should not be instantiated");
    }
    public static IWXAPI createWXAPI(Context p0,String p1){
       return WXAPIFactory.createWXAPI(p0, p1, true);
    }
    public static IWXAPI createWXAPI(Context p0,String p1,boolean p2){
       Log.d("MicroMsg.PaySdk.WXFactory", "createWXAPI, appId = "+p1+", checkSignature = "+p2);
       return WXAPIFactory.createWXAPI(p0, p1, p2, 2);
    }
    public static IWXAPI createWXAPI(Context p0,String p1,boolean p2,int p3){
       Log.d("MicroMsg.PaySdk.WXFactory", "createWXAPI, appId = "+p1+", checkSignature = "+p2+", launchMode = "+p3);
       return new WXApiImplV10(p0, p1, p2, p3);
    }
}
