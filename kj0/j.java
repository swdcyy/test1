package kj0.j;
import com.google.gson.Gson;
import java.lang.String;
import android.app.Application;
import android.content.SharedPreferences;

public interface abstract j	// class@002d4c
{

    boolean a();
    boolean b();
    boolean c();
    Gson d();
    int e();
    boolean f();
    String g();
    String getAppVersion();
    String getChannel();
    Application getContext();
    String getDeviceId();
    String getGlobalId();
    String getLocale();
    String getPlatform();
    String getProductName();
    SharedPreferences getSharedPreferences(String p0,int p1);
    String getUserAgent();
    String getUserId();
    long h();
    boolean isDebugMode();
}
