package a76.l;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kwai.framework.init.e;
import a76.b;

public final class l implements Runnable	// class@00002a
{
    public final Runnable b;
    public final String c;
    public final boolean d;

    public void l(Runnable p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       e.g.f(this.b, this.c, this.d);
    }
}
