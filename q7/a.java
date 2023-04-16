package q7.a;
import java.lang.Runnable;
import com.android.kwai.foundation.network.core.progress.response.ResponseProgressBody$1;
import java.lang.Object;

public final class a implements Runnable	// class@002976
{
    public final ResponseProgressBody$1 b;
    public final long c;

    public void a(ResponseProgressBody$1 p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       ResponseProgressBody$1.a(this.b, this.c);
    }
}
