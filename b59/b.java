package b59.b;
import b59.c;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import b59.b$a;
import erd.g;
import java.util.HashMap;
import a59.e;
import java.util.Map;

public final class b extends c	// class@00036c
{

    public void b(f p0){
       a.p(p0, "mTkBridgeContext");
       super(p0);
    }
    public String a(){
       return "clickIconToFollow";
    }
    public void k(Integer p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       QPhoto qPhoto = this.j().e();
       if (qPhoto != null) {
          i0.a().e(14, qPhoto.mEntity).d(new b$a(this, p0)).o(this.f(this.j())).a();
       }
       return;
    }
}
