package com.android.kwai.foundation.network.IRpcService$Builder;
import java.lang.Object;
import com.android.kwai.foundation.network.IRpcService;
import com.android.kwai.foundation.network.clientfactory.AbsKwaiOkHttpClientFactory;
import com.android.kwai.foundation.network.core.KwaiRpcServiceFactory;
import java.lang.Class;
import java.lang.String;
import com.android.kwai.foundation.network.IRpcService$Builder$OpHost;

public class IRpcService$Builder	// class@0003cd
{
    public String mHost;
    public AbsKwaiOkHttpClientFactory mOkHttpClientFactory;
    public Class mRpcClz;
    public KwaiRpcServiceFactory mRpcServiceFactory;

    public void IRpcService$Builder(){
       super();
    }
    public static IRpcService$Builder newBuilder(){
       return new IRpcService$Builder();
    }
    public IRpcService build(){
       this.mRpcServiceFactory.setOkHttpClientFactory(this.mOkHttpClientFactory);
       return this.mRpcServiceFactory.newRpcService(this.mRpcClz, this.mHost);
    }
    public IRpcService$Builder setOkHttpClientFactory(AbsKwaiOkHttpClientFactory p0){
       this.mOkHttpClientFactory = p0;
       return this;
    }
    public IRpcService$Builder$OpHost with(){
       this.mRpcServiceFactory = new KwaiRpcServiceFactory();
       return new IRpcService$Builder$OpHost(this);
    }
}
