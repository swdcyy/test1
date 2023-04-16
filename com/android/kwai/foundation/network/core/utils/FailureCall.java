package com.android.kwai.foundation.network.core.utils.FailureCall;
import java.lang.Object;
import java.lang.Throwable;
import com.android.kwai.foundation.network.IRpcService$Callback;
import java.lang.Exception;
import java.lang.RuntimeException;
import java.lang.String;
import com.android.kwai.foundation.network.ThreadType;
import android.os.Handler;
import android.os.Looper;
import r7.a;
import java.lang.Runnable;

public class FailureCall	// class@0003fb
{

    public void FailureCall(){
       super();
    }
    public static void a(Throwable p0,IRpcService$Callback p1,Object p2){
       FailureCall.lambda$callFailure$0(p0, p1, p2);
    }
    public static void lambda$callFailure$0(Throwable p0,IRpcService$Callback p1,Object p2){
       if (p0 instanceof Exception) {
          p1.onFailure(p0, p2);
       }else {
          p1.onFailure(new RuntimeException(p0.getMessage(), p0), p2);
       }
       p1.onComplete(false);
       return;
    }
    public final void callFailure(Throwable p0,Object p1,IRpcService$Callback p2,ThreadType p3){
       if (p2 != null) {
          if (p3 == ThreadType.Main) {
             new Handler(Looper.getMainLooper()).post(new a(p0, p2, p1));
          }else if(p0 instanceof Exception){
             p2.onFailure(p0, p1);
          }else {
             p2.onFailure(new RuntimeException(p0.getMessage(), p0), p1);
          }
          p2.onComplete(false);
       }
       return;
    }
}
