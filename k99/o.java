package k99.o;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class o extends AnimatorListenerAdapter	// class@002b8a
{
    public final d a;

    public void o(d p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.a.q.setVisibility(4);
       this.a.q.setAlpha(0x3f800000);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.a.q.setVisibility(0);
       return;
    }
}
