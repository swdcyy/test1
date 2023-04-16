package okhttp3.Interceptor$Chain;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Request;
import okhttp3.Response;
import java.util.concurrent.TimeUnit;

public interface abstract Interceptor$Chain	// class@00207e
{

    Call call();
    int connectTimeoutMillis();
    Connection connection();
    Response proceed(Request p0);
    int readTimeoutMillis();
    Request request();
    Interceptor$Chain withConnectTimeout(int p0,TimeUnit p1);
    Interceptor$Chain withReadTimeout(int p0,TimeUnit p1);
    Interceptor$Chain withWriteTimeout(int p0,TimeUnit p1);
    int writeTimeoutMillis();
}
