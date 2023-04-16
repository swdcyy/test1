package com.android.kwai.foundation.network.core.RpcAsyncDelegate;
import com.android.kwai.foundation.network.core.AbsRpcDelegate;
import okhttp3.Request$Builder;
import java.util.Map;
import okhttp3.Request;
import com.android.kwai.foundation.network.IRpcService$RequestProgressListener;
import java.lang.Object;
import com.android.kwai.foundation.network.core.progress.request.RequestProgressBody;
import com.android.kwai.foundation.network.core.wrapper.CallbackWrapper;
import java.lang.String;
import okhttp3.RequestBody;
import java.lang.reflect.Method;
import okhttp3.OkHttpClient$Builder;
import com.android.kwai.foundation.network.core.deserializers.IDeserializer;
import com.android.kwai.foundation.network.core.logicrecognize.ILogicRecognize;
import com.android.kwai.foundation.network.core.ICancelFeature;
import com.android.kwai.foundation.network.IRpcService$ResponseProgressListener;
import com.android.kwai.foundation.network.IRpcService$Callback;
import com.android.kwai.foundation.network.ThreadType;
import com.android.kwai.foundation.network.core.intercaptors.ResponseProgressInterceptor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Call;
import com.android.kwai.foundation.network.core.RpcAsyncDelegate$1;
import okhttp3.Callback;
import com.android.kwai.foundation.network.core.RpcAsyncDelegate$2;

public final class RpcAsyncDelegate extends AbsRpcDelegate	// class@0003dd
{

    public void RpcAsyncDelegate(){
       super();
    }
    public final Request getProgressableRequest(Request$Builder p0,Map p1){
       Request request = p0.build();
       if (p1.containsKey(IRpcService$RequestProgressListener.class)) {
          request = request.newBuilder().method(request.method(), new RequestProgressBody(request, p1.get(IRpcService$RequestProgressListener.class))).build();
       }
       return request;
    }
    public ICancelFeature makeTheRealCall(Method p0,Object[] p1,Request$Builder p2,OkHttpClient$Builder p3,IDeserializer p4,Map p5,ILogicRecognize p6){
       Map map = p5;
       IRpcService$ResponseProgressListener responseProg = IRpcService$ResponseProgressListener.class;
       IRpcService$Callback uCallback = IRpcService$Callback.class;
       Request progressable = this.getProgressableRequest(p2, map);
       int i = 0;
       if (map.containsKey(uCallback)) {
          CallbackWrapper uCallbackWra = map.get(uCallback);
          IRpcService$Callback callback = uCallbackWra.getCallback();
          i = uCallbackWra.getThreadType();
          uCallback = callback;
       }else {
          uCallback = i;
       }
       OkHttpClient okHttpClient = (map.containsKey(responseProg))? p3.addNetworkInterceptor(new ResponseProgressInterceptor(map.get(responseProg))).build(): p3.build();
       Call uCall = okHttpClient.newCall(progressable);
       RpcAsyncDelegate$1 u1 = new RpcAsyncDelegate$1(this, uCallback, i, p4, p6, p0);
       uCall.enqueue(v9);
       return new RpcAsyncDelegate$2(this, uCall);
    }
    public Object makeTheRealCall(Method p0,Object[] p1,Request$Builder p2,OkHttpClient$Builder p3,IDeserializer p4,Map p5,ILogicRecognize p6){
       return this.makeTheRealCall(p0, p1, p2, p3, p4, p5, p6);
    }
}
