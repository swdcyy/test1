package i0.i;
import android.net.TrafficStats;
import java.lang.Class;
import java.lang.Integer;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Object;

public class i	// class@002154
{
    public static final Method a;
    public static final Method b;

    static {
       try{
          Class[] uClassArray = new Class[]{Integer.TYPE};
          i.a = TrafficStats.class.getMethod("setThreadStatsUid", uClassArray);
          uClassArray = new Class[0];
          i.b = TrafficStats.class.getMethod("clearThreadStatsUid", uClassArray);
       }catch(java.lang.NoSuchMethodException e0){
       }catch(java.lang.SecurityException e0){
       }
       throw new RuntimeException("Unable to get TrafficStats methods", e0);
    }
    public static void a(){
       String str = "TrafficStats.clearThreadStatsUid failed";
       try{
          Object[] objArray = new Object[0];
          i.b.invoke(null, objArray);
          return;
       }catch(java.lang.IllegalAccessException e1){
          throw new RuntimeException(str, e1);
       }catch(java.lang.reflect.InvocationTargetException e1){
          throw new RuntimeException(str, e1);
       }
    }
    public static void b(int p0){
       String str = "TrafficStats.setThreadStatsUid failed";
       try{
          Object[] objArray = new Object[]{Integer.valueOf(p0)};
          i.a.invoke(null, objArray);
          return;
       }catch(java.lang.IllegalAccessException e5){
          throw new RuntimeException(str, e5);
       }catch(java.lang.reflect.InvocationTargetException e5){
          throw new RuntimeException(str, e5);
       }
    }
}
