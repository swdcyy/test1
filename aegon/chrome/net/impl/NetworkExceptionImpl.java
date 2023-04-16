package aegon.chrome.net.impl.NetworkExceptionImpl;
import aegon.chrome.net.NetworkException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.StringBuilder;

public class NetworkExceptionImpl extends NetworkException	// class@0001d3
{
    public final int mCronetInternalErrorCode;
    public final int mErrorCode;
    public static final boolean $assertionsDisabled;

    static {
    }
    public void NetworkExceptionImpl(String p0,int p1,int p2){
       super(p0, null);
       this.mErrorCode = p1;
       this.mCronetInternalErrorCode = p2;
    }
    public int getCronetInternalErrorCode(){
       return this.mCronetInternalErrorCode;
    }
    public int getErrorCode(){
       return this.mErrorCode;
    }
    public String getMessage(){
       StringBuilder str = super.getMessage()+", ErrorCode="+this.mErrorCode;
       if (this.mCronetInternalErrorCode != null) {
          str = str+", InternalErrorCode="+this.mCronetInternalErrorCode;
       }
       return str+", Retryable="+this.immediatelyRetryable();
    }
    public boolean immediatelyRetryable(){
       NetworkExceptionImpl tmErrorCode = this.mErrorCode;
       if (tmErrorCode != 3 && (tmErrorCode != 4 && (tmErrorCode != 5 && (tmErrorCode != 6 && tmErrorCode != 8)))) {
          return false;
       }
       return true;
    }
}
