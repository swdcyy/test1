package d59.z;
import android.view.View$OnClickListener;
import d59.y;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;

public final class z implements View$OnClickListener	// class@00206a
{
    public final y b;

    public void z(y p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
          return;
       }
       y s = this.b.s;
       if (s == null) {
          a.S("mHalfContainerView");
       }
       s.c(1);
       return;
    }
}
