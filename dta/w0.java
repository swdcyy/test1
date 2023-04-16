package dta.w0;
import io.reactivex.g;
import com.yxcorp.gifshow.homepage.kcube.presenter.i;
import com.yxcorp.gifshow.model.FollowTabNotify;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.yxcorp.gifshow.model.FollowTabNotify$TabUserInfo;
import dta.a1;
import java.lang.String;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public final class w0 implements g	// class@002555
{
    public final i b;
    public final FollowTabNotify c;

    public void w0(i p0,FollowTabNotify p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       w0 tb = this.b;
       w0 tc = this.c;
       Objects.requireNonNull(tb);
       a.e(tc.mUserInfo.mHeadUrl, new a1(tb, p0, tc));
    }
}
