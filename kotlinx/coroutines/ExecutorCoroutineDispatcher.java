package kotlinx.coroutines.ExecutorCoroutineDispatcher;
import java.io.Closeable;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher$Key;
import nsd.u;
import java.util.concurrent.Executor;

public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable	// class@001cd8
{
    public static final ExecutorCoroutineDispatcher$Key c;

    static {
       ExecutorCoroutineDispatcher.c = new ExecutorCoroutineDispatcher$Key(null);
    }
    public void ExecutorCoroutineDispatcher(){
       super();
    }
    public abstract Executor A();
    public abstract void close();
}
