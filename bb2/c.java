package bb2.c;
import ok.o;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public final class c implements o	// class@0003c4
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = (p0 != null && p0.mEntity instanceof LiveStreamFeed)? true: false;
       return b;
    }
}
