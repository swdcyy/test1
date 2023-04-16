package okhttp3.internal.huc.OkHttpURLConnection$NetworkInterceptor;
import okhttp3.Interceptor;
import okhttp3.internal.huc.OkHttpURLConnection;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import okhttp3.internal.URLFilter;
import okhttp3.Connection;
import okhttp3.Route;
import java.net.Proxy;
import okhttp3.Handshake;
import okhttp3.RequestBody;
import okhttp3.internal.huc.OutputStreamRequestBody;
import java.lang.Thread;
import java.io.InterruptedIOException;

public final class OkHttpURLConnection$NetworkInterceptor implements Interceptor	// class@001fc0
{
    public boolean proceed;
    public final OkHttpURLConnection this$0;

    public void OkHttpURLConnection$NetworkInterceptor(OkHttpURLConnection p0){
       this.this$0 = p0;
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Request request = p0.request();
       OkHttpURLConnection urlFilter = this.this$0.urlFilter;
       if (urlFilter != null) {
          urlFilter.checkURLPermitted(request.url().url());
       }
       urlFilter = this.this$0.lock;
       _monitor_enter(urlFilter);
       OkHttpURLConnection$NetworkInterceptor tthis$0 = this.this$0;
       tthis$0.connectPending = false;
       tthis$0.proxy = p0.connection().route().proxy();
       this.this$0.handshake = p0.connection().handshake();
       this.this$0.lock.notifyAll();
       try{
          while (this.proceed == null) {
             this.this$0.lock.wait();
          }
          _monitor_exit(urlFilter);
          if (request.body() instanceof OutputStreamRequestBody) {
             request = request.body().prepareToSendRequest(request);
          }
          Response response = p0.proceed(request);
          OkHttpURLConnection lock = this.this$0.lock;
          _monitor_enter(lock);
          OkHttpURLConnection$NetworkInterceptor tthis$01 = this.this$0;
          tthis$01.networkResponse = response;
          OkHttpURLConnection.access$102(tthis$01, response.request().url().url());
          _monitor_exit(lock);
          return response;
       }catch(java.lang.InterruptedException e0){
          Thread.currentThread().interrupt();
          throw new InterruptedIOException();
       }
    }
    public void proceed(){
       OkHttpURLConnection lock = this.this$0.lock;
       _monitor_enter(lock);
       this.proceed = true;
       this.this$0.lock.notifyAll();
       _monitor_exit(lock);
    }
}
