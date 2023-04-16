package q90.x$f;
import erd.g;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import kotlin.Pair;
import q90.x;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;

public final class x$f implements g	// class@0029af
{
    public final KSTemplateDetailInfo b;
    public final Pair c;
    public final x d;

    public void x$f(KSTemplateDetailInfo p0,Pair p1,x p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, x$f.class, "1")) {
       }else {
          a.o(p0, "isSelect");
          if (p0.booleanValue()) {
             p0 = this.d;
             x q = p0.q;
             if (q == null) {
                a.S("mTemplateCover");
             }
             KSTemplateDetailInfo mCoverUrls = this.b.mCoverUrls;
             a.o(mCoverUrls, "it.mCoverUrls");
             p0.V8(q, mCoverUrls, this.c);
          }
          PatchProxy.onMethodExit(x$f.class, "1");
       }
       return;
    }
}
