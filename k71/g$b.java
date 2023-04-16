package k71.g$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class g$b	// class@002cb0
{
    public final boolean isTimerTaskProcessing;
    public final long timerTaskStageMS;
    public final int timerTaskStageStatus;
    public final int widgetStatus;

    public void g$b(){
       super(false, 0, 0, 0);
    }
    public void g$b(boolean p0,long p1,int p2,int p3){
       super();
       this.isTimerTaskProcessing = p0;
       this.timerTaskStageMS = p1;
       this.timerTaskStageStatus = p2;
       this.widgetStatus = p3;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof g$b && (this.isTimerTaskProcessing == p0.isTimerTaskProcessing && (!this.timerTaskStageMS - p0.timerTaskStageMS && (this.timerTaskStageStatus == p0.timerTaskStageStatus && this.widgetStatus == p0.widgetStatus))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       g$b obj = PatchProxy.apply(null, this, g$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.isTimerTaskProcessing;
       if (obj != null) {
          i = 1;
       }
       g$b ttimerTaskSt = this.timerTaskStageMS;
       return ((((((i * 31) + (int)(ttimerTaskSt ^ (ttimerTaskSt >> 32))) * 31) + this.timerTaskStageStatus) * 31) + this.widgetStatus);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(isTimerTaskProcessing="+this.isTimerTaskProcessing+", timerTaskStageMS="+this.timerTaskStageMS+", timerTaskStageStatus="+this.timerTaskStageStatus+", widgetStatus="+this.widgetStatus+"\)";
    }
}
