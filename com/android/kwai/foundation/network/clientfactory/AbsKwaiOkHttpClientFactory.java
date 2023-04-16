package com.android.kwai.foundation.network.clientfactory.AbsKwaiOkHttpClientFactory;
import java.util.ArrayList;
import java.lang.Object;
import okhttp3.Interceptor;
import java.util.List;
import java.util.Collection;
import java.lang.String;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient$Builder;
import java.util.Iterator;

public abstract class AbsKwaiOkHttpClientFactory	// class@0003d4
{
    public static final List GlobalInterceptorList;
    public static final List mNetworkInterceptorList;

    static {
       AbsKwaiOkHttpClientFactory.GlobalInterceptorList = new ArrayList();
       AbsKwaiOkHttpClientFactory.mNetworkInterceptorList = new ArrayList();
    }
    public void AbsKwaiOkHttpClientFactory(){
       super();
    }
    public static void addGlobalInterceptor(Interceptor p0){
       List globalInterc = AbsKwaiOkHttpClientFactory.GlobalInterceptorList;
       _monitor_enter(globalInterc);
       globalInterc.add(p0);
       _monitor_exit(globalInterc);
    }
    public static void addNetworkInterceptor(Interceptor p0){
       List mNetworkInte = AbsKwaiOkHttpClientFactory.mNetworkInterceptorList;
       _monitor_enter(mNetworkInte);
       mNetworkInte.add(p0);
       _monitor_exit(mNetworkInte);
    }
    public static void clearGlobalInterceptor(){
       List globalInterc = AbsKwaiOkHttpClientFactory.GlobalInterceptorList;
       _monitor_enter(globalInterc);
       globalInterc.clear();
       _monitor_exit(globalInterc);
    }
    public static void clearNetworkInterceptor(){
       List mNetworkInte = AbsKwaiOkHttpClientFactory.mNetworkInterceptorList;
       _monitor_enter(mNetworkInte);
       mNetworkInte.clear();
       _monitor_exit(mNetworkInte);
    }
    public static List getGlobalInterceptorList(){
       return new ArrayList(AbsKwaiOkHttpClientFactory.GlobalInterceptorList);
    }
    public static List getNetworkInterceptorList(){
       return new ArrayList(AbsKwaiOkHttpClientFactory.mNetworkInterceptorList);
    }
    public static void removeGlobalInterceptor(Interceptor p0){
       List globalInterc = AbsKwaiOkHttpClientFactory.GlobalInterceptorList;
       _monitor_enter(globalInterc);
       globalInterc.remove(p0);
       _monitor_exit(globalInterc);
    }
    public static void removeNetworkInterceptor(Interceptor p0){
       List mNetworkInte = AbsKwaiOkHttpClientFactory.mNetworkInterceptorList;
       _monitor_enter(mNetworkInte);
       mNetworkInte.remove(p0);
       _monitor_exit(mNetworkInte);
    }
    public final OkHttpClient getOkHttpClient(String p0){
       OkHttpClient$Builder uBuilder = this.makeOkHttpClient(p0).newBuilder();
       Iterator iterator = AbsKwaiOkHttpClientFactory.GlobalInterceptorList.iterator();
       while (iterator.hasNext()) {
          uBuilder.addInterceptor(iterator.next());
       }
       iterator = AbsKwaiOkHttpClientFactory.mNetworkInterceptorList.iterator();
       while (iterator.hasNext()) {
          uBuilder.addNetworkInterceptor(iterator.next());
       }
       return uBuilder.build();
    }
    public abstract OkHttpClient makeOkHttpClient(String p0);
}
