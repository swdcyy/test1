package btb.h;
import erd.g;
import btb.i;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.feed.response.PhotoResponse;

public final class h implements g	// class@00046f
{
    public final i b;
    public final List c;

    public void h(i p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tb = this.b;
       tb.m = tb.m + this.c.size();
    }
}
