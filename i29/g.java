package i29.g;
import erd.g;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.rightactionbar.like.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import kp.r1;

public final class g implements g	// class@002628
{
    public final AdLikeElement b;

    public void g(AdLikeElement p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       tb.n0();
       tb.E().k(tb.u.numberOfLike(), r1.g1(tb.u.mEntity, R.string.arg_RES_7f101cb7, "like_new"), tb.u.isMine());
       p0 = tb.E();
       p0.i(tb.u.isLiked());
    }
}
