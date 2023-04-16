package b8a.x2;
import rf5.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import gx5.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import oe6.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import uw9.t3;
import w85.a;

public final class x2 extends k	// class@000417
{

    public void x2(){
       super();
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, x2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       k tK = this.K;
       a.o(tK, "mActivity");
       k tw = this.w;
       a.o(tw, "mPhoto");
       return d.a(-1188553266).VA(tK.U2(), tw.getUserId());
    }
    public boolean S8(){
       Object obj = PatchProxy.apply(null, this, x2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = super.S8();
       if (b) {
          a.d0(false);
       }
       return b;
    }
    public boolean V8(){
       Object obj = PatchProxy.apply(null, this, x2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return t3.b(this.F);
    }
    public boolean W8(){
       Object obj = PatchProxy.apply(null, this, x2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.x.c();
    }
}
