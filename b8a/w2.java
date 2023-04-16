package b8a.w2;
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
import android.view.View;
import mv5.b;
import androidx.fragment.app.Fragment;
import w85.a;
import rf5.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class w2 extends k	// class@000412
{
    public u S;

    public void w2(){
       super();
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, w2.class, "4");
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
       Object obj = PatchProxy.apply(null, this, w2.class, "2");
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
       Object obj = PatchProxy.apply(null, this, w2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return t3.b(this.F);
    }
    public boolean W8(){
       k obj = PatchProxy.apply(null, this, w2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       if (obj != null && !obj.getVisibility()) {
          return true;
       }
       if (d.a(0x3ee97dc2).Bx(this.F) && this.x.c()) {
          return true;
       }
       return false;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w2.class, "1")) {
          return;
       }
       super.j8();
       this.S = this.q8(u.class);
       return;
    }
}
