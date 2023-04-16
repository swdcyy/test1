package com.android.kwai.foundation.network.core.intercaptors.ResponseProgressInterceptor;
import okhttp3.Interceptor;
import com.android.kwai.foundation.network.core.wrapper.CallbackWrapper;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.Response$Builder;
import com.android.kwai.foundation.network.core.progress.response.ResponseProgressBody;
import okhttp3.ResponseBody;

public class ResponseProgressInterceptor implements Interceptor	// class@000ef1
{
    public CallbackWrapper mCallbackWrapper;

    public void ResponseProgressInterceptor(CallbackWrapper p0){
       super();
       this.mCallbackWrapper = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       Response response = p0.proceed(p0.request());
       Response$Builder uBuilder = response.newBuilder();
       return uBuilder.body(new ResponseProgressBody(response.body(), this.mCallbackWrapper)).build();
    }
}
