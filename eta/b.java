package eta.b;
import io.reactivex.g;
import eta.i;
import com.yxcorp.gifshow.model.FollowTabNotify;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.yxcorp.gifshow.model.FollowTabNotify$TabUserInfo;
import eta.j;
import java.lang.String;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public final class b implements g	// class@0027da
{
    public final i b;
    public final FollowTabNotify c;

    public void b(i p0,FollowTabNotify p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       a.e(tc.mUserInfo.mHeadUrl, new j(tb, p0, tc));
    }
}
