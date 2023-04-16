package qh.i$b;
import qw6.a;
import qh.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public class i$b implements a	// class@0029e5
{
    public final i b;

    public void i$b(i p0){
       this.b = p0;
       super();
    }
    public void H2(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "1")) {
          return;
       }
       i$b tb = this.b;
       i r = tb.r;
       if (r != null) {
          tb.q = r.getCurrentPhoto();
          i q = this.b.q;
          if (q != null && (r1.D3(q.getEntity()) || r1.S2(this.b.q.getEntity()))) {
             this.b.s = true;
          }
       }
       return;
    }
    public void N2(){
    }
    public void Q0(){
       this.b.s = false;
    }
    public void Q1(){
    }
}
