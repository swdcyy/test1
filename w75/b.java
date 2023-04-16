package w75.b;
import java.lang.Runnable;
import com.kwai.chat.kwailink.net.SignalStrengthsHandler;
import java.lang.Object;

public final class b implements Runnable	// class@002721
{
    public final SignalStrengthsHandler b;

    public void b(SignalStrengthsHandler p0){
       this.b = p0;
    }
    public final void run(){
       SignalStrengthsHandler.a(this.b);
    }
}
