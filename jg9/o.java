package jg9.o;
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

public final class o extends f$j	// class@002aa9
{
    public final f a;

    public void o(f p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, o.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0, p1);
       this.a.b().m(new b());
       return;
    }
}
