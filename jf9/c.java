package jf9.c;
import jf9.a;
import hf9.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import jf9.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lf9.q;
import kf9.g;
import kf9.b;
import kf9.c;
import y8c.d;
import sa6.a;
import java.util.Objects;
import java.util.ArrayList;

public final class c extends a	// class@002a7b
{
    public e u;
    public b v;

    public void c(e p0){
       a.p(p0, "adapter");
       super(p0);
       this.v = new c$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "2")) {
          return;
       }
       super.E8();
       this.u = objArray;
       this.R8().setPlaceHolderImage(R.drawable.arg_RES_7f080e09);
       this.P8().r1().u0().a(this.v);
       this.P8().r1().v0(new c(5, this.V8().get()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       g og = this.P8().r1().u0();
       c tv = this.v;
       Objects.requireNonNull(og);
       if (!PatchProxy.applyVoidOneRefs(tv, og, g.class, "3")) {
          a.p(tv, "listener");
          og.a.remove(tv);
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.P8().r1().v0(new c(8, this.V8().get()));
       return;
    }
}
