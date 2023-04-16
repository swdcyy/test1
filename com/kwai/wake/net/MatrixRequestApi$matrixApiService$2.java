package com.kwai.wake.net.MatrixRequestApi$matrixApiService$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.wake.net.MatrixApiService;
import dx7.f;
import java.lang.Object;
import java.util.Objects;
import okhttp3.OkHttpClient;
import zw7.d;
import java.lang.String;
import com.android.kwai.foundation.network.IRpcService$Builder;
import n7.a;
import com.kwai.wake.net.MatrixRequestApi$matrixApiService$2$1;
import com.android.kwai.foundation.network.clientfactory.AbsKwaiOkHttpClientFactory;
import com.android.kwai.foundation.network.IRpcService$Builder$OpHost;
import com.android.kwai.foundation.network.IRpcService$Builder$OpServiceClz;
import java.lang.Class;
import com.android.kwai.foundation.network.IRpcService$Builder$OpFinal;
import com.android.kwai.foundation.network.IRpcService;

public final class MatrixRequestApi$matrixApiService$2 extends Lambda implements a	// class@001115
{
    public static final MatrixRequestApi$matrixApiService$2 INSTANCE;

    static {
       MatrixRequestApi$matrixApiService$2.INSTANCE = new MatrixRequestApi$matrixApiService$2();
    }
    public void MatrixRequestApi$matrixApiService$2(){
       super(0);
    }
    public final MatrixApiService invoke(){
       Objects.requireNonNull(f.d);
       d b = f.b;
       OkHttpClient okHttpClient = b.a();
       IRpcService iRpcService = a.a().setOkHttpClientFactory(new MatrixRequestApi$matrixApiService$2$1(okHttpClient)).with().host(b.getApiHost()).rpcService(MatrixApiService.class).build();
       Objects.requireNonNull(iRpcService, "null cannot be cast to non-null type com.kwai.wake.net.MatrixApiService");
       return iRpcService;
    }
    public Object invoke(){
       return this.invoke();
    }
}
