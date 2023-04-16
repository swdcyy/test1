package com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.StringBuilder;

public final class XiaomiPushReceiver$a	// class@0016a4
{

    public void XiaomiPushReceiver$a(){
       super();
    }
    public void XiaomiPushReceiver$a(u p0){
       super();
    }
    public final String a(long p0){
       String str;
       if (!p0) {
          str = "米推成功";
       }else if(!p0 - (long)0x42c1d82){
          str = "米推Push连接认证失败";
       }else if(!p0 - (long)0x42c1d83){
          str = "米推客户端的发给PUSH通道的消息格式不合法";
       }else if(!p0 - (long)0x42c1d84){
          str = "米推内部状态错误，请联系开发人员";
       }else {
          str = "米推未知异常："+p0;
       }
       return str;
    }
}
