package fm8.c;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;
import org.json.JSONObject;
import java.lang.String;
import java.lang.Object;
import cm8.a;
import java.util.List;
import java.util.Iterator;
import com.smile.gifmaker.thread.task.ElasticTask;

public class c	// class@00231b
{

    public static JSONObject a(BaseExecutorCell p0){
       JSONObject jSONObject = new JSONObject();
       if (p0 != null) {
          jSONObject.put("Status", "working");
          jSONObject.put("WorkingThreadNum", p0.h());
          jSONObject.put("MaxThreadNum", p0.f());
       }
       return jSONObject;
    }
    public static JSONObject b(a p0){
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("TaskNum", p0.a.size());
       Iterator iterator = p0.a.iterator();
       long l = 0;
       while (iterator.hasNext()) {
          l = l + iterator.next().f();
       }
       jSONObject.put("WaitingTime", l);
       return jSONObject;
    }
}
