package ar7.d;
import android.animation.AnimatorListenerAdapter;
import ar7.j;
import eh5.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d extends AnimatorListenerAdapter	// class@00034a
{
    public final j a;
    public final int b;
    public final int c;
    public final a d;

    public void d(j p0,int p1,int p2,a p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "1")) {
          return;
       }
       this.a.z(this.c, 0x3f800000);
       d td = this.d;
       if (td != null) {
          td.apply();
       }
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
