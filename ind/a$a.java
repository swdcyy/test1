package ind.a$a;
import pb9.q;
import ind.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import voc.n;
import com.yxcrop.gifshow.v3.editor.text_v2.action.RecoTextFetchActionV3;
import kotlin.jvm.internal.a;
import xvc.b;

public final class a$a implements q	// class@001025
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public final void a(String p0,long p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.o(p0, "sessionId");
       this.a.T().t0(new RecoTextFetchActionV3(p0, p1));
       return;
    }
}
