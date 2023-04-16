package com.kwai.framework.network.regions.APIScheduledResultLogInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import com.kwai.framework.network.k;
import okhttp3.HttpUrl;
import java.net.URL;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import okhttp3.Headers;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class APIScheduledResultLogInterceptor implements Interceptor	// class@00180b
{

    public void APIScheduledResultLogInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       String str = "1";
       Request obj = PatchProxy.applyOneRefs(p0, this, APIScheduledResultLogInterceptor.class, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.request();
       if (!PatchProxy.applyVoidOneRefs(obj, null, k.class, str)) {
          try{
             boolean b = true;
             str = k.b(obj.url().url().getPath(), b);
             if (!TextUtils.isEmpty(str)) {
                String[] stringArray = new String[16];
                stringArray[0] = "clue";
                stringArray[b] = str;
                stringArray[2] = "requestId";
                stringArray[3] = obj.header("X-REQUESTID");
                stringArray[4] = "userId";
                stringArray[5] = QCurrentUser.me().getId();
                stringArray[6] = "did";
                stringArray[7] = a.a;
                stringArray[8] = "uri";
                stringArray[9] = k.c(obj.url()).toString();
                stringArray[10] = "requestHeader";
                stringArray[11] = obj.headers().toString();
                stringArray[12] = "requestParams";
                stringArray[13] = obj.url().encodedQuery();
                stringArray[14] = "requestBody";
                stringArray[15] = "NOT SUPPORT";
                k.a(0, stringArray);
             }
          }catch(java.lang.Exception e1){
             ExceptionHandler.handleCaughtException(e1);
          }
       }
    }
}
