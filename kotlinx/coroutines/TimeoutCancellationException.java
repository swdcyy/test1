package kotlinx.coroutines.TimeoutCancellationException;
import ftd.e0;
import java.util.concurrent.CancellationException;
import java.lang.String;
import ftd.z1;
import java.lang.Throwable;

public final class TimeoutCancellationException extends CancellationException implements e0	// class@00192c
{
    public final z1 coroutine;

    public void TimeoutCancellationException(String p0){
       super(p0, null);
    }
    public void TimeoutCancellationException(String p0,z1 p1){
       super(p0);
       this.coroutine = p1;
    }
    public Throwable createCopy(){
       return this.createCopy();
    }
    public TimeoutCancellationException createCopy(){
       String message = this.getMessage();
       if (message != null) {
       }else {
          message = "";
       }
       TimeoutCancellationException timeoutCance = new TimeoutCancellationException(message, this.coroutine);
       timeoutCance.initCause(this);
       return timeoutCance;
    }
}
