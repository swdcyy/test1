package h19.d$c;
import com.yxcorp.gifshow.widget.SwipeLayout$c;
import h19.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.u1;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class d$c extends SwipeLayout$c	// class@002538
{
    public final d a;

    public void d$c(d p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "2")) {
          return;
       }
       if (!this.a.P8()) {
          this.a.R8();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "4")) {
          return;
       }
       this.a();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "3")) {
          return;
       }
       u1.K0(3);
       this.a.E.onBackPressed();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "1")) {
          return;
       }
       u1.K0(3);
       this.a.E.onBackPressed();
       return;
    }
}
