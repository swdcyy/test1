package cl9.n2;
import android.animation.AnimatorListenerAdapter;
import cl9.o2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import android.view.View;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import fk9.b;
import com.kuaishou.android.model.mix.QComment;

public class n2 extends AnimatorListenerAdapter	// class@00064d
{
    public final o2 a;

    public void n2(o2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n2.class, "1")) {
          return;
       }
       n2 ta = this.a;
       ta.p.setBackgroundDrawable(ta.s);
       this.a.r.g7().v1(null);
       return;
    }
}
