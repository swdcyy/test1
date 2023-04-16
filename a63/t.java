package a63.t;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class t extends AnimatorListenerAdapter	// class@000064
{
    public final n a;

    public void t(n p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       this.a.x.finish();
       return;
    }
}
