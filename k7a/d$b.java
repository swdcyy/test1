package k7a.d$b;
import d6a.a;
import k7a.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import p5a.e;
import de5.a;
import p5a.c;
import com.yxcorp.gifshow.entity.QPhoto;

public class d$b extends a	// class@002c0a
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "2")) {
          return;
       }
       d$b tb = this.b;
       tb.A = false;
       tb.B = false;
       tb.W8();
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       this.b.A = true;
       if (!SlidePerformanceExp.e() && !this.b.q.getPlayer().j()) {
          d$b tb = this.b;
          if (tb.z != null || (tb.E == null && tb.p.isVideoType())) {
          label_003c :
             return;
          }
       }
    label_0037 :
       this.b.V8();
       goto label_003c ;
    }
}
