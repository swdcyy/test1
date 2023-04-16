package c9d.h$b$a;
import ekd.f$j;
import c9d.h$b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c9d.h;
import c9d.i;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;

public class h$b$a extends f$j	// class@000505
{
    public final h$b a;

    public void h$b$a(h$b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b$a.class, "1")) {
          return;
       }
       this.a.c.c.C.setVisibility(8);
       this.a.c.c.D.setVisibility(0);
       this.a.c.c.z.n0(R.string.arg_RES_7f104509);
       p0.M = "B";
       return;
    }
}
