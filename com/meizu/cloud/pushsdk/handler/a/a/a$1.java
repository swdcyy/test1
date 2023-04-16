package com.meizu.cloud.pushsdk.handler.a.a.a$1;
import java.lang.Runnable;
import com.meizu.cloud.pushsdk.handler.a.a.a;
import java.lang.Object;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;

public class a$1 implements Runnable	// class@001530
{
    public final a a;

    public void a$1(a p0){
       this.a = p0;
       super();
    }
    public void run(){
       DebugLogger.d("AdNotification", "ad priority valid time out");
       this.a.a();
    }
}
