package a76.k;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kwai.framework.init.e;
import a76.b;

public final class k implements Runnable	// class@000039
{
    public final Runnable b;
    public final String c;

    public void k(Runnable p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e.g.f(this.b, this.c, false);
    }
}
