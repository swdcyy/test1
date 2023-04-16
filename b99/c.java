package b99.c;
import b99.f;
import b99.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import f4a.g0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import f4a.e0;
import b99.a;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import androidx.viewpager.widget.ViewPager;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import b99.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;

public class c extends f	// class@000399
{
    public View B;
    public PhotosViewPager C;
    public int D;
    public boolean E;
    public t F;
    public final ViewPager$i G;

    public void c(){
       super();
       this.D = 0;
       this.E = false;
       this.G = new c$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "2")) {
          return;
       }
       super.E8();
       this.B = this.s.findViewById(0x7f0a2f6d);
       View view = this.s.findViewById(R.id.atlas_player_progress_container);
       Object obj = PatchProxy.applyOneRefs(this.r, objArray, g0.class, "3");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): e0.a("showsProgressBarForGallery");
       if (b && view != null) {
          this.B = view;
       }
       this.X7(this.F.subscribe(new a(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       super.J8();
       c tC = this.C;
       if (tC != null) {
          tC.removeOnPageChangeListener(this.G);
       }
       this.E = false;
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       c tC = this.C;
       if (tC == null || (tC.getCurrentItem() > 0 || (this.D == null && this.E != null))) {
          super.P8();
       }
    label_0022 :
       return;
    }
    public float R8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoc, "7");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       float f = (g0.a(this.r))? 0x3f800000: super.R8(p0);
       return f;
    }
    public void V8(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "4")) {
          return;
       }
       if (g0.a(this.r) && !PatchProxy.applyVoid(null, this, uoc, "6")) {
          uoc = this.C;
          if (uoc == null || (uoc.getCurrentItem() > 0 || (this.D == null && this.E != null))) {
             super.P8();
          }
       }
    label_0033 :
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       super.W8();
       if (g0.a(this.r)) {
          this.B.post(new b(this));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.j8();
       PhotosViewPager photosViewPa = this.t8("ATLAS_VIEW_PAGER");
       this.C = photosViewPa;
       if (photosViewPa != null) {
          photosViewPa.addOnPageChangeListener(this.G);
       }
       this.F = this.r8("DETAIL_ATLAS_SEEKBAR_POSITION_OBSERVABLE");
       return;
    }
}
