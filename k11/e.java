package k11.e;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.animation.Animator;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import lnc.a1;
import android.animation.ObjectAnimator;
import k11.f;
import android.animation.Animator$AnimatorListener;

public final class e implements Runnable	// class@002c60
{
    public final a b;

    public void e(a p0){
       this.b = p0;
    }
    public final void run(){
       ObjectAnimator objectAnimat;
       e tb = this.b;
       Objects.requireNonNull(tb);
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, tb, uoa, "5")) {
       }else {
          int measuredWidt = tb.d.getMeasuredWidth();
          if (!measuredWidt) {
             tb.f();
             b.d0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "LocalLikeFinish", "MessageContainerViewWidth", Integer.valueOf(tb.d.getMeasuredWidth()), "MessageContainerViewHeight", Integer.valueOf(tb.d.getMeasuredHeight()));
          }else {
             tb.d.setPivotX(0);
             float f = (float)measuredWidt;
             if (PatchProxy.isSupport(uoa)) {
                objectAnimat = PatchProxy.applyOneRefs(Float.valueOf(f), tb, uoa, "7");
                if (objectAnimat != PatchProxyResult.class) {
                label_0090 :
                   objectAnimat.addListener(new f(tb));
                   objectAnimat.start();
                }
             }
             float[] uofloatArray = new float[]{0x3f800000,(float)a1.e(148.00f) / f};
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray)};
             objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tb.d, propertyValu);
             objectAnimat.setDuration(300);
             goto label_0090 ;
          }
       }
       return;
    }
}
