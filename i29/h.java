package i29.h;
import erd.g;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import uf5.b$a;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.rightactionbar.like.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public final class h implements g	// class@002629
{
    public final AdLikeElement b;

    public void h(AdLikeElement p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, AdLikeElement.class, "13")) {
       }else {
          b$a.j(tb.t);
          tb.E().i(tb.u.isLiked());
          tb.E().k(tb.u.numberOfLike(), r1.g1(tb.u.mEntity, R.string.arg_RES_7f101cb7, "like_new"), tb.u.isMine());
       }
       return;
    }
}
