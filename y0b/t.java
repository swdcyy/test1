package y0b.t;
import com.yxcorp.gifshow.listcomponent.module.b;
import java.util.ArrayList;
import y0b.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import y0b.n;
import y0b.u;
import y0b.h;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import com.yxcorp.gifshow.listcomponent.event.a;
import java.util.Map;
import java.util.Objects;
import a9c.e;
import y0b.j;
import qvb.n0;
import z0b.b;
import java.util.LinkedList;
import com.yxcorp.gifshow.listcomponent.layoutmanager.a;
import java.lang.Number;
import z0b.c;
import w0b.g;
import java.lang.Comparable;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class t extends b	// class@00496a
{
    public u r;
    public final List s;
    public i t;
    public i u;
    public boolean v;
    public boolean w;
    public n x;

    public void t(){
       super();
       this.s = new ArrayList();
       this.v = false;
       this.w = false;
    }
    public final i A(int p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ot, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.s.get(p0);
    }
    public final List B(){
       return this.s;
    }
    public i C(){
       t tu = (this.w != null)? this.u: null;
       return tu;
    }
    public i D(){
       t tt = (this.v != null)? this.t: null;
       return tt;
    }
    public n E(){
       return this.x;
    }
    public u F(){
       return this.r;
    }
    public List G(){
       return null;
    }
    public final void H(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "16")) {
          return;
       }
       this.B().remove(p0);
       p0.h();
       return;
    }
    public h n(){
       return this.F();
    }
    public void s(){
       t ot = t.class;
       if (PatchProxy.applyVoid(null, this, ot, "2")) {
          return;
       }
       List list = this.G();
       if (!PatchProxy.applyVoidOneRefs(list, this, ot, "9") && !q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             this.z(this.s.size(), iterator.next());
          }
       }
       return;
    }
    public PresenterV2 w(){
       Object obj = PatchProxy.applyWithListener(null, this, t.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(t.class, "5");
       return new PresenterV2();
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, t.class, "19")) {
          return;
       }
       super.x();
       if (this.D() != null) {
          this.D().h();
       }
       if (this.C() != null) {
          this.C().h();
       }
       Iterator iterator = this.B().iterator();
       while (iterator.hasNext()) {
          iterator.next().h();
       }
       this.B().clear();
       this.F().a();
       return;
    }
    public final void z(int p0,i p1){
       Runnable obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ot, "11")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("ks_component", p1);
       hashMap.put("ks_section", this);
       boolean b = false;
       this.E().r.e().f("kscc.event.page.arch.add_module.component", hashMap, b);
       Objects.requireNonNull(p1);
       i oi = i.class;
       if (!PatchProxy.applyVoidOneRefs(this, p1, oi, "2")) {
          p1.s = this;
          if (p1.v == null) {
             p1.v = p1.L();
          }
          obj = null;
          p1.w = obj;
          j oj = PatchProxy.apply(obj, p1, oi, "7");
          if (oj != patchProxyRe) {
          }else {
             oj = new j(p1, p1.s.F());
          }
          p1.r = oj;
          p1.l = p1.v();
          p1.r.E();
          p1.g(this.E().m());
       }
       LinkedList linkedList = new LinkedList(this.E().B());
       p1.x.C(p1.F());
       this.s.add(p0, p1);
       t tx = this.x;
       Objects.requireNonNull(tx);
       obj = PatchProxy.applyOneRefs(this, tx, n.class, "20");
       if (obj != patchProxyRe) {
          tx = obj.intValue();
       }else {
          Iterator iterator = tx.M().iterator();
          while (iterator.hasNext()) {
             t ot1 = iterator.next();
             if (ot1.D() != null) {
                b = b + 1;
             }
             b = b + ot1.B().size();
             if (ot1 == this) {
                break ;
             }else if(ot1.C() != null){
                b = b + 1;
             }
          }
          boolean b1 = b;
       }
       tx--;
       linkedList.add(tx, p1.x);
       this.E().R(linkedList);
       p1.z();
       if (p1.K()) {
          this.i().n0(p1.G().n().c().intValue());
       }
       return;
    }
}
