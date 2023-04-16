package i29.e;
import erd.g;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement;
import java.lang.Object;
import com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import java.util.Objects;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.rightactionbar.like.b;

public final class e implements g	// class@002626
{
    public final AdLikeElement b;

    public void e(AdLikeElement p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == LikeAnimationEnum.DISLIKE_TO_LIKE) {
          tb.p0();
          tb.E().i(true);
       }else if(p0 == LikeAnimationEnum.LIKE_TO_DISLIKE){
          tb.q0();
          tb.E().i(false);
       }
       return;
    }
}
