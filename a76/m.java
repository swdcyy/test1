package a76.m;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kwai.framework.init.e;
import a76.b;

public final class m implements Runnable	// class@00003a
{
    public final Runnable b;
    public final String c;
    public final boolean d;

    public void m(Runnable p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       e.g.e(this.b, this.c, this.d);
    }
}