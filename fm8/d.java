package fm8.d;
import com.smile.gifmaker.thread.task.ElasticTask;
import java.lang.String;
import org.json.JSONObject;
import com.smile.gifmaker.thread.task.ElasticTask$Status;
import java.lang.Enum;
import java.lang.Object;
import am8.b;

public class d	// class@001621
{

    public static String a(ElasticTask p0,boolean p1){
       if (p0 == null) {
          return null;
       }
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("status", p0.e().name());
          jSONObject.put("taskName", p0.b());
          jSONObject.put("priority", p0.c());
          jSONObject.put("waitTime", p0.f());
          jSONObject.put("executeTime", p0.d());
          if (p1) {
             jSONObject.put("timeOnQueue", p0.h);
             jSONObject.put("timeOnExecute", p0.i);
             jSONObject.put("timeOnComplete", p0.j);
             if (b.f) {
                jSONObject.put("callerStacktrace", String.valueOf(p0.a()));
             }
          }
          return jSONObject.toString();
       }catch(java.lang.Exception e0){
          return "";
       }
    }
}
