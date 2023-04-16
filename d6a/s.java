package d6a.s;
import ekd.q$b;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import ekd.j;

public final class s implements q$b	// class@001ead
{
    public final PhotoType[] a;

    public void s(PhotoType[] p0){
       this.a = p0;
    }
    public final boolean a(Object p0){
       return j.d(this.a, PhotoType.fromFeed(p0.mEntity));
    }
}
