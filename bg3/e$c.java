package bg3.e$c;
import cq5.b;
import bg3.e;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import cq5.a$a;
import wq5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kp3.e;
import java.util.Objects;
import f12.d;
import android.widget.TextView;
import qvb.n0;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import yf3.a;
import java.util.List;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import zf3.a;
import kp.r1;
import com.yxcorp.gifshow.log.c0;
import java.lang.Integer;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import hb2.g$b;
import java.lang.Boolean;

public class e$c implements b	// class@0003a2
{
    public final e a;

    public void e$c(e p0){
       this.a = p0;
       super();
    }
    public RecyclerView a(){
       return this.a.B;
    }
    public void b(a$a p0){
       this.a.F = p0;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "6")) {
          return;
       }
       this.a.s.y(p0);
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$c.class, "1")) {
          return;
       }
       e$c ta = this.a;
       Objects.requireNonNull(ta);
       e uoe = e.class;
       if (!PatchProxy.applyVoid(objArray, ta, uoe, "16")) {
          ta.s.v();
          e l = ta.L;
          if (l != null) {
             l.d(false, 14);
          }
          ta.E.setVisibility(8);
          ta.q.a();
          if (!PatchProxy.applyVoid(objArray, ta, uoe, "15")) {
             e b = ta.B;
             if (b != null && b.getLayoutManager() != null) {
                int i = ta.B.getLayoutManager().i0();
                int i1 = ta.B.getLayoutManager().c();
                while (i <= i1) {
                   if (ta.B.getAdapter() != null && ta.B.getAdapter().Q0().size() >= i1) {
                      QPhoto qPhoto = ta.B.getAdapter().N0(i);
                      if (qPhoto != null && !qPhoto.isShowed()) {
                         qPhoto.setShowed(true);
                         ClientContent$LiveStreamPackage liveStreamPa = x.e(qPhoto.getEntity(), 2);
                         int i2 = ta.I.s1(qPhoto) + true;
                         liveStreamPa.showIndexPlusOne = (long)i2;
                         a.b(qPhoto.mEntity, liveStreamPa, 7);
                         r1.g5(qPhoto.mEntity, i);
                         c0.q().k(qPhoto.mEntity);
                      }
                   }
                   i = i + 1;
                }
             }
          }
       }
    label_00c4 :
       return;
    }
    public void e(int p0){
       e$c uoc = e$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "7")) {
          return;
       }
       e i = this.a.I;
       if (i != null) {
          QPhoto qPhoto = i.N0(p0);
          if (qPhoto != null) {
             this.a.R8(qPhoto);
          }
       }
       return;
    }
    public void f(a p0){
       String str = "5";
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, str)) {
          return;
       }
       if (this.a.W8()) {
          e s = this.a.s;
          Objects.requireNonNull(s);
          if (!PatchProxy.applyVoid(null, s, e.class, str)) {
             s.t.clear();
          }
       }
       this.a.s.k(p0);
       return;
    }
    public View g(){
       a0 obj = PatchProxy.apply(null, this, e$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.p.l1;
       if (obj != null) {
          return obj.i();
       }
       return null;
    }
    public boolean h(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       e$c obj = PatchProxy.apply(objArray, this, e$c.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, e.class, "18");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.s.s();
       return b;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "2")) {
          return;
       }
       this.a.P8();
       return;
    }
    public void j(){
       this.a.F = null;
    }
}
