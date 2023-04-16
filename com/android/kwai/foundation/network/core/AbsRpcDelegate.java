package com.android.kwai.foundation.network.core.AbsRpcDelegate;
import com.android.kwai.foundation.network.core.IRpcDelegate;
import java.lang.Object;
import com.android.kwai.foundation.network.core.utils.FailureCall;
import com.android.kwai.foundation.network.IRpcService$Callback;
import java.lang.Exception;
import com.android.kwai.foundation.network.ThreadType;
import java.lang.Throwable;
import android.net.Uri;
import okhttp3.Response;
import com.android.kwai.foundation.network.core.deserializers.IDeserializer;
import com.android.kwai.foundation.network.core.logicrecognize.ILogicRecognize;
import java.lang.reflect.Method;
import java.lang.Class;
import com.android.kwai.foundation.network.core.utils.CallbackTypeGenerator;
import com.android.kwai.foundation.network.core.exceptions.LogicRecognizeException;
import java.lang.StringBuilder;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import o7.a;
import java.lang.Runnable;
import com.android.kwai.foundation.network.core.exceptions.SerializationException;
import java.lang.ClassNotFoundException;

public abstract class AbsRpcDelegate implements IRpcDelegate	// class@0003d6
{
    public FailureCall mFailureCall;

    public void AbsRpcDelegate(){
       super();
       this.mFailureCall = new FailureCall();
    }
    public static void a(IRpcService$Callback p0,Object p1){
       AbsRpcDelegate.lambda$callResponse$0(p0, p1);
    }
    public static void lambda$callResponse$0(IRpcService$Callback p0,Object p1){
       p0.onSuccess(p1);
       p0.onComplete(true);
    }
    public void callFailure(Exception p0,Object p1,IRpcService$Callback p2,ThreadType p3){
       this.mFailureCall.callFailure(p0, p1, p2, p3);
    }
    public void callResponse(Uri p0,Response p1,IRpcService$Callback p2,ThreadType p3,IDeserializer p4,ILogicRecognize p5,Method p6){
       if (p2 != null) {
          int i = 0;
          try{
             Class callbackType = CallbackTypeGenerator.getCallbackTypeClass(p2);
             try{
                p4 = p4.deserialize(p1, callbackType);
                if (p5 != null && !p5.recognize(p0, p4, p1.code())) {
                   String str = " logicRecognize return false";
                   if (p4 == null) {
                      this.callFailure(new LogicRecognizeException("bean is : null response code is :"+p1.code()+str), p4, p2, p3);
                   }else {
                      this.callFailure(new LogicRecognizeException("bean is :"+p4.toString()+" response code is :"+p1.code()+str), p4, p2, p3);
                   }
                   return;
                }else if(p3 == ThreadType.Main){
                   new Handler(Looper.getMainLooper()).post(new a(p2, p4));
                }else {
                   p2.onSuccess(p4);
                   p2.onComplete(true);
                }
             }catch(java.lang.Exception e2){
                this.callFailure(new SerializationException("deserialize failed !", e2), i, p2, p3);
                return;
             }
          }catch(java.lang.ClassNotFoundException e2){
             e2.printStackTrace();
             this.callFailure(e2, i, p2, p3);
          }
       }
    }
}
