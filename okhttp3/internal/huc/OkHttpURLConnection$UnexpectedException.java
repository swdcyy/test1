package okhttp3.internal.huc.OkHttpURLConnection$UnexpectedException;
import java.io.IOException;
import okhttp3.internal.huc.OkHttpURLConnection$UnexpectedException$1;
import java.lang.Throwable;

public final class OkHttpURLConnection$UnexpectedException extends IOException	// class@001fc2
{
    public static final Interceptor INTERCEPTOR;

    static {
       OkHttpURLConnection$UnexpectedException.INTERCEPTOR = new OkHttpURLConnection$UnexpectedException$1();
    }
    public void OkHttpURLConnection$UnexpectedException(Throwable p0){
       super(p0);
    }
}
