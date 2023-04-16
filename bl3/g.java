package bl3.g;
import d61.k0$a;
import java.lang.Object;
import cl3.f;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import pp.c;
import pp.d;
import java.util.Iterator;
import java.util.Set;
import cl3.l;
import android.view.View$OnLayoutChangeListener;
import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup;

public final class g implements k0$a	// class@0003eb
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final Object get(Object p0){
       Objects.requireNonNull(p0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, p0, uof, "3");
       if (objArray1 != patchProxyRe) {
       }else {
          Object obj = PatchProxy.apply(objArray, p0, uof, "9");
          if (obj != patchProxyRe) {
             objArray = obj;
          }else if(p0.t == null){
             p0.k.c(LivePreviewLogTag.LIVE_PREVIEW_PLAYER, "detach player view failed, has no playerView");
          }else {
             Iterator iterator = p0.x.iterator();
             while (iterator.hasNext()) {
                iterator.next().h();
             }
             f t = p0.t;
             if (p0.v != null) {
                t.removeOnLayoutChangeListener(p0.y);
             }
             p0.e.removeView(p0.t);
             p0.t = objArray;
             p0 = p0.x.iterator();
             while (p0.hasNext()) {
                p0.next().m();
             }
             objArray = t;
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
}
