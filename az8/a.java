package az8.a;
import erd.g;
import com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.t0;
import qp7.u0;
import w19.e;
import com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import io.reactivex.subjects.PublishSubject;

public final class a implements g	// class@000341
{
    public final AdDetailVMFragment b;

    public void a(AdDetailVMFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          this.b.H.d().M.onNext(LikeAnimationEnum.DISLIKE_TO_LIKE);
       }
       return;
    }
}
