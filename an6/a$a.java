package an6.a$a;
import io.reactivex.g;
import an6.a;
import android.app.Activity;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.p3;
import q87.c;
import com.kuaishou.ax2c.PreloadParam$Builder;
import android.content.Context;
import an6.a$a$a;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import com.kuaishou.ax2c.PreLoader;
import com.kuaishou.ax2c.PreloadParam;

public final class a$a implements g	// class@0000e1
{
    public final a b;
    public final Activity c;

    public void a$a(a p0,Activity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Object[] objArray = new Object[0];
       p3.D().w("home_entrance_bubble", "asyncInflateBubbleView", objArray);
       PreloadParam$Builder uBuilder = new PreloadParam$Builder(this.c);
       uBuilder.setUseMutableContext(true);
       uBuilder.setUseAx2c(0);
       uBuilder.setMaxCount(true);
       uBuilder.addLayoutId(this.b.k());
       uBuilder.setInflateListener(new a$a$a(p0));
       PreLoader.getInstance().preload(uBuilder.build());
       return;
    }
}
