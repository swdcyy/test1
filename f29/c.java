package f29.c;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import hs7.d;
import rp7.a;
import jh5.a;
import f29.c$a;
import f29.c$b;
import qp7.a;
import w19.d;
import rq7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ks7.h0;
import java.lang.Boolean;
import qp7.x0;
import qp7.b;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.q;
import qvb.j;
import ks7.g0;
import f29.b;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.comment.e$b;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.d;
import brd.t;
import f29.a;
import qp7.d;
import ks7.a;
import qp7.c;

public class c extends DispatchBaseElement	// class@00228f
{
    public QPhoto t;
    public a u;
    public e v;
    public a w;
    public final e$b x;
    public final q y;

    public void c(){
       super(d.g, null);
       this.x = new c$a(this);
       this.y = new c$b(this);
    }
    public void c(a p0){
       super(d.g, p0);
       this.x = new c$a(this);
       this.y = new c$b(this);
    }
    public void P(a p0){
       this.t = p0.j;
       this.u = p0.k;
       this.v = p0.l;
       this.w = p0.h;
    }
    public a f0(a p0){
       h0 oh0 = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (oh0 != PatchProxyResult.class) {
       }else {
          oh0 = new h0(p0);
       }
       return oh0;
    }
    public void j0(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.E().h(this.t.numberOfComments(), this.n0());
       this.u.h(this.y);
       g e = Functions.e;
       this.j(this.i.a(new b(this), e));
       this.v.b(this.x);
       this.j(RxBus.f.f(d.class).subscribe(new a(this), e));
       return;
    }
    public void m0(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       this.u.f(this.y);
       this.v.j(this.x);
       return;
    }
    public boolean n0(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.t.isAllowComment();
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, c.class, "7");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public c r(){
       g0 og0 = PatchProxy.apply(null, this, c.class, "6");
       if (og0 != PatchProxyResult.class) {
       }else {
          og0 = new g0();
       }
       return og0;
    }
}
