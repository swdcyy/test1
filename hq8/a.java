package hq8.a;
import java.lang.Runnable;
import java.util.List;
import java.lang.Object;
import org.json.JSONObject;
import com.google.gson.Gson;
import java.lang.String;
import no8.e;
import oo8.r;
import java.lang.Throwable;
import zp8.a;

public final class a implements Runnable	// class@0025d7
{
    public final List b;

    public void a(List p0){
       this.b = p0;
    }
    public final void run(){
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("timerData", new Gson().q(this.b));
       e.b().i.report("tk_timer_event", jSONObject.toString());
       return;
    }
}
