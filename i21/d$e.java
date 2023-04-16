package i21.d$e;
import java.lang.Runnable;
import i21.d;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.i;
import com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter;
import i21.c;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import android.view.ViewGroup;
import pp.c;
import com.kuaishou.android.live.log.b;
import sa3.b;

public final class d$e implements Runnable	// class@002811
{
    public final d b;
    public final LayoutConfig c;

    public void d$e(d p0,LayoutConfig p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d$e.class, "1")) {
          return;
       }
       if (!this.b.c.d9().b()) {
          Integer value = this.b.c.b9().h().getValue();
          if (value == null) {
             value = Integer.valueOf(0);
          }
          a.o(value, "audienceMultiPkContainer\x20\x02tContainerTopY.value ?: 0\x00");
          int i = value.intValue();
          b.d0(LiveCommonLogTag.MULTI_PK, "onLayoutConfigUpdate", "topY", Integer.valueOf(i), "width", Integer.valueOf(LiveAudienceMultiPkPresenter.a9(this.b.c).getWidth()));
          this.b.c.c9().an(this.c, LiveAudienceMultiPkPresenter.a9(this.b.c).getWidth(), i);
       }
       return;
    }
}
