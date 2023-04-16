package dta.k0$a;
import fr6.i;
import dta.k0;
import java.lang.Object;
import wq6.h;
import fr6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import i0c.b;
import i0c.d;
import com.kwai.kcube.TabIdentifier;
import i0c.h;

public class k0$a implements i	// class@002539
{
    public final k0 a;

    public void k0$a(k0 p0){
       this.a = p0;
       super();
    }
    public void a(h p0,int p1){
       h.a(this, p0, p1);
    }
    public void b(h p0,h p1,int p2,int p3,float p4){
       k0$a uoa = k0$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       k0$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(k0.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p4), ta, k0.class, "3")) {
          p3 = a.t().a("homeScrollThreshold", 20);
          if (p3) {
             int i = (int)(p4 * 100.00f);
             if (ta.r != null) {
                if (i > 50 && i < (p3 - 100)) {
                   ta.r = false;
                   d.a().c(p0.M2());
                }else if(i <= 50 && i > p3){
                   ta.r = false;
                   d.a().c(p1.M2());
                }
             }
             if (i < p3 || i > (p3 - 100)) {
                ta.r = true;
             }
          }
       }
       return;
    }
    public void c(h p0,int p1){
       h.c(this, p0, p1);
    }
}
