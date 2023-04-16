package ced.r;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.plugin.search.result.hashtag.presenters.h;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class r extends AnimatorListenerAdapter	// class@00057a
{
    public final h a;

    public void r(h p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       this.a.z.setImageResource(R.drawable.arg_RES_7f0809f1);
       return;
    }
}
