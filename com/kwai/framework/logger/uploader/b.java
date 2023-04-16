package com.kwai.framework.logger.uploader.b;
import javax.inject.Provider;
import java.lang.Object;
import java.util.HashSet;
import w96.n;
import java.util.Collection;
import okhttp3.Request$Builder;
import java.lang.String;
import okhttp3.Request;
import okhttp3.OkHttpClient$Builder;
import okhttp3.OkHttpClient;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import fg6.a;
import y96.j;
import java.lang.Class;
import com.google.gson.Gson;
import java.util.Set;
import w96.d;
import java.lang.StringBuilder;
import java.lang.Exception;
import q87.c;
import android.util.Pair;

public final class b implements Provider	// class@000b94
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       HashSet hashSet = new HashSet(n.a);
       HashSet hashSet1 = new HashSet();
       Request request = new Request$Builder().url("http://logger-v2-backend.corp.kuaishou.com/api/logger/api/list").build();
       OkHttpClient okHttpClient = new OkHttpClient$Builder().build();
       try{
          ResponseBody responseBody = okHttpClient.newCall(request).execute().body();
          if (responseBody != null) {
             j oj = a.a.h(responseBody.string(), j.class);
             if (oj != null && oj.mResult == 1) {
                j mPathList = oj.mPathList;
                if (mPathList != null) {
                   hashSet.addAll(mPathList);
                   hashSet1.addAll(oj.mDuplicatePathList);
                }
             }
          }
       }catch(java.lang.Exception e2){
          Object[] objArray = new Object[0];
          d.C().w("DebugLoggerInterceptor", "get redirectPath error : "+e2.getMessage(), objArray);
       }
       return new Pair(hashSet, hashSet1);
    }
}
