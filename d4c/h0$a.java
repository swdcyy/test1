package d4c.h0$a;
import qm9.a0;
import d4c.h0;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a46.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import d4c.e0;
import d4c.f0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qm9.z;

public class h0$a implements a0	// class@0020cf
{
    public final h0 a;

    public void h0$a(h0 p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(){
       this.a.t = false;
    }
    public void c(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0$a.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.a.X7(y6.s(d.class, LoadPolicy.DIALOG).R(new e0(this, p0), f0.b));
       return;
    }
    public b d(Music p0){
       return z.a(this, p0);
    }
}
