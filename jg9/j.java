package jg9.j;
import ekd.f$j;
import jg9.f;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.camera.record.base.b;
import zg9.b;
import android.view.View;
import com.yxcorp.utility.n;

public final class j extends f$j	// class@002a9f
{
    public final f a;
    public final boolean b;

    public void j(f p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, j.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0, p1);
       this.a.b().m(new b());
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       if (this.b != null) {
          n.Y(this.a.e, 4, false);
       }else {
          n.Y(this.a.e, false, false);
       }
       return;
    }
}
