package ou1.d;
import hc.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import hc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ImageView;

public final class d extends c	// class@003590
{
    public final KwaiImageView a;

    public void d(KwaiImageView p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "drawable");
       this.a.setVisibility(8);
       return;
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "drawable");
       this.a.setVisibility(0);
       return;
    }
}
