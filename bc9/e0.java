package bc9.e0;
import bc9.c0;
import bc9.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bc9.e0$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.slipmode.ui.AssistantItemFrameLayout;
import com.yxcorp.gifshow.camera.record.assistant.a;
import com.yxcorp.gifshow.camera.record.assistant.a$b;
import cc9.i;
import lnc.s6;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ec9.f1;
import cc9.k;
import y8c.d;
import sa6.a;

public final class e0 extends c0	// class@0003e5
{
    public k w;
    public final e0$a x;

    public void e0(k p0){
       a.p(p0, "adapter");
       super(p0);
       this.x = new e0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "1")) {
          return;
       }
       super.E8();
       this.R8().setWhiteCircleVisible(false);
       this.P8().r1().q().c(this.x);
       if (s6.m()) {
          this.S8().setPlaceHolderImage(R.drawable.arg_RES_7f080e06);
       }else {
          this.S8().setPlaceHolderImage(R.drawable.arg_RES_7f080e05);
       }
       this.P8().r1().r().w0(new k(54, this.W8().get()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "2")) {
          return;
       }
       this.P8().r1().q().d(this.x);
       return;
    }
    public void X8(){
    }
}
