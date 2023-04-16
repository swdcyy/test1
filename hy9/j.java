package hy9.j;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.common.information.interestadjust.d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import qp7.c;
import qp7.d;
import hy9.l;
import java.util.Objects;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class j extends AnimatorListenerAdapter	// class@00273b
{
    public final d a;

    public void j(d p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       this.a.o.setVisibility(8);
       p0.height = a1.d(0x7f07030d);
       this.a.o.requestLayout();
       l ol = this.a.l();
       Objects.requireNonNull(ol);
       if (!PatchProxy.applyVoid(null, ol, l.class, "5")) {
          ol.c.onNext(Boolean.TRUE);
       }
       return;
    }
}
