package lv8.c$a$a;
import android.animation.AnimatorListenerAdapter;
import lv8.c$a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;

public class c$a$a extends AnimatorListenerAdapter	// class@002dab
{
    public final int a;
    public final c$a b;

    public void c$a$a(c$a p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a$a.class, "1")) {
          return;
       }
       c$a$a tb = this.b;
       if (tb.f != null) {
          ViewGroup$LayoutParams layoutParams = tb.e.getLayoutParams();
          layoutParams.height = layoutParams.height - this.a;
          c$a e = this.b.e;
          e.setPadding(e.getPaddingLeft(), this.b.e.getPaddingTop(), this.b.e.getPaddingRight(), (this.b.e.getPaddingBottom() - this.a));
          this.b.b.setTranslationY(0);
       }
       return;
    }
}
