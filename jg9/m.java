package jg9.m;
import ekd.f$j;
import jg9.f;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class m extends f$j	// class@002aa5
{
    public final f a;

    public void m(f p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, m.class, "1")) {
          return;
       }
       f e = this.a.e;
       if (e != null) {
          e.setVisibility(4);
       }
       e = this.a.e;
       if (e != null) {
          e.setAlpha(0x3f800000);
       }
       e = this.a.e;
       if (e != null) {
          e.setTranslationY(0);
       }
       PatchProxy.onMethodExit(m.class, "1");
       return;
    }
}
