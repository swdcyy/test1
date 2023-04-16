package fia.h;
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
import bia.k;
import android.animation.ObjectAnimator;

public final class h extends AnimatorListenerAdapter	// class@00290e
{
    public final f a;

    public void h(f p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationEnd(p0);
       f t = this.a.t;
       if (t != null) {
          t.d(Boolean.FALSE);
       }
       SlidePlayViewModel slidePlayVie = this.a.R8().O();
       if (slidePlayVie != null) {
          slidePlayVie.d(true, 2);
       }
       this.a.V8().d(Boolean.FALSE);
       PatchProxy.onMethodExit(h.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       f t = this.a.t;
       if (t != null) {
          t.d(Boolean.TRUE);
       }
       SlidePlayViewModel slidePlayVie = this.a.R8().O();
       a.m(slidePlayVie);
       a.o(slidePlayVie, "mFollowSlideInjectAdapter.slidePlayViewModel!!");
       if (!k.a(slidePlayVie) && this.a.P8()) {
          t = this.a.F;
          if (t == null) {
             a.S("mBottomEditorUpAnimator");
          }
          t.start();
       }
       PatchProxy.onMethodExit(h.class, "1");
       return;
    }
}
