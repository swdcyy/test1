package j89.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.apm.ApmTracker;
import java.lang.String;
import java.lang.Object;

public final class e implements Runnable	// class@0027a7
{
    public final ApmTracker b;
    public final String c;
    public final int d;

    public void e(ApmTracker p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       ApmTracker.b(this.b, this.c, this.d);
    }
}
