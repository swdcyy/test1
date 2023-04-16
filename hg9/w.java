package hg9.w;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.camera.record.photo.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class w extends AnimatorListenerAdapter	// class@00267e
{
    public final i a;

    public void w(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.p.setClickable(true);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.p.setClickable(true);
       return;
    }
    public void onAnimationPause(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "4")) {
          return;
       }
       super.onAnimationPause(p0);
       this.a.p.setClickable(true);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "3")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.p.setClickable(false);
       return;
    }
}
