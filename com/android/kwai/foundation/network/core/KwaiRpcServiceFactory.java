package com.android.kwai.foundation.network.core.KwaiRpcServiceFactory;
import java.lang.Object;
import java.lang.String;
import okhttp3.OkHttpClient;
import com.android.kwai.foundation.network.clientfactory.DefaultOkHttpClientFactoryImpl;
import com.android.kwai.foundation.network.clientfactory.AbsKwaiOkHttpClientFactory;
import java.lang.Class;
import android.net.Uri;
import com.android.kwai.foundation.network.IRpcService;
import java.lang.ClassLoader;
import com.android.kwai.foundation.network.core.KwaiRpcServiceProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public final class KwaiRpcServiceFactory	// class@0003d9
{
    public AbsKwaiOkHttpClientFactory mOkHttpClientFactory;

    public void KwaiRpcServiceFactory(){
       super();
       this.mOkHttpClientFactory = null;
    }
    public OkHttpClient getOkHttpClient(String p0){
       if (this.mOkHttpClientFactory == null) {
          this.mOkHttpClientFactory = new DefaultOkHttpClientFactoryImpl();
       }
       return this.mOkHttpClientFactory.getOkHttpClient(p0);
    }
    public IRpcService newRpcService(Class p0,Uri p1){
       Class[] uClassArray = new Class[]{p0};
       return Proxy.newProxyInstance(p0.getClassLoader(), uClassArray, new KwaiRpcServiceProxy(this, p0, p1));
    }
    public IRpcService newRpcService(Class p0,String p1){
       return this.newRpcService(p0, Uri.parse(p1));
    }
    public void setOkHttpClientFactory(AbsKwaiOkHttpClientFactory p0){
       this.mOkHttpClientFactory = p0;
    }
}
