package j89.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.apm.ApmTracker;
import java.lang.Object;

public final class c implements Runnable	// class@0019c0
{
    public final ApmTracker b;

    public void c(ApmTracker p0){
       this.b = p0;
    }
    public final void run(){
       ApmTracker.c(this.b);
    }
}
