package kt1.g;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimVC;
import kt1.h;
import java.lang.Object;
import kt1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import pu1.d;
import kt1.f;
import hc.b;
import ht1.a;

public final class g implements Observer	// class@002df8
{
    public final LiveMultiPkGameAnimVC b;
    public final h c;

    public void g(LiveMultiPkGameAnimVC p0,h p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          LiveMultiPkGameAnimVC.V2(this.b).setVisibility(0);
          LiveMultiPkGameAnimVC.V2(this.b).setController(null);
          g tb = this.b;
          tb.n.c(LiveMultiPkGameAnimVC.V2(tb), p0.b(), this.b.j, new f(this, p0));
       }
       return;
    }
}
