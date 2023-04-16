package hf9.e;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager;
import lf9.q;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import g9c.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import if9.a;
import if9.c;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.camera.record.slipmode.ui.AssistantItemFrameLayout;
import jf9.b;
import jf9.c;
import ml8.c;

public final class e extends g	// class@002640
{
    public List w;
    public final RecyclerView x;
    public final HGalleryLayoutManager y;
    public final q z;

    public void e(RecyclerView p0,HGalleryLayoutManager p1,q p2){
       a.p(p0, "recyclerView");
       a.p(p1, "hGalleryLayoutManager");
       a.p(p2, "slipViewModel");
       super();
       this.x = p0;
       this.y = p1;
       this.z = p2;
    }
    public void W0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       super.W0(p0);
       this.w = p0;
       return;
    }
    public int f0(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.N0(p0) instanceof c;
    }
    public final RecyclerView h0(){
       return this.x;
    }
    public f h1(ViewGroup p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       AssistantItemFrameLayout uAssistantIt = a.i(p0, R.layout.arg_RES_7f0d0612);
       b uob = (p1 != 1)? new b(this): new c(this);
       return new f(uAssistantIt, uob);
    }
    public final q r1(){
       return this.z;
    }
}
