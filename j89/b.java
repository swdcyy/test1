package j89.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.apm.ApmTracker;
import java.lang.Object;

public final class b implements Runnable	// class@0027a5
{
    public final ApmTracker b;

    public void b(ApmTracker p0){
       this.b = p0;
    }
    public final void run(){
       ApmTracker.a(this.b);
    }
}
