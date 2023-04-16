package i29.a;
import w4.j;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement;
import java.lang.Object;
import w4.e;
import java.util.Objects;
import com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.rightactionbar.like.b;

public final class a implements j	// class@002622
{
    public final AdLikeElement a;
    public final boolean b;

    public void a(AdLikeElement p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onResult(Object p0){
       a ta = this.a;
       a tb = this.b;
       Objects.requireNonNull(ta);
       LikeAnimationEnum dISLIKE_TO_L = (tb != null)? LikeAnimationEnum.DISLIKE_TO_LIKE: LikeAnimationEnum.LIKE_TO_DISLIKE;
       ta.y = dISLIKE_TO_L;
       b uob = ta.E();
       LikeAnimationEnum dISLIKE_TO_L1 = (tb != null)? LikeAnimationEnum.DISLIKE_TO_LIKE: LikeAnimationEnum.LIKE_TO_DISLIKE;
       uob.j(dISLIKE_TO_L1, p0);
       return;
    }
}
