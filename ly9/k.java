package ly9.k;
import ly9.m;
import com.yxcorp.gifshow.detail.common.information.marquee.model.c;
import gr7.j;
import ly9.g;
import java.lang.Object;
import ly9.k$a;
import ly9.i;
import ly9.h;
import ly9.j;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import ekd.j;
import java.lang.Runnable;
import ly9.k$b;
import java.util.Objects;
import pp7.b;

public class k	// class@002ec0
{
    public k$b a;
    public final Handler b;
    public m c;
    public final c d;
    public final j e;
    public QPhoto f;
    public final BaseFragment g;
    public final a h;
    public final MarqueeConfig i;
    public t j;
    public final y0 k;
    public final g l;
    public final b$b m;
    public final g n;

    public void k(m p0,c p1,j p2,g p3){
       super();
       this.k = new k$a(this);
       this.l = new i(this);
       this.m = new h(this);
       this.n = new j(this);
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3.b;
       this.g = p3.c;
       this.h = p3.d;
       this.i = p3.a;
       this.b = new Handler(Looper.getMainLooper());
       this.j = p3.g;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, k.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.f.isSinglePhoto() && j.h(b.b(this.f)))? true: false;
       return b;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, k.class, "8")) {
          return;
       }
       this.c.b(false);
       k ta = this.a;
       if (ta != null) {
          this.b.removeCallbacks(ta);
       }
       return;
    }
    public void c(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "7")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, ok, "10");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          ok = this.c;
          k ok1 = (ok.g > null)? 1: null;
          if (!ok1 && (ok.d != null && (ok.b != null && (ok.a != null && (ok.h != null || this.a()))))) {
             b = this.c.a() ^ 0x01;
          }
       }
    label_004d :
       if (!b) {
          return;
       }else if(this.a == null){
          this.a = new k$b(this);
       }
       this.b.postDelayed(this.a, 100);
       this.c.b(true);
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "5")) {
          return;
       }
       this.b();
       k te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoid(objArray, te, j.class, "5")) {
          te.g.f(Boolean.TRUE);
       }
       return;
    }
}
