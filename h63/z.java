package h63.z;
import android.animation.Animator$AnimatorListener;
import h63.y;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import y43.a;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import e63.k1;

public class z implements Animator$AnimatorListener	// class@002caa
{
    public final y a;

    public void z(y p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
          return;
       }
       this.a.Z8();
       if (!TextUtils.n(QCurrentUser.me().getId(), this.a.q.Q().getUser().getId())) {
          k1.b(this.a.S8(), this.a.r.a());
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
