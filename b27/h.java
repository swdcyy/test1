package b27.h;
import java.lang.Runnable;
import com.kwai.library.widget.specific.misc.LoadingCircle;
import java.lang.Object;

public final class h implements Runnable	// class@0003be
{
    public final LoadingCircle b;

    public void h(LoadingCircle p0){
       this.b = p0;
    }
    public final void run(){
       this.b.b();
    }
}
