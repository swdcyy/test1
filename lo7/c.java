package lo7.c;
import lo7.d;
import java.lang.String;
import java.lang.Boolean;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.sdk.switchconfig.v1.SwitchConfig;

public final class c	// class@001de0
{

    public static boolean a(d p0,String p1,boolean p2){
       return p0.getValue(p1, Boolean.TYPE, Boolean.valueOf(p2)).booleanValue();
    }
    public static int b(d p0,String p1,int p2){
       return p0.getValue(p1, Integer.TYPE, Integer.valueOf(p2)).intValue();
    }
    public static long c(d p0,String p1,long p2){
       return p0.getValue(p1, Long.TYPE, Long.valueOf(p2)).longValue();
    }
    public static String d(d p0,String p1,String p2){
       return p0.getValue(p1, String.class, p2);
    }
    public static Object e(d p0,String p1,Type p2,Object p3){
       SwitchConfig switchConfig = p0.f(p1);
       if (switchConfig == null) {
          return p3;
       }
       return switchConfig.getValue(p2, p3);
    }
}
