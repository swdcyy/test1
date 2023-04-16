package ftd.l3;
import java.lang.Runnable;
import ltd.a0;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import java.lang.String;
import java.lang.StringBuilder;
import ftd.a;
import ftd.z1;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import java.lang.Throwable;
import kotlinx.coroutines.JobSupport;

public final class l3 extends a0 implements Runnable	// class@000ea7
{
    public final long f;

    public void l3(long p0,c p1){
       super(p1.getContext(), p1);
       this.f = p0;
    }
    public String M0(){
       return super.M0()+"\(timeMillis="+this.f+')';
    }
    public void run(){
       this.b0(TimeoutKt.a(this.f, this));
    }
}
