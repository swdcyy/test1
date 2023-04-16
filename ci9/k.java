package ci9.k;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$c;
import ci9.l;
import java.lang.Object;
import eh9.k;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import ci9.a;
import java.lang.Integer;
import android.util.SparseArray;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import mm6.c;
import oc9.d0;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import eh9.n;
import k2b.e0;
import com.yxcorp.gifshow.camera.record.CameraLogger;

public class k implements CameraScrollTabViewGroupV2$c	// class@0005fb
{
    public final l a;

    public void k(l p0){
       this.a = p0;
       super();
    }
    public void a(){
       k.c(this);
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       k ta = this.a;
       d e = ta.e;
       if (e instanceof a) {
          int i = 0;
          int i1 = ta.t.get(p0.getId(), Integer.valueOf(i)).intValue();
          if (this.a.d.f() instanceof c) {
             e.H0(i1, this.a.d.f(), i, i);
          }
          k ta1 = this.a;
          CameraLogger.u(ta1.n, 1, null, null, ta1.e, "SWITCH_TAB");
       }
       return;
    }
    public void c(int p0){
       k.a(this, p0);
    }
    public void d(View p0){
       k.b(this, p0);
    }
}
