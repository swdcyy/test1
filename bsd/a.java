package bsd.a;
import java.lang.String;
import java.lang.Throwable;
import java.util.concurrent.CancellationException;

public final class a	// class@0002dd
{

    public static final CancellationException a(String p0,Throwable p1){
       CancellationException uCancellatio = new CancellationException(p0);
       uCancellatio.initCause(p1);
       return uCancellatio;
    }
    public static final CancellationException b(Throwable p0){
       String str = (p0 != null)? p0.toString(): null;
       CancellationException uCancellatio = new CancellationException(str);
       uCancellatio.initCause(p0);
       return uCancellatio;
    }
    public static void c(){
    }
}
