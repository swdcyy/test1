package iy1.h;
import iy1.g;
import lp3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.e;
import hy1.f;
import lp3.c;
import hy1.a;
import java.util.Objects;
import iy1.f;
import ky1.c;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import ekd.k1;
import iy1.l;
import com.kwai.robust.PatchProxyResult;
import my1.e;
import hy1.e;
import hy1.d;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;

public class h extends a implements g	// class@0029c5
{
    public f d;
    public final boolean e;

    public void h(boolean p0){
       super();
       this.e = p0;
    }
    public void Ro(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "6")) {
          return;
       }
       if (this.d != null) {
          this.Po().a(f.class).Do(1, this.d);
          h td = this.d;
          Objects.requireNonNull(td);
          if (!PatchProxy.applyVoid(objArray, td, f.class, "7")) {
             f j = td.j;
             if (j != null) {
                j.e();
             }
             Iterator iterator = td.k.values().iterator();
             while (iterator.hasNext()) {
                iterator.next().e();
             }
             td.k.clear();
             k1.n(td);
             td.e = 0;
             td.i.clear();
             td.d = true;
             td.h.clear();
             td.g.clear();
          }
       }
       return;
    }
    public void S8(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       f uof = this.So();
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoidOneRefs(p0, uof, f.class, "5")) {
          uof.k.remove(p0);
       }
       return;
    }
    public final f So(){
       Object obj = PatchProxy.apply(null, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new f(this.Po(), this.e);
          this.Po().a(f.class).dk(1, this.d);
       }
       return this.d;
    }
    public void Xb(l p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "2")) {
          return;
       }
       this.So().o(p0, p1);
       return;
    }
    public void d2(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       e uoe = new e(1, p0.a(), p0);
       c uoc = this.So().k(uoe.d.a);
       uoe.c(uoc);
       if (uoc.i(uoe.d)) {
          b.d0(LiveLogTag.LIVE_ENHANCE_MESSAGE, "addTempEnhanceMessage replace Showing message", "message", uoe, "handler", uoc);
          return;
       }else {
          this.Po().a(f.class).Y8(uoe);
          return;
       }
    }
    public c no(l p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.So().k(p0);
    }
    public void rj(l p0){
       boolean b;
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "5")) {
          return;
       }
       Object obj = PatchProxy.applyOneRefs(p0, this, oh, "8");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          oh = this.d;
          if (oh != null && oh.n() != null) {
             b.Z(LiveLogTag.LIVE_ENHANCE_MESSAGE, "can remove showing enhance msg");
             if (p0 == this.d.n()) {
                b = true;
             }
          }
          b = false;
       }
       if (b) {
          b.Z(LiveLogTag.LIVE_ENHANCE_MESSAGE, "removeTempEnhanceMessage");
          this.Po().a(f.class).ld();
       }
       return;
    }
}
