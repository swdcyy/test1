package bc9.i;
import bc9.c0;
import bc9.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bc9.i$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.camera.record.assistant.a;
import com.yxcorp.gifshow.camera.record.assistant.a$b;
import cc9.i;
import ec9.f1;
import cc9.k;
import y8c.d;
import sa6.a;

public final class i extends c0	// class@0003f0
{
    public p w;
    public i x;

    public void i(k p0){
       a.p(p0, "adapter");
       super(p0);
       this.x = new i$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "2")) {
          return;
       }
       super.E8();
       this.w = objArray;
       this.S8().setPlaceHolderImage(R.drawable.arg_RES_7f080e09);
       this.P8().r1().q().c(this.x);
       this.P8().r1().r().w0(new k(20, this.W8().get()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       this.P8().r1().q().d(this.x);
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       this.P8().r1().r().w0(new k(24, this.W8().get()));
       return;
    }
}
