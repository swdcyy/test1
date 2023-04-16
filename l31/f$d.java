package l31.f$d;
import xq5.c;
import l31.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import cy1.q;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.watchingcount.updater.a;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class f$d implements c	// class@002e74
{
    public final f b;

    public void f$d(f p0){
       this.b = p0;
       super();
    }
    public void P(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$d.class, "2")) {
          return;
       }
       f$d tb = this.b;
       tb.e1 = false;
       tb.B9();
       this.b.V.b();
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, f.class, "22")) {
          tb.B.clear();
          tb.x.setText("");
          tb.a9().reset();
       }
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, f$d.class, "1")) {
          return;
       }
       f$d tb = this.b;
       tb.e1 = true;
       tb.u9();
       this.b.x9(true, "onPageShow");
       this.b.y9();
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
