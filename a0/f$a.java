package a0.f$a;
import a0.s;
import a0.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.lang.Throwable;

public class f$a	// class@000024
{
    public static SharedPreferences a;

    static {
       s.c().close();
       f$a.a = PreferenceManager.getDefaultSharedPreferences(f.a);
    }
}
