package jf9.b;
import jf9.a;
import hf9.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.slipmode.ui.AssistantItemFrameLayout;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lf9.q;
import kf9.c;
import y8c.d;
import sa6.a;

public final class b extends a	// class@002a79
{

    public void b(e p0){
       a.p(p0, "adapter");
       super(p0);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       super.E8();
       a uoa = PatchProxy.apply(objArray, this, a.class, "7");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = this.s;
          if (uoa == null) {
             a.S("containerLayout");
          }
       }
       uoa.setWhiteCircleVisible(false);
       this.R8().setPlaceHolderImage(R.drawable.arg_RES_7f082105);
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.P8().r1().v0(new c(9, this.V8().get()));
       return;
    }
}
