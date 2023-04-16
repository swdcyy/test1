package akd.r;
import java.lang.Runnable;
import com.yxcorp.upgrade.impl.e;
import java.lang.Object;
import zjd.g;

public final class r implements Runnable	// class@00005d
{
    public final e b;
    public final int c;

    public void r(e p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.f.c(this.c);
    }
}
