package kg9.b;
import erd.g;
import kg9.f;
import java.lang.Object;
import ig9.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import hg9.u;
import com.yxcorp.gifshow.camera.record.base.b;
import j8c.a;
import q87.c;
import com.kuaishou.ax2c.PreloadParam$Builder;
import android.content.Context;
import com.kuaishou.ax2c.PreLoader;
import com.kuaishou.ax2c.PreloadParam;

public final class b implements g	// class@002c85
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, f.class, "6")) {
       }else if(tb.d.d(u.b).a != null){
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("TakePicturePreload", "preloadViews", objArray);
          p0 = new PreloadParam$Builder(tb.e);
          f p = tb.p;
          int len = p.length;
          for (; i < len; i = i + 1) {
             p0.addLayoutId(p[i]);
          }
          PreLoader.getInstance().preload(p0.build());
       }
       return;
    }
}
