package gha.d;
import io.reactivex.g;
import com.yxcorp.gifshow.model.FollowTabNotify;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.model.FollowTabNotify$TabUserInfo;
import gha.o;
import java.lang.String;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public final class d implements g	// class@002ad4
{
    public final FollowTabNotify b;

    public void d(FollowTabNotify p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       d tb = this.b;
       a.e(tb.mUserInfo.mHeadUrl, new o(p0, tb));
    }
}
