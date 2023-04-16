package cl9.a3;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.yxcorp.gifshow.entity.QPhoto;
import cl9.z2;
import m24.t0;
import erd.g;
import crd.b;
import com.kuaishou.android.model.mix.QComment;
import al9.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class a3 extends PresenterV2	// class@000606
{
    public QPhoto p;
    public QComment q;
    public a r;
    public RecyclerFragment s;

    public void a3(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a3.class, "2")) {
          return;
       }
       this.X7(this.p.observePostChange().subscribe(new z2(this), t0.b));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a3.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(QComment.class);
       this.r = this.r8("DETAIL_PAGE_LIST");
       this.s = this.r8("FRAGMENT");
       return;
    }
}
