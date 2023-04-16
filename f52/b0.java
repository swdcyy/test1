package f52.b0;
import erd.g;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.n;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import f52.e0;
import android.animation.Animator$AnimatorListener;

public final class b0 implements g	// class@002880
{
    public final n b;
    public final boolean c;

    public void b0(n p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b0 tb = this.b;
       b0 tc = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(n.class) || (!PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(tc), tb, n.class, "13") && tc == null)) {
          int i = 0;
          if (p0.isFollowingOrFollowRequesting()) {
             if (!PatchProxy.applyVoid(null, tb, n.class, "15") && tb.v == null) {
                tb.v = true;
                tb.t.setVisibility(i);
                tb.t.t();
                tb.t.setAnimation(R.raw.arg_RES_7f0f0039);
                tb.t.setProgress(0);
                tb.t.a(new e0(tb));
                tb.t.s();
             }
          }else if(PatchProxy.applyVoid(null, tb, n.class, "14")){
             tb.t.f();
             tb.t.setProgress(0);
             tb.t.setVisibility(i);
          }
       }
       return;
    }
}
