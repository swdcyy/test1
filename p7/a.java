package p7.a;
import java.lang.Runnable;
import com.android.kwai.foundation.network.core.progress.request.RequestProgressBody$ByteSink;
import java.lang.Object;

public final class a implements Runnable	// class@0028c6
{
    public final RequestProgressBody$ByteSink b;
    public final long c;

    public void a(RequestProgressBody$ByteSink p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       RequestProgressBody$ByteSink.a(this.b, this.c);
    }
}
