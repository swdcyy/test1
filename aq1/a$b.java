package aq1.a$b;
import java.lang.Runnable;
import aq1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.airbnb.lottie.LottieAnimationView;
import fq1.d;

public final class a$b implements Runnable	// class@00027b
{
    public final a b;
    public final boolean c;

    public void a$b(a p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       a$b tc = this.c;
       a o = this.b.O;
       if (o == null) {
          a.S("avatarAnimView");
       }
       d.h(tc, o);
       return;
    }
}
