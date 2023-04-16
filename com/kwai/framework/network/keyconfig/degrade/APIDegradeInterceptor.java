package com.kwai.framework.network.keyconfig.degrade.APIDegradeInterceptor;
import okhttp3.Interceptor;
import com.kwai.framework.network.keyconfig.degrade.APIDegradeInterceptor$b;
import nsd.u;
import com.kwai.framework.network.keyconfig.degrade.APIDegradeInterceptor$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Object;
import wkd.b;
import pb6.m;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfig;
import pb6.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import okhttp3.Request;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import okhttp3.HttpUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.net.URL;
import pb6.o;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import pb6.g;
import yb6.d;
import com.kwai.framework.network.keyconfig.BaseConfig;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import pb6.a;
import com.kwai.framework.network.keyconfig.TimeRange;
import java.util.Collection;
import ssd.e;
import ssd.e$a;
import okhttp3.HttpUrl$Builder;
import okhttp3.ResponseBody;
import okhttp3.MediaType;
import njd.a;
import okhttp3.MediaTypes;
import fg6.a;
import com.google.gson.Gson;
import okhttp3.Response$Builder;
import okhttp3.Request$Builder;
import pb6.l;
import ja0.a;
import pb6.f;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Long;
import android.os.SystemClock;
import java.util.Map;
import java.lang.Boolean;
import pb6.e;

public final class APIDegradeInterceptor implements Interceptor	// class@000c34
{
    public final m a;
    public static final Type b;
    public static final APIDegradeInterceptor$b c;

    static {
       APIDegradeInterceptor.c = new APIDegradeInterceptor$b(null);
       APIDegradeInterceptor.b = new APIDegradeInterceptor$a().getType();
    }
    public void APIDegradeInterceptor(){
       super();
       this.a = b.a(0x66e15c9b);
    }
    public Response intercept(Interceptor$Chain p0){
       URL uRL;
       String path;
       b uob1;
       Object[] objArray;
       String str2;
       g og;
       String str3;
       String str4;
       b uob2;
       String str5;
       l obj3;
       String str6;
       String str7;
       String str8;
       b uob3;
       String str9;
       String str10;
       g og1;
       Response response;
       ResponseBody responseBody;
       MediaType mediaType;
       String str11;
       APIDegradeInterceptor uAPIDegradeI1;
       a uoa;
       Response response1;
       Object[] objArray1;
       Interceptor$Chain uChain;
       MediaType jSON_UTF_8;
       l obj4;
       b uob4;
       l ol;
       Object[] objArray2;
       f uof;
       b uob5;
       Request request1;
       String str12;
       DegradeConfig uDegradeConf1;
       Object[] objArray3;
       Request request2;
       b uob6;
       b uob7;
       StringBuilder str13;
       HttpUrl httpUrl;
       e obj5;
       int b;
       Object[] objArray4;
       DegradeConfig uDegradeConf2;
       DegradeConfig uDegradeConf3;
       Iterator iterator;
       e uoe;
       String str14;
       l ol1;
       Long longx;
       long l;
       DegradeConfig uDegradeConf4;
       DegradeConfig uDegradeConf5;
       Iterator iterator1;
       f uof1;
       Iterator iterator2;
       f uof2;
       f uof3;
       boolean b1;
       g og2;
       DegradeConfig uDegradeConf6;
       DegradeConfig uDegradeConf7;
       Iterator iterator3;
       a uoa1;
       Iterator iterator4;
       Object obj6;
       List list;
       g obj = this;
       String obj1 = p0;
       APIDegradeInterceptor uAPIDegradeI = APIDegradeInterceptor.class;
       DegradeConfig uDegradeConf = DegradeConfig.class;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, uAPIDegradeI, str);
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       a.p(obj1, "chain");
       Request request = p0.request();
       RequestTiming requestTimin = request.tag(RequestTiming.class);
       String str1 = "";
       if (requestTimin == null) {
          try{
             obj2 = request.url().queryParameter("apiInvokeTiming");
             if (obj2 == null) {
                obj2 = str1;
             }
             a.o(obj2, "request.url\(\).queryParam\x20\x02_API_INVOKE_TIMING\) ?: \"\"\x00");
             if (!TextUtils.x(obj2)) {
                requestTimin = RequestTiming.valueOf(obj2);
             }
          }catch(java.lang.Exception e0){
             ExceptionHandler.handleCaughtException(e0);
          }
       }
    }
}
