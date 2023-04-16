package i6a.p;
import android.animation.AnimatorListenerAdapter;
import i6a.o;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestLabelsGroup;
import java.util.List;
import i6a.k;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import i6a.p$a;
import android.animation.Animator$AnimatorListener;

public final class p extends AnimatorListenerAdapter	// class@0027a8
{
    public final o a;

    public void p(o p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p.class, "2")) {
          return;
       }
       o.W8(this.a).setClickable(true);
       PatchProxy.onMethodExit(p.class, "2");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p.class, "1")) {
          return;
       }
       this.a.Y8(true);
       p ta = this.a;
       ta.D = ta.D + true;
       p ta1 = this.a;
       o.V8(ta).a(o.S8(this.a).subList(ta1.B, ta1.C));
       QPhoto photo = o.P8(this.a).getPhoto();
       a.o(photo, "mDetailParam.photo");
       BaseFeed entity = photo.getEntity();
       a.o(entity, "mDetailParam.photo.entity");
       p ta2 = this.a;
       k.b.f(entity, o.R8(this.a), o.S8(this.a).subList(ta2.B, ta2.C));
       o.V8(this.a).animate().setDuration(300).scaleX(0x3f800000).scaleY(0x3f800000).setListener(new p$a(this));
       PatchProxy.onMethodExit(p.class, "1");
       return;
    }
}
