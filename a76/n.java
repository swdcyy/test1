package a76.n;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kwai.framework.init.e;
import a76.b;

public final class n implements Runnable	// class@00003b
{
    public final Runnable b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public void n(Runnable p0,String p1,boolean p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       e.g.a(this.b, this.c, this.d, this.e);
    }
}
