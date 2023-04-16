package pm7.g;
import java.lang.Runnable;
import pm7.h;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import com.kwai.robust2.patchmanager.b;

public final class g implements Runnable	// class@0021d8
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       b.i(tb.e(), tb.f());
       File uFile = tb.e();
       b.h(uFile, tb.f());
    }
}
