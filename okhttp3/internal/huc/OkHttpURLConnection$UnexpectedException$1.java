package okhttp3.internal.huc.OkHttpURLConnection$UnexpectedException$1;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.internal.huc.OkHttpURLConnection$UnexpectedException;
import java.lang.Throwable;

public class OkHttpURLConnection$UnexpectedException$1 implements Interceptor	// class@001fc1
{

    public void OkHttpURLConnection$UnexpectedException$1(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       try{
          return p0.proceed(p0.request());
       }catch(java.lang.Error e2){
       }catch(java.lang.RuntimeException e2){
       }
       throw new OkHttpURLConnection$UnexpectedException(e2);
    }
}
