package c24.a0$a;
import ks3.f0;
import c24.a0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;

public class a0$a implements f0	// class@00046a
{
    public final a0 a;

    public void a0$a(a0 p0){
       this.a = p0;
       super();
    }
    public String I4(){
       a0 obj = PatchProxy.apply(null, this, a0$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.P8();
       obj = this.a.r;
       if (obj != null) {
          return obj.I4();
       }
       return null;
    }
    public String J4(){
       a0 obj = PatchProxy.apply(null, this, a0$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.P8();
       obj = this.a.r;
       if (obj != null) {
          return obj.getLiveId();
       }
       return null;
    }
    public void K4(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$a.class, "1")) {
          return;
       }
       a0$a ta = this.a;
       a0 p = ta.p;
       if (p != null) {
          p.r4(p0, ta.getContext());
       }
       return;
    }
}
