package i02.g;
import n91.b;
import lp3.a;
import g81.c;
import com.kwai.feature.api.live.service.show.comments.view.LayoutParamsType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.comments.view.a;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import gt5.a;

public class g extends a implements b	// class@0027ef
{
    public c d;

    public void g(c p0){
       super();
       this.d = p0;
    }
    public void K0(LayoutParamsType p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g.class, "1")) {
          return;
       }
       this.d.K0(p0, p1, p2);
       return;
    }
    public ViewGroup a2(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.a2();
    }
}
