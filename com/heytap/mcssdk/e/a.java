package com.heytap.mcssdk.e.a;
import com.heytap.mcssdk.e.c;
import java.lang.Object;
import com.heytap.mcssdk.c.b;
import com.heytap.mcssdk.PushService;
import android.content.Context;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import java.lang.StringBuilder;
import java.lang.String;
import com.heytap.mcssdk.utils.d;
import com.heytap.mcssdk.e.a$1;
import java.lang.Runnable;
import com.heytap.mcssdk.utils.f;
import com.heytap.msp.push.callback.ICallBackResultService;
import java.lang.Integer;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.mcssdk.utils.Utils;

public class a implements c	// class@000537
{

    public void a(){
       super();
    }
    public static void a(a p0,b p1,PushService p2){
       p0.a(p1, p2);
    }
    public void a(Context p0,BaseMode p1,IDataMessageCallBackService p2){
       if (p1 == null) {
          return;
       }
       if (p1.getType() == 4105) {
          d.b("mcssdk-CallBackResultProcessor:"+p1.toString());
          f.b(new a$1(this, p1));
       }
       return;
    }
    public final void a(b p0,PushService p1){
       String str;
       if (p0 == null) {
          str = "message is null , please check param of parseCommandMessage\(2\)";
       }else if(p1 == null){
          str = "pushService is null , please check param of parseCommandMessage\(2\)";
       }else if(p1.getPushCallback() == null){
          str = "pushService.getPushCallback\(\) is null , please check param of parseCommandMessage\(2\)";
       }else {
          int i = p0.e();
          if (i != 0x2fff) {
             if (i != 0x300a) {
                if (i != 0x3012) {
                   if (i != 0x3015) {
                      if (i != 0x3001) {
                         if (i != 0x3002) {
                            switch (i){
                                case 0x301c:
                                case 0x301d:
                                  ISetAppNotificationCallBackService pushSetAppNo = p1.getPushSetAppNotificationCallBack();
                                  if (pushSetAppNo != null) {
                                     pushSetAppNo.onSetAppNotificationSwitch(p0.g());
                                  }
                                  break;
                                case 0x301e:
                                  i = 0;
                                  try{
                                     i = Integer.parseInt(p0.f());
                                  }catch(java.lang.Exception e0){
                                  }
                                  IGetAppNotificationCallBackService pushGetAppNo = p1.getPushGetAppNotificationCallBack();
                                  if (pushGetAppNo != null) {
                                     pushGetAppNo.onGetAppNotificationSwitch(p0.g(), e0);
                                  }
                                  break;
                                default:
                            }
                         }else {
                            p1.getPushCallback().onUnRegister(p0.g());
                         }
                      }else if(!p0.g()){
                         p1.setRegisterID(p0.f());
                      }
                      p1.getPushCallback().onRegister(p0.g(), p0.f());
                   }else {
                      p1.getPushCallback().onGetNotificationStatus(p0.g(), Utils.parseInt(p0.f()));
                   }
                }else {
                   p1.getPushCallback().onGetPushStatus(p0.g(), Utils.parseInt(p0.f()));
                }
             }else {
                p1.getPushCallback().onSetPushTime(p0.g(), p0.f());
             }
          }else {
             ICallBackResultService pushCallback = p1.getPushCallback();
             if (pushCallback != null) {
                pushCallback.onError(p0.g(), p0.f());
             }
          }
          return;
       }
       d.e(str);
       return;
    }
}
