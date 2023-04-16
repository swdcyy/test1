package d59.q;
import android.view.View$OnClickListener;
import d59.r;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;

public final class q implements View$OnClickListener	// class@002057
{
    public final r b;

    public void q(r p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       r.S8(this.b).c(2);
       return;
    }
}
