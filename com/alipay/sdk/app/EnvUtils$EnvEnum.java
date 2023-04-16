package com.alipay.sdk.app.EnvUtils$EnvEnum;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class EnvUtils$EnvEnum extends Enum	// class@000e8b
{
    public static final EnvUtils$EnvEnum[] $VALUES;
    public static final EnvUtils$EnvEnum ONLINE;
    public static final EnvUtils$EnvEnum SANDBOX;

    static {
       EnvUtils$EnvEnum uEnvEnum = new EnvUtils$EnvEnum("ONLINE", 0);
       EnvUtils$EnvEnum.ONLINE = uEnvEnum;
       EnvUtils$EnvEnum uEnvEnum1 = new EnvUtils$EnvEnum("SANDBOX", 1);
       EnvUtils$EnvEnum.SANDBOX = uEnvEnum1;
       EnvUtils$EnvEnum[] uEnvEnumArra = new EnvUtils$EnvEnum[]{uEnvEnum,uEnvEnum1};
       EnvUtils$EnvEnum.$VALUES = uEnvEnumArra;
    }
    public void EnvUtils$EnvEnum(String p0,int p1){
       super(p0, p1);
    }
    public static EnvUtils$EnvEnum valueOf(String p0){
       return Enum.valueOf(EnvUtils$EnvEnum.class, p0);
    }
    public static EnvUtils$EnvEnum[] values(){
       return EnvUtils$EnvEnum.$VALUES.clone();
    }
}
