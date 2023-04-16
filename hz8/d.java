package hz8.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hz8.d$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zx.e;
import yx.j0;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.player.core.b;
import fm9.a;
import tkd.b;
import tkd.d;
import ol9.a;
import em9.c;
import em9.b;
import io.reactivex.subjects.PublishSubject;
import bm5.h;
import hz8.i;
import hz8.j;
import erd.g;
import crd.b;
import brd.t;
import hz8.e;
import hz8.f;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.j;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import hz8.g;
import hz8.h;
import android.view.View;
import ekd.m1;

public final class d extends PresenterV2	// class@0025f8
{
    public QPhoto p;
    public h q;
    public PublishSubject r;
    public View s;
    public boolean t;
    public c u;
    public boolean v;
    public static final d$a w;

    static {
       d.w = new d$a(null);
    }
    public void d(){
       super();
    }
    public static final QPhoto P8(d p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       Object[] objArray1;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       d tp = this.p;
       String str = "mPhoto";
       if (tp == null) {
          a.S(str);
       }
       int i = 0;
       String str1 = "AdLandscapePlayed";
       if (!e.a(tp)) {
          objArray1 = new Object[i];
          j0.f(str1, "is not video ad.", objArray1);
          return;
       }else {
          tp = this.s;
          if (tp == null) {
             a.S("mPlayerView");
          }
          Object[] objArray2 = PatchProxy.applyOneRefs(tp, this, uod, "7");
          if (objArray2 != PatchProxyResult.class) {
          }else if(!tp instanceof a){
             objArray2 = objArray;
          }else {
             objArray2 = tp.a();
          }
          if (objArray2 == null) {
             objArray1 = new Object[i];
             j0.c(str1, "cannot get ad player.", objArray1);
             return;
          }else {
             int i1 = 0x4ffa335e;
             a uoa = d.a(i1);
             d tp1 = this.p;
             if (tp1 == null) {
                a.S(str);
             }
             this.t = uoa.i50(tp1);
             d tu = this.u;
             if (tu == null) {
                a uoa1 = d.a(i1);
                tu = this.p;
                if (tu == null) {
                   a.S(str);
                }
                tu = uoa1.NH(tu, objArray2);
             }
             if (this.t == null) {
                tp = this.p;
                if (tp == null) {
                   a.S(str);
                }
                tu.b(tp);
             }
             tu.j(objArray2);
             tu.e();
             this.u = tu;
             if (objArray2.isPlaying()) {
                tu.start();
             }
             if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
                d tq = this.q;
                if (tq == null) {
                   a.S("mLandscapeObservables");
                }
                tq.d().subscribe(new i(this), j.b);
             }
             if (!PatchProxy.applyVoidOneRefs(tu, this, uod, "5")) {
                uod = this.r;
                if (uod == null) {
                   a.S("mBecomeExitLandscapeEvent");
                }
                uod.subscribe(new e(this, tu), f.b);
                this.X7(RxBus.f.g(j.class, RxBus$ThreadMode.MAIN).subscribe(new g(this), h.b));
             }
             return;
          }
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.u = null;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = m1.f(p0, R.id.corona_detail_landscape_player);
       a.o(p0, "ViewBindUtils.bindWidget¡­_detail_landscape_player\)");
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       Object obj = this.r8("Landscape_LAND_ITEM_PHOTO");
       a.o(obj, "inject\(AccessIds.LANDSCAPE_LAND_ITEM_PHOTO\)");
       this.p = obj;
       obj = this.r8("LAND_SCAPE_OBSERVABLES");
       a.o(obj, "inject\(AccessIds.LAND_SCAPE_OBSERVABLES\)");
       this.q = obj;
       obj = this.r8("LANDSCAPE_BECOME_EXIT_LANDSCAPE_EVENT");
       a.o(obj, "inject\(AccessIds.LANDSCA¡­OME_EXIT_LANDSCAPE_EVENT\)");
       this.r = obj;
       return;
    }
}
