package c7c.n;
import y6c.e;
import c7c.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.RecoUser;
import f7c.c;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class n extends e	// class@00054b
{
    public final o i;

    public void n(o p0,GifshowActivity p1,RecoUser p2,c p3,boolean p4,int p5){
       this.i = p0;
       super(p1, p2, p3, p4, p5);
    }
    public void c(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       n ti = this.i;
       if (ti.t == p0) {
          ti.V8(p0);
       }
       return;
    }
}
