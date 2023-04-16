package lf9.f$a;
import z3b.f;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import brd.g;
import java.lang.Throwable;
import z3b.e;

public final class f$a implements f	// class@002dd1
{
    public final v a;

    public void f$a(v p0){
       this.a = p0;
       super();
    }
    public void b(MagicBaseConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "3")) {
          return;
       }
       a.p(p0, "magicFace1");
       this.a.onNext(Integer.valueOf(100));
       this.a.onComplete();
       return;
    }
    public void d(MagicBaseConfig p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "2")) {
          return;
       }
       a.p(p0, "magicFace1");
       a.p(p1, "e");
       this.a.onError(p1);
       return;
    }
    public void e(MagicBaseConfig p0){
       e.a(this, p0);
    }
    public void g(MagicBaseConfig p0,int p1,int p2){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, f$a.class, "1")) {
          return;
       }
       a.p(p0, "magicFace1");
       this.a.onNext(Integer.valueOf(p1));
       return;
    }
}
