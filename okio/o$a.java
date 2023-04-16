package okio.o$a;
import okio.o;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class o$a extends o	// class@0020fb
{

    public void o$a(){
       super();
    }
    public o deadlineNanoTime(long p0){
       return this;
    }
    public void throwIfReached(){
    }
    public o timeout(long p0,TimeUnit p1){
       a.q(p1, "unit");
       return this;
    }
}
