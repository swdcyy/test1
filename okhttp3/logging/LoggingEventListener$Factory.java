package okhttp3.logging.LoggingEventListener$Factory;
import okhttp3.EventListener$Factory;
import okhttp3.logging.HttpLoggingInterceptor$Logger;
import java.lang.Object;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.logging.LoggingEventListener;
import okhttp3.logging.LoggingEventListener$1;

public class LoggingEventListener$Factory implements EventListener$Factory	// class@001fe7
{
    public final HttpLoggingInterceptor$Logger logger;

    public void LoggingEventListener$Factory(){
       super(HttpLoggingInterceptor$Logger.DEFAULT);
    }
    public void LoggingEventListener$Factory(HttpLoggingInterceptor$Logger p0){
       super();
       this.logger = p0;
    }
    public EventListener create(Call p0){
       return new LoggingEventListener(this.logger, null);
    }
}
