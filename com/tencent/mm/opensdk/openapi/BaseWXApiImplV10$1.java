package com.tencent.mm.opensdk.openapi.BaseWXApiImplV10$1;
import java.lang.Runnable;
import com.tencent.mm.opensdk.openapi.BaseWXApiImplV10;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import com.tencent.mm.opensdk.openapi.MMSharedPreferences;
import android.content.Context;
import java.lang.String;
import java.lang.Exception;
import com.tencent.mm.opensdk.utils.Log;

public class BaseWXApiImplV10$1 implements Runnable	// class@000f14
{
    public final BaseWXApiImplV10 this$0;
    public final CountDownLatch val$countDownWait;

    public void BaseWXApiImplV10$1(BaseWXApiImplV10 p0,CountDownLatch p1){
       this.this$0 = p0;
       this.val$countDownWait = p1;
       super();
    }
    public void run(){
       try{
          BaseWXApiImplV10.access$002(this.this$0, new MMSharedPreferences(this.this$0.context).getInt("_build_info_sdk_int_", 0));
       }catch(java.lang.Exception e0){
          Log.w("MicroMsg.SDK.WXApiImplV10", e0.getMessage());
       }
       this.val$countDownWait.countDown();
       return;
    }
}
