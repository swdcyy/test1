package com.smile.gifmaker.thread.statistic.recorders.a;
import com.smile.gifmaker.thread.statistic.recorders.Recordable;
import java.lang.Object;
import com.smile.gifmaker.thread.statistic.recorders.Recordable$RecordStatus;
import android.os.SystemClock;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;
import org.json.JSONObject;
import java.lang.String;
import cm8.a;

public class a implements Recordable	// class@000fd0
{
    public Recordable$RecordStatus a;
    public long b;
    public long c;

    public void a(){
       super();
       this.a = Recordable$RecordStatus.UNINITIATED;
       this.b = 0;
       this.c = 0;
    }
    public void a(){
       this.a = Recordable$RecordStatus.RECORDING;
       this.b = SystemClock.elapsedRealtime();
       this.c = 0;
    }
    public void b(){
       this.a = Recordable$RecordStatus.RECORD_END;
       this.c = SystemClock.elapsedRealtime();
    }
    public long c(){
       if (this.a == Recordable$RecordStatus.RECORD_END) {
          return (this.c - this.b);
       }
       return -1;
    }
    public Recordable$RecordStatus d(){
       return this.a;
    }
    public final JSONObject e(BaseExecutorCell p0){
       JSONObject jSONObject = new JSONObject();
       if (p0 != null) {
          jSONObject.put("maxThreadNum", p0.f());
          _monitor_enter(p0);
          _monitor_exit(p0);
          jSONObject.put("workTime", p0.d);
          _monitor_enter(p0);
          _monitor_exit(p0);
          jSONObject.put("completedTaskCount", p0.e);
       }
       return jSONObject;
    }
    public final JSONObject f(a p0){
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("waitingTime", p0.b);
       jSONObject.put("outputTaskCount", p0.c);
       return jSONObject;
    }
}
