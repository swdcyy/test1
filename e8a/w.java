package e8a.w;
import w4.j;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter;
import java.lang.Object;
import w4.e;
import java.util.Objects;
import com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter$b;
import java.lang.Enum;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.entity.QPhoto;
import com.airbnb.lottie.RenderMode;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.ImageView;
import e8a.e0;
import android.animation.Animator$AnimatorListener;

public final class w implements j	// class@0020e1
{
    public final NasaProfileSideLikePresenter a;
    public final boolean b;

    public void w(NasaProfileSideLikePresenter p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onResult(Object p0){
       w ta = this.a;
       Objects.requireNonNull(ta);
       LikeAnimationEnum dISLIKE_TO_L = (this.b != null)? LikeAnimationEnum.DISLIKE_TO_LIKE: LikeAnimationEnum.LIKE_TO_DISLIKE;
       if (!PatchProxy.applyVoidTwoRefs(dISLIKE_TO_L, p0, ta, NasaProfileSideLikePresenter.class, "13")) {
          int i = NasaProfileSideLikePresenter$b.a[dISLIKE_TO_L.ordinal()];
          if (i != 1) {
             if (i == 2 || (i == 3 || (i == 4 || (i == 5 && (!PatchProxy.applyVoidOneRefs(p0, ta, NasaProfileSideLikePresenter.class, "14") && p0 != null))))) {
                ta.S8();
                ta.r.setComposition(p0);
                p0 = ta.r;
                float f = (ta.u.isLiked())? 0x3f99999a: 0x3f800000;
                p0.setSpeed(f);
                ta.r.setRenderMode(RenderMode.HARDWARE);
                ta.r.k(true);
                p0 = ta.z;
                if (p0 != null && p0.isStarted()) {
                   ta.z.cancel();
                   ta.q.setVisibility(8);
                }
                ta.r.setVisibility(0);
                ta.r.a(new e0(ta));
                ta.r.s();
             }
          }else {
             ta.S8();
          }
       }
       return;
    }
}
