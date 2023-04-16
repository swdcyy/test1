package og.m0;
import z3b.f;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import brd.g;
import og.l;
import java.lang.String;
import q87.c;
import java.lang.Throwable;
import z3b.e;

public class m0 implements f	// class@0027b4
{
    public final v a;

    public void m0(v p0){
       this.a = p0;
       super();
    }
    public void b(MagicBaseConfig p0){
       if (p0.isMagicFace()) {
          this.a.onNext(p0);
          this.a.onComplete();
       }else {
          Object[] objArray = new Object[0];
          l.D().w("PostVideoHelper", "wrong type ,This should not happen", objArray);
          this.a.onError(new Throwable("wrong type ,This should not happen"));
       }
       return;
    }
    public void d(MagicBaseConfig p0,Throwable p1){
       this.a.onError(p1);
    }
    public void e(MagicBaseConfig p0){
       e.a(this, p0);
    }
    public void g(MagicBaseConfig p0,int p1,int p2){
    }
}
