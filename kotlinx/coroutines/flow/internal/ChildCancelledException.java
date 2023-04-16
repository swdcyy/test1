package kotlinx.coroutines.flow.internal.ChildCancelledException;
import java.util.concurrent.CancellationException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.StackTraceElement;

public final class ChildCancelledException extends CancellationException	// class@001b15
{

    public void ChildCancelledException(){
       super("Child of the scoped flow was cancelled");
    }
    public Throwable fillInStackTrace(){
       StackTraceElement[] stackTraceEl = new StackTraceElement[0];
       this.setStackTrace(stackTraceEl);
       return this;
    }
}
