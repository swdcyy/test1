package bj3.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.playback.log.LivePlaybackLogTag;
import java.util.Locale;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Long;
import android.view.ViewPropertyAnimator;
import bj3.a$a;
import android.animation.Animator$AnimatorListener;
import bj3.a$b;

public final class a	// class@0003d7
{

    public void a(){
       super();
    }
    public static void a(View p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Boolean.valueOf(p2)};
       b.Z(LivePlaybackLogTag.ANIMATION, String.format(Locale.US, "doAnimation\(\) view[%s], isVisible[%b], isLandscape[%b]", objArray));
       if (p1) {
          if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, "2")) {
             a.b(p0, 300);
          }
       }else if(PatchProxy.applyVoidOneRefs(p0, null, a.class, "4")){
          a.c(p0, 300);
       }
       return;
    }
    public static void b(View p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, uoa, "3")) {
          return;
       }
       p0.animate().cancel();
       p0.setEnabled(false);
       if (!p0.getAlpha() - 0x3f800000) {
          p0.setAlpha(0);
       }
       p0.animate().alpha(0x3f800000).setDuration(p1).setListener(new a$a(p0)).start();
       return;
    }
    public static void c(View p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, uoa, "5")) {
          return;
       }
       p0.setEnabled(false);
       p0.animate().alpha(0).setDuration(p1).setListener(new a$b(p0)).start();
       return;
    }
}
