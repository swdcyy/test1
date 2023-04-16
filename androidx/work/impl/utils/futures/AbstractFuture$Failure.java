package androidx.work.impl.utils.futures.AbstractFuture$Failure;
import androidx.work.impl.utils.futures.AbstractFuture$Failure$1;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import androidx.work.impl.utils.futures.AbstractFuture;

public final class AbstractFuture$Failure	// class@000a95
{
    public final Throwable a;
    public static final AbstractFuture$Failure b;

    static {
       AbstractFuture$Failure.b = new AbstractFuture$Failure(new AbstractFuture$Failure$1("Failure occurred while trying to finish a future."));
    }
    public void AbstractFuture$Failure(Throwable p0){
       super();
       AbstractFuture.t(p0);
       this.a = p0;
    }
}
