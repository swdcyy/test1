package com.sina.weibo.sdk.openapi.WBAPIFactory;
import java.lang.Object;
import android.content.Context;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.openapi.a;

public class WBAPIFactory	// class@000bcb
{

    public void WBAPIFactory(){
       super();
    }
    public static IWBAPI createWBAPI(Context p0){
       return new a(p0);
    }
}
