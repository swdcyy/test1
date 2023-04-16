package fva.u;
import ub.a;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ImageView;

public final class u extends a	// class@002a2e
{
    public final ViewGroup$LayoutParams b;
    public final KwaiImageView c;

    public void u(ViewGroup$LayoutParams p0,KwaiImageView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, u.class, "1")) {
       }else {
          a.p(p0, "id");
          if (p1 != null && (p1.getWidth() > 0 && p1.getHeight() > 0)) {
             u tb = this.b;
             tb.width = (tb.height * p1.getWidth()) / p1.getHeight();
             this.c.setLayoutParams(this.b);
          }
       }
       return;
    }
}
