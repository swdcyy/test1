package h22.v;
import ekd.f$j;
import com.kuaishou.live.core.show.activityredpacket.o;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ImageView;

public class v extends f$j	// class@002c11
{
    public final o a;

    public void v(o p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       this.a.x.setAlpha(0x3f800000);
       this.a.x.setVisibility(8);
       this.a.G.setAlpha(0x3f800000);
       this.a.G.setVisibility(8);
       return;
    }
}
