package g7a.v0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import g7a.v0$a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import ek9.t0;

public final class v0 extends PresenterV2	// class@002400
{
    public t0 p;
    public PhotoDetailLogger q;

    public void v0(){
       super();
    }
    public void E8(){
       boolean b = PatchProxy.applyVoid(null, this, v0.class, "4");
       if (b) {
          return;
       }
       v0 tq = this.q;
       if (tq != null) {
          v0 tp = this.p;
          if (tp == null) {
             a.S("mCommentGlobalObserver");
          }
          this.X7(tp.i(new v0$a(tq), Functions.d()));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v0.class, "1")) {
          return;
       }
       Object obj = this.r8("COMMENT_GLOBAL_ACTION");
       a.o(obj, "inject\(CommentAccessIds.COMMENT_GLOBAL_ACTION\)");
       this.p = obj;
       this.q = this.r8("DETAIL_LOGGER");
       return;
    }
}
