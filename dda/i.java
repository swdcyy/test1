package dda.i;
import m66.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;

public final class i extends a	// class@00248e
{
    public final String d;
    public final int e;
    public final boolean f;

    public void i(BaseFeed p0,String p1){
       super(p0, p1, 0);
    }
    public void i(BaseFeed p0,String p1,int p2){
       super(p0, p1, p2, false);
    }
    public void i(BaseFeed p0,String p1,int p2,boolean p3){
       super(p0);
       this.d = p1;
       this.e = p2;
       this.f = p3;
    }
}
