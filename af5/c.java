package af5.c;
import java.lang.Runnable;
import af5.a$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import java.lang.Object;
import af5.a;

public final class c implements Runnable	// class@000091
{
    public final a$b b;
    public final ClientEvent$ShowEvent c;

    public void c(a$b p0,ClientEvent$ShowEvent p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.a.R8(this.c);
    }
}
