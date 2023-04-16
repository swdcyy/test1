package com.meizu.cloud.pushsdk.notification.a.d$1;
import java.lang.Runnable;
import com.meizu.cloud.pushsdk.notification.a.d;
import java.lang.String;
import java.lang.Object;
import java.lang.System;
import java.io.File;
import com.meizu.cloud.pushsdk.notification.c.a;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;

public class d$1 implements Runnable	// class@001564
{
    public final String a;
    public final d b;

    public void d$1(d p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       File[] uFileArray = a.b(this.a, String.valueOf((System.currentTimeMillis() - 0x5265c00)));
       int len = uFileArray.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uFileArray[i];
          a.b(oobject.getPath());
          DebugLogger.i("AbstractPushNotification", "Delete file directory "+oobject.getName()+"\n");
       }
       return;
    }
}
