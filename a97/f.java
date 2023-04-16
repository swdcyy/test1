package a97.f;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import java.util.Set;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class f	// class@000030
{

    public static int a(Context p0,String p1,int p2){
       return o.c(p0, "kwai_logger_sp", 0).getInt(p1, p2);
    }
    public static Set b(Context p0,String p1,Set p2){
       return o.c(p0, "kwai_logger_sp", 0).getStringSet(p1, p2);
    }
    public static void c(Context p0,String p1,int p2){
       g.a(o.c(p0, "kwai_logger_sp", 0).edit().putInt(p1, p2));
    }
}
