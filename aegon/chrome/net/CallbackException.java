package aegon.chrome.net.CallbackException;
import aegon.chrome.net.CronetException;
import java.lang.String;
import java.lang.Throwable;

public abstract class CallbackException extends CronetException	// class@000189
{

    public void CallbackException(String p0,Throwable p1){
       super(p0, p1);
    }
}
