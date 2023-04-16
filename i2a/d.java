package i2a.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.nonslide.b;
import com.yxcorp.gifshow.detail.nonslide.b$a;
import java.lang.Object;

public final class d implements Runnable	// class@002768
{
    public final b b;
    public final b$a c;

    public void d(b p0,b$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.c(this.c);
    }
}
