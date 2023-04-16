package j89.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.apm.ApmTracker;
import java.lang.Object;

public final class d implements Runnable	// class@0027a6
{
    public final ApmTracker b;

    public void d(ApmTracker p0){
       this.b = p0;
    }
    public final void run(){
       ApmTracker.d(this.b);
    }
}
