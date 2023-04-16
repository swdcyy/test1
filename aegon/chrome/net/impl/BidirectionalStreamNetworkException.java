package aegon.chrome.net.impl.BidirectionalStreamNetworkException;
import aegon.chrome.net.impl.NetworkExceptionImpl;
import java.lang.String;

public class BidirectionalStreamNetworkException extends NetworkExceptionImpl	// class@0001b9
{
    public static final boolean $assertionsDisabled;

    static {
    }
    public void BidirectionalStreamNetworkException(String p0,int p1,int p2){
       super(p0, p1, p2);
    }
    public boolean immediatelyRetryable(){
       NetworkExceptionImpl tmCronetInte = this.mCronetInternalErrorCode;
       if (tmCronetInte != -358 && tmCronetInte != -352) {
          return super.immediatelyRetryable();
       }
       return true;
    }
}
