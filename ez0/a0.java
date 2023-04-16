package ez0.a0;
import xq5.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.os.Handler;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class a0 implements c	// class@002237
{
    public final k b;

    public void a0(k p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       a0 tb = this.b;
       tb.O.removeCallbacks(tb.P);
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       b.b(this);
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
