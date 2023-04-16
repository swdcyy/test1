package b8a.u$b;
import d6a.a;
import b8a.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import b8a.w;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import android.graphics.Bitmap;
import java.lang.Boolean;
import b8a.u$b$a;
import androidx.lifecycle.Observer;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class u$b extends a	// class@0003fb
{
    public final u b;

    public void u$b(u p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, u$b.class, "2")) {
          return;
       }
       if (this.b.W8().isAdded()) {
          u.P8(this.b).q0().removeObservers(this.b.W8().getViewLifecycleOwner());
       }
       u.S8(this.b, null, null, 2, null);
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, u$b.class, "1")) {
          return;
       }
       u.P8(this.b).q0().observe(this.b.W8().getViewLifecycleOwner(), new u$b$a(this));
       u.S8(this.b, objArray, objArray, 2, objArray);
       u$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, u.class, "18")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PANORAMIC_ENTRANCE_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          u r = tb.r;
          if (r == null) {
             a.S("mPhoto");
          }
          uContentPack.photoPackage = w1.f(r.mEntity);
          u s = tb.s;
          if (s == null) {
             a.S("mFragment");
          }
          u1.D0("", s, 0, uElementPack, uContentPack, null);
       }
       return;
    }
}
