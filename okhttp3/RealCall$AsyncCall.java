package okhttp3.RealCall$AsyncCall;
import okhttp3.internal.NamedRunnable;
import okhttp3.RealCall;
import okhttp3.Callback;
import java.lang.Object;
import java.lang.String;
import okio.a;
import okhttp3.Response;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import java.io.IOException;
import java.lang.StringBuilder;
import okhttp3.internal.platform.Platform;
import java.lang.Throwable;
import okhttp3.EventListener;
import java.util.concurrent.ExecutorService;
import java.lang.Runnable;
import java.io.InterruptedIOException;
import okhttp3.HttpUrl;
import okhttp3.Request;

public final class RealCall$AsyncCall extends NamedRunnable	// class@00208a
{
    public final Callback responseCallback;
    public final RealCall this$0;
    public static final boolean $assertionsDisabled;

    static {
    }
    public void RealCall$AsyncCall(RealCall p0,Callback p1){
       this.this$0 = p0;
       Object[] objArray = new Object[]{p0.redactedUrl()};
       super("OkHttp %s", objArray);
       this.responseCallback = p1;
    }
    public void execute(){
       IOException iOException;
       RealCall$AsyncCall tthis$0;
       this.this$0.timeout.enter();
       try{
          int i = 0;
          Response responseWith = this.this$0.getResponseWithInterceptorChain();
          try{
             tthis$0 = 1;
             this.responseCallback.onResponse(this.this$0, responseWith);
          label_0016 :
             this.this$0.client.dispatcher().finished(this);
             return;
          }catch(java.io.IOException e0){
          }
          iOException = this.this$0.timeoutExit(iOException);
          if (platform) {
             Platform.get().log(4, "Callback failure for "+this.this$0.toLoggableString(), iOException);
             goto label_0016 ;
          }else {
             tthis$0 = this.this$0;
             tthis$0.eventListener.callFailed(tthis$0, iOException);
             this.responseCallback.onFailure(this.this$0, iOException);
             goto label_0016 ;
          }
       }catch(java.io.IOException e1){
          iOException = e1;
          Platform platform = null;
          goto label_0051 ;
       }
    }
    public void executeOn(ExecutorService p0){
       try{
          p0.execute(this);
       }catch(java.util.concurrent.RejectedExecutionException e3){
          InterruptedIOException interruptedI = new InterruptedIOException("executor rejected");
          interruptedI.initCause(e3);
          this.this$0.eventListener.callFailed(this.this$0, interruptedI);
          this.responseCallback.onFailure(this.this$0, interruptedI);
          this.this$0.client.dispatcher().finished(this);
       }
       return;
    }
    public RealCall get(){
       return this.this$0;
    }
    public String host(){
       return this.this$0.originalRequest.url().host();
    }
    public Request request(){
       return this.this$0.originalRequest;
    }
}
