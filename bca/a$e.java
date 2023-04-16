package bca.a$e;
import io.reactivex.g;
import bca.a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.e7;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingInitAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class a$e implements g	// class@00044e
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
          return;
       }
       a.p(p0, "aicutEmitter");
       e7.c("ai_cut_recommend");
       a d = this.b.d;
       if (d != null) {
          d.t0(new VideoTemplateLoadingInitAction(p0));
       }
       return;
    }
}
