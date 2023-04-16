package dfc.z;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dfc.z$a;
import androidx.viewpager.widget.ViewPager$i;
import sy6.a;
import dfc.z$b;
import jta.c;
import hf5.e;
import dfc.z$c;
import qvb.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.yxcorp.gifshow.action.c;

public class z extends PresenterV2	// class@0021c1
{
    public e p;
    public final Set q;
    public a r;
    public ViewPager$i s;
    public int t;
    public QPhoto u;
    public a v;
    public q w;

    public void z(){
       super();
       this.q = new HashSet();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, z.class, "2")) {
          return;
       }
       if (this.r == null) {
          return;
       }
       if (this.s == null) {
          this.s = new z$a(this);
       }
       this.r.i(this.s);
       if (this.v == null) {
          this.v = new z$b(this);
       }
       this.p.D0(this.v);
       if (this.w == null) {
          this.w = new z$c(this);
       }
       this.r.e(this.w);
       return;
    }
    public void J8(){
       z ts;
       if (PatchProxy.applyVoid(null, this, z.class, "4")) {
          return;
       }
       z tr = this.r;
       if (tr != null) {
          ts = this.s;
          if (ts != null) {
             tr.g(ts);
          }
       }
       tr = this.v;
       if (tr != null) {
          this.p.w0(tr);
       }
       tr = this.r;
       if (tr != null) {
          ts = this.w;
          if (ts != null) {
             tr.b(ts);
          }
       }
       return;
    }
    public void P8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "3")) {
          return;
       }
       String str = r1.t1(p0.getEntity());
       if (TextUtils.isEmpty(str)) {
          return;
       }
       if (this.q.add(str)) {
          c.e("NEWS_SLIDE", 18, p0.getEntity(), null);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       this.r = this.q8(a.class);
       this.p = this.q8(e.class);
       return;
    }
}
