package ph5.k;
import android.os.MessageQueue$IdleHandler;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;

public class k implements MessageQueue$IdleHandler	// class@003609
{
    public Handler a;

    public void k(){
       super();
       this.a = new Handler(Looper.getMainLooper());
    }
    public boolean queueIdle(){
       return false;
    }
}
