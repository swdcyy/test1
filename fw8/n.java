package fw8.n;
import android.os.MessageQueue$IdleHandler;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.activity.BasePostActivity;

public final class n implements MessageQueue$IdleHandler	// class@002364
{
    public final Runnable a;

    public void n(Runnable p0){
       this.a = p0;
    }
    public final boolean queueIdle(){
       this.a.run();
       return false;
    }
}
