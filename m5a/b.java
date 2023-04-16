package m5a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import m5a.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ge5.d;
import m5a.b$a;
import java.util.Set;

public class b extends PresenterV2	// class@002f39
{
    public Set p;
    public t q;
    public d r;
    public boolean s;
    public Runnable t;

    public void b(){
       super();
       this.t = new a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b tr = this.r;
       if (tr != null) {
          this.q = tr.h;
       }
       this.p.add(new b$a(this));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, b.class, "3");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_SCROLL_LISTENERS");
       this.r = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       return;
    }
}
