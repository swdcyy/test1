package dlc.r0$b;
import qvb.q;
import dlc.r0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.a;
import qvb.p;
import java.util.Objects;
import android.widget.FrameLayout;
import android.view.View;

public class r0$b implements q	// class@002269
{
    public final r0 b;

    public void r0$b(r0 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(r0$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, r0$b.class, "2")) {
          return;
       }
       if (p0 && this.b.r.isEmpty()) {
          this.b.P8();
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       r0$b uob = r0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       r0$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, r0.class, "7")) {
          tb.p.setVisibility(8);
          tb.q.setVisibility(8);
       }
       return;
    }
}
