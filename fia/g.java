package fia.g;
import android.animation.AnimatorListenerAdapter;
import fia.f;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import xl8.b;
import cia.w;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.animation.ObjectAnimator;

public final class g extends AnimatorListenerAdapter	// class@00290c
{
    public final f a;

    public void g(f p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationEnd(p0);
       f s = this.a.s;
       if (s != null) {
          s.d(Boolean.FALSE);
       }
       SlidePlayViewModel slidePlayVie = this.a.R8().O();
       if (slidePlayVie != null) {
          slidePlayVie.d(true, 2);
       }
       PatchProxy.onMethodExit(g.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       Boolean tRUE = Boolean.TRUE;
       this.a.V8().d(tRUE);
       f s = this.a.s;
       if (s != null) {
          s.d(tRUE);
       }
       if (this.a.P8()) {
          s = this.a.G;
          if (s == null) {
             a.S("mBottomEditorDownAnimator");
          }
          s.start();
       }
       PatchProxy.onMethodExit(g.class, "1");
       return;
    }
}
