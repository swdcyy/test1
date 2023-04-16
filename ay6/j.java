package ay6.j;
import ay6.k;
import java.lang.String;
import java.lang.Throwable;
import org.json.JSONObject;
import java.lang.Object;
import org.json.JSONException;
import java.lang.Runnable;
import android.os.AsyncTask;

public final class j	// class@0003a8
{

    public static void a(k p0,String p1,Throwable p2,JSONObject p3){
    }
    public static void b(k p0,String p1,String p2){
    }
    public static void c(k p0,String p1,String p2){
    }
    public static void d(k p0,String p1,String p2,Throwable p3){
    }
    public static void e(k p0,String p1,String p2){
    }
    public static boolean f(k p0){
       return false;
    }
    public static void g(k p0,String p1,String p2){
    }
    public static void h(k p0,String p1,String p2){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.putOpt("eventKey", p1);
          jSONObject.putOpt("val", p2);
       }catch(org.json.JSONException e3){
          e3.printStackTrace();
       }
       p0.logCustomEvent("gothamTechCustomEvent", jSONObject.toString());
       return;
    }
    public static void i(k p0,Runnable p1){
       AsyncTask.execute(p1);
    }
    public static void j(k p0,String p1,String p2){
    }
    public static void k(k p0,String p1,String p2,Throwable p3){
    }
}
