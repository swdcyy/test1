package go1.q;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ProgressBar;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import io1.a;
import android.widget.TextView;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;

public class q extends AnimatorListenerAdapter	// class@00253f
{
    public final i a;

    public void q(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.C.setVisibility(8);
       a.a(this.a.U.a(), "FINISH");
       this.a.E.setVisibility(0);
       this.a.E.setText(R.string.arg_RES_7f10256b);
       ObjectAnimator.ofFloat(this.a.E, View.ALPHA, new float[2]{0,0x3f800000}).setDuration(100).start();
       return;
    }
}
