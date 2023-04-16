package bc9.h;
import bc9.c0;
import bc9.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bc9.h$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.assistant.a;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import lnc.s6;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.camera.record.assistant.a$b;
import cc9.i;
import ec9.f1;
import cc9.k;
import y8c.d;
import sa6.a;

public final class h extends c0	// class@0003ee
{
    public n w;
    public i x;

    public void h(k p0){
       a.p(p0, "adapter");
       super(p0);
       this.x = new h$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "2")) {
          return;
       }
       super.E8();
       this.w = objArray;
       if (this.P8().r1().B()) {
          IdentifyCircleImageView identifyCirc = this.S8();
          int i = (s6.m())? 0x7f080e0d: 0x7f080e0c;
          identifyCirc.setPlaceHolderImage(i);
       }else {
          this.S8().setPlaceHolderImage(R.drawable.arg_RES_7f080e09);
       }
       this.P8().r1().q().c(this.x);
       this.P8().r1().r().w0(new k(10, this.W8().get()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       this.P8().r1().q().d(this.x);
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.P8().r1().r().w0(new k(14, this.W8().get()));
       return;
    }
}
