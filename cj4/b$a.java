package cj4.b$a;
import android.animation.AnimatorListenerAdapter;
import cj4.b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;

public final class b$a extends AnimatorListenerAdapter	// class@00047b
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       b$a ta = this.a;
       ta.E = null;
       b z = ta.z;
       if (z == null) {
          a.S("mContainer");
       }
       z.setVisibility(8);
       return;
    }
}
