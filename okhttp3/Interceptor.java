package okhttp3.Interceptor;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;

public interface abstract Interceptor	// class@00207f
{

    Response intercept(Interceptor$Chain p0);
}
