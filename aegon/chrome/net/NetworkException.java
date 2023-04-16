package aegon.chrome.net.NetworkException;
import aegon.chrome.net.CronetException;
import java.lang.String;
import java.lang.Throwable;

public abstract class NetworkException extends CronetException	// class@00019d
{

    public void NetworkException(String p0,Throwable p1){
       super(p0, p1);
    }
    public abstract int getCronetInternalErrorCode();
    public abstract int getErrorCode();
    public abstract boolean immediatelyRetryable();
}
