package com.alipay.sdk.app.EnvUtils;
import com.alipay.sdk.app.EnvUtils$EnvEnum;

public class EnvUtils	// class@000e8c
{
    public static EnvUtils$EnvEnum a;

    static {
       EnvUtils.a = EnvUtils$EnvEnum.ONLINE;
    }
    public static boolean a(){
       boolean b = (EnvUtils.a == EnvUtils$EnvEnum.SANDBOX)? true: false;
       return b;
    }
}
