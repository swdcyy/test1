package ftd.l1;
import java.lang.String;
import java.lang.Throwable;
import java.util.concurrent.CancellationException;
import qrd.i;

public final class l1	// class@000ea5
{

    public static final CancellationException a(String p0,Throwable p1){
       CancellationException uCancellatio = new CancellationException(p0);
       uCancellatio.initCause(p1);
       return uCancellatio;
    }
    public static final void b(Throwable p0,Throwable p1){
       i.a(p0, p1);
    }
}
