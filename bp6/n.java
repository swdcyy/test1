package bp6.n;
import java.lang.Runnable;
import com.kwai.imsdk.internal.o;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Object;
import java.lang.String;
import com.kwai.imsdk.internal.client.i;

public final class n implements Runnable	// class@00053e
{
    public final o b;
    public final KwaiMsg c;

    public void n(o p0,KwaiMsg p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i.t(this.b.g).L(this.c);
    }
}
