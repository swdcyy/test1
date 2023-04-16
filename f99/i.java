package f99.i;
import joc.o;
import f99.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import m9a.m;
import java.util.Objects;
import im8.f;
import vd5.d;
import f99.f;
import java.lang.Boolean;
import lnc.c3$b;
import lnc.c3;
import tkd.b;
import tkd.d;
import gx5.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import joc.q;
import k2b.u1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import f99.e;
import lnc.c3$a;

public class i extends o	// class@0022eb
{
    public final h a;

    public void i(h p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       this.a.W8(0);
       this.a.X8();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       this.a.e9(false);
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "1")) {
          return;
       }
       m.a(this.a.getActivity());
       this.a.W8(1);
       i ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, h.class, "24") && ta.d9()) {
          ta.F = c3.b(ta.u.get(), f.a, Boolean.TRUE).booleanValue();
          ta.G = d.a(-1188553266).O6(ta.B);
          ta.A.setVisibility(0);
          ta.J.f(1);
       }
       return;
    }
    public void d(){
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       u1.K0(2);
       this.a.W8(2);
       i ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, oh, "17")) {
          ta.z.onButtonClicked(null, "PULL_TO_SWITCH_PAGE", 0, 5, 3, 1071, null, a.b(ta.w));
       }
       this.a.Y8();
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, oh, "18")) {
          c3.c(ta.w.mEntity, e.a);
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       this.a.e9(true);
       return;
    }
}
