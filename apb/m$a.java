package apb.m$a;
import ekd.f$j;
import apb.m;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jqb.c;

public class m$a extends f$j	// class@0002af
{
    public final View a;
    public final m b;

    public void m$a(m p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       c.b(this.a, true);
       return;
    }
}
