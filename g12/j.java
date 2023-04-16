package g12.j;
import ok.o;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public final class j implements o	// class@002a2e
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = (p0 != null && p0.mEntity instanceof LiveStreamFeed)? true: false;
       return b;
    }
}
