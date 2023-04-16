package b51.d;
import ew6.a;
import androidx.fragment.app.c;
import c51.h;
import com.kuaishou.live.basic.liveslide.view.LiveSlideViewPager;
import jw6.a;
import dw6.a$a;
import dw6.a;
import fw6.b;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import java.util.ArrayList;
import b51.d$a;
import c51.i;
import androidx.viewpager.widget.ViewPager$i;
import cw6.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.liveslide.a;
import c51.d;
import d51.a;
import java.util.List;
import wg3.b;
import bw6.a;
import hw6.a;
import c51.b;
import java.util.Objects;
import java.util.Collection;
import ow6.a;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import java.lang.Integer;
import java.util.Iterator;
import tw6.a;
import java.lang.Boolean;
import h51.e;
import h51.a;

public class d extends a	// class@000316
{
    public b k;
    public h l;
    public e m;
    public d n;
    public final i o;
    public final List p;
    public final ViewPager$i q;

    public void d(c p0,h p1,LiveSlideViewPager p2,a p3){
       a$a uoa = new a$a();
       uoa.b(false);
       uoa.c(false);
       super(p0, p1, p2, p3, uoa.a());
       this.p = new ArrayList();
       d$a uoa1 = new d$a(this);
       this.q = uoa1;
       this.o = new i(p1);
       this.c.i0(uoa1);
    }
    public b c(){
       a uoa = PatchProxy.apply(null, this, d.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(this.p(), this.e, this.d);
       }
       return uoa;
    }
    public void m(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "14")) {
          return;
       }
       super.m();
       d tl = this.l;
       if (tl != null) {
          tl.w0();
          this.l = objArray;
       }
       this.c.m0(this.q);
       this.p.clear();
       return;
    }
    public a o(){
       return this.f;
    }
    public d p(){
       return this.o;
    }
    public LiveSlideViewPager q(){
       return this.c;
    }
    public void r(h p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "12")) {
          return;
       }
       if (this.k == null) {
          this.k = this.f.Z();
          this.l = this.a;
       }
       this.a.g(this.f);
       p0.u(this.f);
       d tn = this.n;
       if (tn != null) {
          this.a.g(tn);
          p0.u(this.n);
       }
       tn = this.m;
       if (tn != null) {
          this.a.G(tn);
          p0.y(this.m);
       }
       a ta = this.a;
       if (ta != this.l) {
          ta.w0();
       }
       this.a = p0;
       this.o.a(p0);
       a tf = this.f;
       List list = this.a.n0();
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidTwoRefs(list, p1, tf, a.class, "6") && !a.c(list)) {
          int i = 0x7a120;
          if (p1 == null) {
             tf.m = i;
          }else {
             int i2 = tf.l0(tf.n.getCurrentItem());
             int i3 = list.indexOf(p1);
             tf.m = (i2 >= 0 && i3 >= 0)? tf.m + (i2 - i3): i;
          }
          tf.q.clear();
          tf.r.clear();
          tf.H0(list);
          tf.P = true;
          tf.q();
          tf.P = false;
          b n = tf.n;
          int i1 = tf.U(list.indexOf(p1));
          Objects.requireNonNull(n);
          if (!PatchProxy.isSupport(LiveSlideViewPager.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), n, LiveSlideViewPager.class, "5")) {
             Iterator iterator = n.R1.iterator();
             while (iterator.hasNext()) {
                iterator.next().onPageSelected(i1);
             }
             iterator = n.S1.iterator();
             while (iterator.hasNext()) {
                iterator.next().onPageSelected(i1);
             }
          }
          tf.K0(tf.n.getCurrentItem());
       }
       return;
    }
    public void s(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "8")) {
          return;
       }
       uod = this.m;
       if (uod == null) {
          return;
       }
       Objects.requireNonNull(uod);
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uod, uoe, "2")) {
          uod.d = p0;
          boolean b = false;
          if (!p0) {
             uod.e.setRefreshing(b);
          }else {
             uod.e.setVisibility(b);
          }
          if (!uod.c.size()) {
             b = true;
          }
          uod.a(b);
       }
       return;
    }
}
