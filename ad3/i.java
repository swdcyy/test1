package ad3.i;
import com.yxcorp.gifshow.widget.m;
import ad3.j$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ad3.j;
import android.content.Context;
import vq5.d;
import com.kuaishou.commercial.reporter.data.CommercialRecruitLiveShowClickReportMessageData;
import oy.a;

public class i extends m	// class@00008f
{
    public final j$a c;

    public void i(j$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       i tc = this.c;
       j$a g = tc.g;
       j$a e = tc.e;
       Objects.requireNonNull(g);
       if (!PatchProxy.applyVoidTwoRefs(e, p0, g, j.class, "10")) {
          g.l.r4(e, p0.getContext());
          j y = g.y;
          y.mActionType = 2;
          g.x.x(y);
       }
       return;
    }
}
