package n9a.s;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class s extends AnimatorListenerAdapter	// class@00311a
{
    public final int a;
    public final NasaFeaturedSeekBar b;

    public void s(NasaFeaturedSeekBar p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       this.b.setProgress(this.a);
       return;
    }
}
