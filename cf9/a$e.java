package cf9.a$e;
import hc9.e$a;
import cf9.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import cf9.a$e$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import ze9.e;
import kotlin.jvm.internal.a;

public final class a$e implements e$a	// class@0005de
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(int p0){
       a$e uoe = a$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PlatformMagicDebugController", "onStateChange state:"+p0, objArray);
       int i1 = 6;
       if (p0 == i1) {
          this.b.g2(i);
       }else if(p0 != 5){
          this.b.g2(true);
       }
       if (p0 == i1) {
          a$e tb = this.b;
          if (tb.r <= null) {
             return;
          }else {
             a p = tb.p;
             if (p != null) {
                p.o();
             }
             c$b uob = new c$b(this.b.e);
             uob.M(new a$e$a(this));
             a.o(uob, "builder");
             this.b.p = new e(uob);
             p = this.b.p;
             if (p != null) {
                p.Z();
             }
          }
       }
       return;
    }
}
