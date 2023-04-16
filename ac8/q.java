package ac8.q;
import java.lang.Runnable;
import com.mini.js.jsapi.ui.s;
import com.mini.js.jsapi.ui.bean.NavigationBarColorParameters;
import ja8.c;
import ja8.e;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import com.mini.js.jsapi.ui.bean.NavigationBarColorParameters$Animation;
import mc8.c;
import na8.a;
import ma8.g;
import ma8.i;
import com.mini.js.helper.a;

public final class q implements Runnable	// class@00006f
{
    public final s b;
    public final NavigationBarColorParameters c;
    public final c d;
    public final e e;

    public void q(s p0,NavigationBarColorParameters p1,c p2,e p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       q tb = this.b;
       q tc = this.c;
       q td = this.d;
       q te = this.e;
       Objects.requireNonNull(tb);
       NavigationBarColorParameters animation = tc.animation;
       LinearInterpolator linearInterp = PatchProxy.applyOneRefs(animation, null, s.class, "1");
       if (linearInterp != PatchProxyResult.class) {
       }else if(animation == null){
          linearInterp = new LinearInterpolator();
       }else {
          linearInterp = c.a(animation.timingFunc);
       }
       tb.b.h().s0(tc.frontColor, tc.backgroundColor, tc.animation.duration, linearInterp);
       td.a(a.c(te, true));
       return;
    }
}
