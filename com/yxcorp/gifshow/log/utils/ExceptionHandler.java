package com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import com.yxcorp.gifshow.log.utils.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.b$a;
import android.view.View;

public final class ExceptionHandler	// class@001b50
{

    public void ExceptionHandler(){
       super();
    }
    public static boolean handleCaughtException(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ExceptionHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-1513562766).c(p0, null);
    }
    public static boolean handleCaughtException(Throwable p0,ClientEvent$ExceptionEvent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ExceptionHandler.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-1513562766).c(p0, p1);
    }
    public static boolean handleException(Context p0,Throwable p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ExceptionHandler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-1513562766).d(p0, p1, null);
    }
    public static boolean handleException(Context p0,Throwable p1,b$a p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ExceptionHandler.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-1513562766).d(p0, p1, p2);
    }
    public static boolean handlePendingActivityException(Context p0,Throwable p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ExceptionHandler.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-1513562766).e(p0, p1);
    }
    public static boolean handleUserNotLoginFirstTimeAlert(Throwable p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ExceptionHandler.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-1513562766).b(p0, p1);
    }
}
