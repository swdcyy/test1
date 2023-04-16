package kuaishou.perf.page.impl.PostPageData;
import java.io.Serializable;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import android.os.SystemClock;
import java.lang.StringBuilder;
import android.util.Pair;
import java.lang.Long;

public class PostPageData implements Serializable	// class@001be9
{
    public Map args;
    public Map pageStages;
    public String scene;
    public Map stage;
    public int stageIndex;
    public long startTimes;
    public long totalCost;
    public String type;

    public void PostPageData(){
       super();
       this.args = new ConcurrentHashMap();
       this.stage = new ConcurrentHashMap();
       this.pageStages = new ConcurrentHashMap();
       this.stageIndex = 0;
    }
    public void addArg(String p0,String p1){
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          this.args.put(p0, p1);
       }
       return;
    }
    public void addArg(Map p0){
       if (p0 != null && !p0.isEmpty()) {
          this.args.putAll(p0);
       }
       return;
    }
    public void end(){
       this.totalCost = SystemClock.uptimeMillis() - this.startTimes;
    }
    public boolean isValid(){
       boolean b = (!TextUtils.isEmpty(this.scene) && this.startTimes > 0)? true: false;
       return b;
    }
    public void recordStageBegin(String p0){
       if (!TextUtils.isEmpty(p0)) {
          if (!this.stage.containsKey(p0)) {
             int i = this.stageIndex + 1;
             this.stageIndex = i;
             this.pageStages.put("stage"+i, p0);
          }
          this.stage.put(p0, new Pair(Long.valueOf(SystemClock.uptimeMillis()), Long.valueOf(-1)));
          if (this.startTimes <= 0) {
             this.startTimes = SystemClock.uptimeMillis();
          }
       }
       return;
    }
    public boolean recordStageEnd(String p0){
       Pair pair = this.stage.get(p0);
       if (pair == null) {
          return false;
       }
       this.stage.put(p0, new Pair(pair.first, Long.valueOf(SystemClock.uptimeMillis())));
       return true;
    }
    public void reset(){
       this.args.clear();
       this.stage.clear();
       this.type = "";
       this.startTimes = 0;
       this.totalCost = 0;
       this.stageIndex = 0;
    }
    public void start(){
       if (this.startTimes <= 0) {
          this.startTimes = SystemClock.uptimeMillis();
       }
       return;
    }
}
