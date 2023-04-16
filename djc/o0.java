package djc.o0;
import djc.w;
import djc.o0$a;
import nsd.u;
import djc.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.widget.ImageView;
import djc.o0$b;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import djc.o0$c;
import djc.o0$d;
import erd.g;
import crd.b;
import java.lang.Boolean;

public final class o0 implements w	// class@002212
{
    public final m0 b;
    public static final o0$a c;

    static {
       o0.c = new o0$a(null);
    }
    public void o0(m0 p0){
       a.p(p0, "forwardJsCustomBannerBanner");
       super();
       this.b = p0;
    }
    public View da(){
       Object obj = PatchProxy.apply(null, this, o0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0.class, "1")) {
          return;
       }
       if (p0 != null) {
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          View view = p0.findViewById(R.id.forward_banner);
          if (!view instanceof ImageView) {
             view = null;
          }
          if (view != null) {
             objectRef.element = view;
             t.create(new o0$b(p0, this)).subscribeOn(d.c).observeOn(d.a).subscribe(new o0$c(objectRef, this), o0$d.b);
          }
       }
       return;
    }
    public boolean p9(){
       Object obj = PatchProxy.apply(null, this, o0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public int y0(){
       return 0x7f0d048a;
    }
}
