package okhttp3.logging.HttpLoggingInterceptor$Logger;
import okhttp3.logging.HttpLoggingInterceptor$Logger$1;
import java.lang.String;

public interface abstract HttpLoggingInterceptor$Logger	// class@001fe4
{
    public static final HttpLoggingInterceptor$Logger DEFAULT;

    static {
       HttpLoggingInterceptor$Logger.DEFAULT = new HttpLoggingInterceptor$Logger$1();
    }
    void log(String p0);
}
