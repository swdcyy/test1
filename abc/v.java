package abc.v;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.intimate.dialog.p;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import abc.c0;
import android.animation.Animator$AnimatorListener;
import abc.d0;
import h2.f;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import h2.b;
import h2.c;
import h2.g;

public final class v implements Runnable	// class@0000e1
{
    public final p b;

    public void v(p p0){
       this.b = p0;
    }
    public final void run(){
       v tb = this.b;
       Objects.requireNonNull(tb);
       p op = p.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, op, "16")) {
       }else if(tb.n.p() || tb.o.p()){
          tb.n.s();
          tb.n.a(new c0(tb));
          tb.o.s();
          tb.o.a(new d0(tb));
       }
       if (!PatchProxy.applyVoid(objArray, tb, op, "15")) {
          tb.q = new f(tb.c, b.p);
          tb.r = new f(tb.c, b.q);
          g og = new g();
          og.g(320.86f);
          og.e(0x3f000000);
          tb.q.l(0);
          tb.r.l(0);
          tb.q.t(og);
          tb.r.t(og);
          tb.q.q(0x3f800000);
          tb.r.q(0x3f800000);
       }
       return;
    }
}
