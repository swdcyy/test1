package i2a.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.nonslide.b;
import com.yxcorp.gifshow.detail.nonslide.b$a;
import java.lang.Object;
import java.util.Iterator;
import java.util.Set;
import com.yxcorp.gifshow.detail.nonslide.b$b;

public final class e implements Runnable	// class@002769
{
    public final b b;
    public final b$a c;

    public void e(b p0,b$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tc = this.c;
       Iterator iterator = this.b.f.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(tc);
       }
       return;
    }
}
