package f8a.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f8a.c$a;
import rd5.j;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import d0a.o;
import java.lang.Object;
import brd.y;
import kzc.c;
import cg6.b;
import com.yxcorp.gifshow.widget.popup.c;
import android.app.Activity;
import java.util.List;
import java.util.Iterator;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import f8a.b;
import erd.g;
import crd.b;
import brd.t;
import f8a.a;
import xx9.a;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import mrd.a;

public class c extends PresenterV2	// class@0022e6
{
    public QPhoto p;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public t s;
    public a t;
    public y u;
    public a v;
    public SlideHorizontalAtlasPlayer w;
    public boolean x;
    public final a y;

    public void c(){
       super();
       this.y = new c$a(this);
    }
    public static void P8(c p0,j p1){
       p0.R8(p1);
    }
    private void R8(j p0){
       if (p0.a == ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN && this.x != null) {
          if (p0.b != null) {
             this.u.onNext(new o(0));
             b.a().v(6);
          }else {
             List list = b.a().l(this.getActivity());
             if (list != null) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   if (uoa.K()) {
                      uoa.o();
                   }
                }
             }
             b.a().u(6);
          }
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.r = slidePlayVie;
       slidePlayVie.P(this.q, this.y);
       this.X7(this.s.subscribe(new b(this)));
       this.X7(this.t.h(new a(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.r.D(this.q, this.y);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a032f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       this.s = this.r8("NASA_SCALE_CLEAN_CONTROLLER_EVENT_OBSERVABLE");
       this.t = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.u = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVER");
       this.v = this.r8("NASA_LONG_PHOTO_INDICATOR");
       return;
    }
}
