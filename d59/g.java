package d59.g;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$b;
import d59.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.webview.jshandler.component.JsonViewFragment;
import d59.g$a;
import q59.c;
import t29.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$b$b;

public final class g implements BottomSheetContainerFragment$b	// class@00204b
{
    public final c b;
    public final String c;

    public void g(c p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public int G6(){
       return 0x7f0d0041;
    }
    public void Ib(int p0){
       if (PatchProxy.isSupport(g.class)) {
          PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, g.class, "3");
       }
       return;
    }
    public Fragment R1(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsonViewFragment(new g$a(this, this.c));
    }
    public void jb(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       BottomSheetContainerFragment$b$b.a(this, p0);
       return;
    }
}
