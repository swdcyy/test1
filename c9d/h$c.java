package c9d.h$c;
import com.yxcorp.gifshow.widget.m;
import c9d.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c9d.i;
import android.widget.PopupWindow;
import com.yxcorp.plugin.search.entity.RecommendResponse$CnyPopup;
import k2b.e0;
import nfd.m1;

public class h$c extends m	// class@000508
{
    public final h c;

    public void h$c(h p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c.class, "1")) {
          return;
       }
       i k = this.c.c.K;
       if (k != null && k.isShowing()) {
          this.c.c.K.dismiss();
          h$c tc = this.c;
          h c = tc.c;
          m1.f(1, c.T, "HOME_ACTIVITY_CLOSE_POPUP", c.M, tc.b.mPopTaskId);
       }
       return;
    }
}
