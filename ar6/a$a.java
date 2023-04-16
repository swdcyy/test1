package ar6.a$a;
import fr6.i;
import ar6.a;
import java.lang.Object;
import wq6.h;
import fr6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.kcube.communication.upward.RefreshTrigger;
import com.kwai.kcube.internal.tab.TabNode;

public final class a$a implements i	// class@000399
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(h p0,int p1){
       h.a(this, p0, p1);
    }
    public void b(h p0,h p1,int p2,int p3,float p4){
       if (PatchProxy.isSupport(a$a.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
             return;
          }
       }
       a.p(p0, "interactiveLeftTab");
       a.p(p1, "interactiveRightTab");
       a$a ta = this.a;
       ta.c = p4;
       RefreshTrigger sCROLL_PROGR = RefreshTrigger.SCROLL_PROGRESS_CHANGE;
       ta.n(sCROLL_PROGR);
       a uoa = this.a.j();
       if (uoa != null) {
          uoa.l(this.a.g, sCROLL_PROGR);
       }
       return;
    }
    public void c(h p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       a.p(p0, "tab");
       a$a ta = this.a;
       ta.a = p1;
       RefreshTrigger sELECT_TAB_C = RefreshTrigger.SELECT_TAB_CHANGE;
       ta.n(sELECT_TAB_C);
       a uoa1 = this.a.j();
       if (uoa1 != null) {
          uoa1.l(this.a.g, sELECT_TAB_C);
       }
       return;
    }
}
