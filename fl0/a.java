package fl0.a;
import androidx.fragment.app.c$b;
import fl0.b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.life_plugin_common.fragment.LifeBasePluginProxyFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.Objects;

public final class a extends c$b	// class@00236e
{
    public final b a;

    public void a(b p0){
       this.a = p0;
       super();
    }
    public void a(c p0,Fragment p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       if (b.P8(this.a).Vg().c() && p1 instanceof BaseFragment) {
          p1.u();
          b.P8(this.a).Yg();
       }
       return;
    }
    public void c(c p0,Fragment p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "2")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       if (b.P8(this.a).dh() instanceof BaseFragment) {
          Fragment uFragment = b.P8(this.a).dh();
          Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.BaseFragment");
          uFragment.bh(b.P8(this.a).K0());
       }
       return;
    }
}
