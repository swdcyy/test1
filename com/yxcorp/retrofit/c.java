package com.yxcorp.retrofit.c;
import java.lang.String;
import retrofit2.a;
import okhttp3.OkHttpClient;
import yid.e;
import com.google.gson.Gson;
import brd.t;
import java.lang.annotation.Annotation;
import com.yxcorp.retrofit.c$a;
import brd.z;

public interface abstract c	// class@0013c4
{

    String buildBaseUrl();
    a buildCall(a p0);
    OkHttpClient buildClient();
    e buildCommonParams();
    Gson buildGson();
    t buildObservable(t p0,a p1,Annotation[] p2);
    c$a buildParams();
    boolean enableInterceptorUpgrade();
    boolean enableNewCommonParams();
    z getExecuteScheduler();
}
