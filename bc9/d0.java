package bc9.d0;
import bc9.c0;
import bc9.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bc9.d0$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.slipmode.ui.AssistantItemFrameLayout;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.camera.record.assistant.a;
import com.yxcorp.gifshow.camera.record.assistant.a$b;
import cc9.i;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ec9.f1;
import cc9.k;
import y8c.d;
import sa6.a;

public final class d0 extends c0	// class@0003e2
{
    public i w;
    public final d0$a x;

    public void d0(k p0){
       a.p(p0, "adapter");
       super(p0);
       this.x = new d0$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d0.class, "1")) {
          return;
       }
       super.E8();
       this.R8().setTag(R.id.empty_item_tag, "empty_item_tag");
       this.R8().setWhiteCircleVisible(false);
       this.P8().r1().q().c(this.x);
       this.S8().setPlaceHolderImage(objArray);
       this.P8().r1().r().w0(new k(54, this.W8().get()));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d0.class, "2")) {
          return;
       }
       this.R8().setTag(R.id.empty_item_tag, objArray);
       this.P8().r1().q().d(this.x);
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "3")) {
          return;
       }
       this.P8().r1().r().w0(new k(56, this.W8().get()));
       return;
    }
}
