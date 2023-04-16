package i6a.g$a;
import android.animation.AnimatorListenerAdapter;
import i6a.g;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i6a.f;
import android.widget.TextView;
import java.util.List;
import i6a.k;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;

public final class g$a extends AnimatorListenerAdapter	// class@002797
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$a.class, "2")) {
          return;
       }
       f.P8(this.a.a).setClickable(true);
       PatchProxy.onMethodExit(g$a.class, "2");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$a.class, "1")) {
          return;
       }
       f.P8(this.a.a).setClickable(true);
       g a = this.a.a;
       QPhoto photo = f.R8(this.a.a).getPhoto();
       a.o(photo, "mDetailParam.photo");
       BaseFeed entity = photo.getEntity();
       a.o(entity, "mDetailParam.photo.entity");
       int i = (a.I % (f.V8(a).size() / 2)) * 2;
       k.b.e(entity, f.S8(this.a.a), f.V8(this.a.a).subList(i, (i + 2)));
       PatchProxy.onMethodExit(g$a.class, "1");
       return;
    }
}
