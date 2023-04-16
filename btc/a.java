package btc.a;
import p79.h;
import btc.a$a;
import nsd.u;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import th0.e;
import android.animation.TimeInterpolator;
import btc.a$b;
import android.animation.Animator$AnimatorListener;

public final class a extends h	// class@00048a
{
    public float v;
    public float w;
    public static final a$a x;

    static {
       a.x = new a$a(null);
    }
    public void a(){
       super();
    }
    public void Q(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "view");
       p0.setAlpha(0x3f800000);
       p0.setScaleX(0x3f800000);
       p0.setScaleY(0x3f800000);
       return;
    }
    public ViewPropertyAnimator V(RecyclerView$ViewHolder p0,View p1,ViewPropertyAnimator p2,ArrayList p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "holder");
       a.p(p1, "view");
       a.p(p2, "animation");
       a.p(p3, "animations");
       p1.setPivotX(this.v);
       p1.setPivotY(this.w);
       a$b uob = new a$b(this, p0, p2, p1, p3);
       p2.alpha(0).scaleX(0).scaleY(0).setDuration((long)300).setInterpolator(new e()).setListener(v7);
       return p2;
    }
}
