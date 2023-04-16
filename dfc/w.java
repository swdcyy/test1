package dfc.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dfc.w$a;
import dfc.w$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.content.Context;
import android.content.res.Resources;
import cw9.c;
import androidx.viewpager.widget.ViewPager$i;
import hf5.g;
import qvb.q;
import sy6.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hf5.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public class w extends PresenterV2	// class@0021b8
{
    public g p;
    public b q;
    public ViewStubInflater2 r;
    public View s;
    public int t;
    public q u;
    public a v;
    public final ViewPager$i w;

    public void w(){
       super();
       this.u = new w$a(this);
       this.w = new w$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, w.class, "2")) {
          return;
       }
       w tr = this.r;
       if (tr == null) {
          return;
       }
       this.s = tr.b(0x7f0a048f);
       this.t = c.b(this.getContext().getResources(), 0x7f070bf1);
       this.p.cc(this.w);
       this.R8();
       tr = this.v;
       if (tr != null) {
          tr.e(this.u);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, w.class, "3")) {
          return;
       }
       this.p.Ud(this.w);
       w tv = this.v;
       if (tv != null) {
          tv.b(this.u);
       }
       return;
    }
    public boolean P8(int p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ow, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = this.q.G0(p0);
       boolean b = (p0 != 4 && (p0 != 12 && (p0 == 30 || p0 == 41)))? true: false;
       return b;
    }
    public void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, w.class, "4")) {
          return;
       }
       QPhoto currentPhoto = this.q.getCurrentPhoto();
       if (currentPhoto != null) {
          objArray = currentPhoto.getEntity();
       }
       if (objArray != null && (r1.S2(objArray) || r1.r3(objArray))) {
          this.s.setTranslationY((float)this.t);
       }else {
          this.s.setTranslationY(0);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.r = this.r8("NASA_BOTTOM_COMMENT_VIEW_STUB");
       this.p = this.q8(g.class);
       this.q = this.q8(b.class);
       this.v = this.q8(a.class);
       return;
    }
}
