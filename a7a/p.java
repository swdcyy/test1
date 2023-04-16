package a7a.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.util.SparseIntArray;
import wd5.a;
import java.lang.String;
import a7a.p$a;
import a7a.p$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.lang.Integer;
import xx9.a;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import wd5.o;
import brd.t;

public class p extends PresenterV2	// class@000073
{
    public final a A;
    public final a B;
    public final i C;
    public QPhoto p;
    public BaseFragment q;
    public o r;
    public SparseIntArray s;
    public final SparseIntArray t;
    public SlidePlayViewModel u;
    public SlideHorizontalAtlasPlayer v;
    public a w;
    public t x;
    public a y;
    public int z;

    public void p(){
       super();
       this.t = new SparseIntArray();
       this.A = new a("horizontalCover");
       this.B = new p$a(this);
       this.C = new p$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, p.class, "3")) {
          return;
       }
       if (this.v == null) {
          PatchProxy.onMethodExit(p.class, "3");
          return;
       }else {
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
          this.u = slidePlayVie;
          slidePlayVie.P(this.q, this.B);
          PatchProxy.onMethodExit(p.class, "3");
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, p.class, "6")) {
          return;
       }
       this.u.D(this.q, this.B);
       PatchProxy.onMethodExit(p.class, "6");
       return;
    }
    public void P8(int p0){
       if (PatchProxy.isSupport2(p.class, "7") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, p.class, "7")) {
          return;
       }
       if (this.w.c()) {
          this.t.put(p0, (this.t.get(p0) + 1));
          PatchProxy.onMethodExit(p.class, "7");
          return;
       }else {
          this.s.put(p0, (this.s.get(p0) + 1));
          this.A.d(p0);
          PatchProxy.onMethodExit(p.class, "7");
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a032f);
       PatchProxy.onMethodExit(p.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, p.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       this.r = this.r8("SLIDE_ATLAS_VSE_INFO");
       this.s = this.r8("ATLAS_VIEWED_COUNTS");
       this.w = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.x = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVABLE");
       PatchProxy.onMethodExit(p.class, "1");
       return;
    }
}
