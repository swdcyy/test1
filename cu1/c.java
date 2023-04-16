package cu1.c;
import android.view.ViewGroup;
import du1.d;
import hu1.c;
import zs1.b;
import msd.p;
import st1.a;
import ht1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import cu1.c$a;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkLayoutViewType;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cu1.b;
import java.lang.Enum;

public final class c	// class@001e50
{
    public HashMap a;
    public final Observer b;
    public final ViewGroup c;
    public final d d;
    public final c e;
    public final b f;
    public final p g;
    public final a h;
    public final a i;

    public void c(ViewGroup p0,d p1,c p2,b p3,p p4,a p5,a p6){
       a.p(p0, "renderContainer");
       a.p(p1, "renderDelegate");
       a.p(p2, "renderModel");
       a.p(p3, "pkCoreModel");
       a.p(p4, "addOrRemoveFunction");
       a.p(p5, "logDelegate");
       a.p(p6, "skinManager");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       this.a = new HashMap();
       this.b = new c$a(this);
    }
    public final LiveMultiPkViewStyle a(LiveMultiPkLayoutViewType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = b.b[p0.ordinal()];
       LiveMultiPkViewStyle nORMAL = (i != 1 && (i != 2 && (i != 3 && i != 4)))? LiveMultiPkViewStyle.NORMAL: LiveMultiPkViewStyle.SIMPLE;
       return nORMAL;
    }
}
