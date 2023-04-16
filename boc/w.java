package boc.w;
import java.lang.Runnable;
import boc.b;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.n;

public final class w implements Runnable	// class@000452
{
    public final b b;
    public final float c;

    public void w(b p0,float p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       n.h(this.b, this.c);
    }
}
