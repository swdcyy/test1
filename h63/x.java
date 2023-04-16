package h63.x;
import java.lang.Runnable;
import h63.y;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import s77.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import e63.k1;

public final class x implements Runnable	// class@002ca6
{
    public final y b;
    public final int c;

    public void x(y p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       x tb = this.b;
       k1.a(tb.r.b(), false, this.c, a.a(tb.r), tb.r.a());
    }
}
