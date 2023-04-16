package nd9.p;
import v36.a$a;
import nd9.l;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public class p implements a$a	// class@003154
{
    public final KwaiImageView a;
    public final l b;

    public void p(l p0,KwaiImageView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       this.b.m2(this.a);
       this.b.s2();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       this.b.m2(this.a);
       this.b.s2();
       return;
    }
    public void c(boolean p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, op, "1")) {
          return;
       }
       if (!p0) {
          this.b.s2();
       }
       return;
    }
    public void onAnimationStart(){
       this.b.D = true;
    }
}
