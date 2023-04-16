package cl9.v1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import cl9.v1$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import nx9.c;
import mzc.a;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.e0;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import ek9.t0;

public class v1 extends PresenterV2	// class@000675
{
    public List p;
    public t0 q;
    public QPhoto r;
    public List s;
    public CommentsFragment t;
    public d u;

    public void v1(){
       super();
       this.s = new ArrayList();
       this.u = new v1$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v1.class, "3")) {
          return;
       }
       this.P8();
       this.p.add(this.u);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v1.class, "4")) {
          return;
       }
       v1 tu = this.u;
       this.p.remove(tu);
       this.s.clear();
       return;
    }
    public void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v1.class, "2")) {
          return;
       }
       if (c.a()) {
          this.s.add(new a(this.r, this.t, "COMMENT_PANCE"));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v1.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.t = this.r8("FRAGMENT");
       this.p = this.r8("COMMENT_PANEL_EDITOR_LISTENER");
       this.q = this.r8("COMMENT_GLOBAL_ACTION");
       return;
    }
}
