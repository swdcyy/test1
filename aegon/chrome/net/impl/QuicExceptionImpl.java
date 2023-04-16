package aegon.chrome.net.impl.QuicExceptionImpl;
import aegon.chrome.net.QuicException;
import java.lang.String;
import java.lang.Throwable;
import aegon.chrome.net.impl.NetworkExceptionImpl;
import java.lang.StringBuilder;

public class QuicExceptionImpl extends QuicException	// class@0001d4
{
    public final NetworkExceptionImpl mNetworkException;
    public final int mQuicDetailedErrorCode;

    public void QuicExceptionImpl(String p0,int p1,int p2,int p3){
       super(p0, null);
       this.mNetworkException = new NetworkExceptionImpl(p0, p1, p2);
       this.mQuicDetailedErrorCode = p3;
    }
    public int getCronetInternalErrorCode(){
       return this.mNetworkException.getCronetInternalErrorCode();
    }
    public int getErrorCode(){
       return this.mNetworkException.getErrorCode();
    }
    public String getMessage(){
       return this.mNetworkException.getMessage()+", QuicDetailedErrorCode="+this.mQuicDetailedErrorCode;
    }
    public int getQuicDetailedErrorCode(){
       return this.mQuicDetailedErrorCode;
    }
    public boolean immediatelyRetryable(){
       return this.mNetworkException.immediatelyRetryable();
    }
}
