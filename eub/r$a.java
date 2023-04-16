package eub.r$a;
import erd.g;
import eub.r;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qr4.i;
import qr4.m$k0;
import qr4.m$u;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;

public final class r$a implements g	// class@002834
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, "1")) {
       }else {
          a.o(p0, "it");
          p0 = p0.d1();
          r m = this.b.m;
          Object obj = null;
          Objects.requireNonNull(p0);
          if (PatchProxy.applyTwoRefs(m, obj, p0, VideoContext.class, "234") != PatchProxyResult.class) {
          }else {
             VideoContext.b();
             p0.f0();
             i b = p0.a.b;
             if (b.b1 == null) {
                b.b1 = new m$u();
             }
             if (m != null) {
                p0.a.b.b1.a = m;
             }
             Object[] objArray = new Object[0];
             p3.D().w("VideoContext", "setMerchantCommentParam commentId:"+m+",goodsId:"+obj+",oldCommentId:"+p0.a.b.b1.a+",oldGoodsId:"+p0.a.b.b1.b, objArray);
          }
       }
       return;
    }
}
