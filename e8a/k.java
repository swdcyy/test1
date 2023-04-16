package e8a.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e8a.k$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import wkd.b;
import com.yxcorp.gifshow.homepage.serchcard.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class k extends PresenterV2	// class@0020bb
{
    public QPhoto p;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public d s;
    public final a t;

    public void k(){
       super();
       this.t = new k$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.r = slidePlayVie;
       slidePlayVie.P(this.q, this.t);
       this.s = b.a(0x325d46d9);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
