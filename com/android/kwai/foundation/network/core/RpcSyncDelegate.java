package com.android.kwai.foundation.network.core.RpcSyncDelegate;
import com.android.kwai.foundation.network.core.AbsRpcDelegate;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import okhttp3.Request$Builder;
import okhttp3.OkHttpClient$Builder;
import com.android.kwai.foundation.network.core.deserializers.IDeserializer;
import java.util.Map;
import com.android.kwai.foundation.network.core.logicrecognize.ILogicRecognize;
import com.android.kwai.foundation.network.SyncResult;
import com.android.kwai.foundation.network.IRpcService$ResponseProgressListener;
import com.android.kwai.foundation.network.IRpcService$RequestProgressListener;
import okhttp3.Request;
import com.android.kwai.foundation.network.core.progress.request.RequestProgressBody;
import com.android.kwai.foundation.network.core.wrapper.CallbackWrapper;
import java.lang.String;
import okhttp3.RequestBody;
import com.android.kwai.foundation.network.IRpcService$Callback;
import com.android.kwai.foundation.network.core.intercaptors.ResponseProgressInterceptor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.HttpUrl;
import android.net.Uri;
import com.android.kwai.foundation.network.core.exceptions.LogicRecognizeException;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.io.IOException;
import java.lang.IllegalArgumentException;

public final class RpcSyncDelegate extends AbsRpcDelegate	// class@000ee7
{
    public Class mResultBeanClz;

    public void RpcSyncDelegate(Class p0){
       super();
       this.mResultBeanClz = null;
       this.mResultBeanClz = p0;
    }
    public SyncResult makeTheRealCall(Method p0,Object[] p1,Request$Builder p2,OkHttpClient$Builder p3,IDeserializer p4,Map p5,ILogicRecognize p6){
       IRpcService$ResponseProgressListener responseProg = IRpcService$ResponseProgressListener.class;
       IRpcService$RequestProgressListener requestProgr = IRpcService$RequestProgressListener.class;
       Request request = p2.build();
       if (p5.containsKey(requestProgr)) {
          request = request.newBuilder().method(request.method(), new RequestProgressBody(request, p5.get(requestProgr))).build();
       }
       if (!p5.containsKey(IRpcService$Callback.class)) {
          OkHttpClient okHttpClient = (p5.containsKey(responseProg))? p3.addNetworkInterceptor(new ResponseProgressInterceptor(p5.get(responseProg))).build(): p3.build();
          Call uCall = okHttpClient.newCall(request);
          SyncResult syncResult = new SyncResult();
          try{
             syncResult.setSuccess(false);
             Response response = uCall.execute();
             RpcSyncDelegate tmResultBean = this.mResultBeanClz;
             String str = 1;
             if (tmResultBean != null) {
                try{
                   p4 = p4.deserialize(response, tmResultBean);
                   if (p6 != null && !p6.recognize(Uri.parse(uCall.request().url().toString()), p4, response.code())) {
                      String str1 = " logicRecognize return false";
                      if (p4 == null) {
                         syncResult.setException(new LogicRecognizeException("bean is : null response code is :"+response.code()+str1));
                         syncResult.setSuccess(false);
                         return syncResult;
                      }else {
                         syncResult.setException(new LogicRecognizeException("bean is :"+p4.toString()+" response code is :"+response.code()+str1));
                         syncResult.setSuccess(false);
                         syncResult.setResult(p4);
                         return syncResult;
                      }
                   }else {
                      syncResult.setResult(p4);
                      syncResult.setSuccess(str);
                      syncResult.setException(null);
                      return syncResult;
                   }
                }catch(java.lang.Exception e3){
                   syncResult.setResult(null);
                   syncResult.setSuccess(false);
                   syncResult.setException(e3);
                   return syncResult;
                }
             }else {
                syncResult.setSuccess(str);
                syncResult.setException(null);
                syncResult.setResult(null);
                return syncResult;
             }
          }catch(java.io.IOException e3){
             e3.printStackTrace();
             syncResult.setSuccess(false);
             syncResult.setException(e3);
             return syncResult;
          }
       }else {
          throw new IllegalArgumentException("this http request is sync mode,shouldn\'t be have callback in method parameter ! please delete it !!!");
       }
    }
    public Object makeTheRealCall(Method p0,Object[] p1,Request$Builder p2,OkHttpClient$Builder p3,IDeserializer p4,Map p5,ILogicRecognize p6){
       return this.makeTheRealCall(p0, p1, p2, p3, p4, p5, p6);
    }
}
