package bc9.f;
import bc9.c0;
import bc9.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bc9.f$a;
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

public final class f extends c0	// class@0003eb
{
    public j w;
    public i x;

    public void f(k p0){
       a.p(p0, "adapter");
       super(p0);
       this.x = new f$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "2")) {
          return;
       }
       super.E8();
       this.w = objArray;
       this.S8().setPlaceHolderImage(R.drawable.arg_RES_7f080e09);
       this.P8().r1().q().c(this.x);
       this.P8().r1().r().w0(new k(30, this.W8().get()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.P8().r1().q().d(this.x);
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.P8().r1().r().w0(new k(32, this.W8().get()));
       return;
    }
}