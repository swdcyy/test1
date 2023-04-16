package htd.q$a;
import java.lang.Throwable;
import java.lang.Object;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import java.lang.String;
import java.lang.IllegalStateException;

public final class q$a	// class@000fd8
{
    public final Throwable a;

    public void q$a(Throwable p0){
       super();
       this.a = p0;
    }
    public final Throwable a(){
       q$a ta = this.a;
       if (ta != null) {
       }else {
          ta = new ClosedSendChannelException("Channel was closed");
       }
       return ta;
    }
    public final Throwable b(){
       q$a ta = this.a;
       if (ta != null) {
       }else {
          ta = new IllegalStateException("Channel was closed");
       }
       return ta;
    }
}
