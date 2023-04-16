package kotlinx.coroutines.flow.internal.AbortFlowException;
import java.util.concurrent.CancellationException;
import jtd.e;
import java.lang.String;
import java.lang.Throwable;
import java.lang.StackTraceElement;

public final class AbortFlowException extends CancellationException	// class@001b04
{
    public final e owner;

    public void AbortFlowException(e p0){
       super("Flow was aborted, no more elements needed");
       this.owner = p0;
    }
    public Throwable fillInStackTrace(){
       StackTraceElement[] stackTraceEl = new StackTraceElement[0];
       this.setStackTrace(stackTraceEl);
       return this;
    }
    public final e getOwner(){
       return this.owner;
    }
}
