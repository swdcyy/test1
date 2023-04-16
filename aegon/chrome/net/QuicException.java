package aegon.chrome.net.QuicException;
import aegon.chrome.net.NetworkException;
import java.lang.String;
import java.lang.Throwable;

public abstract class QuicException extends NetworkException	// class@0001a4
{

    public void QuicException(String p0,Throwable p1){
       super(p0, p1);
    }
    public abstract int getQuicDetailedErrorCode();
}
