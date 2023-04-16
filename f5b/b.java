package f5b.b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.widget.AnimTranslationDrawableView;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.widget.AnimTranslationDrawableView$b;
import ekd.f$j;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import q87.c;

public final class b extends AnimatorListenerAdapter	// class@0028a4
{
    public final AnimTranslationDrawableView a;
    public final AnimTranslationDrawableView$b b;
    public final f$j c;

    public void b(AnimTranslationDrawableView p0,AnimTranslationDrawableView$b p1,f$j p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().s("AnimTranslationDrawableView", "onAnimationEnd", objArray);
       this.a.l = true;
       b tc = this.c;
       if (tc != null) {
          tc.onAnimationEnd(p0);
       }
       PatchProxy.onMethodExit(b.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().s("AnimTranslationDrawableView", "onAnimationStart", objArray);
       this.a.c();
       b tc = this.c;
       if (tc != null) {
          tc.onAnimationStart(p0);
       }
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
