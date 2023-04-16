package ki9.r;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.camera.record.widget.RecordButton;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;

public class r extends AnimatorListenerAdapter	// class@002c9f
{
    public final RecordButton a;

    public void r(RecordButton p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       n.Y(this.a.p, 0, 0);
       return;
    }
}
