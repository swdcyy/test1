package h97.g;
import java.lang.String;
import java.lang.Boolean;
import android.content.Context;
import android.net.Uri;
import android.content.Intent;
import android.app.Application;
import android.content.SharedPreferences;

public interface abstract g	// class@001737
{

    String N();
    Boolean O();
    String P();
    Intent Q(Context p0,Uri p1);
    boolean R();
    String S();
    boolean T();
    String U();
    float V();
    String W();
    String X();
    Intent Y(Context p0,Uri p1,boolean p2,boolean p3);
    boolean Z();
    boolean a();
    boolean a0();
    boolean b();
    String b0();
    Boolean c();
    boolean c0();
    Boolean d();
    boolean f();
    String g();
    String getAppVersion();
    String getChannel();
    Application getContext();
    String getDeviceId();
    String getGlobalId();
    String getHotFixPatchVersion();
    String getLanguage();
    double getLatitude();
    double getLongitude();
    String getManufacturerAndModel();
    String getPlatform();
    String getProductName();
    SharedPreferences getSharedPreferences(String p0,int p1);
    String getSysRelease();
    String getUserId();
    String getVersion();
    String i();
    boolean isDebugMode();
    boolean isTestMode();
}
