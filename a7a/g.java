package a7a.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.p;
import brd.t;
import t45.d;
import brd.z;
import a7a.f;
import erd.g;
import crd.b;
import eda.b0;
import a7a.e;
import com.yxcorp.gifshow.events.SyncDetailAnimParamEvent;
import a7a.d;
import moc.b;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import de5.a;
import im8.f;
import android.util.SparseIntArray;

public class g extends PresenterV2	// class@000054
{
    public SlideHorizontalAtlasPlayer p;
    public View q;
    public QPhoto r;
    public BaseFragment s;
    public a t;
    public f u;
    public SparseIntArray v;
    public int w;

    public void g(){
       super();
       this.w = -1;
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, g.class, "3")) {
          return;
       }
       RxBus f = RxBus.f;
       z a = d.a;
       this.X7(f.f(p.class).observeOn(a).subscribe(new f(this)));
       this.X7(f.f(b0.class).observeOn(a).subscribe(new e(this)));
       this.X7(f.f(SyncDetailAnimParamEvent.class).observeOn(a).subscribe(new d(this)));
       PatchProxy.onMethodExit(g.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, g.class, "4")) {
          return;
       }
       g tw = this.w;
       if (tw != -1) {
          b.f(tw);
          this.w = -1;
       }
       PatchProxy.onMethodExit(g.class, "4");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a032f);
       this.q = m1.f(p0, 0x7f0a3a43);
       PatchProxy.onMethodExit(g.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, g.class, "1")) {
          return;
       }
       this.s = this.r8("DETAIL_FRAGMENT");
       this.r = this.q8(QPhoto.class);
       this.t = this.q8(a.class);
       this.u = this.x8("DETAIL_LOGGER");
       this.v = this.r8("ATLAS_VIEWED_COUNTS");
       PatchProxy.onMethodExit(g.class, "1");
       return;
    }
}
