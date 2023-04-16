package com.heytap.mcssdk.b;
import java.lang.Object;
import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import java.lang.String;
import com.heytap.mcssdk.utils.d;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.mcssdk.b$1;
import java.lang.Runnable;
import com.heytap.mcssdk.utils.f;

public class b	// class@000526
{

    public void b(){
       super();
    }
    public static void a(Context p0,Intent p1,IDataMessageCallBackService p2){
       if (p0 == null) {
          d.e("context is null , please check param of parseIntent\(\)");
          return;
       }else if(p1 == null){
          d.e("intent is null , please check param of parseIntent\(\)");
          return;
       }else if(p2 == null){
          d.e("callback is null , please check param of parseIntent\(\)");
          return;
       }else if(!Utils.isSupportPushByClient(p0)){
          d.e("push is null ,please check system has push");
          return;
       }else {
          f.a(new b$1(p0, p1, p2));
          return;
       }
    }
}
