package ce9.q;
import z3b.f;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import brd.g;
import j8c.a;
import w46.b;
import java.lang.Throwable;
import z3b.e;

public class q implements f	// class@0005cd
{
    public final v a;

    public void q(v p0){
       this.a = p0;
       super();
    }
    public void b(MagicBaseConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       if (p0.isMagicFace()) {
          this.a.onNext(p0);
          this.a.onComplete();
       }else {
          Object[] objArray = new Object[0];
          a.D().t("MagicFaceBridge", "wrong type ,This should not happen", objArray);
          this.a.onError(new Throwable("wrong type ,This should not happen"));
       }
       return;
    }
    public void d(MagicBaseConfig p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q.class, "1")) {
          return;
       }
       this.a.onError(p1);
       return;
    }
    public void e(MagicBaseConfig p0){
       e.a(this, p0);
    }
    public void g(MagicBaseConfig p0,int p1,int p2){
    }
}
