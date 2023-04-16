package fia.y;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fia.y$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.view.View;
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import cia.w;
import java.util.Objects;
import androidx.viewpager.widget.ViewPager$i;
import hf5.g;
import android.app.Activity;
import gha.s;

public class y extends PresenterV2	// class@00293c
{
    public View p;
    public int q;
    public ViewStubInflater2 r;
    public w s;
    public View t;
    public View u;
    public final ViewPager$i v;

    public void y(){
       super();
       this.v = new y$a(this);
    }
    public void E8(){
       y oy = y.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oy, "3")) {
          return;
       }
       int i = 0x7f0a048f;
       boolean b = true;
       this.r.f(i, b);
       this.p = this.r.b(i);
       this.q = a1.d(0x7f070bf1);
       Object obj = PatchProxy.apply(objArray, this, oy, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          oy = this.s;
          if (oy != null && oy.O() != null) {
             b = this.P8();
          }
       }
       int i1 = 8;
       if (b) {
          this.p.setVisibility(i1);
       }else {
          this.p.setVisibility(0);
       }
       if (this.P8()) {
          this.t.setVisibility(i1);
          this.u.setVisibility(i1);
       }
       oy = this.s;
       y tv = this.v;
       Objects.requireNonNull(oy);
       if (!PatchProxy.applyVoidOneRefs(tv, oy, w.class, "11")) {
          w h = oy.h;
          if (h != null) {
             h.cc(tv);
          }else {
             oy.O().i(tv);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, y.class, "4")) {
          return;
       }
       y ts = this.s;
       y tv = this.v;
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoidOneRefs(tv, ts, w.class, "12")) {
          w h = ts.h;
          if (h != null) {
             h.Ud(tv);
          }else {
             ts.O().g(tv);
          }
       }
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, y.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (s.a(this.getActivity(), "feedType", i) == 2 || s.a(this.getActivity(), "entranceType", i) == 2) {
          i = true;
       }
       return i;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
          return;
       }
       this.t = p0.findViewById(0x7f0a376a);
       this.u = p0.findViewById(0x7f0a060c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "2")) {
          return;
       }
       this.r = this.r8("NASA_BOTTOM_COMMENT_VIEW_STUB");
       this.s = this.q8(w.class);
       return;
    }
}
