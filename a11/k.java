package a11.k;
import com.yxcorp.gifshow.widget.m;
import a11.l;
import a11.m;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.gift.data.giftbox.api.response.LiveUserRightsInfo;
import java.util.Objects;
import a11.n;

public class k extends m	// class@000024
{
    public final m c;
    public final l d;

    public void k(l p0,m p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       if (this.c.c.getValue() != null) {
          k tc = this.c;
          String str = tc.c.getValue().b();
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(str, tc, m.class, "5")) {
             tc.a.a(str);
          }
       }
       this.c.o0();
       this.d.a();
       return;
    }
}
