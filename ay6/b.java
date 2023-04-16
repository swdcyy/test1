package ay6.b;
import ay6.c;
import java.lang.String;
import java.lang.Boolean;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;

public final class b	// class@00039f
{

    public static boolean a(c p0,String p1,boolean p2){
       return p0.getValue(p1, Boolean.TYPE, Boolean.valueOf(p2)).booleanValue();
    }
    public static int b(c p0,String p1,int p2){
       return p0.getValue(p1, Integer.TYPE, Integer.valueOf(p2)).intValue();
    }
    public static long c(c p0,String p1,long p2){
       return p0.getValue(p1, Long.TYPE, Long.valueOf(p2)).longValue();
    }
    public static String d(c p0,String p1,String p2){
       return p0.getValue(p1, String.class, p2);
    }
    public static Object e(c p0,String p1,Type p2,Object p3){
       return p3;
    }
}
