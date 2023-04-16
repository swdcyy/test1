package f3a.l$e;
import qvb.q;
import f3a.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import qvb.p;
import f3a.h;
import qvb.a;

public final class l$e implements q	// class@00228d
{
    public final l b;

    public void l$e(l p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(l$e.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, l$e.class, "2")) {
          return;
       }
       a.p(p1, "error");
       l.P8(this.b).setEnabled(false);
       l t = this.b.t;
       if (t != null) {
          t.setEnabled(false);
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(l$e.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, l$e.class, "1")) {
          return;
       }
       l.P8(this.b).setEnabled((l.S8(this.b).isEmpty() ^ 0x01));
       l$e tb = this.b;
       l t = tb.t;
       if (t != null) {
          t.setEnabled((l.S8(tb).isEmpty() ^ 0x01));
       }
       return;
    }
}
