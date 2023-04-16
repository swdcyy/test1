package boc.r;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.resource.n$c;
import boc.b;
import java.lang.Object;

public final class r implements Runnable	// class@00044d
{
    public final n$c b;
    public final b c;

    public void r(n$c p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.a(this.c);
    }
}
