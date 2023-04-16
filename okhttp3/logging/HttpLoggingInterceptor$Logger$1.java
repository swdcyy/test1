package okhttp3.logging.HttpLoggingInterceptor$Logger$1;
import okhttp3.logging.HttpLoggingInterceptor$Logger;
import java.lang.Object;
import java.lang.String;
import okhttp3.internal.platform.Platform;
import java.lang.Throwable;

public class HttpLoggingInterceptor$Logger$1 implements HttpLoggingInterceptor$Logger	// class@001fe3
{

    public void HttpLoggingInterceptor$Logger$1(){
       super();
    }
    public void log(String p0){
       Platform.get().log(4, p0, null);
    }
}
