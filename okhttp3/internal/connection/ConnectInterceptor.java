package okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.Request;
import okhttp3.internal.connection.StreamAllocation;
import java.lang.String;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.connection.RealConnection;

public final class ConnectInterceptor implements Interceptor	// class@0020a8
{
    public final OkHttpClient client;

    public void ConnectInterceptor(OkHttpClient p0){
       super();
       this.client = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       RealInterceptorChain realIntercep = p0;
       Request request = realIntercep.request();
       StreamAllocation streamAlloca = realIntercep.streamAllocation();
       return realIntercep.proceed(request, streamAlloca, streamAlloca.newStream(this.client, p0, ((request.method()).equals("GET") ^ 0x01)), streamAlloca.connection());
    }
}
