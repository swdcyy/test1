package b59.a;
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
import b59.a$a;
import erd.g;
import java.util.HashMap;
import a59.e;
import java.util.Map;

public final class a extends c	// class@00036a
{

    public void a(f p0){
       a.p(p0, "mTkBridgeContext");
       super(p0);
    }
    public String a(){
       return "clickActionToFollow";
    }
    public void k(Integer p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       QPhoto qPhoto = this.j().e();
       if (qPhoto != null) {
          qPhoto = qPhoto.mEntity;
          if (qPhoto != null) {
             i0.a().e(2, qPhoto).d(new a$a(this, p0, p1)).o(this.f(this.j())).a();
          }
       }
       return;
    }
}
