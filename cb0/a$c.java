package cb0.a$c;
import androidx.lifecycle.Observer;
import cb0.a;
import java.lang.Object;
import com.kuaishou.gifshow.smartalbum.model.SmartAlbumUiItem;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fb0.e;
import lnc.a1;
import java.io.File;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.Objects;
import ra0.b;
import q87.c;
import com.kuaishou.gifshow.smartalbum.utils.TextBubbleImageView;
import htc.c;
import android.view.View;

public final class a$c implements Observer	// class@0002fa
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          a c = this.b.c;
          a.o(p0, "it");
          String imagePath = p0.getImagePath();
          if (!PatchProxy.applyVoidTwoRefs(c, imagePath, null, e.class, "16")) {
             c.v(new File(imagePath), (a1.h() / 3), (a1.g() / 3));
          }
          a$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, a.class, "4")) {
             Object[] objArray = new Object[0];
             b.D().s("SmartAlbumLoadingVB", "createCoverBitmapAndShow:ÎÄ×ÖÌõ:", objArray);
             tb.g.a((a1.h() - (a1.e(36.00f) * 2)), (a1.g() - a1.e(300.00f)));
             tb.g.setDrawer(p0.getSmartAlbumV2Drawer());
             tb.g.invalidate();
          }
       }
       return;
    }
}
