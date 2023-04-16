package okhttp3.internal.connection.RouteException;
import java.lang.RuntimeException;
import java.io.IOException;
import java.lang.Throwable;
import okhttp3.internal.Util;

public final class RouteException extends RuntimeException	// class@0020ad
{
    public IOException firstException;
    public IOException lastException;

    public void RouteException(IOException p0){
       super(p0);
       this.firstException = p0;
       this.lastException = p0;
    }
    public void addConnectException(IOException p0){
       Util.addSuppressedIfPossible(this.firstException, p0);
       this.lastException = p0;
    }
    public IOException getFirstConnectException(){
       return this.firstException;
    }
    public IOException getLastConnectException(){
       return this.lastException;
    }
}
