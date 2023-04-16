package ej2.v;
import k51.c;
import ej2.s;
import ej2.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import ej2.u;
import msd.l;
import com.kuaishou.live.common.core.basic.tools.l;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Runnable;

public abstract class v extends c	// class@00273d
{
    public KwaiImageView p;
    public CDNUrl[] q;
    public CDNUrl[] r;
    public String s;
    public g t;
    public final b u;
    public static String sLivePresenterClassName = "LiveScoreRankAvatarRingPresenter";

    public void v(){
       super();
       this.t = new s(this);
       this.u = new t(this);
    }
    public abstract boolean P8();
    public void R8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       if (this.p == null) {
          return;
       }
       if (this.P8()) {
          this.p.setVisibility(0);
          l.d(this.p, this.r, true, new u(this), l.f());
       }else {
          this.p.setVisibility(8);
       }
       return;
    }
}
