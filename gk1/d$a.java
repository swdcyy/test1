package gk1.d$a;
import yj1.b;
import gk1.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import yj1.c;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView;
import android.widget.RelativeLayout;

public class d$a implements b	// class@00250d
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.a.d3(2);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "4")) {
          return;
       }
       this.a.d3(1);
       return;
    }
    public void c(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.a.d3(2);
       d$a ta = this.a;
       ta.l.d(ta.p, ta.j);
       return;
    }
    public void d(boolean p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       uoa = this.a;
       uoa.l.c(uoa.p, uoa.j);
       if (!p0) {
          this.a.d3(0);
          d$a ta = this.a;
          ta.p = null;
          ta.s = 0;
          ta.q = null;
          ta.o.f();
          this.a.o.setVisibility(8);
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       this.a.d3(1);
       d$a ta = this.a;
       ta.l.h(ta.p, ta.j);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "5")) {
          return;
       }
       this.a.d3(1);
       d$a ta = this.a;
       ta.l.b(ta.p, ta.j);
       return;
    }
}
