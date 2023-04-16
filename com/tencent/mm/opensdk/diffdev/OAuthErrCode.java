package com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;

public final class OAuthErrCode extends Enum	// class@000e7a
{
    public int code;
    public static final OAuthErrCode[] $VALUES;
    public static final OAuthErrCode WechatAuth_Err_Auth_Stopped;
    public static final OAuthErrCode WechatAuth_Err_Cancel;
    public static final OAuthErrCode WechatAuth_Err_JsonDecodeErr;
    public static final OAuthErrCode WechatAuth_Err_NetworkErr;
    public static final OAuthErrCode WechatAuth_Err_NormalErr;
    public static final OAuthErrCode WechatAuth_Err_OK;
    public static final OAuthErrCode WechatAuth_Err_Timeout;

    static {
       OAuthErrCode oAuthErrCode = new OAuthErrCode("WechatAuth_Err_OK", 0, 0);
       OAuthErrCode.WechatAuth_Err_OK = oAuthErrCode;
       OAuthErrCode oAuthErrCode1 = new OAuthErrCode("WechatAuth_Err_NormalErr", 1, -1);
       OAuthErrCode.WechatAuth_Err_NormalErr = oAuthErrCode1;
       OAuthErrCode oAuthErrCode2 = new OAuthErrCode("WechatAuth_Err_NetworkErr", 2, -2);
       OAuthErrCode.WechatAuth_Err_NetworkErr = oAuthErrCode2;
       OAuthErrCode oAuthErrCode3 = new OAuthErrCode("WechatAuth_Err_JsonDecodeErr", 3, -3);
       OAuthErrCode.WechatAuth_Err_JsonDecodeErr = oAuthErrCode3;
       OAuthErrCode oAuthErrCode4 = new OAuthErrCode("WechatAuth_Err_Cancel", 4, -4);
       OAuthErrCode.WechatAuth_Err_Cancel = oAuthErrCode4;
       OAuthErrCode oAuthErrCode5 = new OAuthErrCode("WechatAuth_Err_Timeout", 5, -5);
       OAuthErrCode.WechatAuth_Err_Timeout = oAuthErrCode5;
       OAuthErrCode oAuthErrCode6 = new OAuthErrCode("WechatAuth_Err_Auth_Stopped", 6, -6);
       OAuthErrCode.WechatAuth_Err_Auth_Stopped = oAuthErrCode6;
       OAuthErrCode[] oAuthErrCode7 = new OAuthErrCode[]{oAuthErrCode,oAuthErrCode1,oAuthErrCode2,oAuthErrCode3,oAuthErrCode4,oAuthErrCode5,oAuthErrCode6};
       OAuthErrCode.$VALUES = oAuthErrCode7;
    }
    public void OAuthErrCode(String p0,int p1,int p2){
       this.code = p2;
    }
    public static OAuthErrCode valueOf(String p0){
       return Enum.valueOf(OAuthErrCode.class, p0);
    }
    public static OAuthErrCode[] values(){
       return OAuthErrCode.$VALUES.clone();
    }
    public int getCode(){
       return this.code;
    }
    public String toString(){
       return "OAuthErrCode:"+this.code;
    }
}
