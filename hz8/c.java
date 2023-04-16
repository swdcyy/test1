package hz8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.b0;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import hz8.a;
import erd.r;
import hz8.b;
import erd.g;
import crd.b;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import bm5.h;

public final class c extends PresenterV2	// class@0025f6
{
    public QPhoto p;
    public BaseFragment q;
    public KwaiGrootViewPager r;
    public h s;
    public int t;

    public void c(){
       super();
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       c tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       if (!b0.d(tp)) {
          return;
       }else if(PatchProxy.applyVoid(objArray, this, uoc, "3")){
          uoc = this.q;
          if (uoc == null) {
             a.S("mFragment");
          }
          this.X7(uoc.n1().filter(a.b).subscribe(new b(this)));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       Object obj = this.r8("Landscape_LAND_ITEM_PHOTO");
       a.o(obj, "inject\(AccessIds.LANDSCAPE_LAND_ITEM_PHOTO\)");
       this.p = obj;
       obj = this.r8("Landscape_LAND_VIEW_PAGER");
       a.o(obj, "inject\(AccessIds.LANDSCAPE_LAND_VIEW_PAGER\)");
       this.r = obj;
       obj = this.r8("Landscape_ITEM_FRAGMENT");
       a.o(obj, "inject\(AccessIds.LANDSCAPE_ITEM_FRAGMENT\)");
       this.q = obj;
       obj = this.r8("LAND_SCAPE_OBSERVABLES");
       a.o(obj, "inject\(AccessIds.LAND_SCAPE_OBSERVABLES\)");
       this.s = obj;
       return;
    }
}
