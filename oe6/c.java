package oe6.c;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;

public final class c	// class@002014
{
    public static final SharedPreferences a;

    static {
       c.a = b.b("CommonPreferenceHelper");
    }
    public static long a(){
       return c.a.getLong("FirstInstallTime", 0);
    }
    public static long b(){
       return c.a.getLong("new_device_install_app_time", 0);
    }
}
