package nfd.w2;
import erd.g;
import com.yxcorp.plugin.search.utils.f0;
import android.view.View;
import com.yxcorp.plugin.search.utils.f0$c;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import ged.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;

public final class w2 implements g	// class@001e1d
{
    public final f0 b;
    public final View c;
    public final View d;
    public final boolean e;
    public final f0$c f;

    public void w2(f0 p0,View p1,View p2,boolean p3,f0$c p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       w2 ow2 = this;
       w2 b = ow2.b;
       w2 c = ow2.c;
       w2 d = ow2.d;
       w2 e = ow2.e;
       w2 f = ow2.f;
       List list = p0;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       g og1 = new g();
       int[] obj = PatchProxy.applyOneRefs(c, og1, og, "2");
       int i = 0;
       int i1 = 2;
       if (obj != patchProxyRe) {
          og1 = obj;
       }else {
          obj = new int[i1];
          c.getLocationInWindow(obj);
          og1.b = new Rect(obj[i], obj[1], (obj[i] + c.getWidth()), (obj[1] + c.getHeight()));
       }
       Objects.requireNonNull(og1);
       int[] obj1 = PatchProxy.applyOneRefs(d, og1, og, "3");
       if (obj1 != patchProxyRe) {
          og1 = obj1;
       }else {
          obj1 = new int[2];
          d.getLocationInWindow(obj1);
          og1.c = new Rect(obj1[0], obj1[1], (obj1[0] + d.getWidth()), (obj1[1] + d.getHeight()));
       }
       og1.j = e;
       b.f(og1, list, f);
       return;
    }
}
