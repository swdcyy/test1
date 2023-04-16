package f5b.k;
import ekd.f$j;
import android.view.View;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.widget.AnimTranslationDrawableView;
import s5b.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class k extends f$j	// class@0028b0
{
    public final View a;
    public final Ref$ObjectRef b;

    public void k(View p0,Ref$ObjectRef p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       n.Y(this.a, 0, 0);
       n.Y(this.b.element, 4, 0);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       n.Y(this.a, 4, false);
       n.Y(this.b.element, false, false);
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("is_shown_magic_search_guide", true);
       g.a(uEditor);
       return;
    }
}
