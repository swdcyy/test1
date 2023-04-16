package lu1.j;
import androidx.lifecycle.Observer;
import lu1.q;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.facebook.drawee.view.SimpleDraweeView;

public final class j implements Observer	// class@003042
{
    public final q b;

    public void j(q p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          KwaiImageView kwaiImageVie = this.b.j3();
          a.o(p0, "it");
          Objects.requireNonNull(this.b);
          int i = (p0.booleanValue())? 0x7f0814db: 0x7f0814dc;
          kwaiImageVie.setActualImageResource(i);
       }
       return;
    }
}
