package bq1.a$b;
import java.lang.Runnable;
import bq1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import kotlin.jvm.internal.a;
import com.airbnb.lottie.LottieAnimationView;
import fq1.d;

public final class a$b implements Runnable	// class@0003dc
{
    public final a b;
    public final boolean c;

    public void a$b(a p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b.class, "1")) {
          return;
       }
       a$b tc = this.c;
       a$b tb = this.b;
       Objects.requireNonNull(tb);
       a uoa = PatchProxy.apply(objArray, tb, a.class, "3");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = tb.Q;
          if (uoa == null) {
             a.S("avatarAnimView");
          }
       }
       d.h(tc, uoa);
       return;
    }
}
