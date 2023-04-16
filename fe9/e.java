package fe9.e;
import z3b.f;
import fe9.f;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import brd.g;
import java.lang.Throwable;
import z3b.e;
import java.lang.Integer;
import java.lang.Math;

public class e implements f	// class@002307
{
    public float a;
    public final v b;
    public final f c;

    public void e(f p0,v p1){
       this.c = p0;
       this.b = p1;
       super();
       this.a = 0xbf800000;
    }
    public void b(MagicBaseConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       p0.a = null;
       this.b.onNext(Float.valueOf(0x3f800000));
       this.b.onComplete();
       return;
    }
    public void d(MagicBaseConfig p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       p0.a = null;
       this.b.onError(p1);
       return;
    }
    public void e(MagicBaseConfig p0){
       e.a(this, p0);
    }
    public void g(MagicBaseConfig p0,int p1,int p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, e.class, "1")) {
          return;
       }
       float f = Math.min((((float)p1 * 0x3f800000) / (float)p2), 0x3f7d70a4);
       if (f - this.a > 0) {
          this.a = f;
          this.b.onNext(Float.valueOf(f));
       }
       return;
    }
}
