package bolts.ExecutorException;
import java.lang.RuntimeException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public class ExecutorException extends RuntimeException	// class@000b57
{

    public void ExecutorException(Exception p0){
       super("An exception was thrown by an Executor", p0);
    }
}
