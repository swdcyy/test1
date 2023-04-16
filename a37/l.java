package a37.l;
import java.lang.Runnable;
import com.kwai.link.extensions.PassThroughTransaction;
import java.lang.Object;

public final class l implements Runnable	// class@000047
{
    public final PassThroughTransaction b;

    public void l(PassThroughTransaction p0){
       this.b = p0;
    }
    public final void run(){
       PassThroughTransaction.q(this.b);
    }
}
