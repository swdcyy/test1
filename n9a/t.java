package n9a.t;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class t extends AnimatorListenerAdapter	// class@00311b
{
    public final NasaFeaturedSeekBar a;

    public void t(NasaFeaturedSeekBar p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       this.a.setProgressState(2);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       this.a.setProgressState(2);
       return;
    }
    public void onAnimationStart(Animator p0){
    }
}
