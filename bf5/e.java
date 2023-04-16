package bf5.e;
import im8.g;
import java.lang.Object;
import android.app.Activity;
import androidx.fragment.app.c;
import k2b.e0;
import sy6.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import hf5.e;
import hf5.b;
import hf5.g;
import hf5.f;
import c95.c;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import brd.a0;
import android.view.ViewGroup;
import bf5.d;
import com.kwai.robust.PatchProxyResult;
import bf5.o;
import java.util.Map;
import java.util.HashMap;

public abstract class e implements g	// class@00047a
{
    public PresenterV2 b;
    public Activity c;
    public Object d;
    public c e;
    public e0 f;
    public MilanoContainerEventBus g;
    public e h;
    public b i;
    public f j;
    public g k;
    public a l;

    public void e(Object p0,Activity p1,c p2,e0 p3,a p4,MilanoContainerEventBus p5,e p6,b p7,g p8,f p9){
       super();
       this.f = p3;
       this.d = p0;
       this.l = p4;
       this.c = p1;
       this.e = p2;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.k = p8;
       this.j = p9;
    }
    public abstract c a();
    public abstract View b(Context p0);
    public final void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.g();
       PresenterV2 presenterV2 = new PresenterV2();
       this.b = presenterV2;
       this.j(presenterV2);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.h();
       e tb = this.b;
       if (tb != null) {
          tb.destroy();
       }
       return;
    }
    public abstract a0 e();
    public abstract d f(ViewGroup p0);
    public void g(){
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new o());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void h(){
    }
    public abstract View i(Context p0);
    public void j(PresenterV2 p0){
    }
}
