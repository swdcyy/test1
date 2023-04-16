package q90.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import q90.w$a;
import nsd.u;
import q90.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import android.view.View;

public final class w extends PresenterV2	// class@0029a6
{
    public KSTemplateDetailInfo p;
    public final v q;
    public final boolean r;
    public static final w$a s;

    static {
       w.s = new w$a(null);
    }
    public void w(){
       super(false, 1, null);
    }
    public void w(boolean p0){
       super();
       this.r = p0;
       this.q = new v();
    }
    public void w(boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       super(p0);
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, w.class, "3")) {
          return;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          Activity activity = this.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          this.q.a(this.p, activity, this.r);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "2")) {
          return;
       }
       this.q.b(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.p = this.q8(KSTemplateDetailInfo.class);
       return;
    }
}
