package y8c.r;
import nl8.p;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.app.Activity;
import e3a.a;
import y8c.f$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Number;

public class r extends p	// class@004a07
{

    public void r(){
       super();
    }
    public GifshowActivity C(){
       Object obj = PatchProxy.apply(null, this, r.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b(this.s());
    }
    public f$b D(){
       Object obj = PatchProxy.apply(null, this, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r();
    }
    public BaseFragment E(){
       Object obj = PatchProxy.apply(null, this, r.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D().a();
    }
    public int F(){
       Object obj = PatchProxy.apply(null, this, r.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.D().b();
    }
    public Activity getActivity(){
       return this.C();
    }
}
