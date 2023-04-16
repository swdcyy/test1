package l69.m;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;

public final class m extends AnimatorListenerAdapter	// class@002ca0
{
    public final TextView a;

    public void m(TextView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.a.animate().setListener(null);
       this.a.setPadding(a1.d(R.dimen.arg_RES_7f070307), 0, a1.d(R.dimen.arg_RES_7f07025d), 0);
       this.a.setCompoundDrawablePadding(a1.e(6.00f));
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
       layoutParams.height = a1.e(39.00f);
       this.a.setLayoutParams(layoutParams);
       return;
    }
}
