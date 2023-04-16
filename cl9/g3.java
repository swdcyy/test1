package cl9.g3;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cl9.f3;
import android.view.View;
import android.view.View$OnLongClickListener;
import crd.b;
import com.yxcorp.gifshow.comment.utils.c;
import ekd.m1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import yk9.d;
import ek9.t0;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;

public class g3 extends PresenterV2	// class@000626
{
    public View p;
    public QPhoto q;
    public QComment r;
    public d s;
    public t0 t;
    public CommentsFragment u;

    public void g3(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g3.class, "3")) {
          return;
       }
       this.X7(c.b(this.p, new f3(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g3.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0873);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g3.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.q8(QComment.class);
       this.s = this.q8(d.class);
       this.t = this.r8("COMMENT_GLOBAL_ACTION");
       this.u = this.r8("FRAGMENT");
       return;
    }
}
