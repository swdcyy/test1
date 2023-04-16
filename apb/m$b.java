package apb.m$b;
import ekd.f$j;
import apb.m;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jqb.c;

public class m$b extends f$j	// class@0002b0
{
    public final View a;
    public final m b;

    public void m$b(m p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$b.class, "1")) {
          return;
       }
       c.b(this.a, false);
       return;
    }
}
