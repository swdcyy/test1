package e1b.q;
import nl8.a;
import e1b.q$a;
import com.kwai.robust.PatchProxyResult;
import f1b.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y0b.h;
import qvb.q;
import z0b.b;
import y0b.j;
import androidx.recyclerview.widget.RecyclerView;
import f1b.b;
import androidx.recyclerview.widget.RecyclerView$r;
import java.util.Objects;
import f1b.a;
import s2b.a;
import qvb.n0;
import qvb.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z2b.b;

public class q extends a	// class@0025fd
{
    public b u;
    public d v;
    public a w;
    public q x;

    public void q(){
       super();
       this.x = new q$a(this);
    }
    public void E8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       if (this.W8() != null) {
          this.W8().n(this.x);
       }
       if (this.w != null) {
          q tu = this.u;
          if (tu != null) {
             q tv = this.v;
             tv.a = tu;
             b uob = this.P8();
             j oj = this.W8();
             Object obj = PatchProxy.applyTwoRefs(uob, oj, tv, uod, "1");
             if (obj != patchProxyRe) {
                tv = obj;
             }else {
                tv.b = uob;
                tv.c = oj;
                uob.h0().addOnScrollListener(new b(tv));
             }
             tu = this.w;
             Objects.requireNonNull(tv);
             if (PatchProxy.applyOneRefs(tu, tv, uod, "2") != patchProxyRe) {
             }else {
                tv.e = new a(tu);
             }
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.v = new d();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, q.class, "4")) {
          return;
       }
       if (this.W8() != null) {
          h oh = this.W8();
          q tx = this.x;
          Objects.requireNonNull(oh);
          if (!PatchProxy.applyVoidOneRefs(tx, oh, h.class, "8") && oh.o()) {
             oh.j().f(tx);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "2")) {
          return;
       }
       this.w = this.t8("EXPOSURE_UPLOADER");
       this.u = this.t8("EXPOSURE_STRATEGY");
       return;
    }
}
