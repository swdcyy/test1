package vn7.e;
import vn7.e$a;
import java.lang.String;
import java.util.Map;
import org.json.JSONObject;
import java.lang.Throwable;

public interface abstract e	// class@003b03
{
    public static final e$a a;

    static {
       e.a = e$a.a;
    }
    void logCustomEvent(String p0,String p1);
    void logCustomEvent(String p0,Map p1);
    void logCustomEvent(String p0,JSONObject p1);
    void logExceptionEvent(String p0,Throwable p1);
    void logTaskEvent(String p0,String p1,String p2,String p3,String p4);
}
