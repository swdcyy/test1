package bed.p0;
import z3b.f;
import bed.q0;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import brd.g;
import uy5.a;
import q87.c;
import java.lang.Throwable;
import z3b.e;

public class p0 implements f	// class@00041b
{
    public final v a;
    public final q0 b;

    public void p0(q0 p0,v p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(MagicBaseConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0.class, "2")) {
          return;
       }
       if (p0.isMagicFace()) {
          this.a.onNext(p0);
          this.a.onComplete();
       }else {
          Object[] objArray = new Object[0];
          a.C().t("TagMusicCameraBridge", "wrong type ,This should not happen", objArray);
          this.a.onError(new Throwable("wrong type ,This should not happen"));
       }
       return;
    }
    public void d(MagicBaseConfig p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p0.class, "1")) {
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
