package com.yxcorp.gifshow.follow.common.data.FollowRequestLogInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import java.util.HashMap;
import com.google.common.collect.Maps;
import okhttp3.RequestBody;
import okhttp3.FormBody;
import gha.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;

public class FollowRequestLogInterceptor implements Interceptor	// class@001019
{
    public final ImmutableList a;

    public void FollowRequestLogInterceptor(){
       super();
       this.a = ImmutableList.of("/rest/n/feed/myfollow", "/rest/n/feed/myfollow/detail/slide", "/rest/n/feed/myfollow/user/detail");
    }
    public Response intercept(Interceptor$Chain p0){
       FollowRequestLogInterceptor uFollowReque = FollowRequestLogInterceptor.class;
       String str = "1";
       Request obj = PatchProxy.applyOneRefs(p0, this, uFollowReque, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.request();
       Response response = p0.proceed(obj);
       if (this.a.contains(obj.url().url().getPath())) {
          HashMap hashMap = Maps.s();
          Request request = response.request();
          if (!PatchProxy.applyVoidTwoRefs(request, hashMap, this, uFollowReque, "2") && request.body() instanceof FormBody) {
             FormBody uFormBody = request.body();
             int i = uFormBody.size();
             int i1 = 0;
             while (i1 < i) {
                if (!hashMap.containsKey(uFormBody.name(i1))) {
                   hashMap.put(uFormBody.name(i1), uFormBody.value(i1));
                }
                i1 = i1 + 1;
             }
          }
          String str1 = hashMap.toString();
          if (!PatchProxy.applyVoidOneRefs(str1, null, c.class, str) && !TextUtils.x(str1)) {
             c.j(KsLogFollowTag.FOLLOW_STAGGER.appendTag("FollowRequestLogUtils"), "logQuery", "query", str1);
          }
       }
    label_008d :
       return response;
    }
}
