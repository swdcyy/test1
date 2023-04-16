package a11.j;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView$b;
import a11.l;
import a11.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import a11.n;

public class j implements LiveAudienceGiftBoxVipGradeBarView$b	// class@000023
{
    public final m a;
    public final l b;

    public void j(l p0,m p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.a.q0();
       this.a.o0();
       this.b.a();
       return;
    }
    public void b(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "2")) {
          return;
       }
       this.a.q0();
       if (1 == p0) {
          j ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, m.class, "1")) {
             ta.a.d();
          }
       }
       return;
    }
}
